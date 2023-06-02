// Generated from /Users/kseniiatokareva/Documents/PythonToCpp/my_grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class my_grammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NEWLINE=6, NAME=7, NUMBER=8, STRING=9, 
		COMMENT=10, INDENT=11, DEDENT=12, ASSIGN=13, PLUS=14, MINUS=15, STAR=16, 
		POWER=17, DIV=18, MOD=19, IDIV=20, AT=21, LESS_THAN=22, GREATER_THAN=23, 
		EQUALS=24, GT_EQ=25, LT_EQ=26, NOT_EQ_1=27, NOT_EQ_2=28, OR=29, XOR=30, 
		AND=31, NOT=32, IS=33, IN=34, ELIF=35, ELSE=36, IF=37, COMMA=38, COLON=39, 
		SEMI_COLON=40, LEFT_SHIFT=41, RIGHT_SHIFT=42, ADD_ASSIGN=43, SUB_ASSIGN=44, 
		MULT_ASSIGN=45, AT_ASSIGN=46, DIV_ASSIGN=47, MOD_ASSIGN=48, AND_ASSIGN=49, 
		OR_ASSIGN=50, XOR_ASSIGN=51, LEFT_SHIFT_ASSIGN=52, RIGHT_SHIFT_ASSIGN=53, 
		POWER_ASSIGN=54, IDIV_ASSIGN=55, AWAIT=56, ATOM=57, DIGIT=58, LETTER=59, 
		WHITESPACE=60, DEF=61, WHILE=62, FOR=63, RANGE=64, YIELD=65, LAMBDA=66, 
		TILDE=67, PRINT=68;
	public static final int
		RULE_file_input = 0, RULE_stmt = 1, RULE_simple_stmt = 2, RULE_small_stmt = 3, 
		RULE_expr_stmt = 4, RULE_assign_expr = 5, RULE_testlist_star_expr = 6, 
		RULE_augassign = 7, RULE_test = 8, RULE_or_test = 9, RULE_and_test = 10, 
		RULE_not_test = 11, RULE_comparison = 12, RULE_comp_op = 13, RULE_star_expr = 14, 
		RULE_expr = 15, RULE_xor_expr = 16, RULE_and_expr = 17, RULE_shift_expr = 18, 
		RULE_arith_expr = 19, RULE_term = 20, RULE_factor = 21, RULE_power = 22, 
		RULE_atom_expr = 23, RULE_trailer = 24, RULE_arglist = 25, RULE_argument = 26, 
		RULE_compound_stmt = 27, RULE_while_stmt = 28, RULE_for_stmt = 29, RULE_range_func = 30, 
		RULE_funcdef = 31, RULE_parameters = 32, RULE_typedargslist = 33, RULE_variadicargs = 34, 
		RULE_tfpdef = 35, RULE_yield_expr = 36, RULE_testlist = 37, RULE_lambdef = 38, 
		RULE_subscriptlist = 39, RULE_comp_for = 40, RULE_if_stmt = 41, RULE_suite = 42, 
		RULE_subscript = 43, RULE_exprlist = 44, RULE_print_statement = 45, RULE_expression = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_input", "stmt", "simple_stmt", "small_stmt", "expr_stmt", "assign_expr", 
			"testlist_star_expr", "augassign", "test", "or_test", "and_test", "not_test", 
			"comparison", "comp_op", "star_expr", "expr", "xor_expr", "and_expr", 
			"shift_expr", "arith_expr", "term", "factor", "power", "atom_expr", "trailer", 
			"arglist", "argument", "compound_stmt", "while_stmt", "for_stmt", "range_func", 
			"funcdef", "parameters", "typedargslist", "variadicargs", "tfpdef", "yield_expr", 
			"testlist", "lambdef", "subscriptlist", "comp_for", "if_stmt", "suite", 
			"subscript", "exprlist", "print_statement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", null, null, null, null, null, 
			null, null, "'='", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'//'", 
			"'@'", "'<'", "'>'", "'=='", "'>='", "'<='", "'<>'", "'!='", "'|'", "'^'", 
			"'&'", "'not'", "'is'", "'in'", "'elif'", "'else'", "'if'", "','", "':'", 
			"';'", "'<<'", "'>>'", "'+='", "'-='", "'*='", "'@='", "'/='", "'%='", 
			"'&='", "'|='", "'^='", "'<<='", "'>>='", "'**='", "'//='", "'await'", 
			null, null, null, null, "'def'", "'while'", "'for'", "'range'", "'yield'", 
			"'lambda'", "'~'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NEWLINE", "NAME", "NUMBER", "STRING", 
			"COMMENT", "INDENT", "DEDENT", "ASSIGN", "PLUS", "MINUS", "STAR", "POWER", 
			"DIV", "MOD", "IDIV", "AT", "LESS_THAN", "GREATER_THAN", "EQUALS", "GT_EQ", 
			"LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "OR", "XOR", "AND", "NOT", "IS", "IN", 
			"ELIF", "ELSE", "IF", "COMMA", "COLON", "SEMI_COLON", "LEFT_SHIFT", "RIGHT_SHIFT", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", "DIV_ASSIGN", 
			"MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", 
			"RIGHT_SHIFT_ASSIGN", "POWER_ASSIGN", "IDIV_ASSIGN", "AWAIT", "ATOM", 
			"DIGIT", "LETTER", "WHITESPACE", "DEF", "WHILE", "FOR", "RANGE", "YIELD", 
			"LAMBDA", "TILDE", "PRINT"
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
	public String getGrammarFileName() { return "my_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public my_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(my_grammarParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(my_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(my_grammarParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (NEWLINE - 6)) | (1L << (PLUS - 6)) | (1L << (MINUS - 6)) | (1L << (IF - 6)) | (1L << (ATOM - 6)) | (1L << (DEF - 6)) | (1L << (WHILE - 6)) | (1L << (FOR - 6)) | (1L << (TILDE - 6)))) != 0)) {
				{
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(94);
					match(NEWLINE);
					}
					break;
				case PLUS:
				case MINUS:
				case IF:
				case ATOM:
				case DEF:
				case WHILE:
				case FOR:
				case TILDE:
					{
					setState(95);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case ATOM:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				simple_stmt();
				}
				break;
			case IF:
			case DEF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				compound_stmt();
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(my_grammarParser.NEWLINE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(my_grammarParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(my_grammarParser.SEMI_COLON, i);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			small_stmt();
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					match(SEMI_COLON);
					setState(109);
					small_stmt();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(115);
				match(SEMI_COLON);
				}
			}

			setState(118);
			match(NEWLINE);
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

	public static class Small_stmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_small_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			expr_stmt();
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Assign_exprContext> assign_expr() {
			return getRuleContexts(Assign_exprContext.class);
		}
		public Assign_exprContext assign_expr(int i) {
			return getRuleContext(Assign_exprContext.class,i);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			expr();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSIGN) {
				{
				{
				setState(123);
				assign_expr();
				}
				}
				setState(128);
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

	public static class Assign_exprContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(my_grammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ASSIGN);
			setState(130);
			expr();
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

	public static class Testlist_star_exprContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(my_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(my_grammarParser.COMMA, i);
		}
		public Testlist_star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_star_expr; }
	}

	public final Testlist_star_exprContext testlist_star_expr() throws RecognitionException {
		Testlist_star_exprContext _localctx = new Testlist_star_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_testlist_star_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
			case ATOM:
			case LAMBDA:
			case TILDE:
				{
				setState(132);
				test();
				}
				break;
			case STAR:
				{
				setState(133);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					match(COMMA);
					setState(139);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
					case MINUS:
					case NOT:
					case ATOM:
					case LAMBDA:
					case TILDE:
						{
						setState(137);
						test();
						}
						break;
					case STAR:
						{
						setState(138);
						star_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(146);
				match(COMMA);
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

	public static class AugassignContext extends ParserRuleContext {
		public TerminalNode ADD_ASSIGN() { return getToken(my_grammarParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(my_grammarParser.SUB_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(my_grammarParser.MULT_ASSIGN, 0); }
		public TerminalNode AT_ASSIGN() { return getToken(my_grammarParser.AT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(my_grammarParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(my_grammarParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(my_grammarParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(my_grammarParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(my_grammarParser.XOR_ASSIGN, 0); }
		public TerminalNode LEFT_SHIFT_ASSIGN() { return getToken(my_grammarParser.LEFT_SHIFT_ASSIGN, 0); }
		public TerminalNode RIGHT_SHIFT_ASSIGN() { return getToken(my_grammarParser.RIGHT_SHIFT_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(my_grammarParser.POWER_ASSIGN, 0); }
		public TerminalNode IDIV_ASSIGN() { return getToken(my_grammarParser.IDIV_ASSIGN, 0); }
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MULT_ASSIGN) | (1L << AT_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << OR_ASSIGN) | (1L << XOR_ASSIGN) | (1L << LEFT_SHIFT_ASSIGN) | (1L << RIGHT_SHIFT_ASSIGN) | (1L << POWER_ASSIGN) | (1L << IDIV_ASSIGN))) != 0)) ) {
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

	public static class TestContext extends ParserRuleContext {
		public List<Or_testContext> or_test() {
			return getRuleContexts(Or_testContext.class);
		}
		public Or_testContext or_test(int i) {
			return getRuleContext(Or_testContext.class,i);
		}
		public TerminalNode IF() { return getToken(my_grammarParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(my_grammarParser.ELSE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public LambdefContext lambdef() {
			return getRuleContext(LambdefContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_test);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
			case ATOM:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				or_test();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(152);
					match(IF);
					setState(153);
					or_test();
					setState(154);
					match(ELSE);
					setState(155);
					test();
					}
				}

				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				lambdef();
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

	public static class Or_testContext extends ParserRuleContext {
		public List<And_testContext> and_test() {
			return getRuleContexts(And_testContext.class);
		}
		public And_testContext and_test(int i) {
			return getRuleContext(And_testContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(my_grammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(my_grammarParser.OR, i);
		}
		public Or_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_test; }
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			and_test();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(163);
				match(OR);
				setState(164);
				and_test();
				}
				}
				setState(169);
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

	public static class And_testContext extends ParserRuleContext {
		public List<Not_testContext> not_test() {
			return getRuleContexts(Not_testContext.class);
		}
		public Not_testContext not_test(int i) {
			return getRuleContext(Not_testContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(my_grammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(my_grammarParser.AND, i);
		}
		public And_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_test; }
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			not_test();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(171);
				match(AND);
				setState(172);
				not_test();
				}
				}
				setState(177);
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

	public static class Not_testContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(my_grammarParser.NOT, 0); }
		public Not_testContext not_test() {
			return getRuleContext(Not_testContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Not_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_test; }
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_not_test);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(NOT);
				setState(179);
				not_test();
				}
				break;
			case PLUS:
			case MINUS:
			case ATOM:
			case TILDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			expr();
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					comp_op();
					setState(185);
					expr();
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(my_grammarParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(my_grammarParser.GREATER_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(my_grammarParser.EQUALS, 0); }
		public TerminalNode GT_EQ() { return getToken(my_grammarParser.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(my_grammarParser.LT_EQ, 0); }
		public TerminalNode NOT_EQ_1() { return getToken(my_grammarParser.NOT_EQ_1, 0); }
		public TerminalNode NOT_EQ_2() { return getToken(my_grammarParser.NOT_EQ_2, 0); }
		public TerminalNode IN() { return getToken(my_grammarParser.IN, 0); }
		public TerminalNode NOT() { return getToken(my_grammarParser.NOT, 0); }
		public TerminalNode IS() { return getToken(my_grammarParser.IS, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comp_op);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(LESS_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(GREATER_THAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(GT_EQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(LT_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				match(NOT_EQ_1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				match(NOT_EQ_2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				match(NOT);
				setState(201);
				match(IN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(202);
				match(IS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(203);
				match(IS);
				setState(204);
				match(NOT);
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

	public static class Star_exprContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(my_grammarParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expr; }
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_star_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(STAR);
			setState(208);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public List<Xor_exprContext> xor_expr() {
			return getRuleContexts(Xor_exprContext.class);
		}
		public Xor_exprContext xor_expr(int i) {
			return getRuleContext(Xor_exprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(my_grammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(my_grammarParser.OR, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			xor_expr();
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					match(OR);
					setState(212);
					xor_expr();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(my_grammarParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(my_grammarParser.XOR, i);
		}
		public Xor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr; }
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			and_expr();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(219);
				match(XOR);
				setState(220);
				and_expr();
				}
				}
				setState(225);
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

	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(my_grammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(my_grammarParser.AND, i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_and_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			shift_expr();
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					match(AND);
					setState(228);
					shift_expr();
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Shift_exprContext extends ParserRuleContext {
		public List<Arith_exprContext> arith_expr() {
			return getRuleContexts(Arith_exprContext.class);
		}
		public Arith_exprContext arith_expr(int i) {
			return getRuleContext(Arith_exprContext.class,i);
		}
		public List<TerminalNode> LEFT_SHIFT() { return getTokens(my_grammarParser.LEFT_SHIFT); }
		public TerminalNode LEFT_SHIFT(int i) {
			return getToken(my_grammarParser.LEFT_SHIFT, i);
		}
		public List<TerminalNode> RIGHT_SHIFT() { return getTokens(my_grammarParser.RIGHT_SHIFT); }
		public TerminalNode RIGHT_SHIFT(int i) {
			return getToken(my_grammarParser.RIGHT_SHIFT, i);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			arith_expr();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SHIFT || _la==RIGHT_SHIFT) {
				{
				{
				setState(235);
				_la = _input.LA(1);
				if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(236);
				arith_expr();
				}
				}
				setState(241);
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

	public static class Arith_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(my_grammarParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(my_grammarParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(my_grammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(my_grammarParser.MINUS, i);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			term();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(243);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(244);
				term();
				}
				}
				setState(249);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(my_grammarParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(my_grammarParser.STAR, i);
		}
		public List<TerminalNode> AT() { return getTokens(my_grammarParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(my_grammarParser.AT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(my_grammarParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(my_grammarParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(my_grammarParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(my_grammarParser.MOD, i);
		}
		public List<TerminalNode> IDIV() { return getTokens(my_grammarParser.IDIV); }
		public TerminalNode IDIV(int i) {
			return getToken(my_grammarParser.IDIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			factor();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD) | (1L << IDIV) | (1L << AT))) != 0)) {
				{
				{
				setState(251);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD) | (1L << IDIV) | (1L << AT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(252);
				factor();
				}
				}
				setState(257);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(my_grammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(my_grammarParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(my_grammarParser.TILDE, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				_la = _input.LA(1);
				if ( !(((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (PLUS - 14)) | (1L << (MINUS - 14)) | (1L << (TILDE - 14)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(259);
				factor();
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				power();
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

	public static class PowerContext extends ParserRuleContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode POWER() { return getToken(my_grammarParser.POWER, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			atom_expr();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(264);
				match(POWER);
				setState(265);
				factor();
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

	public static class Atom_exprContext extends ParserRuleContext {
		public TerminalNode ATOM() { return getToken(my_grammarParser.ATOM, 0); }
		public TerminalNode AWAIT() { return getToken(my_grammarParser.AWAIT, 0); }
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atom_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ATOM);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(269);
				match(AWAIT);
				}
			}

			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4))) != 0)) {
				{
				{
				setState(272);
				trailer();
				}
				}
				setState(277);
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

	public static class TrailerContext extends ParserRuleContext {
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public SubscriptlistContext subscriptlist() {
			return getRuleContext(SubscriptlistContext.class,0);
		}
		public TerminalNode NAME() { return getToken(my_grammarParser.NAME, 0); }
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_trailer);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__0);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (PLUS - 14)) | (1L << (MINUS - 14)) | (1L << (NOT - 14)) | (1L << (ATOM - 14)) | (1L << (LAMBDA - 14)) | (1L << (TILDE - 14)))) != 0)) {
					{
					setState(279);
					arglist();
					}
				}

				setState(282);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(T__2);
				setState(284);
				subscriptlist();
				setState(285);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(T__4);
				setState(288);
				match(NAME);
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

	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(my_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(my_grammarParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			argument();
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(292);
					match(COMMA);
					setState(293);
					argument();
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(299);
				match(COMMA);
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(my_grammarParser.EQUALS, 0); }
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(302);
				test();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(303);
					comp_for();
					}
				}

				}
				break;
			case 2:
				{
				setState(306);
				test();
				setState(307);
				match(EQUALS);
				setState(308);
				test();
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_compound_stmt);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				for_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				funcdef();
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(my_grammarParser.WHILE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode COLON() { return getToken(my_grammarParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(WHILE);
			setState(319);
			test();
			setState(320);
			match(COLON);
			setState(321);
			suite();
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(my_grammarParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(my_grammarParser.NAME, 0); }
		public TerminalNode IN() { return getToken(my_grammarParser.IN, 0); }
		public Range_funcContext range_func() {
			return getRuleContext(Range_funcContext.class,0);
		}
		public TerminalNode COLON() { return getToken(my_grammarParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(FOR);
			setState(324);
			match(NAME);
			setState(325);
			match(IN);
			setState(326);
			range_func();
			setState(327);
			match(COLON);
			setState(328);
			suite();
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

	public static class Range_funcContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(my_grammarParser.RANGE, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(my_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(my_grammarParser.COMMA, i);
		}
		public Range_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_func; }
	}

	public final Range_funcContext range_func() throws RecognitionException {
		Range_funcContext _localctx = new Range_funcContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_range_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(RANGE);
			setState(331);
			match(T__0);
			setState(332);
			test();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(333);
				match(COMMA);
				setState(334);
				test();
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(335);
					match(COMMA);
					setState(336);
					test();
					}
				}

				}
			}

			setState(341);
			match(T__1);
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(my_grammarParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(my_grammarParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(my_grammarParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(DEF);
			setState(344);
			match(NAME);
			setState(345);
			parameters();
			setState(346);
			match(COLON);
			setState(347);
			suite();
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

	public static class ParametersContext extends ParserRuleContext {
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__0);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << STAR) | (1L << POWER))) != 0)) {
				{
				setState(350);
				typedargslist();
				}
			}

			setState(353);
			match(T__1);
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

	public static class TypedargslistContext extends ParserRuleContext {
		public List<TfpdefContext> tfpdef() {
			return getRuleContexts(TfpdefContext.class);
		}
		public TfpdefContext tfpdef(int i) {
			return getRuleContext(TfpdefContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(my_grammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(my_grammarParser.COLON, i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(my_grammarParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(my_grammarParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(my_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(my_grammarParser.COMMA, i);
		}
		public VariadicargsContext variadicargs() {
			return getRuleContext(VariadicargsContext.class,0);
		}
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typedargslist);
		int _la;
		try {
			int _alt;
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				tfpdef();
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(356);
					match(COLON);
					setState(357);
					test();
					}
					break;
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(360);
					match(ASSIGN);
					setState(361);
					test();
					}
				}

				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(364);
						match(COMMA);
						setState(365);
						tfpdef();
						setState(368);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(366);
							match(COLON);
							setState(367);
							test();
							}
							break;
						}
						setState(372);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(370);
							match(ASSIGN);
							setState(371);
							test();
							}
						}

						}
						} 
					}
					setState(378);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(379);
					match(COMMA);
					setState(380);
					variadicargs();
					}
				}

				}
				break;
			case STAR:
			case POWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				variadicargs();
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

	public static class VariadicargsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(my_grammarParser.STAR, 0); }
		public List<TerminalNode> NAME() { return getTokens(my_grammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(my_grammarParser.NAME, i);
		}
		public List<TerminalNode> COLON() { return getTokens(my_grammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(my_grammarParser.COLON, i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(my_grammarParser.COMMA, 0); }
		public TerminalNode POWER() { return getToken(my_grammarParser.POWER, 0); }
		public VariadicargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variadicargs; }
	}

	public final VariadicargsContext variadicargs() throws RecognitionException {
		VariadicargsContext _localctx = new VariadicargsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variadicargs);
		int _la;
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(STAR);
				setState(387);
				match(NAME);
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(388);
					match(COLON);
					setState(389);
					test();
					}
					break;
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(392);
					match(COMMA);
					setState(393);
					match(POWER);
					setState(394);
					match(NAME);
					setState(397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(395);
						match(COLON);
						setState(396);
						test();
						}
						break;
					}
					}
				}

				}
				break;
			case POWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(POWER);
				setState(402);
				match(NAME);
				setState(405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(403);
					match(COLON);
					setState(404);
					test();
					}
					break;
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

	public static class TfpdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(my_grammarParser.NAME, 0); }
		public TfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfpdef; }
	}

	public final TfpdefContext tfpdef() throws RecognitionException {
		TfpdefContext _localctx = new TfpdefContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tfpdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(NAME);
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

	public static class Yield_exprContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(my_grammarParser.YIELD, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Yield_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_expr; }
	}

	public final Yield_exprContext yield_expr() throws RecognitionException {
		Yield_exprContext _localctx = new Yield_exprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_yield_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(YIELD);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (PLUS - 14)) | (1L << (MINUS - 14)) | (1L << (NOT - 14)) | (1L << (ATOM - 14)) | (1L << (LAMBDA - 14)) | (1L << (TILDE - 14)))) != 0)) {
				{
				setState(412);
				testlist();
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

	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(my_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(my_grammarParser.COMMA, i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_testlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			test();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(416);
				match(COMMA);
				setState(417);
				test();
				}
				}
				setState(422);
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

	public static class LambdefContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(my_grammarParser.LAMBDA, 0); }
		public TerminalNode COLON() { return getToken(my_grammarParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public LambdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef; }
	}

	public final LambdefContext lambdef() throws RecognitionException {
		LambdefContext _localctx = new LambdefContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lambdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(LAMBDA);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << STAR) | (1L << POWER))) != 0)) {
				{
				setState(424);
				typedargslist();
				}
			}

			setState(427);
			match(COLON);
			setState(428);
			test();
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

	public static class SubscriptlistContext extends ParserRuleContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(my_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(my_grammarParser.COMMA, i);
		}
		public SubscriptlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptlist; }
	}

	public final SubscriptlistContext subscriptlist() throws RecognitionException {
		SubscriptlistContext _localctx = new SubscriptlistContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subscriptlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			subscript();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431);
				match(COMMA);
				setState(432);
				subscript();
				}
				}
				setState(437);
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

	public static class Comp_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(my_grammarParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(my_grammarParser.IN, 0); }
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public Comp_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_for; }
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_comp_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(FOR);
			setState(439);
			exprlist();
			setState(440);
			match(IN);
			setState(441);
			or_test();
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(my_grammarParser.IF, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(my_grammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(my_grammarParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(my_grammarParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(my_grammarParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(my_grammarParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(IF);
			setState(444);
			test();
			setState(445);
			match(COLON);
			setState(446);
			suite();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(447);
				match(ELIF);
				setState(448);
				test();
				setState(449);
				match(COLON);
				setState(450);
				suite();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(457);
				match(ELSE);
				setState(458);
				match(COLON);
				setState(459);
				suite();
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

	public static class SuiteContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(my_grammarParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(my_grammarParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(my_grammarParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_suite);
		int _la;
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case ATOM:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(NEWLINE);
				setState(464);
				match(INDENT);
				setState(466); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(465);
					stmt();
					}
					}
					setState(468); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (PLUS - 14)) | (1L << (MINUS - 14)) | (1L << (IF - 14)) | (1L << (ATOM - 14)) | (1L << (DEF - 14)) | (1L << (WHILE - 14)) | (1L << (FOR - 14)) | (1L << (TILDE - 14)))) != 0) );
				setState(470);
				match(DEDENT);
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

	public static class SubscriptContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(my_grammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(my_grammarParser.COLON, i);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_subscript);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (PLUS - 14)) | (1L << (MINUS - 14)) | (1L << (NOT - 14)) | (1L << (ATOM - 14)) | (1L << (LAMBDA - 14)) | (1L << (TILDE - 14)))) != 0)) {
					{
					setState(475);
					test();
					}
				}

				setState(478);
				match(COLON);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (PLUS - 14)) | (1L << (MINUS - 14)) | (1L << (NOT - 14)) | (1L << (ATOM - 14)) | (1L << (LAMBDA - 14)) | (1L << (TILDE - 14)))) != 0)) {
					{
					setState(479);
					test();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				test();
				setState(483);
				match(COLON);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (PLUS - 14)) | (1L << (MINUS - 14)) | (1L << (NOT - 14)) | (1L << (ATOM - 14)) | (1L << (LAMBDA - 14)) | (1L << (TILDE - 14)))) != 0)) {
					{
					setState(484);
					test();
					}
				}

				setState(487);
				match(COLON);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (PLUS - 14)) | (1L << (MINUS - 14)) | (1L << (NOT - 14)) | (1L << (ATOM - 14)) | (1L << (LAMBDA - 14)) | (1L << (TILDE - 14)))) != 0)) {
					{
					setState(488);
					test();
					}
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(my_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(my_grammarParser.COMMA, i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exprlist);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(493);
					expr();
					setState(494);
					match(COMMA);
					}
					}
					setState(498); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (PLUS - 14)) | (1L << (MINUS - 14)) | (1L << (ATOM - 14)) | (1L << (TILDE - 14)))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				expr();
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

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(my_grammarParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(PRINT);
			setState(504);
			expression();
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
		public TerminalNode NUMBER() { return getToken(my_grammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(my_grammarParser.STRING, 0); }
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expression);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(STRING);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				print_statement();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u0202\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\7\2c\n\2\f\2\16\2f\13\2\3\2\3"+
		"\2\3\3\3\3\5\3l\n\3\3\4\3\4\3\4\7\4q\n\4\f\4\16\4t\13\4\3\4\5\4w\n\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\7\3\7\3\7\3\b"+
		"\3\b\5\b\u0089\n\b\3\b\3\b\3\b\5\b\u008e\n\b\7\b\u0090\n\b\f\b\16\b\u0093"+
		"\13\b\3\b\5\b\u0096\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a0\n\n"+
		"\3\n\5\n\u00a3\n\n\3\13\3\13\3\13\7\13\u00a8\n\13\f\13\16\13\u00ab\13"+
		"\13\3\f\3\f\3\f\7\f\u00b0\n\f\f\f\16\f\u00b3\13\f\3\r\3\r\3\r\5\r\u00b8"+
		"\n\r\3\16\3\16\3\16\3\16\7\16\u00be\n\16\f\16\16\16\u00c1\13\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d0"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00d8\n\21\f\21\16\21\u00db\13"+
		"\21\3\22\3\22\3\22\7\22\u00e0\n\22\f\22\16\22\u00e3\13\22\3\23\3\23\3"+
		"\23\7\23\u00e8\n\23\f\23\16\23\u00eb\13\23\3\24\3\24\3\24\7\24\u00f0\n"+
		"\24\f\24\16\24\u00f3\13\24\3\25\3\25\3\25\7\25\u00f8\n\25\f\25\16\25\u00fb"+
		"\13\25\3\26\3\26\3\26\7\26\u0100\n\26\f\26\16\26\u0103\13\26\3\27\3\27"+
		"\3\27\5\27\u0108\n\27\3\30\3\30\3\30\5\30\u010d\n\30\3\31\3\31\5\31\u0111"+
		"\n\31\3\31\7\31\u0114\n\31\f\31\16\31\u0117\13\31\3\32\3\32\5\32\u011b"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0124\n\32\3\33\3\33\3\33"+
		"\7\33\u0129\n\33\f\33\16\33\u012c\13\33\3\33\5\33\u012f\n\33\3\34\3\34"+
		"\5\34\u0133\n\34\3\34\3\34\3\34\3\34\5\34\u0139\n\34\3\35\3\35\3\35\3"+
		"\35\5\35\u013f\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 \u0154\n \5 \u0156\n \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\5\"\u0162\n\"\3\"\3\"\3#\3#\3#\5#\u0169\n#\3#\3#\5"+
		"#\u016d\n#\3#\3#\3#\3#\5#\u0173\n#\3#\3#\5#\u0177\n#\7#\u0179\n#\f#\16"+
		"#\u017c\13#\3#\3#\5#\u0180\n#\3#\5#\u0183\n#\3$\3$\3$\3$\5$\u0189\n$\3"+
		"$\3$\3$\3$\3$\5$\u0190\n$\5$\u0192\n$\3$\3$\3$\3$\5$\u0198\n$\5$\u019a"+
		"\n$\3%\3%\3&\3&\5&\u01a0\n&\3\'\3\'\3\'\7\'\u01a5\n\'\f\'\16\'\u01a8\13"+
		"\'\3(\3(\5(\u01ac\n(\3(\3(\3(\3)\3)\3)\7)\u01b4\n)\f)\16)\u01b7\13)\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u01c7\n+\f+\16+\u01ca\13+"+
		"\3+\3+\3+\5+\u01cf\n+\3,\3,\3,\3,\6,\u01d5\n,\r,\16,\u01d6\3,\3,\5,\u01db"+
		"\n,\3-\3-\5-\u01df\n-\3-\3-\5-\u01e3\n-\3-\3-\3-\5-\u01e8\n-\3-\3-\5-"+
		"\u01ec\n-\5-\u01ee\n-\3.\3.\3.\6.\u01f3\n.\r.\16.\u01f4\3.\5.\u01f8\n"+
		".\3/\3/\3/\3\60\3\60\3\60\5\60\u0200\n\60\3\60\2\2\61\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\7\3"+
		"\2-9\3\2+,\3\2\20\21\4\2\22\22\24\27\4\2\20\21EE\2\u0221\2d\3\2\2\2\4"+
		"k\3\2\2\2\6m\3\2\2\2\bz\3\2\2\2\n|\3\2\2\2\f\u0083\3\2\2\2\16\u0088\3"+
		"\2\2\2\20\u0097\3\2\2\2\22\u00a2\3\2\2\2\24\u00a4\3\2\2\2\26\u00ac\3\2"+
		"\2\2\30\u00b7\3\2\2\2\32\u00b9\3\2\2\2\34\u00cf\3\2\2\2\36\u00d1\3\2\2"+
		"\2 \u00d4\3\2\2\2\"\u00dc\3\2\2\2$\u00e4\3\2\2\2&\u00ec\3\2\2\2(\u00f4"+
		"\3\2\2\2*\u00fc\3\2\2\2,\u0107\3\2\2\2.\u0109\3\2\2\2\60\u010e\3\2\2\2"+
		"\62\u0123\3\2\2\2\64\u0125\3\2\2\2\66\u0138\3\2\2\28\u013e\3\2\2\2:\u0140"+
		"\3\2\2\2<\u0145\3\2\2\2>\u014c\3\2\2\2@\u0159\3\2\2\2B\u015f\3\2\2\2D"+
		"\u0182\3\2\2\2F\u0199\3\2\2\2H\u019b\3\2\2\2J\u019d\3\2\2\2L\u01a1\3\2"+
		"\2\2N\u01a9\3\2\2\2P\u01b0\3\2\2\2R\u01b8\3\2\2\2T\u01bd\3\2\2\2V\u01da"+
		"\3\2\2\2X\u01ed\3\2\2\2Z\u01f7\3\2\2\2\\\u01f9\3\2\2\2^\u01ff\3\2\2\2"+
		"`c\7\b\2\2ac\5\4\3\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2"+
		"eg\3\2\2\2fd\3\2\2\2gh\7\2\2\3h\3\3\2\2\2il\5\6\4\2jl\58\35\2ki\3\2\2"+
		"\2kj\3\2\2\2l\5\3\2\2\2mr\5\b\5\2no\7*\2\2oq\5\b\5\2pn\3\2\2\2qt\3\2\2"+
		"\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2uw\7*\2\2vu\3\2\2\2vw\3\2\2"+
		"\2wx\3\2\2\2xy\7\b\2\2y\7\3\2\2\2z{\5\n\6\2{\t\3\2\2\2|\u0080\5 \21\2"+
		"}\177\5\f\7\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\13\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\17\2\2\u0084"+
		"\u0085\5 \21\2\u0085\r\3\2\2\2\u0086\u0089\5\22\n\2\u0087\u0089\5\36\20"+
		"\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u0091\3\2\2\2\u008a\u008d"+
		"\7(\2\2\u008b\u008e\5\22\n\2\u008c\u008e\5\36\20\2\u008d\u008b\3\2\2\2"+
		"\u008d\u008c\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008a\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0096\7(\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\17\3\2\2\2\u0097\u0098\t\2\2\2\u0098\21\3\2\2\2\u0099\u009f"+
		"\5\24\13\2\u009a\u009b\7\'\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7&\2"+
		"\2\u009d\u009e\5\22\n\2\u009e\u00a0\3\2\2\2\u009f\u009a\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\5N(\2\u00a2\u0099\3\2\2"+
		"\2\u00a2\u00a1\3\2\2\2\u00a3\23\3\2\2\2\u00a4\u00a9\5\26\f\2\u00a5\u00a6"+
		"\7\37\2\2\u00a6\u00a8\5\26\f\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\25\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00b1\5\30\r\2\u00ad\u00ae\7!\2\2\u00ae\u00b0\5\30\r\2"+
		"\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\27\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\"\2\2\u00b5"+
		"\u00b8\5\30\r\2\u00b6\u00b8\5\32\16\2\u00b7\u00b4\3\2\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\31\3\2\2\2\u00b9\u00bf\5 \21\2\u00ba\u00bb\5\34\17\2\u00bb"+
		"\u00bc\5 \21\2\u00bc\u00be\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\33\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\u00d0\7\30\2\2\u00c3\u00d0\7\31\2\2\u00c4\u00d0\7\32\2"+
		"\2\u00c5\u00d0\7\33\2\2\u00c6\u00d0\7\34\2\2\u00c7\u00d0\7\35\2\2\u00c8"+
		"\u00d0\7\36\2\2\u00c9\u00d0\7$\2\2\u00ca\u00cb\7\"\2\2\u00cb\u00d0\7$"+
		"\2\2\u00cc\u00d0\7#\2\2\u00cd\u00ce\7#\2\2\u00ce\u00d0\7\"\2\2\u00cf\u00c2"+
		"\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c4\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf"+
		"\u00c6\3\2\2\2\u00cf\u00c7\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2"+
		"\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\35\3\2\2\2\u00d1\u00d2\7\22\2\2\u00d2\u00d3\5 \21\2\u00d3\37\3\2\2\2"+
		"\u00d4\u00d9\5\"\22\2\u00d5\u00d6\7\37\2\2\u00d6\u00d8\5\"\22\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da!\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e1\5$\23\2\u00dd\u00de"+
		"\7 \2\2\u00de\u00e0\5$\23\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2#\3\2\2\2\u00e3\u00e1\3\2\2\2"+
		"\u00e4\u00e9\5&\24\2\u00e5\u00e6\7!\2\2\u00e6\u00e8\5&\24\2\u00e7\u00e5"+
		"\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"%\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f1\5(\25\2\u00ed\u00ee\t\3\2\2"+
		"\u00ee\u00f0\5(\25\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\'\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f9\5*\26\2\u00f5\u00f6\t\4\2\2\u00f6\u00f8\5*\26\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		")\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0101\5,\27\2\u00fd\u00fe\t\5\2\2"+
		"\u00fe\u0100\5,\27\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102+\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0105\t\6\2\2\u0105\u0108\5,\27\2\u0106\u0108\5.\30\2\u0107\u0104\3\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108-\3\2\2\2\u0109\u010c\5\60\31\2\u010a\u010b"+
		"\7\23\2\2\u010b\u010d\5,\27\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010d/\3\2\2\2\u010e\u0110\7;\2\2\u010f\u0111\7:\2\2\u0110\u010f\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0115\3\2\2\2\u0112\u0114\5\62\32\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\61\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\7\3\2\2\u0119\u011b"+
		"\5\64\33\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u0124\7\4\2\2\u011d\u011e\7\5\2\2\u011e\u011f\5P)\2\u011f\u0120"+
		"\7\6\2\2\u0120\u0124\3\2\2\2\u0121\u0122\7\7\2\2\u0122\u0124\7\t\2\2\u0123"+
		"\u0118\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u0121\3\2\2\2\u0124\63\3\2\2"+
		"\2\u0125\u012a\5\66\34\2\u0126\u0127\7(\2\2\u0127\u0129\5\66\34\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\7(\2\2\u012e"+
		"\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\65\3\2\2\2\u0130\u0132\5\22\n"+
		"\2\u0131\u0133\5R*\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0139"+
		"\3\2\2\2\u0134\u0135\5\22\n\2\u0135\u0136\7\32\2\2\u0136\u0137\5\22\n"+
		"\2\u0137\u0139\3\2\2\2\u0138\u0130\3\2\2\2\u0138\u0134\3\2\2\2\u0139\67"+
		"\3\2\2\2\u013a\u013f\5T+\2\u013b\u013f\5:\36\2\u013c\u013f\5<\37\2\u013d"+
		"\u013f\5@!\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2"+
		"\2\u013e\u013d\3\2\2\2\u013f9\3\2\2\2\u0140\u0141\7@\2\2\u0141\u0142\5"+
		"\22\n\2\u0142\u0143\7)\2\2\u0143\u0144\5V,\2\u0144;\3\2\2\2\u0145\u0146"+
		"\7A\2\2\u0146\u0147\7\t\2\2\u0147\u0148\7$\2\2\u0148\u0149\5> \2\u0149"+
		"\u014a\7)\2\2\u014a\u014b\5V,\2\u014b=\3\2\2\2\u014c\u014d\7B\2\2\u014d"+
		"\u014e\7\3\2\2\u014e\u0155\5\22\n\2\u014f\u0150\7(\2\2\u0150\u0153\5\22"+
		"\n\2\u0151\u0152\7(\2\2\u0152\u0154\5\22\n\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u014f\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7\4\2\2\u0158?\3\2\2\2\u0159\u015a"+
		"\7?\2\2\u015a\u015b\7\t\2\2\u015b\u015c\5B\"\2\u015c\u015d\7)\2\2\u015d"+
		"\u015e\5V,\2\u015eA\3\2\2\2\u015f\u0161\7\3\2\2\u0160\u0162\5D#\2\u0161"+
		"\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\4"+
		"\2\2\u0164C\3\2\2\2\u0165\u0168\5H%\2\u0166\u0167\7)\2\2\u0167\u0169\5"+
		"\22\n\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u016b\7\17\2\2\u016b\u016d\5\22\n\2\u016c\u016a\3\2\2\2\u016c\u016d\3"+
		"\2\2\2\u016d\u017a\3\2\2\2\u016e\u016f\7(\2\2\u016f\u0172\5H%\2\u0170"+
		"\u0171\7)\2\2\u0171\u0173\5\22\n\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0176\3\2\2\2\u0174\u0175\7\17\2\2\u0175\u0177\5\22\n\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u016e\3\2"+
		"\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017f\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7(\2\2\u017e\u0180\5F$"+
		"\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u0183"+
		"\5F$\2\u0182\u0165\3\2\2\2\u0182\u0181\3\2\2\2\u0183E\3\2\2\2\u0184\u0185"+
		"\7\22\2\2\u0185\u0188\7\t\2\2\u0186\u0187\7)\2\2\u0187\u0189\5\22\n\2"+
		"\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0191\3\2\2\2\u018a\u018b"+
		"\7(\2\2\u018b\u018c\7\23\2\2\u018c\u018f\7\t\2\2\u018d\u018e\7)\2\2\u018e"+
		"\u0190\5\22\n\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3"+
		"\2\2\2\u0191\u018a\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u019a\3\2\2\2\u0193"+
		"\u0194\7\23\2\2\u0194\u0197\7\t\2\2\u0195\u0196\7)\2\2\u0196\u0198\5\22"+
		"\n\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199"+
		"\u0184\3\2\2\2\u0199\u0193\3\2\2\2\u019aG\3\2\2\2\u019b\u019c\7\t\2\2"+
		"\u019cI\3\2\2\2\u019d\u019f\7C\2\2\u019e\u01a0\5L\'\2\u019f\u019e\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0K\3\2\2\2\u01a1\u01a6\5\22\n\2\u01a2\u01a3"+
		"\7(\2\2\u01a3\u01a5\5\22\n\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7M\3\2\2\2\u01a8\u01a6\3\2\2\2"+
		"\u01a9\u01ab\7D\2\2\u01aa\u01ac\5D#\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7)\2\2\u01ae\u01af\5\22\n\2\u01af"+
		"O\3\2\2\2\u01b0\u01b5\5X-\2\u01b1\u01b2\7(\2\2\u01b2\u01b4\5X-\2\u01b3"+
		"\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6Q\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7A\2\2\u01b9\u01ba"+
		"\5Z.\2\u01ba\u01bb\7$\2\2\u01bb\u01bc\5\24\13\2\u01bcS\3\2\2\2\u01bd\u01be"+
		"\7\'\2\2\u01be\u01bf\5\22\n\2\u01bf\u01c0\7)\2\2\u01c0\u01c8\5V,\2\u01c1"+
		"\u01c2\7%\2\2\u01c2\u01c3\5\22\n\2\u01c3\u01c4\7)\2\2\u01c4\u01c5\5V,"+
		"\2\u01c5\u01c7\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6"+
		"\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ce\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb"+
		"\u01cc\7&\2\2\u01cc\u01cd\7)\2\2\u01cd\u01cf\5V,\2\u01ce\u01cb\3\2\2\2"+
		"\u01ce\u01cf\3\2\2\2\u01cfU\3\2\2\2\u01d0\u01db\5\6\4\2\u01d1\u01d2\7"+
		"\b\2\2\u01d2\u01d4\7\r\2\2\u01d3\u01d5\5\4\3\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d9\7\16\2\2\u01d9\u01db\3\2\2\2\u01da\u01d0\3\2\2\2\u01da"+
		"\u01d1\3\2\2\2\u01dbW\3\2\2\2\u01dc\u01ee\5\22\n\2\u01dd\u01df\5\22\n"+
		"\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2"+
		"\7)\2\2\u01e1\u01e3\5\22\n\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01ee\3\2\2\2\u01e4\u01e5\5\22\n\2\u01e5\u01e7\7)\2\2\u01e6\u01e8\5\22"+
		"\n\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\7)\2\2\u01ea\u01ec\5\22\n\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01dc\3\2\2\2\u01ed\u01de\3\2\2\2\u01ed"+
		"\u01e4\3\2\2\2\u01eeY\3\2\2\2\u01ef\u01f0\5 \21\2\u01f0\u01f1\7(\2\2\u01f1"+
		"\u01f3\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f8\5 \21\2\u01f7"+
		"\u01f2\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8[\3\2\2\2\u01f9\u01fa\7F\2\2\u01fa"+
		"\u01fb\5^\60\2\u01fb]\3\2\2\2\u01fc\u0200\7\n\2\2\u01fd\u0200\7\13\2\2"+
		"\u01fe\u0200\5\\/\2\u01ff\u01fc\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe"+
		"\3\2\2\2\u0200_\3\2\2\2Cbdkrv\u0080\u0088\u008d\u0091\u0095\u009f\u00a2"+
		"\u00a9\u00b1\u00b7\u00bf\u00cf\u00d9\u00e1\u00e9\u00f1\u00f9\u0101\u0107"+
		"\u010c\u0110\u0115\u011a\u0123\u012a\u012e\u0132\u0138\u013e\u0153\u0155"+
		"\u0161\u0168\u016c\u0172\u0176\u017a\u017f\u0182\u0188\u018f\u0191\u0197"+
		"\u0199\u019f\u01a6\u01ab\u01b5\u01c8\u01ce\u01d6\u01da\u01de\u01e2\u01e7"+
		"\u01eb\u01ed\u01f4\u01f7\u01ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}