package bit.minisys.minicc.scanner;

import java.util.ArrayList;
import java.util.HashSet;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.scanner.internal.MiniCCScanner;


enum DFA_STATE{
	DFA_STATE_INITIAL,
	DFA_STATE_ID_0,
	DFA_STATE_ADD_0,
	DFA_STATE_MINUS_0,
	DFA_STATE_MINUS_1,
	DFA_STATE_EQUAL,
	DFA_STATE_AND,
	DFA_STATE_CONSTANT,
	DFA_STATE_CONSTANT_0,
	DFA_STATE_CONSTANT_L,
	DFA_STATE_CONSTANT_l,
	DFA_STATE_CONSTANT_ll,
	DFA_STATE_CONSTANT_u,
	DFA_STATE_INT_OCT,
	DFA_STATE_INT_HEX,
	DFA_STATE_FLOAT,
	DFA_STATE_FLOAT_e,
	DFA_STATE_FLOAT_es,
	DFA_STATE_FLOAT_HEX,
	DFA_STATE_FLOAT_HEX_p,
	DFA_STATE_FLOAT_HEX_ps,
	DFA_STATE_UNEQUAL,
	DFA_STATE_DEVIDE,
	DFA_STATE_PER,
	DFA_STATE_PER1,
	DFA_STATE_LA,
	DFA_STATE_LLA,
	DFA_STATE_LLA1,
	DFA_STATE_RA,
	DFA_STATE_RRA,
	DFA_STATE_RRA1,
	DFA_STATE_UA,
	DFA_STATE_OR,
	DFA_STATE_COLON,
	DFA_STATE_COLON1,
	DFA_STATE_DOT,
	DFA_STATE_DOT1,
	DFA_STATE_DOT2,
	DFA_STATE_MUL,
	DFA_STATE_QUA,
	DFA_STATE_CHAR_CONST,
	DFA_STATE_CHAR_CONST_ul,
	DFA_STATE_CHAR_CONST_u8,
	DFA_STATE_string,
	DFA_STATE_escape,
	DFA_STATE_UNKNW
}

public class ExampleScanner implements IMiniCCScanner {        //ExampleScanner继承了IMiniScanner
	
	private int lIndex = 0;
	private int cIndex = 0;
	
    private ArrayList<String> srcLines;
    
    private HashSet<String> keywordSet;
    
    public ExampleScanner(){
    	this.keywordSet = new HashSet<String>();
		this.keywordSet.add("auto");
		this.keywordSet.add("break");
		this.keywordSet.add("case");
		this.keywordSet.add("char");
		this.keywordSet.add("const");
		this.keywordSet.add("continue");
		this.keywordSet.add("default");
		this.keywordSet.add("do");
		this.keywordSet.add("double");
		this.keywordSet.add("else");
		this.keywordSet.add("enum");
		this.keywordSet.add("extern");
		this.keywordSet.add("float");
		this.keywordSet.add("for");
		this.keywordSet.add("goto");
		this.keywordSet.add("if");
		this.keywordSet.add("inline");
		this.keywordSet.add("int");
		this.keywordSet.add("long");
		this.keywordSet.add("register");
		this.keywordSet.add("restrict");
		this.keywordSet.add("return");
		this.keywordSet.add("short");
		this.keywordSet.add("signed");
		this.keywordSet.add("sizeof");
		this.keywordSet.add("static");
		this.keywordSet.add("struct");
		this.keywordSet.add("switch");
		this.keywordSet.add("typedef");
		this.keywordSet.add("union");
		this.keywordSet.add("unsigned");
		this.keywordSet.add("void");
		this.keywordSet.add("volatile");
		this.keywordSet.add("while");
	}

