package bit.minisys.minicc.parser.ast;

import java.util.LinkedList;

import com.fasterxml.jackson.annotation.JsonTypeName;
@JsonTypeName("SelectionStatement")
public class ASTSelectionStatement extends ASTStatement{
	
	public LinkedList<ASTExpression> cond;

	public LinkedList<ASTExpression> cond1;

	public ASTStatement then;
	public ASTStatement otherwise;
	public ASTStatement otherwise1;
	public ASTSelectionStatement() {
		super("SelectionStatement");
	}
	public ASTSelectionStatement(LinkedList<ASTExpression> cond,LinkedList<ASTExpression> cond1,ASTStatement then,ASTStatement otherwise,ASTStatement otherwise1) {
		super("SelectionStatement");
		this.cond = cond;
		this.cond1 = cond1;
		this.then = then;
		this.otherwise = otherwise;
		this.otherwise1 = otherwise1;
	}
	@Override
	public void accept(ASTVisitor visitor) throws Exception {
		visitor.visit(this);
	}

}
