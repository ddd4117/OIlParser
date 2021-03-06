package sselab.nusek.oil.file;

// Generated from .\Oil.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OilLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, HEX_NUMBER=54, NAME=55, DIGIT=56, STRING=57, WS=58, COMMENT=59, 
		LINE_COMMENT=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "HEX_NUMBER", "NAME", "DIGIT", "Letter", 
		"HEX_DIGIT", "LetterOrDigit", "STRING", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'OIL_VERSION'", "'='", "';'", "'CPU'", "'{'", "'}'", "'IMPLEMENTATION'", 
		"'OS'", "'TASK'", "'COUNTER'", "'ALARM'", "'RESOURCE'", "'EVENT'", "'ISR'", 
		"'MESSAGE'", "'COM'", "'NM'", "'APPMODE'", "'IPDU'", "'UINT32'", "'INT32'", 
		"'UINT64'", "'INT64'", "'FLOAT'", "'ENUM'", "'STRING'", "'BOOLEAN'", "'WITH_AUTO'", 
		"'['", "']'", "','", "'NO_DEFAULT'", "'AUTO'", "'TRUE'", "'FALSE'", "':'", 
		"'OS_TYPE'", "'TASK_TYPE'", "'COUNTER+TYPE'", "'ALARM_TYPE'", "'RESOURCE_TYPE'", 
		"'EVENT_TYPE'", "'ISR_TYPE'", "'MESSAGE_TYPE'", "'COM_TYPE'", "'NM_TYPE'", 
		"'APPMODE_TYPE'", "'IPDU_TYPE'", "'+'", "'-'", "'.'", "'e'", "'E'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "HEX_NUMBER", "NAME", "DIGIT", "STRING", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	public OilLexer(String _input) throws IOException
	{
		super(new ANTLRFileStream(_input));
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
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


	public OilLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Oil.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u0224\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u01de\n\67\3\67\6\67"+
		"\u01e1\n\67\r\67\16\67\u01e2\38\38\78\u01e7\n8\f8\168\u01ea\138\39\39"+
		"\3:\3:\3:\3:\5:\u01f2\n:\3;\3;\3<\3<\3<\3<\5<\u01fa\n<\3=\3=\7=\u01fe"+
		"\n=\f=\16=\u0201\13=\3=\3=\3>\6>\u0206\n>\r>\16>\u0207\3>\3>\3?\3?\3?"+
		"\3?\7?\u0210\n?\f?\16?\u0213\13?\3?\3?\3?\3?\3?\3@\3@\3@\3@\7@\u021e\n"+
		"@\f@\16@\u0221\13@\3@\3@\3\u0211\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s\2u\2w\2y;{<}=\177>\3\2\13\6\2"+
		"&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\5\2"+
		"\62;CHch\7\2&&\62;C\\aac|\4\2$$^^\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u022b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\3\u0081\3\2\2\2\5\u008d\3\2\2\2\7\u008f\3\2\2\2\t\u0091\3\2\2\2\13"+
		"\u0095\3\2\2\2\r\u0097\3\2\2\2\17\u0099\3\2\2\2\21\u00a8\3\2\2\2\23\u00ab"+
		"\3\2\2\2\25\u00b0\3\2\2\2\27\u00b8\3\2\2\2\31\u00be\3\2\2\2\33\u00c7\3"+
		"\2\2\2\35\u00cd\3\2\2\2\37\u00d1\3\2\2\2!\u00d9\3\2\2\2#\u00dd\3\2\2\2"+
		"%\u00e0\3\2\2\2\'\u00e8\3\2\2\2)\u00ed\3\2\2\2+\u00f4\3\2\2\2-\u00fa\3"+
		"\2\2\2/\u0101\3\2\2\2\61\u0107\3\2\2\2\63\u010d\3\2\2\2\65\u0112\3\2\2"+
		"\2\67\u0119\3\2\2\29\u0121\3\2\2\2;\u012b\3\2\2\2=\u012d\3\2\2\2?\u012f"+
		"\3\2\2\2A\u0131\3\2\2\2C\u013c\3\2\2\2E\u0141\3\2\2\2G\u0146\3\2\2\2I"+
		"\u014c\3\2\2\2K\u014e\3\2\2\2M\u0156\3\2\2\2O\u0160\3\2\2\2Q\u016d\3\2"+
		"\2\2S\u0178\3\2\2\2U\u0186\3\2\2\2W\u0191\3\2\2\2Y\u019a\3\2\2\2[\u01a7"+
		"\3\2\2\2]\u01b0\3\2\2\2_\u01b8\3\2\2\2a\u01c5\3\2\2\2c\u01cf\3\2\2\2e"+
		"\u01d1\3\2\2\2g\u01d3\3\2\2\2i\u01d5\3\2\2\2k\u01d7\3\2\2\2m\u01dd\3\2"+
		"\2\2o\u01e4\3\2\2\2q\u01eb\3\2\2\2s\u01f1\3\2\2\2u\u01f3\3\2\2\2w\u01f9"+
		"\3\2\2\2y\u01fb\3\2\2\2{\u0205\3\2\2\2}\u020b\3\2\2\2\177\u0219\3\2\2"+
		"\2\u0081\u0082\7Q\2\2\u0082\u0083\7K\2\2\u0083\u0084\7N\2\2\u0084\u0085"+
		"\7a\2\2\u0085\u0086\7X\2\2\u0086\u0087\7G\2\2\u0087\u0088\7T\2\2\u0088"+
		"\u0089\7U\2\2\u0089\u008a\7K\2\2\u008a\u008b\7Q\2\2\u008b\u008c\7P\2\2"+
		"\u008c\4\3\2\2\2\u008d\u008e\7?\2\2\u008e\6\3\2\2\2\u008f\u0090\7=\2\2"+
		"\u0090\b\3\2\2\2\u0091\u0092\7E\2\2\u0092\u0093\7R\2\2\u0093\u0094\7W"+
		"\2\2\u0094\n\3\2\2\2\u0095\u0096\7}\2\2\u0096\f\3\2\2\2\u0097\u0098\7"+
		"\177\2\2\u0098\16\3\2\2\2\u0099\u009a\7K\2\2\u009a\u009b\7O\2\2\u009b"+
		"\u009c\7R\2\2\u009c\u009d\7N\2\2\u009d\u009e\7G\2\2\u009e\u009f\7O\2\2"+
		"\u009f\u00a0\7G\2\2\u00a0\u00a1\7P\2\2\u00a1\u00a2\7V\2\2\u00a2\u00a3"+
		"\7C\2\2\u00a3\u00a4\7V\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7Q\2\2\u00a6"+
		"\u00a7\7P\2\2\u00a7\20\3\2\2\2\u00a8\u00a9\7Q\2\2\u00a9\u00aa\7U\2\2\u00aa"+
		"\22\3\2\2\2\u00ab\u00ac\7V\2\2\u00ac\u00ad\7C\2\2\u00ad\u00ae\7U\2\2\u00ae"+
		"\u00af\7M\2\2\u00af\24\3\2\2\2\u00b0\u00b1\7E\2\2\u00b1\u00b2\7Q\2\2\u00b2"+
		"\u00b3\7W\2\2\u00b3\u00b4\7P\2\2\u00b4\u00b5\7V\2\2\u00b5\u00b6\7G\2\2"+
		"\u00b6\u00b7\7T\2\2\u00b7\26\3\2\2\2\u00b8\u00b9\7C\2\2\u00b9\u00ba\7"+
		"N\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc\7T\2\2\u00bc\u00bd\7O\2\2\u00bd\30"+
		"\3\2\2\2\u00be\u00bf\7T\2\2\u00bf\u00c0\7G\2\2\u00c0\u00c1\7U\2\2\u00c1"+
		"\u00c2\7Q\2\2\u00c2\u00c3\7W\2\2\u00c3\u00c4\7T\2\2\u00c4\u00c5\7E\2\2"+
		"\u00c5\u00c6\7G\2\2\u00c6\32\3\2\2\2\u00c7\u00c8\7G\2\2\u00c8\u00c9\7"+
		"X\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb\7P\2\2\u00cb\u00cc\7V\2\2\u00cc\34"+
		"\3\2\2\2\u00cd\u00ce\7K\2\2\u00ce\u00cf\7U\2\2\u00cf\u00d0\7T\2\2\u00d0"+
		"\36\3\2\2\2\u00d1\u00d2\7O\2\2\u00d2\u00d3\7G\2\2\u00d3\u00d4\7U\2\2\u00d4"+
		"\u00d5\7U\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7\7I\2\2\u00d7\u00d8\7G\2\2"+
		"\u00d8 \3\2\2\2\u00d9\u00da\7E\2\2\u00da\u00db\7Q\2\2\u00db\u00dc\7O\2"+
		"\2\u00dc\"\3\2\2\2\u00dd\u00de\7P\2\2\u00de\u00df\7O\2\2\u00df$\3\2\2"+
		"\2\u00e0\u00e1\7C\2\2\u00e1\u00e2\7R\2\2\u00e2\u00e3\7R\2\2\u00e3\u00e4"+
		"\7O\2\2\u00e4\u00e5\7Q\2\2\u00e5\u00e6\7F\2\2\u00e6\u00e7\7G\2\2\u00e7"+
		"&\3\2\2\2\u00e8\u00e9\7K\2\2\u00e9\u00ea\7R\2\2\u00ea\u00eb\7F\2\2\u00eb"+
		"\u00ec\7W\2\2\u00ec(\3\2\2\2\u00ed\u00ee\7W\2\2\u00ee\u00ef\7K\2\2\u00ef"+
		"\u00f0\7P\2\2\u00f0\u00f1\7V\2\2\u00f1\u00f2\7\65\2\2\u00f2\u00f3\7\64"+
		"\2\2\u00f3*\3\2\2\2\u00f4\u00f5\7K\2\2\u00f5\u00f6\7P\2\2\u00f6\u00f7"+
		"\7V\2\2\u00f7\u00f8\7\65\2\2\u00f8\u00f9\7\64\2\2\u00f9,\3\2\2\2\u00fa"+
		"\u00fb\7W\2\2\u00fb\u00fc\7K\2\2\u00fc\u00fd\7P\2\2\u00fd\u00fe\7V\2\2"+
		"\u00fe\u00ff\78\2\2\u00ff\u0100\7\66\2\2\u0100.\3\2\2\2\u0101\u0102\7"+
		"K\2\2\u0102\u0103\7P\2\2\u0103\u0104\7V\2\2\u0104\u0105\78\2\2\u0105\u0106"+
		"\7\66\2\2\u0106\60\3\2\2\2\u0107\u0108\7H\2\2\u0108\u0109\7N\2\2\u0109"+
		"\u010a\7Q\2\2\u010a\u010b\7C\2\2\u010b\u010c\7V\2\2\u010c\62\3\2\2\2\u010d"+
		"\u010e\7G\2\2\u010e\u010f\7P\2\2\u010f\u0110\7W\2\2\u0110\u0111\7O\2\2"+
		"\u0111\64\3\2\2\2\u0112\u0113\7U\2\2\u0113\u0114\7V\2\2\u0114\u0115\7"+
		"T\2\2\u0115\u0116\7K\2\2\u0116\u0117\7P\2\2\u0117\u0118\7I\2\2\u0118\66"+
		"\3\2\2\2\u0119\u011a\7D\2\2\u011a\u011b\7Q\2\2\u011b\u011c\7Q\2\2\u011c"+
		"\u011d\7N\2\2\u011d\u011e\7G\2\2\u011e\u011f\7C\2\2\u011f\u0120\7P\2\2"+
		"\u01208\3\2\2\2\u0121\u0122\7Y\2\2\u0122\u0123\7K\2\2\u0123\u0124\7V\2"+
		"\2\u0124\u0125\7J\2\2\u0125\u0126\7a\2\2\u0126\u0127\7C\2\2\u0127\u0128"+
		"\7W\2\2\u0128\u0129\7V\2\2\u0129\u012a\7Q\2\2\u012a:\3\2\2\2\u012b\u012c"+
		"\7]\2\2\u012c<\3\2\2\2\u012d\u012e\7_\2\2\u012e>\3\2\2\2\u012f\u0130\7"+
		".\2\2\u0130@\3\2\2\2\u0131\u0132\7P\2\2\u0132\u0133\7Q\2\2\u0133\u0134"+
		"\7a\2\2\u0134\u0135\7F\2\2\u0135\u0136\7G\2\2\u0136\u0137\7H\2\2\u0137"+
		"\u0138\7C\2\2\u0138\u0139\7W\2\2\u0139\u013a\7N\2\2\u013a\u013b\7V\2\2"+
		"\u013bB\3\2\2\2\u013c\u013d\7C\2\2\u013d\u013e\7W\2\2\u013e\u013f\7V\2"+
		"\2\u013f\u0140\7Q\2\2\u0140D\3\2\2\2\u0141\u0142\7V\2\2\u0142\u0143\7"+
		"T\2\2\u0143\u0144\7W\2\2\u0144\u0145\7G\2\2\u0145F\3\2\2\2\u0146\u0147"+
		"\7H\2\2\u0147\u0148\7C\2\2\u0148\u0149\7N\2\2\u0149\u014a\7U\2\2\u014a"+
		"\u014b\7G\2\2\u014bH\3\2\2\2\u014c\u014d\7<\2\2\u014dJ\3\2\2\2\u014e\u014f"+
		"\7Q\2\2\u014f\u0150\7U\2\2\u0150\u0151\7a\2\2\u0151\u0152\7V\2\2\u0152"+
		"\u0153\7[\2\2\u0153\u0154\7R\2\2\u0154\u0155\7G\2\2\u0155L\3\2\2\2\u0156"+
		"\u0157\7V\2\2\u0157\u0158\7C\2\2\u0158\u0159\7U\2\2\u0159\u015a\7M\2\2"+
		"\u015a\u015b\7a\2\2\u015b\u015c\7V\2\2\u015c\u015d\7[\2\2\u015d\u015e"+
		"\7R\2\2\u015e\u015f\7G\2\2\u015fN\3\2\2\2\u0160\u0161\7E\2\2\u0161\u0162"+
		"\7Q\2\2\u0162\u0163\7W\2\2\u0163\u0164\7P\2\2\u0164\u0165\7V\2\2\u0165"+
		"\u0166\7G\2\2\u0166\u0167\7T\2\2\u0167\u0168\7-\2\2\u0168\u0169\7V\2\2"+
		"\u0169\u016a\7[\2\2\u016a\u016b\7R\2\2\u016b\u016c\7G\2\2\u016cP\3\2\2"+
		"\2\u016d\u016e\7C\2\2\u016e\u016f\7N\2\2\u016f\u0170\7C\2\2\u0170\u0171"+
		"\7T\2\2\u0171\u0172\7O\2\2\u0172\u0173\7a\2\2\u0173\u0174\7V\2\2\u0174"+
		"\u0175\7[\2\2\u0175\u0176\7R\2\2\u0176\u0177\7G\2\2\u0177R\3\2\2\2\u0178"+
		"\u0179\7T\2\2\u0179\u017a\7G\2\2\u017a\u017b\7U\2\2\u017b\u017c\7Q\2\2"+
		"\u017c\u017d\7W\2\2\u017d\u017e\7T\2\2\u017e\u017f\7E\2\2\u017f\u0180"+
		"\7G\2\2\u0180\u0181\7a\2\2\u0181\u0182\7V\2\2\u0182\u0183\7[\2\2\u0183"+
		"\u0184\7R\2\2\u0184\u0185\7G\2\2\u0185T\3\2\2\2\u0186\u0187\7G\2\2\u0187"+
		"\u0188\7X\2\2\u0188\u0189\7G\2\2\u0189\u018a\7P\2\2\u018a\u018b\7V\2\2"+
		"\u018b\u018c\7a\2\2\u018c\u018d\7V\2\2\u018d\u018e\7[\2\2\u018e\u018f"+
		"\7R\2\2\u018f\u0190\7G\2\2\u0190V\3\2\2\2\u0191\u0192\7K\2\2\u0192\u0193"+
		"\7U\2\2\u0193\u0194\7T\2\2\u0194\u0195\7a\2\2\u0195\u0196\7V\2\2\u0196"+
		"\u0197\7[\2\2\u0197\u0198\7R\2\2\u0198\u0199\7G\2\2\u0199X\3\2\2\2\u019a"+
		"\u019b\7O\2\2\u019b\u019c\7G\2\2\u019c\u019d\7U\2\2\u019d\u019e\7U\2\2"+
		"\u019e\u019f\7C\2\2\u019f\u01a0\7I\2\2\u01a0\u01a1\7G\2\2\u01a1\u01a2"+
		"\7a\2\2\u01a2\u01a3\7V\2\2\u01a3\u01a4\7[\2\2\u01a4\u01a5\7R\2\2\u01a5"+
		"\u01a6\7G\2\2\u01a6Z\3\2\2\2\u01a7\u01a8\7E\2\2\u01a8\u01a9\7Q\2\2\u01a9"+
		"\u01aa\7O\2\2\u01aa\u01ab\7a\2\2\u01ab\u01ac\7V\2\2\u01ac\u01ad\7[\2\2"+
		"\u01ad\u01ae\7R\2\2\u01ae\u01af\7G\2\2\u01af\\\3\2\2\2\u01b0\u01b1\7P"+
		"\2\2\u01b1\u01b2\7O\2\2\u01b2\u01b3\7a\2\2\u01b3\u01b4\7V\2\2\u01b4\u01b5"+
		"\7[\2\2\u01b5\u01b6\7R\2\2\u01b6\u01b7\7G\2\2\u01b7^\3\2\2\2\u01b8\u01b9"+
		"\7C\2\2\u01b9\u01ba\7R\2\2\u01ba\u01bb\7R\2\2\u01bb\u01bc\7O\2\2\u01bc"+
		"\u01bd\7Q\2\2\u01bd\u01be\7F\2\2\u01be\u01bf\7G\2\2\u01bf\u01c0\7a\2\2"+
		"\u01c0\u01c1\7V\2\2\u01c1\u01c2\7[\2\2\u01c2\u01c3\7R\2\2\u01c3\u01c4"+
		"\7G\2\2\u01c4`\3\2\2\2\u01c5\u01c6\7K\2\2\u01c6\u01c7\7R\2\2\u01c7\u01c8"+
		"\7F\2\2\u01c8\u01c9\7W\2\2\u01c9\u01ca\7a\2\2\u01ca\u01cb\7V\2\2\u01cb"+
		"\u01cc\7[\2\2\u01cc\u01cd\7R\2\2\u01cd\u01ce\7G\2\2\u01ceb\3\2\2\2\u01cf"+
		"\u01d0\7-\2\2\u01d0d\3\2\2\2\u01d1\u01d2\7/\2\2\u01d2f\3\2\2\2\u01d3\u01d4"+
		"\7\60\2\2\u01d4h\3\2\2\2\u01d5\u01d6\7g\2\2\u01d6j\3\2\2\2\u01d7\u01d8"+
		"\7G\2\2\u01d8l\3\2\2\2\u01d9\u01da\7\62\2\2\u01da\u01de\7Z\2\2\u01db\u01dc"+
		"\7\62\2\2\u01dc\u01de\7z\2\2\u01dd\u01d9\3\2\2\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01e0\3\2\2\2\u01df\u01e1\5u;\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2"+
		"\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3n\3\2\2\2\u01e4\u01e8"+
		"\5s:\2\u01e5\u01e7\5w<\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9p\3\2\2\2\u01ea\u01e8\3\2\2\2"+
		"\u01eb\u01ec\4\62;\2\u01ecr\3\2\2\2\u01ed\u01f2\t\2\2\2\u01ee\u01f2\n"+
		"\3\2\2\u01ef\u01f0\t\4\2\2\u01f0\u01f2\t\5\2\2\u01f1\u01ed\3\2\2\2\u01f1"+
		"\u01ee\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2t\3\2\2\2\u01f3\u01f4\t\6\2\2"+
		"\u01f4v\3\2\2\2\u01f5\u01fa\t\7\2\2\u01f6\u01fa\n\3\2\2\u01f7\u01f8\t"+
		"\4\2\2\u01f8\u01fa\t\5\2\2\u01f9\u01f5\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01fax\3\2\2\2\u01fb\u01ff\7$\2\2\u01fc\u01fe\n\b\2\2\u01fd"+
		"\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7$\2\2\u0203"+
		"z\3\2\2\2\u0204\u0206\t\t\2\2\u0205\u0204\3\2\2\2\u0206\u0207\3\2\2\2"+
		"\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a"+
		"\b>\2\2\u020a|\3\2\2\2\u020b\u020c\7\61\2\2\u020c\u020d\7,\2\2\u020d\u0211"+
		"\3\2\2\2\u020e\u0210\13\2\2\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2"+
		"\u0211\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0211"+
		"\3\2\2\2\u0214\u0215\7,\2\2\u0215\u0216\7\61\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0218\b?\2\2\u0218~\3\2\2\2\u0219\u021a\7\61\2\2\u021a\u021b\7\61\2\2"+
		"\u021b\u021f\3\2\2\2\u021c\u021e\n\n\2\2\u021d\u021c\3\2\2\2\u021e\u0221"+
		"\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0222\u0223\b@\2\2\u0223\u0080\3\2\2\2\f\2\u01dd\u01e2"+
		"\u01e8\u01f1\u01f9\u01ff\u0207\u0211\u021f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}