	private char getNextChar() {
		char c = Character.MAX_VALUE;
		while(true) {
			if(lIndex < this.srcLines.size()) {
				String line = this.srcLines.get(lIndex);
				if(cIndex < line.length()) {
					c = line.charAt(cIndex);
					cIndex++;
					break;
				}else {
					lIndex++;
					cIndex = 0;
				}
			}else {
				break;
			}
		}
		if(c == '\u001a') {
			c = Character.MAX_VALUE;
		}
		return c;
	}

	private boolean isAlpha(char c) {
		return Character.isAlphabetic(c);
	}

	private boolean isDigit(char c) {
		return Character.isDigit(c);
	}

	private boolean isAlphaOrDigit(char c) {
		return Character.isLetterOrDigit(c);
	}
	
	private String genToken(int num, String lexme, String type) {
		return genToken(num, lexme, type, this.cIndex - 1, this.lIndex);
	}
	private String genToken2(int num, String lexme, String type) {
		return genToken(num, lexme, type, this.cIndex - 2, this.lIndex);
	}
	private String genToken(int num, String lexme, String type, int cIndex, int lIndex) {
		String strToken = "";
		
		strToken += "[@" + num + "," + (cIndex - lexme.length() + 1) + ":" + cIndex;
		strToken += "='" + lexme + "',<" + type + ">," + (lIndex + 1) + ":" + (cIndex - lexme.length() + 1) + "]\n";
		
		return strToken;
	}
	
