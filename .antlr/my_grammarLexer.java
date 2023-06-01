// Generated from /Users/kseniiatokareva/Documents/PythonToCpp/my_grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class my_grammarLexer extends Lexer {
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
		TILDE=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "NEWLINE", "NAME", "NUMBER", 
			"STRING", "COMMENT", "INDENT", "DEDENT", "ASSIGN", "PLUS", "MINUS", "STAR", 
			"POWER", "DIV", "MOD", "IDIV", "AT", "LESS_THAN", "GREATER_THAN", "EQUALS", 
			"GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "OR", "XOR", "AND", "NOT", 
			"IS", "IN", "ELIF", "ELSE", "IF", "COMMA", "COLON", "SEMI_COLON", "LEFT_SHIFT", 
			"RIGHT_SHIFT", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "POWER_ASSIGN", "IDIV_ASSIGN", 
			"AWAIT", "ATOM", "DIGIT", "LETTER", "WHITESPACE", "DEF", "WHILE", "FOR", 
			"RANGE", "YIELD", "LAMBDA", "TILDE"
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


	public my_grammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "my_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u0190\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\5\7\u0095\n\7\3\7\3\7\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16"+
		"\b\u009f\13\b\3\t\6\t\u00a2\n\t\r\t\16\t\u00a3\3\n\3\n\7\n\u00a8\n\n\f"+
		"\n\16\n\u00ab\13\n\3\n\3\n\3\n\7\n\u00b0\n\n\f\n\16\n\u00b3\13\n\3\n\5"+
		"\n\u00b6\n\n\3\13\3\13\7\13\u00ba\n\13\f\13\16\13\u00bd\13\13\3\13\3\13"+
		"\3\f\6\f\u00c2\n\f\r\f\16\f\u00c3\3\r\3\r\7\r\u00c8\n\r\f\r\16\r\u00cb"+
		"\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-"+
		"\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0161\n:\3;\3;\3<\3<\3=\6=\u0168"+
		"\n=\r=\16=\u0169\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3"+
		"A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\5\u00a9\u00b1"+
		"\u00bb\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\3\2\5\3\2"+
		"\62;\5\2C\\aac|\4\2\13\13\"\"\2\u01a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\3\u0089"+
		"\3\2\2\2\5\u008b\3\2\2\2\7\u008d\3\2\2\2\t\u008f\3\2\2\2\13\u0091\3\2"+
		"\2\2\r\u0094\3\2\2\2\17\u0098\3\2\2\2\21\u00a1\3\2\2\2\23\u00b5\3\2\2"+
		"\2\25\u00b7\3\2\2\2\27\u00c1\3\2\2\2\31\u00c5\3\2\2\2\33\u00cc\3\2\2\2"+
		"\35\u00ce\3\2\2\2\37\u00d0\3\2\2\2!\u00d2\3\2\2\2#\u00d4\3\2\2\2%\u00d7"+
		"\3\2\2\2\'\u00d9\3\2\2\2)\u00db\3\2\2\2+\u00de\3\2\2\2-\u00e0\3\2\2\2"+
		"/\u00e2\3\2\2\2\61\u00e4\3\2\2\2\63\u00e7\3\2\2\2\65\u00ea\3\2\2\2\67"+
		"\u00ed\3\2\2\29\u00f0\3\2\2\2;\u00f3\3\2\2\2=\u00f5\3\2\2\2?\u00f7\3\2"+
		"\2\2A\u00f9\3\2\2\2C\u00fd\3\2\2\2E\u0100\3\2\2\2G\u0103\3\2\2\2I\u0108"+
		"\3\2\2\2K\u010d\3\2\2\2M\u0110\3\2\2\2O\u0112\3\2\2\2Q\u0114\3\2\2\2S"+
		"\u0116\3\2\2\2U\u0119\3\2\2\2W\u011c\3\2\2\2Y\u011f\3\2\2\2[\u0122\3\2"+
		"\2\2]\u0125\3\2\2\2_\u0128\3\2\2\2a\u012b\3\2\2\2c\u012e\3\2\2\2e\u0131"+
		"\3\2\2\2g\u0134\3\2\2\2i\u0137\3\2\2\2k\u013b\3\2\2\2m\u013f\3\2\2\2o"+
		"\u0143\3\2\2\2q\u0147\3\2\2\2s\u0160\3\2\2\2u\u0162\3\2\2\2w\u0164\3\2"+
		"\2\2y\u0167\3\2\2\2{\u016d\3\2\2\2}\u0171\3\2\2\2\177\u0177\3\2\2\2\u0081"+
		"\u017b\3\2\2\2\u0083\u0181\3\2\2\2\u0085\u0187\3\2\2\2\u0087\u018e\3\2"+
		"\2\2\u0089\u008a\7*\2\2\u008a\4\3\2\2\2\u008b\u008c\7+\2\2\u008c\6\3\2"+
		"\2\2\u008d\u008e\7]\2\2\u008e\b\3\2\2\2\u008f\u0090\7_\2\2\u0090\n\3\2"+
		"\2\2\u0091\u0092\7\60\2\2\u0092\f\3\2\2\2\u0093\u0095\7\17\2\2\u0094\u0093"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\f\2\2\u0097"+
		"\16\3\2\2\2\u0098\u009d\5w<\2\u0099\u009c\5w<\2\u009a\u009c\5u;\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\20\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2"+
		"\5u;\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\22\3\2\2\2\u00a5\u00a9\7$\2\2\u00a6\u00a8\13\2\2"+
		"\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00aa\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b6\7$\2\2\u00ad"+
		"\u00b1\7)\2\2\u00ae\u00b0\13\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b6\7)\2\2\u00b5\u00a5\3\2\2\2\u00b5\u00ad\3\2"+
		"\2\2\u00b6\24\3\2\2\2\u00b7\u00bb\7%\2\2\u00b8\u00ba\13\2\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\f\2\2\u00bf\26\3\2\2"+
		"\2\u00c0\u00c2\5y=\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\30\3\2\2\2\u00c5\u00c9\7\f\2\2\u00c6"+
		"\u00c8\5y=\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2"+
		"\2\u00c9\u00ca\3\2\2\2\u00ca\32\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd"+
		"\7?\2\2\u00cd\34\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf\36\3\2\2\2\u00d0\u00d1"+
		"\7/\2\2\u00d1 \3\2\2\2\u00d2\u00d3\7,\2\2\u00d3\"\3\2\2\2\u00d4\u00d5"+
		"\7,\2\2\u00d5\u00d6\7,\2\2\u00d6$\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8&"+
		"\3\2\2\2\u00d9\u00da\7\'\2\2\u00da(\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc"+
		"\u00dd\7\61\2\2\u00dd*\3\2\2\2\u00de\u00df\7B\2\2\u00df,\3\2\2\2\u00e0"+
		"\u00e1\7>\2\2\u00e1.\3\2\2\2\u00e2\u00e3\7@\2\2\u00e3\60\3\2\2\2\u00e4"+
		"\u00e5\7?\2\2\u00e5\u00e6\7?\2\2\u00e6\62\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8"+
		"\u00e9\7?\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec\7?\2\2\u00ec"+
		"\66\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\u00ef\7@\2\2\u00ef8\3\2\2\2\u00f0"+
		"\u00f1\7#\2\2\u00f1\u00f2\7?\2\2\u00f2:\3\2\2\2\u00f3\u00f4\7~\2\2\u00f4"+
		"<\3\2\2\2\u00f5\u00f6\7`\2\2\u00f6>\3\2\2\2\u00f7\u00f8\7(\2\2\u00f8@"+
		"\3\2\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7v\2\2\u00fc"+
		"B\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7u\2\2\u00ffD\3\2\2\2\u0100\u0101"+
		"\7k\2\2\u0101\u0102\7p\2\2\u0102F\3\2\2\2\u0103\u0104\7g\2\2\u0104\u0105"+
		"\7n\2\2\u0105\u0106\7k\2\2\u0106\u0107\7h\2\2\u0107H\3\2\2\2\u0108\u0109"+
		"\7g\2\2\u0109\u010a\7n\2\2\u010a\u010b\7u\2\2\u010b\u010c\7g\2\2\u010c"+
		"J\3\2\2\2\u010d\u010e\7k\2\2\u010e\u010f\7h\2\2\u010fL\3\2\2\2\u0110\u0111"+
		"\7.\2\2\u0111N\3\2\2\2\u0112\u0113\7<\2\2\u0113P\3\2\2\2\u0114\u0115\7"+
		"=\2\2\u0115R\3\2\2\2\u0116\u0117\7>\2\2\u0117\u0118\7>\2\2\u0118T\3\2"+
		"\2\2\u0119\u011a\7@\2\2\u011a\u011b\7@\2\2\u011bV\3\2\2\2\u011c\u011d"+
		"\7-\2\2\u011d\u011e\7?\2\2\u011eX\3\2\2\2\u011f\u0120\7/\2\2\u0120\u0121"+
		"\7?\2\2\u0121Z\3\2\2\2\u0122\u0123\7,\2\2\u0123\u0124\7?\2\2\u0124\\\3"+
		"\2\2\2\u0125\u0126\7B\2\2\u0126\u0127\7?\2\2\u0127^\3\2\2\2\u0128\u0129"+
		"\7\61\2\2\u0129\u012a\7?\2\2\u012a`\3\2\2\2\u012b\u012c\7\'\2\2\u012c"+
		"\u012d\7?\2\2\u012db\3\2\2\2\u012e\u012f\7(\2\2\u012f\u0130\7?\2\2\u0130"+
		"d\3\2\2\2\u0131\u0132\7~\2\2\u0132\u0133\7?\2\2\u0133f\3\2\2\2\u0134\u0135"+
		"\7`\2\2\u0135\u0136\7?\2\2\u0136h\3\2\2\2\u0137\u0138\7>\2\2\u0138\u0139"+
		"\7>\2\2\u0139\u013a\7?\2\2\u013aj\3\2\2\2\u013b\u013c\7@\2\2\u013c\u013d"+
		"\7@\2\2\u013d\u013e\7?\2\2\u013el\3\2\2\2\u013f\u0140\7,\2\2\u0140\u0141"+
		"\7,\2\2\u0141\u0142\7?\2\2\u0142n\3\2\2\2\u0143\u0144\7\61\2\2\u0144\u0145"+
		"\7\61\2\2\u0145\u0146\7?\2\2\u0146p\3\2\2\2\u0147\u0148\7c\2\2\u0148\u0149"+
		"\7y\2\2\u0149\u014a\7c\2\2\u014a\u014b\7k\2\2\u014b\u014c\7v\2\2\u014c"+
		"r\3\2\2\2\u014d\u0161\5\17\b\2\u014e\u0161\5\21\t\2\u014f\u0161\5\23\n"+
		"\2\u0150\u0151\7\60\2\2\u0151\u0152\7\60\2\2\u0152\u0161\7\60\2\2\u0153"+
		"\u0154\7P\2\2\u0154\u0155\7q\2\2\u0155\u0156\7p\2\2\u0156\u0161\7g\2\2"+
		"\u0157\u0158\7V\2\2\u0158\u0159\7t\2\2\u0159\u015a\7w\2\2\u015a\u0161"+
		"\7g\2\2\u015b\u015c\7H\2\2\u015c\u015d\7c\2\2\u015d\u015e\7n\2\2\u015e"+
		"\u015f\7u\2\2\u015f\u0161\7g\2\2\u0160\u014d\3\2\2\2\u0160\u014e\3\2\2"+
		"\2\u0160\u014f\3\2\2\2\u0160\u0150\3\2\2\2\u0160\u0153\3\2\2\2\u0160\u0157"+
		"\3\2\2\2\u0160\u015b\3\2\2\2\u0161t\3\2\2\2\u0162\u0163\t\2\2\2\u0163"+
		"v\3\2\2\2\u0164\u0165\t\3\2\2\u0165x\3\2\2\2\u0166\u0168\t\4\2\2\u0167"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b=\2\2\u016cz\3\2\2\2\u016d\u016e"+
		"\7f\2\2\u016e\u016f\7g\2\2\u016f\u0170\7h\2\2\u0170|\3\2\2\2\u0171\u0172"+
		"\7y\2\2\u0172\u0173\7j\2\2\u0173\u0174\7k\2\2\u0174\u0175\7n\2\2\u0175"+
		"\u0176\7g\2\2\u0176~\3\2\2\2\u0177\u0178\7h\2\2\u0178\u0179\7q\2\2\u0179"+
		"\u017a\7t\2\2\u017a\u0080\3\2\2\2\u017b\u017c\7t\2\2\u017c\u017d\7c\2"+
		"\2\u017d\u017e\7p\2\2\u017e\u017f\7i\2\2\u017f\u0180\7g\2\2\u0180\u0082"+
		"\3\2\2\2\u0181\u0182\7{\2\2\u0182\u0183\7k\2\2\u0183\u0184\7g\2\2\u0184"+
		"\u0185\7n\2\2\u0185\u0186\7f\2\2\u0186\u0084\3\2\2\2\u0187\u0188\7n\2"+
		"\2\u0188\u0189\7c\2\2\u0189\u018a\7o\2\2\u018a\u018b\7d\2\2\u018b\u018c"+
		"\7f\2\2\u018c\u018d\7c\2\2\u018d\u0086\3\2\2\2\u018e\u018f\7\u0080\2\2"+
		"\u018f\u0088\3\2\2\2\17\2\u0094\u009b\u009d\u00a3\u00a9\u00b1\u00b5\u00bb"+
		"\u00c3\u00c9\u0160\u0169\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}