package bit.minisys.minicc.ncgen;

import bit.minisys.minicc.parser.ast.ASTNode;

// ��Ԫʽ��ʽ���м����, �������ͷ���ֵ�Ľṹֱ��ʹ��AST�ڵ㣬Ҳ�����Զ���IR�ڵ�
public class MyQuat {
    private String op;
    private String res;
    private String opnd1;
    private String opnd2;
    public MyQuat(String op, String res, String opnd1, String opnd2) {
        this.op = op;
        this.res = res;
        this.opnd1 = opnd1;
        this.opnd2 = opnd2;

    }

    public String getOp() {
        return op;
    }
    public String getOpnd1() {
        return opnd1;
    }
    public String getOpnd2() {
        return opnd2;
    }
    public String getRes() {
        return res;
    }
}