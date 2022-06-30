package bit.minisys.minicc.ncgen;

import java.io.*;
import java.util.*;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.icgen.ExampleICBuilder;
import bit.minisys.minicc.icgen.internal.MiniCCICGen;
import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.ncgen.IMiniCCCodeGen;
import bit.minisys.minicc.parser.ast.ASTInitList;


public class ExampleCodeGen implements IMiniCCCodeGen{


	public static StringBuilder stringBuilder;
	public static String jumpOP;
	private List<MyQuat> quats;
	public int index_quat;
	public int printf;
	public static boolean array;
	public static String arrayName;
	public static Stack<String> ParamStack;
	public static Queue<String> print_scanf;
	public static LinkedList<String> args;
	private static String funcname;
	private static boolean GetIntFunc;
	public static ExampleICBuilder Builder;

	public ExampleCodeGen() {
		stringBuilder = new StringBuilder();
		index_quat = 0;
		printf = 0;
		array = false;
		funcname = "null";
		GetIntFunc=false;
		ParamStack=new Stack<String>();
		print_scanf=new LinkedList<>();
		args = new LinkedList<String>();
	}

	@Override
	public String run(String iFile, MiniCCCfg cfg) throws Exception {
		String oFile = MiniCCUtil.remove2Ext(iFile) + MiniCCCfg.MINICC_CODEGEN_OUTPUT_EXT;
		if(!cfg.target.equals("x86")) {
			return oFile;
		}
		LoadIC(iFile);
		GenCode();
		System.out.println("7. Target code generation finished!");
		try {
			FileWriter fileWriter = new FileWriter(new File(oFile));
			fileWriter.write(stringBuilder.toString());
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return oFile;
	}
	public MyQuat NextQuat() {
		if(index_quat<quats.size()) {
			MyQuat q = quats.get(index_quat);
			index_quat++;
			return q;
		}else{
			return null;
		}
	}
	public void LoadIC(String tFile) {
		quats = new LinkedList<MyQuat>();
		ArrayList<String> qStr = MiniCCUtil.readFile(tFile);
		for(String str: qStr) {
			String res,op,opnd1,opnd2;
			String[] segs = str.split(",");
			op = segs[0].substring(1,segs[0].length());
			res = segs[3].substring(0,segs[3].length()-1);
			opnd1 = segs[1];
			opnd2 = segs[2];
			MyQuat q = new MyQuat(op,res,opnd1,opnd2);
			quats.add(q);
		}
	}
	private void GenCode() {
		stringBuilder.append(".386\n");
		stringBuilder.append(".model flat, stdcall\n");
		stringBuilder.append("option casemap : none\n");
		stringBuilder.append("includelib msvcrt.lib\n");
		stringBuilder.append("includelib ucrt.lib\n");
		stringBuilder.append("includelib legacy_stdio_definitions.lib\n");
		stringBuilder.append("printf proto c:dword,:vararg\n");
		stringBuilder.append("scanf proto c:dword,:vararg\n");
		stringBuilder.append(".data\n");
		stringBuilder.append("Mars_PrintInt byte \"%d\",0\n");
		stringBuilder.append("Mars_GetInt byte \"%d\",0\n");
		MyQuat q = NextQuat();
		while(q != null){
			if(q .getOp().equals("arg")){
				String param = q.getRes();
				ParamStack.push(param);
			}
			if(q.getOp().equals("call")){
				if(q.getOpnd1().equals("Mars_PrintStr")){
					while(ParamStack.size()!=0){
						print_scanf.add(ParamStack.pop());
					}
				}
				else if(q.getOpnd1().equals("Mars_PrintInt")){
					while(ParamStack.size()!=0){
						ParamStack.pop();
					}
				}
				else if(q.getOpnd1().equals("Mars_GetInt")){
					while(ParamStack.size()!=0){
						ParamStack.pop();
					}
				}
				else{
					while(ParamStack.size()!=0){
						ParamStack.pop();
					}
				}
			}
			q = NextQuat();
		}
		for(int i=0;i<print_scanf.size();i++){
			String str=print_scanf.poll();
			print_scanf.add(str);
			str = str.replace("\\n"," ");
			stringBuilder.append("Mars_PrintStr"+i+" byte "+str+",0ah,0\n");
		}
		index_quat = 0;
		stringBuilder.append(".code\n");
		q = NextQuat();
		while(q != null) {
			if(q.getOp().equals("Func_Beg")) {
				GenCodeFunc(q);
			}
			q = NextQuat();
		}
	}

	private void GenCodeFunc(MyQuat qfunc) {
		int tempIndex = index_quat;
		LinkedList<MyQuat> funcqs = new LinkedList<MyQuat>();
		funcname = qfunc.getRes();
		if(funcname.equals("main")){				//函数声明
			stringBuilder.append(funcname+" proc");
		}else {
			stringBuilder.append(funcname + " proc far C");
		}
		MyQuat q = NextQuat();
		while(q.getOp().equals("param")){	//声明参数
			stringBuilder.append(" "+q.getRes()+":dword");
			q = NextQuat();
		}
		stringBuilder.append("\n");
		while(!q.getOp().equals("Func_End")){
			if(q.getOp().equals("var")|| 
					q.getOp().equals("arr")||
					q.getOp().equals("arg")
			) {	//声明局部变量
				funcqs.add(q);
			}
			q = NextQuat();
		}
		for(MyQuat mq : funcqs){
			if(mq.getOp().equals("var")){
				stringBuilder.append("local "+mq.getRes()+":dword\n");
			} else if (mq.getOp().equals("arr")) {
				String limit = mq.getOpnd1();
				String limit1 = limit.replace("int<","");
				limit1 = limit1.replace(">","");
				String limit2 = limit1;
				while(limit2.charAt(0)=='0'||
						limit2.charAt(0)=='1'||
						limit2.charAt(0)=='2'||
						limit2.charAt(0)=='3'||
						limit2.charAt(0)=='4'||
						limit2.charAt(0)=='5'||
						limit2.charAt(0)=='6'||
						limit2.charAt(0)=='7'||
						limit2.charAt(0)=='8'||
						limit2.charAt(0)=='9')
				limit2 = limit1.substring(1,limit1.length());
				limit2 = limit2.substring(1,limit2.length());
				if(limit2.equals(""))
				stringBuilder.append("local "+mq.getRes()+"["+limit1+"]:dword\n");
				else {
					limit2 = limit2.replace("<","");
					limit2 = limit2.replace(">","");
					stringBuilder.append("local "+mq.getRes()+"[8+4*"+limit2+"]:dword\n");
				}
			}
		}
		funcqs.clear();
		index_quat = tempIndex;
		q = NextQuat();

		while(q.getOp().equals("Func_End") == false) {
			GenCodeOp(q);
			q = NextQuat();
		}
		stringBuilder.append("ret\n"+q.getRes()+" endp\n");
		if(q.getRes().equals("main")){
			stringBuilder.append("end main\n");
		}
	}
	private void GenCodeOp(MyQuat q) {
		String op = q.getOp();
		if(op.equals("label")) {
			String label = q.getRes().substring(1,q.getRes().length());
			stringBuilder.append("@"+label+":\n");
		}else if(op.equals("j")) {
			stringBuilder.append("jmp "+q.getRes()+"\n");
		}else if(op.equals("jf")) {
			if(jumpOP.equals("<")){
				stringBuilder.append("jnb "+q.getRes()+"\n");
			}else if(jumpOP.equals("<=")){
				stringBuilder.append("jnbe "+q.getRes()+"\n");
			}else if(jumpOP.equals("==")){
				stringBuilder.append("jnz "+q.getRes()+"\n");
			}
		} else if (op.equals("+")) {
			String sym1=q.getOpnd1(),sym2=q.getOpnd2(),symtar=q.getRes();
			stringBuilder.append("mov eax, "+sym1+"\n");
			stringBuilder.append("mov ebx, "+sym2+"\n");
			stringBuilder.append("add eax, ebx\n");
			stringBuilder.append("mov "+symtar+", eax\n");
		} else if (op.equals("-")) {
			String sym1=q.getOpnd1(),sym2=q.getOpnd2(),symtar=q.getRes();
			stringBuilder.append("mov eax, "+sym1+"\n");
			stringBuilder.append("mov ebx, "+sym2+"\n");
			stringBuilder.append("sub eax, ebx\n");
			stringBuilder.append("mov "+symtar+", eax\n");
		} else if (op.equals("*")) {
			String sym1=q.getOpnd1(),sym2=q.getOpnd2(),symtar=q.getRes();
			stringBuilder.append("mov eax, "+sym1+"\n");
			stringBuilder.append("mov ebx, "+sym2+"\n");
			stringBuilder.append("imul eax, ebx\n");
			stringBuilder.append("mov "+symtar+", eax\n");
		} else if (op.equals("%")) {
			String sym1=q.getOpnd1(),sym2=q.getOpnd2(),symtar=q.getRes();
			stringBuilder.append("xor edx, edx\n");
			stringBuilder.append("mov eax, "+sym1+"\n");
			stringBuilder.append("mov ebx, "+sym2+"\n");
			stringBuilder.append("div ebx\n");
			stringBuilder.append("mov "+symtar+", edx\n");
		} else if (op.equals("/")) {
			String sym1=q.getOpnd1(),sym2=q.getOpnd2(),symtar=q.getRes();
			stringBuilder.append("xor edx, edx\n");
			stringBuilder.append("mov eax, "+sym1+"\n");
			stringBuilder.append("mov ebx, "+sym2+"\n");
			stringBuilder.append("div ebx\n");
			stringBuilder.append("mov "+symtar+", eax\n");
		} else if (op.equals("ret")) {
			if(!q.getRes().equals("")){
				stringBuilder.append("mov eax, "+(q.getRes())+"\n");
			}else {

			}
		} else if (op.equals("arg")||op.equals("call")) {
			if(op.equals("arg")) {
				while(q.getOp().equals("arg")) {
					args.add(q.getRes());
					q = NextQuat();
				}
				index_quat--;
			} else if (op.equals("call")) {
				String name = q.getOpnd1();
				if(name.equals("Mars_PrintStr")){
					stringBuilder.append("invoke printf, addr Mars_PrintStr"+printf+"\n");
					printf++;
				}
				else if(name.equals("Mars_GetInt")){
					GetIntFunc=true;
					stringBuilder.append("invoke scanf, addr Mars_GetInt, addr "+q.getRes()+"\n");
				}
				else if(name.equals("Mars_PrintInt")) {
					stringBuilder.append("mov eax," + args.get(0) + "\n");
					stringBuilder.append("invoke printf, addr Mars_PrintInt, eax\n");
				}
				else {
					stringBuilder.append("invoke "+name);
					for (int i = 0;i<args.size();i++)
					{
						stringBuilder.append(", "+args.get(i));
					}
					stringBuilder.append("\n");
					if(!q.getRes().equals(""))
					stringBuilder.append("mov "+q.getRes()+", eax\n");
				}
				args.clear();
			}
		}else if (op.equals("=")) {
			String symsrc = q.getOpnd1();
			String symtar = q.getRes();
			stringBuilder.append("push "+symsrc+"\n");
			stringBuilder.append("pop "+symtar+"\n");
		} else if (op.equals("-=")) {
			String symsrc = q.getOpnd1();
			String symtar = q.getRes();
			stringBuilder.append("mov eax, "+symtar+"\n");
			stringBuilder.append("sub eax, "+symsrc+"\n");
			stringBuilder.append("mov "+symtar+", eax\n");
		} else if (op.equals("+=")) {
			String symsrc = q.getOpnd1();
			String symtar = q.getRes();
			stringBuilder.append("mov eax, "+symtar+"\n");
			stringBuilder.append("add eax, "+symsrc+"\n");
			stringBuilder.append("mov "+symtar+", eax\n");
		} else if(op.equals("<")||op.equals("<=")||op.equals("==")||
				op.equals(">")||op.equals(">=")) {
			String sym1=q.getOpnd1(),sym2=q.getOpnd2(),symtar=q.getRes();
			stringBuilder.append("mov eax, "+sym1+"\n");
			stringBuilder.append("cmp eax, "+sym2+"\n");
			jumpOP = op;
		}else if(op.equals("++")) {
			String symtar=q.getRes();
			stringBuilder.append("inc "+symtar+"\n");
		}else if(op.equals("=[]")) {
			String symoff = q.getOpnd1(),symarr = q.getOpnd2(),symtar = q.getRes();
			stringBuilder.append("mov edi, "+symoff+"\n");
			stringBuilder.append("mov eax,dword ptr "+symarr+"[edi*4]\n");
			stringBuilder.append("mov "+symtar+", eax\n");
		}else if(op.equals("[]=")) {
			String symoff = q.getOpnd2(),symarr = q.getRes(),symsrc = q.getOpnd1();
			stringBuilder.append("mov eax," +symsrc+"\n");
			stringBuilder.append("mov dword ptr "+symarr+"[edi*4], eax\n");
		}
	}
}
