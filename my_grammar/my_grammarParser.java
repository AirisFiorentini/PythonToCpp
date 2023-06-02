// Generated from my_grammar.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class my_grammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

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
		TILDE=67;
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
		RULE_subscript = 43, RULE_exprlist = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_input", "stmt", "simple_stmt", "small_stmt", "expr_stmt", "assign_expr", 
			"testlist_star_expr", "augassign", "test", "or_test", "and_test", "not_test", 
			"comparison", "comp_op", "star_expr", "expr", "xor_expr", "and_expr", 
			"shift_expr", "arith_expr", "term", "factor", "power", "atom_expr", "trailer", 
			"arglist", "argument", "compound_stmt", "while_stmt", "for_stmt", "range_func", 
			"funcdef", "parameters", "typedargslist", "variadicargs", "tfpdef", "yield_expr", 
			"testlist", "lambdef", "subscriptlist", "comp_for", "if_stmt", "suite", 
			"subscript", "exprlist"
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
			"'lambda'", "'~'"
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
			"LAMBDA", "TILDE"
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterFile_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitFile_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitFile_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 2560296390307611393L) != 0)) {
				{
				setState(92);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(90);
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
					setState(91);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case ATOM:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				simple_stmt();
				}
				break;
			case IF:
			case DEF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			small_stmt();
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(SEMI_COLON);
					setState(105);
					small_stmt();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(111);
				match(SEMI_COLON);
				}
			}

			setState(114);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Small_stmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterSmall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitSmall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_small_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			expr();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSIGN) {
				{
				{
				setState(119);
				assign_expr();
				}
				}
				setState(124);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_exprContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(my_grammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitAssign_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ASSIGN);
			setState(126);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterTestlist_star_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitTestlist_star_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitTestlist_star_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_star_exprContext testlist_star_expr() throws RecognitionException {
		Testlist_star_exprContext _localctx = new Testlist_star_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_testlist_star_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
			case ATOM:
			case LAMBDA:
			case TILDE:
				{
				setState(128);
				test();
				}
				break;
			case STAR:
				{
				setState(129);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					match(COMMA);
					setState(135);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
					case MINUS:
					case NOT:
					case ATOM:
					case LAMBDA:
					case TILDE:
						{
						setState(133);
						test();
						}
						break;
					case STAR:
						{
						setState(134);
						star_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(142);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterAugassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitAugassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitAugassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 72048797944905728L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_test);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
			case ATOM:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				or_test();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(148);
					match(IF);
					setState(149);
					or_test();
					setState(150);
					match(ELSE);
					setState(151);
					test();
					}
				}

				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterOr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitOr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitOr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			and_test();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(159);
				match(OR);
				setState(160);
				and_test();
				}
				}
				setState(165);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterAnd_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitAnd_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitAnd_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			not_test();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(167);
				match(AND);
				setState(168);
				not_test();
				}
				}
				setState(173);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterNot_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitNot_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitNot_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_not_test);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(NOT);
				setState(175);
				not_test();
				}
				break;
			case PLUS:
			case MINUS:
			case ATOM:
			case TILDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			expr();
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					comp_op();
					setState(181);
					expr();
					}
					} 
				}
				setState(187);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comp_op);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(LESS_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(GREATER_THAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(GT_EQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(LT_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				match(NOT_EQ_1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				match(NOT_EQ_2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(196);
				match(NOT);
				setState(197);
				match(IN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(198);
				match(IS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(199);
				match(IS);
				setState(200);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Star_exprContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(my_grammarParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterStar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitStar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitStar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_star_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(STAR);
			setState(204);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			xor_expr();
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					match(OR);
					setState(208);
					xor_expr();
					}
					} 
				}
				setState(213);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterXor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitXor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitXor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			and_expr();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(215);
				match(XOR);
				setState(216);
				and_expr();
				}
				}
				setState(221);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitAnd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_and_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			shift_expr();
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
					match(AND);
					setState(224);
					shift_expr();
					}
					} 
				}
				setState(229);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterShift_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitShift_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitShift_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			arith_expr();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SHIFT || _la==RIGHT_SHIFT) {
				{
				{
				setState(231);
				_la = _input.LA(1);
				if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				arith_expr();
				}
				}
				setState(237);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterArith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitArith_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitArith_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			term();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				term();
				}
				}
				setState(245);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			factor();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3997696L) != 0)) {
				{
				{
				setState(247);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3997696L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(248);
				factor();
				}
				}
				setState(253);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				_la = _input.LA(1);
				if ( !(((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 9007199254740995L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				factor();
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			atom_expr();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(260);
				match(POWER);
				setState(261);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterAtom_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitAtom_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitAtom_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atom_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ATOM);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(265);
				match(AWAIT);
				}
			}

			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0)) {
				{
				{
				setState(268);
				trailer();
				}
				}
				setState(273);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_trailer);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(T__0);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 13519594975395843L) != 0)) {
					{
					setState(275);
					arglist();
					}
				}

				setState(278);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(T__2);
				setState(280);
				subscriptlist();
				setState(281);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(T__4);
				setState(284);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			argument();
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					match(COMMA);
					setState(289);
					argument();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(295);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(298);
				test();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(299);
					comp_for();
					}
				}

				}
				break;
			case 2:
				{
				setState(302);
				test();
				setState(303);
				match(EQUALS);
				setState(304);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_compound_stmt);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				for_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(WHILE);
			setState(315);
			test();
			setState(316);
			match(COLON);
			setState(317);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(FOR);
			setState(320);
			match(NAME);
			setState(321);
			match(IN);
			setState(322);
			range_func();
			setState(323);
			match(COLON);
			setState(324);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterRange_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitRange_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitRange_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_funcContext range_func() throws RecognitionException {
		Range_funcContext _localctx = new Range_funcContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_range_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(RANGE);
			setState(327);
			match(T__0);
			setState(328);
			test();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(329);
				match(COMMA);
				setState(330);
				test();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(331);
					match(COMMA);
					setState(332);
					test();
					}
				}

				}
			}

			setState(337);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(DEF);
			setState(340);
			match(NAME);
			setState(341);
			parameters();
			setState(342);
			match(COLON);
			setState(343);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__0);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 196736L) != 0)) {
				{
				setState(346);
				typedargslist();
				}
			}

			setState(349);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterTypedargslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitTypedargslist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitTypedargslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typedargslist);
		int _la;
		try {
			int _alt;
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				tfpdef();
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(352);
					match(COLON);
					setState(353);
					test();
					}
					break;
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(356);
					match(ASSIGN);
					setState(357);
					test();
					}
				}

				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(360);
						match(COMMA);
						setState(361);
						tfpdef();
						setState(364);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(362);
							match(COLON);
							setState(363);
							test();
							}
							break;
						}
						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(366);
							match(ASSIGN);
							setState(367);
							test();
							}
						}

						}
						} 
					}
					setState(374);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(375);
					match(COMMA);
					setState(376);
					variadicargs();
					}
				}

				}
				break;
			case STAR:
			case POWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterVariadicargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitVariadicargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitVariadicargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariadicargsContext variadicargs() throws RecognitionException {
		VariadicargsContext _localctx = new VariadicargsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variadicargs);
		int _la;
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				match(STAR);
				setState(383);
				match(NAME);
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(384);
					match(COLON);
					setState(385);
					test();
					}
					break;
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(388);
					match(COMMA);
					setState(389);
					match(POWER);
					setState(390);
					match(NAME);
					setState(393);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(391);
						match(COLON);
						setState(392);
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
				setState(397);
				match(POWER);
				setState(398);
				match(NAME);
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(399);
					match(COLON);
					setState(400);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TfpdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(my_grammarParser.NAME, 0); }
		public TfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfpdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterTfpdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitTfpdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitTfpdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TfpdefContext tfpdef() throws RecognitionException {
		TfpdefContext _localctx = new TfpdefContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tfpdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Yield_exprContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(my_grammarParser.YIELD, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Yield_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterYield_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitYield_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitYield_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_exprContext yield_expr() throws RecognitionException {
		Yield_exprContext _localctx = new Yield_exprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_yield_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(YIELD);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 13519594975395843L) != 0)) {
				{
				setState(408);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterTestlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitTestlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitTestlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_testlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			test();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(412);
				match(COMMA);
				setState(413);
				test();
				}
				}
				setState(418);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterLambdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitLambdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitLambdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdefContext lambdef() throws RecognitionException {
		LambdefContext _localctx = new LambdefContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lambdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(LAMBDA);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 196736L) != 0)) {
				{
				setState(420);
				typedargslist();
				}
			}

			setState(423);
			match(COLON);
			setState(424);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterSubscriptlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitSubscriptlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitSubscriptlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptlistContext subscriptlist() throws RecognitionException {
		SubscriptlistContext _localctx = new SubscriptlistContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subscriptlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			subscript();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(427);
				match(COMMA);
				setState(428);
				subscript();
				}
				}
				setState(433);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterComp_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitComp_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitComp_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_comp_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(FOR);
			setState(435);
			exprlist();
			setState(436);
			match(IN);
			setState(437);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(IF);
			setState(440);
			test();
			setState(441);
			match(COLON);
			setState(442);
			suite();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(443);
				match(ELIF);
				setState(444);
				test();
				setState(445);
				match(COLON);
				setState(446);
				suite();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(453);
				match(ELSE);
				setState(454);
				match(COLON);
				setState(455);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_suite);
		int _la;
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case ATOM:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(NEWLINE);
				setState(460);
				match(INDENT);
				setState(462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(461);
					stmt();
					}
					}
					setState(464); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 10001157774639107L) != 0) );
				setState(466);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_subscript);
		int _la;
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 13519594975395843L) != 0)) {
					{
					setState(471);
					test();
					}
				}

				setState(474);
				match(COLON);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 13519594975395843L) != 0)) {
					{
					setState(475);
					test();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				test();
				setState(479);
				match(COLON);
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 13519594975395843L) != 0)) {
					{
					setState(480);
					test();
					}
				}

				setState(483);
				match(COLON);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 13519594975395843L) != 0)) {
					{
					setState(484);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof my_grammarListener ) ((my_grammarListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof my_grammarVisitor ) return ((my_grammarVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exprlist);
		int _la;
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(489);
					expr();
					setState(490);
					match(COMMA);
					}
					}
					setState(494); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 9015995347763203L) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
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

	public static final String _serializedATN =
		"\u0004\u0001C\u01f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0001\u0000\u0005\u0000]\b\u0000\n\u0000\f\u0000`\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001f\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002k\b\u0002\n\u0002\f\u0002n\t"+
		"\u0002\u0001\u0002\u0003\u0002q\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004y\b\u0004\n\u0004"+
		"\f\u0004|\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0083\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0088\b\u0006\u0005\u0006\u008a\b\u0006\n\u0006\f\u0006\u008d\t"+
		"\u0006\u0001\u0006\u0003\u0006\u0090\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009a\b\b\u0001\b\u0003"+
		"\b\u009d\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00a2\b\t\n\t\f\t\u00a5\t"+
		"\t\u0001\n\u0001\n\u0001\n\u0005\n\u00aa\b\n\n\n\f\n\u00ad\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00b2\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00b8\b\f\n\f\f\f\u00bb\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00ca\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d2\b\u000f\n\u000f\f\u000f"+
		"\u00d5\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00da\b"+
		"\u0010\n\u0010\f\u0010\u00dd\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00e2\b\u0011\n\u0011\f\u0011\u00e5\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u00ea\b\u0012\n\u0012\f\u0012\u00ed\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00f2\b\u0013\n\u0013"+
		"\f\u0013\u00f5\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u00fa\b\u0014\n\u0014\f\u0014\u00fd\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0102\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0107\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u010b\b\u0017"+
		"\u0001\u0017\u0005\u0017\u010e\b\u0017\n\u0017\f\u0017\u0111\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0115\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u011e"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0123\b\u0019"+
		"\n\u0019\f\u0019\u0126\t\u0019\u0001\u0019\u0003\u0019\u0129\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u012d\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0133\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0139\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u014e"+
		"\b\u001e\u0003\u001e\u0150\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0003 \u015c\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u0163\b!\u0001"+
		"!\u0001!\u0003!\u0167\b!\u0001!\u0001!\u0001!\u0001!\u0003!\u016d\b!\u0001"+
		"!\u0001!\u0003!\u0171\b!\u0005!\u0173\b!\n!\f!\u0176\t!\u0001!\u0001!"+
		"\u0003!\u017a\b!\u0001!\u0003!\u017d\b!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u0183\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u018a"+
		"\b\"\u0003\"\u018c\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0192\b"+
		"\"\u0003\"\u0194\b\"\u0001#\u0001#\u0001$\u0001$\u0003$\u019a\b$\u0001"+
		"%\u0001%\u0001%\u0005%\u019f\b%\n%\f%\u01a2\t%\u0001&\u0001&\u0003&\u01a6"+
		"\b&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0005\'\u01ae\b\'\n\'"+
		"\f\'\u01b1\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u01c1\b)\n)\f)\u01c4"+
		"\t)\u0001)\u0001)\u0001)\u0003)\u01c9\b)\u0001*\u0001*\u0001*\u0001*\u0004"+
		"*\u01cf\b*\u000b*\f*\u01d0\u0001*\u0001*\u0003*\u01d5\b*\u0001+\u0001"+
		"+\u0003+\u01d9\b+\u0001+\u0001+\u0003+\u01dd\b+\u0001+\u0001+\u0001+\u0003"+
		"+\u01e2\b+\u0001+\u0001+\u0003+\u01e6\b+\u0003+\u01e8\b+\u0001,\u0001"+
		",\u0001,\u0004,\u01ed\b,\u000b,\f,\u01ee\u0001,\u0003,\u01f2\b,\u0001"+
		",\u0000\u0000-\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVX\u0000\u0005\u0001"+
		"\u0000+7\u0001\u0000)*\u0001\u0000\u000e\u000f\u0002\u0000\u0010\u0010"+
		"\u0012\u0015\u0002\u0000\u000e\u000fCC\u0213\u0000^\u0001\u0000\u0000"+
		"\u0000\u0002e\u0001\u0000\u0000\u0000\u0004g\u0001\u0000\u0000\u0000\u0006"+
		"t\u0001\u0000\u0000\u0000\bv\u0001\u0000\u0000\u0000\n}\u0001\u0000\u0000"+
		"\u0000\f\u0082\u0001\u0000\u0000\u0000\u000e\u0091\u0001\u0000\u0000\u0000"+
		"\u0010\u009c\u0001\u0000\u0000\u0000\u0012\u009e\u0001\u0000\u0000\u0000"+
		"\u0014\u00a6\u0001\u0000\u0000\u0000\u0016\u00b1\u0001\u0000\u0000\u0000"+
		"\u0018\u00b3\u0001\u0000\u0000\u0000\u001a\u00c9\u0001\u0000\u0000\u0000"+
		"\u001c\u00cb\u0001\u0000\u0000\u0000\u001e\u00ce\u0001\u0000\u0000\u0000"+
		" \u00d6\u0001\u0000\u0000\u0000\"\u00de\u0001\u0000\u0000\u0000$\u00e6"+
		"\u0001\u0000\u0000\u0000&\u00ee\u0001\u0000\u0000\u0000(\u00f6\u0001\u0000"+
		"\u0000\u0000*\u0101\u0001\u0000\u0000\u0000,\u0103\u0001\u0000\u0000\u0000"+
		".\u0108\u0001\u0000\u0000\u00000\u011d\u0001\u0000\u0000\u00002\u011f"+
		"\u0001\u0000\u0000\u00004\u0132\u0001\u0000\u0000\u00006\u0138\u0001\u0000"+
		"\u0000\u00008\u013a\u0001\u0000\u0000\u0000:\u013f\u0001\u0000\u0000\u0000"+
		"<\u0146\u0001\u0000\u0000\u0000>\u0153\u0001\u0000\u0000\u0000@\u0159"+
		"\u0001\u0000\u0000\u0000B\u017c\u0001\u0000\u0000\u0000D\u0193\u0001\u0000"+
		"\u0000\u0000F\u0195\u0001\u0000\u0000\u0000H\u0197\u0001\u0000\u0000\u0000"+
		"J\u019b\u0001\u0000\u0000\u0000L\u01a3\u0001\u0000\u0000\u0000N\u01aa"+
		"\u0001\u0000\u0000\u0000P\u01b2\u0001\u0000\u0000\u0000R\u01b7\u0001\u0000"+
		"\u0000\u0000T\u01d4\u0001\u0000\u0000\u0000V\u01e7\u0001\u0000\u0000\u0000"+
		"X\u01f1\u0001\u0000\u0000\u0000Z]\u0005\u0006\u0000\u0000[]\u0003\u0002"+
		"\u0001\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005\u0000\u0000"+
		"\u0001b\u0001\u0001\u0000\u0000\u0000cf\u0003\u0004\u0002\u0000df\u0003"+
		"6\u001b\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000f\u0003"+
		"\u0001\u0000\u0000\u0000gl\u0003\u0006\u0003\u0000hi\u0005(\u0000\u0000"+
		"ik\u0003\u0006\u0003\u0000jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mp\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000oq\u0005(\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005"+
		"\u0006\u0000\u0000s\u0005\u0001\u0000\u0000\u0000tu\u0003\b\u0004\u0000"+
		"u\u0007\u0001\u0000\u0000\u0000vz\u0003\u001e\u000f\u0000wy\u0003\n\u0005"+
		"\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{\t\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}~\u0005\r\u0000\u0000~\u007f\u0003\u001e\u000f\u0000"+
		"\u007f\u000b\u0001\u0000\u0000\u0000\u0080\u0083\u0003\u0010\b\u0000\u0081"+
		"\u0083\u0003\u001c\u000e\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u008b\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0005&\u0000\u0000\u0085\u0088\u0003\u0010\b\u0000\u0086\u0088"+
		"\u0003\u001c\u000e\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0084"+
		"\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0005&\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\r\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0000"+
		"\u0000\u0000\u0092\u000f\u0001\u0000\u0000\u0000\u0093\u0099\u0003\u0012"+
		"\t\u0000\u0094\u0095\u0005%\u0000\u0000\u0095\u0096\u0003\u0012\t\u0000"+
		"\u0096\u0097\u0005$\u0000\u0000\u0097\u0098\u0003\u0010\b\u0000\u0098"+
		"\u009a\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b"+
		"\u009d\u0003L&\u0000\u009c\u0093\u0001\u0000\u0000\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u0011\u0001\u0000\u0000\u0000\u009e\u00a3\u0003"+
		"\u0014\n\u0000\u009f\u00a0\u0005\u001d\u0000\u0000\u00a0\u00a2\u0003\u0014"+
		"\n\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u0013\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u00ab\u0003\u0016\u000b\u0000\u00a7\u00a8\u0005\u001f\u0000"+
		"\u0000\u00a8\u00aa\u0003\u0016\u000b\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u0015\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005 \u0000\u0000"+
		"\u00af\u00b2\u0003\u0016\u000b\u0000\u00b0\u00b2\u0003\u0018\f\u0000\u00b1"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u0017\u0001\u0000\u0000\u0000\u00b3\u00b9\u0003\u001e\u000f\u0000\u00b4"+
		"\u00b5\u0003\u001a\r\u0000\u00b5\u00b6\u0003\u001e\u000f\u0000\u00b6\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b8\u00bb"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u0019\u0001\u0000\u0000\u0000\u00bb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ca\u0005\u0016\u0000\u0000\u00bd\u00ca"+
		"\u0005\u0017\u0000\u0000\u00be\u00ca\u0005\u0018\u0000\u0000\u00bf\u00ca"+
		"\u0005\u0019\u0000\u0000\u00c0\u00ca\u0005\u001a\u0000\u0000\u00c1\u00ca"+
		"\u0005\u001b\u0000\u0000\u00c2\u00ca\u0005\u001c\u0000\u0000\u00c3\u00ca"+
		"\u0005\"\u0000\u0000\u00c4\u00c5\u0005 \u0000\u0000\u00c5\u00ca\u0005"+
		"\"\u0000\u0000\u00c6\u00ca\u0005!\u0000\u0000\u00c7\u00c8\u0005!\u0000"+
		"\u0000\u00c8\u00ca\u0005 \u0000\u0000\u00c9\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c9\u00bd\u0001\u0000\u0000\u0000\u00c9\u00be\u0001\u0000\u0000\u0000"+
		"\u00c9\u00bf\u0001\u0000\u0000\u0000\u00c9\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c1\u0001\u0000\u0000\u0000\u00c9\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c3\u0001\u0000\u0000\u0000\u00c9\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c6\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00ca\u001b\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0010\u0000\u0000"+
		"\u00cc\u00cd\u0003\u001e\u000f\u0000\u00cd\u001d\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d3\u0003 \u0010\u0000\u00cf\u00d0\u0005\u001d\u0000\u0000\u00d0"+
		"\u00d2\u0003 \u0010\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u001f\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00db\u0003\"\u0011\u0000\u00d7\u00d8\u0005"+
		"\u001e\u0000\u0000\u00d8\u00da\u0003\"\u0011\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc!\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e3\u0003$\u0012\u0000"+
		"\u00df\u00e0\u0005\u001f\u0000\u0000\u00e0\u00e2\u0003$\u0012\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"#\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00eb"+
		"\u0003&\u0013\u0000\u00e7\u00e8\u0007\u0001\u0000\u0000\u00e8\u00ea\u0003"+
		"&\u0013\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec%\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f3\u0003(\u0014\u0000\u00ef\u00f0\u0007\u0002\u0000\u0000"+
		"\u00f0\u00f2\u0003(\u0014\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f4\'\u0001\u0000\u0000\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f6\u00fb\u0003*\u0015\u0000\u00f7\u00f8\u0007"+
		"\u0003\u0000\u0000\u00f8\u00fa\u0003*\u0015\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc)\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0007\u0004\u0000"+
		"\u0000\u00ff\u0102\u0003*\u0015\u0000\u0100\u0102\u0003,\u0016\u0000\u0101"+
		"\u00fe\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102"+
		"+\u0001\u0000\u0000\u0000\u0103\u0106\u0003.\u0017\u0000\u0104\u0105\u0005"+
		"\u0011\u0000\u0000\u0105\u0107\u0003*\u0015\u0000\u0106\u0104\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107-\u0001\u0000\u0000"+
		"\u0000\u0108\u010a\u00059\u0000\u0000\u0109\u010b\u00058\u0000\u0000\u010a"+
		"\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b"+
		"\u010f\u0001\u0000\u0000\u0000\u010c\u010e\u00030\u0018\u0000\u010d\u010c"+
		"\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110/\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0114\u0005"+
		"\u0001\u0000\u0000\u0113\u0115\u00032\u0019\u0000\u0114\u0113\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u011e\u0005\u0002\u0000\u0000\u0117\u0118\u0005\u0003"+
		"\u0000\u0000\u0118\u0119\u0003N\'\u0000\u0119\u011a\u0005\u0004\u0000"+
		"\u0000\u011a\u011e\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u0005\u0000"+
		"\u0000\u011c\u011e\u0005\u0007\u0000\u0000\u011d\u0112\u0001\u0000\u0000"+
		"\u0000\u011d\u0117\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011e1\u0001\u0000\u0000\u0000\u011f\u0124\u00034\u001a\u0000\u0120"+
		"\u0121\u0005&\u0000\u0000\u0121\u0123\u00034\u001a\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0128\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0129\u0005"+
		"&\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u01293\u0001\u0000\u0000\u0000\u012a\u012c\u0003\u0010\b"+
		"\u0000\u012b\u012d\u0003P(\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012d\u0133\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0003\u0010\b\u0000\u012f\u0130\u0005\u0018\u0000\u0000\u0130\u0131"+
		"\u0003\u0010\b\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u012a\u0001"+
		"\u0000\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u01335\u0001\u0000"+
		"\u0000\u0000\u0134\u0139\u0003R)\u0000\u0135\u0139\u00038\u001c\u0000"+
		"\u0136\u0139\u0003:\u001d\u0000\u0137\u0139\u0003>\u001f\u0000\u0138\u0134"+
		"\u0001\u0000\u0000\u0000\u0138\u0135\u0001\u0000\u0000\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u01397\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0005>\u0000\u0000\u013b\u013c\u0003\u0010"+
		"\b\u0000\u013c\u013d\u0005\'\u0000\u0000\u013d\u013e\u0003T*\u0000\u013e"+
		"9\u0001\u0000\u0000\u0000\u013f\u0140\u0005?\u0000\u0000\u0140\u0141\u0005"+
		"\u0007\u0000\u0000\u0141\u0142\u0005\"\u0000\u0000\u0142\u0143\u0003<"+
		"\u001e\u0000\u0143\u0144\u0005\'\u0000\u0000\u0144\u0145\u0003T*\u0000"+
		"\u0145;\u0001\u0000\u0000\u0000\u0146\u0147\u0005@\u0000\u0000\u0147\u0148"+
		"\u0005\u0001\u0000\u0000\u0148\u014f\u0003\u0010\b\u0000\u0149\u014a\u0005"+
		"&\u0000\u0000\u014a\u014d\u0003\u0010\b\u0000\u014b\u014c\u0005&\u0000"+
		"\u0000\u014c\u014e\u0003\u0010\b\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000"+
		"\u014f\u0149\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0002\u0000\u0000"+
		"\u0152=\u0001\u0000\u0000\u0000\u0153\u0154\u0005=\u0000\u0000\u0154\u0155"+
		"\u0005\u0007\u0000\u0000\u0155\u0156\u0003@ \u0000\u0156\u0157\u0005\'"+
		"\u0000\u0000\u0157\u0158\u0003T*\u0000\u0158?\u0001\u0000\u0000\u0000"+
		"\u0159\u015b\u0005\u0001\u0000\u0000\u015a\u015c\u0003B!\u0000\u015b\u015a"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0002\u0000\u0000\u015eA\u0001"+
		"\u0000\u0000\u0000\u015f\u0162\u0003F#\u0000\u0160\u0161\u0005\'\u0000"+
		"\u0000\u0161\u0163\u0003\u0010\b\u0000\u0162\u0160\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0005\r\u0000\u0000\u0165\u0167\u0003\u0010\b\u0000\u0166"+
		"\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167"+
		"\u0174\u0001\u0000\u0000\u0000\u0168\u0169\u0005&\u0000\u0000\u0169\u016c"+
		"\u0003F#\u0000\u016a\u016b\u0005\'\u0000\u0000\u016b\u016d\u0003\u0010"+
		"\b\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000"+
		"\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016f\u0005\r\u0000\u0000"+
		"\u016f\u0171\u0003\u0010\b\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172"+
		"\u0168\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0179\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0005&\u0000\u0000\u0178\u017a\u0003D\"\u0000\u0179\u0177\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017d\u0001"+
		"\u0000\u0000\u0000\u017b\u017d\u0003D\"\u0000\u017c\u015f\u0001\u0000"+
		"\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017dC\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0005\u0010\u0000\u0000\u017f\u0182\u0005\u0007\u0000"+
		"\u0000\u0180\u0181\u0005\'\u0000\u0000\u0181\u0183\u0003\u0010\b\u0000"+
		"\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000"+
		"\u0183\u018b\u0001\u0000\u0000\u0000\u0184\u0185\u0005&\u0000\u0000\u0185"+
		"\u0186\u0005\u0011\u0000\u0000\u0186\u0189\u0005\u0007\u0000\u0000\u0187"+
		"\u0188\u0005\'\u0000\u0000\u0188\u018a\u0003\u0010\b\u0000\u0189\u0187"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c"+
		"\u0001\u0000\u0000\u0000\u018b\u0184\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0001\u0000\u0000\u0000\u018c\u0194\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0005\u0011\u0000\u0000\u018e\u0191\u0005\u0007\u0000\u0000\u018f\u0190"+
		"\u0005\'\u0000\u0000\u0190\u0192\u0003\u0010\b\u0000\u0191\u018f\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0194\u0001"+
		"\u0000\u0000\u0000\u0193\u017e\u0001\u0000\u0000\u0000\u0193\u018d\u0001"+
		"\u0000\u0000\u0000\u0194E\u0001\u0000\u0000\u0000\u0195\u0196\u0005\u0007"+
		"\u0000\u0000\u0196G\u0001\u0000\u0000\u0000\u0197\u0199\u0005A\u0000\u0000"+
		"\u0198\u019a\u0003J%\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0001\u0000\u0000\u0000\u019aI\u0001\u0000\u0000\u0000\u019b\u01a0\u0003"+
		"\u0010\b\u0000\u019c\u019d\u0005&\u0000\u0000\u019d\u019f\u0003\u0010"+
		"\b\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a1K\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a5\u0005B\u0000\u0000\u01a4\u01a6\u0003B!\u0000\u01a5\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\'\u0000\u0000\u01a8\u01a9\u0003"+
		"\u0010\b\u0000\u01a9M\u0001\u0000\u0000\u0000\u01aa\u01af\u0003V+\u0000"+
		"\u01ab\u01ac\u0005&\u0000\u0000\u01ac\u01ae\u0003V+\u0000\u01ad\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0O\u0001"+
		"\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005"+
		"?\u0000\u0000\u01b3\u01b4\u0003X,\u0000\u01b4\u01b5\u0005\"\u0000\u0000"+
		"\u01b5\u01b6\u0003\u0012\t\u0000\u01b6Q\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0005%\u0000\u0000\u01b8\u01b9\u0003\u0010\b\u0000\u01b9\u01ba"+
		"\u0005\'\u0000\u0000\u01ba\u01c2\u0003T*\u0000\u01bb\u01bc\u0005#\u0000"+
		"\u0000\u01bc\u01bd\u0003\u0010\b\u0000\u01bd\u01be\u0005\'\u0000\u0000"+
		"\u01be\u01bf\u0003T*\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000\u01c0\u01bb"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0005$\u0000\u0000\u01c6\u01c7\u0005\'\u0000\u0000\u01c7\u01c9\u0003"+
		"T*\u0000\u01c8\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9S\u0001\u0000\u0000\u0000\u01ca\u01d5\u0003\u0004\u0002\u0000"+
		"\u01cb\u01cc\u0005\u0006\u0000\u0000\u01cc\u01ce\u0005\u000b\u0000\u0000"+
		"\u01cd\u01cf\u0003\u0002\u0001\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0005\f\u0000\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000\u01d4"+
		"\u01ca\u0001\u0000\u0000\u0000\u01d4\u01cb\u0001\u0000\u0000\u0000\u01d5"+
		"U\u0001\u0000\u0000\u0000\u01d6\u01e8\u0003\u0010\b\u0000\u01d7\u01d9"+
		"\u0003\u0010\b\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0005"+
		"\'\u0000\u0000\u01db\u01dd\u0003\u0010\b\u0000\u01dc\u01db\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01e8\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0003\u0010\b\u0000\u01df\u01e1\u0005\'\u0000"+
		"\u0000\u01e0\u01e2\u0003\u0010\b\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e5\u0005\'\u0000\u0000\u01e4\u01e6\u0003\u0010\b\u0000\u01e5"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e7\u01d6\u0001\u0000\u0000\u0000\u01e7"+
		"\u01d8\u0001\u0000\u0000\u0000\u01e7\u01de\u0001\u0000\u0000\u0000\u01e8"+
		"W\u0001\u0000\u0000\u0000\u01e9\u01ea\u0003\u001e\u000f\u0000\u01ea\u01eb"+
		"\u0005&\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01e9\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f2\u0003\u001e\u000f\u0000\u01f1\u01ec\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2Y\u0001\u0000"+
		"\u0000\u0000@\\^elpz\u0082\u0087\u008b\u008f\u0099\u009c\u00a3\u00ab\u00b1"+
		"\u00b9\u00c9\u00d3\u00db\u00e3\u00eb\u00f3\u00fb\u0101\u0106\u010a\u010f"+
		"\u0114\u011d\u0124\u0128\u012c\u0132\u0138\u014d\u014f\u015b\u0162\u0166"+
		"\u016c\u0170\u0174\u0179\u017c\u0182\u0189\u018b\u0191\u0193\u0199\u01a0"+
		"\u01a5\u01af\u01c2\u01c8\u01d0\u01d4\u01d8\u01dc\u01e1\u01e5\u01e7\u01ee"+
		"\u01f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}