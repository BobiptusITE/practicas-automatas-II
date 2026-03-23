// Generated from c:\Users\Armando\Desktop\Buffer\practicas-automatas-II\JSON\json.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LBRACE=4, RBRACE=5, LBRACKET=6, RBRACKET=7, COLON=8, 
		COMMA=9, NUMBER=10, STRING=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "COLON", 
			"COMMA", "NUMBER", "STRING", "WS", "INT", "EXP", "ESC", "UNICODE", "HEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'null'", "'{'", "'}'", "'['", "']'", "':'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "COLON", 
			"COMMA", "NUMBER", "STRING", "WS"
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


	public jsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "json.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\5\13C\n\13\3\13"+
		"\3\13\3\13\3\13\5\13I\n\13\3\13\5\13L\n\13\3\13\3\13\3\13\3\13\5\13R\n"+
		"\13\3\13\5\13U\n\13\3\f\3\f\3\f\7\fZ\n\f\f\f\16\f]\13\f\3\f\3\f\3\r\6"+
		"\rb\n\r\r\r\16\rc\3\r\3\r\3\16\3\16\3\16\7\16k\n\16\f\16\16\16n\13\16"+
		"\5\16p\n\16\3\17\3\17\5\17t\n\17\3\17\3\17\3\20\3\20\3\20\5\20{\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\2!\2#\2\3\2\n\4\2$$^^\5"+
		"\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2GGgg\4\2--//\n\2$$\61\61^^ddhhpp"+
		"ttvv\5\2\62;CHch\2\u008b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3%\3\2\2\2\5*\3\2\2\2\7\60\3\2\2\2"+
		"\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23?\3\2"+
		"\2\2\25T\3\2\2\2\27V\3\2\2\2\31a\3\2\2\2\33o\3\2\2\2\35q\3\2\2\2\37w\3"+
		"\2\2\2!|\3\2\2\2#\u0082\3\2\2\2%&\7v\2\2&\'\7t\2\2\'(\7w\2\2()\7g\2\2"+
		")\4\3\2\2\2*+\7h\2\2+,\7c\2\2,-\7n\2\2-.\7u\2\2./\7g\2\2/\6\3\2\2\2\60"+
		"\61\7p\2\2\61\62\7w\2\2\62\63\7n\2\2\63\64\7n\2\2\64\b\3\2\2\2\65\66\7"+
		"}\2\2\66\n\3\2\2\2\678\7\177\2\28\f\3\2\2\29:\7]\2\2:\16\3\2\2\2;<\7_"+
		"\2\2<\20\3\2\2\2=>\7<\2\2>\22\3\2\2\2?@\7.\2\2@\24\3\2\2\2AC\7/\2\2BA"+
		"\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\33\16\2EF\7\60\2\2FH\5\33\16\2GI\5\35"+
		"\17\2HG\3\2\2\2HI\3\2\2\2IU\3\2\2\2JL\7/\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2"+
		"\2\2MN\5\33\16\2NO\5\35\17\2OU\3\2\2\2PR\7/\2\2QP\3\2\2\2QR\3\2\2\2RS"+
		"\3\2\2\2SU\5\33\16\2TB\3\2\2\2TK\3\2\2\2TQ\3\2\2\2U\26\3\2\2\2V[\7$\2"+
		"\2WZ\5\37\20\2XZ\n\2\2\2YW\3\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3"+
		"\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7$\2\2_\30\3\2\2\2`b\t\3\2\2a`\3\2\2\2b"+
		"c\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\b\r\2\2f\32\3\2\2\2gp\7\62\2"+
		"\2hl\t\4\2\2ik\t\5\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2"+
		"\2nl\3\2\2\2og\3\2\2\2oh\3\2\2\2p\34\3\2\2\2qs\t\6\2\2rt\t\7\2\2sr\3\2"+
		"\2\2st\3\2\2\2tu\3\2\2\2uv\5\33\16\2v\36\3\2\2\2wz\7^\2\2x{\t\b\2\2y{"+
		"\5!\21\2zx\3\2\2\2zy\3\2\2\2{ \3\2\2\2|}\7w\2\2}~\5#\22\2~\177\5#\22\2"+
		"\177\u0080\5#\22\2\u0080\u0081\5#\22\2\u0081\"\3\2\2\2\u0082\u0083\t\t"+
		"\2\2\u0083$\3\2\2\2\17\2BHKQTY[closz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}