	@Override
	public String run(String iFile) throws Exception {
		
		System.out.println("Scanning...");
		String strTokens = "";
		int iTknNum = 0;

		this.srcLines = MiniCCUtil.readFile(iFile);
        
        DFA_STATE state = DFA_STATE.DFA_STATE_INITIAL;		//FA state
		String lexme 	= "";		//token lexme
		char c 			= ' ';		//next char
		boolean keep 	= false;	//keep current char
		boolean end 	= false;
		
		while(!end) {				//scanning loop
			if(!keep) {
				c = getNextChar();
			}
			
			keep = false;

			switch(state) {
			case DFA_STATE_INITIAL:	
				lexme = "";
				
				if(c == 'u'||c == 'U'||c == 'L'){
					state = DFA_STATE.DFA_STATE_CHAR_CONST_ul;
					lexme = lexme + c;
				}else if(isAlpha(c)||c=='_') {
					state = DFA_STATE.DFA_STATE_ID_0;
					lexme = lexme + c;
				}else if(c == '\''){
					state = DFA_STATE.DFA_STATE_CHAR_CONST;
					lexme = lexme + c;
				}else if(c == '\"'){
					state = DFA_STATE.DFA_STATE_string;
					lexme = lexme + c;
				}else if(c == '.'){
					strTokens += genToken(iTknNum, ".", "'.'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == '+') {
					state = DFA_STATE.DFA_STATE_ADD_0;
					lexme = lexme + c;
				}else if(c == '-') {
					state = DFA_STATE.DFA_STATE_MINUS_0;
					lexme = lexme + c;
				}else if(c == '&') {
					state = DFA_STATE.DFA_STATE_AND;
					lexme = lexme + c;
				}else if(c == '=') {
					state = DFA_STATE.DFA_STATE_EQUAL;
					lexme = lexme + c;
				}else if(c == '|') {
					state = DFA_STATE.DFA_STATE_OR;
					lexme = lexme + c;
				}else if(c == '%') {
					state = DFA_STATE.DFA_STATE_PER;
					lexme = lexme + c;
				}else if(c == '<') {
					state = DFA_STATE.DFA_STATE_LA;
					lexme = lexme + c;
				}else if(c == '>') {
					state = DFA_STATE.DFA_STATE_RA;
					lexme = lexme + c;
				}else if(c == '!') {
					state = DFA_STATE.DFA_STATE_UNEQUAL;
					lexme = lexme + c;
				}else if(c == '.') {
					state = DFA_STATE.DFA_STATE_DOT;
					lexme = lexme + c;
				}else if(c == '/'){
					state = DFA_STATE.DFA_STATE_DEVIDE;
					lexme = lexme + c;
				}else if(c == '^'){
					state = DFA_STATE.DFA_STATE_UA;
					lexme = lexme + c;
				}else if(c == ':') {
					state = DFA_STATE.DFA_STATE_COLON;
					lexme = lexme + c;
				}else if(c == '*') {
					state = DFA_STATE.DFA_STATE_MUL;
					lexme = lexme + c;
				}else if(c == '0') {
					state = DFA_STATE.DFA_STATE_CONSTANT_0;
					lexme = lexme + c;
				}else if(isDigit(c)) {
					state = DFA_STATE.DFA_STATE_CONSTANT;
					lexme = lexme + c;
				}else if(c == '~') {
					strTokens += genToken(iTknNum, "~", "'~'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == '?') {
					strTokens += genToken(iTknNum, "~", "'~'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == '{') {
					strTokens += genToken(iTknNum, "{", "'{'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == '}') {
					strTokens += genToken(iTknNum, "}", "'}'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == '?') {
					strTokens += genToken(iTknNum, "?", "'?'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == '(') {
					strTokens += genToken(iTknNum, "(", "'('");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == ')') {
					strTokens += genToken(iTknNum, ")", "')'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == ';') {
					strTokens += genToken(iTknNum, ";", "';'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}
				else if(c == ',') {
					strTokens += genToken(iTknNum, ",", "','");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(Character.isSpace(c)) {
					
				}else if(c == Character.MAX_VALUE) {
					cIndex = 5;
					strTokens += genToken(iTknNum, "<EOF>", "EOF");
					end = true;
				}
				break;
			case DFA_STATE_ADD_0:
				if(c == '+') {
					strTokens += genToken(iTknNum, "++", "'++'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if (c == '=') {
					strTokens += genToken(iTknNum, "+=", "'+='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, "+", "'+'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			case DFA_STATE_MINUS_0:
				if(c == '-') {
					strTokens += genToken(iTknNum, "--", "'--'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == '>'){
					strTokens += genToken(iTknNum, "->", "'->'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if (c == '='){
					strTokens += genToken(iTknNum, "-=", "'-='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, "-", "'-'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			case DFA_STATE_DOT:
				if(c == '.'){
					state = DFA_STATE.DFA_STATE_DOT1;
					lexme = lexme + c;
				}
				else{
					strTokens += genToken2(iTknNum, ".", "'.'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_DOT1:
				if(c == '.'){
					state = DFA_STATE.DFA_STATE_DOT2;
					lexme = lexme + c;
				}
			case DFA_STATE_DOT2:
				if(c == '.'){
					strTokens += genToken(iTknNum, "...", "'...'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					break;
				}
			case DFA_STATE_LLA:
				if(c==':') {
					strTokens += genToken(iTknNum, "<:", "'<:'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c=='%') {
					strTokens += genToken(iTknNum, "<%", "'<%'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c=='<') {
					state = DFA_STATE.DFA_STATE_LLA1;
					lexme = lexme + c;
				}else {
					strTokens += genToken2(iTknNum, "<", "'<'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_LLA1:
				if(c=='=') {
					strTokens += genToken(iTknNum, "<<=", "'<<='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, "<<", "'<<'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			case DFA_STATE_LA:
				if(Character.isSpace(c)) {
					state = DFA_STATE.DFA_STATE_LLA;
					lexme = lexme + c;
				}else if(c == '='){
					strTokens += genToken(iTknNum, "<=", "'<='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, "<", "'<'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_RRA:
				if(c=='>') {
					state = DFA_STATE.DFA_STATE_RRA1;
					lexme = lexme + c;
				}else {
					strTokens += genToken2(iTknNum, ">", "'>'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_RRA1:
				if(c=='=') {
					strTokens += genToken(iTknNum, ">>=", "'>>='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, ">>", "'>>'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			case DFA_STATE_RA:
				if(Character.isSpace(c)) {
					state = DFA_STATE.DFA_STATE_RRA;
					lexme = lexme + c;
				}else if(c == '='){
					strTokens += genToken(iTknNum, ">>=", "'>>='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}
				break;
			case DFA_STATE_COLON:
				if(Character.isSpace(c)) {
					state = DFA_STATE.DFA_STATE_COLON1;
					lexme = lexme + c;
				}else {
					strTokens += genToken2(iTknNum, ":", "':'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_COLON1:
				if(c == '>') {
					strTokens += genToken(iTknNum, ":>", "':>'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, ":", "':'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_MUL:
				if(c=='=') {
					strTokens += genToken(iTknNum, "*=", "'*='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, "*", "'*'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			case DFA_STATE_OR:
				if(c=='|') {
					strTokens += genToken(iTknNum, "||", "'||'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, "|", "'|'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			case DFA_STATE_UA:
				if(c=='=') {
					strTokens += genToken(iTknNum, "^=", "'^='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, "^", "'^'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			case DFA_STATE_PER:
				if(Character.isSpace(c)) {
					state = DFA_STATE.DFA_STATE_PER1;
					lexme = lexme + c;
				}else {
					strTokens += genToken2(iTknNum, "%", "'%'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_PER1:
				if(c == '=') {
					strTokens += genToken(iTknNum, "%=", "'%='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == '>'){
					strTokens += genToken(iTknNum, "%>", "'%>'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, "%", "'%'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			case DFA_STATE_AND:
				if(c == '&') {
					strTokens += genToken(iTknNum, "&&", "'&&'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == '=') {
					strTokens += genToken(iTknNum, "&=", "'&='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, "&", "'&'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			case DFA_STATE_DEVIDE:
				if(c == '=') {
					strTokens += genToken(iTknNum, "/=", "'/='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, "/", "'/'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			case DFA_STATE_EQUAL:
				if(c == '=') {
					strTokens += genToken(iTknNum, "==", "'='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else {
					strTokens += genToken2(iTknNum, "=", "'='");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			case DFA_STATE_ID_0:
				if(isAlphaOrDigit(c)||c=='_') {
					lexme = lexme + c;
				}else {
					if(this.keywordSet.contains(lexme)) {
						strTokens += genToken2(iTknNum, lexme, "'" + lexme + "'");
					}else {
						strTokens += genToken2(iTknNum, lexme, "Identifier");
					}
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_CONSTANT:
				if(c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'||c == '8'||c == '9'){
					state = DFA_STATE.DFA_STATE_CONSTANT;
					lexme = lexme + c;
				}else if(c == '.'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT;
				}else if(c == 'u'||c == 'U'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_CONSTANT_u;
				}else if(c == 'l'){
					state = DFA_STATE.DFA_STATE_CONSTANT_l;
					lexme = lexme + c;
				}else if(c == 'L'){
					state = DFA_STATE.DFA_STATE_CONSTANT_L;
					lexme = lexme + c;
				}else {
					strTokens += genToken2(iTknNum, lexme, "'interger-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_CONSTANT_0:
				if(c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'){
					state = DFA_STATE.DFA_STATE_INT_OCT;
					lexme = lexme + c;
				}else if(c == '.'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT;
				}else if(c == 'x'||c == 'X'){
					state = DFA_STATE.DFA_STATE_INT_HEX;
					lexme = lexme + c;
				}else if(c == 'u'||c == 'U'){
					lexme = lexme + c;
					strTokens += genToken(iTknNum, lexme, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == 'l'){
					state = DFA_STATE.DFA_STATE_CONSTANT_l;
					lexme = lexme + c;
				}else if(c == 'L'){
					state = DFA_STATE.DFA_STATE_CONSTANT_L;
					lexme = lexme + c;
				}else{
					strTokens += genToken2(iTknNum, lexme, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_INT_OCT:
				if(c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'){
					state = DFA_STATE.DFA_STATE_INT_OCT;
					lexme = lexme + c;
				}else if(c == 'u'||c == 'U'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_CONSTANT_u;
				}else if(c == 'l'){
					state = DFA_STATE.DFA_STATE_CONSTANT_l;
					lexme = lexme + c;
				}else if(c == 'L'){
					state = DFA_STATE.DFA_STATE_CONSTANT_L;
					lexme = lexme + c;
				}else{
					strTokens += genToken2(iTknNum, lexme, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_INT_HEX:
				if(c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'||c == '8'||c == '9'||c == 'A'||c == 'B'||c == 'C'||c == 'D'||c == 'E'||c == 'F'||c == 'a'||c == 'b'||c == 'c'||c == 'd'||c == 'e'||c == 'f'){
					state = DFA_STATE.DFA_STATE_INT_HEX;
					lexme = lexme + c;
				}else if(c == '.'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT_HEX;
				}else if(c == 'p'||c == 'P'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT_HEX_p;
				}else if(c == 'u'||c == 'U'){
					lexme = lexme + c;
					strTokens += genToken(iTknNum, lexme, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == 'l'){
					state = DFA_STATE.DFA_STATE_CONSTANT_l;
					lexme = lexme + c;
				}else if(c == 'L'){
					state = DFA_STATE.DFA_STATE_CONSTANT_L;
					lexme = lexme + c;
				}else{
					strTokens += genToken2(iTknNum, lexme, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_FLOAT:
				if(c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'||c == '8'||c == '9'){
					lexme = lexme + c;
				}else if(c == 'e'||c == 'E'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT_e;
				}else{
					strTokens +=genToken2(iTknNum, lexme, "'floating-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_FLOAT_e:
				if(c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'||c == '8'||c == '9'||c == '-'||c == '+'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT_es;
				}else if(Character.isSpace(c)){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT_e;
				}
				break;
			case DFA_STATE_FLOAT_es:
				if(c == 'f'||c == 'l'||c == 'F'||c == 'L'){
					lexme = lexme + c;
					strTokens += genToken(iTknNum, lexme, "'floating-constant'");
				}else if(Character.isSpace(c)){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT_es;
				}else if(c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'||c == '8'||c == '9'||c == 'A'||c == 'B'||c == 'C'||c == 'D'||c == 'E'||c == 'F'||c == 'a'||c == 'b'||c == 'c'||c == 'd'||c == 'e'||c == 'f'){
					lexme = lexme + c;
				}else{
					strTokens += genToken2(iTknNum, lexme, "'floating-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
			break;
			case DFA_STATE_FLOAT_HEX:
				if(c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'||c == '8'||c == '9'||c == 'A'||c == 'B'||c == 'C'||c == 'D'||c == 'E'||c == 'F'||c == 'a'||c == 'b'||c == 'c'||c == 'd'||c == 'e'||c == 'f'){
					lexme = lexme + c;
				}else if(c == 'p'||c == 'P'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT_HEX_p;
				}
				break;
			case DFA_STATE_FLOAT_HEX_p:
				if(c == '+'||c == '-'||c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'||c == '8'||c == '9'||c == 'A'||c == 'B'||c == 'C'||c == 'D'||c == 'E'||c == 'F'||c == 'a'||c == 'b'||c == 'c'||c == 'd'||c == 'e'||c == 'f'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT_HEX_ps;
				}else if(Character.isSpace(c)){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT_HEX_p;
				}
				break;
			case DFA_STATE_FLOAT_HEX_ps:
				if(c == 'f'||c == 'l'||c == 'F'||c == 'L'){
					lexme = lexme + c;
					strTokens += genToken(iTknNum, lexme, "'floating-constant'");
				}else if(Character.isSpace(c)){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_FLOAT_HEX_ps;
				}else if(c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'||c == '8'||c == '9'||c == 'A'||c == 'B'||c == 'C'||c == 'D'||c == 'E'||c == 'F'||c == 'a'||c == 'b'||c == 'c'||c == 'd'||c == 'e'||c == 'f'){
					lexme = lexme + c;
				}else{
					strTokens += genToken2(iTknNum, lexme, "'floating-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_CONSTANT_L:
				if(c == 'L'){
					state = DFA_STATE.DFA_STATE_CONSTANT_ll;
					lexme = lexme + c;
				}else if(c == 'u'||c == 'U'){
					strTokens += genToken(iTknNum, lexme+c, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}else{
					strTokens += genToken2(iTknNum, lexme, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_CONSTANT_l:
				if(c == 'l'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_CONSTANT_ll;
				}else if(c == 'u'||c == 'U'){
					lexme = lexme + c;
					strTokens += genToken(iTknNum, lexme, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else{
					strTokens += genToken2(iTknNum, lexme, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_CONSTANT_ll:
				if(c == 'u'||c == 'U'){
					lexme = lexme + c;
					strTokens += genToken(iTknNum, lexme, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else{
					strTokens += genToken2(iTknNum, lexme, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_CONSTANT_u:
				if(c == 'l'){
					state = DFA_STATE.DFA_STATE_CONSTANT_l;
					lexme = lexme + c;
				}else if(c == 'L'){
					state = DFA_STATE.DFA_STATE_CONSTANT_L;
					lexme = lexme + c;
				}else{
					strTokens += genToken2(iTknNum, lexme, "'integer-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
					keep = true;
				}
				break;
			case DFA_STATE_CHAR_CONST:
				if(c == '\''){
					lexme = lexme + c;
					strTokens += genToken(iTknNum, lexme, "'character-constant'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else if(c == '\\'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_escape;
				}else{
					state = DFA_STATE.DFA_STATE_CHAR_CONST;
					lexme = lexme + c;
				}
				break;
			case DFA_STATE_CHAR_CONST_ul:
				if(c == '\''){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_CHAR_CONST;
				}else if(c == '\"'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_string;
				}else if(c == '8'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_CHAR_CONST_u8;
				}else if(isAlpha(c)||c == '_'){
					state = DFA_STATE.DFA_STATE_ID_0;
					lexme = lexme + c;
				}else{
					strTokens += genToken2(iTknNum, lexme, "'Identifier'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}
				break;
			case DFA_STATE_string:
				if(c == '\"'){
					lexme = lexme + c;
					strTokens += genToken(iTknNum, lexme, "'string-literal'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}else{
					lexme = lexme + c;
				}
				break;
			case DFA_STATE_CHAR_CONST_u8:
				if(c == '\"'){
					lexme = lexme + c;
					state = DFA_STATE.DFA_STATE_string;
				}else if(isAlpha(c)||c == '_'){
					state = DFA_STATE.DFA_STATE_ID_0;
					lexme = lexme + c;
				}else{
					strTokens += genToken2(iTknNum, lexme, "'Identifier'");
					iTknNum++;
					state = DFA_STATE.DFA_STATE_INITIAL;
				}
				break;
			case DFA_STATE_escape:
				if(c == '\''||c == '\"'||c == '?'||c == '\\'||c == 'a'||c == 'b'||c == 'f'||c == 'n'||c == 'r'||c == 't'||c == 'v');
				{
					state = DFA_STATE.DFA_STATE_CHAR_CONST;
					lexme = lexme + c;
				}
				break;
			default:
				System.out.println("[ERROR]Scanner:line " + lIndex + ", column=" + cIndex + ", unreachable state!");
				state = DFA_STATE.DFA_STATE_INITIAL;
				break;
			}
		}
		
	
		String oFile = MiniCCUtil.removeAllExt(iFile) + MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT;
		MiniCCUtil.createAndWriteFile(oFile, strTokens);
		
		return oFile;
	}

}