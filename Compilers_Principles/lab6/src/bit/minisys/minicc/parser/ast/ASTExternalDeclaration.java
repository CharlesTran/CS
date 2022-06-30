package bit.minisys.minicc.parser.ast;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ExternalDeclaration")
public class ASTExternalDeclaration extends ASTNode{
	
	public List<ASTNode> items; //  item ֻ����declaration �� functionDefine
	
	
	public ASTExternalDeclaration() {
		super("ExternalDeclaration");
		this.items = new ArrayList<ASTNode>();
	}
	
	public ASTExternalDeclaration(List<ASTNode> items) {
		super("ExternalDeclaration");
		this.items = items;
	}

	public static class Builder{
		public List<ASTNode> items = new ArrayList<ASTNode>();
		public void addNode(Object node){
			if (items == null) {
				items = new ArrayList<ASTNode>();
			}
			if(node instanceof ASTDeclaration) {
				items.add((ASTDeclaration)node);
			}else if(node instanceof ASTFunctionDefine) {
				items.add((ASTFunctionDefine)node);
			}else if(node instanceof List){
				for (Object element : (List<?>)node) {
					addNode(element);
				}
				//((List) node).stream().forEachOrdered(this::addNode);
			}else {
				throw new RuntimeException("externalDeclaration Invalid type.");
			}
		}
		public ASTExternalDeclaration build() {
			return new ASTExternalDeclaration(this.items);
		}
	}
	
	@Override
	public void accept(ASTVisitor visitor) throws Exception {
		visitor.visit(this);
	}

}