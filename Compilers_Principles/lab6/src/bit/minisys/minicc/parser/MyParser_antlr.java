package bit.minisys.minicc.parser;

import bit.minisys.minicc.MiniCCCfg;
import MyCGrammar.*;
import bit.minisys.minicc.internal.util.MiniCCUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;
public class MyParser_antlr implements IMiniCCParser {
    public MyParser_antlr() {
    }

    public String run(String var1) throws IOException {
		String cFile = MiniCCUtil.removeAllExt(var1) + ".c";
		String var2 = MiniCCUtil.removeAllExt(var1) + MiniCCCfg.MINICC_PARSER_OUTPUT_EXT;
		InputStream is = new FileInputStream(cFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		MyCGrammarLexer lexer = new MyCGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MyCGrammarParser parser = new MyCGrammarParser(tokens);
		ParseTree tree = parser.compilationUnit();
		String fName = cFile.trim();
		ParseTreeWalker walker = new ParseTreeWalker();
		MyListener listener = new MyListener();
		listener.oFile=var2;
		walker.walk(listener, tree);
		System.out.println("3. Parsing Finished!");
		return var2;
	}
}