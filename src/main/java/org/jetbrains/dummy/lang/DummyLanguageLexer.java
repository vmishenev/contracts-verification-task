// Generated from org/jetbrains/dummy/lang/DummyLanguage.g4 by ANTLR 4.7.2

package org.jetbrains.dummy.lang;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DummyLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, IF=2, ELSE=3, TRUE=4, FALSE=5, BEGIN=6, END=7, FUN=8, ID=9, NUMBER=10, 
		DIGIT=11, WS=12, SINGLE_COMMENT=13, MULTI_COMMENT=14, SEMICOLON=15, LEFT_BR=16, 
		RIGHT_BR=17, ASSIGN=18, COMMA=19, RETURN=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VAR", "IF", "ELSE", "TRUE", "FALSE", "BEGIN", "END", "FUN", "ID", "NUMBER", 
			"DIGIT", "WS", "SINGLE_COMMENT", "MULTI_COMMENT", "SEMICOLON", "LEFT_BR", 
			"RIGHT_BR", "ASSIGN", "COMMA", "RETURN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'if'", "'else'", "'true'", "'false'", "'{'", "'}'", "'fun'", 
			null, null, null, null, null, null, "';'", "'('", "')'", "'='", "','", 
			"'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "IF", "ELSE", "TRUE", "FALSE", "BEGIN", "END", "FUN", "ID", 
			"NUMBER", "DIGIT", "WS", "SINGLE_COMMENT", "MULTI_COMMENT", "SEMICOLON", 
			"LEFT_BR", "RIGHT_BR", "ASSIGN", "COMMA", "RETURN"
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


	    public static final int COMMENTS = 1;


	public DummyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DummyLanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\5\nL\n\n\3\n\7\nO\n\n\f\n\16\nR\13\n\3\13\5\13"+
		"U\n\13\3\13\3\13\5\13Y\n\13\3\13\3\13\7\13]\n\13\f\13\16\13`\13\13\5\13"+
		"b\n\13\3\f\3\f\3\r\6\rg\n\r\r\r\16\rh\3\r\3\r\3\16\3\16\3\16\3\16\7\16"+
		"q\n\16\f\16\16\16t\13\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17|\n\17\f\17"+
		"\16\17\177\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3}\2\26\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26\3\2\b\4\2aac|\5\2\62;aac|\3\2\63;\3\2\62;\5\2\13"+
		"\f\17\17\"\"\4\2\f\f\17\17\2\u009d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\3+\3\2\2\2\5/\3\2\2\2\7\62\3\2\2\2\t\67\3\2\2\2\13<\3\2\2\2\rB\3\2"+
		"\2\2\17D\3\2\2\2\21F\3\2\2\2\23K\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31f\3"+
		"\2\2\2\33l\3\2\2\2\35w\3\2\2\2\37\u0085\3\2\2\2!\u0087\3\2\2\2#\u0089"+
		"\3\2\2\2%\u008b\3\2\2\2\'\u008d\3\2\2\2)\u008f\3\2\2\2+,\7x\2\2,-\7c\2"+
		"\2-.\7t\2\2.\4\3\2\2\2/\60\7k\2\2\60\61\7h\2\2\61\6\3\2\2\2\62\63\7g\2"+
		"\2\63\64\7n\2\2\64\65\7u\2\2\65\66\7g\2\2\66\b\3\2\2\2\678\7v\2\289\7"+
		"t\2\29:\7w\2\2:;\7g\2\2;\n\3\2\2\2<=\7h\2\2=>\7c\2\2>?\7n\2\2?@\7u\2\2"+
		"@A\7g\2\2A\f\3\2\2\2BC\7}\2\2C\16\3\2\2\2DE\7\177\2\2E\20\3\2\2\2FG\7"+
		"h\2\2GH\7w\2\2HI\7p\2\2I\22\3\2\2\2JL\t\2\2\2KJ\3\2\2\2LP\3\2\2\2MO\t"+
		"\3\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\24\3\2\2\2RP\3\2\2\2S"+
		"U\7/\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2Vb\7\62\2\2WY\7/\2\2XW\3\2\2\2X"+
		"Y\3\2\2\2YZ\3\2\2\2Z^\t\4\2\2[]\5\27\f\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aT\3\2\2\2aX\3\2\2\2b\26\3\2\2\2cd\t\5"+
		"\2\2d\30\3\2\2\2eg\t\6\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3"+
		"\2\2\2jk\b\r\2\2k\32\3\2\2\2lm\7\61\2\2mn\7\61\2\2nr\3\2\2\2oq\n\7\2\2"+
		"po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\b\16\3"+
		"\2v\34\3\2\2\2wx\7\61\2\2xy\7,\2\2y}\3\2\2\2z|\13\2\2\2{z\3\2\2\2|\177"+
		"\3\2\2\2}~\3\2\2\2}{\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7"+
		",\2\2\u0081\u0082\7\61\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\17\3\2\u0084"+
		"\36\3\2\2\2\u0085\u0086\7=\2\2\u0086 \3\2\2\2\u0087\u0088\7*\2\2\u0088"+
		"\"\3\2\2\2\u0089\u008a\7+\2\2\u008a$\3\2\2\2\u008b\u008c\7?\2\2\u008c"+
		"&\3\2\2\2\u008d\u008e\7.\2\2\u008e(\3\2\2\2\u008f\u0090\7t\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7v\2\2\u0092\u0093\7w\2\2\u0093\u0094\7t\2\2\u0094"+
		"\u0095\7p\2\2\u0095*\3\2\2\2\r\2KNPTX^ahr}\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}