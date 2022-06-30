// Generated from d:\Documents\Compilers_Principles\lab4\parse\MyCGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyCGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Auto=11, Break=12, Case=13, Char=14, Const=15, Continue=16, Default=17, 
		Do=18, Double=19, Else=20, Enum=21, Extern=22, Float=23, For=24, Goto=25, 
		If=26, Inline=27, Int=28, Long=29, Register=30, Restrict=31, Return=32, 
		Short=33, Signed=34, Sizeof=35, Static=36, Struct=37, Switch=38, Typedef=39, 
		Union=40, Unsigned=41, Void=42, Volatile=43, While=44, Alignas=45, Alignof=46, 
		Atomic=47, Bool=48, Complex=49, Generic=50, Imaginary=51, Noreturn=52, 
		StaticAssert=53, ThreadLocal=54, LeftParen=55, RightParen=56, LeftBracket=57, 
		RightBracket=58, LeftBrace=59, RightBrace=60, Less=61, LessEqual=62, Greater=63, 
		GreaterEqual=64, LeftShift=65, RightShift=66, Plus=67, PlusPlus=68, Minus=69, 
		MinusMinus=70, Star=71, Div=72, Mod=73, And=74, Or=75, AndAnd=76, OrOr=77, 
		Caret=78, Not=79, Tilde=80, Question=81, Colon=82, Semi=83, Comma=84, 
		Assign=85, StarAssign=86, DivAssign=87, ModAssign=88, PlusAssign=89, MinusAssign=90, 
		LeftShiftAssign=91, RightShiftAssign=92, AndAssign=93, XorAssign=94, OrAssign=95, 
		Equal=96, NotEqual=97, Arrow=98, Dot=99, Ellipsis=100, Identifier=101, 
		Constant=102, StringLiteral=103, ComplexDefine=104, AsmBlock=105, LineAfterPreprocessing=106, 
		LineDirective=107, PragmaDirective=108, Whitespace=109, Newline=110, BlockComment=111, 
		LineComment=112;
	public static final int
		RULE_primaryExpression = 0, RULE_tokenId = 1, RULE_tokenConstant = 2, 
		RULE_tokenStringLiteral = 3, RULE_genericSelection = 4, RULE_genericAssocList = 5, 
		RULE_genericAssociation = 6, RULE_statement = 7, RULE_labeledStatement = 8, 
		RULE_compoundStatement = 9, RULE_blockItemList = 10, RULE_blockItem = 11, 
		RULE_expressionStatement = 12, RULE_selectionStatement = 13, RULE_iterationStatement = 14, 
		RULE_jumpStatement = 15, RULE_postfixExpression = 16, RULE_argumentExpressionList = 17, 
		RULE_unaryExpression = 18, RULE_unaryOperator = 19, RULE_castExpression = 20, 
		RULE_multiplicativeExpression = 21, RULE_additiveExpression = 22, RULE_shiftExpression = 23, 
		RULE_relationalExpression = 24, RULE_equalityExpression = 25, RULE_andExpression = 26, 
		RULE_exclusiveOrExpression = 27, RULE_inclusiveOrExpression = 28, RULE_logicalAndExpression = 29, 
		RULE_logicalOrExpression = 30, RULE_conditionalExpression = 31, RULE_assignmentExpression = 32, 
		RULE_assignmentOperator = 33, RULE_expression = 34, RULE_constantExpression = 35, 
		RULE_declaration = 36, RULE_declarationSpecifiers = 37, RULE_declarationSpecifiers2 = 38, 
		RULE_declarationSpecifier = 39, RULE_initDeclaratorList = 40, RULE_initDeclarator = 41, 
		RULE_storageClassSpecifier = 42, RULE_typeSpecifier = 43, RULE_structOrUnionSpecifier = 44, 
		RULE_structOrUnion = 45, RULE_structDeclarationList = 46, RULE_structDeclaration = 47, 
		RULE_specifierQualifierList = 48, RULE_structDeclaratorList = 49, RULE_structDeclarator = 50, 
		RULE_enumSpecifier = 51, RULE_enumeratorList = 52, RULE_enumerator = 53, 
		RULE_enumerationConstant = 54, RULE_atomicTypeSpecifier = 55, RULE_typeQualifier = 56, 
		RULE_functionSpecifier = 57, RULE_alignmentSpecifier = 58, RULE_declarator = 59, 
		RULE_directDeclarator = 60, RULE_gccDeclaratorExtension = 61, RULE_gccAttributeSpecifier = 62, 
		RULE_gccAttributeList = 63, RULE_gccAttribute = 64, RULE_nestedParenthesesBlock = 65, 
		RULE_pointer = 66, RULE_typeQualifierList = 67, RULE_parameterTypeList = 68, 
		RULE_parameterList = 69, RULE_parameterDeclaration = 70, RULE_identifierList = 71, 
		RULE_typeName = 72, RULE_abstractDeclarator = 73, RULE_directAbstractDeclarator = 74, 
		RULE_initializer = 75, RULE_initializerList = 76, RULE_designation = 77, 
		RULE_designatorList = 78, RULE_designator = 79, RULE_staticAssertDeclaration = 80, 
		RULE_compilationUnit = 81, RULE_translationUnit = 82, RULE_externalDeclaration = 83, 
		RULE_functionDefinition = 84, RULE_declarationList = 85, RULE_functionCall = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "tokenId", "tokenConstant", "tokenStringLiteral", 
			"genericSelection", "genericAssocList", "genericAssociation", "statement", 
			"labeledStatement", "compoundStatement", "blockItemList", "blockItem", 
			"expressionStatement", "selectionStatement", "iterationStatement", "jumpStatement", 
			"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator", 
			"castExpression", "multiplicativeExpression", "additiveExpression", "shiftExpression", 
			"relationalExpression", "equalityExpression", "andExpression", "exclusiveOrExpression", 
			"inclusiveOrExpression", "logicalAndExpression", "logicalOrExpression", 
			"conditionalExpression", "assignmentExpression", "assignmentOperator", 
			"expression", "constantExpression", "declaration", "declarationSpecifiers", 
			"declarationSpecifiers2", "declarationSpecifier", "initDeclaratorList", 
			"initDeclarator", "storageClassSpecifier", "typeSpecifier", "structOrUnionSpecifier", 
			"structOrUnion", "structDeclarationList", "structDeclaration", "specifierQualifierList", 
			"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
			"enumerator", "enumerationConstant", "atomicTypeSpecifier", "typeQualifier", 
			"functionSpecifier", "alignmentSpecifier", "declarator", "directDeclarator", 
			"gccDeclaratorExtension", "gccAttributeSpecifier", "gccAttributeList", 
			"gccAttribute", "nestedParenthesesBlock", "pointer", "typeQualifierList", 
			"parameterTypeList", "parameterList", "parameterDeclaration", "identifierList", 
			"typeName", "abstractDeclarator", "directAbstractDeclarator", "initializer", 
			"initializerList", "designation", "designatorList", "designator", "staticAssertDeclaration", 
			"compilationUnit", "translationUnit", "externalDeclaration", "functionDefinition", 
			"declarationList", "functionCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
			"'__asm'", "'__asm__'", "'__volatile__'", "'__inline__'", "'__stdcall'", 
			"'__declspec'", "'__attribute__'", "'auto'", "'break'", "'case'", "'char'", 
			"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
			"'extern'", "'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", 
			"'long'", "'register'", "'restrict'", "'return'", "'short'", "'signed'", 
			"'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", "'union'", 
			"'unsigned'", "'void'", "'volatile'", "'while'", "'_Alignas'", "'_Alignof'", 
			"'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'", 
			"'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", 
			"'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", 
			"'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", 
			"'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "Auto", 
			"Break", "Case", "Char", "Const", "Continue", "Default", "Do", "Double", 
			"Else", "Enum", "Extern", "Float", "For", "Goto", "If", "Inline", "Int", 
			"Long", "Register", "Restrict", "Return", "Short", "Signed", "Sizeof", 
			"Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", "Void", 
			"Volatile", "While", "Alignas", "Alignof", "Atomic", "Bool", "Complex", 
			"Generic", "Imaginary", "Noreturn", "StaticAssert", "ThreadLocal", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
			"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
			"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", "Colon", 
			"Semi", "Comma", "Assign", "StarAssign", "DivAssign", "ModAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", 
			"OrAssign", "Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", "Identifier", 
			"Constant", "StringLiteral", "ComplexDefine", "AsmBlock", "LineAfterPreprocessing", 
			"LineDirective", "PragmaDirective", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
	public String getGrammarFileName() { return "MyCGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyCGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				tokenId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				tokenConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				tokenStringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(LeftParen);
				setState(178);
				expression(0);
				setState(179);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				genericSelection();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(182);
					match(T__0);
					}
				}

				setState(185);
				match(LeftParen);
				setState(186);
				compoundStatement();
				setState(187);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				match(T__1);
				setState(190);
				match(LeftParen);
				setState(191);
				unaryExpression();
				setState(192);
				match(Comma);
				setState(193);
				typeName();
				setState(194);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(196);
				match(T__2);
				setState(197);
				match(LeftParen);
				setState(198);
				typeName();
				setState(199);
				match(Comma);
				setState(200);
				unaryExpression();
				setState(201);
				match(RightParen);
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

	public static class TokenIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public TokenIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenId; }
	}

	public final TokenIdContext tokenId() throws RecognitionException {
		TokenIdContext _localctx = new TokenIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tokenId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		public TerminalNode Constant() { return getToken(MyCGrammarParser.Constant, 0); }
		public TokenConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenConstant; }
	}

	public final TokenConstantContext tokenConstant() throws RecognitionException {
		TokenConstantContext _localctx = new TokenConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tokenConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		public List<TerminalNode> StringLiteral() { return getTokens(MyCGrammarParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(MyCGrammarParser.StringLiteral, i);
		}
		public TokenStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenStringLiteral; }
	}

	public final TokenStringLiteralContext tokenStringLiteral() throws RecognitionException {
		TokenStringLiteralContext _localctx = new TokenStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tokenStringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(209);
					match(StringLiteral);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(212); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class GenericSelectionContext extends ParserRuleContext {
		public TerminalNode Generic() { return getToken(MyCGrammarParser.Generic, 0); }
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(Generic);
			setState(215);
			match(LeftParen);
			setState(216);
			assignmentExpression();
			setState(217);
			match(Comma);
			setState(218);
			genericAssocList(0);
			setState(219);
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

	public static class GenericAssocListContext extends ParserRuleContext {
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		return genericAssocList(0);
	}

	private GenericAssocListContext genericAssocList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, _parentState);
		GenericAssocListContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_genericAssocList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(222);
			genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GenericAssocListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_genericAssocList);
					setState(224);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(225);
					match(Comma);
					setState(226);
					genericAssociation();
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class GenericAssociationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(MyCGrammarParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(MyCGrammarParser.Default, 0); }
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_genericAssociation);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Const:
			case Double:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				typeName();
				setState(233);
				match(Colon);
				setState(234);
				assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(Default);
				setState(237);
				match(Colon);
				setState(238);
				assignmentExpression();
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
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public TerminalNode Volatile() { return getToken(MyCGrammarParser.Volatile, 0); }
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(MyCGrammarParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(MyCGrammarParser.Colon, i);
		}
		public List<TerminalNode> Comma() { return getTokens(MyCGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MyCGrammarParser.Comma, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				match(LeftParen);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(250);
					logicalOrExpression(0);
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(251);
						match(Comma);
						setState(252);
						logicalOrExpression(0);
						}
						}
						setState(257);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(260);
					match(Colon);
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
						{
						setState(261);
						logicalOrExpression(0);
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(262);
							match(Comma);
							setState(263);
							logicalOrExpression(0);
							}
							}
							setState(268);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(RightParen);
				setState(277);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(MyCGrammarParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(MyCGrammarParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(MyCGrammarParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_labeledStatement);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(Identifier);
				setState(281);
				match(Colon);
				setState(282);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(Case);
				setState(284);
				constantExpression();
				setState(285);
				match(Colon);
				setState(286);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(Default);
				setState(289);
				match(Colon);
				setState(290);
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(MyCGrammarParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MyCGrammarParser.RightBrace, 0); }
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
		enterRule(_localctx, 18, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(LeftBrace);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Switch) | (1L << Typedef) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Semi - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
				{
				setState(294);
				blockItemList(0);
				}
			}

			setState(297);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(300);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(302);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(303);
					blockItem();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 22, RULE_blockItem);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Typedef:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				declaration();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case Break:
			case Case:
			case Continue:
			case Default:
			case Do:
			case For:
			case Goto:
			case If:
			case Return:
			case Sizeof:
			case Switch:
			case While:
			case Alignof:
			case Generic:
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
			case Semi:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
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
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
				{
				setState(313);
				expression(0);
				}
			}

			setState(316);
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
		public TerminalNode If() { return getToken(MyCGrammarParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(MyCGrammarParser.Else, 0); }
		public SelectionStatement_ifContext(SelectionStatementContext ctx) { copyFrom(ctx); }
	}
	public static class SelectionStatement_switchContext extends SelectionStatementContext {
		public TerminalNode Switch() { return getToken(MyCGrammarParser.Switch, 0); }
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SelectionStatement_switchContext(SelectionStatementContext ctx) { copyFrom(ctx); }
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectionStatement);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				_localctx = new SelectionStatement_ifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(If);
				setState(319);
				match(LeftParen);
				setState(320);
				expression(0);
				setState(321);
				match(RightParen);
				setState(322);
				statement();
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(323);
					match(Else);
					setState(324);
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
				setState(327);
				match(Switch);
				setState(328);
				match(LeftParen);
				setState(329);
				expression(0);
				setState(330);
				match(RightParen);
				setState(331);
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
		public TerminalNode Do() { return getToken(MyCGrammarParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(MyCGrammarParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public IterationStatement_dowhileContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class IterationStatement_forDeclaredContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(MyCGrammarParser.For, 0); }
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
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
		public TerminalNode While() { return getToken(MyCGrammarParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IterationStatement_whileContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class IterationStatement_forContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(MyCGrammarParser.For, 0); }
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public List<TerminalNode> Semi() { return getTokens(MyCGrammarParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MyCGrammarParser.Semi, i);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
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
		enterRule(_localctx, 28, RULE_iterationStatement);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new IterationStatement_whileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(While);
				setState(336);
				match(LeftParen);
				setState(337);
				expression(0);
				setState(338);
				match(RightParen);
				setState(339);
				statement();
				}
				break;
			case 2:
				_localctx = new IterationStatement_dowhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(Do);
				setState(342);
				statement();
				setState(343);
				match(While);
				setState(344);
				match(LeftParen);
				setState(345);
				expression(0);
				setState(346);
				match(RightParen);
				setState(347);
				match(Semi);
				}
				break;
			case 3:
				_localctx = new IterationStatement_forContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(For);
				setState(350);
				match(LeftParen);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(351);
					expression(0);
					}
				}

				setState(354);
				match(Semi);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(355);
					expression(0);
					}
				}

				setState(358);
				match(Semi);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(359);
					expression(0);
					}
				}

				setState(362);
				match(RightParen);
				setState(363);
				statement();
				}
				break;
			case 4:
				_localctx = new IterationStatement_forDeclaredContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(For);
				setState(365);
				match(LeftParen);
				setState(366);
				declaration();
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(367);
					expression(0);
					}
				}

				setState(370);
				match(Semi);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(371);
					expression(0);
					}
				}

				setState(374);
				match(RightParen);
				setState(375);
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
		public TerminalNode Return() { return getToken(MyCGrammarParser.Return, 0); }
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatement_returnContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class JumpStatement_continueContext extends JumpStatementContext {
		public TerminalNode Continue() { return getToken(MyCGrammarParser.Continue, 0); }
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public JumpStatement_continueContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class JumpStatement_Context extends JumpStatementContext {
		public TerminalNode Goto() { return getToken(MyCGrammarParser.Goto, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public JumpStatement_Context(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class JumpStatement_gotoContext extends JumpStatementContext {
		public TerminalNode Goto() { return getToken(MyCGrammarParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public JumpStatement_gotoContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class JumpStatement_breakContext extends JumpStatementContext {
		public TerminalNode Break() { return getToken(MyCGrammarParser.Break, 0); }
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public JumpStatement_breakContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jumpStatement);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new JumpStatement_gotoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(Goto);
				setState(380);
				match(Identifier);
				setState(381);
				match(Semi);
				}
				break;
			case 2:
				_localctx = new JumpStatement_continueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(Continue);
				setState(383);
				match(Semi);
				}
				break;
			case 3:
				_localctx = new JumpStatement_breakContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(Break);
				setState(385);
				match(Semi);
				}
				break;
			case 4:
				_localctx = new JumpStatement_returnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				match(Return);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(387);
					expression(0);
					}
				}

				setState(390);
				match(Semi);
				}
				break;
			case 5:
				_localctx = new JumpStatement_Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				match(Goto);
				setState(392);
				unaryExpression();
				setState(393);
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
		public TerminalNode LeftBracket() { return getToken(MyCGrammarParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MyCGrammarParser.RightBracket, 0); }
		public PostfixExpression_arrayaccessContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_pointContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(MyCGrammarParser.Arrow, 0); }
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public PostfixExpression_pointContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_funcallContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public PostfixExpression_funcallContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_passContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(MyCGrammarParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MyCGrammarParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public PostfixExpression_passContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_memberContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(MyCGrammarParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public PostfixExpression_memberContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(MyCGrammarParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(MyCGrammarParser.MinusMinus, 0); }
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new PostfixExpression_passContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(398);
				primaryExpression();
				}
				break;
			case 2:
				{
				_localctx = new PostfixExpression_passContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(399);
				match(LeftParen);
				setState(400);
				typeName();
				setState(401);
				match(RightParen);
				setState(402);
				match(LeftBrace);
				setState(403);
				initializerList(0);
				setState(404);
				match(RightBrace);
				}
				break;
			case 3:
				{
				_localctx = new PostfixExpression_passContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				match(LeftParen);
				setState(407);
				typeName();
				setState(408);
				match(RightParen);
				setState(409);
				match(LeftBrace);
				setState(410);
				initializerList(0);
				setState(411);
				match(Comma);
				setState(412);
				match(RightBrace);
				}
				break;
			case 4:
				{
				_localctx = new PostfixExpression_passContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(414);
				match(T__0);
				setState(415);
				match(LeftParen);
				setState(416);
				typeName();
				setState(417);
				match(RightParen);
				setState(418);
				match(LeftBrace);
				setState(419);
				initializerList(0);
				setState(420);
				match(RightBrace);
				}
				break;
			case 5:
				{
				_localctx = new PostfixExpression_passContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(422);
				match(T__0);
				setState(423);
				match(LeftParen);
				setState(424);
				typeName();
				setState(425);
				match(RightParen);
				setState(426);
				match(LeftBrace);
				setState(427);
				initializerList(0);
				setState(428);
				match(Comma);
				setState(429);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(454);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpression_arrayaccessContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(433);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(434);
						match(LeftBracket);
						setState(435);
						expression(0);
						setState(436);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpression_funcallContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(438);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(439);
						match(LeftParen);
						setState(441);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
							{
							setState(440);
							argumentExpressionList(0);
							}
						}

						setState(443);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpression_memberContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(444);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(445);
						match(Dot);
						setState(446);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpression_pointContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(447);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(448);
						match(Arrow);
						setState(449);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpression_Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(450);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(451);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpression_Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(452);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(453);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(458);
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

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(460);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(462);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(463);
					match(Comma);
					setState(464);
					assignmentExpression();
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public TerminalNode PlusPlus() { return getToken(MyCGrammarParser.PlusPlus, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(MyCGrammarParser.MinusMinus, 0); }
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
		public TerminalNode Sizeof() { return getToken(MyCGrammarParser.Sizeof, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public TerminalNode Alignof() { return getToken(MyCGrammarParser.Alignof, 0); }
		public TerminalNode AndAnd() { return getToken(MyCGrammarParser.AndAnd, 0); }
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public UnaryExpression_passContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unaryExpression);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new UnaryExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				postfixExpression(0);
				}
				break;
			case 2:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(PlusPlus);
				setState(472);
				unaryExpression();
				}
				break;
			case 3:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				match(MinusMinus);
				setState(474);
				unaryExpression();
				}
				break;
			case 4:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				unaryOperator();
				setState(476);
				castExpression();
				}
				break;
			case 5:
				_localctx = new UnaryExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(478);
				match(Sizeof);
				setState(479);
				unaryExpression();
				}
				break;
			case 6:
				_localctx = new UnaryExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(480);
				match(Sizeof);
				setState(481);
				match(LeftParen);
				setState(482);
				typeName();
				setState(483);
				match(RightParen);
				}
				break;
			case 7:
				_localctx = new UnaryExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(485);
				match(Alignof);
				setState(486);
				match(LeftParen);
				setState(487);
				typeName();
				setState(488);
				match(RightParen);
				}
				break;
			case 8:
				_localctx = new UnaryExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(490);
				match(AndAnd);
				setState(491);
				match(Identifier);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(MyCGrammarParser.And, 0); }
		public TerminalNode Star() { return getToken(MyCGrammarParser.Star, 0); }
		public TerminalNode Plus() { return getToken(MyCGrammarParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(MyCGrammarParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(MyCGrammarParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(MyCGrammarParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)))) != 0)) ) {
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
	public static class CastExpression_Context extends CastExpressionContext {
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CastExpression_Context(CastExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CastExpression_passContext extends CastExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpression_passContext(CastExpressionContext ctx) { copyFrom(ctx); }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_castExpression);
		try {
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new CastExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				unaryExpression();
				}
				break;
			case 2:
				_localctx = new CastExpression_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(LeftParen);
				setState(498);
				typeName();
				setState(499);
				match(RightParen);
				setState(500);
				castExpression();
				}
				break;
			case 3:
				_localctx = new CastExpression_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				match(T__0);
				setState(503);
				match(LeftParen);
				setState(504);
				typeName();
				setState(505);
				match(RightParen);
				setState(506);
				castExpression();
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
		public TerminalNode Star() { return getToken(MyCGrammarParser.Star, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Div() { return getToken(MyCGrammarParser.Div, 0); }
		public TerminalNode Mod() { return getToken(MyCGrammarParser.Mod, 0); }
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultiplicativeExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(511);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(522);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpression_Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(513);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(514);
						match(Star);
						setState(515);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpression_Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(516);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(517);
						match(Div);
						setState(518);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpression_Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(519);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(520);
						match(Mod);
						setState(521);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public TerminalNode Plus() { return getToken(MyCGrammarParser.Plus, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Minus() { return getToken(MyCGrammarParser.Minus, 0); }
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(528);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(536);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpression_Context(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(530);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(531);
						match(Plus);
						setState(532);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpression_Context(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(533);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(534);
						match(Minus);
						setState(535);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(540);
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
		public TerminalNode LeftShift() { return getToken(MyCGrammarParser.LeftShift, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode RightShift() { return getToken(MyCGrammarParser.RightShift, 0); }
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ShiftExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(542);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(550);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpression_Context(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(544);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(545);
						match(LeftShift);
						setState(546);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpression_Context(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(547);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(548);
						match(RightShift);
						setState(549);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		public TerminalNode Less() { return getToken(MyCGrammarParser.Less, 0); }
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode Greater() { return getToken(MyCGrammarParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(MyCGrammarParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(MyCGrammarParser.GreaterEqual, 0); }
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationalExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(556);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(570);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(558);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(559);
						match(Less);
						setState(560);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(561);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(562);
						match(Greater);
						setState(563);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(564);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(565);
						match(LessEqual);
						setState(566);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(567);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(568);
						match(GreaterEqual);
						setState(569);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		public TerminalNode Equal() { return getToken(MyCGrammarParser.Equal, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode NotEqual() { return getToken(MyCGrammarParser.NotEqual, 0); }
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqualityExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(576);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(584);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpression_Context(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(578);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(579);
						match(Equal);
						setState(580);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpression_Context(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(581);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(582);
						match(NotEqual);
						setState(583);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public TerminalNode And() { return getToken(MyCGrammarParser.And, 0); }
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(590);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpression_Context(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(592);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(593);
					match(And);
					setState(594);
					equalityExpression(0);
					}
					} 
				}
				setState(599);
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
		public TerminalNode Caret() { return getToken(MyCGrammarParser.Caret, 0); }
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExclusiveOrExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(601);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpression_Context(new ExclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(603);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(604);
					match(Caret);
					setState(605);
					andExpression(0);
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public TerminalNode Or() { return getToken(MyCGrammarParser.Or, 0); }
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new InclusiveOrExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(612);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpression_Context(new InclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(614);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(615);
					match(Or);
					setState(616);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(621);
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
		public TerminalNode AndAnd() { return getToken(MyCGrammarParser.AndAnd, 0); }
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalAndExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(623);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpression_Context(new LogicalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(625);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(626);
					match(AndAnd);
					setState(627);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		public TerminalNode OrOr() { return getToken(MyCGrammarParser.OrOr, 0); }
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalOrExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(634);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpression_Context(new LogicalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(636);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(637);
					match(OrOr);
					setState(638);
					logicalAndExpression(0);
					}
					} 
				}
				setState(643);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(MyCGrammarParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(MyCGrammarParser.Colon, 0); }
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
		enterRule(_localctx, 62, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			logicalOrExpression(0);
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(645);
				match(Question);
				setState(646);
				expression(0);
				setState(647);
				match(Colon);
				setState(648);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	 
		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentExpression_passContext extends AssignmentExpressionContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentExpression_passContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentExpression_Context extends AssignmentExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpression_Context(AssignmentExpressionContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignmentExpression);
		try {
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new AssignmentExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				conditionalExpression();
				}
				break;
			case 2:
				_localctx = new AssignmentExpression_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				unaryExpression();
				setState(654);
				assignmentOperator();
				setState(655);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(MyCGrammarParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(MyCGrammarParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(MyCGrammarParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(MyCGrammarParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(MyCGrammarParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(MyCGrammarParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(MyCGrammarParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(MyCGrammarParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(MyCGrammarParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(MyCGrammarParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(MyCGrammarParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (Assign - 85)) | (1L << (StarAssign - 85)) | (1L << (DivAssign - 85)) | (1L << (ModAssign - 85)) | (1L << (PlusAssign - 85)) | (1L << (MinusAssign - 85)) | (1L << (LeftShiftAssign - 85)) | (1L << (RightShiftAssign - 85)) | (1L << (AndAssign - 85)) | (1L << (XorAssign - 85)) | (1L << (OrAssign - 85)))) != 0)) ) {
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
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Expression_Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(662);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_passContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(664);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(665);
					match(Comma);
					setState(666);
					assignmentExpression();
					}
					} 
				}
				setState(671);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			conditionalExpression();
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
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declaration);
		int _la;
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Typedef:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Noreturn:
			case ThreadLocal:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				declarationSpecifiers();
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (LeftParen - 55)) | (1L << (Star - 55)) | (1L << (Caret - 55)) | (1L << (Identifier - 55)))) != 0)) {
					{
					setState(675);
					initDeclaratorList(0);
					}
				}

				setState(678);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				staticAssertDeclaration();
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

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declarationSpecifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(683);
				declarationSpecifier();
				}
				}
				setState(686); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Typedef) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) );
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

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(689); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(688);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(691); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declarationSpecifier);
		try {
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Extern:
			case Register:
			case Static:
			case Typedef:
			case ThreadLocal:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				storageClassSpecifier();
				}
				break;
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				typeSpecifier();
				}
				break;
			case Const:
			case Restrict:
			case Volatile:
			case Atomic:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				typeQualifier();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 4);
				{
				setState(696);
				functionSpecifier();
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 5);
				{
				setState(697);
				alignmentSpecifier();
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(701);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(703);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(704);
					match(Comma);
					setState(705);
					initDeclarator();
					}
					} 
				}
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		public TerminalNode Assign() { return getToken(MyCGrammarParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_initDeclarator);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				declarator();
				setState(713);
				match(Assign);
				setState(714);
				initializer();
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(MyCGrammarParser.Typedef, 0); }
		public TerminalNode Extern() { return getToken(MyCGrammarParser.Extern, 0); }
		public TerminalNode Static() { return getToken(MyCGrammarParser.Static, 0); }
		public TerminalNode ThreadLocal() { return getToken(MyCGrammarParser.ThreadLocal, 0); }
		public TerminalNode Auto() { return getToken(MyCGrammarParser.Auto, 0); }
		public TerminalNode Register() { return getToken(MyCGrammarParser.Register, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef) | (1L << ThreadLocal))) != 0)) ) {
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	 
		public TypeSpecifierContext() { }
		public void copyFrom(TypeSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeSpecifier_Context extends TypeSpecifierContext {
		public TerminalNode Void() { return getToken(MyCGrammarParser.Void, 0); }
		public TerminalNode Char() { return getToken(MyCGrammarParser.Char, 0); }
		public TerminalNode Short() { return getToken(MyCGrammarParser.Short, 0); }
		public TerminalNode Int() { return getToken(MyCGrammarParser.Int, 0); }
		public TerminalNode Long() { return getToken(MyCGrammarParser.Long, 0); }
		public TerminalNode Float() { return getToken(MyCGrammarParser.Float, 0); }
		public TerminalNode Double() { return getToken(MyCGrammarParser.Double, 0); }
		public TerminalNode Signed() { return getToken(MyCGrammarParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(MyCGrammarParser.Unsigned, 0); }
		public TypeSpecifier_Context(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeSpecifier);
		try {
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				_localctx = new TypeSpecifier_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				match(Void);
				}
				break;
			case Char:
				_localctx = new TypeSpecifier_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(Char);
				}
				break;
			case Short:
				_localctx = new TypeSpecifier_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				match(Short);
				}
				break;
			case Int:
				_localctx = new TypeSpecifier_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(723);
				match(Int);
				}
				break;
			case Long:
				_localctx = new TypeSpecifier_Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(724);
				match(Long);
				}
				break;
			case Float:
				_localctx = new TypeSpecifier_Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(725);
				match(Float);
				}
				break;
			case Double:
				_localctx = new TypeSpecifier_Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(726);
				match(Double);
				}
				break;
			case Signed:
				_localctx = new TypeSpecifier_Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(727);
				match(Signed);
				}
				break;
			case Unsigned:
				_localctx = new TypeSpecifier_Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(728);
				match(Unsigned);
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

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(MyCGrammarParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MyCGrammarParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				structOrUnion();
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(732);
					match(Identifier);
					}
				}

				setState(735);
				match(LeftBrace);
				setState(736);
				structDeclarationList(0);
				setState(737);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				structOrUnion();
				setState(740);
				match(Identifier);
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

	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(MyCGrammarParser.Struct, 0); }
		public TerminalNode Union() { return getToken(MyCGrammarParser.Union, 0); }
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
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

	public static class StructDeclarationListContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		return structDeclarationList(0);
	}

	private StructDeclarationListContext structDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, _parentState);
		StructDeclarationListContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(747);
			structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(749);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(750);
					structDeclaration();
					}
					} 
				}
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_structDeclaration);
		int _la;
		try {
			setState(763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Const:
			case Double:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				specifierQualifierList();
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (LeftParen - 55)) | (1L << (Star - 55)) | (1L << (Caret - 55)) | (1L << (Colon - 55)) | (1L << (Identifier - 55)))) != 0)) {
					{
					setState(757);
					structDeclaratorList(0);
					}
				}

				setState(760);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				staticAssertDeclaration();
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

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_specifierQualifierList);
		int _la;
		try {
			setState(773);
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
				setState(765);
				typeSpecifier();
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Const) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(766);
					specifierQualifierList();
					}
				}

				}
				break;
			case Const:
			case Restrict:
			case Volatile:
			case Atomic:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				typeQualifier();
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Const) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(770);
					specifierQualifierList();
					}
				}

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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		return structDeclaratorList(0);
	}

	private StructDeclaratorListContext structDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, _parentState);
		StructDeclaratorListContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(776);
			structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(778);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(779);
					match(Comma);
					setState(780);
					structDeclarator();
					}
					} 
				}
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(MyCGrammarParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_structDeclarator);
		int _la;
		try {
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (LeftParen - 55)) | (1L << (Star - 55)) | (1L << (Caret - 55)) | (1L << (Identifier - 55)))) != 0)) {
					{
					setState(787);
					declarator();
					}
				}

				setState(790);
				match(Colon);
				setState(791);
				constantExpression();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(MyCGrammarParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(MyCGrammarParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MyCGrammarParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_enumSpecifier);
		int _la;
		try {
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				match(Enum);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(795);
					match(Identifier);
					}
				}

				setState(798);
				match(LeftBrace);
				setState(799);
				enumeratorList(0);
				setState(800);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(Enum);
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(803);
					match(Identifier);
					}
				}

				setState(806);
				match(LeftBrace);
				setState(807);
				enumeratorList(0);
				setState(808);
				match(Comma);
				setState(809);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(811);
				match(Enum);
				setState(812);
				match(Identifier);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		return enumeratorList(0);
	}

	private EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(816);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(818);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(819);
					match(Comma);
					setState(820);
					enumerator();
					}
					} 
				}
				setState(825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MyCGrammarParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_enumerator);
		try {
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				enumerationConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				enumerationConstant();
				setState(828);
				match(Assign);
				setState(829);
				constantExpression();
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

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
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

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Atomic() { return getToken(MyCGrammarParser.Atomic, 0); }
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(Atomic);
			setState(836);
			match(LeftParen);
			setState(837);
			typeName();
			setState(838);
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(MyCGrammarParser.Const, 0); }
		public TerminalNode Restrict() { return getToken(MyCGrammarParser.Restrict, 0); }
		public TerminalNode Volatile() { return getToken(MyCGrammarParser.Volatile, 0); }
		public TerminalNode Atomic() { return getToken(MyCGrammarParser.Atomic, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
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

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(MyCGrammarParser.Inline, 0); }
		public TerminalNode Noreturn() { return getToken(MyCGrammarParser.Noreturn, 0); }
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_functionSpecifier);
		int _la;
		try {
			setState(848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				gccAttributeSpecifier();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				match(T__8);
				setState(845);
				match(LeftParen);
				setState(846);
				match(Identifier);
				setState(847);
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

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(MyCGrammarParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_alignmentSpecifier);
		try {
			setState(860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				match(Alignas);
				setState(851);
				match(LeftParen);
				setState(852);
				typeName();
				setState(853);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				match(Alignas);
				setState(856);
				match(LeftParen);
				setState(857);
				constantExpression();
				setState(858);
				match(RightParen);
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
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(862);
				pointer();
				}
			}

			setState(865);
			directDeclarator(0);
			setState(869);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(866);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
	 
		public DirectDeclaratorContext() { }
		public void copyFrom(DirectDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DirectDeclarator_arrayContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(MyCGrammarParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MyCGrammarParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(MyCGrammarParser.Static, 0); }
		public TerminalNode Star() { return getToken(MyCGrammarParser.Star, 0); }
		public DirectDeclarator_arrayContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class DirectDeclarator_passContext extends DirectDeclaratorContext {
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public DirectDeclarator_passContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class DirectDeclarator_funcContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclarator_funcContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				_localctx = new DirectDeclarator_passContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(873);
				match(Identifier);
				}
				break;
			case LeftParen:
				{
				_localctx = new DirectDeclarator_passContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(874);
				match(LeftParen);
				setState(875);
				declarator();
				setState(876);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(923);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclarator_arrayContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(880);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(881);
						match(LeftBracket);
						setState(883);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(882);
							typeQualifierList(0);
							}
						}

						setState(886);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
							{
							setState(885);
							assignmentExpression();
							}
						}

						setState(888);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclarator_arrayContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(889);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(890);
						match(LeftBracket);
						setState(891);
						match(Static);
						setState(893);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(892);
							typeQualifierList(0);
							}
						}

						setState(895);
						assignmentExpression();
						setState(896);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclarator_arrayContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(898);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(899);
						match(LeftBracket);
						setState(900);
						typeQualifierList(0);
						setState(901);
						match(Static);
						setState(902);
						assignmentExpression();
						setState(903);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclarator_arrayContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(905);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(906);
						match(LeftBracket);
						setState(908);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(907);
							typeQualifierList(0);
							}
						}

						setState(910);
						match(Star);
						setState(911);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclarator_funcContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(912);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(913);
						match(LeftParen);
						setState(914);
						parameterTypeList();
						setState(915);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclarator_funcContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(917);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(918);
						match(LeftParen);
						setState(920);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(919);
							identifierList(0);
							}
						}

						setState(922);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(MyCGrammarParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(MyCGrammarParser.StringLiteral, i);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				match(T__3);
				setState(929);
				match(LeftParen);
				setState(931); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(930);
					match(StringLiteral);
					}
					}
					setState(933); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(935);
				match(RightParen);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				gccAttributeSpecifier();
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

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(MyCGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(MyCGrammarParser.LeftParen, i);
		}
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(MyCGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(MyCGrammarParser.RightParen, i);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(T__9);
			setState(940);
			match(LeftParen);
			setState(941);
			match(LeftParen);
			setState(942);
			gccAttributeList();
			setState(943);
			match(RightParen);
			setState(944);
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

	public static class GccAttributeListContext extends ParserRuleContext {
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MyCGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MyCGrammarParser.Comma, i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_gccAttributeList);
		int _la;
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				gccAttribute();
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(947);
					match(Comma);
					setState(948);
					gccAttribute();
					}
					}
					setState(953);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class GccAttributeContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(MyCGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(MyCGrammarParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(MyCGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(MyCGrammarParser.RightParen, i);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_gccAttribute);
		int _la;
		try {
			setState(966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case Auto:
			case Break:
			case Case:
			case Char:
			case Const:
			case Continue:
			case Default:
			case Do:
			case Double:
			case Else:
			case Enum:
			case Extern:
			case Float:
			case For:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Struct:
			case Switch:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case While:
			case Alignas:
			case Alignof:
			case Atomic:
			case Bool:
			case Complex:
			case Generic:
			case Imaginary:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftBracket:
			case RightBracket:
			case LeftBrace:
			case RightBrace:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Not:
			case Tilde:
			case Question:
			case Colon:
			case Semi:
			case Assign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
			case Arrow:
			case Dot:
			case Ellipsis:
			case Identifier:
			case Constant:
			case StringLiteral:
			case ComplexDefine:
			case AsmBlock:
			case LineAfterPreprocessing:
			case LineDirective:
			case PragmaDirective:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (LeftParen - 55)) | (1L << (RightParen - 55)) | (1L << (Comma - 55)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(958);
					match(LeftParen);
					setState(960);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
						{
						setState(959);
						argumentExpressionList(0);
						}
					}

					setState(962);
					match(RightParen);
					}
				}

				}
				break;
			case RightParen:
			case Comma:
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

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(MyCGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(MyCGrammarParser.LeftParen, i);
		}
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public List<TerminalNode> RightParen() { return getTokens(MyCGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(MyCGrammarParser.RightParen, i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Less) | (1L << LessEqual) | (1L << Greater))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(973);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Constant:
				case StringLiteral:
				case ComplexDefine:
				case AsmBlock:
				case LineAfterPreprocessing:
				case LineDirective:
				case PragmaDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(968);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(969);
					match(LeftParen);
					setState(970);
					nestedParenthesesBlock();
					setState(971);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PointerContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(MyCGrammarParser.Star, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TerminalNode Caret() { return getToken(MyCGrammarParser.Caret, 0); }
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_pointer);
		int _la;
		try {
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				match(Star);
				setState(980);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(979);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				match(Star);
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(983);
					typeQualifierList(0);
					}
				}

				setState(986);
				pointer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(987);
				match(Caret);
				setState(989);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(988);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(991);
				match(Caret);
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(992);
					typeQualifierList(0);
					}
				}

				setState(995);
				pointer();
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

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(999);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(1001);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1002);
					typeQualifier();
					}
					} 
				}
				setState(1007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(MyCGrammarParser.Ellipsis, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_parameterTypeList);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1008);
				parameterList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1009);
				parameterList(0);
				setState(1010);
				match(Comma);
				setState(1011);
				match(Ellipsis);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1016);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(1018);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1019);
					match(Comma);
					setState(1020);
					parameterDeclaration();
					}
					} 
				}
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_parameterDeclaration);
		try {
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026);
				declarationSpecifiers();
				setState(1027);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				declarationSpecifiers2();
				setState(1031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1030);
					abstractDeclarator();
					}
					break;
				}
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

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1036);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(1043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(1038);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1039);
					match(Comma);
					setState(1040);
					match(Identifier);
					}
					} 
				}
				setState(1045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			specifierQualifierList();
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (LeftParen - 55)) | (1L << (LeftBracket - 55)) | (1L << (Star - 55)) | (1L << (Caret - 55)))) != 0)) {
				{
				setState(1047);
				abstractDeclarator();
				}
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

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_abstractDeclarator);
		int _la;
		try {
			int _alt;
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(1051);
					pointer();
					}
				}

				setState(1054);
				directAbstractDeclarator(0);
				setState(1058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1055);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1060);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
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

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public TerminalNode LeftBracket() { return getToken(MyCGrammarParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MyCGrammarParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(MyCGrammarParser.Static, 0); }
		public TerminalNode Star() { return getToken(MyCGrammarParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1064);
				match(LeftParen);
				setState(1065);
				abstractDeclarator();
				setState(1066);
				match(RightParen);
				setState(1070);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1067);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1072);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1073);
				match(LeftBracket);
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(1074);
					typeQualifierList(0);
					}
				}

				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(1077);
					assignmentExpression();
					}
				}

				setState(1080);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(1081);
				match(LeftBracket);
				setState(1082);
				match(Static);
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(1083);
					typeQualifierList(0);
					}
				}

				setState(1086);
				assignmentExpression();
				setState(1087);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(1089);
				match(LeftBracket);
				setState(1090);
				typeQualifierList(0);
				setState(1091);
				match(Static);
				setState(1092);
				assignmentExpression();
				setState(1093);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(1095);
				match(LeftBracket);
				setState(1096);
				match(Star);
				setState(1097);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(1098);
				match(LeftParen);
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Typedef) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << ThreadLocal))) != 0)) {
					{
					setState(1099);
					parameterTypeList();
					}
				}

				setState(1102);
				match(RightParen);
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1103);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1111);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1112);
						match(LeftBracket);
						setState(1114);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1113);
							typeQualifierList(0);
							}
						}

						setState(1117);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
							{
							setState(1116);
							assignmentExpression();
							}
						}

						setState(1119);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1120);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1121);
						match(LeftBracket);
						setState(1122);
						match(Static);
						setState(1124);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1123);
							typeQualifierList(0);
							}
						}

						setState(1126);
						assignmentExpression();
						setState(1127);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1130);
						match(LeftBracket);
						setState(1131);
						typeQualifierList(0);
						setState(1132);
						match(Static);
						setState(1133);
						assignmentExpression();
						setState(1134);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1136);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1137);
						match(LeftBracket);
						setState(1138);
						match(Star);
						setState(1139);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1140);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1141);
						match(LeftParen);
						setState(1143);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Typedef) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << ThreadLocal))) != 0)) {
							{
							setState(1142);
							parameterTypeList();
							}
						}

						setState(1145);
						match(RightParen);
						setState(1149);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1146);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(1151);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(1156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(MyCGrammarParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MyCGrammarParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_initializer);
		try {
			setState(1167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1157);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				match(LeftBrace);
				setState(1159);
				initializerList(0);
				setState(1160);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1162);
				match(LeftBrace);
				setState(1163);
				initializerList(0);
				setState(1164);
				match(Comma);
				setState(1165);
				match(RightBrace);
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

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(1170);
				designation();
				}
			}

			setState(1173);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(1183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(1175);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1176);
					match(Comma);
					setState(1178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(1177);
						designation();
						}
					}

					setState(1180);
					initializer();
					}
					} 
				}
				setState(1185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MyCGrammarParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			designatorList(0);
			setState(1187);
			match(Assign);
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

	public static class DesignatorListContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		return designatorList(0);
	}

	private DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1190);
			designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(1192);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1193);
					designator();
					}
					} 
				}
				setState(1198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(MyCGrammarParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MyCGrammarParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(MyCGrammarParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(MyCGrammarParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_designator);
		try {
			setState(1205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1199);
				match(LeftBracket);
				setState(1200);
				constantExpression();
				setState(1201);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1203);
				match(Dot);
				setState(1204);
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

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode StaticAssert() { return getToken(MyCGrammarParser.StaticAssert, 0); }
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MyCGrammarParser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(MyCGrammarParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(MyCGrammarParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(StaticAssert);
			setState(1208);
			match(LeftParen);
			setState(1209);
			constantExpression();
			setState(1210);
			match(Comma);
			setState(1212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1211);
				match(StringLiteral);
				}
				}
				setState(1214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1216);
			match(RightParen);
			setState(1217);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyCGrammarParser.EOF, 0); }
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
		enterRule(_localctx, 162, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Typedef) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Star - 71)) | (1L << (Caret - 71)) | (1L << (Semi - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(1219);
				translationUnit(0);
				}
			}

			setState(1222);
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
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1225);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(1227);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1228);
					externalDeclaration();
					}
					} 
				}
				setState(1233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
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

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MyCGrammarParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_externalDeclaration);
		try {
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1236);
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
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
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
		enterRule(_localctx, 168, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Typedef) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << ThreadLocal))) != 0)) {
				{
				setState(1239);
				declarationSpecifiers();
				}
			}

			setState(1242);
			declarator();
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Typedef) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0)) {
				{
				setState(1243);
				declarationList(0);
				}
			}

			setState(1246);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1249);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1251);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1252);
					declaration();
					}
					} 
				}
				setState(1257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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
		public TerminalNode LeftParen() { return getToken(MyCGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MyCGrammarParser.RightParen, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public FunctionCall_Context(FunctionCallContext ctx) { copyFrom(ctx); }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_functionCall);
		int _la;
		try {
			_localctx = new FunctionCall_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			tokenId();
			setState(1259);
			match(LeftParen);
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
				{
				setState(1260);
				argumentExpressionList(0);
				}
			}

			setState(1263);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);
		case 10:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 16:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 17:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 21:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 22:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 23:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 24:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 25:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 26:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 27:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 28:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 29:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 30:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 40:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 46:
			return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);
		case 49:
			return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);
		case 52:
			return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);
		case 60:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 67:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 69:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 71:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 74:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		case 76:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 78:
			return designatorList_sempred((DesignatorListContext)_localctx, predIndex);
		case 82:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 85:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean genericAssocList_sempred(GenericAssocListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 4);
		case 17:
			return precpred(_ctx, 3);
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 6);
		case 33:
			return precpred(_ctx, 5);
		case 34:
			return precpred(_ctx, 4);
		case 35:
			return precpred(_ctx, 3);
		case 36:
			return precpred(_ctx, 2);
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 5);
		case 42:
			return precpred(_ctx, 4);
		case 43:
			return precpred(_ctx, 3);
		case 44:
			return precpred(_ctx, 2);
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3r\u04f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00ba"+
		"\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2\u00ce\n\2\3\3\3\3\3\4\3\4\3\5\6\5\u00d5\n\5\r\5\16\5\u00d6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00e6\n\7\f\7"+
		"\16\7\u00e9\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f2\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0100\n\t\f\t\16\t\u0103\13\t"+
		"\5\t\u0105\n\t\3\t\3\t\3\t\3\t\7\t\u010b\n\t\f\t\16\t\u010e\13\t\5\t\u0110"+
		"\n\t\7\t\u0112\n\t\f\t\16\t\u0115\13\t\3\t\3\t\5\t\u0119\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0126\n\n\3\13\3\13\5\13\u012a"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u0133\n\f\f\f\16\f\u0136\13\f"+
		"\3\r\3\r\5\r\u013a\n\r\3\16\5\16\u013d\n\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0148\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0150\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0163\n\20\3\20\3\20\5\20\u0167\n\20\3"+
		"\20\3\20\5\20\u016b\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0173\n\20"+
		"\3\20\3\20\5\20\u0177\n\20\3\20\3\20\3\20\5\20\u017c\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0187\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u018e\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01b2\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01bc\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01c9\n\22\f\22\16\22\u01cc\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01d4\n\23\f\23\16\23\u01d7\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01ef\n\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01ff"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u020d\n\27\f\27\16\27\u0210\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u021b\n\30\f\30\16\30\u021e\13\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u0229\n\31\f\31\16\31\u022c\13\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u023d\n\32\f\32\16\32\u0240\13\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u024b\n\33\f\33\16\33\u024e\13\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\7\34\u0256\n\34\f\34\16\34\u0259\13\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u0261\n\35\f\35\16\35\u0264\13\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u026c\n\36\f\36\16\36\u026f\13\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u0277\n\37\f\37\16\37\u027a\13\37\3 \3 \3 \3 \3 "+
		"\3 \7 \u0282\n \f \16 \u0285\13 \3!\3!\3!\3!\3!\3!\5!\u028d\n!\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u0294\n\"\3#\3#\3$\3$\3$\3$\3$\3$\7$\u029e\n$\f$\16$"+
		"\u02a1\13$\3%\3%\3&\3&\5&\u02a7\n&\3&\3&\3&\5&\u02ac\n&\3\'\6\'\u02af"+
		"\n\'\r\'\16\'\u02b0\3(\6(\u02b4\n(\r(\16(\u02b5\3)\3)\3)\3)\3)\5)\u02bd"+
		"\n)\3*\3*\3*\3*\3*\3*\7*\u02c5\n*\f*\16*\u02c8\13*\3+\3+\3+\3+\3+\5+\u02cf"+
		"\n+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u02dc\n-\3.\3.\5.\u02e0\n.\3."+
		"\3.\3.\3.\3.\3.\3.\5.\u02e9\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\7\60\u02f2"+
		"\n\60\f\60\16\60\u02f5\13\60\3\61\3\61\5\61\u02f9\n\61\3\61\3\61\3\61"+
		"\5\61\u02fe\n\61\3\62\3\62\5\62\u0302\n\62\3\62\3\62\5\62\u0306\n\62\5"+
		"\62\u0308\n\62\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0310\n\63\f\63\16\63"+
		"\u0313\13\63\3\64\3\64\5\64\u0317\n\64\3\64\3\64\5\64\u031b\n\64\3\65"+
		"\3\65\5\65\u031f\n\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0327\n\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0330\n\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\7\66\u0338\n\66\f\66\16\66\u033b\13\66\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u0342\n\67\38\38\39\39\39\39\39\3:\3:\3;\3;\3;\3;\3;\3;\5;"+
		"\u0353\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u035f\n<\3=\5=\u0362\n=\3="+
		"\3=\7=\u0366\n=\f=\16=\u0369\13=\3>\3>\3>\3>\3>\3>\5>\u0371\n>\3>\3>\3"+
		">\5>\u0376\n>\3>\5>\u0379\n>\3>\3>\3>\3>\3>\5>\u0380\n>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\5>\u038f\n>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5"+
		">\u039b\n>\3>\7>\u039e\n>\f>\16>\u03a1\13>\3?\3?\3?\6?\u03a6\n?\r?\16"+
		"?\u03a7\3?\3?\5?\u03ac\n?\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\7A\u03b8\nA\f"+
		"A\16A\u03bb\13A\3A\5A\u03be\nA\3B\3B\3B\5B\u03c3\nB\3B\5B\u03c6\nB\3B"+
		"\5B\u03c9\nB\3C\3C\3C\3C\3C\7C\u03d0\nC\fC\16C\u03d3\13C\3D\3D\5D\u03d7"+
		"\nD\3D\3D\5D\u03db\nD\3D\3D\3D\5D\u03e0\nD\3D\3D\5D\u03e4\nD\3D\5D\u03e7"+
		"\nD\3E\3E\3E\3E\3E\7E\u03ee\nE\fE\16E\u03f1\13E\3F\3F\3F\3F\3F\5F\u03f8"+
		"\nF\3G\3G\3G\3G\3G\3G\7G\u0400\nG\fG\16G\u0403\13G\3H\3H\3H\3H\3H\5H\u040a"+
		"\nH\5H\u040c\nH\3I\3I\3I\3I\3I\3I\7I\u0414\nI\fI\16I\u0417\13I\3J\3J\5"+
		"J\u041b\nJ\3K\3K\5K\u041f\nK\3K\3K\7K\u0423\nK\fK\16K\u0426\13K\5K\u0428"+
		"\nK\3L\3L\3L\3L\3L\7L\u042f\nL\fL\16L\u0432\13L\3L\3L\5L\u0436\nL\3L\5"+
		"L\u0439\nL\3L\3L\3L\3L\5L\u043f\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\5L\u044f\nL\3L\3L\7L\u0453\nL\fL\16L\u0456\13L\5L\u0458\nL\3L"+
		"\3L\3L\5L\u045d\nL\3L\5L\u0460\nL\3L\3L\3L\3L\3L\5L\u0467\nL\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u047a\nL\3L\3L\7L\u047e"+
		"\nL\fL\16L\u0481\13L\7L\u0483\nL\fL\16L\u0486\13L\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\5M\u0492\nM\3N\3N\5N\u0496\nN\3N\3N\3N\3N\3N\5N\u049d\nN\3"+
		"N\7N\u04a0\nN\fN\16N\u04a3\13N\3O\3O\3O\3P\3P\3P\3P\3P\7P\u04ad\nP\fP"+
		"\16P\u04b0\13P\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u04b8\nQ\3R\3R\3R\3R\3R\6R\u04bf\n"+
		"R\rR\16R\u04c0\3R\3R\3R\3S\5S\u04c7\nS\3S\3S\3T\3T\3T\3T\3T\7T\u04d0\n"+
		"T\fT\16T\u04d3\13T\3U\3U\3U\5U\u04d8\nU\3V\5V\u04db\nV\3V\3V\5V\u04df"+
		"\nV\3V\3V\3W\3W\3W\3W\3W\7W\u04e8\nW\fW\16W\u04eb\13W\3X\3X\3X\5X\u04f0"+
		"\nX\3X\3X\3X\2\36\f\26\"$,.\60\62\64\668:<>FR^djz\u0088\u008c\u0090\u0096"+
		"\u009a\u009e\u00a6\u00acY\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\2\f\3\2\6\7\4\2"+
		"\b\b--\7\2EEGGIILLQR\3\2Wa\b\2\r\r\30\30  &&))88\4\2\'\'**\6\2\21\21!"+
		"!--\61\61\5\2\t\n\35\35\66\66\4\29:VV\3\29:\2\u0564\2\u00cd\3\2\2\2\4"+
		"\u00cf\3\2\2\2\6\u00d1\3\2\2\2\b\u00d4\3\2\2\2\n\u00d8\3\2\2\2\f\u00df"+
		"\3\2\2\2\16\u00f1\3\2\2\2\20\u0118\3\2\2\2\22\u0125\3\2\2\2\24\u0127\3"+
		"\2\2\2\26\u012d\3\2\2\2\30\u0139\3\2\2\2\32\u013c\3\2\2\2\34\u014f\3\2"+
		"\2\2\36\u017b\3\2\2\2 \u018d\3\2\2\2\"\u01b1\3\2\2\2$\u01cd\3\2\2\2&\u01ee"+
		"\3\2\2\2(\u01f0\3\2\2\2*\u01fe\3\2\2\2,\u0200\3\2\2\2.\u0211\3\2\2\2\60"+
		"\u021f\3\2\2\2\62\u022d\3\2\2\2\64\u0241\3\2\2\2\66\u024f\3\2\2\28\u025a"+
		"\3\2\2\2:\u0265\3\2\2\2<\u0270\3\2\2\2>\u027b\3\2\2\2@\u0286\3\2\2\2B"+
		"\u0293\3\2\2\2D\u0295\3\2\2\2F\u0297\3\2\2\2H\u02a2\3\2\2\2J\u02ab\3\2"+
		"\2\2L\u02ae\3\2\2\2N\u02b3\3\2\2\2P\u02bc\3\2\2\2R\u02be\3\2\2\2T\u02ce"+
		"\3\2\2\2V\u02d0\3\2\2\2X\u02db\3\2\2\2Z\u02e8\3\2\2\2\\\u02ea\3\2\2\2"+
		"^\u02ec\3\2\2\2`\u02fd\3\2\2\2b\u0307\3\2\2\2d\u0309\3\2\2\2f\u031a\3"+
		"\2\2\2h\u032f\3\2\2\2j\u0331\3\2\2\2l\u0341\3\2\2\2n\u0343\3\2\2\2p\u0345"+
		"\3\2\2\2r\u034a\3\2\2\2t\u0352\3\2\2\2v\u035e\3\2\2\2x\u0361\3\2\2\2z"+
		"\u0370\3\2\2\2|\u03ab\3\2\2\2~\u03ad\3\2\2\2\u0080\u03bd\3\2\2\2\u0082"+
		"\u03c8\3\2\2\2\u0084\u03d1\3\2\2\2\u0086\u03e6\3\2\2\2\u0088\u03e8\3\2"+
		"\2\2\u008a\u03f7\3\2\2\2\u008c\u03f9\3\2\2\2\u008e\u040b\3\2\2\2\u0090"+
		"\u040d\3\2\2\2\u0092\u0418\3\2\2\2\u0094\u0427\3\2\2\2\u0096\u0457\3\2"+
		"\2\2\u0098\u0491\3\2\2\2\u009a\u0493\3\2\2\2\u009c\u04a4\3\2\2\2\u009e"+
		"\u04a7\3\2\2\2\u00a0\u04b7\3\2\2\2\u00a2\u04b9\3\2\2\2\u00a4\u04c6\3\2"+
		"\2\2\u00a6\u04ca\3\2\2\2\u00a8\u04d7\3\2\2\2\u00aa\u04da\3\2\2\2\u00ac"+
		"\u04e2\3\2\2\2\u00ae\u04ec\3\2\2\2\u00b0\u00ce\5\4\3\2\u00b1\u00ce\5\6"+
		"\4\2\u00b2\u00ce\5\b\5\2\u00b3\u00b4\79\2\2\u00b4\u00b5\5F$\2\u00b5\u00b6"+
		"\7:\2\2\u00b6\u00ce\3\2\2\2\u00b7\u00ce\5\n\6\2\u00b8\u00ba\7\3\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\79"+
		"\2\2\u00bc\u00bd\5\24\13\2\u00bd\u00be\7:\2\2\u00be\u00ce\3\2\2\2\u00bf"+
		"\u00c0\7\4\2\2\u00c0\u00c1\79\2\2\u00c1\u00c2\5&\24\2\u00c2\u00c3\7V\2"+
		"\2\u00c3\u00c4\5\u0092J\2\u00c4\u00c5\7:\2\2\u00c5\u00ce\3\2\2\2\u00c6"+
		"\u00c7\7\5\2\2\u00c7\u00c8\79\2\2\u00c8\u00c9\5\u0092J\2\u00c9\u00ca\7"+
		"V\2\2\u00ca\u00cb\5&\24\2\u00cb\u00cc\7:\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00b0\3\2\2\2\u00cd\u00b1\3\2\2\2\u00cd\u00b2\3\2\2\2\u00cd\u00b3\3\2"+
		"\2\2\u00cd\u00b7\3\2\2\2\u00cd\u00b9\3\2\2\2\u00cd\u00bf\3\2\2\2\u00cd"+
		"\u00c6\3\2\2\2\u00ce\3\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0\5\3\2\2\2\u00d1"+
		"\u00d2\7h\2\2\u00d2\7\3\2\2\2\u00d3\u00d5\7i\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\t\3\2\2\2"+
		"\u00d8\u00d9\7\64\2\2\u00d9\u00da\79\2\2\u00da\u00db\5B\"\2\u00db\u00dc"+
		"\7V\2\2\u00dc\u00dd\5\f\7\2\u00dd\u00de\7:\2\2\u00de\13\3\2\2\2\u00df"+
		"\u00e0\b\7\1\2\u00e0\u00e1\5\16\b\2\u00e1\u00e7\3\2\2\2\u00e2\u00e3\f"+
		"\3\2\2\u00e3\u00e4\7V\2\2\u00e4\u00e6\5\16\b\2\u00e5\u00e2\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\r\3\2\2\2"+
		"\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5\u0092J\2\u00eb\u00ec\7T\2\2\u00ec\u00ed"+
		"\5B\"\2\u00ed\u00f2\3\2\2\2\u00ee\u00ef\7\23\2\2\u00ef\u00f0\7T\2\2\u00f0"+
		"\u00f2\5B\"\2\u00f1\u00ea\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\17\3\2\2\2"+
		"\u00f3\u0119\5\22\n\2\u00f4\u0119\5\24\13\2\u00f5\u0119\5\32\16\2\u00f6"+
		"\u0119\5\34\17\2\u00f7\u0119\5\36\20\2\u00f8\u0119\5 \21\2\u00f9\u00fa"+
		"\t\2\2\2\u00fa\u00fb\t\3\2\2\u00fb\u0104\79\2\2\u00fc\u0101\5> \2\u00fd"+
		"\u00fe\7V\2\2\u00fe\u0100\5> \2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2"+
		"\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0113\3\2\2\2\u0106"+
		"\u010f\7T\2\2\u0107\u010c\5> \2\u0108\u0109\7V\2\2\u0109\u010b\5> \2\u010a"+
		"\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0107\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u0106\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\7:\2\2\u0117\u0119\7U\2\2\u0118\u00f3\3\2\2"+
		"\2\u0118\u00f4\3\2\2\2\u0118\u00f5\3\2\2\2\u0118\u00f6\3\2\2\2\u0118\u00f7"+
		"\3\2\2\2\u0118\u00f8\3\2\2\2\u0118\u00f9\3\2\2\2\u0119\21\3\2\2\2\u011a"+
		"\u011b\7g\2\2\u011b\u011c\7T\2\2\u011c\u0126\5\20\t\2\u011d\u011e\7\17"+
		"\2\2\u011e\u011f\5H%\2\u011f\u0120\7T\2\2\u0120\u0121\5\20\t\2\u0121\u0126"+
		"\3\2\2\2\u0122\u0123\7\23\2\2\u0123\u0124\7T\2\2\u0124\u0126\5\20\t\2"+
		"\u0125\u011a\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u0122\3\2\2\2\u0126\23"+
		"\3\2\2\2\u0127\u0129\7=\2\2\u0128\u012a\5\26\f\2\u0129\u0128\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7>\2\2\u012c\25\3\2\2\2"+
		"\u012d\u012e\b\f\1\2\u012e\u012f\5\30\r\2\u012f\u0134\3\2\2\2\u0130\u0131"+
		"\f\3\2\2\u0131\u0133\5\30\r\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\27\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0137\u013a\5J&\2\u0138\u013a\5\20\t\2\u0139\u0137\3\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013a\31\3\2\2\2\u013b\u013d\5F$\2\u013c\u013b\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7U\2\2\u013f\33\3"+
		"\2\2\2\u0140\u0141\7\34\2\2\u0141\u0142\79\2\2\u0142\u0143\5F$\2\u0143"+
		"\u0144\7:\2\2\u0144\u0147\5\20\t\2\u0145\u0146\7\26\2\2\u0146\u0148\5"+
		"\20\t\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0150\3\2\2\2\u0149"+
		"\u014a\7(\2\2\u014a\u014b\79\2\2\u014b\u014c\5F$\2\u014c\u014d\7:\2\2"+
		"\u014d\u014e\5\20\t\2\u014e\u0150\3\2\2\2\u014f\u0140\3\2\2\2\u014f\u0149"+
		"\3\2\2\2\u0150\35\3\2\2\2\u0151\u0152\7.\2\2\u0152\u0153\79\2\2\u0153"+
		"\u0154\5F$\2\u0154\u0155\7:\2\2\u0155\u0156\5\20\t\2\u0156\u017c\3\2\2"+
		"\2\u0157\u0158\7\24\2\2\u0158\u0159\5\20\t\2\u0159\u015a\7.\2\2\u015a"+
		"\u015b\79\2\2\u015b\u015c\5F$\2\u015c\u015d\7:\2\2\u015d\u015e\7U\2\2"+
		"\u015e\u017c\3\2\2\2\u015f\u0160\7\32\2\2\u0160\u0162\79\2\2\u0161\u0163"+
		"\5F$\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0166\7U\2\2\u0165\u0167\5F$\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2"+
		"\2\u0167\u0168\3\2\2\2\u0168\u016a\7U\2\2\u0169\u016b\5F$\2\u016a\u0169"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7:\2\2\u016d"+
		"\u017c\5\20\t\2\u016e\u016f\7\32\2\2\u016f\u0170\79\2\2\u0170\u0172\5"+
		"J&\2\u0171\u0173\5F$\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0176\7U\2\2\u0175\u0177\5F$\2\u0176\u0175\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\7:\2\2\u0179\u017a\5\20"+
		"\t\2\u017a\u017c\3\2\2\2\u017b\u0151\3\2\2\2\u017b\u0157\3\2\2\2\u017b"+
		"\u015f\3\2\2\2\u017b\u016e\3\2\2\2\u017c\37\3\2\2\2\u017d\u017e\7\33\2"+
		"\2\u017e\u017f\7g\2\2\u017f\u018e\7U\2\2\u0180\u0181\7\22\2\2\u0181\u018e"+
		"\7U\2\2\u0182\u0183\7\16\2\2\u0183\u018e\7U\2\2\u0184\u0186\7\"\2\2\u0185"+
		"\u0187\5F$\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2"+
		"\2\u0188\u018e\7U\2\2\u0189\u018a\7\33\2\2\u018a\u018b\5&\24\2\u018b\u018c"+
		"\7U\2\2\u018c\u018e\3\2\2\2\u018d\u017d\3\2\2\2\u018d\u0180\3\2\2\2\u018d"+
		"\u0182\3\2\2\2\u018d\u0184\3\2\2\2\u018d\u0189\3\2\2\2\u018e!\3\2\2\2"+
		"\u018f\u0190\b\22\1\2\u0190\u01b2\5\2\2\2\u0191\u0192\79\2\2\u0192\u0193"+
		"\5\u0092J\2\u0193\u0194\7:\2\2\u0194\u0195\7=\2\2\u0195\u0196\5\u009a"+
		"N\2\u0196\u0197\7>\2\2\u0197\u01b2\3\2\2\2\u0198\u0199\79\2\2\u0199\u019a"+
		"\5\u0092J\2\u019a\u019b\7:\2\2\u019b\u019c\7=\2\2\u019c\u019d\5\u009a"+
		"N\2\u019d\u019e\7V\2\2\u019e\u019f\7>\2\2\u019f\u01b2\3\2\2\2\u01a0\u01a1"+
		"\7\3\2\2\u01a1\u01a2\79\2\2\u01a2\u01a3\5\u0092J\2\u01a3\u01a4\7:\2\2"+
		"\u01a4\u01a5\7=\2\2\u01a5\u01a6\5\u009aN\2\u01a6\u01a7\7>\2\2\u01a7\u01b2"+
		"\3\2\2\2\u01a8\u01a9\7\3\2\2\u01a9\u01aa\79\2\2\u01aa\u01ab\5\u0092J\2"+
		"\u01ab\u01ac\7:\2\2\u01ac\u01ad\7=\2\2\u01ad\u01ae\5\u009aN\2\u01ae\u01af"+
		"\7V\2\2\u01af\u01b0\7>\2\2\u01b0\u01b2\3\2\2\2\u01b1\u018f\3\2\2\2\u01b1"+
		"\u0191\3\2\2\2\u01b1\u0198\3\2\2\2\u01b1\u01a0\3\2\2\2\u01b1\u01a8\3\2"+
		"\2\2\u01b2\u01ca\3\2\2\2\u01b3\u01b4\f\f\2\2\u01b4\u01b5\7;\2\2\u01b5"+
		"\u01b6\5F$\2\u01b6\u01b7\7<\2\2\u01b7\u01c9\3\2\2\2\u01b8\u01b9\f\13\2"+
		"\2\u01b9\u01bb\79\2\2\u01ba\u01bc\5$\23\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c9\7:\2\2\u01be\u01bf\f\n\2\2\u01bf"+
		"\u01c0\7e\2\2\u01c0\u01c9\7g\2\2\u01c1\u01c2\f\t\2\2\u01c2\u01c3\7d\2"+
		"\2\u01c3\u01c9\7g\2\2\u01c4\u01c5\f\b\2\2\u01c5\u01c9\7F\2\2\u01c6\u01c7"+
		"\f\7\2\2\u01c7\u01c9\7H\2\2\u01c8\u01b3\3\2\2\2\u01c8\u01b8\3\2\2\2\u01c8"+
		"\u01be\3\2\2\2\u01c8\u01c1\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"#\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\b\23\1\2\u01ce\u01cf\5B\"\2"+
		"\u01cf\u01d5\3\2\2\2\u01d0\u01d1\f\3\2\2\u01d1\u01d2\7V\2\2\u01d2\u01d4"+
		"\5B\"\2\u01d3\u01d0\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6%\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01ef\5\"\22\2"+
		"\u01d9\u01da\7F\2\2\u01da\u01ef\5&\24\2\u01db\u01dc\7H\2\2\u01dc\u01ef"+
		"\5&\24\2\u01dd\u01de\5(\25\2\u01de\u01df\5*\26\2\u01df\u01ef\3\2\2\2\u01e0"+
		"\u01e1\7%\2\2\u01e1\u01ef\5&\24\2\u01e2\u01e3\7%\2\2\u01e3\u01e4\79\2"+
		"\2\u01e4\u01e5\5\u0092J\2\u01e5\u01e6\7:\2\2\u01e6\u01ef\3\2\2\2\u01e7"+
		"\u01e8\7\60\2\2\u01e8\u01e9\79\2\2\u01e9\u01ea\5\u0092J\2\u01ea\u01eb"+
		"\7:\2\2\u01eb\u01ef\3\2\2\2\u01ec\u01ed\7N\2\2\u01ed\u01ef\7g\2\2\u01ee"+
		"\u01d8\3\2\2\2\u01ee\u01d9\3\2\2\2\u01ee\u01db\3\2\2\2\u01ee\u01dd\3\2"+
		"\2\2\u01ee\u01e0\3\2\2\2\u01ee\u01e2\3\2\2\2\u01ee\u01e7\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\'\3\2\2\2\u01f0\u01f1\t\4\2\2\u01f1)\3\2\2\2\u01f2"+
		"\u01ff\5&\24\2\u01f3\u01f4\79\2\2\u01f4\u01f5\5\u0092J\2\u01f5\u01f6\7"+
		":\2\2\u01f6\u01f7\5*\26\2\u01f7\u01ff\3\2\2\2\u01f8\u01f9\7\3\2\2\u01f9"+
		"\u01fa\79\2\2\u01fa\u01fb\5\u0092J\2\u01fb\u01fc\7:\2\2\u01fc\u01fd\5"+
		"*\26\2\u01fd\u01ff\3\2\2\2\u01fe\u01f2\3\2\2\2\u01fe\u01f3\3\2\2\2\u01fe"+
		"\u01f8\3\2\2\2\u01ff+\3\2\2\2\u0200\u0201\b\27\1\2\u0201\u0202\5*\26\2"+
		"\u0202\u020e\3\2\2\2\u0203\u0204\f\5\2\2\u0204\u0205\7I\2\2\u0205\u020d"+
		"\5*\26\2\u0206\u0207\f\4\2\2\u0207\u0208\7J\2\2\u0208\u020d\5*\26\2\u0209"+
		"\u020a\f\3\2\2\u020a\u020b\7K\2\2\u020b\u020d\5*\26\2\u020c\u0203\3\2"+
		"\2\2\u020c\u0206\3\2\2\2\u020c\u0209\3\2\2\2\u020d\u0210\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f-\3\2\2\2\u0210\u020e\3\2\2\2"+
		"\u0211\u0212\b\30\1\2\u0212\u0213\5,\27\2\u0213\u021c\3\2\2\2\u0214\u0215"+
		"\f\4\2\2\u0215\u0216\7E\2\2\u0216\u021b\5,\27\2\u0217\u0218\f\3\2\2\u0218"+
		"\u0219\7G\2\2\u0219\u021b\5,\27\2\u021a\u0214\3\2\2\2\u021a\u0217\3\2"+
		"\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"/\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\b\31\1\2\u0220\u0221\5.\30\2"+
		"\u0221\u022a\3\2\2\2\u0222\u0223\f\4\2\2\u0223\u0224\7C\2\2\u0224\u0229"+
		"\5.\30\2\u0225\u0226\f\3\2\2\u0226\u0227\7D\2\2\u0227\u0229\5.\30\2\u0228"+
		"\u0222\3\2\2\2\u0228\u0225\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\61\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e"+
		"\b\32\1\2\u022e\u022f\5\60\31\2\u022f\u023e\3\2\2\2\u0230\u0231\f\6\2"+
		"\2\u0231\u0232\7?\2\2\u0232\u023d\5\60\31\2\u0233\u0234\f\5\2\2\u0234"+
		"\u0235\7A\2\2\u0235\u023d\5\60\31\2\u0236\u0237\f\4\2\2\u0237\u0238\7"+
		"@\2\2\u0238\u023d\5\60\31\2\u0239\u023a\f\3\2\2\u023a\u023b\7B\2\2\u023b"+
		"\u023d\5\60\31\2\u023c\u0230\3\2\2\2\u023c\u0233\3\2\2\2\u023c\u0236\3"+
		"\2\2\2\u023c\u0239\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\63\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0242\b\33\1"+
		"\2\u0242\u0243\5\62\32\2\u0243\u024c\3\2\2\2\u0244\u0245\f\4\2\2\u0245"+
		"\u0246\7b\2\2\u0246\u024b\5\62\32\2\u0247\u0248\f\3\2\2\u0248\u0249\7"+
		"c\2\2\u0249\u024b\5\62\32\2\u024a\u0244\3\2\2\2\u024a\u0247\3\2\2\2\u024b"+
		"\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\65\3\2\2"+
		"\2\u024e\u024c\3\2\2\2\u024f\u0250\b\34\1\2\u0250\u0251\5\64\33\2\u0251"+
		"\u0257\3\2\2\2\u0252\u0253\f\3\2\2\u0253\u0254\7L\2\2\u0254\u0256\5\64"+
		"\33\2\u0255\u0252\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258\67\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\b\35\1"+
		"\2\u025b\u025c\5\66\34\2\u025c\u0262\3\2\2\2\u025d\u025e\f\3\2\2\u025e"+
		"\u025f\7P\2\2\u025f\u0261\5\66\34\2\u0260\u025d\3\2\2\2\u0261\u0264\3"+
		"\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u02639\3\2\2\2\u0264\u0262"+
		"\3\2\2\2\u0265\u0266\b\36\1\2\u0266\u0267\58\35\2\u0267\u026d\3\2\2\2"+
		"\u0268\u0269\f\3\2\2\u0269\u026a\7M\2\2\u026a\u026c\58\35\2\u026b\u0268"+
		"\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		";\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271\b\37\1\2\u0271\u0272\5:\36\2"+
		"\u0272\u0278\3\2\2\2\u0273\u0274\f\3\2\2\u0274\u0275\7N\2\2\u0275\u0277"+
		"\5:\36\2\u0276\u0273\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279=\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c\b \1\2\u027c"+
		"\u027d\5<\37\2\u027d\u0283\3\2\2\2\u027e\u027f\f\3\2\2\u027f\u0280\7O"+
		"\2\2\u0280\u0282\5<\37\2\u0281\u027e\3\2\2\2\u0282\u0285\3\2\2\2\u0283"+
		"\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284?\3\2\2\2\u0285\u0283\3\2\2\2"+
		"\u0286\u028c\5> \2\u0287\u0288\7S\2\2\u0288\u0289\5F$\2\u0289\u028a\7"+
		"T\2\2\u028a\u028b\5@!\2\u028b\u028d\3\2\2\2\u028c\u0287\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028dA\3\2\2\2\u028e\u0294\5@!\2\u028f\u0290\5&\24\2\u0290"+
		"\u0291\5D#\2\u0291\u0292\5B\"\2\u0292\u0294\3\2\2\2\u0293\u028e\3\2\2"+
		"\2\u0293\u028f\3\2\2\2\u0294C\3\2\2\2\u0295\u0296\t\5\2\2\u0296E\3\2\2"+
		"\2\u0297\u0298\b$\1\2\u0298\u0299\5B\"\2\u0299\u029f\3\2\2\2\u029a\u029b"+
		"\f\3\2\2\u029b\u029c\7V\2\2\u029c\u029e\5B\"\2\u029d\u029a\3\2\2\2\u029e"+
		"\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0G\3\2\2\2"+
		"\u02a1\u029f\3\2\2\2\u02a2\u02a3\5@!\2\u02a3I\3\2\2\2\u02a4\u02a6\5L\'"+
		"\2\u02a5\u02a7\5R*\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8"+
		"\3\2\2\2\u02a8\u02a9\7U\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02ac\5\u00a2R\2"+
		"\u02ab\u02a4\3\2\2\2\u02ab\u02aa\3\2\2\2\u02acK\3\2\2\2\u02ad\u02af\5"+
		"P)\2\u02ae\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1M\3\2\2\2\u02b2\u02b4\5P)\2\u02b3\u02b2\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6O\3\2\2\2"+
		"\u02b7\u02bd\5V,\2\u02b8\u02bd\5X-\2\u02b9\u02bd\5r:\2\u02ba\u02bd\5t"+
		";\2\u02bb\u02bd\5v<\2\u02bc\u02b7\3\2\2\2\u02bc\u02b8\3\2\2\2\u02bc\u02b9"+
		"\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bb\3\2\2\2\u02bdQ\3\2\2\2\u02be"+
		"\u02bf\b*\1\2\u02bf\u02c0\5T+\2\u02c0\u02c6\3\2\2\2\u02c1\u02c2\f\3\2"+
		"\2\u02c2\u02c3\7V\2\2\u02c3\u02c5\5T+\2\u02c4\u02c1\3\2\2\2\u02c5\u02c8"+
		"\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7S\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c9\u02cf\5x=\2\u02ca\u02cb\5x=\2\u02cb\u02cc\7W\2\2"+
		"\u02cc\u02cd\5\u0098M\2\u02cd\u02cf\3\2\2\2\u02ce\u02c9\3\2\2\2\u02ce"+
		"\u02ca\3\2\2\2\u02cfU\3\2\2\2\u02d0\u02d1\t\6\2\2\u02d1W\3\2\2\2\u02d2"+
		"\u02dc\7,\2\2\u02d3\u02dc\7\20\2\2\u02d4\u02dc\7#\2\2\u02d5\u02dc\7\36"+
		"\2\2\u02d6\u02dc\7\37\2\2\u02d7\u02dc\7\31\2\2\u02d8\u02dc\7\25\2\2\u02d9"+
		"\u02dc\7$\2\2\u02da\u02dc\7+\2\2\u02db\u02d2\3\2\2\2\u02db\u02d3\3\2\2"+
		"\2\u02db\u02d4\3\2\2\2\u02db\u02d5\3\2\2\2\u02db\u02d6\3\2\2\2\u02db\u02d7"+
		"\3\2\2\2\u02db\u02d8\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02da\3\2\2\2\u02dc"+
		"Y\3\2\2\2\u02dd\u02df\5\\/\2\u02de\u02e0\7g\2\2\u02df\u02de\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\7=\2\2\u02e2\u02e3\5^\60"+
		"\2\u02e3\u02e4\7>\2\2\u02e4\u02e9\3\2\2\2\u02e5\u02e6\5\\/\2\u02e6\u02e7"+
		"\7g\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02dd\3\2\2\2\u02e8\u02e5\3\2\2\2\u02e9"+
		"[\3\2\2\2\u02ea\u02eb\t\7\2\2\u02eb]\3\2\2\2\u02ec\u02ed\b\60\1\2\u02ed"+
		"\u02ee\5`\61\2\u02ee\u02f3\3\2\2\2\u02ef\u02f0\f\3\2\2\u02f0\u02f2\5`"+
		"\61\2\u02f1\u02ef\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3"+
		"\u02f4\3\2\2\2\u02f4_\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f8\5b\62\2"+
		"\u02f7\u02f9\5d\63\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa"+
		"\3\2\2\2\u02fa\u02fb\7U\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fe\5\u00a2R\2"+
		"\u02fd\u02f6\3\2\2\2\u02fd\u02fc\3\2\2\2\u02fea\3\2\2\2\u02ff\u0301\5"+
		"X-\2\u0300\u0302\5b\62\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0308\3\2\2\2\u0303\u0305\5r:\2\u0304\u0306\5b\62\2\u0305\u0304\3\2\2"+
		"\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u02ff\3\2\2\2\u0307\u0303"+
		"\3\2\2\2\u0308c\3\2\2\2\u0309\u030a\b\63\1\2\u030a\u030b\5f\64\2\u030b"+
		"\u0311\3\2\2\2\u030c\u030d\f\3\2\2\u030d\u030e\7V\2\2\u030e\u0310\5f\64"+
		"\2\u030f\u030c\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312"+
		"\3\2\2\2\u0312e\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u031b\5x=\2\u0315\u0317"+
		"\5x=\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u0319\7T\2\2\u0319\u031b\5H%\2\u031a\u0314\3\2\2\2\u031a\u0316\3\2\2"+
		"\2\u031bg\3\2\2\2\u031c\u031e\7\27\2\2\u031d\u031f\7g\2\2\u031e\u031d"+
		"\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\7=\2\2\u0321"+
		"\u0322\5j\66\2\u0322\u0323\7>\2\2\u0323\u0330\3\2\2\2\u0324\u0326\7\27"+
		"\2\2\u0325\u0327\7g\2\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u0329\7=\2\2\u0329\u032a\5j\66\2\u032a\u032b\7V\2"+
		"\2\u032b\u032c\7>\2\2\u032c\u0330\3\2\2\2\u032d\u032e\7\27\2\2\u032e\u0330"+
		"\7g\2\2\u032f\u031c\3\2\2\2\u032f\u0324\3\2\2\2\u032f\u032d\3\2\2\2\u0330"+
		"i\3\2\2\2\u0331\u0332\b\66\1\2\u0332\u0333\5l\67\2\u0333\u0339\3\2\2\2"+
		"\u0334\u0335\f\3\2\2\u0335\u0336\7V\2\2\u0336\u0338\5l\67\2\u0337\u0334"+
		"\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a"+
		"k\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u0342\5n8\2\u033d\u033e\5n8\2\u033e"+
		"\u033f\7W\2\2\u033f\u0340\5H%\2\u0340\u0342\3\2\2\2\u0341\u033c\3\2\2"+
		"\2\u0341\u033d\3\2\2\2\u0342m\3\2\2\2\u0343\u0344\7g\2\2\u0344o\3\2\2"+
		"\2\u0345\u0346\7\61\2\2\u0346\u0347\79\2\2\u0347\u0348\5\u0092J\2\u0348"+
		"\u0349\7:\2\2\u0349q\3\2\2\2\u034a\u034b\t\b\2\2\u034bs\3\2\2\2\u034c"+
		"\u0353\t\t\2\2\u034d\u0353\5~@\2\u034e\u034f\7\13\2\2\u034f\u0350\79\2"+
		"\2\u0350\u0351\7g\2\2\u0351\u0353\7:\2\2\u0352\u034c\3\2\2\2\u0352\u034d"+
		"\3\2\2\2\u0352\u034e\3\2\2\2\u0353u\3\2\2\2\u0354\u0355\7/\2\2\u0355\u0356"+
		"\79\2\2\u0356\u0357\5\u0092J\2\u0357\u0358\7:\2\2\u0358\u035f\3\2\2\2"+
		"\u0359\u035a\7/\2\2\u035a\u035b\79\2\2\u035b\u035c\5H%\2\u035c\u035d\7"+
		":\2\2\u035d\u035f\3\2\2\2\u035e\u0354\3\2\2\2\u035e\u0359\3\2\2\2\u035f"+
		"w\3\2\2\2\u0360\u0362\5\u0086D\2\u0361\u0360\3\2\2\2\u0361\u0362\3\2\2"+
		"\2\u0362\u0363\3\2\2\2\u0363\u0367\5z>\2\u0364\u0366\5|?\2\u0365\u0364"+
		"\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"y\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036b\b>\1\2\u036b\u0371\7g\2\2\u036c"+
		"\u036d\79\2\2\u036d\u036e\5x=\2\u036e\u036f\7:\2\2\u036f\u0371\3\2\2\2"+
		"\u0370\u036a\3\2\2\2\u0370\u036c\3\2\2\2\u0371\u039f\3\2\2\2\u0372\u0373"+
		"\f\b\2\2\u0373\u0375\7;\2\2\u0374\u0376\5\u0088E\2\u0375\u0374\3\2\2\2"+
		"\u0375\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377\u0379\5B\"\2\u0378\u0377"+
		"\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u039e\7<\2\2\u037b"+
		"\u037c\f\7\2\2\u037c\u037d\7;\2\2\u037d\u037f\7&\2\2\u037e\u0380\5\u0088"+
		"E\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381"+
		"\u0382\5B\"\2\u0382\u0383\7<\2\2\u0383\u039e\3\2\2\2\u0384\u0385\f\6\2"+
		"\2\u0385\u0386\7;\2\2\u0386\u0387\5\u0088E\2\u0387\u0388\7&\2\2\u0388"+
		"\u0389\5B\"\2\u0389\u038a\7<\2\2\u038a\u039e\3\2\2\2\u038b\u038c\f\5\2"+
		"\2\u038c\u038e\7;\2\2\u038d\u038f\5\u0088E\2\u038e\u038d\3\2\2\2\u038e"+
		"\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\7I\2\2\u0391\u039e\7<\2"+
		"\2\u0392\u0393\f\4\2\2\u0393\u0394\79\2\2\u0394\u0395\5\u008aF\2\u0395"+
		"\u0396\7:\2\2\u0396\u039e\3\2\2\2\u0397\u0398\f\3\2\2\u0398\u039a\79\2"+
		"\2\u0399\u039b\5\u0090I\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"\u039c\3\2\2\2\u039c\u039e\7:\2\2\u039d\u0372\3\2\2\2\u039d\u037b\3\2"+
		"\2\2\u039d\u0384\3\2\2\2\u039d\u038b\3\2\2\2\u039d\u0392\3\2\2\2\u039d"+
		"\u0397\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2"+
		"\2\2\u03a0{\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a3\7\6\2\2\u03a3\u03a5"+
		"\79\2\2\u03a4\u03a6\7i\2\2\u03a5\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ac\7:"+
		"\2\2\u03aa\u03ac\5~@\2\u03ab\u03a2\3\2\2\2\u03ab\u03aa\3\2\2\2\u03ac}"+
		"\3\2\2\2\u03ad\u03ae\7\f\2\2\u03ae\u03af\79\2\2\u03af\u03b0\79\2\2\u03b0"+
		"\u03b1\5\u0080A\2\u03b1\u03b2\7:\2\2\u03b2\u03b3\7:\2\2\u03b3\177\3\2"+
		"\2\2\u03b4\u03b9\5\u0082B\2\u03b5\u03b6\7V\2\2\u03b6\u03b8\5\u0082B\2"+
		"\u03b7\u03b5\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba"+
		"\3\2\2\2\u03ba\u03be\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd"+
		"\u03b4\3\2\2\2\u03bd\u03bc\3\2\2\2\u03be\u0081\3\2\2\2\u03bf\u03c5\n\n"+
		"\2\2\u03c0\u03c2\79\2\2\u03c1\u03c3\5$\23\2\u03c2\u03c1\3\2\2\2\u03c2"+
		"\u03c3\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\7:\2\2\u03c5\u03c0\3\2"+
		"\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8"+
		"\u03bf\3\2\2\2\u03c8\u03c7\3\2\2\2\u03c9\u0083\3\2\2\2\u03ca\u03d0\n\13"+
		"\2\2\u03cb\u03cc\79\2\2\u03cc\u03cd\5\u0084C\2\u03cd\u03ce\7:\2\2\u03ce"+
		"\u03d0\3\2\2\2\u03cf\u03ca\3\2\2\2\u03cf\u03cb\3\2\2\2\u03d0\u03d3\3\2"+
		"\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u0085\3\2\2\2\u03d3"+
		"\u03d1\3\2\2\2\u03d4\u03d6\7I\2\2\u03d5\u03d7\5\u0088E\2\u03d6\u03d5\3"+
		"\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03e7\3\2\2\2\u03d8\u03da\7I\2\2\u03d9"+
		"\u03db\5\u0088E\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc"+
		"\3\2\2\2\u03dc\u03e7\5\u0086D\2\u03dd\u03df\7P\2\2\u03de\u03e0\5\u0088"+
		"E\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e7\3\2\2\2\u03e1"+
		"\u03e3\7P\2\2\u03e2\u03e4\5\u0088E\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3"+
		"\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\5\u0086D\2\u03e6\u03d4\3\2\2\2"+
		"\u03e6\u03d8\3\2\2\2\u03e6\u03dd\3\2\2\2\u03e6\u03e1\3\2\2\2\u03e7\u0087"+
		"\3\2\2\2\u03e8\u03e9\bE\1\2\u03e9\u03ea\5r:\2\u03ea\u03ef\3\2\2\2\u03eb"+
		"\u03ec\f\3\2\2\u03ec\u03ee\5r:\2\u03ed\u03eb\3\2\2\2\u03ee\u03f1\3\2\2"+
		"\2\u03ef\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u0089\3\2\2\2\u03f1\u03ef"+
		"\3\2\2\2\u03f2\u03f8\5\u008cG\2\u03f3\u03f4\5\u008cG\2\u03f4\u03f5\7V"+
		"\2\2\u03f5\u03f6\7f\2\2\u03f6\u03f8\3\2\2\2\u03f7\u03f2\3\2\2\2\u03f7"+
		"\u03f3\3\2\2\2\u03f8\u008b\3\2\2\2\u03f9\u03fa\bG\1\2\u03fa\u03fb\5\u008e"+
		"H\2\u03fb\u0401\3\2\2\2\u03fc\u03fd\f\3\2\2\u03fd\u03fe\7V\2\2\u03fe\u0400"+
		"\5\u008eH\2\u03ff\u03fc\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2"+
		"\2\u0401\u0402\3\2\2\2\u0402\u008d\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0405"+
		"\5L\'\2\u0405\u0406\5x=\2\u0406\u040c\3\2\2\2\u0407\u0409\5N(\2\u0408"+
		"\u040a\5\u0094K\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040c"+
		"\3\2\2\2\u040b\u0404\3\2\2\2\u040b\u0407\3\2\2\2\u040c\u008f\3\2\2\2\u040d"+
		"\u040e\bI\1\2\u040e\u040f\7g\2\2\u040f\u0415\3\2\2\2\u0410\u0411\f\3\2"+
		"\2\u0411\u0412\7V\2\2\u0412\u0414\7g\2\2\u0413\u0410\3\2\2\2\u0414\u0417"+
		"\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0091\3\2\2\2\u0417"+
		"\u0415\3\2\2\2\u0418\u041a\5b\62\2\u0419\u041b\5\u0094K\2\u041a\u0419"+
		"\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u0093\3\2\2\2\u041c\u0428\5\u0086D"+
		"\2\u041d\u041f\5\u0086D\2\u041e\u041d\3\2\2\2\u041e\u041f\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u0424\5\u0096L\2\u0421\u0423\5|?\2\u0422\u0421\3"+
		"\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u041c\3\2\2\2\u0427\u041e\3\2"+
		"\2\2\u0428\u0095\3\2\2\2\u0429\u042a\bL\1\2\u042a\u042b\79\2\2\u042b\u042c"+
		"\5\u0094K\2\u042c\u0430\7:\2\2\u042d\u042f\5|?\2\u042e\u042d\3\2\2\2\u042f"+
		"\u0432\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0458\3\2"+
		"\2\2\u0432\u0430\3\2\2\2\u0433\u0435\7;\2\2\u0434\u0436\5\u0088E\2\u0435"+
		"\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\3\2\2\2\u0437\u0439\5B"+
		"\"\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2\u043a"+
		"\u0458\7<\2\2\u043b\u043c\7;\2\2\u043c\u043e\7&\2\2\u043d\u043f\5\u0088"+
		"E\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\3\2\2\2\u0440"+
		"\u0441\5B\"\2\u0441\u0442\7<\2\2\u0442\u0458\3\2\2\2\u0443\u0444\7;\2"+
		"\2\u0444\u0445\5\u0088E\2\u0445\u0446\7&\2\2\u0446\u0447\5B\"\2\u0447"+
		"\u0448\7<\2\2\u0448\u0458\3\2\2\2\u0449\u044a\7;\2\2\u044a\u044b\7I\2"+
		"\2\u044b\u0458\7<\2\2\u044c\u044e\79\2\2\u044d\u044f\5\u008aF\2\u044e"+
		"\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0454\7:"+
		"\2\2\u0451\u0453\5|?\2\u0452\u0451\3\2\2\2\u0453\u0456\3\2\2\2\u0454\u0452"+
		"\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0457"+
		"\u0429\3\2\2\2\u0457\u0433\3\2\2\2\u0457\u043b\3\2\2\2\u0457\u0443\3\2"+
		"\2\2\u0457\u0449\3\2\2\2\u0457\u044c\3\2\2\2\u0458\u0484\3\2\2\2\u0459"+
		"\u045a\f\7\2\2\u045a\u045c\7;\2\2\u045b\u045d\5\u0088E\2\u045c\u045b\3"+
		"\2\2\2\u045c\u045d\3\2\2\2\u045d\u045f\3\2\2\2\u045e\u0460\5B\"\2\u045f"+
		"\u045e\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0483\7<"+
		"\2\2\u0462\u0463\f\6\2\2\u0463\u0464\7;\2\2\u0464\u0466\7&\2\2\u0465\u0467"+
		"\5\u0088E\2\u0466\u0465\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2\2"+
		"\2\u0468\u0469\5B\"\2\u0469\u046a\7<\2\2\u046a\u0483\3\2\2\2\u046b\u046c"+
		"\f\5\2\2\u046c\u046d\7;\2\2\u046d\u046e\5\u0088E\2\u046e\u046f\7&\2\2"+
		"\u046f\u0470\5B\"\2\u0470\u0471\7<\2\2\u0471\u0483\3\2\2\2\u0472\u0473"+
		"\f\4\2\2\u0473\u0474\7;\2\2\u0474\u0475\7I\2\2\u0475\u0483\7<\2\2\u0476"+
		"\u0477\f\3\2\2\u0477\u0479\79\2\2\u0478\u047a\5\u008aF\2\u0479\u0478\3"+
		"\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047f\7:\2\2\u047c"+
		"\u047e\5|?\2\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2"+
		"\2\u047f\u0480\3\2\2\2\u0480\u0483\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0459"+
		"\3\2\2\2\u0482\u0462\3\2\2\2\u0482\u046b\3\2\2\2\u0482\u0472\3\2\2\2\u0482"+
		"\u0476\3\2\2\2\u0483\u0486\3\2\2\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2"+
		"\2\2\u0485\u0097\3\2\2\2\u0486\u0484\3\2\2\2\u0487\u0492\5B\"\2\u0488"+
		"\u0489\7=\2\2\u0489\u048a\5\u009aN\2\u048a\u048b\7>\2\2\u048b\u0492\3"+
		"\2\2\2\u048c\u048d\7=\2\2\u048d\u048e\5\u009aN\2\u048e\u048f\7V\2\2\u048f"+
		"\u0490\7>\2\2\u0490\u0492\3\2\2\2\u0491\u0487\3\2\2\2\u0491\u0488\3\2"+
		"\2\2\u0491\u048c\3\2\2\2\u0492\u0099\3\2\2\2\u0493\u0495\bN\1\2\u0494"+
		"\u0496\5\u009cO\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497"+
		"\3\2\2\2\u0497\u0498\5\u0098M\2\u0498\u04a1\3\2\2\2\u0499\u049a\f\3\2"+
		"\2\u049a\u049c\7V\2\2\u049b\u049d\5\u009cO\2\u049c\u049b\3\2\2\2\u049c"+
		"\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\5\u0098M\2\u049f\u0499"+
		"\3\2\2\2\u04a0\u04a3\3\2\2\2\u04a1\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u009b\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a4\u04a5\5\u009eP\2\u04a5\u04a6"+
		"\7W\2\2\u04a6\u009d\3\2\2\2\u04a7\u04a8\bP\1\2\u04a8\u04a9\5\u00a0Q\2"+
		"\u04a9\u04ae\3\2\2\2\u04aa\u04ab\f\3\2\2\u04ab\u04ad\5\u00a0Q\2\u04ac"+
		"\u04aa\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04af\3\2"+
		"\2\2\u04af\u009f\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04b2\7;\2\2\u04b2"+
		"\u04b3\5H%\2\u04b3\u04b4\7<\2\2\u04b4\u04b8\3\2\2\2\u04b5\u04b6\7e\2\2"+
		"\u04b6\u04b8\7g\2\2\u04b7\u04b1\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8\u00a1"+
		"\3\2\2\2\u04b9\u04ba\7\67\2\2\u04ba\u04bb\79\2\2\u04bb\u04bc\5H%\2\u04bc"+
		"\u04be\7V\2\2\u04bd\u04bf\7i\2\2\u04be\u04bd\3\2\2\2\u04bf\u04c0\3\2\2"+
		"\2\u04c0\u04be\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3"+
		"\7:\2\2\u04c3\u04c4\7U\2\2\u04c4\u00a3\3\2\2\2\u04c5\u04c7\5\u00a6T\2"+
		"\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9"+
		"\7\2\2\3\u04c9\u00a5\3\2\2\2\u04ca\u04cb\bT\1\2\u04cb\u04cc\5\u00a8U\2"+
		"\u04cc\u04d1\3\2\2\2\u04cd\u04ce\f\3\2\2\u04ce\u04d0\5\u00a8U\2\u04cf"+
		"\u04cd\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2"+
		"\2\2\u04d2\u00a7\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d8\5\u00aaV\2\u04d5"+
		"\u04d8\5J&\2\u04d6\u04d8\7U\2\2\u04d7\u04d4\3\2\2\2\u04d7\u04d5\3\2\2"+
		"\2\u04d7\u04d6\3\2\2\2\u04d8\u00a9\3\2\2\2\u04d9\u04db\5L\'\2\u04da\u04d9"+
		"\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04de\5x=\2\u04dd"+
		"\u04df\5\u00acW\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0"+
		"\3\2\2\2\u04e0\u04e1\5\24\13\2\u04e1\u00ab\3\2\2\2\u04e2\u04e3\bW\1\2"+
		"\u04e3\u04e4\5J&\2\u04e4\u04e9\3\2\2\2\u04e5\u04e6\f\3\2\2\u04e6\u04e8"+
		"\5J&\2\u04e7\u04e5\3\2\2\2\u04e8\u04eb\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9"+
		"\u04ea\3\2\2\2\u04ea\u00ad\3\2\2\2\u04eb\u04e9\3\2\2\2\u04ec\u04ed\5\4"+
		"\3\2\u04ed\u04ef\79\2\2\u04ee\u04f0\5$\23\2\u04ef\u04ee\3\2\2\2\u04ef"+
		"\u04f0\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\7:\2\2\u04f2\u00af\3\2"+
		"\2\2\u008d\u00b9\u00cd\u00d6\u00e7\u00f1\u0101\u0104\u010c\u010f\u0113"+
		"\u0118\u0125\u0129\u0134\u0139\u013c\u0147\u014f\u0162\u0166\u016a\u0172"+
		"\u0176\u017b\u0186\u018d\u01b1\u01bb\u01c8\u01ca\u01d5\u01ee\u01fe\u020c"+
		"\u020e\u021a\u021c\u0228\u022a\u023c\u023e\u024a\u024c\u0257\u0262\u026d"+
		"\u0278\u0283\u028c\u0293\u029f\u02a6\u02ab\u02b0\u02b5\u02bc\u02c6\u02ce"+
		"\u02db\u02df\u02e8\u02f3\u02f8\u02fd\u0301\u0305\u0307\u0311\u0316\u031a"+
		"\u031e\u0326\u032f\u0339\u0341\u0352\u035e\u0361\u0367\u0370\u0375\u0378"+
		"\u037f\u038e\u039a\u039d\u039f\u03a7\u03ab\u03b9\u03bd\u03c2\u03c5\u03c8"+
		"\u03cf\u03d1\u03d6\u03da\u03df\u03e3\u03e6\u03ef\u03f7\u0401\u0409\u040b"+
		"\u0415\u041a\u041e\u0424\u0427\u0430\u0435\u0438\u043e\u044e\u0454\u0457"+
		"\u045c\u045f\u0466\u0479\u047f\u0482\u0484\u0491\u0495\u049c\u04a1\u04ae"+
		"\u04b7\u04c0\u04c6\u04d1\u04d7\u04da\u04de\u04e9\u04ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}