package ALGOL60.grammar;// $ANTLR null /home/walid/Bureau/COMPILATION/tester-file/Algol60.g 2020-04-26 18:10:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class Algol60Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_ACCESS", "ARRAY_BOUNDS", 
		"ARRAY_DECLARATION", "ARRAY_DIMENSION", "ARRAY_ID", "ARRAY_SEGMENT", "ASSIGNMENT", 
		"BEGIN", "BLOCK", "BOUNDS", "COMMENT", "DECLARATIONS", "DO", "ELSE", "EMPTY_STATEMENT", 
		"ESC_SEQ", "EXPONENT", "FOR", "FOR_ELEMENT", "FOR_LIST", "FUNCTION_CALL", 
		"GOTO", "IF", "INDEX", "INT", "Identifier", "LABEL", "LABELLED_BLOCK", 
		"LABELLED_EMPTY_STATEMENT", "LABELLED_STATEMENT", "LABELLIST", "LISTPARAMETER", 
		"LOCAL_DECLARATION", "Letter", "Number", "OCTAL_ESC", "OWN_DECLARATION", 
		"PROC_DECLARATION", "PROG", "SPECIFICATION", "SPECIFIED_ID", "STATEMENTS", 
		"STEP", "STRING", "SWITCH_CALL", "SWITCH_CASE", "SWITCH_DECLARATION", 
		"SWITCH_LIST", "THEN", "UNTIL", "VALUE", "VAR_ID", "WHILE", "WS", "'('", 
		"')'", "'*'", "'**'", "'+'", "','", "'-'", "'/'", "'//'", "':'", "':='", 
		"';'", "'<'", "'<='", "'<=>'", "'<>'", "'='", "'=>'", "'>'", "'>='", "'AND'", 
		"'OR'", "'['", "']'", "'array'", "'begin'", "'boolean'", "'do'", "'else'", 
		"'end'", "'false'", "'for'", "'goto'", "'if'", "'integer'", "'label'", 
		"'own'", "'procedure'", "'real'", "'step'", "'string'", "'switch'", "'then'", 
		"'true'", "'until'", "'value'", "'while'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int ARRAY_ACCESS=4;
	public static final int ARRAY_BOUNDS=5;
	public static final int ARRAY_DECLARATION=6;
	public static final int ARRAY_DIMENSION=7;
	public static final int ARRAY_ID=8;
	public static final int ARRAY_SEGMENT=9;
	public static final int ASSIGNMENT=10;
	public static final int BEGIN=11;
	public static final int BLOCK=12;
	public static final int BOUNDS=13;
	public static final int COMMENT=14;
	public static final int DECLARATIONS=15;
	public static final int DO=16;
	public static final int ELSE=17;
	public static final int EMPTY_STATEMENT=18;
	public static final int ESC_SEQ=19;
	public static final int EXPONENT=20;
	public static final int FOR=21;
	public static final int FOR_ELEMENT=22;
	public static final int FOR_LIST=23;
	public static final int FUNCTION_CALL=24;
	public static final int GOTO=25;
	public static final int IF=26;
	public static final int INDEX=27;
	public static final int INT=28;
	public static final int Identifier=29;
	public static final int LABEL=30;
	public static final int LABELLED_BLOCK=31;
	public static final int LABELLED_EMPTY_STATEMENT=32;
	public static final int LABELLED_STATEMENT=33;
	public static final int LABELLIST=34;
	public static final int LISTPARAMETER=35;
	public static final int LOCAL_DECLARATION=36;
	public static final int Letter=37;
	public static final int Number=38;
	public static final int OCTAL_ESC=39;
	public static final int OWN_DECLARATION=40;
	public static final int PROC_DECLARATION=41;
	public static final int PROG=42;
	public static final int SPECIFICATION=43;
	public static final int SPECIFIED_ID=44;
	public static final int STATEMENTS=45;
	public static final int STEP=46;
	public static final int STRING=47;
	public static final int SWITCH_CALL=48;
	public static final int SWITCH_CASE=49;
	public static final int SWITCH_DECLARATION=50;
	public static final int SWITCH_LIST=51;
	public static final int THEN=52;
	public static final int UNTIL=53;
	public static final int VALUE=54;
	public static final int VAR_ID=55;
	public static final int WHILE=56;
	public static final int WS=57;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public Algol60Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public Algol60Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return Algol60Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/walid/Bureau/COMPILATION/tester-file/Algol60.g"; }


	 CommonTree Identifiermemory;
	 CommonTree Identifiermemory2;



	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:95:1: program : start_program -> ^( PROG start_program ) ;
	public final program_return program() throws RecognitionException {
		program_return retval = new program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope start_program1 =null;

		RewriteRuleSubtreeStream stream_start_program=new RewriteRuleSubtreeStream(adaptor,"rule start_program");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:95:12: ( start_program -> ^( PROG start_program ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:95:15: start_program
			{
			pushFollow(FOLLOW_start_program_in_program225);
			start_program1=start_program();
			state._fsp--;

			stream_start_program.add(start_program1.getTree());
			// AST REWRITE
			// elements: start_program
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 95:29: -> ^( PROG start_program )
			{
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:95:31: ^( PROG start_program )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);
				adaptor.addChild(root_1, stream_start_program.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class start_program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "start_program"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:99:1: start_program : ( rest_program | 'begin' ( declaration ';' )* compound_tail -> ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? ) );
	public final start_program_return start_program() throws RecognitionException {
		start_program_return retval = new start_program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal3=null;
		Token char_literal5=null;
		ParserRuleReturnScope rest_program2 =null;
		ParserRuleReturnScope declaration4 =null;
		ParserRuleReturnScope compound_tail6 =null;

		CommonTree string_literal3_tree=null;
		CommonTree char_literal5_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_compound_tail=new RewriteRuleSubtreeStream(adaptor,"rule compound_tail");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:100:3: ( rest_program | 'begin' ( declaration ';' )* compound_tail -> ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Identifier||LA2_0==Number) ) {
				alt2=1;
			}
			else if ( (LA2_0==83) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:100:5: rest_program
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rest_program_in_start_program270);
					rest_program2=rest_program();
					state._fsp--;

					adaptor.addChild(root_0, rest_program2.getTree());

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:101:15: 'begin' ( declaration ';' )* compound_tail
					{
					string_literal3=(Token)match(input,83,FOLLOW_83_in_start_program286);  
					stream_83.add(string_literal3);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:101:23: ( declaration ';' )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==82||LA1_0==84||LA1_0==92||(LA1_0 >= 94 && LA1_0 <= 96)||LA1_0==99) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:101:24: declaration ';'
							{
							pushFollow(FOLLOW_declaration_in_start_program289);
							declaration4=declaration();
							state._fsp--;

							stream_declaration.add(declaration4.getTree());
							char_literal5=(Token)match(input,69,FOLLOW_69_in_start_program291);  
							stream_69.add(char_literal5);

							}
							break;

						default :
							break loop1;
						}
					}

					pushFollow(FOLLOW_compound_tail_in_start_program295);
					compound_tail6=compound_tail();
					state._fsp--;

					stream_compound_tail.add(compound_tail6.getTree());
					// AST REWRITE
					// elements: compound_tail, declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 101:56: -> ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:101:59: ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BEGIN, "BEGIN"), root_1);
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:101:68: ( ^( DECLARATIONS ( declaration )* ) )?
						if ( stream_declaration.hasNext() ) {
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:101:68: ^( DECLARATIONS ( declaration )* )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_2);
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:101:83: ( declaration )*
							while ( stream_declaration.hasNext() ) {
								adaptor.addChild(root_2, stream_declaration.nextTree());
							}
							stream_declaration.reset();

							adaptor.addChild(root_1, root_2);
							}

						}
						stream_declaration.reset();

						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:101:98: ( ^( BLOCK compound_tail ) )?
						if ( stream_compound_tail.hasNext() ) {
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:101:98: ^( BLOCK compound_tail )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);
							adaptor.addChild(root_2, stream_compound_tail.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_compound_tail.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "start_program"


	public static class rest_program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rest_program"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:104:1: rest_program : ( label ':' ) start_program -> ^( LABELLED_BLOCK label start_program ) ;
	public final rest_program_return rest_program() throws RecognitionException {
		rest_program_return retval = new rest_program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal8=null;
		ParserRuleReturnScope label7 =null;
		ParserRuleReturnScope start_program9 =null;

		CommonTree char_literal8_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleSubtreeStream stream_label=new RewriteRuleSubtreeStream(adaptor,"rule label");
		RewriteRuleSubtreeStream stream_start_program=new RewriteRuleSubtreeStream(adaptor,"rule start_program");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:105:14: ( ( label ':' ) start_program -> ^( LABELLED_BLOCK label start_program ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:105:17: ( label ':' ) start_program
			{
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:105:17: ( label ':' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:105:18: label ':'
			{
			pushFollow(FOLLOW_label_in_rest_program344);
			label7=label();
			state._fsp--;

			stream_label.add(label7.getTree());
			char_literal8=(Token)match(input,67,FOLLOW_67_in_rest_program346);  
			stream_67.add(char_literal8);

			}

			pushFollow(FOLLOW_start_program_in_rest_program349);
			start_program9=start_program();
			state._fsp--;

			stream_start_program.add(start_program9.getTree());
			// AST REWRITE
			// elements: label, start_program
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 105:43: -> ^( LABELLED_BLOCK label start_program )
			{
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:105:46: ^( LABELLED_BLOCK label start_program )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABELLED_BLOCK, "LABELLED_BLOCK"), root_1);
				adaptor.addChild(root_1, stream_label.nextTree());
				adaptor.addChild(root_1, stream_start_program.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rest_program"


	public static class label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:108:1: label : ( Number | Identifier );
	public final label_return label() throws RecognitionException {
		label_return retval = new label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set10=null;

		CommonTree set10_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:108:7: ( Number | Identifier )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set10=input.LT(1);
			if ( input.LA(1)==Identifier||input.LA(1)==Number ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set10));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "label"


	public static class compound_tail_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "compound_tail"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:114:1: compound_tail : statement ( ';' statement )* 'end' -> ( statement )+ ;
	public final compound_tail_return compound_tail() throws RecognitionException {
		compound_tail_return retval = new compound_tail_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal12=null;
		Token string_literal14=null;
		ParserRuleReturnScope statement11 =null;
		ParserRuleReturnScope statement13 =null;

		CommonTree char_literal12_tree=null;
		CommonTree string_literal14_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:115:2: ( statement ( ';' statement )* 'end' -> ( statement )+ )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:115:5: statement ( ';' statement )* 'end'
			{
			pushFollow(FOLLOW_statement_in_compound_tail449);
			statement11=statement();
			state._fsp--;

			stream_statement.add(statement11.getTree());
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:115:15: ( ';' statement )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==69) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:115:16: ';' statement
					{
					char_literal12=(Token)match(input,69,FOLLOW_69_in_compound_tail452);  
					stream_69.add(char_literal12);

					pushFollow(FOLLOW_statement_in_compound_tail454);
					statement13=statement();
					state._fsp--;

					stream_statement.add(statement13.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			string_literal14=(Token)match(input,87,FOLLOW_87_in_compound_tail458);  
			stream_87.add(string_literal14);

			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 115:37: -> ( statement )+
			{
				if ( !(stream_statement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_0, stream_statement.nextTree());
				}
				stream_statement.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_tail"


	public static class declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:120:1: declaration : ( 'own' own_declaration_1 -> ^( OWN_DECLARATION own_declaration_1 ) | switch_declaration -> ^( SWITCH_DECLARATION switch_declaration ) | type declarationtypenoown -> ^( LOCAL_DECLARATION type declarationtypenoown ) | array_declaration -> ^( ARRAY_DECLARATION array_declaration ) | procedure_declaration -> ^( PROC_DECLARATION procedure_declaration ) );
	public final declaration_return declaration() throws RecognitionException {
		declaration_return retval = new declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal15=null;
		ParserRuleReturnScope own_declaration_116 =null;
		ParserRuleReturnScope switch_declaration17 =null;
		ParserRuleReturnScope type18 =null;
		ParserRuleReturnScope declarationtypenoown19 =null;
		ParserRuleReturnScope array_declaration20 =null;
		ParserRuleReturnScope procedure_declaration21 =null;

		CommonTree string_literal15_tree=null;
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
		RewriteRuleSubtreeStream stream_declarationtypenoown=new RewriteRuleSubtreeStream(adaptor,"rule declarationtypenoown");
		RewriteRuleSubtreeStream stream_array_declaration=new RewriteRuleSubtreeStream(adaptor,"rule array_declaration");
		RewriteRuleSubtreeStream stream_own_declaration_1=new RewriteRuleSubtreeStream(adaptor,"rule own_declaration_1");
		RewriteRuleSubtreeStream stream_procedure_declaration=new RewriteRuleSubtreeStream(adaptor,"rule procedure_declaration");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_switch_declaration=new RewriteRuleSubtreeStream(adaptor,"rule switch_declaration");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:120:13: ( 'own' own_declaration_1 -> ^( OWN_DECLARATION own_declaration_1 ) | switch_declaration -> ^( SWITCH_DECLARATION switch_declaration ) | type declarationtypenoown -> ^( LOCAL_DECLARATION type declarationtypenoown ) | array_declaration -> ^( ARRAY_DECLARATION array_declaration ) | procedure_declaration -> ^( PROC_DECLARATION procedure_declaration ) )
			int alt4=5;
			switch ( input.LA(1) ) {
			case 94:
				{
				alt4=1;
				}
				break;
			case 99:
				{
				alt4=2;
				}
				break;
			case 84:
			case 92:
			case 96:
				{
				alt4=3;
				}
				break;
			case 82:
				{
				alt4=4;
				}
				break;
			case 95:
				{
				alt4=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:120:26: 'own' own_declaration_1
					{
					string_literal15=(Token)match(input,94,FOLLOW_94_in_declaration485);  
					stream_94.add(string_literal15);

					pushFollow(FOLLOW_own_declaration_1_in_declaration488);
					own_declaration_116=own_declaration_1();
					state._fsp--;

					stream_own_declaration_1.add(own_declaration_116.getTree());
					// AST REWRITE
					// elements: own_declaration_1
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 120:51: -> ^( OWN_DECLARATION own_declaration_1 )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:120:54: ^( OWN_DECLARATION own_declaration_1 )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OWN_DECLARATION, "OWN_DECLARATION"), root_1);
						adaptor.addChild(root_1, stream_own_declaration_1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:121:26: switch_declaration
					{
					pushFollow(FOLLOW_switch_declaration_in_declaration524);
					switch_declaration17=switch_declaration();
					state._fsp--;

					stream_switch_declaration.add(switch_declaration17.getTree());
					// AST REWRITE
					// elements: switch_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 121:45: -> ^( SWITCH_DECLARATION switch_declaration )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:121:47: ^( SWITCH_DECLARATION switch_declaration )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SWITCH_DECLARATION, "SWITCH_DECLARATION"), root_1);
						adaptor.addChild(root_1, stream_switch_declaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:122:26: type declarationtypenoown
					{
					pushFollow(FOLLOW_type_in_declaration559);
					type18=type();
					state._fsp--;

					stream_type.add(type18.getTree());
					pushFollow(FOLLOW_declarationtypenoown_in_declaration561);
					declarationtypenoown19=declarationtypenoown();
					state._fsp--;

					stream_declarationtypenoown.add(declarationtypenoown19.getTree());
					// AST REWRITE
					// elements: type, declarationtypenoown
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 122:53: -> ^( LOCAL_DECLARATION type declarationtypenoown )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:122:56: ^( LOCAL_DECLARATION type declarationtypenoown )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCAL_DECLARATION, "LOCAL_DECLARATION"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_declarationtypenoown.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:123:26: array_declaration
					{
					pushFollow(FOLLOW_array_declaration_in_declaration599);
					array_declaration20=array_declaration();
					state._fsp--;

					stream_array_declaration.add(array_declaration20.getTree());
					// AST REWRITE
					// elements: array_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 123:44: -> ^( ARRAY_DECLARATION array_declaration )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:123:47: ^( ARRAY_DECLARATION array_declaration )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_DECLARATION, "ARRAY_DECLARATION"), root_1);
						adaptor.addChild(root_1, stream_array_declaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:124:26: procedure_declaration
					{
					pushFollow(FOLLOW_procedure_declaration_in_declaration634);
					procedure_declaration21=procedure_declaration();
					state._fsp--;

					stream_procedure_declaration.add(procedure_declaration21.getTree());
					// AST REWRITE
					// elements: procedure_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 124:48: -> ^( PROC_DECLARATION procedure_declaration )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:124:51: ^( PROC_DECLARATION procedure_declaration )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC_DECLARATION, "PROC_DECLARATION"), root_1);
						adaptor.addChild(root_1, stream_procedure_declaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class declarationtypenoown_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarationtypenoown"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:129:1: declarationtypenoown : ( procedure_declaration -> ^( PROC_DECLARATION procedure_declaration ) | array_declaration -> ^( ARRAY_DECLARATION array_declaration ) | type_declaration -> ^( VAR_ID type_declaration ) );
	public final declarationtypenoown_return declarationtypenoown() throws RecognitionException {
		declarationtypenoown_return retval = new declarationtypenoown_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope procedure_declaration22 =null;
		ParserRuleReturnScope array_declaration23 =null;
		ParserRuleReturnScope type_declaration24 =null;

		RewriteRuleSubtreeStream stream_array_declaration=new RewriteRuleSubtreeStream(adaptor,"rule array_declaration");
		RewriteRuleSubtreeStream stream_procedure_declaration=new RewriteRuleSubtreeStream(adaptor,"rule procedure_declaration");
		RewriteRuleSubtreeStream stream_type_declaration=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:130:2: ( procedure_declaration -> ^( PROC_DECLARATION procedure_declaration ) | array_declaration -> ^( ARRAY_DECLARATION array_declaration ) | type_declaration -> ^( VAR_ID type_declaration ) )
			int alt5=3;
			switch ( input.LA(1) ) {
			case 95:
				{
				alt5=1;
				}
				break;
			case 82:
				{
				alt5=2;
				}
				break;
			case Identifier:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:130:10: procedure_declaration
					{
					pushFollow(FOLLOW_procedure_declaration_in_declarationtypenoown671);
					procedure_declaration22=procedure_declaration();
					state._fsp--;

					stream_procedure_declaration.add(procedure_declaration22.getTree());
					// AST REWRITE
					// elements: procedure_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 130:32: -> ^( PROC_DECLARATION procedure_declaration )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:130:35: ^( PROC_DECLARATION procedure_declaration )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC_DECLARATION, "PROC_DECLARATION"), root_1);
						adaptor.addChild(root_1, stream_procedure_declaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:131:10: array_declaration
					{
					pushFollow(FOLLOW_array_declaration_in_declarationtypenoown690);
					array_declaration23=array_declaration();
					state._fsp--;

					stream_array_declaration.add(array_declaration23.getTree());
					// AST REWRITE
					// elements: array_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 131:29: -> ^( ARRAY_DECLARATION array_declaration )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:131:32: ^( ARRAY_DECLARATION array_declaration )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_DECLARATION, "ARRAY_DECLARATION"), root_1);
						adaptor.addChild(root_1, stream_array_declaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:132:10: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_declarationtypenoown710);
					type_declaration24=type_declaration();
					state._fsp--;

					stream_type_declaration.add(type_declaration24.getTree());
					// AST REWRITE
					// elements: type_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 132:28: -> ^( VAR_ID type_declaration )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:132:31: ^( VAR_ID type_declaration )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_ID, "VAR_ID"), root_1);
						adaptor.addChild(root_1, stream_type_declaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarationtypenoown"


	public static class own_declaration_1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "own_declaration_1"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:136:2: own_declaration_1 : ( array_declaration -> ^( ARRAY_DECLARATION array_declaration ) | type own_typed );
	public final own_declaration_1_return own_declaration_1() throws RecognitionException {
		own_declaration_1_return retval = new own_declaration_1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope array_declaration25 =null;
		ParserRuleReturnScope type26 =null;
		ParserRuleReturnScope own_typed27 =null;

		RewriteRuleSubtreeStream stream_array_declaration=new RewriteRuleSubtreeStream(adaptor,"rule array_declaration");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:137:3: ( array_declaration -> ^( ARRAY_DECLARATION array_declaration ) | type own_typed )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==82) ) {
				alt6=1;
			}
			else if ( (LA6_0==84||LA6_0==92||LA6_0==96) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:137:5: array_declaration
					{
					pushFollow(FOLLOW_array_declaration_in_own_declaration_1733);
					array_declaration25=array_declaration();
					state._fsp--;

					stream_array_declaration.add(array_declaration25.getTree());
					// AST REWRITE
					// elements: array_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 137:24: -> ^( ARRAY_DECLARATION array_declaration )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:137:27: ^( ARRAY_DECLARATION array_declaration )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_DECLARATION, "ARRAY_DECLARATION"), root_1);
						adaptor.addChild(root_1, stream_array_declaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:138:15: type own_typed
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_type_in_own_declaration_1758);
					type26=type();
					state._fsp--;

					adaptor.addChild(root_0, type26.getTree());

					pushFollow(FOLLOW_own_typed_in_own_declaration_1760);
					own_typed27=own_typed();
					state._fsp--;

					adaptor.addChild(root_0, own_typed27.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "own_declaration_1"


	public static class own_typed_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "own_typed"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:141:1: own_typed : ( type_declaration -> ^( VAR_ID type_declaration ) | array_declaration -> ^( ARRAY_DECLARATION array_declaration ) );
	public final own_typed_return own_typed() throws RecognitionException {
		own_typed_return retval = new own_typed_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope type_declaration28 =null;
		ParserRuleReturnScope array_declaration29 =null;

		RewriteRuleSubtreeStream stream_array_declaration=new RewriteRuleSubtreeStream(adaptor,"rule array_declaration");
		RewriteRuleSubtreeStream stream_type_declaration=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:142:2: ( type_declaration -> ^( VAR_ID type_declaration ) | array_declaration -> ^( ARRAY_DECLARATION array_declaration ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Identifier) ) {
				alt7=1;
			}
			else if ( (LA7_0==82) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:142:5: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_own_typed774);
					type_declaration28=type_declaration();
					state._fsp--;

					stream_type_declaration.add(type_declaration28.getTree());
					// AST REWRITE
					// elements: type_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 142:22: -> ^( VAR_ID type_declaration )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:142:24: ^( VAR_ID type_declaration )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_ID, "VAR_ID"), root_1);
						adaptor.addChild(root_1, stream_type_declaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:143:4: array_declaration
					{
					pushFollow(FOLLOW_array_declaration_in_own_typed786);
					array_declaration29=array_declaration();
					state._fsp--;

					stream_array_declaration.add(array_declaration29.getTree());
					// AST REWRITE
					// elements: array_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 143:23: -> ^( ARRAY_DECLARATION array_declaration )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:143:26: ^( ARRAY_DECLARATION array_declaration )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_DECLARATION, "ARRAY_DECLARATION"), root_1);
						adaptor.addChild(root_1, stream_array_declaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "own_typed"


	public static class type_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_declaration"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:148:1: type_declaration : Identifier ( ',' Identifier )* -> ( Identifier )+ ;
	public final type_declaration_return type_declaration() throws RecognitionException {
		type_declaration_return retval = new type_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier30=null;
		Token char_literal31=null;
		Token Identifier32=null;

		CommonTree Identifier30_tree=null;
		CommonTree char_literal31_tree=null;
		CommonTree Identifier32_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:149:2: ( Identifier ( ',' Identifier )* -> ( Identifier )+ )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:150:2: Identifier ( ',' Identifier )*
			{
			Identifier30=(Token)match(input,Identifier,FOLLOW_Identifier_in_type_declaration813);  
			stream_Identifier.add(Identifier30);

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:150:13: ( ',' Identifier )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==63) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:150:14: ',' Identifier
					{
					char_literal31=(Token)match(input,63,FOLLOW_63_in_type_declaration816);  
					stream_63.add(char_literal31);

					Identifier32=(Token)match(input,Identifier,FOLLOW_Identifier_in_type_declaration818);  
					stream_Identifier.add(Identifier32);

					}
					break;

				default :
					break loop8;
				}
			}

			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 150:31: -> ( Identifier )+
			{
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_0, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_declaration"


	public static class array_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "array_declaration"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:154:1: array_declaration : 'array' array_list -> array_list ;
	public final array_declaration_return array_declaration() throws RecognitionException {
		array_declaration_return retval = new array_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal33=null;
		ParserRuleReturnScope array_list34 =null;

		CommonTree string_literal33_tree=null;
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleSubtreeStream stream_array_list=new RewriteRuleSubtreeStream(adaptor,"rule array_list");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:155:2: ( 'array' array_list -> array_list )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:155:5: 'array' array_list
			{
			string_literal33=(Token)match(input,82,FOLLOW_82_in_array_declaration838);  
			stream_82.add(string_literal33);

			pushFollow(FOLLOW_array_list_in_array_declaration840);
			array_list34=array_list();
			state._fsp--;

			stream_array_list.add(array_list34.getTree());
			// AST REWRITE
			// elements: array_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 155:24: -> array_list
			{
				adaptor.addChild(root_0, stream_array_list.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_declaration"


	public static class array_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "array_list"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:159:1: array_list : array_segment ( ',' array_segment )* -> ( array_segment )+ ;
	public final array_list_return array_list() throws RecognitionException {
		array_list_return retval = new array_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal36=null;
		ParserRuleReturnScope array_segment35 =null;
		ParserRuleReturnScope array_segment37 =null;

		CommonTree char_literal36_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_array_segment=new RewriteRuleSubtreeStream(adaptor,"rule array_segment");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:160:2: ( array_segment ( ',' array_segment )* -> ( array_segment )+ )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:160:5: array_segment ( ',' array_segment )*
			{
			pushFollow(FOLLOW_array_segment_in_array_list857);
			array_segment35=array_segment();
			state._fsp--;

			stream_array_segment.add(array_segment35.getTree());
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:160:19: ( ',' array_segment )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==63) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:160:20: ',' array_segment
					{
					char_literal36=(Token)match(input,63,FOLLOW_63_in_array_list860);  
					stream_63.add(char_literal36);

					pushFollow(FOLLOW_array_segment_in_array_list862);
					array_segment37=array_segment();
					state._fsp--;

					stream_array_segment.add(array_segment37.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			// AST REWRITE
			// elements: array_segment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 160:40: -> ( array_segment )+
			{
				if ( !(stream_array_segment.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_array_segment.hasNext() ) {
					adaptor.addChild(root_0, stream_array_segment.nextTree());
				}
				stream_array_segment.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_list"


	public static class array_segment_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "array_segment"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:164:1: array_segment : Identifier ( ',' Identifier )* '[' bound_pair_list ']' -> ^( ARRAY_SEGMENT ^( ARRAY_ID ( Identifier )+ ) ^( ARRAY_DIMENSION bound_pair_list ) ) ;
	public final array_segment_return array_segment() throws RecognitionException {
		array_segment_return retval = new array_segment_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier38=null;
		Token char_literal39=null;
		Token Identifier40=null;
		Token char_literal41=null;
		Token char_literal43=null;
		ParserRuleReturnScope bound_pair_list42 =null;

		CommonTree Identifier38_tree=null;
		CommonTree char_literal39_tree=null;
		CommonTree Identifier40_tree=null;
		CommonTree char_literal41_tree=null;
		CommonTree char_literal43_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_bound_pair_list=new RewriteRuleSubtreeStream(adaptor,"rule bound_pair_list");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:165:2: ( Identifier ( ',' Identifier )* '[' bound_pair_list ']' -> ^( ARRAY_SEGMENT ^( ARRAY_ID ( Identifier )+ ) ^( ARRAY_DIMENSION bound_pair_list ) ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:165:5: Identifier ( ',' Identifier )* '[' bound_pair_list ']'
			{
			Identifier38=(Token)match(input,Identifier,FOLLOW_Identifier_in_array_segment884);  
			stream_Identifier.add(Identifier38);

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:165:17: ( ',' Identifier )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==63) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:165:18: ',' Identifier
					{
					char_literal39=(Token)match(input,63,FOLLOW_63_in_array_segment888);  
					stream_63.add(char_literal39);

					Identifier40=(Token)match(input,Identifier,FOLLOW_Identifier_in_array_segment890);  
					stream_Identifier.add(Identifier40);

					}
					break;

				default :
					break loop10;
				}
			}

			char_literal41=(Token)match(input,80,FOLLOW_80_in_array_segment894);  
			stream_80.add(char_literal41);

			pushFollow(FOLLOW_bound_pair_list_in_array_segment896);
			bound_pair_list42=bound_pair_list();
			state._fsp--;

			stream_bound_pair_list.add(bound_pair_list42.getTree());
			char_literal43=(Token)match(input,81,FOLLOW_81_in_array_segment898);  
			stream_81.add(char_literal43);

			// AST REWRITE
			// elements: Identifier, bound_pair_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 165:59: -> ^( ARRAY_SEGMENT ^( ARRAY_ID ( Identifier )+ ) ^( ARRAY_DIMENSION bound_pair_list ) )
			{
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:165:61: ^( ARRAY_SEGMENT ^( ARRAY_ID ( Identifier )+ ) ^( ARRAY_DIMENSION bound_pair_list ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_SEGMENT, "ARRAY_SEGMENT"), root_1);
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:165:77: ^( ARRAY_ID ( Identifier )+ )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_ID, "ARRAY_ID"), root_2);
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_2, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:165:101: ^( ARRAY_DIMENSION bound_pair_list )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_DIMENSION, "ARRAY_DIMENSION"), root_2);
				adaptor.addChild(root_2, stream_bound_pair_list.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_segment"


	public static class bound_pair_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bound_pair_list"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:170:1: bound_pair_list : bound_pair ( ',' bound_pair )* -> ( bound_pair )+ ;
	public final bound_pair_list_return bound_pair_list() throws RecognitionException {
		bound_pair_list_return retval = new bound_pair_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal45=null;
		ParserRuleReturnScope bound_pair44 =null;
		ParserRuleReturnScope bound_pair46 =null;

		CommonTree char_literal45_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_bound_pair=new RewriteRuleSubtreeStream(adaptor,"rule bound_pair");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:171:2: ( bound_pair ( ',' bound_pair )* -> ( bound_pair )+ )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:171:5: bound_pair ( ',' bound_pair )*
			{
			pushFollow(FOLLOW_bound_pair_in_bound_pair_list952);
			bound_pair44=bound_pair();
			state._fsp--;

			stream_bound_pair.add(bound_pair44.getTree());
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:171:16: ( ',' bound_pair )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==63) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:171:17: ',' bound_pair
					{
					char_literal45=(Token)match(input,63,FOLLOW_63_in_bound_pair_list955);  
					stream_63.add(char_literal45);

					pushFollow(FOLLOW_bound_pair_in_bound_pair_list957);
					bound_pair46=bound_pair();
					state._fsp--;

					stream_bound_pair.add(bound_pair46.getTree());
					}
					break;

				default :
					break loop11;
				}
			}

			// AST REWRITE
			// elements: bound_pair
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 171:34: -> ( bound_pair )+
			{
				if ( !(stream_bound_pair.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_bound_pair.hasNext() ) {
					adaptor.addChild(root_0, stream_bound_pair.nextTree());
				}
				stream_bound_pair.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bound_pair_list"


	public static class bound_pair_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bound_pair"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:174:1: bound_pair : lower_bound ':' upper_bound -> ^( BOUNDS lower_bound upper_bound ) ;
	public final bound_pair_return bound_pair() throws RecognitionException {
		bound_pair_return retval = new bound_pair_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal48=null;
		ParserRuleReturnScope lower_bound47 =null;
		ParserRuleReturnScope upper_bound49 =null;

		CommonTree char_literal48_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleSubtreeStream stream_lower_bound=new RewriteRuleSubtreeStream(adaptor,"rule lower_bound");
		RewriteRuleSubtreeStream stream_upper_bound=new RewriteRuleSubtreeStream(adaptor,"rule upper_bound");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:175:2: ( lower_bound ':' upper_bound -> ^( BOUNDS lower_bound upper_bound ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:175:5: lower_bound ':' upper_bound
			{
			pushFollow(FOLLOW_lower_bound_in_bound_pair976);
			lower_bound47=lower_bound();
			state._fsp--;

			stream_lower_bound.add(lower_bound47.getTree());
			char_literal48=(Token)match(input,67,FOLLOW_67_in_bound_pair978);  
			stream_67.add(char_literal48);

			pushFollow(FOLLOW_upper_bound_in_bound_pair980);
			upper_bound49=upper_bound();
			state._fsp--;

			stream_upper_bound.add(upper_bound49.getTree());
			// AST REWRITE
			// elements: lower_bound, upper_bound
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 175:33: -> ^( BOUNDS lower_bound upper_bound )
			{
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:175:35: ^( BOUNDS lower_bound upper_bound )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BOUNDS, "BOUNDS"), root_1);
				adaptor.addChild(root_1, stream_lower_bound.nextTree());
				adaptor.addChild(root_1, stream_upper_bound.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bound_pair"


	public static class switch_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "switch_declaration"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:185:1: switch_declaration : 'switch' ! Identifier ':=' ! switch_list ;
	public final switch_declaration_return switch_declaration() throws RecognitionException {
		switch_declaration_return retval = new switch_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal50=null;
		Token Identifier51=null;
		Token string_literal52=null;
		ParserRuleReturnScope switch_list53 =null;

		CommonTree string_literal50_tree=null;
		CommonTree Identifier51_tree=null;
		CommonTree string_literal52_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:186:2: ( 'switch' ! Identifier ':=' ! switch_list )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:186:8: 'switch' ! Identifier ':=' ! switch_list
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal50=(Token)match(input,99,FOLLOW_99_in_switch_declaration1014); 
			Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_switch_declaration1017); 
			Identifier51_tree = (CommonTree)adaptor.create(Identifier51);
			adaptor.addChild(root_0, Identifier51_tree);

			string_literal52=(Token)match(input,68,FOLLOW_68_in_switch_declaration1019); 
			pushFollow(FOLLOW_switch_list_in_switch_declaration1022);
			switch_list53=switch_list();
			state._fsp--;

			adaptor.addChild(root_0, switch_list53.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "switch_declaration"


	public static class switch_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "switch_list"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:192:1: switch_list : designational_expression ( ',' designational_expression )* -> ^( SWITCH_LIST ( designational_expression )+ ) ;
	public final switch_list_return switch_list() throws RecognitionException {
		switch_list_return retval = new switch_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal55=null;
		ParserRuleReturnScope designational_expression54 =null;
		ParserRuleReturnScope designational_expression56 =null;

		CommonTree char_literal55_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_designational_expression=new RewriteRuleSubtreeStream(adaptor,"rule designational_expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:193:2: ( designational_expression ( ',' designational_expression )* -> ^( SWITCH_LIST ( designational_expression )+ ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:193:5: designational_expression ( ',' designational_expression )*
			{
			pushFollow(FOLLOW_designational_expression_in_switch_list1041);
			designational_expression54=designational_expression();
			state._fsp--;

			stream_designational_expression.add(designational_expression54.getTree());
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:193:30: ( ',' designational_expression )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==63) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:193:31: ',' designational_expression
					{
					char_literal55=(Token)match(input,63,FOLLOW_63_in_switch_list1044);  
					stream_63.add(char_literal55);

					pushFollow(FOLLOW_designational_expression_in_switch_list1046);
					designational_expression56=designational_expression();
					state._fsp--;

					stream_designational_expression.add(designational_expression56.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			// AST REWRITE
			// elements: designational_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 193:62: -> ^( SWITCH_LIST ( designational_expression )+ )
			{
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:193:64: ^( SWITCH_LIST ( designational_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SWITCH_LIST, "SWITCH_LIST"), root_1);
				if ( !(stream_designational_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_designational_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_designational_expression.nextTree());
				}
				stream_designational_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "switch_list"


	public static class local_or_own_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "local_or_own_type"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:200:1: local_or_own_type : ( 'own' )? ;
	public final local_or_own_type_return local_or_own_type() throws RecognitionException {
		local_or_own_type_return retval = new local_or_own_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal57=null;

		CommonTree string_literal57_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:201:2: ( ( 'own' )? )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:201:5: ( 'own' )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:201:5: ( 'own' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==94) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:201:6: 'own'
					{
					string_literal57=(Token)match(input,94,FOLLOW_94_in_local_or_own_type1074); 
					string_literal57_tree = (CommonTree)adaptor.create(string_literal57);
					adaptor.addChild(root_0, string_literal57_tree);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "local_or_own_type"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:205:1: type : ( 'real' | 'integer' | 'boolean' );
	public final type_return type() throws RecognitionException {
		type_return retval = new type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set58=null;

		CommonTree set58_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:205:6: ( 'real' | 'integer' | 'boolean' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set58=input.LT(1);
			if ( input.LA(1)==84||input.LA(1)==92||input.LA(1)==96 ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set58));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class upper_bound_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "upper_bound"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:216:1: upper_bound : arithmetic_expression ;
	public final upper_bound_return upper_bound() throws RecognitionException {
		upper_bound_return retval = new upper_bound_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope arithmetic_expression59 =null;


		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:217:2: ( arithmetic_expression )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:217:5: arithmetic_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_in_upper_bound1173);
			arithmetic_expression59=arithmetic_expression();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression59.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "upper_bound"


	public static class lower_bound_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lower_bound"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:220:1: lower_bound : arithmetic_expression ;
	public final lower_bound_return lower_bound() throws RecognitionException {
		lower_bound_return retval = new lower_bound_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope arithmetic_expression60 =null;


		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:221:2: ( arithmetic_expression )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:221:4: arithmetic_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_in_lower_bound1184);
			arithmetic_expression60=arithmetic_expression();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression60.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lower_bound"


	public static class procedure_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procedure_declaration"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:225:1: procedure_declaration : 'procedure' procedure_heading statement -> procedure_heading statement ;
	public final procedure_declaration_return procedure_declaration() throws RecognitionException {
		procedure_declaration_return retval = new procedure_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal61=null;
		ParserRuleReturnScope procedure_heading62 =null;
		ParserRuleReturnScope statement63 =null;

		CommonTree string_literal61_tree=null;
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleSubtreeStream stream_procedure_heading=new RewriteRuleSubtreeStream(adaptor,"rule procedure_heading");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:226:2: ( 'procedure' procedure_heading statement -> procedure_heading statement )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:226:8: 'procedure' procedure_heading statement
			{
			string_literal61=(Token)match(input,95,FOLLOW_95_in_procedure_declaration1200);  
			stream_95.add(string_literal61);

			pushFollow(FOLLOW_procedure_heading_in_procedure_declaration1202);
			procedure_heading62=procedure_heading();
			state._fsp--;

			stream_procedure_heading.add(procedure_heading62.getTree());
			pushFollow(FOLLOW_statement_in_procedure_declaration1204);
			statement63=statement();
			state._fsp--;

			stream_statement.add(statement63.getTree());
			// AST REWRITE
			// elements: statement, procedure_heading
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 226:48: -> procedure_heading statement
			{
				adaptor.addChild(root_0, stream_procedure_heading.nextTree());
				adaptor.addChild(root_0, stream_statement.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedure_declaration"


	public static class procedure_heading_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procedure_heading"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:231:1: procedure_heading : Identifier formal_parameter_part ';' ! value_part specification_part ;
	public final procedure_heading_return procedure_heading() throws RecognitionException {
		procedure_heading_return retval = new procedure_heading_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier64=null;
		Token char_literal66=null;
		ParserRuleReturnScope formal_parameter_part65 =null;
		ParserRuleReturnScope value_part67 =null;
		ParserRuleReturnScope specification_part68 =null;

		CommonTree Identifier64_tree=null;
		CommonTree char_literal66_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:232:2: ( Identifier formal_parameter_part ';' ! value_part specification_part )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:232:5: Identifier formal_parameter_part ';' ! value_part specification_part
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier64=(Token)match(input,Identifier,FOLLOW_Identifier_in_procedure_heading1224); 
			Identifier64_tree = (CommonTree)adaptor.create(Identifier64);
			adaptor.addChild(root_0, Identifier64_tree);

			pushFollow(FOLLOW_formal_parameter_part_in_procedure_heading1226);
			formal_parameter_part65=formal_parameter_part();
			state._fsp--;

			adaptor.addChild(root_0, formal_parameter_part65.getTree());

			char_literal66=(Token)match(input,69,FOLLOW_69_in_procedure_heading1228); 
			pushFollow(FOLLOW_value_part_in_procedure_heading1231);
			value_part67=value_part();
			state._fsp--;

			adaptor.addChild(root_0, value_part67.getTree());

			pushFollow(FOLLOW_specification_part_in_procedure_heading1233);
			specification_part68=specification_part();
			state._fsp--;

			adaptor.addChild(root_0, specification_part68.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedure_heading"


	public static class formal_parameter_part_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formal_parameter_part"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:236:1: formal_parameter_part : (| '(' formal_parameter_list ')' ( Identifier ':' '(' formal_parameter_list ')' )* -> ^( LISTPARAMETER formal_parameter_list ( formal_parameter_list )* ) );
	public final formal_parameter_part_return formal_parameter_part() throws RecognitionException {
		formal_parameter_part_return retval = new formal_parameter_part_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal69=null;
		Token char_literal71=null;
		Token Identifier72=null;
		Token char_literal73=null;
		Token char_literal74=null;
		Token char_literal76=null;
		ParserRuleReturnScope formal_parameter_list70 =null;
		ParserRuleReturnScope formal_parameter_list75 =null;

		CommonTree char_literal69_tree=null;
		CommonTree char_literal71_tree=null;
		CommonTree Identifier72_tree=null;
		CommonTree char_literal73_tree=null;
		CommonTree char_literal74_tree=null;
		CommonTree char_literal76_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleSubtreeStream stream_formal_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule formal_parameter_list");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:237:2: (| '(' formal_parameter_list ')' ( Identifier ':' '(' formal_parameter_list ')' )* -> ^( LISTPARAMETER formal_parameter_list ( formal_parameter_list )* ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==69) ) {
				alt15=1;
			}
			else if ( (LA15_0==58) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:238:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:238:16: '(' formal_parameter_list ')' ( Identifier ':' '(' formal_parameter_list ')' )*
					{
					char_literal69=(Token)match(input,58,FOLLOW_58_in_formal_parameter_part1261);  
					stream_58.add(char_literal69);

					pushFollow(FOLLOW_formal_parameter_list_in_formal_parameter_part1263);
					formal_parameter_list70=formal_parameter_list();
					state._fsp--;

					stream_formal_parameter_list.add(formal_parameter_list70.getTree());
					char_literal71=(Token)match(input,59,FOLLOW_59_in_formal_parameter_part1266);  
					stream_59.add(char_literal71);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:238:47: ( Identifier ':' '(' formal_parameter_list ')' )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==Identifier) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:238:48: Identifier ':' '(' formal_parameter_list ')'
							{
							Identifier72=(Token)match(input,Identifier,FOLLOW_Identifier_in_formal_parameter_part1269);  
							stream_Identifier.add(Identifier72);

							char_literal73=(Token)match(input,67,FOLLOW_67_in_formal_parameter_part1271);  
							stream_67.add(char_literal73);

							char_literal74=(Token)match(input,58,FOLLOW_58_in_formal_parameter_part1273);  
							stream_58.add(char_literal74);

							pushFollow(FOLLOW_formal_parameter_list_in_formal_parameter_part1275);
							formal_parameter_list75=formal_parameter_list();
							state._fsp--;

							stream_formal_parameter_list.add(formal_parameter_list75.getTree());
							char_literal76=(Token)match(input,59,FOLLOW_59_in_formal_parameter_part1277);  
							stream_59.add(char_literal76);

							}
							break;

						default :
							break loop14;
						}
					}

					// AST REWRITE
					// elements: formal_parameter_list, formal_parameter_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 239:2: -> ^( LISTPARAMETER formal_parameter_list ( formal_parameter_list )* )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:239:4: ^( LISTPARAMETER formal_parameter_list ( formal_parameter_list )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTPARAMETER, "LISTPARAMETER"), root_1);
						adaptor.addChild(root_1, stream_formal_parameter_list.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:239:43: ( formal_parameter_list )*
						while ( stream_formal_parameter_list.hasNext() ) {
							adaptor.addChild(root_1, stream_formal_parameter_list.nextTree());
						}
						stream_formal_parameter_list.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formal_parameter_part"


	public static class formal_parameter_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formal_parameter_list"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:244:1: formal_parameter_list : Identifier ( ',' Identifier )* -> ( Identifier )+ ;
	public final formal_parameter_list_return formal_parameter_list() throws RecognitionException {
		formal_parameter_list_return retval = new formal_parameter_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier77=null;
		Token char_literal78=null;
		Token Identifier79=null;

		CommonTree Identifier77_tree=null;
		CommonTree char_literal78_tree=null;
		CommonTree Identifier79_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:245:2: ( Identifier ( ',' Identifier )* -> ( Identifier )+ )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:245:4: Identifier ( ',' Identifier )*
			{
			Identifier77=(Token)match(input,Identifier,FOLLOW_Identifier_in_formal_parameter_list1308);  
			stream_Identifier.add(Identifier77);

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:245:15: ( ',' Identifier )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==63) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:245:16: ',' Identifier
					{
					char_literal78=(Token)match(input,63,FOLLOW_63_in_formal_parameter_list1311);  
					stream_63.add(char_literal78);

					Identifier79=(Token)match(input,Identifier,FOLLOW_Identifier_in_formal_parameter_list1313);  
					stream_Identifier.add(Identifier79);

					}
					break;

				default :
					break loop16;
				}
			}

			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 245:33: -> ( Identifier )+
			{
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_0, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formal_parameter_list"


	public static class value_part_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value_part"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:250:1: value_part : ( 'value' Identifier ( ',' Identifier )* ';' -> ^( VALUE ( Identifier )+ ) |);
	public final value_part_return value_part() throws RecognitionException {
		value_part_return retval = new value_part_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal80=null;
		Token Identifier81=null;
		Token char_literal82=null;
		Token Identifier83=null;
		Token char_literal84=null;

		CommonTree string_literal80_tree=null;
		CommonTree Identifier81_tree=null;
		CommonTree char_literal82_tree=null;
		CommonTree Identifier83_tree=null;
		CommonTree char_literal84_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:251:2: ( 'value' Identifier ( ',' Identifier )* ';' -> ^( VALUE ( Identifier )+ ) |)
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==103) ) {
				alt18=1;
			}
			else if ( (LA18_0==Identifier||LA18_0==Number||LA18_0==69||(LA18_0 >= 82 && LA18_0 <= 84)||(LA18_0 >= 86 && LA18_0 <= 87)||(LA18_0 >= 89 && LA18_0 <= 93)||(LA18_0 >= 95 && LA18_0 <= 96)||(LA18_0 >= 98 && LA18_0 <= 99)) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:251:5: 'value' Identifier ( ',' Identifier )* ';'
					{
					string_literal80=(Token)match(input,103,FOLLOW_103_in_value_part1334);  
					stream_103.add(string_literal80);

					Identifier81=(Token)match(input,Identifier,FOLLOW_Identifier_in_value_part1336);  
					stream_Identifier.add(Identifier81);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:251:24: ( ',' Identifier )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==63) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:251:25: ',' Identifier
							{
							char_literal82=(Token)match(input,63,FOLLOW_63_in_value_part1339);  
							stream_63.add(char_literal82);

							Identifier83=(Token)match(input,Identifier,FOLLOW_Identifier_in_value_part1341);  
							stream_Identifier.add(Identifier83);

							}
							break;

						default :
							break loop17;
						}
					}

					char_literal84=(Token)match(input,69,FOLLOW_69_in_value_part1345);  
					stream_69.add(char_literal84);

					// AST REWRITE
					// elements: Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 251:46: -> ^( VALUE ( Identifier )+ )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:251:48: ^( VALUE ( Identifier )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_1);
						if ( !(stream_Identifier.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_Identifier.hasNext() ) {
							adaptor.addChild(root_1, stream_Identifier.nextNode());
						}
						stream_Identifier.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:253:13: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value_part"


	public static class specification_part_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "specification_part"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:256:1: specification_part : ( specification_part1 )* -> ( specification_part1 )* ;
	public final specification_part_return specification_part() throws RecognitionException {
		specification_part_return retval = new specification_part_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope specification_part185 =null;

		RewriteRuleSubtreeStream stream_specification_part1=new RewriteRuleSubtreeStream(adaptor,"rule specification_part1");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:257:2: ( ( specification_part1 )* -> ( specification_part1 )* )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:257:4: ( specification_part1 )*
			{
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:257:4: ( specification_part1 )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==82||LA19_0==84||(LA19_0 >= 92 && LA19_0 <= 93)||(LA19_0 >= 95 && LA19_0 <= 96)||(LA19_0 >= 98 && LA19_0 <= 99)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:257:4: specification_part1
					{
					pushFollow(FOLLOW_specification_part1_in_specification_part1379);
					specification_part185=specification_part1();
					state._fsp--;

					stream_specification_part1.add(specification_part185.getTree());
					}
					break;

				default :
					break loop19;
				}
			}

			// AST REWRITE
			// elements: specification_part1
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 257:25: -> ( specification_part1 )*
			{
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:257:28: ( specification_part1 )*
				while ( stream_specification_part1.hasNext() ) {
					adaptor.addChild(root_0, stream_specification_part1.nextTree());
				}
				stream_specification_part1.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "specification_part"


	public static class specification_part1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "specification_part1"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:261:1: specification_part1 : specifier ( Identifier ( ',' Identifier )* ) ';' -> ^( SPECIFICATION specifier ^( SPECIFIED_ID ( Identifier )+ ) ) ;
	public final specification_part1_return specification_part1() throws RecognitionException {
		specification_part1_return retval = new specification_part1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier87=null;
		Token char_literal88=null;
		Token Identifier89=null;
		Token char_literal90=null;
		ParserRuleReturnScope specifier86 =null;

		CommonTree Identifier87_tree=null;
		CommonTree char_literal88_tree=null;
		CommonTree Identifier89_tree=null;
		CommonTree char_literal90_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_specifier=new RewriteRuleSubtreeStream(adaptor,"rule specifier");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:262:13: ( specifier ( Identifier ( ',' Identifier )* ) ';' -> ^( SPECIFICATION specifier ^( SPECIFIED_ID ( Identifier )+ ) ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:262:15: specifier ( Identifier ( ',' Identifier )* ) ';'
			{
			pushFollow(FOLLOW_specifier_in_specification_part11423);
			specifier86=specifier();
			state._fsp--;

			stream_specifier.add(specifier86.getTree());
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:262:25: ( Identifier ( ',' Identifier )* )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:262:26: Identifier ( ',' Identifier )*
			{
			Identifier87=(Token)match(input,Identifier,FOLLOW_Identifier_in_specification_part11426);  
			stream_Identifier.add(Identifier87);

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:262:37: ( ',' Identifier )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==63) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:262:38: ',' Identifier
					{
					char_literal88=(Token)match(input,63,FOLLOW_63_in_specification_part11429);  
					stream_63.add(char_literal88);

					Identifier89=(Token)match(input,Identifier,FOLLOW_Identifier_in_specification_part11431);  
					stream_Identifier.add(Identifier89);

					}
					break;

				default :
					break loop20;
				}
			}

			}

			char_literal90=(Token)match(input,69,FOLLOW_69_in_specification_part11436);  
			stream_69.add(char_literal90);

			// AST REWRITE
			// elements: specifier, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 262:61: -> ^( SPECIFICATION specifier ^( SPECIFIED_ID ( Identifier )+ ) )
			{
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:262:64: ^( SPECIFICATION specifier ^( SPECIFIED_ID ( Identifier )+ ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPECIFICATION, "SPECIFICATION"), root_1);
				adaptor.addChild(root_1, stream_specifier.nextTree());
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:262:90: ^( SPECIFIED_ID ( Identifier )+ )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPECIFIED_ID, "SPECIFIED_ID"), root_2);
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_2, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "specification_part1"


	public static class identifier_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier_list"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:266:1: identifier_list : Identifier ( ',' Identifier )* ;
	public final identifier_list_return identifier_list() throws RecognitionException {
		identifier_list_return retval = new identifier_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier91=null;
		Token char_literal92=null;
		Token Identifier93=null;

		CommonTree Identifier91_tree=null;
		CommonTree char_literal92_tree=null;
		CommonTree Identifier93_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:267:2: ( Identifier ( ',' Identifier )* )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:267:4: Identifier ( ',' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier91=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifier_list1476); 
			Identifier91_tree = (CommonTree)adaptor.create(Identifier91);
			adaptor.addChild(root_0, Identifier91_tree);

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:267:15: ( ',' Identifier )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==63) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:267:16: ',' Identifier
					{
					char_literal92=(Token)match(input,63,FOLLOW_63_in_identifier_list1479); 
					char_literal92_tree = (CommonTree)adaptor.create(char_literal92);
					adaptor.addChild(root_0, char_literal92_tree);

					Identifier93=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifier_list1481); 
					Identifier93_tree = (CommonTree)adaptor.create(Identifier93);
					adaptor.addChild(root_0, Identifier93_tree);

					}
					break;

				default :
					break loop21;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier_list"


	public static class specifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "specifier"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:270:1: specifier : ( 'string' | type type_1 | 'array' | 'label' | 'switch' | 'procedure' );
	public final specifier_return specifier() throws RecognitionException {
		specifier_return retval = new specifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal94=null;
		Token string_literal97=null;
		Token string_literal98=null;
		Token string_literal99=null;
		Token string_literal100=null;
		ParserRuleReturnScope type95 =null;
		ParserRuleReturnScope type_196 =null;

		CommonTree string_literal94_tree=null;
		CommonTree string_literal97_tree=null;
		CommonTree string_literal98_tree=null;
		CommonTree string_literal99_tree=null;
		CommonTree string_literal100_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:271:2: ( 'string' | type type_1 | 'array' | 'label' | 'switch' | 'procedure' )
			int alt22=6;
			switch ( input.LA(1) ) {
			case 98:
				{
				alt22=1;
				}
				break;
			case 84:
			case 92:
			case 96:
				{
				alt22=2;
				}
				break;
			case 82:
				{
				alt22=3;
				}
				break;
			case 93:
				{
				alt22=4;
				}
				break;
			case 99:
				{
				alt22=5;
				}
				break;
			case 95:
				{
				alt22=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:271:4: 'string'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal94=(Token)match(input,98,FOLLOW_98_in_specifier1494); 
					string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
					adaptor.addChild(root_0, string_literal94_tree);

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:272:15: type type_1
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_type_in_specifier1510);
					type95=type();
					state._fsp--;

					adaptor.addChild(root_0, type95.getTree());

					pushFollow(FOLLOW_type_1_in_specifier1512);
					type_196=type_1();
					state._fsp--;

					adaptor.addChild(root_0, type_196.getTree());

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:273:26: 'array'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal97=(Token)match(input,82,FOLLOW_82_in_specifier1539); 
					string_literal97_tree = (CommonTree)adaptor.create(string_literal97);
					adaptor.addChild(root_0, string_literal97_tree);

					}
					break;
				case 4 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:274:26: 'label'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal98=(Token)match(input,93,FOLLOW_93_in_specifier1566); 
					string_literal98_tree = (CommonTree)adaptor.create(string_literal98);
					adaptor.addChild(root_0, string_literal98_tree);

					}
					break;
				case 5 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:275:26: 'switch'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal99=(Token)match(input,99,FOLLOW_99_in_specifier1593); 
					string_literal99_tree = (CommonTree)adaptor.create(string_literal99);
					adaptor.addChild(root_0, string_literal99_tree);

					}
					break;
				case 6 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:276:26: 'procedure'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal100=(Token)match(input,95,FOLLOW_95_in_specifier1620); 
					string_literal100_tree = (CommonTree)adaptor.create(string_literal100);
					adaptor.addChild(root_0, string_literal100_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "specifier"


	public static class type_1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_1"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:278:1: type_1 : (| 'array' | 'procedure' );
	public final type_1_return type_1() throws RecognitionException {
		type_1_return retval = new type_1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal101=null;
		Token string_literal102=null;

		CommonTree string_literal101_tree=null;
		CommonTree string_literal102_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:278:8: (| 'array' | 'procedure' )
			int alt23=3;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt23=1;
				}
				break;
			case 82:
				{
				alt23=2;
				}
				break;
			case 95:
				{
				alt23=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:279:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:279:4: 'array'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal101=(Token)match(input,82,FOLLOW_82_in_type_11643); 
					string_literal101_tree = (CommonTree)adaptor.create(string_literal101);
					adaptor.addChild(root_0, string_literal101_tree);

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:280:4: 'procedure'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal102=(Token)match(input,95,FOLLOW_95_in_type_11648); 
					string_literal102_tree = (CommonTree)adaptor.create(string_literal102);
					adaptor.addChild(root_0, string_literal102_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_1"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:286:1: statement : ( statement_memory -> statement_memory | go_to_statement -> go_to_statement | -> EMPTY_STATEMENT | 'if' expression 'then' conditional_statement ( options {greedy=true; } : 'else' statement )? -> ^( IF expression ^( THEN conditional_statement ) ( ^( ELSE statement ) )? ) | 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' s1= statement2 -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO $s1) ) | 'begin' ( declaration ';' )* compound_tail -> ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? ) );
	public final statement_return statement() throws RecognitionException {
		statement_return retval = new statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal105=null;
		Token string_literal107=null;
		Token string_literal109=null;
		Token string_literal111=null;
		Token Identifier112=null;
		Token string_literal114=null;
		Token string_literal116=null;
		Token string_literal117=null;
		Token char_literal119=null;
		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope statement_memory103 =null;
		ParserRuleReturnScope go_to_statement104 =null;
		ParserRuleReturnScope expression106 =null;
		ParserRuleReturnScope conditional_statement108 =null;
		ParserRuleReturnScope statement110 =null;
		ParserRuleReturnScope iterator113 =null;
		ParserRuleReturnScope for_list115 =null;
		ParserRuleReturnScope declaration118 =null;
		ParserRuleReturnScope compound_tail120 =null;

		CommonTree string_literal105_tree=null;
		CommonTree string_literal107_tree=null;
		CommonTree string_literal109_tree=null;
		CommonTree string_literal111_tree=null;
		CommonTree Identifier112_tree=null;
		CommonTree string_literal114_tree=null;
		CommonTree string_literal116_tree=null;
		CommonTree string_literal117_tree=null;
		CommonTree char_literal119_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_go_to_statement=new RewriteRuleSubtreeStream(adaptor,"rule go_to_statement");
		RewriteRuleSubtreeStream stream_iterator=new RewriteRuleSubtreeStream(adaptor,"rule iterator");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_conditional_statement=new RewriteRuleSubtreeStream(adaptor,"rule conditional_statement");
		RewriteRuleSubtreeStream stream_for_list=new RewriteRuleSubtreeStream(adaptor,"rule for_list");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_compound_tail=new RewriteRuleSubtreeStream(adaptor,"rule compound_tail");
		RewriteRuleSubtreeStream stream_statement_memory=new RewriteRuleSubtreeStream(adaptor,"rule statement_memory");
		RewriteRuleSubtreeStream stream_statement2=new RewriteRuleSubtreeStream(adaptor,"rule statement2");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:287:2: ( statement_memory -> statement_memory | go_to_statement -> go_to_statement | -> EMPTY_STATEMENT | 'if' expression 'then' conditional_statement ( options {greedy=true; } : 'else' statement )? -> ^( IF expression ^( THEN conditional_statement ) ( ^( ELSE statement ) )? ) | 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' s1= statement2 -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO $s1) ) | 'begin' ( declaration ';' )* compound_tail -> ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? ) )
			int alt26=6;
			switch ( input.LA(1) ) {
			case Identifier:
			case Number:
				{
				alt26=1;
				}
				break;
			case 90:
				{
				alt26=2;
				}
				break;
			case 69:
			case 86:
			case 87:
				{
				alt26=3;
				}
				break;
			case 91:
				{
				alt26=4;
				}
				break;
			case 89:
				{
				alt26=5;
				}
				break;
			case 83:
				{
				alt26=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:287:4: statement_memory
					{
					pushFollow(FOLLOW_statement_memory_in_statement1706);
					statement_memory103=statement_memory();
					state._fsp--;

					stream_statement_memory.add(statement_memory103.getTree());
					// AST REWRITE
					// elements: statement_memory
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 287:20: -> statement_memory
					{
						adaptor.addChild(root_0, stream_statement_memory.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:288:15: go_to_statement
					{
					pushFollow(FOLLOW_go_to_statement_in_statement1724);
					go_to_statement104=go_to_statement();
					state._fsp--;

					stream_go_to_statement.add(go_to_statement104.getTree());
					// AST REWRITE
					// elements: go_to_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 288:31: -> go_to_statement
					{
						adaptor.addChild(root_0, stream_go_to_statement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:289:15: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 289:15: -> EMPTY_STATEMENT
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(EMPTY_STATEMENT, "EMPTY_STATEMENT"));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:290:16: 'if' expression 'then' conditional_statement ( options {greedy=true; } : 'else' statement )?
					{
					string_literal105=(Token)match(input,91,FOLLOW_91_in_statement1764);  
					stream_91.add(string_literal105);

					pushFollow(FOLLOW_expression_in_statement1766);
					expression106=expression();
					state._fsp--;

					stream_expression.add(expression106.getTree());
					string_literal107=(Token)match(input,100,FOLLOW_100_in_statement1768);  
					stream_100.add(string_literal107);

					pushFollow(FOLLOW_conditional_statement_in_statement1770);
					conditional_statement108=conditional_statement();
					state._fsp--;

					stream_conditional_statement.add(conditional_statement108.getTree());
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:290:61: ( options {greedy=true; } : 'else' statement )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==86) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:290:88: 'else' statement
							{
							string_literal109=(Token)match(input,86,FOLLOW_86_in_statement1783);  
							stream_86.add(string_literal109);

							pushFollow(FOLLOW_statement_in_statement1785);
							statement110=statement();
							state._fsp--;

							stream_statement.add(statement110.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: statement, expression, conditional_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 290:107: -> ^( IF expression ^( THEN conditional_statement ) ( ^( ELSE statement ) )? )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:290:109: ^( IF expression ^( THEN conditional_statement ) ( ^( ELSE statement ) )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:290:125: ^( THEN conditional_statement )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_2);
						adaptor.addChild(root_2, stream_conditional_statement.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:290:155: ( ^( ELSE statement ) )?
						if ( stream_statement.hasNext() ) {
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:290:155: ^( ELSE statement )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);
							adaptor.addChild(root_2, stream_statement.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_statement.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:291:16: 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' s1= statement2
					{
					string_literal111=(Token)match(input,89,FOLLOW_89_in_statement1824);  
					stream_89.add(string_literal111);

					Identifier112=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement1826);  
					stream_Identifier.add(Identifier112);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:291:32: ( -> Identifier )
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:291:33: 
					{
					// AST REWRITE
					// elements: Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 291:33: -> Identifier
					{
						adaptor.addChild(root_0, stream_Identifier.nextNode());
					}


					retval.tree = root_0;

					}

					Identifiermemory2=retval.tree;
					pushFollow(FOLLOW_iterator_in_statement1835);
					iterator113=iterator();
					state._fsp--;

					stream_iterator.add(iterator113.getTree());
					string_literal114=(Token)match(input,68,FOLLOW_68_in_statement1837);  
					stream_68.add(string_literal114);

					pushFollow(FOLLOW_for_list_in_statement1839);
					for_list115=for_list();
					state._fsp--;

					stream_for_list.add(for_list115.getTree());
					string_literal116=(Token)match(input,85,FOLLOW_85_in_statement1841);  
					stream_85.add(string_literal116);

					pushFollow(FOLLOW_statement2_in_statement1845);
					s1=statement2();
					state._fsp--;

					stream_statement2.add(s1.getTree());
					// AST REWRITE
					// elements: for_list, iterator, s1
					// token labels: 
					// rule labels: s1, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 291:127: -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO $s1) )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:291:129: ^( FOR iterator ^( FOR_LIST for_list ) ^( DO $s1) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);
						adaptor.addChild(root_1, stream_iterator.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:291:145: ^( FOR_LIST for_list )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_LIST, "FOR_LIST"), root_2);
						adaptor.addChild(root_2, stream_for_list.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:291:166: ^( DO $s1)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO, "DO"), root_2);
						adaptor.addChild(root_2, stream_s1.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:292:16: 'begin' ( declaration ';' )* compound_tail
					{
					string_literal117=(Token)match(input,83,FOLLOW_83_in_statement1884);  
					stream_83.add(string_literal117);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:292:24: ( declaration ';' )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==82||LA25_0==84||LA25_0==92||(LA25_0 >= 94 && LA25_0 <= 96)||LA25_0==99) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:292:26: declaration ';'
							{
							pushFollow(FOLLOW_declaration_in_statement1888);
							declaration118=declaration();
							state._fsp--;

							stream_declaration.add(declaration118.getTree());
							char_literal119=(Token)match(input,69,FOLLOW_69_in_statement1890);  
							stream_69.add(char_literal119);

							}
							break;

						default :
							break loop25;
						}
					}

					pushFollow(FOLLOW_compound_tail_in_statement1894);
					compound_tail120=compound_tail();
					state._fsp--;

					stream_compound_tail.add(compound_tail120.getTree());
					// AST REWRITE
					// elements: compound_tail, declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 292:58: -> ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:292:60: ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BEGIN, "BEGIN"), root_1);
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:292:68: ( ^( DECLARATIONS ( declaration )* ) )?
						if ( stream_declaration.hasNext() ) {
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:292:68: ^( DECLARATIONS ( declaration )* )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_2);
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:292:83: ( declaration )*
							while ( stream_declaration.hasNext() ) {
								adaptor.addChild(root_2, stream_declaration.nextTree());
							}
							stream_declaration.reset();

							adaptor.addChild(root_1, root_2);
							}

						}
						stream_declaration.reset();

						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:292:98: ( ^( BLOCK compound_tail ) )?
						if ( stream_compound_tail.hasNext() ) {
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:292:98: ^( BLOCK compound_tail )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);
							adaptor.addChild(root_2, stream_compound_tail.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_compound_tail.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class statement2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement2"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:295:1: statement2 : statement -> statement ;
	public final statement2_return statement2() throws RecognitionException {
		statement2_return retval = new statement2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope statement121 =null;

		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:295:13: ( statement -> statement )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:295:15: statement
			{
			pushFollow(FOLLOW_statement_in_statement21926);
			statement121=statement();
			state._fsp--;

			stream_statement.add(statement121.getTree());
			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 295:24: -> statement
			{
				adaptor.addChild(root_0, stream_statement.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement2"


	public static class statement_memory_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement_memory"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:301:1: statement_memory : ( Identifier ( -> Identifier ) statement_with_identifier -> statement_with_identifier | Number ( -> Number ) statement_with_identifier -> statement_with_identifier );
	public final statement_memory_return statement_memory() throws RecognitionException {
		statement_memory_return retval = new statement_memory_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier122=null;
		Token Number124=null;
		ParserRuleReturnScope statement_with_identifier123 =null;
		ParserRuleReturnScope statement_with_identifier125 =null;

		CommonTree Identifier122_tree=null;
		CommonTree Number124_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleSubtreeStream stream_statement_with_identifier=new RewriteRuleSubtreeStream(adaptor,"rule statement_with_identifier");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:301:18: ( Identifier ( -> Identifier ) statement_with_identifier -> statement_with_identifier | Number ( -> Number ) statement_with_identifier -> statement_with_identifier )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==Identifier) ) {
				alt27=1;
			}
			else if ( (LA27_0==Number) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:301:22: Identifier ( -> Identifier ) statement_with_identifier
					{
					Identifier122=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement_memory1950);  
					stream_Identifier.add(Identifier122);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:301:33: ( -> Identifier )
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:301:34: 
					{
					// AST REWRITE
					// elements: Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 301:34: -> Identifier
					{
						adaptor.addChild(root_0, stream_Identifier.nextNode());
					}


					retval.tree = root_0;

					}

					Identifiermemory=retval.tree;
					pushFollow(FOLLOW_statement_with_identifier_in_statement_memory1958);
					statement_with_identifier123=statement_with_identifier();
					state._fsp--;

					stream_statement_with_identifier.add(statement_with_identifier123.getTree());
					// AST REWRITE
					// elements: statement_with_identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 301:115: -> statement_with_identifier
					{
						adaptor.addChild(root_0, stream_statement_with_identifier.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:302:6: Number ( -> Number ) statement_with_identifier
					{
					Number124=(Token)match(input,Number,FOLLOW_Number_in_statement_memory1967);  
					stream_Number.add(Number124);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:302:13: ( -> Number )
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:302:14: 
					{
					// AST REWRITE
					// elements: Number
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 302:14: -> Number
					{
						adaptor.addChild(root_0, stream_Number.nextNode());
					}


					retval.tree = root_0;

					}

					Identifiermemory=retval.tree;
					pushFollow(FOLLOW_statement_with_identifier_in_statement_memory1975);
					statement_with_identifier125=statement_with_identifier();
					state._fsp--;

					stream_statement_with_identifier.add(statement_with_identifier125.getTree());
					// AST REWRITE
					// elements: statement_with_identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 302:91: -> statement_with_identifier
					{
						adaptor.addChild(root_0, stream_statement_with_identifier.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement_memory"


	public static class statement_with_identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement_with_identifier"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:306:1: statement_with_identifier : ( ( ->) actual_parameter_part -> actual_parameter_part | ( ->) '[' arithmetic_expression ( ',' arithmetic_expression )* ']' ( ':=' expression )+ -> ^( ASSIGNMENT ^( ARRAY_ACCESS $statement_with_identifier ^( INDEX ( arithmetic_expression )+ ) ) ( expression )+ ) | ( ->) ( ':=' expression )+ -> ^( ASSIGNMENT $statement_with_identifier ( expression )+ ) | ( ->) ':' statement_with_label -> statement_with_label );
	public final statement_with_identifier_return statement_with_identifier() throws RecognitionException {
		statement_with_identifier_return retval = new statement_with_identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal127=null;
		Token char_literal129=null;
		Token char_literal131=null;
		Token string_literal132=null;
		Token string_literal134=null;
		Token char_literal136=null;
		ParserRuleReturnScope actual_parameter_part126 =null;
		ParserRuleReturnScope arithmetic_expression128 =null;
		ParserRuleReturnScope arithmetic_expression130 =null;
		ParserRuleReturnScope expression133 =null;
		ParserRuleReturnScope expression135 =null;
		ParserRuleReturnScope statement_with_label137 =null;

		CommonTree char_literal127_tree=null;
		CommonTree char_literal129_tree=null;
		CommonTree char_literal131_tree=null;
		CommonTree string_literal132_tree=null;
		CommonTree string_literal134_tree=null;
		CommonTree char_literal136_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_actual_parameter_part=new RewriteRuleSubtreeStream(adaptor,"rule actual_parameter_part");
		RewriteRuleSubtreeStream stream_statement_with_label=new RewriteRuleSubtreeStream(adaptor,"rule statement_with_label");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_arithmetic_expression=new RewriteRuleSubtreeStream(adaptor,"rule arithmetic_expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:307:2: ( ( ->) actual_parameter_part -> actual_parameter_part | ( ->) '[' arithmetic_expression ( ',' arithmetic_expression )* ']' ( ':=' expression )+ -> ^( ASSIGNMENT ^( ARRAY_ACCESS $statement_with_identifier ^( INDEX ( arithmetic_expression )+ ) ) ( expression )+ ) | ( ->) ( ':=' expression )+ -> ^( ASSIGNMENT $statement_with_identifier ( expression )+ ) | ( ->) ':' statement_with_label -> statement_with_label )
			int alt31=4;
			switch ( input.LA(1) ) {
			case 58:
			case 69:
			case 86:
			case 87:
				{
				alt31=1;
				}
				break;
			case 80:
				{
				alt31=2;
				}
				break;
			case 68:
				{
				alt31=3;
				}
				break;
			case 67:
				{
				alt31=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:307:7: ( ->) actual_parameter_part
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:307:7: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:307:8: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 307:8: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_actual_parameter_part_in_statement_with_identifier2010);
					actual_parameter_part126=actual_parameter_part();
					state._fsp--;

					stream_actual_parameter_part.add(actual_parameter_part126.getTree());
					// AST REWRITE
					// elements: actual_parameter_part
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 307:52: -> actual_parameter_part
					{
						adaptor.addChild(root_0, stream_actual_parameter_part.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:308:7: ( ->) '[' arithmetic_expression ( ',' arithmetic_expression )* ']' ( ':=' expression )+
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:308:7: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:308:8: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 308:8: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					char_literal127=(Token)match(input,80,FOLLOW_80_in_statement_with_identifier2029);  
					stream_80.add(char_literal127);

					pushFollow(FOLLOW_arithmetic_expression_in_statement_with_identifier2031);
					arithmetic_expression128=arithmetic_expression();
					state._fsp--;

					stream_arithmetic_expression.add(arithmetic_expression128.getTree());
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:308:58: ( ',' arithmetic_expression )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==63) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:308:59: ',' arithmetic_expression
							{
							char_literal129=(Token)match(input,63,FOLLOW_63_in_statement_with_identifier2034);  
							stream_63.add(char_literal129);

							pushFollow(FOLLOW_arithmetic_expression_in_statement_with_identifier2036);
							arithmetic_expression130=arithmetic_expression();
							state._fsp--;

							stream_arithmetic_expression.add(arithmetic_expression130.getTree());
							}
							break;

						default :
							break loop28;
						}
					}

					char_literal131=(Token)match(input,81,FOLLOW_81_in_statement_with_identifier2040);  
					stream_81.add(char_literal131);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:308:91: ( ':=' expression )+
					int cnt29=0;
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==68) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:308:92: ':=' expression
							{
							string_literal132=(Token)match(input,68,FOLLOW_68_in_statement_with_identifier2043);  
							stream_68.add(string_literal132);

							pushFollow(FOLLOW_expression_in_statement_with_identifier2046);
							expression133=expression();
							state._fsp--;

							stream_expression.add(expression133.getTree());
							}
							break;

						default :
							if ( cnt29 >= 1 ) break loop29;
							EarlyExitException eee = new EarlyExitException(29, input);
							throw eee;
						}
						cnt29++;
					}

					// AST REWRITE
					// elements: arithmetic_expression, expression, statement_with_identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 308:111: -> ^( ASSIGNMENT ^( ARRAY_ACCESS $statement_with_identifier ^( INDEX ( arithmetic_expression )+ ) ) ( expression )+ )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:308:113: ^( ASSIGNMENT ^( ARRAY_ACCESS $statement_with_identifier ^( INDEX ( arithmetic_expression )+ ) ) ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:308:126: ^( ARRAY_ACCESS $statement_with_identifier ^( INDEX ( arithmetic_expression )+ ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_ACCESS, "ARRAY_ACCESS"), root_2);
						adaptor.addChild(root_2, stream_retval.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:308:168: ^( INDEX ( arithmetic_expression )+ )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX, "INDEX"), root_3);
						if ( !(stream_arithmetic_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_arithmetic_expression.hasNext() ) {
							adaptor.addChild(root_3, stream_arithmetic_expression.nextTree());
						}
						stream_arithmetic_expression.reset();

						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:309:7: ( ->) ( ':=' expression )+
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:309:7: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:309:8: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 309:8: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:309:30: ( ':=' expression )+
					int cnt30=0;
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==68) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:309:31: ':=' expression
							{
							string_literal134=(Token)match(input,68,FOLLOW_68_in_statement_with_identifier2084);  
							stream_68.add(string_literal134);

							pushFollow(FOLLOW_expression_in_statement_with_identifier2086);
							expression135=expression();
							state._fsp--;

							stream_expression.add(expression135.getTree());
							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
							EarlyExitException eee = new EarlyExitException(30, input);
							throw eee;
						}
						cnt30++;
					}

					// AST REWRITE
					// elements: expression, statement_with_identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 309:49: -> ^( ASSIGNMENT $statement_with_identifier ( expression )+ )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:309:51: ^( ASSIGNMENT $statement_with_identifier ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:310:13: ( ->) ':' statement_with_label
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:310:13: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:310:14: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 310:14: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					char_literal136=(Token)match(input,67,FOLLOW_67_in_statement_with_identifier2118);  
					stream_67.add(char_literal136);

					pushFollow(FOLLOW_statement_with_label_in_statement_with_identifier2120);
					statement_with_label137=statement_with_label();
					state._fsp--;

					stream_statement_with_label.add(statement_with_label137.getTree());
					// AST REWRITE
					// elements: statement_with_label
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 310:61: -> statement_with_label
					{
						adaptor.addChild(root_0, stream_statement_with_label.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement_with_identifier"


	public static class statement_with_label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement_with_label"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:314:1: statement_with_label : ( ( ->) label_labeled_statements -> ^( LABELLED_STATEMENT $statement_with_label label_labeled_statements ) | ( ->) go_to_statement -> ^( LABELLED_STATEMENT $statement_with_label go_to_statement ) | ( ->) 'if' expression 'then' conditional_statement ( options {greedy=true; } : 'else' statement )? -> ^( LABELLED_STATEMENT $statement_with_label ^( IF expression ^( THEN conditional_statement ) ^( ELSE statement ) ) ) | ( ->) for_statement -> ^( LABELLED_STATEMENT $statement_with_label for_statement ) | ( ->) begin -> ^( LABELLED_STATEMENT $statement_with_label begin ) | ( ->) actual_parameter_part1 -> actual_parameter_part1 | ( ->) -> ^( LABELLED_EMPTY_STATEMENT $statement_with_label) );
	public final statement_with_label_return statement_with_label() throws RecognitionException {
		statement_with_label_return retval = new statement_with_label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal140=null;
		Token string_literal142=null;
		Token string_literal144=null;
		ParserRuleReturnScope label_labeled_statements138 =null;
		ParserRuleReturnScope go_to_statement139 =null;
		ParserRuleReturnScope expression141 =null;
		ParserRuleReturnScope conditional_statement143 =null;
		ParserRuleReturnScope statement145 =null;
		ParserRuleReturnScope for_statement146 =null;
		ParserRuleReturnScope begin147 =null;
		ParserRuleReturnScope actual_parameter_part1148 =null;

		CommonTree string_literal140_tree=null;
		CommonTree string_literal142_tree=null;
		CommonTree string_literal144_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_go_to_statement=new RewriteRuleSubtreeStream(adaptor,"rule go_to_statement");
		RewriteRuleSubtreeStream stream_actual_parameter_part1=new RewriteRuleSubtreeStream(adaptor,"rule actual_parameter_part1");
		RewriteRuleSubtreeStream stream_for_statement=new RewriteRuleSubtreeStream(adaptor,"rule for_statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_conditional_statement=new RewriteRuleSubtreeStream(adaptor,"rule conditional_statement");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_label_labeled_statements=new RewriteRuleSubtreeStream(adaptor,"rule label_labeled_statements");
		RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:315:2: ( ( ->) label_labeled_statements -> ^( LABELLED_STATEMENT $statement_with_label label_labeled_statements ) | ( ->) go_to_statement -> ^( LABELLED_STATEMENT $statement_with_label go_to_statement ) | ( ->) 'if' expression 'then' conditional_statement ( options {greedy=true; } : 'else' statement )? -> ^( LABELLED_STATEMENT $statement_with_label ^( IF expression ^( THEN conditional_statement ) ^( ELSE statement ) ) ) | ( ->) for_statement -> ^( LABELLED_STATEMENT $statement_with_label for_statement ) | ( ->) begin -> ^( LABELLED_STATEMENT $statement_with_label begin ) | ( ->) actual_parameter_part1 -> actual_parameter_part1 | ( ->) -> ^( LABELLED_EMPTY_STATEMENT $statement_with_label) )
			int alt33=7;
			switch ( input.LA(1) ) {
			case Identifier:
			case Number:
				{
				alt33=1;
				}
				break;
			case 90:
				{
				alt33=2;
				}
				break;
			case 91:
				{
				alt33=3;
				}
				break;
			case 89:
				{
				alt33=4;
				}
				break;
			case 83:
				{
				alt33=5;
				}
				break;
			case 58:
				{
				alt33=6;
				}
				break;
			case 69:
			case 86:
			case 87:
				{
				alt33=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:315:5: ( ->) label_labeled_statements
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:315:5: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:315:6: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 315:6: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_label_labeled_statements_in_statement_with_label2144);
					label_labeled_statements138=label_labeled_statements();
					state._fsp--;

					stream_label_labeled_statements.add(label_labeled_statements138.getTree());
					// AST REWRITE
					// elements: label_labeled_statements, statement_with_label
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 315:53: -> ^( LABELLED_STATEMENT $statement_with_label label_labeled_statements )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:315:55: ^( LABELLED_STATEMENT $statement_with_label label_labeled_statements )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABELLED_STATEMENT, "LABELLED_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_label_labeled_statements.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:316:16: ( ->) go_to_statement
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:316:16: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:316:17: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 316:17: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_go_to_statement_in_statement_with_label2176);
					go_to_statement139=go_to_statement();
					state._fsp--;

					stream_go_to_statement.add(go_to_statement139.getTree());
					// AST REWRITE
					// elements: go_to_statement, statement_with_label
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 316:55: -> ^( LABELLED_STATEMENT $statement_with_label go_to_statement )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:316:57: ^( LABELLED_STATEMENT $statement_with_label go_to_statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABELLED_STATEMENT, "LABELLED_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_go_to_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:317:16: ( ->) 'if' expression 'then' conditional_statement ( options {greedy=true; } : 'else' statement )?
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:317:16: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:317:17: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 317:17: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					string_literal140=(Token)match(input,91,FOLLOW_91_in_statement_with_label2208);  
					stream_91.add(string_literal140);

					pushFollow(FOLLOW_expression_in_statement_with_label2210);
					expression141=expression();
					state._fsp--;

					stream_expression.add(expression141.getTree());
					string_literal142=(Token)match(input,100,FOLLOW_100_in_statement_with_label2212);  
					stream_100.add(string_literal142);

					pushFollow(FOLLOW_conditional_statement_in_statement_with_label2214);
					conditional_statement143=conditional_statement();
					state._fsp--;

					stream_conditional_statement.add(conditional_statement143.getTree());
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:317:84: ( options {greedy=true; } : 'else' statement )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==86) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:317:110: 'else' statement
							{
							string_literal144=(Token)match(input,86,FOLLOW_86_in_statement_with_label2226);  
							stream_86.add(string_literal144);

							pushFollow(FOLLOW_statement_in_statement_with_label2228);
							statement145=statement();
							state._fsp--;

							stream_statement.add(statement145.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: statement, conditional_statement, expression, statement_with_label
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 317:129: -> ^( LABELLED_STATEMENT $statement_with_label ^( IF expression ^( THEN conditional_statement ) ^( ELSE statement ) ) )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:317:131: ^( LABELLED_STATEMENT $statement_with_label ^( IF expression ^( THEN conditional_statement ) ^( ELSE statement ) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABELLED_STATEMENT, "LABELLED_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:317:174: ^( IF expression ^( THEN conditional_statement ) ^( ELSE statement ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:317:190: ^( THEN conditional_statement )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_3);
						adaptor.addChild(root_3, stream_conditional_statement.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:317:220: ^( ELSE statement )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_3);
						adaptor.addChild(root_3, stream_statement.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:319:5: ( ->) for_statement
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:319:5: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:319:6: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 319:6: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_for_statement_in_statement_with_label2268);
					for_statement146=for_statement();
					state._fsp--;

					stream_for_statement.add(for_statement146.getTree());
					// AST REWRITE
					// elements: statement_with_label, for_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 319:43: -> ^( LABELLED_STATEMENT $statement_with_label for_statement )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:319:45: ^( LABELLED_STATEMENT $statement_with_label for_statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABELLED_STATEMENT, "LABELLED_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_for_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:320:28: ( ->) begin
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:320:28: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:320:29: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 320:29: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_begin_in_statement_with_label2474);
					begin147=begin();
					state._fsp--;

					stream_begin.add(begin147.getTree());
					// AST REWRITE
					// elements: begin, statement_with_label
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 320:57: -> ^( LABELLED_STATEMENT $statement_with_label begin )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:320:59: ^( LABELLED_STATEMENT $statement_with_label begin )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABELLED_STATEMENT, "LABELLED_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_begin.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:321:28: ( ->) actual_parameter_part1
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:321:28: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:321:29: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 321:29: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_actual_parameter_part1_in_statement_with_label2518);
					actual_parameter_part1148=actual_parameter_part1();
					state._fsp--;

					stream_actual_parameter_part1.add(actual_parameter_part1148.getTree());
					// AST REWRITE
					// elements: actual_parameter_part1
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 321:73: -> actual_parameter_part1
					{
						adaptor.addChild(root_0, stream_actual_parameter_part1.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:322:28: ( ->)
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:322:28: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:322:29: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 322:29: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					// AST REWRITE
					// elements: statement_with_label
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 322:51: -> ^( LABELLED_EMPTY_STATEMENT $statement_with_label)
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:322:53: ^( LABELLED_EMPTY_STATEMENT $statement_with_label)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABELLED_EMPTY_STATEMENT, "LABELLED_EMPTY_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement_with_label"


	public static class for_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "for_statement"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:327:1: for_statement : 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' statement -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) ) ;
	public final for_statement_return for_statement() throws RecognitionException {
		for_statement_return retval = new for_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal149=null;
		Token Identifier150=null;
		Token string_literal152=null;
		Token string_literal154=null;
		ParserRuleReturnScope iterator151 =null;
		ParserRuleReturnScope for_list153 =null;
		ParserRuleReturnScope statement155 =null;

		CommonTree string_literal149_tree=null;
		CommonTree Identifier150_tree=null;
		CommonTree string_literal152_tree=null;
		CommonTree string_literal154_tree=null;
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_iterator=new RewriteRuleSubtreeStream(adaptor,"rule iterator");
		RewriteRuleSubtreeStream stream_for_list=new RewriteRuleSubtreeStream(adaptor,"rule for_list");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:328:2: ( 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' statement -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:328:5: 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' statement
			{
			string_literal149=(Token)match(input,89,FOLLOW_89_in_for_statement2583);  
			stream_89.add(string_literal149);

			Identifier150=(Token)match(input,Identifier,FOLLOW_Identifier_in_for_statement2585);  
			stream_Identifier.add(Identifier150);

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:328:21: ( -> Identifier )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:328:22: 
			{
			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 328:22: -> Identifier
			{
				adaptor.addChild(root_0, stream_Identifier.nextNode());
			}


			retval.tree = root_0;

			}

			Identifiermemory2=retval.tree;
			pushFollow(FOLLOW_iterator_in_for_statement2594);
			iterator151=iterator();
			state._fsp--;

			stream_iterator.add(iterator151.getTree());
			string_literal152=(Token)match(input,68,FOLLOW_68_in_for_statement2596);  
			stream_68.add(string_literal152);

			pushFollow(FOLLOW_for_list_in_for_statement2598);
			for_list153=for_list();
			state._fsp--;

			stream_for_list.add(for_list153.getTree());
			string_literal154=(Token)match(input,85,FOLLOW_85_in_for_statement2600);  
			stream_85.add(string_literal154);

			pushFollow(FOLLOW_statement_in_for_statement2602);
			statement155=statement();
			state._fsp--;

			stream_statement.add(statement155.getTree());
			// AST REWRITE
			// elements: for_list, iterator, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 328:117: -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) )
			{
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:328:119: ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);
				adaptor.addChild(root_1, stream_iterator.nextTree());
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:328:134: ^( FOR_LIST for_list )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_LIST, "FOR_LIST"), root_2);
				adaptor.addChild(root_2, stream_for_list.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:328:155: ^( DO statement )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO, "DO"), root_2);
				adaptor.addChild(root_2, stream_statement.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "for_statement"


	public static class begin_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "begin"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:331:1: begin : 'begin' ( declaration ';' )* compound_tail -> ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? ) ;
	public final begin_return begin() throws RecognitionException {
		begin_return retval = new begin_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal156=null;
		Token char_literal158=null;
		ParserRuleReturnScope declaration157 =null;
		ParserRuleReturnScope compound_tail159 =null;

		CommonTree string_literal156_tree=null;
		CommonTree char_literal158_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_compound_tail=new RewriteRuleSubtreeStream(adaptor,"rule compound_tail");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:331:7: ( 'begin' ( declaration ';' )* compound_tail -> ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:331:10: 'begin' ( declaration ';' )* compound_tail
			{
			string_literal156=(Token)match(input,83,FOLLOW_83_in_begin2635);  
			stream_83.add(string_literal156);

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:331:18: ( declaration ';' )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==82||LA34_0==84||LA34_0==92||(LA34_0 >= 94 && LA34_0 <= 96)||LA34_0==99) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:331:20: declaration ';'
					{
					pushFollow(FOLLOW_declaration_in_begin2639);
					declaration157=declaration();
					state._fsp--;

					stream_declaration.add(declaration157.getTree());
					char_literal158=(Token)match(input,69,FOLLOW_69_in_begin2641);  
					stream_69.add(char_literal158);

					}
					break;

				default :
					break loop34;
				}
			}

			pushFollow(FOLLOW_compound_tail_in_begin2645);
			compound_tail159=compound_tail();
			state._fsp--;

			stream_compound_tail.add(compound_tail159.getTree());
			// AST REWRITE
			// elements: compound_tail, declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 331:52: -> ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? )
			{
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:331:54: ^( BEGIN ( ^( DECLARATIONS ( declaration )* ) )? ( ^( BLOCK compound_tail ) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BEGIN, "BEGIN"), root_1);
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:331:62: ( ^( DECLARATIONS ( declaration )* ) )?
				if ( stream_declaration.hasNext() ) {
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:331:62: ^( DECLARATIONS ( declaration )* )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_2);
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:331:77: ( declaration )*
					while ( stream_declaration.hasNext() ) {
						adaptor.addChild(root_2, stream_declaration.nextTree());
					}
					stream_declaration.reset();

					adaptor.addChild(root_1, root_2);
					}

				}
				stream_declaration.reset();

				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:331:92: ( ^( BLOCK compound_tail ) )?
				if ( stream_compound_tail.hasNext() ) {
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:331:92: ^( BLOCK compound_tail )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);
					adaptor.addChild(root_2, stream_compound_tail.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_compound_tail.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "begin"


	public static class label_labeled_statements_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label_labeled_statements"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:335:1: label_labeled_statements : ( Identifier ( -> Identifier ) labeled_statements -> labeled_statements | Number ( -> Number ) labeled_statements -> labeled_statements );
	public final label_labeled_statements_return label_labeled_statements() throws RecognitionException {
		label_labeled_statements_return retval = new label_labeled_statements_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier160=null;
		Token Number162=null;
		ParserRuleReturnScope labeled_statements161 =null;
		ParserRuleReturnScope labeled_statements163 =null;

		CommonTree Identifier160_tree=null;
		CommonTree Number162_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleSubtreeStream stream_labeled_statements=new RewriteRuleSubtreeStream(adaptor,"rule labeled_statements");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:336:2: ( Identifier ( -> Identifier ) labeled_statements -> labeled_statements | Number ( -> Number ) labeled_statements -> labeled_statements )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Identifier) ) {
				alt35=1;
			}
			else if ( (LA35_0==Number) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:336:4: Identifier ( -> Identifier ) labeled_statements
					{
					Identifier160=(Token)match(input,Identifier,FOLLOW_Identifier_in_label_labeled_statements2680);  
					stream_Identifier.add(Identifier160);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:336:15: ( -> Identifier )
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:336:16: 
					{
					// AST REWRITE
					// elements: Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 336:16: -> Identifier
					{
						adaptor.addChild(root_0, stream_Identifier.nextNode());
					}


					retval.tree = root_0;

					}

					Identifiermemory=retval.tree;
					pushFollow(FOLLOW_labeled_statements_in_label_labeled_statements2689);
					labeled_statements161=labeled_statements();
					state._fsp--;

					stream_labeled_statements.add(labeled_statements161.getTree());
					// AST REWRITE
					// elements: labeled_statements
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 336:99: -> labeled_statements
					{
						adaptor.addChild(root_0, stream_labeled_statements.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:337:15: Number ( -> Number ) labeled_statements
					{
					Number162=(Token)match(input,Number,FOLLOW_Number_in_label_labeled_statements2707);  
					stream_Number.add(Number162);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:337:22: ( -> Number )
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:337:23: 
					{
					// AST REWRITE
					// elements: Number
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 337:23: -> Number
					{
						adaptor.addChild(root_0, stream_Number.nextNode());
					}


					retval.tree = root_0;

					}

					Identifiermemory=retval.tree;
					pushFollow(FOLLOW_labeled_statements_in_label_labeled_statements2716);
					labeled_statements163=labeled_statements();
					state._fsp--;

					stream_labeled_statements.add(labeled_statements163.getTree());
					// AST REWRITE
					// elements: labeled_statements
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 337:102: -> labeled_statements
					{
						adaptor.addChild(root_0, stream_labeled_statements.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "label_labeled_statements"


	public static class labeled_statements_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "labeled_statements"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:340:1: labeled_statements : ( ( ->) ( ':=' expression )+ -> ^( ASSIGNMENT $labeled_statements ( expression )+ ) | ( ->) actual_parameter_part -> actual_parameter_part | ':' statement_with_label -> statement_with_label );
	public final labeled_statements_return labeled_statements() throws RecognitionException {
		labeled_statements_return retval = new labeled_statements_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal164=null;
		Token char_literal167=null;
		ParserRuleReturnScope expression165 =null;
		ParserRuleReturnScope actual_parameter_part166 =null;
		ParserRuleReturnScope statement_with_label168 =null;

		CommonTree string_literal164_tree=null;
		CommonTree char_literal167_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleSubtreeStream stream_actual_parameter_part=new RewriteRuleSubtreeStream(adaptor,"rule actual_parameter_part");
		RewriteRuleSubtreeStream stream_statement_with_label=new RewriteRuleSubtreeStream(adaptor,"rule statement_with_label");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:341:2: ( ( ->) ( ':=' expression )+ -> ^( ASSIGNMENT $labeled_statements ( expression )+ ) | ( ->) actual_parameter_part -> actual_parameter_part | ':' statement_with_label -> statement_with_label )
			int alt37=3;
			switch ( input.LA(1) ) {
			case 68:
				{
				alt37=1;
				}
				break;
			case 58:
			case 69:
			case 86:
			case 87:
				{
				alt37=2;
				}
				break;
			case 67:
				{
				alt37=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:341:6: ( ->) ( ':=' expression )+
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:341:6: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:341:7: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 341:7: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:341:29: ( ':=' expression )+
					int cnt36=0;
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==68) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:341:30: ':=' expression
							{
							string_literal164=(Token)match(input,68,FOLLOW_68_in_labeled_statements2737);  
							stream_68.add(string_literal164);

							pushFollow(FOLLOW_expression_in_labeled_statements2739);
							expression165=expression();
							state._fsp--;

							stream_expression.add(expression165.getTree());
							}
							break;

						default :
							if ( cnt36 >= 1 ) break loop36;
							EarlyExitException eee = new EarlyExitException(36, input);
							throw eee;
						}
						cnt36++;
					}

					// AST REWRITE
					// elements: expression, labeled_statements
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 341:48: -> ^( ASSIGNMENT $labeled_statements ( expression )+ )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:341:50: ^( ASSIGNMENT $labeled_statements ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:342:5: ( ->) actual_parameter_part
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:342:5: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:342:6: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 342:6: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_actual_parameter_part_in_labeled_statements2763);
					actual_parameter_part166=actual_parameter_part();
					state._fsp--;

					stream_actual_parameter_part.add(actual_parameter_part166.getTree());
					// AST REWRITE
					// elements: actual_parameter_part
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 342:50: -> actual_parameter_part
					{
						adaptor.addChild(root_0, stream_actual_parameter_part.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:343:6: ':' statement_with_label
					{
					char_literal167=(Token)match(input,67,FOLLOW_67_in_labeled_statements2774);  
					stream_67.add(char_literal167);

					pushFollow(FOLLOW_statement_with_label_in_labeled_statements2776);
					statement_with_label168=statement_with_label();
					state._fsp--;

					stream_statement_with_label.add(statement_with_label168.getTree());
					// AST REWRITE
					// elements: statement_with_label
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 343:30: -> statement_with_label
					{
						adaptor.addChild(root_0, stream_statement_with_label.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "labeled_statements"


	public static class conditional_statement_with_label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conditional_statement_with_label"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:348:1: conditional_statement_with_label : ( Identifier ( -> Identifier ) expression_with_identifier -> expression_with_identifier | ( ->) go_to_statement -> ^( LABEL $conditional_statement_with_label go_to_statement ) | ( ->) begin -> begin | 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' statement -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) ) |);
	public final conditional_statement_with_label_return conditional_statement_with_label() throws RecognitionException {
		conditional_statement_with_label_return retval = new conditional_statement_with_label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier169=null;
		Token string_literal173=null;
		Token Identifier174=null;
		Token string_literal176=null;
		Token string_literal178=null;
		ParserRuleReturnScope expression_with_identifier170 =null;
		ParserRuleReturnScope go_to_statement171 =null;
		ParserRuleReturnScope begin172 =null;
		ParserRuleReturnScope iterator175 =null;
		ParserRuleReturnScope for_list177 =null;
		ParserRuleReturnScope statement179 =null;

		CommonTree Identifier169_tree=null;
		CommonTree string_literal173_tree=null;
		CommonTree Identifier174_tree=null;
		CommonTree string_literal176_tree=null;
		CommonTree string_literal178_tree=null;
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_expression_with_identifier=new RewriteRuleSubtreeStream(adaptor,"rule expression_with_identifier");
		RewriteRuleSubtreeStream stream_go_to_statement=new RewriteRuleSubtreeStream(adaptor,"rule go_to_statement");
		RewriteRuleSubtreeStream stream_iterator=new RewriteRuleSubtreeStream(adaptor,"rule iterator");
		RewriteRuleSubtreeStream stream_for_list=new RewriteRuleSubtreeStream(adaptor,"rule for_list");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:349:2: ( Identifier ( -> Identifier ) expression_with_identifier -> expression_with_identifier | ( ->) go_to_statement -> ^( LABEL $conditional_statement_with_label go_to_statement ) | ( ->) begin -> begin | 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' statement -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) ) |)
			int alt38=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt38=1;
				}
				break;
			case 90:
				{
				alt38=2;
				}
				break;
			case 83:
				{
				alt38=3;
				}
				break;
			case 89:
				{
				alt38=4;
				}
				break;
			case 69:
			case 86:
			case 87:
				{
				alt38=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:349:12: Identifier ( -> Identifier ) expression_with_identifier
					{
					Identifier169=(Token)match(input,Identifier,FOLLOW_Identifier_in_conditional_statement_with_label2802);  
					stream_Identifier.add(Identifier169);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:349:23: ( -> Identifier )
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:349:24: 
					{
					// AST REWRITE
					// elements: Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 349:24: -> Identifier
					{
						adaptor.addChild(root_0, stream_Identifier.nextNode());
					}


					retval.tree = root_0;

					}

					Identifiermemory=retval.tree;
					pushFollow(FOLLOW_expression_with_identifier_in_conditional_statement_with_label2812);
					expression_with_identifier170=expression_with_identifier();
					state._fsp--;

					stream_expression_with_identifier.add(expression_with_identifier170.getTree());
					// AST REWRITE
					// elements: expression_with_identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 349:124: -> expression_with_identifier
					{
						adaptor.addChild(root_0, stream_expression_with_identifier.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:350:12: ( ->) go_to_statement
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:350:12: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:350:13: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 350:13: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_go_to_statement_in_conditional_statement_with_label2832);
					go_to_statement171=go_to_statement();
					state._fsp--;

					stream_go_to_statement.add(go_to_statement171.getTree());
					// AST REWRITE
					// elements: go_to_statement, conditional_statement_with_label
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 350:50: -> ^( LABEL $conditional_statement_with_label go_to_statement )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:350:52: ^( LABEL $conditional_statement_with_label go_to_statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_go_to_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:351:12: ( ->) begin
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:351:12: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:351:13: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 351:13: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_begin_in_conditional_statement_with_label2860);
					begin172=begin();
					state._fsp--;

					stream_begin.add(begin172.getTree());
					// AST REWRITE
					// elements: begin
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 351:41: -> begin
					{
						adaptor.addChild(root_0, stream_begin.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:352:13: 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' statement
					{
					string_literal173=(Token)match(input,89,FOLLOW_89_in_conditional_statement_with_label2878);  
					stream_89.add(string_literal173);

					Identifier174=(Token)match(input,Identifier,FOLLOW_Identifier_in_conditional_statement_with_label2880);  
					stream_Identifier.add(Identifier174);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:352:29: ( -> Identifier )
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:352:30: 
					{
					// AST REWRITE
					// elements: Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 352:30: -> Identifier
					{
						adaptor.addChild(root_0, stream_Identifier.nextNode());
					}


					retval.tree = root_0;

					}

					Identifiermemory2=retval.tree;
					pushFollow(FOLLOW_iterator_in_conditional_statement_with_label2889);
					iterator175=iterator();
					state._fsp--;

					stream_iterator.add(iterator175.getTree());
					string_literal176=(Token)match(input,68,FOLLOW_68_in_conditional_statement_with_label2891);  
					stream_68.add(string_literal176);

					pushFollow(FOLLOW_for_list_in_conditional_statement_with_label2893);
					for_list177=for_list();
					state._fsp--;

					stream_for_list.add(for_list177.getTree());
					string_literal178=(Token)match(input,85,FOLLOW_85_in_conditional_statement_with_label2895);  
					stream_85.add(string_literal178);

					pushFollow(FOLLOW_statement_in_conditional_statement_with_label2897);
					statement179=statement();
					state._fsp--;

					stream_statement.add(statement179.getTree());
					// AST REWRITE
					// elements: iterator, statement, for_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 352:142: -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:352:144: ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);
						adaptor.addChild(root_1, stream_iterator.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:352:159: ^( FOR_LIST for_list )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_LIST, "FOR_LIST"), root_2);
						adaptor.addChild(root_2, stream_for_list.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:352:180: ^( DO statement )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO, "DO"), root_2);
						adaptor.addChild(root_2, stream_statement.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:354:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_statement_with_label"


	public static class iterator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "iterator"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:356:1: iterator : ( ( ->) '[' arithmetic_expression ( ',' arithmetic_expression )* ']' -> ^( ARRAY_ACCESS $iterator ^( INDEX ( arithmetic_expression )+ ) ) | ( ->) );
	public final iterator_return iterator() throws RecognitionException {
		iterator_return retval = new iterator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal180=null;
		Token char_literal182=null;
		Token char_literal184=null;
		ParserRuleReturnScope arithmetic_expression181 =null;
		ParserRuleReturnScope arithmetic_expression183 =null;

		CommonTree char_literal180_tree=null;
		CommonTree char_literal182_tree=null;
		CommonTree char_literal184_tree=null;
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_arithmetic_expression=new RewriteRuleSubtreeStream(adaptor,"rule arithmetic_expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:356:15: ( ( ->) '[' arithmetic_expression ( ',' arithmetic_expression )* ']' -> ^( ARRAY_ACCESS $iterator ^( INDEX ( arithmetic_expression )+ ) ) | ( ->) )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==80) ) {
				alt40=1;
			}
			else if ( (LA40_0==68) ) {
				alt40=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:356:18: ( ->) '[' arithmetic_expression ( ',' arithmetic_expression )* ']'
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:356:18: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:356:19: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 356:19: ->
					{
						adaptor.addChild(root_0, Identifiermemory2);
					}


					retval.tree = root_0;

					}

					char_literal180=(Token)match(input,80,FOLLOW_80_in_iterator2950);  
					stream_80.add(char_literal180);

					pushFollow(FOLLOW_arithmetic_expression_in_iterator2952);
					arithmetic_expression181=arithmetic_expression();
					state._fsp--;

					stream_arithmetic_expression.add(arithmetic_expression181.getTree());
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:356:68: ( ',' arithmetic_expression )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==63) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:356:69: ',' arithmetic_expression
							{
							char_literal182=(Token)match(input,63,FOLLOW_63_in_iterator2955);  
							stream_63.add(char_literal182);

							pushFollow(FOLLOW_arithmetic_expression_in_iterator2957);
							arithmetic_expression183=arithmetic_expression();
							state._fsp--;

							stream_arithmetic_expression.add(arithmetic_expression183.getTree());
							}
							break;

						default :
							break loop39;
						}
					}

					char_literal184=(Token)match(input,81,FOLLOW_81_in_iterator2961);  
					stream_81.add(char_literal184);

					// AST REWRITE
					// elements: arithmetic_expression, iterator
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 356:101: -> ^( ARRAY_ACCESS $iterator ^( INDEX ( arithmetic_expression )+ ) )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:356:103: ^( ARRAY_ACCESS $iterator ^( INDEX ( arithmetic_expression )+ ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_ACCESS, "ARRAY_ACCESS"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:356:130: ^( INDEX ( arithmetic_expression )+ )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX, "INDEX"), root_2);
						if ( !(stream_arithmetic_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_arithmetic_expression.hasNext() ) {
							adaptor.addChild(root_2, stream_arithmetic_expression.nextTree());
						}
						stream_arithmetic_expression.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:357:5: ( ->)
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:357:5: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:357:6: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 357:6: ->
					{
						adaptor.addChild(root_0, Identifiermemory2);
					}


					retval.tree = root_0;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "iterator"


	public static class conditional_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conditional_statement"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:360:1: conditional_statement : ( 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' statement -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) ) | Identifier ( -> Identifier ) conditional_statement_with_id -> conditional_statement_with_id | go_to_statement -> go_to_statement | begin -> begin |);
	public final conditional_statement_return conditional_statement() throws RecognitionException {
		conditional_statement_return retval = new conditional_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal185=null;
		Token Identifier186=null;
		Token string_literal188=null;
		Token string_literal190=null;
		Token Identifier192=null;
		ParserRuleReturnScope iterator187 =null;
		ParserRuleReturnScope for_list189 =null;
		ParserRuleReturnScope statement191 =null;
		ParserRuleReturnScope conditional_statement_with_id193 =null;
		ParserRuleReturnScope go_to_statement194 =null;
		ParserRuleReturnScope begin195 =null;

		CommonTree string_literal185_tree=null;
		CommonTree Identifier186_tree=null;
		CommonTree string_literal188_tree=null;
		CommonTree string_literal190_tree=null;
		CommonTree Identifier192_tree=null;
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_go_to_statement=new RewriteRuleSubtreeStream(adaptor,"rule go_to_statement");
		RewriteRuleSubtreeStream stream_iterator=new RewriteRuleSubtreeStream(adaptor,"rule iterator");
		RewriteRuleSubtreeStream stream_conditional_statement_with_id=new RewriteRuleSubtreeStream(adaptor,"rule conditional_statement_with_id");
		RewriteRuleSubtreeStream stream_for_list=new RewriteRuleSubtreeStream(adaptor,"rule for_list");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:361:2: ( 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' statement -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) ) | Identifier ( -> Identifier ) conditional_statement_with_id -> conditional_statement_with_id | go_to_statement -> go_to_statement | begin -> begin |)
			int alt41=5;
			switch ( input.LA(1) ) {
			case 89:
				{
				alt41=1;
				}
				break;
			case Identifier:
				{
				alt41=2;
				}
				break;
			case 90:
				{
				alt41=3;
				}
				break;
			case 83:
				{
				alt41=4;
				}
				break;
			case 69:
			case 86:
			case 87:
				{
				alt41=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:361:7: 'for' Identifier ( -> Identifier ) iterator ':=' for_list 'do' statement
					{
					string_literal185=(Token)match(input,89,FOLLOW_89_in_conditional_statement3002);  
					stream_89.add(string_literal185);

					Identifier186=(Token)match(input,Identifier,FOLLOW_Identifier_in_conditional_statement3004);  
					stream_Identifier.add(Identifier186);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:361:24: ( -> Identifier )
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:361:25: 
					{
					// AST REWRITE
					// elements: Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 361:25: -> Identifier
					{
						adaptor.addChild(root_0, stream_Identifier.nextNode());
					}


					retval.tree = root_0;

					}

					Identifiermemory2=retval.tree;
					pushFollow(FOLLOW_iterator_in_conditional_statement3014);
					iterator187=iterator();
					state._fsp--;

					stream_iterator.add(iterator187.getTree());
					string_literal188=(Token)match(input,68,FOLLOW_68_in_conditional_statement3016);  
					stream_68.add(string_literal188);

					pushFollow(FOLLOW_for_list_in_conditional_statement3018);
					for_list189=for_list();
					state._fsp--;

					stream_for_list.add(for_list189.getTree());
					string_literal190=(Token)match(input,85,FOLLOW_85_in_conditional_statement3020);  
					stream_85.add(string_literal190);

					pushFollow(FOLLOW_statement_in_conditional_statement3022);
					statement191=statement();
					state._fsp--;

					stream_statement.add(statement191.getTree());
					// AST REWRITE
					// elements: statement, for_list, iterator
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 361:126: -> ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:361:128: ^( FOR iterator ^( FOR_LIST for_list ) ^( DO statement ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);
						adaptor.addChild(root_1, stream_iterator.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:361:144: ^( FOR_LIST for_list )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_LIST, "FOR_LIST"), root_2);
						adaptor.addChild(root_2, stream_for_list.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:361:165: ^( DO statement )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO, "DO"), root_2);
						adaptor.addChild(root_2, stream_statement.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:362:7: Identifier ( -> Identifier ) conditional_statement_with_id
					{
					Identifier192=(Token)match(input,Identifier,FOLLOW_Identifier_in_conditional_statement3049);  
					stream_Identifier.add(Identifier192);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:362:18: ( -> Identifier )
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:362:19: 
					{
					// AST REWRITE
					// elements: Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 362:19: -> Identifier
					{
						adaptor.addChild(root_0, stream_Identifier.nextNode());
					}


					retval.tree = root_0;

					}

					Identifiermemory=retval.tree;
					pushFollow(FOLLOW_conditional_statement_with_id_in_conditional_statement3058);
					conditional_statement_with_id193=conditional_statement_with_id();
					state._fsp--;

					stream_conditional_statement_with_id.add(conditional_statement_with_id193.getTree());
					// AST REWRITE
					// elements: conditional_statement_with_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 362:113: -> conditional_statement_with_id
					{
						adaptor.addChild(root_0, stream_conditional_statement_with_id.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:363:7: go_to_statement
					{
					pushFollow(FOLLOW_go_to_statement_in_conditional_statement3074);
					go_to_statement194=go_to_statement();
					state._fsp--;

					stream_go_to_statement.add(go_to_statement194.getTree());
					// AST REWRITE
					// elements: go_to_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 363:24: -> go_to_statement
					{
						adaptor.addChild(root_0, stream_go_to_statement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:364:7: begin
					{
					pushFollow(FOLLOW_begin_in_conditional_statement3087);
					begin195=begin();
					state._fsp--;

					stream_begin.add(begin195.getTree());
					// AST REWRITE
					// elements: begin
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 364:14: -> begin
					{
						adaptor.addChild(root_0, stream_begin.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:366:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_statement"


	public static class conditional_statement_with_id_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conditional_statement_with_id"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:370:1: conditional_statement_with_id : ( ( ->) expression_with_identifier -> expression_with_identifier | ':' conditional_statement_loop -> conditional_statement_loop );
	public final conditional_statement_with_id_return conditional_statement_with_id() throws RecognitionException {
		conditional_statement_with_id_return retval = new conditional_statement_with_id_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal197=null;
		ParserRuleReturnScope expression_with_identifier196 =null;
		ParserRuleReturnScope conditional_statement_loop198 =null;

		CommonTree char_literal197_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleSubtreeStream stream_expression_with_identifier=new RewriteRuleSubtreeStream(adaptor,"rule expression_with_identifier");
		RewriteRuleSubtreeStream stream_conditional_statement_loop=new RewriteRuleSubtreeStream(adaptor,"rule conditional_statement_loop");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:371:2: ( ( ->) expression_with_identifier -> expression_with_identifier | ':' conditional_statement_loop -> conditional_statement_loop )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==58||(LA42_0 >= 68 && LA42_0 <= 69)||(LA42_0 >= 86 && LA42_0 <= 87)) ) {
				alt42=1;
			}
			else if ( (LA42_0==67) ) {
				alt42=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:371:6: ( ->) expression_with_identifier
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:371:6: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:371:7: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 371:7: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_expression_with_identifier_in_conditional_statement_with_id3120);
					expression_with_identifier196=expression_with_identifier();
					state._fsp--;

					stream_expression_with_identifier.add(expression_with_identifier196.getTree());
					// AST REWRITE
					// elements: expression_with_identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 371:55: -> expression_with_identifier
					{
						adaptor.addChild(root_0, stream_expression_with_identifier.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:372:16: ':' conditional_statement_loop
					{
					char_literal197=(Token)match(input,67,FOLLOW_67_in_conditional_statement_with_id3139);  
					stream_67.add(char_literal197);

					pushFollow(FOLLOW_conditional_statement_loop_in_conditional_statement_with_id3141);
					conditional_statement_loop198=conditional_statement_loop();
					state._fsp--;

					stream_conditional_statement_loop.add(conditional_statement_loop198.getTree());
					// AST REWRITE
					// elements: conditional_statement_loop
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 372:47: -> conditional_statement_loop
					{
						adaptor.addChild(root_0, stream_conditional_statement_loop.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_statement_with_id"


	public static class expression_with_identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression_with_identifier"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:376:1: expression_with_identifier : ( ( ->) ( ':=' expression )+ -> ^( ASSIGNMENT $expression_with_identifier ( expression )+ ) | ( ->) actual_parameter_part -> actual_parameter_part );
	public final expression_with_identifier_return expression_with_identifier() throws RecognitionException {
		expression_with_identifier_return retval = new expression_with_identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal199=null;
		ParserRuleReturnScope expression200 =null;
		ParserRuleReturnScope actual_parameter_part201 =null;

		CommonTree string_literal199_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleSubtreeStream stream_actual_parameter_part=new RewriteRuleSubtreeStream(adaptor,"rule actual_parameter_part");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:377:2: ( ( ->) ( ':=' expression )+ -> ^( ASSIGNMENT $expression_with_identifier ( expression )+ ) | ( ->) actual_parameter_part -> actual_parameter_part )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==68) ) {
				alt44=1;
			}
			else if ( (LA44_0==58||LA44_0==69||(LA44_0 >= 86 && LA44_0 <= 87)) ) {
				alt44=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:377:5: ( ->) ( ':=' expression )+
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:377:5: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:377:6: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 377:6: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:377:28: ( ':=' expression )+
					int cnt43=0;
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==68) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:377:29: ':=' expression
							{
							string_literal199=(Token)match(input,68,FOLLOW_68_in_expression_with_identifier3165);  
							stream_68.add(string_literal199);

							pushFollow(FOLLOW_expression_in_expression_with_identifier3167);
							expression200=expression();
							state._fsp--;

							stream_expression.add(expression200.getTree());
							}
							break;

						default :
							if ( cnt43 >= 1 ) break loop43;
							EarlyExitException eee = new EarlyExitException(43, input);
							throw eee;
						}
						cnt43++;
					}

					// AST REWRITE
					// elements: expression, expression_with_identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 377:47: -> ^( ASSIGNMENT $expression_with_identifier ( expression )+ )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:377:49: ^( ASSIGNMENT $expression_with_identifier ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:378:16: ( ->) actual_parameter_part
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:378:16: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:378:17: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 378:17: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_actual_parameter_part_in_expression_with_identifier3203);
					actual_parameter_part201=actual_parameter_part();
					state._fsp--;

					stream_actual_parameter_part.add(actual_parameter_part201.getTree());
					// AST REWRITE
					// elements: actual_parameter_part
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 378:62: -> actual_parameter_part
					{
						adaptor.addChild(root_0, stream_actual_parameter_part.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_with_identifier"


	public static class conditional_statement_loop_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conditional_statement_loop"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:382:1: conditional_statement_loop : ( ( ->) conditional_statement_with_label -> conditional_statement_with_label | ':' conditional_statement_loop -> conditional_statement_loop );
	public final conditional_statement_loop_return conditional_statement_loop() throws RecognitionException {
		conditional_statement_loop_return retval = new conditional_statement_loop_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal203=null;
		ParserRuleReturnScope conditional_statement_with_label202 =null;
		ParserRuleReturnScope conditional_statement_loop204 =null;

		CommonTree char_literal203_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleSubtreeStream stream_conditional_statement_loop=new RewriteRuleSubtreeStream(adaptor,"rule conditional_statement_loop");
		RewriteRuleSubtreeStream stream_conditional_statement_with_label=new RewriteRuleSubtreeStream(adaptor,"rule conditional_statement_with_label");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:383:2: ( ( ->) conditional_statement_with_label -> conditional_statement_with_label | ':' conditional_statement_loop -> conditional_statement_loop )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==Identifier||LA45_0==69||LA45_0==83||(LA45_0 >= 86 && LA45_0 <= 87)||(LA45_0 >= 89 && LA45_0 <= 90)) ) {
				alt45=1;
			}
			else if ( (LA45_0==67) ) {
				alt45=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:383:5: ( ->) conditional_statement_with_label
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:383:5: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:383:6: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 383:6: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_conditional_statement_with_label_in_conditional_statement_loop3229);
					conditional_statement_with_label202=conditional_statement_with_label();
					state._fsp--;

					stream_conditional_statement_with_label.add(conditional_statement_with_label202.getTree());
					// AST REWRITE
					// elements: conditional_statement_with_label
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 383:61: -> conditional_statement_with_label
					{
						adaptor.addChild(root_0, stream_conditional_statement_with_label.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:384:16: ':' conditional_statement_loop
					{
					char_literal203=(Token)match(input,67,FOLLOW_67_in_conditional_statement_loop3250);  
					stream_67.add(char_literal203);

					pushFollow(FOLLOW_conditional_statement_loop_in_conditional_statement_loop3252);
					conditional_statement_loop204=conditional_statement_loop();
					state._fsp--;

					stream_conditional_statement_loop.add(conditional_statement_loop204.getTree());
					// AST REWRITE
					// elements: conditional_statement_loop
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 384:47: -> conditional_statement_loop
					{
						adaptor.addChild(root_0, stream_conditional_statement_loop.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_statement_loop"


	public static class go_to_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "go_to_statement"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:391:1: go_to_statement : 'goto' designational_expression -> ^( GOTO designational_expression ) ;
	public final go_to_statement_return go_to_statement() throws RecognitionException {
		go_to_statement_return retval = new go_to_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal205=null;
		ParserRuleReturnScope designational_expression206 =null;

		CommonTree string_literal205_tree=null;
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleSubtreeStream stream_designational_expression=new RewriteRuleSubtreeStream(adaptor,"rule designational_expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:392:2: ( 'goto' designational_expression -> ^( GOTO designational_expression ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:392:15: 'goto' designational_expression
			{
			string_literal205=(Token)match(input,90,FOLLOW_90_in_go_to_statement3285);  
			stream_90.add(string_literal205);

			pushFollow(FOLLOW_designational_expression_in_go_to_statement3287);
			designational_expression206=designational_expression();
			state._fsp--;

			stream_designational_expression.add(designational_expression206.getTree());
			// AST REWRITE
			// elements: designational_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 392:47: -> ^( GOTO designational_expression )
			{
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:392:49: ^( GOTO designational_expression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GOTO, "GOTO"), root_1);
				adaptor.addChild(root_1, stream_designational_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "go_to_statement"


	public static class designational_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "designational_expression"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:396:1: designational_expression : ( simple_designational_expression -> simple_designational_expression | 'if' expression 'then' simple_designational_expression 'else' designational_expression -> ^( IF expression ^( THEN simple_designational_expression ) ^( ELSE designational_expression ) ) );
	public final designational_expression_return designational_expression() throws RecognitionException {
		designational_expression_return retval = new designational_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal208=null;
		Token string_literal210=null;
		Token string_literal212=null;
		ParserRuleReturnScope simple_designational_expression207 =null;
		ParserRuleReturnScope expression209 =null;
		ParserRuleReturnScope simple_designational_expression211 =null;
		ParserRuleReturnScope designational_expression213 =null;

		CommonTree string_literal208_tree=null;
		CommonTree string_literal210_tree=null;
		CommonTree string_literal212_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_designational_expression=new RewriteRuleSubtreeStream(adaptor,"rule designational_expression");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_simple_designational_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_designational_expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:397:2: ( simple_designational_expression -> simple_designational_expression | 'if' expression 'then' simple_designational_expression 'else' designational_expression -> ^( IF expression ^( THEN simple_designational_expression ) ^( ELSE designational_expression ) ) )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==Identifier||LA46_0==Number||LA46_0==58) ) {
				alt46=1;
			}
			else if ( (LA46_0==91) ) {
				alt46=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:397:4: simple_designational_expression
					{
					pushFollow(FOLLOW_simple_designational_expression_in_designational_expression3318);
					simple_designational_expression207=simple_designational_expression();
					state._fsp--;

					stream_simple_designational_expression.add(simple_designational_expression207.getTree());
					// AST REWRITE
					// elements: simple_designational_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 397:36: -> simple_designational_expression
					{
						adaptor.addChild(root_0, stream_simple_designational_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:398:15: 'if' expression 'then' simple_designational_expression 'else' designational_expression
					{
					string_literal208=(Token)match(input,91,FOLLOW_91_in_designational_expression3338);  
					stream_91.add(string_literal208);

					pushFollow(FOLLOW_expression_in_designational_expression3340);
					expression209=expression();
					state._fsp--;

					stream_expression.add(expression209.getTree());
					string_literal210=(Token)match(input,100,FOLLOW_100_in_designational_expression3342);  
					stream_100.add(string_literal210);

					pushFollow(FOLLOW_simple_designational_expression_in_designational_expression3344);
					simple_designational_expression211=simple_designational_expression();
					state._fsp--;

					stream_simple_designational_expression.add(simple_designational_expression211.getTree());
					string_literal212=(Token)match(input,86,FOLLOW_86_in_designational_expression3346);  
					stream_86.add(string_literal212);

					pushFollow(FOLLOW_designational_expression_in_designational_expression3348);
					designational_expression213=designational_expression();
					state._fsp--;

					stream_designational_expression.add(designational_expression213.getTree());
					// AST REWRITE
					// elements: designational_expression, expression, simple_designational_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 398:102: -> ^( IF expression ^( THEN simple_designational_expression ) ^( ELSE designational_expression ) )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:398:104: ^( IF expression ^( THEN simple_designational_expression ) ^( ELSE designational_expression ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:398:120: ^( THEN simple_designational_expression )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_2);
						adaptor.addChild(root_2, stream_simple_designational_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:398:160: ^( ELSE designational_expression )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);
						adaptor.addChild(root_2, stream_designational_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "designational_expression"


	public static class simple_designational_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_designational_expression"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:403:1: simple_designational_expression : ( Identifier ( '[' arithmetic_expression ']' -> ^( SWITCH_CALL Identifier ^( SWITCH_CASE arithmetic_expression ) ) | -> Identifier ) | Number | '(' designational_expression ')' -> designational_expression );
	public final simple_designational_expression_return simple_designational_expression() throws RecognitionException {
		simple_designational_expression_return retval = new simple_designational_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier214=null;
		Token char_literal215=null;
		Token char_literal217=null;
		Token Number218=null;
		Token char_literal219=null;
		Token char_literal221=null;
		ParserRuleReturnScope arithmetic_expression216 =null;
		ParserRuleReturnScope designational_expression220 =null;

		CommonTree Identifier214_tree=null;
		CommonTree char_literal215_tree=null;
		CommonTree char_literal217_tree=null;
		CommonTree Number218_tree=null;
		CommonTree char_literal219_tree=null;
		CommonTree char_literal221_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_designational_expression=new RewriteRuleSubtreeStream(adaptor,"rule designational_expression");
		RewriteRuleSubtreeStream stream_arithmetic_expression=new RewriteRuleSubtreeStream(adaptor,"rule arithmetic_expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:404:2: ( Identifier ( '[' arithmetic_expression ']' -> ^( SWITCH_CALL Identifier ^( SWITCH_CASE arithmetic_expression ) ) | -> Identifier ) | Number | '(' designational_expression ')' -> designational_expression )
			int alt48=3;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt48=1;
				}
				break;
			case Number:
				{
				alt48=2;
				}
				break;
			case 58:
				{
				alt48=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:404:4: Identifier ( '[' arithmetic_expression ']' -> ^( SWITCH_CALL Identifier ^( SWITCH_CASE arithmetic_expression ) ) | -> Identifier )
					{
					Identifier214=(Token)match(input,Identifier,FOLLOW_Identifier_in_simple_designational_expression3393);  
					stream_Identifier.add(Identifier214);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:404:15: ( '[' arithmetic_expression ']' -> ^( SWITCH_CALL Identifier ^( SWITCH_CASE arithmetic_expression ) ) | -> Identifier )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==80) ) {
						alt47=1;
					}
					else if ( (LA47_0==59||LA47_0==63||LA47_0==69||(LA47_0 >= 86 && LA47_0 <= 87)) ) {
						alt47=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}

					switch (alt47) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:404:17: '[' arithmetic_expression ']'
							{
							char_literal215=(Token)match(input,80,FOLLOW_80_in_simple_designational_expression3397);  
							stream_80.add(char_literal215);

							pushFollow(FOLLOW_arithmetic_expression_in_simple_designational_expression3399);
							arithmetic_expression216=arithmetic_expression();
							state._fsp--;

							stream_arithmetic_expression.add(arithmetic_expression216.getTree());
							char_literal217=(Token)match(input,81,FOLLOW_81_in_simple_designational_expression3401);  
							stream_81.add(char_literal217);

							// AST REWRITE
							// elements: arithmetic_expression, Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 404:46: -> ^( SWITCH_CALL Identifier ^( SWITCH_CASE arithmetic_expression ) )
							{
								// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:404:49: ^( SWITCH_CALL Identifier ^( SWITCH_CASE arithmetic_expression ) )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SWITCH_CALL, "SWITCH_CALL"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:404:74: ^( SWITCH_CASE arithmetic_expression )
								{
								CommonTree root_2 = (CommonTree)adaptor.nil();
								root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SWITCH_CASE, "SWITCH_CASE"), root_2);
								adaptor.addChild(root_2, stream_arithmetic_expression.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:404:115: 
							{
							// AST REWRITE
							// elements: Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 404:115: -> Identifier
							{
								adaptor.addChild(root_0, stream_Identifier.nextNode());
							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:405:16: Number
					{
					root_0 = (CommonTree)adaptor.nil();


					Number218=(Token)match(input,Number,FOLLOW_Number_in_simple_designational_expression3447); 
					Number218_tree = (CommonTree)adaptor.create(Number218);
					adaptor.addChild(root_0, Number218_tree);

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:406:26: '(' designational_expression ')'
					{
					char_literal219=(Token)match(input,58,FOLLOW_58_in_simple_designational_expression3474);  
					stream_58.add(char_literal219);

					pushFollow(FOLLOW_designational_expression_in_simple_designational_expression3476);
					designational_expression220=designational_expression();
					state._fsp--;

					stream_designational_expression.add(designational_expression220.getTree());
					char_literal221=(Token)match(input,59,FOLLOW_59_in_simple_designational_expression3478);  
					stream_59.add(char_literal221);

					// AST REWRITE
					// elements: designational_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 406:59: -> designational_expression
					{
						adaptor.addChild(root_0, stream_designational_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_designational_expression"


	public static class actual_parameter_part1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actual_parameter_part1"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:411:1: actual_parameter_part1 : ( ->) '(' actual_parameter ( ',' actual_parameter )* ')' ( Identifier '(' actual_parameter ( ',' actual_parameter )* ')' )* -> ^( FUNCTION_CALL $actual_parameter_part1 ^( LISTPARAMETER ( actual_parameter )* ) ) ;
	public final actual_parameter_part1_return actual_parameter_part1() throws RecognitionException {
		actual_parameter_part1_return retval = new actual_parameter_part1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal222=null;
		Token char_literal224=null;
		Token char_literal226=null;
		Token Identifier227=null;
		Token char_literal228=null;
		Token char_literal230=null;
		Token char_literal232=null;
		ParserRuleReturnScope actual_parameter223 =null;
		ParserRuleReturnScope actual_parameter225 =null;
		ParserRuleReturnScope actual_parameter229 =null;
		ParserRuleReturnScope actual_parameter231 =null;

		CommonTree char_literal222_tree=null;
		CommonTree char_literal224_tree=null;
		CommonTree char_literal226_tree=null;
		CommonTree Identifier227_tree=null;
		CommonTree char_literal228_tree=null;
		CommonTree char_literal230_tree=null;
		CommonTree char_literal232_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_actual_parameter=new RewriteRuleSubtreeStream(adaptor,"rule actual_parameter");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:412:2: ( ( ->) '(' actual_parameter ( ',' actual_parameter )* ')' ( Identifier '(' actual_parameter ( ',' actual_parameter )* ')' )* -> ^( FUNCTION_CALL $actual_parameter_part1 ^( LISTPARAMETER ( actual_parameter )* ) ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:412:5: ( ->) '(' actual_parameter ( ',' actual_parameter )* ')' ( Identifier '(' actual_parameter ( ',' actual_parameter )* ')' )*
			{
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:412:5: ( ->)
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:412:6: 
			{
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 412:6: ->
			{
				adaptor.addChild(root_0, Identifiermemory);
			}


			retval.tree = root_0;

			}

			char_literal222=(Token)match(input,58,FOLLOW_58_in_actual_parameter_part13552);  
			stream_58.add(char_literal222);

			pushFollow(FOLLOW_actual_parameter_in_actual_parameter_part13554);
			actual_parameter223=actual_parameter();
			state._fsp--;

			stream_actual_parameter.add(actual_parameter223.getTree());
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:412:49: ( ',' actual_parameter )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==63) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:412:50: ',' actual_parameter
					{
					char_literal224=(Token)match(input,63,FOLLOW_63_in_actual_parameter_part13557);  
					stream_63.add(char_literal224);

					pushFollow(FOLLOW_actual_parameter_in_actual_parameter_part13559);
					actual_parameter225=actual_parameter();
					state._fsp--;

					stream_actual_parameter.add(actual_parameter225.getTree());
					}
					break;

				default :
					break loop49;
				}
			}

			char_literal226=(Token)match(input,59,FOLLOW_59_in_actual_parameter_part13562);  
			stream_59.add(char_literal226);

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:412:76: ( Identifier '(' actual_parameter ( ',' actual_parameter )* ')' )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==Identifier) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:412:77: Identifier '(' actual_parameter ( ',' actual_parameter )* ')'
					{
					Identifier227=(Token)match(input,Identifier,FOLLOW_Identifier_in_actual_parameter_part13565);  
					stream_Identifier.add(Identifier227);

					char_literal228=(Token)match(input,58,FOLLOW_58_in_actual_parameter_part13567);  
					stream_58.add(char_literal228);

					pushFollow(FOLLOW_actual_parameter_in_actual_parameter_part13569);
					actual_parameter229=actual_parameter();
					state._fsp--;

					stream_actual_parameter.add(actual_parameter229.getTree());
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:412:109: ( ',' actual_parameter )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==63) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:412:110: ',' actual_parameter
							{
							char_literal230=(Token)match(input,63,FOLLOW_63_in_actual_parameter_part13572);  
							stream_63.add(char_literal230);

							pushFollow(FOLLOW_actual_parameter_in_actual_parameter_part13574);
							actual_parameter231=actual_parameter();
							state._fsp--;

							stream_actual_parameter.add(actual_parameter231.getTree());
							}
							break;

						default :
							break loop50;
						}
					}

					char_literal232=(Token)match(input,59,FOLLOW_59_in_actual_parameter_part13578);  
					stream_59.add(char_literal232);

					}
					break;

				default :
					break loop51;
				}
			}

			// AST REWRITE
			// elements: actual_parameter, actual_parameter_part1
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 413:2: -> ^( FUNCTION_CALL $actual_parameter_part1 ^( LISTPARAMETER ( actual_parameter )* ) )
			{
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:413:4: ^( FUNCTION_CALL $actual_parameter_part1 ^( LISTPARAMETER ( actual_parameter )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);
				adaptor.addChild(root_1, stream_retval.nextTree());
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:413:44: ^( LISTPARAMETER ( actual_parameter )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTPARAMETER, "LISTPARAMETER"), root_2);
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:413:60: ( actual_parameter )*
				while ( stream_actual_parameter.hasNext() ) {
					adaptor.addChild(root_2, stream_actual_parameter.nextTree());
				}
				stream_actual_parameter.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actual_parameter_part1"


	public static class actual_parameter_part_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actual_parameter_part"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:416:1: actual_parameter_part : ( ( ->) '(' actual_parameter ( ',' actual_parameter )* ')' ( Identifier ':' '(' actual_parameter ( ',' actual_parameter )* ')' )* -> ^( FUNCTION_CALL $actual_parameter_part ^( LISTPARAMETER ( actual_parameter )* ) ) |);
	public final actual_parameter_part_return actual_parameter_part() throws RecognitionException {
		actual_parameter_part_return retval = new actual_parameter_part_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal233=null;
		Token char_literal235=null;
		Token char_literal237=null;
		Token Identifier238=null;
		Token char_literal239=null;
		Token char_literal240=null;
		Token char_literal242=null;
		Token char_literal244=null;
		ParserRuleReturnScope actual_parameter234 =null;
		ParserRuleReturnScope actual_parameter236 =null;
		ParserRuleReturnScope actual_parameter241 =null;
		ParserRuleReturnScope actual_parameter243 =null;

		CommonTree char_literal233_tree=null;
		CommonTree char_literal235_tree=null;
		CommonTree char_literal237_tree=null;
		CommonTree Identifier238_tree=null;
		CommonTree char_literal239_tree=null;
		CommonTree char_literal240_tree=null;
		CommonTree char_literal242_tree=null;
		CommonTree char_literal244_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_actual_parameter=new RewriteRuleSubtreeStream(adaptor,"rule actual_parameter");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:417:2: ( ( ->) '(' actual_parameter ( ',' actual_parameter )* ')' ( Identifier ':' '(' actual_parameter ( ',' actual_parameter )* ')' )* -> ^( FUNCTION_CALL $actual_parameter_part ^( LISTPARAMETER ( actual_parameter )* ) ) |)
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==58) ) {
				alt55=1;
			}
			else if ( (LA55_0==69||(LA55_0 >= 86 && LA55_0 <= 87)) ) {
				alt55=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:417:5: ( ->) '(' actual_parameter ( ',' actual_parameter )* ')' ( Identifier ':' '(' actual_parameter ( ',' actual_parameter )* ')' )*
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:417:5: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:417:6: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 417:6: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					char_literal233=(Token)match(input,58,FOLLOW_58_in_actual_parameter_part3628);  
					stream_58.add(char_literal233);

					pushFollow(FOLLOW_actual_parameter_in_actual_parameter_part3630);
					actual_parameter234=actual_parameter();
					state._fsp--;

					stream_actual_parameter.add(actual_parameter234.getTree());
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:417:49: ( ',' actual_parameter )*
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==63) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:417:50: ',' actual_parameter
							{
							char_literal235=(Token)match(input,63,FOLLOW_63_in_actual_parameter_part3633);  
							stream_63.add(char_literal235);

							pushFollow(FOLLOW_actual_parameter_in_actual_parameter_part3635);
							actual_parameter236=actual_parameter();
							state._fsp--;

							stream_actual_parameter.add(actual_parameter236.getTree());
							}
							break;

						default :
							break loop52;
						}
					}

					char_literal237=(Token)match(input,59,FOLLOW_59_in_actual_parameter_part3638);  
					stream_59.add(char_literal237);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:417:76: ( Identifier ':' '(' actual_parameter ( ',' actual_parameter )* ')' )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==Identifier) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:417:77: Identifier ':' '(' actual_parameter ( ',' actual_parameter )* ')'
							{
							Identifier238=(Token)match(input,Identifier,FOLLOW_Identifier_in_actual_parameter_part3641);  
							stream_Identifier.add(Identifier238);

							char_literal239=(Token)match(input,67,FOLLOW_67_in_actual_parameter_part3643);  
							stream_67.add(char_literal239);

							char_literal240=(Token)match(input,58,FOLLOW_58_in_actual_parameter_part3645);  
							stream_58.add(char_literal240);

							pushFollow(FOLLOW_actual_parameter_in_actual_parameter_part3647);
							actual_parameter241=actual_parameter();
							state._fsp--;

							stream_actual_parameter.add(actual_parameter241.getTree());
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:417:113: ( ',' actual_parameter )*
							loop53:
							while (true) {
								int alt53=2;
								int LA53_0 = input.LA(1);
								if ( (LA53_0==63) ) {
									alt53=1;
								}

								switch (alt53) {
								case 1 :
									// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:417:114: ',' actual_parameter
									{
									char_literal242=(Token)match(input,63,FOLLOW_63_in_actual_parameter_part3650);  
									stream_63.add(char_literal242);

									pushFollow(FOLLOW_actual_parameter_in_actual_parameter_part3652);
									actual_parameter243=actual_parameter();
									state._fsp--;

									stream_actual_parameter.add(actual_parameter243.getTree());
									}
									break;

								default :
									break loop53;
								}
							}

							char_literal244=(Token)match(input,59,FOLLOW_59_in_actual_parameter_part3656);  
							stream_59.add(char_literal244);

							}
							break;

						default :
							break loop54;
						}
					}

					// AST REWRITE
					// elements: actual_parameter, actual_parameter_part
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 418:3: -> ^( FUNCTION_CALL $actual_parameter_part ^( LISTPARAMETER ( actual_parameter )* ) )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:418:5: ^( FUNCTION_CALL $actual_parameter_part ^( LISTPARAMETER ( actual_parameter )* ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:418:44: ^( LISTPARAMETER ( actual_parameter )* )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTPARAMETER, "LISTPARAMETER"), root_2);
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:418:60: ( actual_parameter )*
						while ( stream_actual_parameter.hasNext() ) {
							adaptor.addChild(root_2, stream_actual_parameter.nextTree());
						}
						stream_actual_parameter.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:421:13: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actual_parameter_part"


	public static class actual_parameter_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actual_parameter"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:423:1: actual_parameter : ( STRING | expression -> expression |);
	public final actual_parameter_return actual_parameter() throws RecognitionException {
		actual_parameter_return retval = new actual_parameter_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STRING245=null;
		ParserRuleReturnScope expression246 =null;

		CommonTree STRING245_tree=null;
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:424:2: ( STRING | expression -> expression |)
			int alt56=3;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt56=1;
				}
				break;
			case Identifier:
			case Number:
			case 58:
			case 62:
			case 64:
			case 88:
			case 91:
			case 101:
			case 105:
				{
				alt56=2;
				}
				break;
			case 59:
			case 63:
				{
				alt56=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:424:5: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING245=(Token)match(input,STRING,FOLLOW_STRING_in_actual_parameter3712); 
					STRING245_tree = (CommonTree)adaptor.create(STRING245);
					adaptor.addChild(root_0, STRING245_tree);

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:425:27: expression
					{
					pushFollow(FOLLOW_expression_in_actual_parameter3740);
					expression246=expression();
					state._fsp--;

					stream_expression.add(expression246.getTree());
					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 425:38: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:427:13: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actual_parameter"


	public static class if_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "if_clause"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:431:1: if_clause : 'if' expression 'then' ;
	public final if_clause_return if_clause() throws RecognitionException {
		if_clause_return retval = new if_clause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal247=null;
		Token string_literal249=null;
		ParserRuleReturnScope expression248 =null;

		CommonTree string_literal247_tree=null;
		CommonTree string_literal249_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:432:24: ( 'if' expression 'then' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:432:27: 'if' expression 'then'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal247=(Token)match(input,91,FOLLOW_91_in_if_clause3805); 
			string_literal247_tree = (CommonTree)adaptor.create(string_literal247);
			adaptor.addChild(root_0, string_literal247_tree);

			pushFollow(FOLLOW_expression_in_if_clause3807);
			expression248=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression248.getTree());

			string_literal249=(Token)match(input,100,FOLLOW_100_in_if_clause3809); 
			string_literal249_tree = (CommonTree)adaptor.create(string_literal249);
			adaptor.addChild(root_0, string_literal249_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_clause"


	public static class for_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "for_list"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:437:1: for_list : for_list_element ( ',' for_list_element )* -> ( ^( FOR_ELEMENT for_list_element ) )+ ;
	public final for_list_return for_list() throws RecognitionException {
		for_list_return retval = new for_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal251=null;
		ParserRuleReturnScope for_list_element250 =null;
		ParserRuleReturnScope for_list_element252 =null;

		CommonTree char_literal251_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_for_list_element=new RewriteRuleSubtreeStream(adaptor,"rule for_list_element");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:438:13: ( for_list_element ( ',' for_list_element )* -> ( ^( FOR_ELEMENT for_list_element ) )+ )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:438:15: for_list_element ( ',' for_list_element )*
			{
			pushFollow(FOLLOW_for_list_element_in_for_list3859);
			for_list_element250=for_list_element();
			state._fsp--;

			stream_for_list_element.add(for_list_element250.getTree());
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:438:32: ( ',' for_list_element )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==63) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:438:33: ',' for_list_element
					{
					char_literal251=(Token)match(input,63,FOLLOW_63_in_for_list3862);  
					stream_63.add(char_literal251);

					pushFollow(FOLLOW_for_list_element_in_for_list3864);
					for_list_element252=for_list_element();
					state._fsp--;

					stream_for_list_element.add(for_list_element252.getTree());
					}
					break;

				default :
					break loop57;
				}
			}

			// AST REWRITE
			// elements: for_list_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 438:56: -> ( ^( FOR_ELEMENT for_list_element ) )+
			{
				if ( !(stream_for_list_element.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_for_list_element.hasNext() ) {
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:438:59: ^( FOR_ELEMENT for_list_element )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_ELEMENT, "FOR_ELEMENT"), root_1);
					adaptor.addChild(root_1, stream_for_list_element.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_for_list_element.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "for_list"


	public static class for_list_element_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "for_list_element"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:441:1: for_list_element : arithmetic_expression for_list_element1 ;
	public final for_list_element_return for_list_element() throws RecognitionException {
		for_list_element_return retval = new for_list_element_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope arithmetic_expression253 =null;
		ParserRuleReturnScope for_list_element1254 =null;


		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:442:2: ( arithmetic_expression for_list_element1 )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:442:4: arithmetic_expression for_list_element1
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_in_for_list_element3897);
			arithmetic_expression253=arithmetic_expression();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression253.getTree());

			pushFollow(FOLLOW_for_list_element1_in_for_list_element3899);
			for_list_element1254=for_list_element1();
			state._fsp--;

			adaptor.addChild(root_0, for_list_element1254.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "for_list_element"


	public static class for_list_element1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "for_list_element1"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:446:1: for_list_element1 : ( 'while' expression -> ^( WHILE expression ) | 'step' d1= arithmetic_expression 'until' d2= arithmetic_expression -> ^( STEP $d1 $d2) |);
	public final for_list_element1_return for_list_element1() throws RecognitionException {
		for_list_element1_return retval = new for_list_element1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal255=null;
		Token string_literal257=null;
		Token string_literal258=null;
		ParserRuleReturnScope d1 =null;
		ParserRuleReturnScope d2 =null;
		ParserRuleReturnScope expression256 =null;

		CommonTree string_literal255_tree=null;
		CommonTree string_literal257_tree=null;
		CommonTree string_literal258_tree=null;
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_arithmetic_expression=new RewriteRuleSubtreeStream(adaptor,"rule arithmetic_expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:447:2: ( 'while' expression -> ^( WHILE expression ) | 'step' d1= arithmetic_expression 'until' d2= arithmetic_expression -> ^( STEP $d1 $d2) |)
			int alt58=3;
			switch ( input.LA(1) ) {
			case 104:
				{
				alt58=1;
				}
				break;
			case 97:
				{
				alt58=2;
				}
				break;
			case 63:
			case 85:
				{
				alt58=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}
			switch (alt58) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:447:16: 'while' expression
					{
					string_literal255=(Token)match(input,104,FOLLOW_104_in_for_list_element13934);  
					stream_104.add(string_literal255);

					pushFollow(FOLLOW_expression_in_for_list_element13936);
					expression256=expression();
					state._fsp--;

					stream_expression.add(expression256.getTree());
					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 447:35: -> ^( WHILE expression )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:447:37: ^( WHILE expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:448:28: 'step' d1= arithmetic_expression 'until' d2= arithmetic_expression
					{
					string_literal257=(Token)match(input,97,FOLLOW_97_in_for_list_element13972);  
					stream_97.add(string_literal257);

					pushFollow(FOLLOW_arithmetic_expression_in_for_list_element13976);
					d1=arithmetic_expression();
					state._fsp--;

					stream_arithmetic_expression.add(d1.getTree());
					string_literal258=(Token)match(input,102,FOLLOW_102_in_for_list_element13978);  
					stream_102.add(string_literal258);

					pushFollow(FOLLOW_arithmetic_expression_in_for_list_element13982);
					d2=arithmetic_expression();
					state._fsp--;

					stream_arithmetic_expression.add(d2.getTree());
					// AST REWRITE
					// elements: d2, d1
					// token labels: 
					// rule labels: d1, d2, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_d1=new RewriteRuleSubtreeStream(adaptor,"rule d1",d1!=null?d1.getTree():null);
					RewriteRuleSubtreeStream stream_d2=new RewriteRuleSubtreeStream(adaptor,"rule d2",d2!=null?d2.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 448:93: -> ^( STEP $d1 $d2)
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:448:95: ^( STEP $d1 $d2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STEP, "STEP"), root_1);
						adaptor.addChild(root_1, stream_d1.nextTree());
						adaptor.addChild(root_1, stream_d2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:450:13: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "for_list_element1"


	public static class arithmetic_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:453:1: arithmetic_expression : ( simple_arithmetic_expression -> simple_arithmetic_expression | 'if' expression 'then' simple_arithmetic_expression 'else' arithmetic_expression -> ^( IF expression ^( THEN simple_arithmetic_expression ) ^( ELSE arithmetic_expression ) ) );
	public final arithmetic_expression_return arithmetic_expression() throws RecognitionException {
		arithmetic_expression_return retval = new arithmetic_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal260=null;
		Token string_literal262=null;
		Token string_literal264=null;
		ParserRuleReturnScope simple_arithmetic_expression259 =null;
		ParserRuleReturnScope expression261 =null;
		ParserRuleReturnScope simple_arithmetic_expression263 =null;
		ParserRuleReturnScope arithmetic_expression265 =null;

		CommonTree string_literal260_tree=null;
		CommonTree string_literal262_tree=null;
		CommonTree string_literal264_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_simple_arithmetic_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_arithmetic_expression");
		RewriteRuleSubtreeStream stream_arithmetic_expression=new RewriteRuleSubtreeStream(adaptor,"rule arithmetic_expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:454:2: ( simple_arithmetic_expression -> simple_arithmetic_expression | 'if' expression 'then' simple_arithmetic_expression 'else' arithmetic_expression -> ^( IF expression ^( THEN simple_arithmetic_expression ) ^( ELSE arithmetic_expression ) ) )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==Identifier||LA59_0==Number||LA59_0==58||LA59_0==62||LA59_0==64) ) {
				alt59=1;
			}
			else if ( (LA59_0==91) ) {
				alt59=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:454:4: simple_arithmetic_expression
					{
					pushFollow(FOLLOW_simple_arithmetic_expression_in_arithmetic_expression4032);
					simple_arithmetic_expression259=simple_arithmetic_expression();
					state._fsp--;

					stream_simple_arithmetic_expression.add(simple_arithmetic_expression259.getTree());
					// AST REWRITE
					// elements: simple_arithmetic_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 454:33: -> simple_arithmetic_expression
					{
						adaptor.addChild(root_0, stream_simple_arithmetic_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:455:27: 'if' expression 'then' simple_arithmetic_expression 'else' arithmetic_expression
					{
					string_literal260=(Token)match(input,91,FOLLOW_91_in_arithmetic_expression4064);  
					stream_91.add(string_literal260);

					pushFollow(FOLLOW_expression_in_arithmetic_expression4066);
					expression261=expression();
					state._fsp--;

					stream_expression.add(expression261.getTree());
					string_literal262=(Token)match(input,100,FOLLOW_100_in_arithmetic_expression4068);  
					stream_100.add(string_literal262);

					pushFollow(FOLLOW_simple_arithmetic_expression_in_arithmetic_expression4070);
					simple_arithmetic_expression263=simple_arithmetic_expression();
					state._fsp--;

					stream_simple_arithmetic_expression.add(simple_arithmetic_expression263.getTree());
					string_literal264=(Token)match(input,86,FOLLOW_86_in_arithmetic_expression4072);  
					stream_86.add(string_literal264);

					pushFollow(FOLLOW_arithmetic_expression_in_arithmetic_expression4074);
					arithmetic_expression265=arithmetic_expression();
					state._fsp--;

					stream_arithmetic_expression.add(arithmetic_expression265.getTree());
					// AST REWRITE
					// elements: arithmetic_expression, simple_arithmetic_expression, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 455:108: -> ^( IF expression ^( THEN simple_arithmetic_expression ) ^( ELSE arithmetic_expression ) )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:455:110: ^( IF expression ^( THEN simple_arithmetic_expression ) ^( ELSE arithmetic_expression ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:455:126: ^( THEN simple_arithmetic_expression )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_2);
						adaptor.addChild(root_2, stream_simple_arithmetic_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:455:163: ^( ELSE arithmetic_expression )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);
						adaptor.addChild(root_2, stream_arithmetic_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:459:1: expression : ( simple_boolean -> simple_boolean | 'if' expression 'then' simple_boolean 'else' expression -> ^( IF expression ^( THEN simple_boolean ) ^( ELSE expression ) ) );
	public final expression_return expression() throws RecognitionException {
		expression_return retval = new expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal267=null;
		Token string_literal269=null;
		Token string_literal271=null;
		ParserRuleReturnScope simple_boolean266 =null;
		ParserRuleReturnScope expression268 =null;
		ParserRuleReturnScope simple_boolean270 =null;
		ParserRuleReturnScope expression272 =null;

		CommonTree string_literal267_tree=null;
		CommonTree string_literal269_tree=null;
		CommonTree string_literal271_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_simple_boolean=new RewriteRuleSubtreeStream(adaptor,"rule simple_boolean");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:460:13: ( simple_boolean -> simple_boolean | 'if' expression 'then' simple_boolean 'else' expression -> ^( IF expression ^( THEN simple_boolean ) ^( ELSE expression ) ) )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==Identifier||LA60_0==Number||LA60_0==58||LA60_0==62||LA60_0==64||LA60_0==88||LA60_0==101||LA60_0==105) ) {
				alt60=1;
			}
			else if ( (LA60_0==91) ) {
				alt60=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:460:15: simple_boolean
					{
					pushFollow(FOLLOW_simple_boolean_in_expression4128);
					simple_boolean266=simple_boolean();
					state._fsp--;

					stream_simple_boolean.add(simple_boolean266.getTree());
					// AST REWRITE
					// elements: simple_boolean
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 460:30: -> simple_boolean
					{
						adaptor.addChild(root_0, stream_simple_boolean.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:461:26: 'if' expression 'then' simple_boolean 'else' expression
					{
					string_literal267=(Token)match(input,91,FOLLOW_91_in_expression4159);  
					stream_91.add(string_literal267);

					pushFollow(FOLLOW_expression_in_expression4161);
					expression268=expression();
					state._fsp--;

					stream_expression.add(expression268.getTree());
					string_literal269=(Token)match(input,100,FOLLOW_100_in_expression4163);  
					stream_100.add(string_literal269);

					pushFollow(FOLLOW_simple_boolean_in_expression4165);
					simple_boolean270=simple_boolean();
					state._fsp--;

					stream_simple_boolean.add(simple_boolean270.getTree());
					string_literal271=(Token)match(input,86,FOLLOW_86_in_expression4167);  
					stream_86.add(string_literal271);

					pushFollow(FOLLOW_expression_in_expression4169);
					expression272=expression();
					state._fsp--;

					stream_expression.add(expression272.getTree());
					// AST REWRITE
					// elements: simple_boolean, expression, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 461:82: -> ^( IF expression ^( THEN simple_boolean ) ^( ELSE expression ) )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:461:84: ^( IF expression ^( THEN simple_boolean ) ^( ELSE expression ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:461:100: ^( THEN simple_boolean )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_2);
						adaptor.addChild(root_2, stream_simple_boolean.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:461:123: ^( ELSE expression )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class simple_boolean_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_boolean"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:465:1: simple_boolean : implication ( '<=>' ^ implication )* ;
	public final simple_boolean_return simple_boolean() throws RecognitionException {
		simple_boolean_return retval = new simple_boolean_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal274=null;
		ParserRuleReturnScope implication273 =null;
		ParserRuleReturnScope implication275 =null;

		CommonTree string_literal274_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:466:2: ( implication ( '<=>' ^ implication )* )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:466:4: implication ( '<=>' ^ implication )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_implication_in_simple_boolean4211);
			implication273=implication();
			state._fsp--;

			adaptor.addChild(root_0, implication273.getTree());

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:466:16: ( '<=>' ^ implication )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==72) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:466:17: '<=>' ^ implication
					{
					string_literal274=(Token)match(input,72,FOLLOW_72_in_simple_boolean4214); 
					string_literal274_tree = (CommonTree)adaptor.create(string_literal274);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal274_tree, root_0);

					pushFollow(FOLLOW_implication_in_simple_boolean4217);
					implication275=implication();
					state._fsp--;

					adaptor.addChild(root_0, implication275.getTree());

					}
					break;

				default :
					break loop61;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_boolean"


	public static class implication_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "implication"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:469:1: implication : boolean_term ( '=>' ^ boolean_term )* ;
	public final implication_return implication() throws RecognitionException {
		implication_return retval = new implication_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal277=null;
		ParserRuleReturnScope boolean_term276 =null;
		ParserRuleReturnScope boolean_term278 =null;

		CommonTree string_literal277_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:470:2: ( boolean_term ( '=>' ^ boolean_term )* )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:470:4: boolean_term ( '=>' ^ boolean_term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_term_in_implication4242);
			boolean_term276=boolean_term();
			state._fsp--;

			adaptor.addChild(root_0, boolean_term276.getTree());

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:470:17: ( '=>' ^ boolean_term )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==75) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:470:18: '=>' ^ boolean_term
					{
					string_literal277=(Token)match(input,75,FOLLOW_75_in_implication4245); 
					string_literal277_tree = (CommonTree)adaptor.create(string_literal277);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal277_tree, root_0);

					pushFollow(FOLLOW_boolean_term_in_implication4248);
					boolean_term278=boolean_term();
					state._fsp--;

					adaptor.addChild(root_0, boolean_term278.getTree());

					}
					break;

				default :
					break loop62;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "implication"


	public static class boolean_term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_term"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:473:1: boolean_term : boolean_factor ( 'OR' ^ boolean_factor )* ;
	public final boolean_term_return boolean_term() throws RecognitionException {
		boolean_term_return retval = new boolean_term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal280=null;
		ParserRuleReturnScope boolean_factor279 =null;
		ParserRuleReturnScope boolean_factor281 =null;

		CommonTree string_literal280_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:474:2: ( boolean_factor ( 'OR' ^ boolean_factor )* )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:474:4: boolean_factor ( 'OR' ^ boolean_factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_factor_in_boolean_term4273);
			boolean_factor279=boolean_factor();
			state._fsp--;

			adaptor.addChild(root_0, boolean_factor279.getTree());

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:474:19: ( 'OR' ^ boolean_factor )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==79) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:474:20: 'OR' ^ boolean_factor
					{
					string_literal280=(Token)match(input,79,FOLLOW_79_in_boolean_term4276); 
					string_literal280_tree = (CommonTree)adaptor.create(string_literal280);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal280_tree, root_0);

					pushFollow(FOLLOW_boolean_factor_in_boolean_term4279);
					boolean_factor281=boolean_factor();
					state._fsp--;

					adaptor.addChild(root_0, boolean_factor281.getTree());

					}
					break;

				default :
					break loop63;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolean_term"


	public static class boolean_factor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_factor"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:477:1: boolean_factor : boolean_secondary ( 'AND' ^ boolean_secondary )* ;
	public final boolean_factor_return boolean_factor() throws RecognitionException {
		boolean_factor_return retval = new boolean_factor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal283=null;
		ParserRuleReturnScope boolean_secondary282 =null;
		ParserRuleReturnScope boolean_secondary284 =null;

		CommonTree string_literal283_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:478:2: ( boolean_secondary ( 'AND' ^ boolean_secondary )* )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:478:4: boolean_secondary ( 'AND' ^ boolean_secondary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_secondary_in_boolean_factor4304);
			boolean_secondary282=boolean_secondary();
			state._fsp--;

			adaptor.addChild(root_0, boolean_secondary282.getTree());

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:478:22: ( 'AND' ^ boolean_secondary )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==78) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:478:23: 'AND' ^ boolean_secondary
					{
					string_literal283=(Token)match(input,78,FOLLOW_78_in_boolean_factor4307); 
					string_literal283_tree = (CommonTree)adaptor.create(string_literal283);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal283_tree, root_0);

					pushFollow(FOLLOW_boolean_secondary_in_boolean_factor4310);
					boolean_secondary284=boolean_secondary();
					state._fsp--;

					adaptor.addChild(root_0, boolean_secondary284.getTree());

					}
					break;

				default :
					break loop64;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolean_factor"


	public static class boolean_secondary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_secondary"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:482:1: boolean_secondary : ( boolean_primary | '~' ^ boolean_primary );
	public final boolean_secondary_return boolean_secondary() throws RecognitionException {
		boolean_secondary_return retval = new boolean_secondary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal286=null;
		ParserRuleReturnScope boolean_primary285 =null;
		ParserRuleReturnScope boolean_primary287 =null;

		CommonTree char_literal286_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:483:2: ( boolean_primary | '~' ^ boolean_primary )
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==Identifier||LA65_0==Number||LA65_0==58||LA65_0==62||LA65_0==64||LA65_0==88||LA65_0==101) ) {
				alt65=1;
			}
			else if ( (LA65_0==105) ) {
				alt65=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:483:15: boolean_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_boolean_primary_in_boolean_secondary4347);
					boolean_primary285=boolean_primary();
					state._fsp--;

					adaptor.addChild(root_0, boolean_primary285.getTree());

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:484:15: '~' ^ boolean_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal286=(Token)match(input,105,FOLLOW_105_in_boolean_secondary4363); 
					char_literal286_tree = (CommonTree)adaptor.create(char_literal286);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal286_tree, root_0);

					pushFollow(FOLLOW_boolean_primary_in_boolean_secondary4366);
					boolean_primary287=boolean_primary();
					state._fsp--;

					adaptor.addChild(root_0, boolean_primary287.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolean_secondary"


	public static class boolean_primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_primary"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:487:1: boolean_primary : ( ( 'true' | 'false' ) | relation );
	public final boolean_primary_return boolean_primary() throws RecognitionException {
		boolean_primary_return retval = new boolean_primary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set288=null;
		ParserRuleReturnScope relation289 =null;

		CommonTree set288_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:488:2: ( ( 'true' | 'false' ) | relation )
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==88||LA66_0==101) ) {
				alt66=1;
			}
			else if ( (LA66_0==Identifier||LA66_0==Number||LA66_0==58||LA66_0==62||LA66_0==64) ) {
				alt66=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:488:16: ( 'true' | 'false' )
					{
					root_0 = (CommonTree)adaptor.nil();


					set288=input.LT(1);
					if ( input.LA(1)==88||input.LA(1)==101 ) {
						input.consume();
						adaptor.addChild(root_0, (CommonTree)adaptor.create(set288));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:489:28: relation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_relation_in_boolean_primary4430);
					relation289=relation();
					state._fsp--;

					adaptor.addChild(root_0, relation289.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolean_primary"


	public static class relation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relation"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:493:1: relation : simple_arithmetic_expression ( ( '<' | '<=' | '=' | '<>' | '>' | '>=' ) ^ simple_arithmetic_expression )? ;
	public final relation_return relation() throws RecognitionException {
		relation_return retval = new relation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set291=null;
		ParserRuleReturnScope simple_arithmetic_expression290 =null;
		ParserRuleReturnScope simple_arithmetic_expression292 =null;

		CommonTree set291_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:495:13: ( simple_arithmetic_expression ( ( '<' | '<=' | '=' | '<>' | '>' | '>=' ) ^ simple_arithmetic_expression )? )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:495:27: simple_arithmetic_expression ( ( '<' | '<=' | '=' | '<>' | '>' | '>=' ) ^ simple_arithmetic_expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simple_arithmetic_expression_in_relation4491);
			simple_arithmetic_expression290=simple_arithmetic_expression();
			state._fsp--;

			adaptor.addChild(root_0, simple_arithmetic_expression290.getTree());

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:495:56: ( ( '<' | '<=' | '=' | '<>' | '>' | '>=' ) ^ simple_arithmetic_expression )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( ((LA67_0 >= 70 && LA67_0 <= 71)||(LA67_0 >= 73 && LA67_0 <= 74)||(LA67_0 >= 76 && LA67_0 <= 77)) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:495:57: ( '<' | '<=' | '=' | '<>' | '>' | '>=' ) ^ simple_arithmetic_expression
					{
					set291=input.LT(1);
					set291=input.LT(1);
					if ( (input.LA(1) >= 70 && input.LA(1) <= 71)||(input.LA(1) >= 73 && input.LA(1) <= 74)||(input.LA(1) >= 76 && input.LA(1) <= 77) ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set291), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_simple_arithmetic_expression_in_relation4519);
					simple_arithmetic_expression292=simple_arithmetic_expression();
					state._fsp--;

					adaptor.addChild(root_0, simple_arithmetic_expression292.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relation"


	public static class simple_arithmetic_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_arithmetic_expression"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:498:1: simple_arithmetic_expression : ( term ( ( '+' | '-' ) ^ term )* | ( ( '+' | '-' ) ^ term )+ );
	public final simple_arithmetic_expression_return simple_arithmetic_expression() throws RecognitionException {
		simple_arithmetic_expression_return retval = new simple_arithmetic_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set294=null;
		Token set296=null;
		ParserRuleReturnScope term293 =null;
		ParserRuleReturnScope term295 =null;
		ParserRuleReturnScope term297 =null;

		CommonTree set294_tree=null;
		CommonTree set296_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:499:13: ( term ( ( '+' | '-' ) ^ term )* | ( ( '+' | '-' ) ^ term )+ )
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==Identifier||LA70_0==Number||LA70_0==58) ) {
				alt70=1;
			}
			else if ( (LA70_0==62||LA70_0==64) ) {
				alt70=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}

			switch (alt70) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:499:26: term ( ( '+' | '-' ) ^ term )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_term_in_simple_arithmetic_expression4577);
					term293=term();
					state._fsp--;

					adaptor.addChild(root_0, term293.getTree());

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:499:31: ( ( '+' | '-' ) ^ term )*
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==62||LA68_0==64) ) {
							alt68=1;
						}

						switch (alt68) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:499:32: ( '+' | '-' ) ^ term
							{
							set294=input.LT(1);
							set294=input.LT(1);
							if ( input.LA(1)==62||input.LA(1)==64 ) {
								input.consume();
								root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set294), root_0);
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							pushFollow(FOLLOW_term_in_simple_arithmetic_expression4587);
							term295=term();
							state._fsp--;

							adaptor.addChild(root_0, term295.getTree());

							}
							break;

						default :
							break loop68;
						}
					}

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:500:26: ( ( '+' | '-' ) ^ term )+
					{
					root_0 = (CommonTree)adaptor.nil();


					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:500:26: ( ( '+' | '-' ) ^ term )+
					int cnt69=0;
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==62||LA69_0==64) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:500:27: ( '+' | '-' ) ^ term
							{
							set296=input.LT(1);
							set296=input.LT(1);
							if ( input.LA(1)==62||input.LA(1)==64 ) {
								input.consume();
								root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set296), root_0);
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							pushFollow(FOLLOW_term_in_simple_arithmetic_expression4624);
							term297=term();
							state._fsp--;

							adaptor.addChild(root_0, term297.getTree());

							}
							break;

						default :
							if ( cnt69 >= 1 ) break loop69;
							EarlyExitException eee = new EarlyExitException(69, input);
							throw eee;
						}
						cnt69++;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_arithmetic_expression"


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:504:1: term : factor ( ( '*' | '//' | '/' ) ^ factor )* ;
	public final term_return term() throws RecognitionException {
		term_return retval = new term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set299=null;
		ParserRuleReturnScope factor298 =null;
		ParserRuleReturnScope factor300 =null;

		CommonTree set299_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:504:7: ( factor ( ( '*' | '//' | '/' ) ^ factor )* )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:504:9: factor ( ( '*' | '//' | '/' ) ^ factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term4650);
			factor298=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor298.getTree());

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:504:16: ( ( '*' | '//' | '/' ) ^ factor )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==60||(LA71_0 >= 65 && LA71_0 <= 66)) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:504:17: ( '*' | '//' | '/' ) ^ factor
					{
					set299=input.LT(1);
					set299=input.LT(1);
					if ( input.LA(1)==60||(input.LA(1) >= 65 && input.LA(1) <= 66) ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set299), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_term4662);
					factor300=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor300.getTree());

					}
					break;

				default :
					break loop71;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class factor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:508:1: factor : primary ( '**' ^ primary )* ;
	public final factor_return factor() throws RecognitionException {
		factor_return retval = new factor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal302=null;
		ParserRuleReturnScope primary301 =null;
		ParserRuleReturnScope primary303 =null;

		CommonTree string_literal302_tree=null;

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:508:8: ( primary ( '**' ^ primary )* )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:508:10: primary ( '**' ^ primary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_primary_in_factor4686);
			primary301=primary();
			state._fsp--;

			adaptor.addChild(root_0, primary301.getTree());

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:508:18: ( '**' ^ primary )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==61) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:508:19: '**' ^ primary
					{
					string_literal302=(Token)match(input,61,FOLLOW_61_in_factor4689); 
					string_literal302_tree = (CommonTree)adaptor.create(string_literal302);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal302_tree, root_0);

					pushFollow(FOLLOW_primary_in_factor4692);
					primary303=primary();
					state._fsp--;

					adaptor.addChild(root_0, primary303.getTree());

					}
					break;

				default :
					break loop72;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:511:1: primary : ( Identifier ( -> Identifier ) primary_with_identifier -> primary_with_identifier | Number -> Number | '(' expression ')' -> expression );
	public final primary_return primary() throws RecognitionException {
		primary_return retval = new primary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier304=null;
		Token Number306=null;
		Token char_literal307=null;
		Token char_literal309=null;
		ParserRuleReturnScope primary_with_identifier305 =null;
		ParserRuleReturnScope expression308 =null;

		CommonTree Identifier304_tree=null;
		CommonTree Number306_tree=null;
		CommonTree char_literal307_tree=null;
		CommonTree char_literal309_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_primary_with_identifier=new RewriteRuleSubtreeStream(adaptor,"rule primary_with_identifier");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:511:9: ( Identifier ( -> Identifier ) primary_with_identifier -> primary_with_identifier | Number -> Number | '(' expression ')' -> expression )
			int alt73=3;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt73=1;
				}
				break;
			case Number:
				{
				alt73=2;
				}
				break;
			case 58:
				{
				alt73=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:511:12: Identifier ( -> Identifier ) primary_with_identifier
					{
					Identifier304=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary4717);  
					stream_Identifier.add(Identifier304);

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:511:23: ( -> Identifier )
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:511:24: 
					{
					// AST REWRITE
					// elements: Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 511:24: -> Identifier
					{
						adaptor.addChild(root_0, stream_Identifier.nextNode());
					}


					retval.tree = root_0;

					}

					Identifiermemory=retval.tree;
					pushFollow(FOLLOW_primary_with_identifier_in_primary4726);
					primary_with_identifier305=primary_with_identifier();
					state._fsp--;

					stream_primary_with_identifier.add(primary_with_identifier305.getTree());
					// AST REWRITE
					// elements: primary_with_identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 511:96: -> primary_with_identifier
					{
						adaptor.addChild(root_0, stream_primary_with_identifier.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:512:5: Number
					{
					Number306=(Token)match(input,Number,FOLLOW_Number_in_primary4736);  
					stream_Number.add(Number306);

					// AST REWRITE
					// elements: Number
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 512:12: -> Number
					{
						adaptor.addChild(root_0, stream_Number.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:513:28: '(' expression ')'
					{
					char_literal307=(Token)match(input,58,FOLLOW_58_in_primary4769);  
					stream_58.add(char_literal307);

					pushFollow(FOLLOW_expression_in_primary4771);
					expression308=expression();
					state._fsp--;

					stream_expression.add(expression308.getTree());
					char_literal309=(Token)match(input,59,FOLLOW_59_in_primary4773);  
					stream_59.add(char_literal309);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 513:47: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class primary_with_identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primary_with_identifier"
	// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:519:1: primary_with_identifier : ( ( ->) actual_parameter_part1 -> actual_parameter_part1 | ( ->) | ( ->) '[' arithmetic_expression ( ',' arithmetic_expression )* ']' -> ^( ARRAY_ACCESS $primary_with_identifier ^( INDEX ( arithmetic_expression )+ ) ) );
	public final primary_with_identifier_return primary_with_identifier() throws RecognitionException {
		primary_with_identifier_return retval = new primary_with_identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal311=null;
		Token char_literal313=null;
		Token char_literal315=null;
		ParserRuleReturnScope actual_parameter_part1310 =null;
		ParserRuleReturnScope arithmetic_expression312 =null;
		ParserRuleReturnScope arithmetic_expression314 =null;

		CommonTree char_literal311_tree=null;
		CommonTree char_literal313_tree=null;
		CommonTree char_literal315_tree=null;
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_actual_parameter_part1=new RewriteRuleSubtreeStream(adaptor,"rule actual_parameter_part1");
		RewriteRuleSubtreeStream stream_arithmetic_expression=new RewriteRuleSubtreeStream(adaptor,"rule arithmetic_expression");

		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:520:2: ( ( ->) actual_parameter_part1 -> actual_parameter_part1 | ( ->) | ( ->) '[' arithmetic_expression ( ',' arithmetic_expression )* ']' -> ^( ARRAY_ACCESS $primary_with_identifier ^( INDEX ( arithmetic_expression )+ ) ) )
			int alt75=3;
			switch ( input.LA(1) ) {
			case 58:
				{
				alt75=1;
				}
				break;
			case 59:
			case 60:
			case 61:
			case 62:
			case 63:
			case 64:
			case 65:
			case 66:
			case 67:
			case 68:
			case 69:
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
			case 81:
			case 85:
			case 86:
			case 87:
			case 97:
			case 100:
			case 102:
			case 104:
				{
				alt75=2;
				}
				break;
			case 80:
				{
				alt75=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}
			switch (alt75) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:520:7: ( ->) actual_parameter_part1
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:520:7: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:520:8: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 520:8: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					pushFollow(FOLLOW_actual_parameter_part1_in_primary_with_identifier4821);
					actual_parameter_part1310=actual_parameter_part1();
					state._fsp--;

					stream_actual_parameter_part1.add(actual_parameter_part1310.getTree());
					// AST REWRITE
					// elements: actual_parameter_part1
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 520:52: -> actual_parameter_part1
					{
						adaptor.addChild(root_0, stream_actual_parameter_part1.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:521:8: ( ->)
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:521:8: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:521:9: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 521:9: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:522:8: ( ->) '[' arithmetic_expression ( ',' arithmetic_expression )* ']'
					{
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:522:8: ( ->)
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:522:9: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 522:9: ->
					{
						adaptor.addChild(root_0, Identifiermemory);
					}


					retval.tree = root_0;

					}

					char_literal311=(Token)match(input,80,FOLLOW_80_in_primary_with_identifier4850);  
					stream_80.add(char_literal311);

					pushFollow(FOLLOW_arithmetic_expression_in_primary_with_identifier4852);
					arithmetic_expression312=arithmetic_expression();
					state._fsp--;

					stream_arithmetic_expression.add(arithmetic_expression312.getTree());
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:522:57: ( ',' arithmetic_expression )*
					loop74:
					while (true) {
						int alt74=2;
						int LA74_0 = input.LA(1);
						if ( (LA74_0==63) ) {
							alt74=1;
						}

						switch (alt74) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:522:58: ',' arithmetic_expression
							{
							char_literal313=(Token)match(input,63,FOLLOW_63_in_primary_with_identifier4855);  
							stream_63.add(char_literal313);

							pushFollow(FOLLOW_arithmetic_expression_in_primary_with_identifier4857);
							arithmetic_expression314=arithmetic_expression();
							state._fsp--;

							stream_arithmetic_expression.add(arithmetic_expression314.getTree());
							}
							break;

						default :
							break loop74;
						}
					}

					char_literal315=(Token)match(input,81,FOLLOW_81_in_primary_with_identifier4861);  
					stream_81.add(char_literal315);

					// AST REWRITE
					// elements: arithmetic_expression, primary_with_identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 522:90: -> ^( ARRAY_ACCESS $primary_with_identifier ^( INDEX ( arithmetic_expression )+ ) )
					{
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:522:92: ^( ARRAY_ACCESS $primary_with_identifier ^( INDEX ( arithmetic_expression )+ ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_ACCESS, "ARRAY_ACCESS"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:522:133: ^( INDEX ( arithmetic_expression )+ )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX, "INDEX"), root_2);
						if ( !(stream_arithmetic_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_arithmetic_expression.hasNext() ) {
							adaptor.addChild(root_2, stream_arithmetic_expression.nextTree());
						}
						stream_arithmetic_expression.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary_with_identifier"

	// Delegated rules



	public static final BitSet FOLLOW_start_program_in_program225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rest_program_in_start_program270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_start_program286 = new BitSet(new long[]{0x0000004020000000L,0x00000009DE9C0020L});
	public static final BitSet FOLLOW_declaration_in_start_program289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_start_program291 = new BitSet(new long[]{0x0000004020000000L,0x00000009DE9C0020L});
	public static final BitSet FOLLOW_compound_tail_in_start_program295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_rest_program344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_rest_program346 = new BitSet(new long[]{0x0000004020000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_start_program_in_rest_program349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_compound_tail449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800020L});
	public static final BitSet FOLLOW_69_in_compound_tail452 = new BitSet(new long[]{0x0000004020000000L,0x000000000E880020L});
	public static final BitSet FOLLOW_statement_in_compound_tail454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800020L});
	public static final BitSet FOLLOW_87_in_compound_tail458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_declaration485 = new BitSet(new long[]{0x0000000000000000L,0x0000000110140000L});
	public static final BitSet FOLLOW_own_declaration_1_in_declaration488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switch_declaration_in_declaration524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration559 = new BitSet(new long[]{0x0000000020000000L,0x0000000080040000L});
	public static final BitSet FOLLOW_declarationtypenoown_in_declaration561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_declaration599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_declaration_in_declaration634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_declaration_in_declarationtypenoown671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_declarationtypenoown690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_declarationtypenoown710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_own_declaration_1733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_own_declaration_1758 = new BitSet(new long[]{0x0000000020000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_own_typed_in_own_declaration_1760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_own_typed774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_own_typed786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_type_declaration813 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_type_declaration816 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_type_declaration818 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_82_in_array_declaration838 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_array_list_in_array_declaration840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_segment_in_array_list857 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_array_list860 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_array_segment_in_array_list862 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_array_segment884 = new BitSet(new long[]{0x8000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_63_in_array_segment888 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_array_segment890 = new BitSet(new long[]{0x8000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_array_segment894 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_bound_pair_list_in_array_segment896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_array_segment898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bound_pair_in_bound_pair_list952 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_bound_pair_list955 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_bound_pair_in_bound_pair_list957 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_lower_bound_in_bound_pair976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_bound_pair978 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_upper_bound_in_bound_pair980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_switch_declaration1014 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_switch_declaration1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_switch_declaration1019 = new BitSet(new long[]{0x0400004020000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_switch_list_in_switch_declaration1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designational_expression_in_switch_list1041 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_switch_list1044 = new BitSet(new long[]{0x0400004020000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_designational_expression_in_switch_list1046 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_94_in_local_or_own_type1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_upper_bound1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_lower_bound1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_procedure_declaration1200 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration1202 = new BitSet(new long[]{0x0000004020000000L,0x000000000E080000L});
	public static final BitSet FOLLOW_statement_in_procedure_declaration1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_procedure_heading1224 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_formal_parameter_part_in_procedure_heading1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_procedure_heading1228 = new BitSet(new long[]{0x0000000000000000L,0x0000008DB0140000L});
	public static final BitSet FOLLOW_value_part_in_procedure_heading1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000DB0140000L});
	public static final BitSet FOLLOW_specification_part_in_procedure_heading1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_formal_parameter_part1261 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_formal_parameter_list_in_formal_parameter_part1263 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_formal_parameter_part1266 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Identifier_in_formal_parameter_part1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_formal_parameter_part1271 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_formal_parameter_part1273 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_formal_parameter_list_in_formal_parameter_part1275 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_formal_parameter_part1277 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Identifier_in_formal_parameter_list1308 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_formal_parameter_list1311 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_formal_parameter_list1313 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_103_in_value_part1334 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_value_part1336 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_63_in_value_part1339 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_value_part1341 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_value_part1345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specification_part1_in_specification_part1379 = new BitSet(new long[]{0x0000000000000002L,0x0000000DB0140000L});
	public static final BitSet FOLLOW_specifier_in_specification_part11423 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_specification_part11426 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_63_in_specification_part11429 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_specification_part11431 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_specification_part11436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifier_list1476 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_identifier_list1479 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_identifier_list1481 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_98_in_specifier1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_specifier1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000080040000L});
	public static final BitSet FOLLOW_type_1_in_specifier1512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_specifier1539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_specifier1566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_specifier1593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_specifier1620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_type_11643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_type_11648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_memory_in_statement1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_go_to_statement_in_statement1724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_statement1764 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_statement1766 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_statement1768 = new BitSet(new long[]{0x0000000020000000L,0x0000000006480000L});
	public static final BitSet FOLLOW_conditional_statement_in_statement1770 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_statement1783 = new BitSet(new long[]{0x0000004020000000L,0x000000000E080000L});
	public static final BitSet FOLLOW_statement_in_statement1785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_statement1824 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_statement1826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
	public static final BitSet FOLLOW_iterator_in_statement1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_statement1837 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_for_list_in_statement1839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_statement1841 = new BitSet(new long[]{0x0000004020000000L,0x000000000E080000L});
	public static final BitSet FOLLOW_statement2_in_statement1845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_statement1884 = new BitSet(new long[]{0x0000004020000000L,0x00000009DE9C0020L});
	public static final BitSet FOLLOW_declaration_in_statement1888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_statement1890 = new BitSet(new long[]{0x0000004020000000L,0x00000009DE9C0020L});
	public static final BitSet FOLLOW_compound_tail_in_statement1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statement21926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement_memory1950 = new BitSet(new long[]{0x0400000000000000L,0x0000000000010018L});
	public static final BitSet FOLLOW_statement_with_identifier_in_statement_memory1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_statement_memory1967 = new BitSet(new long[]{0x0400000000000000L,0x0000000000010018L});
	public static final BitSet FOLLOW_statement_with_identifier_in_statement_memory1975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actual_parameter_part_in_statement_with_identifier2010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_statement_with_identifier2029 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_statement_with_identifier2031 = new BitSet(new long[]{0x8000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_63_in_statement_with_identifier2034 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_statement_with_identifier2036 = new BitSet(new long[]{0x8000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_statement_with_identifier2040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_statement_with_identifier2043 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_statement_with_identifier2046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_statement_with_identifier2084 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_statement_with_identifier2086 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_67_in_statement_with_identifier2118 = new BitSet(new long[]{0x0400004020000000L,0x000000000E080000L});
	public static final BitSet FOLLOW_statement_with_label_in_statement_with_identifier2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_labeled_statements_in_statement_with_label2144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_go_to_statement_in_statement_with_label2176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_statement_with_label2208 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_statement_with_label2210 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_statement_with_label2212 = new BitSet(new long[]{0x0000000020000000L,0x0000000006480000L});
	public static final BitSet FOLLOW_conditional_statement_in_statement_with_label2214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_statement_with_label2226 = new BitSet(new long[]{0x0000004020000000L,0x000000000E080000L});
	public static final BitSet FOLLOW_statement_in_statement_with_label2228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_statement_with_label2268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_statement_with_label2474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actual_parameter_part1_in_statement_with_label2518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_for_statement2583 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_for_statement2585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
	public static final BitSet FOLLOW_iterator_in_for_statement2594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_for_statement2596 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_for_list_in_for_statement2598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_for_statement2600 = new BitSet(new long[]{0x0000004020000000L,0x000000000E080000L});
	public static final BitSet FOLLOW_statement_in_for_statement2602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_begin2635 = new BitSet(new long[]{0x0000004020000000L,0x00000009DE9C0020L});
	public static final BitSet FOLLOW_declaration_in_begin2639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_begin2641 = new BitSet(new long[]{0x0000004020000000L,0x00000009DE9C0020L});
	public static final BitSet FOLLOW_compound_tail_in_begin2645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_label_labeled_statements2680 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_labeled_statements_in_label_labeled_statements2689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_label_labeled_statements2707 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_labeled_statements_in_label_labeled_statements2716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_labeled_statements2737 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_labeled_statements2739 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_actual_parameter_part_in_labeled_statements2763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_labeled_statements2774 = new BitSet(new long[]{0x0400004020000000L,0x000000000E080000L});
	public static final BitSet FOLLOW_statement_with_label_in_labeled_statements2776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_conditional_statement_with_label2802 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_expression_with_identifier_in_conditional_statement_with_label2812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_go_to_statement_in_conditional_statement_with_label2832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_conditional_statement_with_label2860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_conditional_statement_with_label2878 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_conditional_statement_with_label2880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
	public static final BitSet FOLLOW_iterator_in_conditional_statement_with_label2889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conditional_statement_with_label2891 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_for_list_in_conditional_statement_with_label2893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_conditional_statement_with_label2895 = new BitSet(new long[]{0x0000004020000000L,0x000000000E080000L});
	public static final BitSet FOLLOW_statement_in_conditional_statement_with_label2897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_iterator2950 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_iterator2952 = new BitSet(new long[]{0x8000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_63_in_iterator2955 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_iterator2957 = new BitSet(new long[]{0x8000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_iterator2961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_conditional_statement3002 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_conditional_statement3004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
	public static final BitSet FOLLOW_iterator_in_conditional_statement3014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conditional_statement3016 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_for_list_in_conditional_statement3018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_conditional_statement3020 = new BitSet(new long[]{0x0000004020000000L,0x000000000E080000L});
	public static final BitSet FOLLOW_statement_in_conditional_statement3022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_conditional_statement3049 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_conditional_statement_with_id_in_conditional_statement3058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_go_to_statement_in_conditional_statement3074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_conditional_statement3087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_with_identifier_in_conditional_statement_with_id3120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conditional_statement_with_id3139 = new BitSet(new long[]{0x0000000020000000L,0x0000000006080008L});
	public static final BitSet FOLLOW_conditional_statement_loop_in_conditional_statement_with_id3141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_expression_with_identifier3165 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_expression_with_identifier3167 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_actual_parameter_part_in_expression_with_identifier3203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_statement_with_label_in_conditional_statement_loop3229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conditional_statement_loop3250 = new BitSet(new long[]{0x0000000020000000L,0x0000000006080008L});
	public static final BitSet FOLLOW_conditional_statement_loop_in_conditional_statement_loop3252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_go_to_statement3285 = new BitSet(new long[]{0x0400004020000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_designational_expression_in_go_to_statement3287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_designational_expression_in_designational_expression3318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_designational_expression3338 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_designational_expression3340 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_designational_expression3342 = new BitSet(new long[]{0x0400004020000000L});
	public static final BitSet FOLLOW_simple_designational_expression_in_designational_expression3344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_designational_expression3346 = new BitSet(new long[]{0x0400004020000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_designational_expression_in_designational_expression3348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_simple_designational_expression3393 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_simple_designational_expression3397 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_simple_designational_expression3399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_simple_designational_expression3401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_simple_designational_expression3447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_simple_designational_expression3474 = new BitSet(new long[]{0x0400004020000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_designational_expression_in_simple_designational_expression3476 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_simple_designational_expression3478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_actual_parameter_part13552 = new BitSet(new long[]{0xCC00804020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_part13554 = new BitSet(new long[]{0x8800000000000000L});
	public static final BitSet FOLLOW_63_in_actual_parameter_part13557 = new BitSet(new long[]{0xCC00804020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_part13559 = new BitSet(new long[]{0x8800000000000000L});
	public static final BitSet FOLLOW_59_in_actual_parameter_part13562 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Identifier_in_actual_parameter_part13565 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_actual_parameter_part13567 = new BitSet(new long[]{0xCC00804020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_part13569 = new BitSet(new long[]{0x8800000000000000L});
	public static final BitSet FOLLOW_63_in_actual_parameter_part13572 = new BitSet(new long[]{0xCC00804020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_part13574 = new BitSet(new long[]{0x8800000000000000L});
	public static final BitSet FOLLOW_59_in_actual_parameter_part13578 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_58_in_actual_parameter_part3628 = new BitSet(new long[]{0xCC00804020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_part3630 = new BitSet(new long[]{0x8800000000000000L});
	public static final BitSet FOLLOW_63_in_actual_parameter_part3633 = new BitSet(new long[]{0xCC00804020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_part3635 = new BitSet(new long[]{0x8800000000000000L});
	public static final BitSet FOLLOW_59_in_actual_parameter_part3638 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Identifier_in_actual_parameter_part3641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_actual_parameter_part3643 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_actual_parameter_part3645 = new BitSet(new long[]{0xCC00804020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_part3647 = new BitSet(new long[]{0x8800000000000000L});
	public static final BitSet FOLLOW_63_in_actual_parameter_part3650 = new BitSet(new long[]{0xCC00804020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_part3652 = new BitSet(new long[]{0x8800000000000000L});
	public static final BitSet FOLLOW_59_in_actual_parameter_part3656 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_STRING_in_actual_parameter3712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_actual_parameter3740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_if_clause3805 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_if_clause3807 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_if_clause3809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_list_element_in_for_list3859 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_for_list3862 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_for_list_element_in_for_list3864 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_for_list_element3897 = new BitSet(new long[]{0x0000000000000000L,0x0000010200000000L});
	public static final BitSet FOLLOW_for_list_element1_in_for_list_element3899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_for_list_element13934 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_for_list_element13936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_for_list_element13972 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_for_list_element13976 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_102_in_for_list_element13978 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_for_list_element13982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_arithmetic_expression_in_arithmetic_expression4032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_arithmetic_expression4064 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_arithmetic_expression4066 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_arithmetic_expression4068 = new BitSet(new long[]{0x4400004020000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_simple_arithmetic_expression_in_arithmetic_expression4070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_arithmetic_expression4072 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_arithmetic_expression4074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_boolean_in_expression4128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_expression4159 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_expression4161 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_expression4163 = new BitSet(new long[]{0x4400004020000000L,0x0000022001000001L});
	public static final BitSet FOLLOW_simple_boolean_in_expression4165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_expression4167 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_expression4169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_implication_in_simple_boolean4211 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_simple_boolean4214 = new BitSet(new long[]{0x4400004020000000L,0x0000022001000001L});
	public static final BitSet FOLLOW_implication_in_simple_boolean4217 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_boolean_term_in_implication4242 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_implication4245 = new BitSet(new long[]{0x4400004020000000L,0x0000022001000001L});
	public static final BitSet FOLLOW_boolean_term_in_implication4248 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_boolean_factor_in_boolean_term4273 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_boolean_term4276 = new BitSet(new long[]{0x4400004020000000L,0x0000022001000001L});
	public static final BitSet FOLLOW_boolean_factor_in_boolean_term4279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_boolean_secondary_in_boolean_factor4304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_boolean_factor4307 = new BitSet(new long[]{0x4400004020000000L,0x0000022001000001L});
	public static final BitSet FOLLOW_boolean_secondary_in_boolean_factor4310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_boolean_primary_in_boolean_secondary4347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_boolean_secondary4363 = new BitSet(new long[]{0x4400004020000000L,0x0000002001000001L});
	public static final BitSet FOLLOW_boolean_primary_in_boolean_secondary4366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_boolean_primary4389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relation_in_boolean_primary4430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_arithmetic_expression_in_relation4491 = new BitSet(new long[]{0x0000000000000002L,0x00000000000036C0L});
	public static final BitSet FOLLOW_set_in_relation4494 = new BitSet(new long[]{0x4400004020000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_simple_arithmetic_expression_in_relation4519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_simple_arithmetic_expression4577 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_set_in_simple_arithmetic_expression4580 = new BitSet(new long[]{0x0400004020000000L});
	public static final BitSet FOLLOW_term_in_simple_arithmetic_expression4587 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_set_in_simple_arithmetic_expression4617 = new BitSet(new long[]{0x0400004020000000L});
	public static final BitSet FOLLOW_term_in_simple_arithmetic_expression4624 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_factor_in_term4650 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_term4653 = new BitSet(new long[]{0x0400004020000000L});
	public static final BitSet FOLLOW_factor_in_term4662 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000006L});
	public static final BitSet FOLLOW_primary_in_factor4686 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_61_in_factor4689 = new BitSet(new long[]{0x0400004020000000L});
	public static final BitSet FOLLOW_primary_in_factor4692 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primary4717 = new BitSet(new long[]{0x0400000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_primary_with_identifier_in_primary4726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_primary4736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_primary4769 = new BitSet(new long[]{0x4400004020000000L,0x0000022009000001L});
	public static final BitSet FOLLOW_expression_in_primary4771 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_primary4773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actual_parameter_part1_in_primary_with_identifier4821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_primary_with_identifier4850 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_primary_with_identifier4852 = new BitSet(new long[]{0x8000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_63_in_primary_with_identifier4855 = new BitSet(new long[]{0x4400004020000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_primary_with_identifier4857 = new BitSet(new long[]{0x8000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_primary_with_identifier4861 = new BitSet(new long[]{0x0000000000000002L});
}
