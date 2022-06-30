package bit.minisys.minicc.semantic;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import bit.minisys.minicc.parser.ast.ASTCompilationUnit;

public class ExampleSemanticAnalyzer implements IMiniCCSemantic {

@Override
	public String run(String iFile) throws Exception {
		ObjectMapper mapper =new ObjectMapper();
		ASTCompilationUnit program=(ASTCompilationUnit) mapper.readValue(new File(iFile), ASTCompilationUnit.class);
		ErrorType errorType = new ErrorType();
		SymbolTable globaltable = new SymbolTable();
		TableVisitor visitor = new TableVisitor(globaltable,errorType);
		program.accept(visitor);
		errorType.output();
		System.out.println("4. Semantic finished!");
		return iFile;
	}
}
