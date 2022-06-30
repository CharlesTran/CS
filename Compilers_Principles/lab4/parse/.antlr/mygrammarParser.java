// Generated from d:\Documents\Compilers_Principles\lab4\parse\mygrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mygrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Auto=1, Break=2, Case=3, Char=4, Const=5, Continue=6, Default=7, Do=8, 
		Double=9, Else=10, Enum=11, Extern=12, Float=13, For=14, Goto=15, If=16, 
		Inline=17, Int=18, Long=19, Register=20, Restrict=21, Return=22, Short=23, 
		Signed=24, Sizeof=25, Static=26, Struct=27, Switch=28, Typedef=29, Union=30, 
		Unsigned=31, Void=32, Volatile=33, While=34, LeftParen=35, RightParen=36, 
		LeftBracket=37, RightBracket=38, LeftBrace=39, RightBrace=40, Less=41, 
		LessEqual=42, Greater=43, GreaterEqual=44, LeftShift=45, RightShift=46, 
		Plus=47, PlusPlus=48, Minus=49, MinusMinus=50, Star=51, Div=52, Mod=53, 
		And=54, Or=55, AndAnd=56, OrOr=57, Caret=58, Not=59, Tilde=60, Question=61, 
		Colon=62, Semi=63, Comma=64, Assign=65, StarAssign=66, DivAssign=67, ModAssign=68, 
		PlusAssign=69, MinusAssign=70, LeftShiftAssign=71, RightShiftAssign=72, 
		AndAssign=73, XorAssign=74, OrAssign=75, Equal=76, NotEqual=77, Arrow=78, 
		Dot=79, Ellipsis=80, Identifier=81, Constant=82, StringLiteral=83, ComplexDefine=84, 
		AsmBlock=85, LineAfterPreprocessing=86, LineDirective=87, PragmaDirective=88, 
		Whitespace=89, Newline=90, BlockComment=91, LineComment=92;
	public static final int
		RULE_compilationUnit = 0, RULE_translationUnit = 1, RULE_translationUnit_ = 2, 
		RULE_externalDeclaration = 3, RULE_functionDefinition = 4, RULE_declarationList = 5, 
		RULE_declaration = 6, RULE_initDeclaratorList = 7, RULE_initDeclarator = 8, 
		RULE_declarator = 9, RULE_typeSpecifiers = 10, RULE_typeSpecifier1 = 11, 
		RULE_typeSpecifier2 = 12, RULE_typeSpecifier3 = 13, RULE_blockItemList = 14, 
		RULE_blockItem = 15, RULE_statement = 16, RULE_compoundStatement = 17, 
		RULE_iterationStatement = 18, RULE_jumpStatement = 19, RULE_selectionStatement = 20, 
		RULE_expressionStatement = 21, RULE_expression = 22, RULE_unaryExpression = 23, 
		RULE_postfixExpression = 24, RULE_assignmentExpression = 25, RULE_conditionalExpression = 26, 
		RULE_logicalOrExpression = 27, RULE_logicalAndExpression = 28, RULE_castExpression = 29, 
		RULE_multiplicativeExpression = 30, RULE_additiveExpression = 31, RULE_shiftExpression = 32, 
		RULE_relationalExpression = 33, RULE_equalityExpression = 34, RULE_andExpression = 35, 
		RULE_exclusiveOrExpression = 36, RULE_inclusiveOrExpression = 37, RULE_assignmentOperator = 38, 
		RULE_unaryOperator = 39, RULE_primaryExpression = 40, RULE_tokenId = 41, 
		RULE_tokenConstant = 42, RULE_tokenStringLiteral = 43, RULE_functionCall = 44, 
		RULE_argumentExpressionList = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "translationUnit", "translationUnit_", "externalDeclaration", 
			"functionDefinition", "declarationList", "declaration", "initDeclaratorList", 
			"initDeclarator", "declarator", "typeSpecifiers", "typeSpecifier1", "typeSpecifier2", 
			"typeSpecifier3", "blockItemList", "blockItem", "statement", "compoundStatement", 
			"iterationStatement", "jumpStatement", "selectionStatement", "expressionStatement", 
			"expression", "unaryExpression", "postfixExpression", "assignmentExpression", 
			"conditionalExpression", "logicalOrExpression", "logicalAndExpression", 
			"castExpression", "multiplicativeExpression", "additiveExpression", "shiftExpression", 
			"relationalExpression", "equalityExpression", "andExpression", "exclusiveOrExpression", 
			"inclusiveOrExpression", "assignmentOperator", "unaryOperator", "primaryExpression", 
			"tokenId", "tokenConstant", "tokenStringLiteral", "functionCall", "argumentExpressionList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", 
			"'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'", "'register'", 
			"'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
			"'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", 
			"'volatile'", "'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", 
			"'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", 
			"'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", 
			"'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", "'.'", 
			"'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Auto", "Break", "Case", "Char", "Const", "Continue", "Default", 
			"Do", "Double", "Else", "Enum", "Extern", "Float", "For", "Goto", "If", 
			"Inline", "Int", "Long", "Register", "Restrict", "Return", "Short", "Signed", 
			"Sizeof", "Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", 
			"Void", "Volatile", "While", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", 
			"GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", 
			"MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", 
			"Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", 
			"RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual", 
			"Arrow", "Dot", "Ellipsis", "Identifier", "Constant", "StringLiteral", 
			"ComplexDefine", "AsmBlock", "LineAfterPreprocessing", "LineDirective", 
			"PragmaDirective", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mygrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mygrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mygrammarParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Semi))) != 0)) {
				{
				setState(92);
				translationUnit();
				}
			}

			setState(95);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnit_Context translationUnit_() {
			return getRuleContext(TranslationUnit_Context.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_translationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			externalDeclaration();
			setState(98);
			translationUnit_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnit_Context extends ParserRuleContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnit_Context translationUnit_() {
			return getRuleContext(TranslationUnit_Context.class,0);
		}
		public TranslationUnit_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit_; }
	}

	public final TranslationUnit_Context translationUnit_() throws RecognitionException {
		TranslationUnit_Context _localctx = new TranslationUnit_Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_translationUnit_);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Semi:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				externalDeclaration();
				setState(101);
				translationUnit_();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_externalDeclaration);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<TypeSpecifiersContext> typeSpecifiers() {
			return getRuleContexts(TypeSpecifiersContext.class);
		}
		public TypeSpecifiersContext typeSpecifiers(int i) {
			return getRuleContext(TypeSpecifiersContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(mygrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(mygrammarParser.Identifier, i);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				typeSpecifiers();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void))) != 0) );
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				match(Identifier);
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(121);
			match(LeftParen);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void))) != 0)) {
				{
				setState(122);
				declarationList();
				}
			}

			setState(125);
			match(RightParen);
			setState(126);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				declaration();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeSpecifiersContext typeSpecifiers() {
			return getRuleContext(TypeSpecifiersContext.class,0);
		}
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			typeSpecifiers();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(134);
				initDeclaratorList(0);
				}
			}

			setState(137);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(140);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(142);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(143);
					match(Comma);
					setState(144);
					initDeclarator();
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(mygrammarParser.Assign, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initDeclarator);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				declarator();
				setState(152);
				match(Assign);
				setState(153);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifiersContext extends ParserRuleContext {
		public TypeSpecifier1Context typeSpecifier1() {
			return getRuleContext(TypeSpecifier1Context.class,0);
		}
		public List<TypeSpecifier2Context> typeSpecifier2() {
			return getRuleContexts(TypeSpecifier2Context.class);
		}
		public TypeSpecifier2Context typeSpecifier2(int i) {
			return getRuleContext(TypeSpecifier2Context.class,i);
		}
		public TypeSpecifier3Context typeSpecifier3() {
			return getRuleContext(TypeSpecifier3Context.class,0);
		}
		public TypeSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifiers; }
	}

	public final TypeSpecifiersContext typeSpecifiers() throws RecognitionException {
		TypeSpecifiersContext _localctx = new TypeSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeSpecifiers);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Float:
			case Int:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				typeSpecifier1();
				}
				break;
			case Long:
			case Short:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				typeSpecifier2();
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(161);
					typeSpecifier2();
					}
					break;
				}
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(164);
					typeSpecifier1();
					}
					break;
				}
				}
				break;
			case Signed:
			case Unsigned:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				typeSpecifier3();
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Long || _la==Short) {
					{
					setState(168);
					typeSpecifier2();
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Long || _la==Short) {
						{
						setState(169);
						typeSpecifier2();
						}
					}

					}
				}

				setState(174);
				typeSpecifier1();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifier1Context extends ParserRuleContext {
		public TerminalNode Void() { return getToken(mygrammarParser.Void, 0); }
		public TerminalNode Char() { return getToken(mygrammarParser.Char, 0); }
		public TerminalNode Int() { return getToken(mygrammarParser.Int, 0); }
		public TerminalNode Float() { return getToken(mygrammarParser.Float, 0); }
		public TerminalNode Double() { return getToken(mygrammarParser.Double, 0); }
		public TypeSpecifier1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier1; }
	}

	public final TypeSpecifier1Context typeSpecifier1() throws RecognitionException {
		TypeSpecifier1Context _localctx = new TypeSpecifier1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeSpecifier1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Void))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifier2Context extends ParserRuleContext {
		public TerminalNode Long() { return getToken(mygrammarParser.Long, 0); }
		public TerminalNode Short() { return getToken(mygrammarParser.Short, 0); }
		public TypeSpecifier2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier2; }
	}

	public final TypeSpecifier2Context typeSpecifier2() throws RecognitionException {
		TypeSpecifier2Context _localctx = new TypeSpecifier2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeSpecifier2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==Long || _la==Short) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifier3Context extends ParserRuleContext {
		public TerminalNode Signed() { return getToken(mygrammarParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(mygrammarParser.Unsigned, 0); }
		public TypeSpecifier3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier3; }
	}

	public final TypeSpecifier3Context typeSpecifier3() throws RecognitionException {
		TypeSpecifier3Context _localctx = new TypeSpecifier3Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeSpecifier3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==Signed || _la==Unsigned) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				blockItem();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Break) | (1L << Char) | (1L << Continue) | (1L << Do) | (1L << Double) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Switch) | (1L << Unsigned) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << AndAnd) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (StringLiteral - 81)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockItem);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				declaration();
				}
				break;
			case Break:
			case Continue:
			case Do:
			case For:
			case If:
			case Return:
			case Switch:
			case While:
			case LeftParen:
			case LeftBrace:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case AndAnd:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				compoundStatement();
				}
				break;
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case AndAnd:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				expressionStatement();
				}
				break;
			case Do:
			case For:
			case While:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				iterationStatement();
				}
				break;
			case Break:
			case Continue:
			case Return:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				jumpStatement();
				}
				break;
			case If:
			case Switch:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				selectionStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(mygrammarParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(mygrammarParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(LeftBrace);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Break) | (1L << Char) | (1L << Continue) | (1L << Do) | (1L << Double) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Switch) | (1L << Unsigned) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << AndAnd) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
				{
				setState(201);
				blockItemList();
				}
			}

			setState(204);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IterationStatement_dowhileContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(mygrammarParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(mygrammarParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public IterationStatement_dowhileContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class IterationStatement_forDeclaredContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(mygrammarParser.For, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IterationStatement_forDeclaredContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class IterationStatement_whileContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(mygrammarParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IterationStatement_whileContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class IterationStatement_forContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(mygrammarParser.For, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public List<TerminalNode> Semi() { return getTokens(mygrammarParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(mygrammarParser.Semi, i);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IterationStatement_forContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_iterationStatement);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new IterationStatement_whileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(While);
				setState(207);
				match(LeftParen);
				setState(208);
				expression(0);
				setState(209);
				match(RightParen);
				setState(210);
				statement();
				}
				break;
			case 2:
				_localctx = new IterationStatement_dowhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(Do);
				setState(213);
				statement();
				setState(214);
				match(While);
				setState(215);
				match(LeftParen);
				setState(216);
				expression(0);
				setState(217);
				match(RightParen);
				setState(218);
				match(Semi);
				}
				break;
			case 3:
				_localctx = new IterationStatement_forContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(For);
				setState(221);
				match(LeftParen);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (LeftParen - 35)) | (1L << (Plus - 35)) | (1L << (PlusPlus - 35)) | (1L << (Minus - 35)) | (1L << (MinusMinus - 35)) | (1L << (Star - 35)) | (1L << (And - 35)) | (1L << (AndAnd - 35)) | (1L << (Not - 35)) | (1L << (Tilde - 35)) | (1L << (Identifier - 35)) | (1L << (Constant - 35)) | (1L << (StringLiteral - 35)))) != 0)) {
					{
					setState(222);
					expression(0);
					}
				}

				setState(225);
				match(Semi);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (LeftParen - 35)) | (1L << (Plus - 35)) | (1L << (PlusPlus - 35)) | (1L << (Minus - 35)) | (1L << (MinusMinus - 35)) | (1L << (Star - 35)) | (1L << (And - 35)) | (1L << (AndAnd - 35)) | (1L << (Not - 35)) | (1L << (Tilde - 35)) | (1L << (Identifier - 35)) | (1L << (Constant - 35)) | (1L << (StringLiteral - 35)))) != 0)) {
					{
					setState(226);
					expression(0);
					}
				}

				setState(229);
				match(Semi);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (LeftParen - 35)) | (1L << (Plus - 35)) | (1L << (PlusPlus - 35)) | (1L << (Minus - 35)) | (1L << (MinusMinus - 35)) | (1L << (Star - 35)) | (1L << (And - 35)) | (1L << (AndAnd - 35)) | (1L << (Not - 35)) | (1L << (Tilde - 35)) | (1L << (Identifier - 35)) | (1L << (Constant - 35)) | (1L << (StringLiteral - 35)))) != 0)) {
					{
					setState(230);
					expression(0);
					}
				}

				setState(233);
				match(RightParen);
				setState(234);
				statement();
				}
				break;
			case 4:
				_localctx = new IterationStatement_forDeclaredContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(For);
				setState(236);
				match(LeftParen);
				setState(237);
				declaration();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (LeftParen - 35)) | (1L << (Plus - 35)) | (1L << (PlusPlus - 35)) | (1L << (Minus - 35)) | (1L << (MinusMinus - 35)) | (1L << (Star - 35)) | (1L << (And - 35)) | (1L << (AndAnd - 35)) | (1L << (Not - 35)) | (1L << (Tilde - 35)) | (1L << (Identifier - 35)) | (1L << (Constant - 35)) | (1L << (StringLiteral - 35)))) != 0)) {
					{
					setState(238);
					expression(0);
					}
				}

				setState(241);
				match(Semi);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (LeftParen - 35)) | (1L << (Plus - 35)) | (1L << (PlusPlus - 35)) | (1L << (Minus - 35)) | (1L << (MinusMinus - 35)) | (1L << (Star - 35)) | (1L << (And - 35)) | (1L << (AndAnd - 35)) | (1L << (Not - 35)) | (1L << (Tilde - 35)) | (1L << (Identifier - 35)) | (1L << (Constant - 35)) | (1L << (StringLiteral - 35)))) != 0)) {
					{
					setState(242);
					expression(0);
					}
				}

				setState(245);
				match(RightParen);
				setState(246);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JumpStatement_returnContext extends JumpStatementContext {
		public TerminalNode Return() { return getToken(mygrammarParser.Return, 0); }
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatement_returnContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class JumpStatement_continueContext extends JumpStatementContext {
		public TerminalNode Continue() { return getToken(mygrammarParser.Continue, 0); }
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public JumpStatement_continueContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class JumpStatement_breakContext extends JumpStatementContext {
		public TerminalNode Break() { return getToken(mygrammarParser.Break, 0); }
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public JumpStatement_breakContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jumpStatement);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Continue:
				_localctx = new JumpStatement_continueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(Continue);
				setState(251);
				match(Semi);
				}
				break;
			case Break:
				_localctx = new JumpStatement_breakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(Break);
				setState(253);
				match(Semi);
				}
				break;
			case Return:
				_localctx = new JumpStatement_returnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(Return);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (LeftParen - 35)) | (1L << (Plus - 35)) | (1L << (PlusPlus - 35)) | (1L << (Minus - 35)) | (1L << (MinusMinus - 35)) | (1L << (Star - 35)) | (1L << (And - 35)) | (1L << (AndAnd - 35)) | (1L << (Not - 35)) | (1L << (Tilde - 35)) | (1L << (Identifier - 35)) | (1L << (Constant - 35)) | (1L << (StringLiteral - 35)))) != 0)) {
					{
					setState(255);
					expression(0);
					}
				}

				setState(258);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
	 
		public SelectionStatementContext() { }
		public void copyFrom(SelectionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectionStatement_ifContext extends SelectionStatementContext {
		public TerminalNode If() { return getToken(mygrammarParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(mygrammarParser.Else, 0); }
		public SelectionStatement_ifContext(SelectionStatementContext ctx) { copyFrom(ctx); }
	}
	public static class SelectionStatement_switchContext extends SelectionStatementContext {
		public TerminalNode Switch() { return getToken(mygrammarParser.Switch, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SelectionStatement_switchContext(SelectionStatementContext ctx) { copyFrom(ctx); }
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selectionStatement);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				_localctx = new SelectionStatement_ifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(If);
				setState(262);
				match(LeftParen);
				setState(263);
				expression(0);
				setState(264);
				match(RightParen);
				setState(265);
				statement();
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(266);
					match(Else);
					setState(267);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				_localctx = new SelectionStatement_switchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(Switch);
				setState(271);
				match(LeftParen);
				setState(272);
				expression(0);
				setState(273);
				match(RightParen);
				setState(274);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			expression(0);
			setState(279);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expression_Context extends ExpressionContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public Expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Expression_passContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public Expression_passContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Expression_Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(282);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_passContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(284);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(285);
					match(Comma);
					setState(286);
					assignmentExpression();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExpression_Context extends UnaryExpressionContext {
		public TerminalNode PlusPlus() { return getToken(mygrammarParser.PlusPlus, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(mygrammarParser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpression_Context(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExpression_passContext extends UnaryExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(mygrammarParser.AndAnd, 0); }
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public UnaryExpression_passContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryExpression);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Identifier:
			case Constant:
			case StringLiteral:
				_localctx = new UnaryExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				postfixExpression(0);
				}
				break;
			case PlusPlus:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(PlusPlus);
				setState(294);
				unaryExpression();
				}
				break;
			case MinusMinus:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(MinusMinus);
				setState(296);
				unaryExpression();
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case And:
			case Not:
			case Tilde:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				unaryOperator();
				setState(298);
				castExpression();
				}
				break;
			case AndAnd:
				_localctx = new UnaryExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				match(AndAnd);
				setState(301);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostfixExpression_arrayaccessContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(mygrammarParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(mygrammarParser.RightBracket, 0); }
		public PostfixExpression_arrayaccessContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_pointContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(mygrammarParser.Arrow, 0); }
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public PostfixExpression_pointContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_funcallContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public PostfixExpression_funcallContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_passContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpression_passContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_memberContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(mygrammarParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public PostfixExpression_memberContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(mygrammarParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(mygrammarParser.MinusMinus, 0); }
		public PostfixExpression_Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PostfixExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(305);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpression_arrayaccessContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(307);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(308);
						match(LeftBracket);
						setState(309);
						expression(0);
						setState(310);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpression_funcallContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(312);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(313);
						match(LeftParen);
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (LeftParen - 35)) | (1L << (Plus - 35)) | (1L << (PlusPlus - 35)) | (1L << (Minus - 35)) | (1L << (MinusMinus - 35)) | (1L << (Star - 35)) | (1L << (And - 35)) | (1L << (AndAnd - 35)) | (1L << (Not - 35)) | (1L << (Tilde - 35)) | (1L << (Identifier - 35)) | (1L << (Constant - 35)) | (1L << (StringLiteral - 35)))) != 0)) {
							{
							setState(314);
							argumentExpressionList(0);
							}
						}

						setState(317);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpression_memberContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(318);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(319);
						match(Dot);
						setState(320);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpression_pointContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(321);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(322);
						match(Arrow);
						setState(323);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpression_Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(324);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(325);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpression_Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(326);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(327);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignmentExpression);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				unaryExpression();
				setState(334);
				assignmentOperator();
				setState(335);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(mygrammarParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(mygrammarParser.Colon, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			logicalOrExpression(0);
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(342);
				match(Question);
				setState(343);
				expression(0);
				setState(344);
				match(Colon);
				setState(345);
				conditionalExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalOrExpression_Context extends LogicalOrExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(mygrammarParser.OrOr, 0); }
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpression_Context(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalOrExpression_passContext extends LogicalOrExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpression_passContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalOrExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(350);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpression_Context(new LogicalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(352);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(353);
					match(OrOr);
					setState(354);
					logicalAndExpression(0);
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	 
		public LogicalAndExpressionContext() { }
		public void copyFrom(LogicalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalAndExpression_passContext extends LogicalAndExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpression_passContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalAndExpression_Context extends LogicalAndExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(mygrammarParser.AndAnd, 0); }
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpression_Context(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalAndExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(361);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpression_Context(new LogicalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(363);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(364);
					match(AndAnd);
					setState(365);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	 
		public CastExpressionContext() { }
		public void copyFrom(CastExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CastExpression_passContext extends CastExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpression_passContext(CastExpressionContext ctx) { copyFrom(ctx); }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_castExpression);
		try {
			_localctx = new CastExpression_passContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicativeExpression_Context extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(mygrammarParser.Star, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Div() { return getToken(mygrammarParser.Div, 0); }
		public TerminalNode Mod() { return getToken(mygrammarParser.Mod, 0); }
		public MultiplicativeExpression_Context(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicativeExpression_passContext extends MultiplicativeExpressionContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpression_passContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultiplicativeExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(374);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(385);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpression_Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(376);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(377);
						match(Star);
						setState(378);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpression_Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(379);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(380);
						match(Div);
						setState(381);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpression_Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(382);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(383);
						match(Mod);
						setState(384);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditiveExpression_passContext extends AdditiveExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpression_passContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditiveExpression_Context extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(mygrammarParser.Plus, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Minus() { return getToken(mygrammarParser.Minus, 0); }
		public AdditiveExpression_Context(AdditiveExpressionContext ctx) { copyFrom(ctx); }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(391);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpression_Context(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(393);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(394);
						match(Plus);
						setState(395);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpression_Context(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(396);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(397);
						match(Minus);
						setState(398);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	 
		public ShiftExpressionContext() { }
		public void copyFrom(ShiftExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftExpression_Context extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode LeftShift() { return getToken(mygrammarParser.LeftShift, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode RightShift() { return getToken(mygrammarParser.RightShift, 0); }
		public ShiftExpression_Context(ShiftExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ShiftExpression_passContext extends ShiftExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpression_passContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ShiftExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(405);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(413);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpression_Context(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(407);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(408);
						match(LeftShift);
						setState(409);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpression_Context(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(410);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(411);
						match(RightShift);
						setState(412);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalExpression_passContext extends RelationalExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpression_passContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalExpression_Context extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(mygrammarParser.Less, 0); }
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode Greater() { return getToken(mygrammarParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(mygrammarParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(mygrammarParser.GreaterEqual, 0); }
		public RelationalExpression_Context(RelationalExpressionContext ctx) { copyFrom(ctx); }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationalExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(419);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(421);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(422);
						match(Less);
						setState(423);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(424);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(425);
						match(Greater);
						setState(426);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(427);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(428);
						match(LessEqual);
						setState(429);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(430);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(431);
						match(GreaterEqual);
						setState(432);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityExpression_passContext extends EqualityExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpression_passContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityExpression_Context extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(mygrammarParser.Equal, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode NotEqual() { return getToken(mygrammarParser.NotEqual, 0); }
		public EqualityExpression_Context(EqualityExpressionContext ctx) { copyFrom(ctx); }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqualityExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(439);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(447);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpression_Context(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(441);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(442);
						match(Equal);
						setState(443);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpression_Context(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(444);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(445);
						match(NotEqual);
						setState(446);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	 
		public AndExpressionContext() { }
		public void copyFrom(AndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExpression_passContext extends AndExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpression_passContext(AndExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndExpression_Context extends AndExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(mygrammarParser.And, 0); }
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpression_Context(AndExpressionContext ctx) { copyFrom(ctx); }
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(453);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpression_Context(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(455);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(456);
					match(And);
					setState(457);
					equalityExpression(0);
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	 
		public ExclusiveOrExpressionContext() { }
		public void copyFrom(ExclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExclusiveOrExpression_Context extends ExclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(mygrammarParser.Caret, 0); }
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpression_Context(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExclusiveOrExpression_passContext extends ExclusiveOrExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpression_passContext(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExclusiveOrExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(464);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpression_Context(new ExclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(466);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(467);
					match(Caret);
					setState(468);
					andExpression(0);
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	 
		public InclusiveOrExpressionContext() { }
		public void copyFrom(InclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InclusiveOrExpression_passContext extends InclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpression_passContext(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InclusiveOrExpression_Context extends InclusiveOrExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(mygrammarParser.Or, 0); }
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpression_Context(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new InclusiveOrExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(475);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpression_Context(new InclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(477);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(478);
					match(Or);
					setState(479);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(mygrammarParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(mygrammarParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(mygrammarParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(mygrammarParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(mygrammarParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(mygrammarParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(mygrammarParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(mygrammarParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(mygrammarParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(mygrammarParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(mygrammarParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Assign - 65)) | (1L << (StarAssign - 65)) | (1L << (DivAssign - 65)) | (1L << (ModAssign - 65)) | (1L << (PlusAssign - 65)) | (1L << (MinusAssign - 65)) | (1L << (LeftShiftAssign - 65)) | (1L << (RightShiftAssign - 65)) | (1L << (AndAssign - 65)) | (1L << (XorAssign - 65)) | (1L << (OrAssign - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(mygrammarParser.And, 0); }
		public TerminalNode Star() { return getToken(mygrammarParser.Star, 0); }
		public TerminalNode Plus() { return getToken(mygrammarParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(mygrammarParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(mygrammarParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(mygrammarParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TokenIdContext tokenId() {
			return getRuleContext(TokenIdContext.class,0);
		}
		public TokenConstantContext tokenConstant() {
			return getRuleContext(TokenConstantContext.class,0);
		}
		public TokenStringLiteralContext tokenStringLiteral() {
			return getRuleContext(TokenStringLiteralContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primaryExpression);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				tokenId();
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				tokenConstant();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
				tokenStringLiteral();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				match(LeftParen);
				setState(493);
				expression(0);
				setState(494);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public TokenIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenId; }
	}

	public final TokenIdContext tokenId() throws RecognitionException {
		TokenIdContext _localctx = new TokenIdContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tokenId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenConstantContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(mygrammarParser.Constant, 0); }
		public TokenConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenConstant; }
	}

	public final TokenConstantContext tokenConstant() throws RecognitionException {
		TokenConstantContext _localctx = new TokenConstantContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tokenConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(Constant);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(mygrammarParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(mygrammarParser.StringLiteral, i);
		}
		public TokenStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenStringLiteral; }
	}

	public final TokenStringLiteralContext tokenStringLiteral() throws RecognitionException {
		TokenStringLiteralContext _localctx = new TokenStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tokenStringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(502);
					match(StringLiteral);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(505); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCall_Context extends FunctionCallContext {
		public TokenIdContext tokenId() {
			return getRuleContext(TokenIdContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public FunctionCall_Context(FunctionCallContext ctx) { copyFrom(ctx); }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionCall);
		int _la;
		try {
			_localctx = new FunctionCall_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			tokenId();
			setState(508);
			match(LeftParen);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (LeftParen - 35)) | (1L << (Plus - 35)) | (1L << (PlusPlus - 35)) | (1L << (Minus - 35)) | (1L << (MinusMinus - 35)) | (1L << (Star - 35)) | (1L << (And - 35)) | (1L << (AndAnd - 35)) | (1L << (Not - 35)) | (1L << (Tilde - 35)) | (1L << (Identifier - 35)) | (1L << (Constant - 35)) | (1L << (StringLiteral - 35)))) != 0)) {
				{
				setState(509);
				argumentExpressionList(0);
				}
			}

			setState(512);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(515);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(517);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(518);
					match(Comma);
					setState(519);
					assignmentExpression();
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 24:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 27:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 28:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 30:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 31:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 32:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 33:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 34:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 35:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 36:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 37:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 45:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 4);
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u0210\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\5\2`\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\5\4k\n\4\3\5\3\5\3\5\5\5p\n\5\3\6\6\6s\n\6\r\6\16\6t\3\6\6\6x\n\6\r"+
		"\6\16\6y\3\6\3\6\5\6~\n\6\3\6\3\6\3\6\3\7\6\7\u0084\n\7\r\7\16\7\u0085"+
		"\3\b\3\b\5\b\u008a\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0094\n\t\f"+
		"\t\16\t\u0097\13\t\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\13\3\13\3\f\3\f"+
		"\3\f\5\f\u00a5\n\f\3\f\5\f\u00a8\n\f\3\f\3\f\3\f\5\f\u00ad\n\f\5\f\u00af"+
		"\n\f\3\f\3\f\5\f\u00b3\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20\u00bc"+
		"\n\20\r\20\16\20\u00bd\3\21\3\21\5\21\u00c2\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u00c9\n\22\3\23\3\23\5\23\u00cd\n\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00e2\n\24\3\24\3\24\5\24\u00e6\n\24\3\24\3\24\5\24\u00ea\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f2\n\24\3\24\3\24\5\24\u00f6\n\24"+
		"\3\24\3\24\3\24\5\24\u00fb\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0103"+
		"\n\25\3\25\5\25\u0106\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u010f"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0117\n\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u0122\n\30\f\30\16\30\u0125\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0131\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u013e\n\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u014b\n\32\f\32\16"+
		"\32\u014e\13\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0156\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u015e\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u0166\n\35\f\35\16\35\u0169\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36"+
		"\u0171\n\36\f\36\16\36\u0174\13\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \7 \u0184\n \f \16 \u0187\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!"+
		"\u0192\n!\f!\16!\u0195\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01a0"+
		"\n\"\f\"\16\"\u01a3\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\7#\u01b4\n#\f#\16#\u01b7\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u01c2\n$\f"+
		"$\16$\u01c5\13$\3%\3%\3%\3%\3%\3%\7%\u01cd\n%\f%\16%\u01d0\13%\3&\3&\3"+
		"&\3&\3&\3&\7&\u01d8\n&\f&\16&\u01db\13&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01e3"+
		"\n\'\f\'\16\'\u01e6\13\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\5*\u01f3\n*"+
		"\3+\3+\3,\3,\3-\6-\u01fa\n-\r-\16-\u01fb\3.\3.\3.\5.\u0201\n.\3.\3.\3"+
		"/\3/\3/\3/\3/\3/\7/\u020b\n/\f/\16/\u020e\13/\3/\2\20\20.\628:>@BDFHJ"+
		"L\\\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\\2\7\7\2\6\6\13\13\17\17\24\24\"\"\4\2\25\25\31\31\4"+
		"\2\32\32!!\3\2CM\7\2\61\61\63\63\65\6588=>\2\u022d\2_\3\2\2\2\4c\3\2\2"+
		"\2\6j\3\2\2\2\bo\3\2\2\2\nr\3\2\2\2\f\u0083\3\2\2\2\16\u0087\3\2\2\2\20"+
		"\u008d\3\2\2\2\22\u009d\3\2\2\2\24\u009f\3\2\2\2\26\u00b2\3\2\2\2\30\u00b4"+
		"\3\2\2\2\32\u00b6\3\2\2\2\34\u00b8\3\2\2\2\36\u00bb\3\2\2\2 \u00c1\3\2"+
		"\2\2\"\u00c8\3\2\2\2$\u00ca\3\2\2\2&\u00fa\3\2\2\2(\u0105\3\2\2\2*\u0116"+
		"\3\2\2\2,\u0118\3\2\2\2.\u011b\3\2\2\2\60\u0130\3\2\2\2\62\u0132\3\2\2"+
		"\2\64\u0155\3\2\2\2\66\u0157\3\2\2\28\u015f\3\2\2\2:\u016a\3\2\2\2<\u0175"+
		"\3\2\2\2>\u0177\3\2\2\2@\u0188\3\2\2\2B\u0196\3\2\2\2D\u01a4\3\2\2\2F"+
		"\u01b8\3\2\2\2H\u01c6\3\2\2\2J\u01d1\3\2\2\2L\u01dc\3\2\2\2N\u01e7\3\2"+
		"\2\2P\u01e9\3\2\2\2R\u01f2\3\2\2\2T\u01f4\3\2\2\2V\u01f6\3\2\2\2X\u01f9"+
		"\3\2\2\2Z\u01fd\3\2\2\2\\\u0204\3\2\2\2^`\5\4\3\2_^\3\2\2\2_`\3\2\2\2"+
		"`a\3\2\2\2ab\7\2\2\3b\3\3\2\2\2cd\5\b\5\2de\5\6\4\2e\5\3\2\2\2fg\5\b\5"+
		"\2gh\5\6\4\2hk\3\2\2\2ik\3\2\2\2jf\3\2\2\2ji\3\2\2\2k\7\3\2\2\2lp\5\n"+
		"\6\2mp\5\16\b\2np\7A\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\t\3\2\2\2qs\5"+
		"\26\f\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\7S\2\2wv\3"+
		"\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\7%\2\2|~\5\f\7\2}|\3"+
		"\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7&\2\2\u0080\u0081\5$\23\2\u0081"+
		"\13\3\2\2\2\u0082\u0084\5\16\b\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\r\3\2\2\2\u0087\u0089"+
		"\5\26\f\2\u0088\u008a\5\20\t\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008c\7A\2\2\u008c\17\3\2\2\2\u008d\u008e\b"+
		"\t\1\2\u008e\u008f\5\22\n\2\u008f\u0095\3\2\2\2\u0090\u0091\f\3\2\2\u0091"+
		"\u0092\7B\2\2\u0092\u0094\5\22\n\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\21\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009e\5\24\13\2\u0099\u009a\5\24\13\2\u009a\u009b\7C\2"+
		"\2\u009b\u009c\5\64\33\2\u009c\u009e\3\2\2\2\u009d\u0098\3\2\2\2\u009d"+
		"\u0099\3\2\2\2\u009e\23\3\2\2\2\u009f\u00a0\7S\2\2\u00a0\25\3\2\2\2\u00a1"+
		"\u00b3\5\30\r\2\u00a2\u00a4\5\32\16\2\u00a3\u00a5\5\32\16\2\u00a4\u00a3"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\5\30\r\2"+
		"\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b3\3\2\2\2\u00a9\u00ae"+
		"\5\34\17\2\u00aa\u00ac\5\32\16\2\u00ab\u00ad\5\32\16\2\u00ac\u00ab\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b3\3"+
		"\2\2\2\u00b2\u00a1\3\2\2\2\u00b2\u00a2\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b3"+
		"\27\3\2\2\2\u00b4\u00b5\t\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7"+
		"\33\3\2\2\2\u00b8\u00b9\t\4\2\2\u00b9\35\3\2\2\2\u00ba\u00bc\5 \21\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\37\3\2\2\2\u00bf\u00c2\5\16\b\2\u00c0\u00c2\5\"\22\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2!\3\2\2\2\u00c3\u00c9\5$\23\2"+
		"\u00c4\u00c9\5,\27\2\u00c5\u00c9\5&\24\2\u00c6\u00c9\5(\25\2\u00c7\u00c9"+
		"\5*\26\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9#\3\2\2\2\u00ca\u00cc\7)\2\2\u00cb"+
		"\u00cd\5\36\20\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00cf\7*\2\2\u00cf%\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1\u00d2"+
		"\7%\2\2\u00d2\u00d3\5.\30\2\u00d3\u00d4\7&\2\2\u00d4\u00d5\5\"\22\2\u00d5"+
		"\u00fb\3\2\2\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\5\"\22\2\u00d8\u00d9\7"+
		"$\2\2\u00d9\u00da\7%\2\2\u00da\u00db\5.\30\2\u00db\u00dc\7&\2\2\u00dc"+
		"\u00dd\7A\2\2\u00dd\u00fb\3\2\2\2\u00de\u00df\7\20\2\2\u00df\u00e1\7%"+
		"\2\2\u00e0\u00e2\5.\30\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e5\7A\2\2\u00e4\u00e6\5.\30\2\u00e5\u00e4\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7A\2\2\u00e8"+
		"\u00ea\5.\30\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\7&\2\2\u00ec\u00fb\5\"\22\2\u00ed\u00ee\7\20\2\2\u00ee"+
		"\u00ef\7%\2\2\u00ef\u00f1\5\16\b\2\u00f0\u00f2\5.\30\2\u00f1\u00f0\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\7A\2\2\u00f4"+
		"\u00f6\5.\30\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\7&\2\2\u00f8\u00f9\5\"\22\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00d0\3\2\2\2\u00fa\u00d6\3\2\2\2\u00fa\u00de\3\2\2\2\u00fa\u00ed\3\2"+
		"\2\2\u00fb\'\3\2\2\2\u00fc\u00fd\7\b\2\2\u00fd\u0106\7A\2\2\u00fe\u00ff"+
		"\7\4\2\2\u00ff\u0106\7A\2\2\u0100\u0102\7\30\2\2\u0101\u0103\5.\30\2\u0102"+
		"\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\7A"+
		"\2\2\u0105\u00fc\3\2\2\2\u0105\u00fe\3\2\2\2\u0105\u0100\3\2\2\2\u0106"+
		")\3\2\2\2\u0107\u0108\7\22\2\2\u0108\u0109\7%\2\2\u0109\u010a\5.\30\2"+
		"\u010a\u010b\7&\2\2\u010b\u010e\5\"\22\2\u010c\u010d\7\f\2\2\u010d\u010f"+
		"\5\"\22\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0117\3\2\2\2"+
		"\u0110\u0111\7\36\2\2\u0111\u0112\7%\2\2\u0112\u0113\5.\30\2\u0113\u0114"+
		"\7&\2\2\u0114\u0115\5\"\22\2\u0115\u0117\3\2\2\2\u0116\u0107\3\2\2\2\u0116"+
		"\u0110\3\2\2\2\u0117+\3\2\2\2\u0118\u0119\5.\30\2\u0119\u011a\7A\2\2\u011a"+
		"-\3\2\2\2\u011b\u011c\b\30\1\2\u011c\u011d\5\64\33\2\u011d\u0123\3\2\2"+
		"\2\u011e\u011f\f\3\2\2\u011f\u0120\7B\2\2\u0120\u0122\5\64\33\2\u0121"+
		"\u011e\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124/\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0131\5\62\32\2\u0127\u0128"+
		"\7\62\2\2\u0128\u0131\5\60\31\2\u0129\u012a\7\64\2\2\u012a\u0131\5\60"+
		"\31\2\u012b\u012c\5P)\2\u012c\u012d\5<\37\2\u012d\u0131\3\2\2\2\u012e"+
		"\u012f\7:\2\2\u012f\u0131\7S\2\2\u0130\u0126\3\2\2\2\u0130\u0127\3\2\2"+
		"\2\u0130\u0129\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012e\3\2\2\2\u0131\61"+
		"\3\2\2\2\u0132\u0133\b\32\1\2\u0133\u0134\5R*\2\u0134\u014c\3\2\2\2\u0135"+
		"\u0136\f\b\2\2\u0136\u0137\7\'\2\2\u0137\u0138\5.\30\2\u0138\u0139\7("+
		"\2\2\u0139\u014b\3\2\2\2\u013a\u013b\f\7\2\2\u013b\u013d\7%\2\2\u013c"+
		"\u013e\5\\/\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u014b\7&\2\2\u0140\u0141\f\6\2\2\u0141\u0142\7Q\2\2\u0142\u014b"+
		"\7S\2\2\u0143\u0144\f\5\2\2\u0144\u0145\7P\2\2\u0145\u014b\7S\2\2\u0146"+
		"\u0147\f\4\2\2\u0147\u014b\7\62\2\2\u0148\u0149\f\3\2\2\u0149\u014b\7"+
		"\64\2\2\u014a\u0135\3\2\2\2\u014a\u013a\3\2\2\2\u014a\u0140\3\2\2\2\u014a"+
		"\u0143\3\2\2\2\u014a\u0146\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\63\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0150\5\60\31\2\u0150\u0151\5N(\2\u0151\u0152\5\64\33\2"+
		"\u0152\u0156\3\2\2\2\u0153\u0156\5Z.\2\u0154\u0156\5\66\34\2\u0155\u014f"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\65\3\2\2\2\u0157"+
		"\u015d\58\35\2\u0158\u0159\7?\2\2\u0159\u015a\5.\30\2\u015a\u015b\7@\2"+
		"\2\u015b\u015c\5\66\34\2\u015c\u015e\3\2\2\2\u015d\u0158\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\67\3\2\2\2\u015f\u0160\b\35\1\2\u0160\u0161\5:\36"+
		"\2\u0161\u0167\3\2\2\2\u0162\u0163\f\3\2\2\u0163\u0164\7;\2\2\u0164\u0166"+
		"\5:\36\2\u0165\u0162\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u01689\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\b\36\1\2"+
		"\u016b\u016c\5L\'\2\u016c\u0172\3\2\2\2\u016d\u016e\f\3\2\2\u016e\u016f"+
		"\7:\2\2\u016f\u0171\5L\'\2\u0170\u016d\3\2\2\2\u0171\u0174\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173;\3\2\2\2\u0174\u0172\3\2\2\2"+
		"\u0175\u0176\5\60\31\2\u0176=\3\2\2\2\u0177\u0178\b \1\2\u0178\u0179\5"+
		"<\37\2\u0179\u0185\3\2\2\2\u017a\u017b\f\5\2\2\u017b\u017c\7\65\2\2\u017c"+
		"\u0184\5<\37\2\u017d\u017e\f\4\2\2\u017e\u017f\7\66\2\2\u017f\u0184\5"+
		"<\37\2\u0180\u0181\f\3\2\2\u0181\u0182\7\67\2\2\u0182\u0184\5<\37\2\u0183"+
		"\u017a\3\2\2\2\u0183\u017d\3\2\2\2\u0183\u0180\3\2\2\2\u0184\u0187\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186?\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0188\u0189\b!\1\2\u0189\u018a\5> \2\u018a\u0193\3\2\2\2\u018b"+
		"\u018c\f\4\2\2\u018c\u018d\7\61\2\2\u018d\u0192\5> \2\u018e\u018f\f\3"+
		"\2\2\u018f\u0190\7\63\2\2\u0190\u0192\5> \2\u0191\u018b\3\2\2\2\u0191"+
		"\u018e\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194A\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\b\"\1\2\u0197\u0198"+
		"\5@!\2\u0198\u01a1\3\2\2\2\u0199\u019a\f\4\2\2\u019a\u019b\7/\2\2\u019b"+
		"\u01a0\5@!\2\u019c\u019d\f\3\2\2\u019d\u019e\7\60\2\2\u019e\u01a0\5@!"+
		"\2\u019f\u0199\3\2\2\2\u019f\u019c\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2C\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a5\b#\1\2\u01a5\u01a6\5B\"\2\u01a6\u01b5\3\2\2\2\u01a7\u01a8\f\6\2"+
		"\2\u01a8\u01a9\7+\2\2\u01a9\u01b4\5B\"\2\u01aa\u01ab\f\5\2\2\u01ab\u01ac"+
		"\7-\2\2\u01ac\u01b4\5B\"\2\u01ad\u01ae\f\4\2\2\u01ae\u01af\7,\2\2\u01af"+
		"\u01b4\5B\"\2\u01b0\u01b1\f\3\2\2\u01b1\u01b2\7.\2\2\u01b2\u01b4\5B\""+
		"\2\u01b3\u01a7\3\2\2\2\u01b3\u01aa\3\2\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01b0"+
		"\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"E\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\b$\1\2\u01b9\u01ba\5D#\2\u01ba"+
		"\u01c3\3\2\2\2\u01bb\u01bc\f\4\2\2\u01bc\u01bd\7N\2\2\u01bd\u01c2\5D#"+
		"\2\u01be\u01bf\f\3\2\2\u01bf\u01c0\7O\2\2\u01c0\u01c2\5D#\2\u01c1\u01bb"+
		"\3\2\2\2\u01c1\u01be\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4G\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\b%\1\2\u01c7"+
		"\u01c8\5F$\2\u01c8\u01ce\3\2\2\2\u01c9\u01ca\f\3\2\2\u01ca\u01cb\78\2"+
		"\2\u01cb\u01cd\5F$\2\u01cc\u01c9\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cfI\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1"+
		"\u01d2\b&\1\2\u01d2\u01d3\5H%\2\u01d3\u01d9\3\2\2\2\u01d4\u01d5\f\3\2"+
		"\2\u01d5\u01d6\7<\2\2\u01d6\u01d8\5H%\2\u01d7\u01d4\3\2\2\2\u01d8\u01db"+
		"\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01daK\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01dc\u01dd\b\'\1\2\u01dd\u01de\5J&\2\u01de\u01e4\3\2\2"+
		"\2\u01df\u01e0\f\3\2\2\u01e0\u01e1\79\2\2\u01e1\u01e3\5J&\2\u01e2\u01df"+
		"\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"M\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\t\5\2\2\u01e8O\3\2\2\2\u01e9"+
		"\u01ea\t\6\2\2\u01eaQ\3\2\2\2\u01eb\u01f3\5T+\2\u01ec\u01f3\5V,\2\u01ed"+
		"\u01f3\5X-\2\u01ee\u01ef\7%\2\2\u01ef\u01f0\5.\30\2\u01f0\u01f1\7&\2\2"+
		"\u01f1\u01f3\3\2\2\2\u01f2\u01eb\3\2\2\2\u01f2\u01ec\3\2\2\2\u01f2\u01ed"+
		"\3\2\2\2\u01f2\u01ee\3\2\2\2\u01f3S\3\2\2\2\u01f4\u01f5\7S\2\2\u01f5U"+
		"\3\2\2\2\u01f6\u01f7\7T\2\2\u01f7W\3\2\2\2\u01f8\u01fa\7U\2\2\u01f9\u01f8"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"Y\3\2\2\2\u01fd\u01fe\5T+\2\u01fe\u0200\7%\2\2\u01ff\u0201\5\\/\2\u0200"+
		"\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\7&"+
		"\2\2\u0203[\3\2\2\2\u0204\u0205\b/\1\2\u0205\u0206\5\64\33\2\u0206\u020c"+
		"\3\2\2\2\u0207\u0208\f\3\2\2\u0208\u0209\7B\2\2\u0209\u020b\5\64\33\2"+
		"\u020a\u0207\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d]\3\2\2\2\u020e\u020c\3\2\2\29_joty}\u0085\u0089\u0095\u009d"+
		"\u00a4\u00a7\u00ac\u00ae\u00b2\u00bd\u00c1\u00c8\u00cc\u00e1\u00e5\u00e9"+
		"\u00f1\u00f5\u00fa\u0102\u0105\u010e\u0116\u0123\u0130\u013d\u014a\u014c"+
		"\u0155\u015d\u0167\u0172\u0183\u0185\u0191\u0193\u019f\u01a1\u01b3\u01b5"+
		"\u01c1\u01c3\u01ce\u01d9\u01e4\u01f2\u01fb\u0200\u020c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}