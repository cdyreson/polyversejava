// $ANTLR 3.5.2 Java.g 2024-10-23 15:44:02

  package edu.usu.polyverse.grammar;
  import java.util.Iterator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/**
         * An ANTLRv3 capable Java 1.5 grammar for building ASTs.
         *
         * Note that there's also the tree grammar 'JavaTreeParser.g' that can be fed
         * with this grammer's output.
         *
         *
         * Please report any detected errors or even suggestions regarding this grammar
         * to
         *
         *          dieter [D O T] habelitz [A T] habelitz [D O T] com
         *
         *      with the subject
         *
         *          jsom grammar: [your subject note]
         *
         * To generate a parser based on this grammar you'll need ANTLRv3, which you can
         * get from 'http://www.antlr.org'.
         *
         *
         * This grammar is published under the ...
         *
         * BSD licence
         * 
         * Copyright (c) 2007-2008 by HABELITZ Software Developments
         *
         * All rights reserved.
         * 
         * http://www.habelitz.com
         *
         *
         * Redistribution and use in source and binary forms, with or without
         * modification, are permitted provided that the following conditions
         * are met:
         *
         *  1. Redistributions of source code must retain the above copyright
         *     notice, this list of conditions and the following disclaimer.
         *  2. Redistributions in binary form must reproduce the above copyright
         *     notice, this list of conditions and the following disclaimer in the
         *     documentation and/or other materials provided with the distribution.
         *  3. The name of the author may not be used to endorse or promote products
         *     derived from this software without specific prior written permission.
         *
         * THIS SOFTWARE IS PROVIDED BY HABELITZ SOFTWARE DEVELOPMENTS ('HSD') ``AS IS'' 
         * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
         * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
         * ARE DISCLAIMED. IN NO EVENT SHALL 'HSD' BE LIABLE FOR ANY DIRECT, INDIRECT, 
         * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
         * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 
         * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
         * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING 
         * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
         * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
         *
         */
@SuppressWarnings("all")
public class JavaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AND", "AND_ASSIGN", 
		"ANNOTATION_INIT_ARRAY_ELEMENT", "ANNOTATION_INIT_BLOCK", "ANNOTATION_INIT_DEFAULT_KEY", 
		"ANNOTATION_INIT_KEY_LIST", "ANNOTATION_LIST", "ANNOTATION_METHOD_DECL", 
		"ANNOTATION_SCOPE", "ANNOTATION_TOP_LEVEL_SCOPE", "ARGUMENT_LIST", "ARRAY_DECLARATOR", 
		"ARRAY_DECLARATOR_LIST", "ARRAY_ELEMENT_ACCESS", "ARRAY_INITIALIZER", 
		"ASSERT", "ASSIGN", "AT", "BIT_SHIFT_RIGHT", "BIT_SHIFT_RIGHT_ASSIGN", 
		"BLOCK_SCOPE", "BOOLEAN", "BREAK", "BYTE", "CASE", "CAST_EXPR", "CATCH", 
		"CATCH_CLAUSE_LIST", "CHAR", "CHARACTER_LITERAL", "CLASS", "CLASS_CONSTRUCTOR_CALL", 
		"CLASS_INSTANCE_INITIALIZER", "CLASS_STATIC_INITIALIZER", "CLASS_TOP_LEVEL_SCOPE", 
		"COLON", "COMMA", "COMMENT", "COMMENTEND", "COMMENTSTART", "CONSTRUCTOR_DECL", 
		"CONTINUE", "DEC", "DECIMAL_LITERAL", "DEFAULT", "DIV", "DIV_ASSIGN", 
		"DO", "DOT", "DOTSTAR", "DOUBLE", "ELLIPSIS", "ELSE", "ENUM", "ENUM_TOP_LEVEL_SCOPE", 
		"EQUAL", "ESCAPE_SEQUENCE", "EXPONENT", "EXPR", "EXTENDS", "EXTENDS_BOUND_LIST", 
		"EXTENDS_CLAUSE", "FALSE", "FINAL", "FINALLY", "FLOAT", "FLOATING_POINT_LITERAL", 
		"FLOAT_TYPE_SUFFIX", "FOR", "FORMAL_PARAM_LIST", "FORMAL_PARAM_STD_DECL", 
		"FORMAL_PARAM_VARARG_DECL", "FOR_CONDITION", "FOR_EACH", "FOR_INIT", "FOR_UPDATE", 
		"FUNCTION_METHOD_DECL", "GENERIC_TYPE_ARG_LIST", "GENERIC_TYPE_PARAM_LIST", 
		"GREATER_OR_EQUAL", "GREATER_THAN", "HEX_DIGIT", "HEX_LITERAL", "IDENT", 
		"IF", "IMPLEMENTS", "IMPLEMENTS_CLAUSE", "IMPORT", "INC", "INSTANCEOF", 
		"INT", "INTEGER_TYPE_SUFFIX", "INTERFACE", "INTERFACE_TOP_LEVEL_SCOPE", 
		"JAVA_ID_PART", "JAVA_ID_START", "JAVA_SOURCE", "LABELED_STATEMENT", "LBRACK", 
		"LCURLY", "LESS_OR_EQUAL", "LESS_THAN", "LINE_COMMENT", "LOCAL_MODIFIER_LIST", 
		"LOGICAL_AND", "LOGICAL_NOT", "LOGICAL_OR", "LONG", "LPAREN", "METHOD_CALL", 
		"MINUS", "MINUS_ASSIGN", "MOD", "MODIFIER_LIST", "MOD_ASSIGN", "MVENTER", 
		"MVEXIT", "NATIVE", "NEW", "NOT", "NOT_EQUAL", "NULL", "OCTAL_ESCAPE", 
		"OCTAL_LITERAL", "OR", "OR_ASSIGN", "PACKAGE", "PARENTESIZED_EXPR", "PLUS", 
		"PLUS_ASSIGN", "POLYVERSE", "POST_DEC", "POST_INC", "PRE_DEC", "PRE_INC", 
		"PRIVATE", "PROTECTED", "PUBLIC", "QUALIFIED_TYPE_IDENT", "QUESTION", 
		"RBRACK", "RCURLY", "RETURN", "RPAREN", "SEMI", "SHIFT_LEFT", "SHIFT_LEFT_ASSIGN", 
		"SHIFT_RIGHT", "SHIFT_RIGHT_ASSIGN", "SHORT", "STAR", "STAR_ASSIGN", "STATIC", 
		"STATIC_ARRAY_CREATOR", "STRICTFP", "STRING_LITERAL", "SUPER", "SUPER_CONSTRUCTOR_CALL", 
		"SWITCH", "SWITCH_BLOCK_LABEL_LIST", "SYNCHRONIZED", "THIS", "THIS_CONSTRUCTOR_CALL", 
		"THROW", "THROWS", "THROWS_CLAUSE", "TRANSIENT", "TRUE", "TRY", "TYPE", 
		"UNARY_MINUS", "UNARY_PLUS", "UNICODE_ESCAPE", "VAR_DECLARATION", "VAR_DECLARATOR", 
		"VAR_DECLARATOR_LIST", "VOID", "VOID_METHOD_DECL", "VOLATILE", "WHILE", 
		"WS", "XOR", "XOR_ASSIGN"
	};
	public static final int EOF=-1;
	public static final int ABSTRACT=4;
	public static final int AND=5;
	public static final int AND_ASSIGN=6;
	public static final int ANNOTATION_INIT_ARRAY_ELEMENT=7;
	public static final int ANNOTATION_INIT_BLOCK=8;
	public static final int ANNOTATION_INIT_DEFAULT_KEY=9;
	public static final int ANNOTATION_INIT_KEY_LIST=10;
	public static final int ANNOTATION_LIST=11;
	public static final int ANNOTATION_METHOD_DECL=12;
	public static final int ANNOTATION_SCOPE=13;
	public static final int ANNOTATION_TOP_LEVEL_SCOPE=14;
	public static final int ARGUMENT_LIST=15;
	public static final int ARRAY_DECLARATOR=16;
	public static final int ARRAY_DECLARATOR_LIST=17;
	public static final int ARRAY_ELEMENT_ACCESS=18;
	public static final int ARRAY_INITIALIZER=19;
	public static final int ASSERT=20;
	public static final int ASSIGN=21;
	public static final int AT=22;
	public static final int BIT_SHIFT_RIGHT=23;
	public static final int BIT_SHIFT_RIGHT_ASSIGN=24;
	public static final int BLOCK_SCOPE=25;
	public static final int BOOLEAN=26;
	public static final int BREAK=27;
	public static final int BYTE=28;
	public static final int CASE=29;
	public static final int CAST_EXPR=30;
	public static final int CATCH=31;
	public static final int CATCH_CLAUSE_LIST=32;
	public static final int CHAR=33;
	public static final int CHARACTER_LITERAL=34;
	public static final int CLASS=35;
	public static final int CLASS_CONSTRUCTOR_CALL=36;
	public static final int CLASS_INSTANCE_INITIALIZER=37;
	public static final int CLASS_STATIC_INITIALIZER=38;
	public static final int CLASS_TOP_LEVEL_SCOPE=39;
	public static final int COLON=40;
	public static final int COMMA=41;
	public static final int COMMENT=42;
	public static final int COMMENTEND=43;
	public static final int COMMENTSTART=44;
	public static final int CONSTRUCTOR_DECL=45;
	public static final int CONTINUE=46;
	public static final int DEC=47;
	public static final int DECIMAL_LITERAL=48;
	public static final int DEFAULT=49;
	public static final int DIV=50;
	public static final int DIV_ASSIGN=51;
	public static final int DO=52;
	public static final int DOT=53;
	public static final int DOTSTAR=54;
	public static final int DOUBLE=55;
	public static final int ELLIPSIS=56;
	public static final int ELSE=57;
	public static final int ENUM=58;
	public static final int ENUM_TOP_LEVEL_SCOPE=59;
	public static final int EQUAL=60;
	public static final int ESCAPE_SEQUENCE=61;
	public static final int EXPONENT=62;
	public static final int EXPR=63;
	public static final int EXTENDS=64;
	public static final int EXTENDS_BOUND_LIST=65;
	public static final int EXTENDS_CLAUSE=66;
	public static final int FALSE=67;
	public static final int FINAL=68;
	public static final int FINALLY=69;
	public static final int FLOAT=70;
	public static final int FLOATING_POINT_LITERAL=71;
	public static final int FLOAT_TYPE_SUFFIX=72;
	public static final int FOR=73;
	public static final int FORMAL_PARAM_LIST=74;
	public static final int FORMAL_PARAM_STD_DECL=75;
	public static final int FORMAL_PARAM_VARARG_DECL=76;
	public static final int FOR_CONDITION=77;
	public static final int FOR_EACH=78;
	public static final int FOR_INIT=79;
	public static final int FOR_UPDATE=80;
	public static final int FUNCTION_METHOD_DECL=81;
	public static final int GENERIC_TYPE_ARG_LIST=82;
	public static final int GENERIC_TYPE_PARAM_LIST=83;
	public static final int GREATER_OR_EQUAL=84;
	public static final int GREATER_THAN=85;
	public static final int HEX_DIGIT=86;
	public static final int HEX_LITERAL=87;
	public static final int IDENT=88;
	public static final int IF=89;
	public static final int IMPLEMENTS=90;
	public static final int IMPLEMENTS_CLAUSE=91;
	public static final int IMPORT=92;
	public static final int INC=93;
	public static final int INSTANCEOF=94;
	public static final int INT=95;
	public static final int INTEGER_TYPE_SUFFIX=96;
	public static final int INTERFACE=97;
	public static final int INTERFACE_TOP_LEVEL_SCOPE=98;
	public static final int JAVA_ID_PART=99;
	public static final int JAVA_ID_START=100;
	public static final int JAVA_SOURCE=101;
	public static final int LABELED_STATEMENT=102;
	public static final int LBRACK=103;
	public static final int LCURLY=104;
	public static final int LESS_OR_EQUAL=105;
	public static final int LESS_THAN=106;
	public static final int LINE_COMMENT=107;
	public static final int LOCAL_MODIFIER_LIST=108;
	public static final int LOGICAL_AND=109;
	public static final int LOGICAL_NOT=110;
	public static final int LOGICAL_OR=111;
	public static final int LONG=112;
	public static final int LPAREN=113;
	public static final int METHOD_CALL=114;
	public static final int MINUS=115;
	public static final int MINUS_ASSIGN=116;
	public static final int MOD=117;
	public static final int MODIFIER_LIST=118;
	public static final int MOD_ASSIGN=119;
	public static final int MVENTER=120;
	public static final int MVEXIT=121;
	public static final int NATIVE=122;
	public static final int NEW=123;
	public static final int NOT=124;
	public static final int NOT_EQUAL=125;
	public static final int NULL=126;
	public static final int OCTAL_ESCAPE=127;
	public static final int OCTAL_LITERAL=128;
	public static final int OR=129;
	public static final int OR_ASSIGN=130;
	public static final int PACKAGE=131;
	public static final int PARENTESIZED_EXPR=132;
	public static final int PLUS=133;
	public static final int PLUS_ASSIGN=134;
	public static final int POLYVERSE=135;
	public static final int POST_DEC=136;
	public static final int POST_INC=137;
	public static final int PRE_DEC=138;
	public static final int PRE_INC=139;
	public static final int PRIVATE=140;
	public static final int PROTECTED=141;
	public static final int PUBLIC=142;
	public static final int QUALIFIED_TYPE_IDENT=143;
	public static final int QUESTION=144;
	public static final int RBRACK=145;
	public static final int RCURLY=146;
	public static final int RETURN=147;
	public static final int RPAREN=148;
	public static final int SEMI=149;
	public static final int SHIFT_LEFT=150;
	public static final int SHIFT_LEFT_ASSIGN=151;
	public static final int SHIFT_RIGHT=152;
	public static final int SHIFT_RIGHT_ASSIGN=153;
	public static final int SHORT=154;
	public static final int STAR=155;
	public static final int STAR_ASSIGN=156;
	public static final int STATIC=157;
	public static final int STATIC_ARRAY_CREATOR=158;
	public static final int STRICTFP=159;
	public static final int STRING_LITERAL=160;
	public static final int SUPER=161;
	public static final int SUPER_CONSTRUCTOR_CALL=162;
	public static final int SWITCH=163;
	public static final int SWITCH_BLOCK_LABEL_LIST=164;
	public static final int SYNCHRONIZED=165;
	public static final int THIS=166;
	public static final int THIS_CONSTRUCTOR_CALL=167;
	public static final int THROW=168;
	public static final int THROWS=169;
	public static final int THROWS_CLAUSE=170;
	public static final int TRANSIENT=171;
	public static final int TRUE=172;
	public static final int TRY=173;
	public static final int TYPE=174;
	public static final int UNARY_MINUS=175;
	public static final int UNARY_PLUS=176;
	public static final int UNICODE_ESCAPE=177;
	public static final int VAR_DECLARATION=178;
	public static final int VAR_DECLARATOR=179;
	public static final int VAR_DECLARATOR_LIST=180;
	public static final int VOID=181;
	public static final int VOID_METHOD_DECL=182;
	public static final int VOLATILE=183;
	public static final int WHILE=184;
	public static final int WS=185;
	public static final int XOR=186;
	public static final int XOR_ASSIGN=187;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JavaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[359+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return JavaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Java.g"; }


	  private boolean mMessageCollectionEnabled = false;
	  private boolean mHasErrors = false;
	  private List<String> mMessages;
	  //private Stack<Token> toFetch = new Stack<Token>();
	  //private Stack<String> toFetchText = new Stack<String>();
	  TokenRewriteStream tokens;
	  //Boolean PolyverseScope.isPolyverse() = false;
	  //Boolean temp = false;
	  Boolean forStart = false;
	  Boolean forBlock = false;
	  String relationalOperator ="";
	  SymbolTable symbolTable = new SymbolTable();
	  String opr = "" ;
	  Boolean doIt;
	  String doDont="";
	           
	  public void setTokenStream(TokenRewriteStream input) {
	    //super.setTreeNodeStream(input);
	    tokens = input; 
	  }

	  public String newPolyverseVar() {
	    return "mmmvar" + count++;
	  }
	            
	  public String vtop() {
	    return "vtop";
	  }

	  Stack<String> metaVarStack = new Stack<String>();
	  Stack<String> metaPairStack = new Stack<String>();
	  //Metadata allTime = new Metadata();
	  //Boolean polyverseIf = false;
	  //Boolean ifPolyverseStatement = false;
	  String ifcondition = "";
	  int count = 0;
	  //Boolean polyverseElse = false;
	  Boolean seqIf = false;
	            
	  String forcondition = "";
	  Boolean whileBlock = false;
	  Boolean doWhile = false;
	  Boolean doPara = false;
	            
	  Boolean switchCase = false;
	  Stack<String> cases = new Stack<String>();
	  Stack<String> statements = new Stack<String>();
	  Boolean isBreak = false;
	  Boolean leftCurly = false;
	  Boolean rightCurly = false;
	            
	  Boolean breakTrue = false;
	  Boolean methodBlock= false;
	  Iterator x;
	  String returnType = "void";
	  Boolean polyverseReturn = false;
	  Boolean methodCall = false;
	  //variable for operation identification
	            
	            
	  final int and = 1;
	  final int and_assign = 2;
	  final int assign = 3;
	  final int bit_shift_right = 4;
	  final int bit_shift_right_assign = 5;
	  final int dec = 6;
	  final int div = 7;
	  final int div_assign = 8;
	  final int equal = 9;
	  final int greater_or_equal = 10;
	  final int greater_than = 11;
	  final int inc = 12;
	  final int less_or_equal = 13;
	  final int less_than = 14;
	  final int logical_and = 15;
	  final int logical_not = 16;
	  final int logical_or = 17;
	  final int minus = 18;
	  final int minus_assign = 19;
	  final int mod = 20;
	  final int mod_assign = 21;
	  final int not = 22;
	  final int not_equal = 23;
	  final int or = 24;
	  final int or_assign = 25;
	  final int plus = 26;
	  final int plus_assign = 27;
	  final int shift_left = 28;
	  final int shift_left_assign = 29;
	  final int shift_right = 30;
	  final int shift_right_assign = 31;
	  final int star = 32;
	  final int star_assign = 33;
	  final int xor = 34;
	  final int xor_assign = 35;
	            
	            
	            /**
	             *  Switches error message collection on or of.
	             *
	             *  The standard destination for parser error messages is <code>System.err</code>.
	             *  However, if <code>true</code> gets passed to this method this default
	             *  behaviour will be switched off and all error messages will be collected
	             *  instead of written to anywhere.
	             *
	             *  The default value is <code>false</code>.
	             *
	             *  @param pNewState  <code>true</code> if error messages should be collected.
	             */
	            public void enableErrorMessageCollection(boolean pNewState) {
	                mMessageCollectionEnabled = pNewState;
	                if (mMessages == null && mMessageCollectionEnabled) {
	                    mMessages = new ArrayList<String>();
	                }
	            }
	            

	            
	            /**
	             *  Collects an error message or passes the error message to <code>
	             *  super.emitErrorMessage(...)</code>.
	             *
	             *  The actual behaviour depends on whether collecting error messages
	             *  has been enabled or not.
	             *
	             *  @param pMessage  The error message.
	             */
	             @Override
	            public void emitErrorMessage(String pMessage) {
	                if (mMessageCollectionEnabled) {
	                    mMessages.add(pMessage);
	                } else {
	                    super.emitErrorMessage(pMessage);
	                }
	            }
	            
	            /**
	             *  Returns collected error messages.
	             *
	             *  @return  A list holding collected error messages or <code>null</code> if
	             *           collecting error messages hasn't been enabled. Of course, this
	             *           list may be empty if no error message has been emited.
	             */
	            public List<String> getMessages() {
	                return mMessages;
	            }
	            
	            /**
	             *  Tells if parsing a Java source has caused any error messages.
	             *
	             *  @return  <code>true</code> if parsing a Java source has caused at least one error message.
	             */
	            public boolean hasErrors() {
	                return mHasErrors;
	            }
	        

	public static class javaSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "javaSource"
	// Java.g:427:1: javaSource : compilationUnit -> ^( JAVA_SOURCE compilationUnit ) ;
	public final JavaParser.javaSource_return javaSource() throws RecognitionException {
		JavaParser.javaSource_return retval = new JavaParser.javaSource_return();
		retval.start = input.LT(1);
		int javaSource_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope compilationUnit1 =null;

		RewriteRuleSubtreeStream stream_compilationUnit=new RewriteRuleSubtreeStream(adaptor,"rule compilationUnit");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// Java.g:428:13: ( compilationUnit -> ^( JAVA_SOURCE compilationUnit ) )
			// Java.g:428:17: compilationUnit
			{
			pushFollow(FOLLOW_compilationUnit_in_javaSource6000);
			compilationUnit1=compilationUnit();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_compilationUnit.add(compilationUnit1.getTree());
			// AST REWRITE
			// elements: compilationUnit
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 429:17: -> ^( JAVA_SOURCE compilationUnit )
			{
				// Java.g:429:21: ^( JAVA_SOURCE compilationUnit )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JAVA_SOURCE, "JAVA_SOURCE"), root_1);
				adaptor.addChild(root_1, stream_compilationUnit.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, javaSource_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "javaSource"


	public static class compilationUnit_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "compilationUnit"
	// Java.g:432:1: compilationUnit : annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDecls )* ;
	public final JavaParser.compilationUnit_return compilationUnit() throws RecognitionException {
		JavaParser.compilationUnit_return retval = new JavaParser.compilationUnit_return();
		retval.start = input.LT(1);
		int compilationUnit_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope annotationList2 =null;
		ParserRuleReturnScope packageDeclaration3 =null;
		ParserRuleReturnScope importDeclaration4 =null;
		ParserRuleReturnScope typeDecls5 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// Java.g:433:13: ( annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDecls )* )
			// Java.g:434:3: annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDecls )*
			{
			root_0 = (CommonTree)adaptor.nil();


			if ( state.backtracking==0 ) {
			    symbolTable.enterScope();
			    metaVarStack.push("metaDefault");
			    metaPairStack.push("metaPairDefault");
			  }
			pushFollow(FOLLOW_annotationList_in_compilationUnit6089);
			annotationList2=annotationList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationList2.getTree());

			// Java.g:440:17: ( packageDeclaration )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==PACKAGE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// Java.g:440:17: packageDeclaration
					{
					pushFollow(FOLLOW_packageDeclaration_in_compilationUnit6108);
					packageDeclaration3=packageDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, packageDeclaration3.getTree());

					}
					break;

			}

			// Java.g:441:17: ( importDeclaration )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IMPORT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Java.g:441:17: importDeclaration
					{
					pushFollow(FOLLOW_importDeclaration_in_compilationUnit6128);
					importDeclaration4=importDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, importDeclaration4.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			// Java.g:442:17: ( typeDecls )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ABSTRACT||LA3_0==AT||LA3_0==BOOLEAN||LA3_0==BYTE||LA3_0==CHAR||LA3_0==CLASS||LA3_0==DOUBLE||LA3_0==ENUM||LA3_0==FINAL||LA3_0==FLOAT||LA3_0==IDENT||LA3_0==INT||LA3_0==INTERFACE||LA3_0==LESS_THAN||LA3_0==LONG||LA3_0==MVENTER||LA3_0==NATIVE||(LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)||LA3_0==SEMI||LA3_0==SHORT||LA3_0==STATIC||LA3_0==STRICTFP||LA3_0==SYNCHRONIZED||LA3_0==TRANSIENT||LA3_0==VOID||LA3_0==VOLATILE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Java.g:442:17: typeDecls
					{
					pushFollow(FOLLOW_typeDecls_in_compilationUnit6148);
					typeDecls5=typeDecls();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDecls5.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			if ( state.backtracking==0 ) { 
			    //System.out.println("last metaVarStack "+metaVarStack.peek());
			    //System.out.println("last metaPairStack "+metaPairStack.peek());
			    metaPairStack.pop();
			    metaVarStack.pop();
			    symbolTable.exitScope();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, compilationUnit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "compilationUnit"


	public static class typeDecls_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typeDecls"
	// Java.g:452:1: typeDecls : ( typeDeclaration | polyverseDeclaration | SEMI !);
	public final JavaParser.typeDecls_return typeDecls() throws RecognitionException {
		JavaParser.typeDecls_return retval = new JavaParser.typeDecls_return();
		retval.start = input.LT(1);
		int typeDecls_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SEMI8=null;
		ParserRuleReturnScope typeDeclaration6 =null;
		ParserRuleReturnScope polyverseDeclaration7 =null;

		CommonTree SEMI8_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// Java.g:453:13: ( typeDeclaration | polyverseDeclaration | SEMI !)
			int alt4=3;
			switch ( input.LA(1) ) {
			case ABSTRACT:
			case AT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case IDENT:
			case INT:
			case INTERFACE:
			case LESS_THAN:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
				{
				alt4=1;
				}
				break;
			case MVENTER:
				{
				alt4=2;
				}
				break;
			case SEMI:
				{
				alt4=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// Java.g:453:17: typeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typeDeclaration_in_typeDecls6196);
					typeDeclaration6=typeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration6.getTree());

					}
					break;
				case 2 :
					// Java.g:454:17: polyverseDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_polyverseDeclaration_in_typeDecls6214);
					polyverseDeclaration7=polyverseDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, polyverseDeclaration7.getTree());

					}
					break;
				case 3 :
					// Java.g:455:17: SEMI !
					{
					root_0 = (CommonTree)adaptor.nil();


					SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_typeDecls6232); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, typeDecls_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeDecls"


	public static class packageDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "packageDeclaration"
	// Java.g:458:1: packageDeclaration : PACKAGE ^ qualifiedIdentifier SEMI !;
	public final JavaParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
		JavaParser.packageDeclaration_return retval = new JavaParser.packageDeclaration_return();
		retval.start = input.LT(1);
		int packageDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token PACKAGE9=null;
		Token SEMI11=null;
		ParserRuleReturnScope qualifiedIdentifier10 =null;

		CommonTree PACKAGE9_tree=null;
		CommonTree SEMI11_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// Java.g:459:13: ( PACKAGE ^ qualifiedIdentifier SEMI !)
			// Java.g:459:17: PACKAGE ^ qualifiedIdentifier SEMI !
			{
			root_0 = (CommonTree)adaptor.nil();


			PACKAGE9=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration6276); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PACKAGE9_tree = (CommonTree)adaptor.create(PACKAGE9);
			root_0 = (CommonTree)adaptor.becomeRoot(PACKAGE9_tree, root_0);
			}

			pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration6280);
			qualifiedIdentifier10=qualifiedIdentifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedIdentifier10.getTree());

			SEMI11=(Token)match(input,SEMI,FOLLOW_SEMI_in_packageDeclaration6282); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, packageDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "packageDeclaration"


	public static class importDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "importDeclaration"
	// Java.g:462:9: importDeclaration : IMPORT ^ ( STATIC )? qualifiedIdentifier ( DOTSTAR )? SEMI !;
	public final JavaParser.importDeclaration_return importDeclaration() throws RecognitionException {
		JavaParser.importDeclaration_return retval = new JavaParser.importDeclaration_return();
		retval.start = input.LT(1);
		int importDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IMPORT12=null;
		Token STATIC13=null;
		Token DOTSTAR15=null;
		Token SEMI16=null;
		ParserRuleReturnScope qualifiedIdentifier14 =null;

		CommonTree IMPORT12_tree=null;
		CommonTree STATIC13_tree=null;
		CommonTree DOTSTAR15_tree=null;
		CommonTree SEMI16_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// Java.g:463:13: ( IMPORT ^ ( STATIC )? qualifiedIdentifier ( DOTSTAR )? SEMI !)
			// Java.g:463:17: IMPORT ^ ( STATIC )? qualifiedIdentifier ( DOTSTAR )? SEMI !
			{
			root_0 = (CommonTree)adaptor.nil();


			IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration6340); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMPORT12_tree = (CommonTree)adaptor.create(IMPORT12);
			root_0 = (CommonTree)adaptor.becomeRoot(IMPORT12_tree, root_0);
			}

			// Java.g:463:25: ( STATIC )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==STATIC) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Java.g:463:25: STATIC
					{
					STATIC13=(Token)match(input,STATIC,FOLLOW_STATIC_in_importDeclaration6343); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STATIC13_tree = (CommonTree)adaptor.create(STATIC13);
					adaptor.addChild(root_0, STATIC13_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration6346);
			qualifiedIdentifier14=qualifiedIdentifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedIdentifier14.getTree());

			// Java.g:463:53: ( DOTSTAR )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==DOTSTAR) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Java.g:463:53: DOTSTAR
					{
					DOTSTAR15=(Token)match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration6348); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOTSTAR15_tree = (CommonTree)adaptor.create(DOTSTAR15);
					adaptor.addChild(root_0, DOTSTAR15_tree);
					}

					}
					break;

			}

			SEMI16=(Token)match(input,SEMI,FOLLOW_SEMI_in_importDeclaration6351); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			    tokens.insertBefore(IMPORT12,"import edu.usu.polyverse.*;\n");
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, importDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "importDeclaration"


	public static class polyverseDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "polyverseDeclaration"
	// Java.g:469:1: polyverseDeclaration : MVENTER ( typeDeclaration )* MVEXIT ;
	public final JavaParser.polyverseDeclaration_return polyverseDeclaration() throws RecognitionException {
		JavaParser.polyverseDeclaration_return retval = new JavaParser.polyverseDeclaration_return();
		retval.start = input.LT(1);
		int polyverseDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token MVENTER17=null;
		Token MVEXIT19=null;
		ParserRuleReturnScope typeDeclaration18 =null;

		CommonTree MVENTER17_tree=null;
		CommonTree MVEXIT19_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// Java.g:470:13: ( MVENTER ( typeDeclaration )* MVEXIT )
			// Java.g:470:17: MVENTER ( typeDeclaration )* MVEXIT
			{
			root_0 = (CommonTree)adaptor.nil();


			MVENTER17=(Token)match(input,MVENTER,FOLLOW_MVENTER_in_polyverseDeclaration6405); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			MVENTER17_tree = (CommonTree)adaptor.create(MVENTER17);
			adaptor.addChild(root_0, MVENTER17_tree);
			}

			if ( state.backtracking==0 ) {/*-----*/ // Enters a polyverse scope
			    PolyverseScope.enterPolyverseScope();
			  /*-----*/}
			// Java.g:474:17: ( typeDeclaration )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ABSTRACT||LA7_0==AT||LA7_0==BOOLEAN||LA7_0==BYTE||LA7_0==CHAR||LA7_0==CLASS||LA7_0==DOUBLE||LA7_0==ENUM||LA7_0==FINAL||LA7_0==FLOAT||LA7_0==IDENT||LA7_0==INT||LA7_0==INTERFACE||LA7_0==LESS_THAN||LA7_0==LONG||LA7_0==NATIVE||(LA7_0 >= PRIVATE && LA7_0 <= PUBLIC)||LA7_0==SHORT||LA7_0==STATIC||LA7_0==STRICTFP||LA7_0==SYNCHRONIZED||LA7_0==TRANSIENT||LA7_0==VOID||LA7_0==VOLATILE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Java.g:474:17: typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_polyverseDeclaration6427);
					typeDeclaration18=typeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration18.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			MVEXIT19=(Token)match(input,MVEXIT,FOLLOW_MVEXIT_in_polyverseDeclaration6448); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			MVEXIT19_tree = (CommonTree)adaptor.create(MVEXIT19);
			adaptor.addChild(root_0, MVEXIT19_tree);
			}

			if ( state.backtracking==0 ) {/*-----*/ // Exit a polyverse scope
			    PolyverseScope.exitPolyverseScope();
			  /*-----*/}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, polyverseDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "polyverseDeclaration"


	public static class typeDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typeDeclaration"
	// Java.g:481:1: typeDeclaration : modifierList ! ( classTypeDeclaration[$modifierList.tree] | interfaceTypeDeclaration[$modifierList.tree] | enumTypeDeclaration[$modifierList.tree] | annotationTypeDeclaration[$modifierList.tree] ) ;
	public final JavaParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
		JavaParser.typeDeclaration_return retval = new JavaParser.typeDeclaration_return();
		retval.start = input.LT(1);
		int typeDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope modifierList20 =null;
		ParserRuleReturnScope classTypeDeclaration21 =null;
		ParserRuleReturnScope interfaceTypeDeclaration22 =null;
		ParserRuleReturnScope enumTypeDeclaration23 =null;
		ParserRuleReturnScope annotationTypeDeclaration24 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// Java.g:482:13: ( modifierList ! ( classTypeDeclaration[$modifierList.tree] | interfaceTypeDeclaration[$modifierList.tree] | enumTypeDeclaration[$modifierList.tree] | annotationTypeDeclaration[$modifierList.tree] ) )
			// Java.g:482:17: modifierList ! ( classTypeDeclaration[$modifierList.tree] | interfaceTypeDeclaration[$modifierList.tree] | enumTypeDeclaration[$modifierList.tree] | annotationTypeDeclaration[$modifierList.tree] )
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_modifierList_in_typeDeclaration6488);
			modifierList20=modifierList();
			state._fsp--;
			if (state.failed) return retval;
			// Java.g:483:17: ( classTypeDeclaration[$modifierList.tree] | interfaceTypeDeclaration[$modifierList.tree] | enumTypeDeclaration[$modifierList.tree] | annotationTypeDeclaration[$modifierList.tree] )
			int alt8=4;
			switch ( input.LA(1) ) {
			case CLASS:
				{
				alt8=1;
				}
				break;
			case INTERFACE:
				{
				alt8=2;
				}
				break;
			case ENUM:
				{
				alt8=3;
				}
				break;
			case AT:
				{
				alt8=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// Java.g:483:21: classTypeDeclaration[$modifierList.tree]
					{
					pushFollow(FOLLOW_classTypeDeclaration_in_typeDeclaration6511);
					classTypeDeclaration21=classTypeDeclaration((modifierList20!=null?((CommonTree)modifierList20.getTree()):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classTypeDeclaration21.getTree());

					}
					break;
				case 2 :
					// Java.g:484:21: interfaceTypeDeclaration[$modifierList.tree]
					{
					pushFollow(FOLLOW_interfaceTypeDeclaration_in_typeDeclaration6534);
					interfaceTypeDeclaration22=interfaceTypeDeclaration((modifierList20!=null?((CommonTree)modifierList20.getTree()):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceTypeDeclaration22.getTree());

					}
					break;
				case 3 :
					// Java.g:485:21: enumTypeDeclaration[$modifierList.tree]
					{
					pushFollow(FOLLOW_enumTypeDeclaration_in_typeDeclaration6557);
					enumTypeDeclaration23=enumTypeDeclaration((modifierList20!=null?((CommonTree)modifierList20.getTree()):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumTypeDeclaration23.getTree());

					}
					break;
				case 4 :
					// Java.g:486:21: annotationTypeDeclaration[$modifierList.tree]
					{
					pushFollow(FOLLOW_annotationTypeDeclaration_in_typeDeclaration6580);
					annotationTypeDeclaration24=annotationTypeDeclaration((modifierList20!=null?((CommonTree)modifierList20.getTree()):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeDeclaration24.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, typeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeDeclaration"


	public static class classTypeDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classTypeDeclaration"
	// Java.g:490:1: classTypeDeclaration[CommonTree modifiers] : CLASS IDENT ( genericTypeParameterList )? ( classExtendsClause )? ( implementsClause )? classBody -> ^( CLASS IDENT ( genericTypeParameterList )? ( classExtendsClause )? ( implementsClause )? classBody ) ;
	public final JavaParser.classTypeDeclaration_return classTypeDeclaration(CommonTree modifiers) throws RecognitionException {
		JavaParser.classTypeDeclaration_return retval = new JavaParser.classTypeDeclaration_return();
		retval.start = input.LT(1);
		int classTypeDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CLASS25=null;
		Token IDENT26=null;
		ParserRuleReturnScope genericTypeParameterList27 =null;
		ParserRuleReturnScope classExtendsClause28 =null;
		ParserRuleReturnScope implementsClause29 =null;
		ParserRuleReturnScope classBody30 =null;

		CommonTree CLASS25_tree=null;
		CommonTree IDENT26_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
		RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
		RewriteRuleSubtreeStream stream_classExtendsClause=new RewriteRuleSubtreeStream(adaptor,"rule classExtendsClause");
		RewriteRuleSubtreeStream stream_genericTypeParameterList=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeParameterList");
		RewriteRuleSubtreeStream stream_implementsClause=new RewriteRuleSubtreeStream(adaptor,"rule implementsClause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// Java.g:491:13: ( CLASS IDENT ( genericTypeParameterList )? ( classExtendsClause )? ( implementsClause )? classBody -> ^( CLASS IDENT ( genericTypeParameterList )? ( classExtendsClause )? ( implementsClause )? classBody ) )
			// Java.g:491:17: CLASS IDENT ( genericTypeParameterList )? ( classExtendsClause )? ( implementsClause )? classBody
			{
			CLASS25=(Token)match(input,CLASS,FOLLOW_CLASS_in_classTypeDeclaration6647); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLASS.add(CLASS25);

			IDENT26=(Token)match(input,IDENT,FOLLOW_IDENT_in_classTypeDeclaration6649); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT26);

			// Java.g:491:29: ( genericTypeParameterList )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==LESS_THAN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Java.g:491:29: genericTypeParameterList
					{
					pushFollow(FOLLOW_genericTypeParameterList_in_classTypeDeclaration6651);
					genericTypeParameterList27=genericTypeParameterList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_genericTypeParameterList.add(genericTypeParameterList27.getTree());
					}
					break;

			}

			// Java.g:491:55: ( classExtendsClause )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==EXTENDS) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Java.g:491:55: classExtendsClause
					{
					pushFollow(FOLLOW_classExtendsClause_in_classTypeDeclaration6654);
					classExtendsClause28=classExtendsClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classExtendsClause.add(classExtendsClause28.getTree());
					}
					break;

			}

			// Java.g:491:75: ( implementsClause )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==IMPLEMENTS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Java.g:491:75: implementsClause
					{
					pushFollow(FOLLOW_implementsClause_in_classTypeDeclaration6657);
					implementsClause29=implementsClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_implementsClause.add(implementsClause29.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_classBody_in_classTypeDeclaration6660);
			classBody30=classBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classBody.add(classBody30.getTree());
			// AST REWRITE
			// elements: IDENT, classExtendsClause, CLASS, genericTypeParameterList, classBody, implementsClause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 492:17: -> ^( CLASS IDENT ( genericTypeParameterList )? ( classExtendsClause )? ( implementsClause )? classBody )
			{
				// Java.g:492:21: ^( CLASS IDENT ( genericTypeParameterList )? ( classExtendsClause )? ( implementsClause )? classBody )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_CLASS.nextNode(), root_1);
				adaptor.addChild(root_1, modifiers);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// Java.g:492:48: ( genericTypeParameterList )?
				if ( stream_genericTypeParameterList.hasNext() ) {
					adaptor.addChild(root_1, stream_genericTypeParameterList.nextTree());
				}
				stream_genericTypeParameterList.reset();

				// Java.g:492:74: ( classExtendsClause )?
				if ( stream_classExtendsClause.hasNext() ) {
					adaptor.addChild(root_1, stream_classExtendsClause.nextTree());
				}
				stream_classExtendsClause.reset();

				// Java.g:492:94: ( implementsClause )?
				if ( stream_implementsClause.hasNext() ) {
					adaptor.addChild(root_1, stream_implementsClause.nextTree());
				}
				stream_implementsClause.reset();

				adaptor.addChild(root_1, stream_classBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, classTypeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classTypeDeclaration"


	public static class classExtendsClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classExtendsClause"
	// Java.g:495:1: classExtendsClause : EXTENDS type -> ^( EXTENDS_CLAUSE[$EXTENDS, \"EXTENDS_CLAUSE\"] type ) ;
	public final JavaParser.classExtendsClause_return classExtendsClause() throws RecognitionException {
		JavaParser.classExtendsClause_return retval = new JavaParser.classExtendsClause_return();
		retval.start = input.LT(1);
		int classExtendsClause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token EXTENDS31=null;
		ParserRuleReturnScope type32 =null;

		CommonTree EXTENDS31_tree=null;
		RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// Java.g:496:13: ( EXTENDS type -> ^( EXTENDS_CLAUSE[$EXTENDS, \"EXTENDS_CLAUSE\"] type ) )
			// Java.g:496:17: EXTENDS type
			{
			EXTENDS31=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classExtendsClause6745); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS31);

			pushFollow(FOLLOW_type_in_classExtendsClause6747);
			type32=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type32.getTree());
			// AST REWRITE
			// elements: type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 497:17: -> ^( EXTENDS_CLAUSE[$EXTENDS, \"EXTENDS_CLAUSE\"] type )
			{
				// Java.g:497:21: ^( EXTENDS_CLAUSE[$EXTENDS, \"EXTENDS_CLAUSE\"] type )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENDS_CLAUSE, EXTENDS31, "EXTENDS_CLAUSE"), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, classExtendsClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classExtendsClause"


	public static class interfaceExtendsClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "interfaceExtendsClause"
	// Java.g:500:1: interfaceExtendsClause : EXTENDS typeList -> ^( EXTENDS_CLAUSE[$EXTENDS, \"EXTENDS_CLAUSE\"] typeList ) ;
	public final JavaParser.interfaceExtendsClause_return interfaceExtendsClause() throws RecognitionException {
		JavaParser.interfaceExtendsClause_return retval = new JavaParser.interfaceExtendsClause_return();
		retval.start = input.LT(1);
		int interfaceExtendsClause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token EXTENDS33=null;
		ParserRuleReturnScope typeList34 =null;

		CommonTree EXTENDS33_tree=null;
		RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
		RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// Java.g:501:13: ( EXTENDS typeList -> ^( EXTENDS_CLAUSE[$EXTENDS, \"EXTENDS_CLAUSE\"] typeList ) )
			// Java.g:501:17: EXTENDS typeList
			{
			EXTENDS33=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_interfaceExtendsClause6823); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS33);

			pushFollow(FOLLOW_typeList_in_interfaceExtendsClause6825);
			typeList34=typeList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeList.add(typeList34.getTree());
			// AST REWRITE
			// elements: typeList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 502:17: -> ^( EXTENDS_CLAUSE[$EXTENDS, \"EXTENDS_CLAUSE\"] typeList )
			{
				// Java.g:502:21: ^( EXTENDS_CLAUSE[$EXTENDS, \"EXTENDS_CLAUSE\"] typeList )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENDS_CLAUSE, EXTENDS33, "EXTENDS_CLAUSE"), root_1);
				adaptor.addChild(root_1, stream_typeList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, interfaceExtendsClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceExtendsClause"


	public static class implementsClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "implementsClause"
	// Java.g:505:1: implementsClause : IMPLEMENTS typeList -> ^( IMPLEMENTS_CLAUSE[$IMPLEMENTS, \"IMPLEMENTS_CLAUSE\"] typeList ) ;
	public final JavaParser.implementsClause_return implementsClause() throws RecognitionException {
		JavaParser.implementsClause_return retval = new JavaParser.implementsClause_return();
		retval.start = input.LT(1);
		int implementsClause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IMPLEMENTS35=null;
		ParserRuleReturnScope typeList36 =null;

		CommonTree IMPLEMENTS35_tree=null;
		RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
		RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// Java.g:506:13: ( IMPLEMENTS typeList -> ^( IMPLEMENTS_CLAUSE[$IMPLEMENTS, \"IMPLEMENTS_CLAUSE\"] typeList ) )
			// Java.g:506:17: IMPLEMENTS typeList
			{
			IMPLEMENTS35=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_implementsClause6901); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS35);

			pushFollow(FOLLOW_typeList_in_implementsClause6903);
			typeList36=typeList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeList.add(typeList36.getTree());
			// AST REWRITE
			// elements: typeList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 507:17: -> ^( IMPLEMENTS_CLAUSE[$IMPLEMENTS, \"IMPLEMENTS_CLAUSE\"] typeList )
			{
				// Java.g:507:21: ^( IMPLEMENTS_CLAUSE[$IMPLEMENTS, \"IMPLEMENTS_CLAUSE\"] typeList )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPLEMENTS_CLAUSE, IMPLEMENTS35, "IMPLEMENTS_CLAUSE"), root_1);
				adaptor.addChild(root_1, stream_typeList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, implementsClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "implementsClause"


	public static class genericTypeParameterList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "genericTypeParameterList"
	// Java.g:510:1: genericTypeParameterList : LESS_THAN genericTypeParameter ( COMMA genericTypeParameter )* genericTypeListClosing -> ^( GENERIC_TYPE_PARAM_LIST[$LESS_THAN, \"GENERIC_TYPE_PARAM_LIST\"] ( genericTypeParameter )+ ) ;
	public final JavaParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException {
		JavaParser.genericTypeParameterList_return retval = new JavaParser.genericTypeParameterList_return();
		retval.start = input.LT(1);
		int genericTypeParameterList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LESS_THAN37=null;
		Token COMMA39=null;
		ParserRuleReturnScope genericTypeParameter38 =null;
		ParserRuleReturnScope genericTypeParameter40 =null;
		ParserRuleReturnScope genericTypeListClosing41 =null;

		CommonTree LESS_THAN37_tree=null;
		CommonTree COMMA39_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LESS_THAN=new RewriteRuleTokenStream(adaptor,"token LESS_THAN");
		RewriteRuleSubtreeStream stream_genericTypeParameter=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeParameter");
		RewriteRuleSubtreeStream stream_genericTypeListClosing=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeListClosing");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// Java.g:511:13: ( LESS_THAN genericTypeParameter ( COMMA genericTypeParameter )* genericTypeListClosing -> ^( GENERIC_TYPE_PARAM_LIST[$LESS_THAN, \"GENERIC_TYPE_PARAM_LIST\"] ( genericTypeParameter )+ ) )
			// Java.g:511:17: LESS_THAN genericTypeParameter ( COMMA genericTypeParameter )* genericTypeListClosing
			{
			LESS_THAN37=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_genericTypeParameterList6980); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LESS_THAN.add(LESS_THAN37);

			pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList6982);
			genericTypeParameter38=genericTypeParameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_genericTypeParameter.add(genericTypeParameter38.getTree());
			// Java.g:511:48: ( COMMA genericTypeParameter )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Java.g:511:49: COMMA genericTypeParameter
					{
					COMMA39=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericTypeParameterList6985); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA39);

					pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList6987);
					genericTypeParameter40=genericTypeParameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_genericTypeParameter.add(genericTypeParameter40.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			pushFollow(FOLLOW_genericTypeListClosing_in_genericTypeParameterList6991);
			genericTypeListClosing41=genericTypeListClosing();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_genericTypeListClosing.add(genericTypeListClosing41.getTree());
			// AST REWRITE
			// elements: genericTypeParameter
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 512:17: -> ^( GENERIC_TYPE_PARAM_LIST[$LESS_THAN, \"GENERIC_TYPE_PARAM_LIST\"] ( genericTypeParameter )+ )
			{
				// Java.g:512:21: ^( GENERIC_TYPE_PARAM_LIST[$LESS_THAN, \"GENERIC_TYPE_PARAM_LIST\"] ( genericTypeParameter )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GENERIC_TYPE_PARAM_LIST, LESS_THAN37, "GENERIC_TYPE_PARAM_LIST"), root_1);
				if ( !(stream_genericTypeParameter.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_genericTypeParameter.hasNext() ) {
					adaptor.addChild(root_1, stream_genericTypeParameter.nextTree());
				}
				stream_genericTypeParameter.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, genericTypeParameterList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "genericTypeParameterList"


	public static class genericTypeListClosing_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "genericTypeListClosing"
	// Java.g:515:1: genericTypeListClosing : ( GREATER_THAN | SHIFT_RIGHT | BIT_SHIFT_RIGHT |);
	public final JavaParser.genericTypeListClosing_return genericTypeListClosing() throws RecognitionException {
		JavaParser.genericTypeListClosing_return retval = new JavaParser.genericTypeListClosing_return();
		retval.start = input.LT(1);
		int genericTypeListClosing_StartIndex = input.index();

		CommonTree root_0 = null;

		Token GREATER_THAN42=null;
		Token SHIFT_RIGHT43=null;
		Token BIT_SHIFT_RIGHT44=null;

		CommonTree GREATER_THAN42_tree=null;
		CommonTree SHIFT_RIGHT43_tree=null;
		CommonTree BIT_SHIFT_RIGHT44_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// Java.g:519:13: ( GREATER_THAN | SHIFT_RIGHT | BIT_SHIFT_RIGHT |)
			int alt13=4;
			switch ( input.LA(1) ) {
			case GREATER_THAN:
				{
				int LA13_1 = input.LA(2);
				if ( (synpred16_Java()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=4;
				}

				}
				break;
			case SHIFT_RIGHT:
				{
				int LA13_2 = input.LA(2);
				if ( (synpred17_Java()) ) {
					alt13=2;
				}
				else if ( (true) ) {
					alt13=4;
				}

				}
				break;
			case BIT_SHIFT_RIGHT:
				{
				int LA13_3 = input.LA(2);
				if ( (synpred18_Java()) ) {
					alt13=3;
				}
				else if ( (true) ) {
					alt13=4;
				}

				}
				break;
			case EOF:
			case AND:
			case AND_ASSIGN:
			case ASSIGN:
			case BIT_SHIFT_RIGHT_ASSIGN:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case COLON:
			case COMMA:
			case DIV_ASSIGN:
			case DOT:
			case DOUBLE:
			case ELLIPSIS:
			case EQUAL:
			case EXTENDS:
			case FLOAT:
			case IDENT:
			case IMPLEMENTS:
			case INT:
			case LBRACK:
			case LCURLY:
			case LOGICAL_AND:
			case LOGICAL_OR:
			case LONG:
			case LPAREN:
			case MINUS_ASSIGN:
			case MOD_ASSIGN:
			case NOT_EQUAL:
			case OR:
			case OR_ASSIGN:
			case PLUS_ASSIGN:
			case QUESTION:
			case RBRACK:
			case RCURLY:
			case RPAREN:
			case SEMI:
			case SHIFT_LEFT_ASSIGN:
			case SHIFT_RIGHT_ASSIGN:
			case SHORT:
			case STAR_ASSIGN:
			case SUPER:
			case THIS:
			case VOID:
			case XOR:
			case XOR_ASSIGN:
				{
				alt13=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// Java.g:519:17: GREATER_THAN
					{
					root_0 = (CommonTree)adaptor.nil();


					GREATER_THAN42=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_genericTypeListClosing7162); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GREATER_THAN42_tree = (CommonTree)adaptor.create(GREATER_THAN42);
					adaptor.addChild(root_0, GREATER_THAN42_tree);
					}

					}
					break;
				case 2 :
					// Java.g:520:17: SHIFT_RIGHT
					{
					root_0 = (CommonTree)adaptor.nil();


					SHIFT_RIGHT43=(Token)match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_genericTypeListClosing7180); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SHIFT_RIGHT43_tree = (CommonTree)adaptor.create(SHIFT_RIGHT43);
					adaptor.addChild(root_0, SHIFT_RIGHT43_tree);
					}

					}
					break;
				case 3 :
					// Java.g:521:17: BIT_SHIFT_RIGHT
					{
					root_0 = (CommonTree)adaptor.nil();


					BIT_SHIFT_RIGHT44=(Token)match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_genericTypeListClosing7198); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BIT_SHIFT_RIGHT44_tree = (CommonTree)adaptor.create(BIT_SHIFT_RIGHT44);
					adaptor.addChild(root_0, BIT_SHIFT_RIGHT44_tree);
					}

					}
					break;
				case 4 :
					// Java.g:523:13: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, genericTypeListClosing_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "genericTypeListClosing"


	public static class genericTypeParameter_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "genericTypeParameter"
	// Java.g:525:1: genericTypeParameter : IDENT ( bound )? -> ^( IDENT ( bound )? ) ;
	public final JavaParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException {
		JavaParser.genericTypeParameter_return retval = new JavaParser.genericTypeParameter_return();
		retval.start = input.LT(1);
		int genericTypeParameter_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IDENT45=null;
		ParserRuleReturnScope bound46 =null;

		CommonTree IDENT45_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleSubtreeStream stream_bound=new RewriteRuleSubtreeStream(adaptor,"rule bound");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// Java.g:526:13: ( IDENT ( bound )? -> ^( IDENT ( bound )? ) )
			// Java.g:526:15: IDENT ( bound )?
			{
			IDENT45=(Token)match(input,IDENT,FOLLOW_IDENT_in_genericTypeParameter7257); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT45);

			// Java.g:526:21: ( bound )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==EXTENDS) ) {
				switch ( input.LA(2) ) {
					case BOOLEAN:
						{
						int LA14_3 = input.LA(3);
						if ( (synpred19_Java()) ) {
							alt14=1;
						}
						}
						break;
					case CHAR:
						{
						int LA14_4 = input.LA(3);
						if ( (synpred19_Java()) ) {
							alt14=1;
						}
						}
						break;
					case BYTE:
						{
						int LA14_5 = input.LA(3);
						if ( (synpred19_Java()) ) {
							alt14=1;
						}
						}
						break;
					case SHORT:
						{
						int LA14_6 = input.LA(3);
						if ( (synpred19_Java()) ) {
							alt14=1;
						}
						}
						break;
					case INT:
						{
						int LA14_7 = input.LA(3);
						if ( (synpred19_Java()) ) {
							alt14=1;
						}
						}
						break;
					case LONG:
						{
						int LA14_8 = input.LA(3);
						if ( (synpred19_Java()) ) {
							alt14=1;
						}
						}
						break;
					case FLOAT:
						{
						int LA14_9 = input.LA(3);
						if ( (synpred19_Java()) ) {
							alt14=1;
						}
						}
						break;
					case DOUBLE:
						{
						int LA14_10 = input.LA(3);
						if ( (synpred19_Java()) ) {
							alt14=1;
						}
						}
						break;
					case IDENT:
						{
						int LA14_11 = input.LA(3);
						if ( (synpred19_Java()) ) {
							alt14=1;
						}
						}
						break;
				}
			}
			switch (alt14) {
				case 1 :
					// Java.g:526:21: bound
					{
					pushFollow(FOLLOW_bound_in_genericTypeParameter7259);
					bound46=bound();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_bound.add(bound46.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IDENT, bound
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 527:17: -> ^( IDENT ( bound )? )
			{
				// Java.g:527:21: ^( IDENT ( bound )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IDENT.nextNode(), root_1);
				// Java.g:527:29: ( bound )?
				if ( stream_bound.hasNext() ) {
					adaptor.addChild(root_1, stream_bound.nextTree());
				}
				stream_bound.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, genericTypeParameter_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "genericTypeParameter"


	public static class bound_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bound"
	// Java.g:530:1: bound : EXTENDS type ( AND type )* -> ^( EXTENDS_BOUND_LIST[$EXTENDS, \"EXTENDS_BOUND_LIST\"] ( type )+ ) ;
	public final JavaParser.bound_return bound() throws RecognitionException {
		JavaParser.bound_return retval = new JavaParser.bound_return();
		retval.start = input.LT(1);
		int bound_StartIndex = input.index();

		CommonTree root_0 = null;

		Token EXTENDS47=null;
		Token AND49=null;
		ParserRuleReturnScope type48 =null;
		ParserRuleReturnScope type50 =null;

		CommonTree EXTENDS47_tree=null;
		CommonTree AND49_tree=null;
		RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
		RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// Java.g:531:13: ( EXTENDS type ( AND type )* -> ^( EXTENDS_BOUND_LIST[$EXTENDS, \"EXTENDS_BOUND_LIST\"] ( type )+ ) )
			// Java.g:531:15: EXTENDS type ( AND type )*
			{
			EXTENDS47=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_bound7347); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS47);

			pushFollow(FOLLOW_type_in_bound7349);
			type48=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type48.getTree());
			// Java.g:531:28: ( AND type )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==AND) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// Java.g:531:29: AND type
					{
					AND49=(Token)match(input,AND,FOLLOW_AND_in_bound7352); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AND.add(AND49);

					pushFollow(FOLLOW_type_in_bound7354);
					type50=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type.add(type50.getTree());
					}
					break;

				default :
					break loop15;
				}
			}

			// AST REWRITE
			// elements: type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 532:17: -> ^( EXTENDS_BOUND_LIST[$EXTENDS, \"EXTENDS_BOUND_LIST\"] ( type )+ )
			{
				// Java.g:532:21: ^( EXTENDS_BOUND_LIST[$EXTENDS, \"EXTENDS_BOUND_LIST\"] ( type )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENDS_BOUND_LIST, EXTENDS47, "EXTENDS_BOUND_LIST"), root_1);
				if ( !(stream_type.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_type.hasNext() ) {
					adaptor.addChild(root_1, stream_type.nextTree());
				}
				stream_type.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, bound_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bound"


	public static class enumTypeDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enumTypeDeclaration"
	// Java.g:535:1: enumTypeDeclaration[CommonTree modifiers] : ENUM IDENT ( implementsClause )? enumBody -> ^( ENUM IDENT ( implementsClause )? enumBody ) ;
	public final JavaParser.enumTypeDeclaration_return enumTypeDeclaration(CommonTree modifiers) throws RecognitionException {
		JavaParser.enumTypeDeclaration_return retval = new JavaParser.enumTypeDeclaration_return();
		retval.start = input.LT(1);
		int enumTypeDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ENUM51=null;
		Token IDENT52=null;
		ParserRuleReturnScope implementsClause53 =null;
		ParserRuleReturnScope enumBody54 =null;

		CommonTree ENUM51_tree=null;
		CommonTree IDENT52_tree=null;
		RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
		RewriteRuleSubtreeStream stream_implementsClause=new RewriteRuleSubtreeStream(adaptor,"rule implementsClause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// Java.g:536:13: ( ENUM IDENT ( implementsClause )? enumBody -> ^( ENUM IDENT ( implementsClause )? enumBody ) )
			// Java.g:536:17: ENUM IDENT ( implementsClause )? enumBody
			{
			ENUM51=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumTypeDeclaration7427); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ENUM.add(ENUM51);

			IDENT52=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDeclaration7429); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT52);

			// Java.g:536:28: ( implementsClause )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==IMPLEMENTS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// Java.g:536:28: implementsClause
					{
					pushFollow(FOLLOW_implementsClause_in_enumTypeDeclaration7431);
					implementsClause53=implementsClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_implementsClause.add(implementsClause53.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_enumBody_in_enumTypeDeclaration7434);
			enumBody54=enumBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_enumBody.add(enumBody54.getTree());
			// AST REWRITE
			// elements: implementsClause, IDENT, ENUM, enumBody
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 537:17: -> ^( ENUM IDENT ( implementsClause )? enumBody )
			{
				// Java.g:537:21: ^( ENUM IDENT ( implementsClause )? enumBody )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);
				adaptor.addChild(root_1, modifiers);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// Java.g:537:47: ( implementsClause )?
				if ( stream_implementsClause.hasNext() ) {
					adaptor.addChild(root_1, stream_implementsClause.nextTree());
				}
				stream_implementsClause.reset();

				adaptor.addChild(root_1, stream_enumBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, enumTypeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumTypeDeclaration"


	public static class enumBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enumBody"
	// Java.g:540:1: enumBody : LCURLY enumScopeDeclarations RCURLY -> ^( ENUM_TOP_LEVEL_SCOPE[$LCURLY, \"ENUM_TOP_LEVEL_SCOPE\"] enumScopeDeclarations ) ;
	public final JavaParser.enumBody_return enumBody() throws RecognitionException {
		JavaParser.enumBody_return retval = new JavaParser.enumBody_return();
		retval.start = input.LT(1);
		int enumBody_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LCURLY55=null;
		Token RCURLY57=null;
		ParserRuleReturnScope enumScopeDeclarations56 =null;

		CommonTree LCURLY55_tree=null;
		CommonTree RCURLY57_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_enumScopeDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule enumScopeDeclarations");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// Java.g:541:13: ( LCURLY enumScopeDeclarations RCURLY -> ^( ENUM_TOP_LEVEL_SCOPE[$LCURLY, \"ENUM_TOP_LEVEL_SCOPE\"] enumScopeDeclarations ) )
			// Java.g:541:17: LCURLY enumScopeDeclarations RCURLY
			{
			LCURLY55=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_enumBody7513); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY55);

			if ( state.backtracking==0 ) {symbolTable.enterScope();}
			pushFollow(FOLLOW_enumScopeDeclarations_in_enumBody7516);
			enumScopeDeclarations56=enumScopeDeclarations();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_enumScopeDeclarations.add(enumScopeDeclarations56.getTree());
			if ( state.backtracking==0 ) {symbolTable.exitScope();}
			RCURLY57=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_enumBody7520); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY57);

			// AST REWRITE
			// elements: enumScopeDeclarations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 542:17: -> ^( ENUM_TOP_LEVEL_SCOPE[$LCURLY, \"ENUM_TOP_LEVEL_SCOPE\"] enumScopeDeclarations )
			{
				// Java.g:542:21: ^( ENUM_TOP_LEVEL_SCOPE[$LCURLY, \"ENUM_TOP_LEVEL_SCOPE\"] enumScopeDeclarations )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ENUM_TOP_LEVEL_SCOPE, LCURLY55, "ENUM_TOP_LEVEL_SCOPE"), root_1);
				adaptor.addChild(root_1, stream_enumScopeDeclarations.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, enumBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumBody"


	public static class enumScopeDeclarations_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enumScopeDeclarations"
	// Java.g:545:1: enumScopeDeclarations : enumConstants ( COMMA !)? ( enumClassScopeDeclarations )? ;
	public final JavaParser.enumScopeDeclarations_return enumScopeDeclarations() throws RecognitionException {
		JavaParser.enumScopeDeclarations_return retval = new JavaParser.enumScopeDeclarations_return();
		retval.start = input.LT(1);
		int enumScopeDeclarations_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA59=null;
		ParserRuleReturnScope enumConstants58 =null;
		ParserRuleReturnScope enumClassScopeDeclarations60 =null;

		CommonTree COMMA59_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// Java.g:546:13: ( enumConstants ( COMMA !)? ( enumClassScopeDeclarations )? )
			// Java.g:546:17: enumConstants ( COMMA !)? ( enumClassScopeDeclarations )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_enumConstants_in_enumScopeDeclarations7590);
			enumConstants58=enumConstants();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstants58.getTree());

			// Java.g:546:31: ( COMMA !)?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==COMMA) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// Java.g:546:32: COMMA !
					{
					COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumScopeDeclarations7593); if (state.failed) return retval;
					}
					break;

			}

			// Java.g:546:41: ( enumClassScopeDeclarations )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==SEMI) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// Java.g:546:41: enumClassScopeDeclarations
					{
					pushFollow(FOLLOW_enumClassScopeDeclarations_in_enumScopeDeclarations7598);
					enumClassScopeDeclarations60=enumClassScopeDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumClassScopeDeclarations60.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, enumScopeDeclarations_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumScopeDeclarations"


	public static class enumClassScopeDeclarations_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enumClassScopeDeclarations"
	// Java.g:549:1: enumClassScopeDeclarations : SEMI ( classScopeDeclarations )* -> ^( CLASS_TOP_LEVEL_SCOPE[$SEMI, \"CLASS_TOP_LEVEL_SCOPE\"] ( classScopeDeclarations )* ) ;
	public final JavaParser.enumClassScopeDeclarations_return enumClassScopeDeclarations() throws RecognitionException {
		JavaParser.enumClassScopeDeclarations_return retval = new JavaParser.enumClassScopeDeclarations_return();
		retval.start = input.LT(1);
		int enumClassScopeDeclarations_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SEMI61=null;
		ParserRuleReturnScope classScopeDeclarations62 =null;

		CommonTree SEMI61_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleSubtreeStream stream_classScopeDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule classScopeDeclarations");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// Java.g:550:13: ( SEMI ( classScopeDeclarations )* -> ^( CLASS_TOP_LEVEL_SCOPE[$SEMI, \"CLASS_TOP_LEVEL_SCOPE\"] ( classScopeDeclarations )* ) )
			// Java.g:550:17: SEMI ( classScopeDeclarations )*
			{
			SEMI61=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumClassScopeDeclarations7642); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMI.add(SEMI61);

			// Java.g:550:22: ( classScopeDeclarations )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==ABSTRACT||LA19_0==AT||LA19_0==BOOLEAN||LA19_0==BYTE||LA19_0==CHAR||LA19_0==CLASS||LA19_0==DOUBLE||LA19_0==ENUM||LA19_0==FINAL||LA19_0==FLOAT||LA19_0==IDENT||LA19_0==INT||LA19_0==INTERFACE||LA19_0==LCURLY||LA19_0==LESS_THAN||LA19_0==LONG||LA19_0==NATIVE||(LA19_0 >= PRIVATE && LA19_0 <= PUBLIC)||LA19_0==SEMI||LA19_0==SHORT||LA19_0==STATIC||LA19_0==STRICTFP||LA19_0==SYNCHRONIZED||LA19_0==TRANSIENT||LA19_0==VOID||LA19_0==VOLATILE) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Java.g:550:22: classScopeDeclarations
					{
					pushFollow(FOLLOW_classScopeDeclarations_in_enumClassScopeDeclarations7644);
					classScopeDeclarations62=classScopeDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classScopeDeclarations.add(classScopeDeclarations62.getTree());
					}
					break;

				default :
					break loop19;
				}
			}

			// AST REWRITE
			// elements: classScopeDeclarations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 551:17: -> ^( CLASS_TOP_LEVEL_SCOPE[$SEMI, \"CLASS_TOP_LEVEL_SCOPE\"] ( classScopeDeclarations )* )
			{
				// Java.g:551:21: ^( CLASS_TOP_LEVEL_SCOPE[$SEMI, \"CLASS_TOP_LEVEL_SCOPE\"] ( classScopeDeclarations )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS_TOP_LEVEL_SCOPE, SEMI61, "CLASS_TOP_LEVEL_SCOPE"), root_1);
				// Java.g:551:77: ( classScopeDeclarations )*
				while ( stream_classScopeDeclarations.hasNext() ) {
					adaptor.addChild(root_1, stream_classScopeDeclarations.nextTree());
				}
				stream_classScopeDeclarations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, enumClassScopeDeclarations_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumClassScopeDeclarations"


	public static class enumConstants_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enumConstants"
	// Java.g:554:1: enumConstants : enumConstant ( COMMA ! enumConstant )* ;
	public final JavaParser.enumConstants_return enumConstants() throws RecognitionException {
		JavaParser.enumConstants_return retval = new JavaParser.enumConstants_return();
		retval.start = input.LT(1);
		int enumConstants_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA64=null;
		ParserRuleReturnScope enumConstant63 =null;
		ParserRuleReturnScope enumConstant65 =null;

		CommonTree COMMA64_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// Java.g:555:13: ( enumConstant ( COMMA ! enumConstant )* )
			// Java.g:555:17: enumConstant ( COMMA ! enumConstant )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_enumConstant_in_enumConstants7715);
			enumConstant63=enumConstant();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstant63.getTree());

			// Java.g:555:30: ( COMMA ! enumConstant )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==COMMA) ) {
					int LA20_1 = input.LA(2);
					if ( (LA20_1==AT||LA20_1==IDENT) ) {
						alt20=1;
					}

				}

				switch (alt20) {
				case 1 :
					// Java.g:555:31: COMMA ! enumConstant
					{
					COMMA64=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumConstants7718); if (state.failed) return retval;
					pushFollow(FOLLOW_enumConstant_in_enumConstants7721);
					enumConstant65=enumConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstant65.getTree());

					}
					break;

				default :
					break loop20;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, enumConstants_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumConstants"


	public static class enumConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enumConstant"
	// Java.g:558:1: enumConstant : annotationList IDENT ^ ( arguments )? ( classBody )? ;
	public final JavaParser.enumConstant_return enumConstant() throws RecognitionException {
		JavaParser.enumConstant_return retval = new JavaParser.enumConstant_return();
		retval.start = input.LT(1);
		int enumConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IDENT67=null;
		ParserRuleReturnScope annotationList66 =null;
		ParserRuleReturnScope arguments68 =null;
		ParserRuleReturnScope classBody69 =null;

		CommonTree IDENT67_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// Java.g:559:13: ( annotationList IDENT ^ ( arguments )? ( classBody )? )
			// Java.g:559:17: annotationList IDENT ^ ( arguments )? ( classBody )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_annotationList_in_enumConstant7770);
			annotationList66=annotationList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationList66.getTree());

			IDENT67=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumConstant7772); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT67_tree = (CommonTree)adaptor.create(IDENT67);
			root_0 = (CommonTree)adaptor.becomeRoot(IDENT67_tree, root_0);
			}

			// Java.g:559:39: ( arguments )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LPAREN) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// Java.g:559:39: arguments
					{
					pushFollow(FOLLOW_arguments_in_enumConstant7775);
					arguments68=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments68.getTree());

					}
					break;

			}

			// Java.g:559:50: ( classBody )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LCURLY) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// Java.g:559:50: classBody
					{
					pushFollow(FOLLOW_classBody_in_enumConstant7778);
					classBody69=classBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody69.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, enumConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumConstant"


	public static class interfaceTypeDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "interfaceTypeDeclaration"
	// Java.g:562:1: interfaceTypeDeclaration[CommonTree modifiers] : INTERFACE IDENT ( genericTypeParameterList )? ( interfaceExtendsClause )? interfaceBody -> ^( INTERFACE IDENT ( genericTypeParameterList )? ( interfaceExtendsClause )? interfaceBody ) ;
	public final JavaParser.interfaceTypeDeclaration_return interfaceTypeDeclaration(CommonTree modifiers) throws RecognitionException {
		JavaParser.interfaceTypeDeclaration_return retval = new JavaParser.interfaceTypeDeclaration_return();
		retval.start = input.LT(1);
		int interfaceTypeDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INTERFACE70=null;
		Token IDENT71=null;
		ParserRuleReturnScope genericTypeParameterList72 =null;
		ParserRuleReturnScope interfaceExtendsClause73 =null;
		ParserRuleReturnScope interfaceBody74 =null;

		CommonTree INTERFACE70_tree=null;
		CommonTree IDENT71_tree=null;
		RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleSubtreeStream stream_interfaceBody=new RewriteRuleSubtreeStream(adaptor,"rule interfaceBody");
		RewriteRuleSubtreeStream stream_interfaceExtendsClause=new RewriteRuleSubtreeStream(adaptor,"rule interfaceExtendsClause");
		RewriteRuleSubtreeStream stream_genericTypeParameterList=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeParameterList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// Java.g:563:13: ( INTERFACE IDENT ( genericTypeParameterList )? ( interfaceExtendsClause )? interfaceBody -> ^( INTERFACE IDENT ( genericTypeParameterList )? ( interfaceExtendsClause )? interfaceBody ) )
			// Java.g:563:17: INTERFACE IDENT ( genericTypeParameterList )? ( interfaceExtendsClause )? interfaceBody
			{
			INTERFACE70=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceTypeDeclaration7827); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE70);

			IDENT71=(Token)match(input,IDENT,FOLLOW_IDENT_in_interfaceTypeDeclaration7829); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT71);

			// Java.g:563:33: ( genericTypeParameterList )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==LESS_THAN) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Java.g:563:33: genericTypeParameterList
					{
					pushFollow(FOLLOW_genericTypeParameterList_in_interfaceTypeDeclaration7831);
					genericTypeParameterList72=genericTypeParameterList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_genericTypeParameterList.add(genericTypeParameterList72.getTree());
					}
					break;

			}

			// Java.g:563:59: ( interfaceExtendsClause )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==EXTENDS) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Java.g:563:59: interfaceExtendsClause
					{
					pushFollow(FOLLOW_interfaceExtendsClause_in_interfaceTypeDeclaration7834);
					interfaceExtendsClause73=interfaceExtendsClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_interfaceExtendsClause.add(interfaceExtendsClause73.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_interfaceBody_in_interfaceTypeDeclaration7837);
			interfaceBody74=interfaceBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_interfaceBody.add(interfaceBody74.getTree());
			// AST REWRITE
			// elements: genericTypeParameterList, interfaceExtendsClause, IDENT, INTERFACE, interfaceBody
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 564:17: -> ^( INTERFACE IDENT ( genericTypeParameterList )? ( interfaceExtendsClause )? interfaceBody )
			{
				// Java.g:564:21: ^( INTERFACE IDENT ( genericTypeParameterList )? ( interfaceExtendsClause )? interfaceBody )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_INTERFACE.nextNode(), root_1);
				adaptor.addChild(root_1, modifiers);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// Java.g:564:52: ( genericTypeParameterList )?
				if ( stream_genericTypeParameterList.hasNext() ) {
					adaptor.addChild(root_1, stream_genericTypeParameterList.nextTree());
				}
				stream_genericTypeParameterList.reset();

				// Java.g:564:78: ( interfaceExtendsClause )?
				if ( stream_interfaceExtendsClause.hasNext() ) {
					adaptor.addChild(root_1, stream_interfaceExtendsClause.nextTree());
				}
				stream_interfaceExtendsClause.reset();

				adaptor.addChild(root_1, stream_interfaceBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, interfaceTypeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceTypeDeclaration"


	public static class typeList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typeList"
	// Java.g:567:1: typeList : type ( COMMA ! type )* ;
	public final JavaParser.typeList_return typeList() throws RecognitionException {
		JavaParser.typeList_return retval = new JavaParser.typeList_return();
		retval.start = input.LT(1);
		int typeList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA76=null;
		ParserRuleReturnScope type75 =null;
		ParserRuleReturnScope type77 =null;

		CommonTree COMMA76_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// Java.g:568:13: ( type ( COMMA ! type )* )
			// Java.g:568:17: type ( COMMA ! type )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_type_in_typeList7919);
			type75=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type75.getTree());

			// Java.g:568:22: ( COMMA ! type )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==COMMA) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// Java.g:568:23: COMMA ! type
					{
					COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList7922); if (state.failed) return retval;
					pushFollow(FOLLOW_type_in_typeList7925);
					type77=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type77.getTree());

					}
					break;

				default :
					break loop25;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, typeList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeList"


	public static class classBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classBody"
	// Java.g:571:1: classBody : LCURLY ( classScopeDeclarations )* RCURLY -> ^( CLASS_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( classScopeDeclarations )* ) ;
	public final JavaParser.classBody_return classBody() throws RecognitionException {
		JavaParser.classBody_return retval = new JavaParser.classBody_return();
		retval.start = input.LT(1);
		int classBody_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LCURLY78=null;
		Token RCURLY80=null;
		ParserRuleReturnScope classScopeDeclarations79 =null;

		CommonTree LCURLY78_tree=null;
		CommonTree RCURLY80_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_classScopeDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule classScopeDeclarations");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// Java.g:572:13: ( LCURLY ( classScopeDeclarations )* RCURLY -> ^( CLASS_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( classScopeDeclarations )* ) )
			// Java.g:572:17: LCURLY ( classScopeDeclarations )* RCURLY
			{
			LCURLY78=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_classBody7974); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY78);

			if ( state.backtracking==0 ) {
			    symbolTable.enterScope();  
			    String defaultName = "defaultPolyverse";
			    metaVarStack.push(defaultName);
			    metaPairStack.push(defaultName);
			    tokens.insertAfter(LCURLY78,"\n static Polyverse " + defaultName + " = new Polyverse();\n");
			  }
			// Java.g:580:18: ( classScopeDeclarations )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==ABSTRACT||LA26_0==AT||LA26_0==BOOLEAN||LA26_0==BYTE||LA26_0==CHAR||LA26_0==CLASS||LA26_0==DOUBLE||LA26_0==ENUM||LA26_0==FINAL||LA26_0==FLOAT||LA26_0==IDENT||LA26_0==INT||LA26_0==INTERFACE||LA26_0==LCURLY||LA26_0==LESS_THAN||LA26_0==LONG||LA26_0==NATIVE||(LA26_0 >= PRIVATE && LA26_0 <= PUBLIC)||LA26_0==SEMI||LA26_0==SHORT||LA26_0==STATIC||LA26_0==STRICTFP||LA26_0==SYNCHRONIZED||LA26_0==TRANSIENT||LA26_0==VOID||LA26_0==VOLATILE) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// Java.g:580:18: classScopeDeclarations
					{
					pushFollow(FOLLOW_classScopeDeclarations_in_classBody7999);
					classScopeDeclarations79=classScopeDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classScopeDeclarations.add(classScopeDeclarations79.getTree());
					}
					break;

				default :
					break loop26;
				}
			}

			if ( state.backtracking==0 ) {
			    metaVarStack.pop();
			    metaPairStack.pop();
			    symbolTable.exitScope();
			  }
			RCURLY80=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_classBody8024); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY80);

			// AST REWRITE
			// elements: classScopeDeclarations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 587:17: -> ^( CLASS_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( classScopeDeclarations )* )
			{
				// Java.g:587:21: ^( CLASS_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( classScopeDeclarations )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS_TOP_LEVEL_SCOPE, LCURLY78, "CLASS_TOP_LEVEL_SCOPE"), root_1);
				// Java.g:587:79: ( classScopeDeclarations )*
				while ( stream_classScopeDeclarations.hasNext() ) {
					adaptor.addChild(root_1, stream_classScopeDeclarations.nextTree());
				}
				stream_classScopeDeclarations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, classBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classBody"


	public static class interfaceBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "interfaceBody"
	// Java.g:590:1: interfaceBody : LCURLY ( interfaceScopeDeclarations )* RCURLY -> ^( INTERFACE_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( interfaceScopeDeclarations )* ) ;
	public final JavaParser.interfaceBody_return interfaceBody() throws RecognitionException {
		JavaParser.interfaceBody_return retval = new JavaParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LCURLY81=null;
		Token RCURLY83=null;
		ParserRuleReturnScope interfaceScopeDeclarations82 =null;

		CommonTree LCURLY81_tree=null;
		CommonTree RCURLY83_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_interfaceScopeDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule interfaceScopeDeclarations");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// Java.g:591:13: ( LCURLY ( interfaceScopeDeclarations )* RCURLY -> ^( INTERFACE_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( interfaceScopeDeclarations )* ) )
			// Java.g:591:17: LCURLY ( interfaceScopeDeclarations )* RCURLY
			{
			LCURLY81=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_interfaceBody8098); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY81);

			if ( state.backtracking==0 ) {symbolTable.enterScope();}
			// Java.g:591:52: ( interfaceScopeDeclarations )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==ABSTRACT||LA27_0==AT||LA27_0==BOOLEAN||LA27_0==BYTE||LA27_0==CHAR||LA27_0==CLASS||LA27_0==DOUBLE||LA27_0==ENUM||LA27_0==FINAL||LA27_0==FLOAT||LA27_0==IDENT||LA27_0==INT||LA27_0==INTERFACE||LA27_0==LESS_THAN||LA27_0==LONG||LA27_0==NATIVE||(LA27_0 >= PRIVATE && LA27_0 <= PUBLIC)||LA27_0==SEMI||LA27_0==SHORT||LA27_0==STATIC||LA27_0==STRICTFP||LA27_0==SYNCHRONIZED||LA27_0==TRANSIENT||LA27_0==VOID||LA27_0==VOLATILE) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Java.g:591:52: interfaceScopeDeclarations
					{
					pushFollow(FOLLOW_interfaceScopeDeclarations_in_interfaceBody8102);
					interfaceScopeDeclarations82=interfaceScopeDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_interfaceScopeDeclarations.add(interfaceScopeDeclarations82.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

			if ( state.backtracking==0 ) {symbolTable.exitScope();}
			RCURLY83=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_interfaceBody8106); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY83);

			// AST REWRITE
			// elements: interfaceScopeDeclarations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 592:17: -> ^( INTERFACE_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( interfaceScopeDeclarations )* )
			{
				// Java.g:592:21: ^( INTERFACE_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( interfaceScopeDeclarations )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INTERFACE_TOP_LEVEL_SCOPE, LCURLY81, "CLASS_TOP_LEVEL_SCOPE"), root_1);
				// Java.g:592:83: ( interfaceScopeDeclarations )*
				while ( stream_interfaceScopeDeclarations.hasNext() ) {
					adaptor.addChild(root_1, stream_interfaceScopeDeclarations.nextTree());
				}
				stream_interfaceScopeDeclarations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, interfaceBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceBody"


	public static class classScopeDeclarations_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classScopeDeclarations"
	// Java.g:595:1: classScopeDeclarations : ( block -> ^( CLASS_INSTANCE_INITIALIZER block ) | STATIC block -> ^( CLASS_STATIC_INITIALIZER[$STATIC, \"CLASS_STATIC_INITIALIZER\"] block ) | modifierList ( ( genericTypeParameterList )? (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) |id= IDENT formalParameterList ( throwsClause )? block -> ^( CONSTRUCTOR_DECL[$id, \"CONSTRUCTOR_DECL\"] modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) ) | type classFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type classFieldDeclaratorList ) ) | typeDeclaration | SEMI !);
	public final JavaParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
		JavaParser.classScopeDeclarations_return retval = new JavaParser.classScopeDeclarations_return();
		retval.start = input.LT(1);
		int classScopeDeclarations_StartIndex = input.index();

		CommonTree root_0 = null;

		Token id=null;
		Token STATIC85=null;
		Token IDENT89=null;
		Token SEMI94=null;
		Token VOID95=null;
		Token IDENT96=null;
		Token SEMI100=null;
		Token SEMI106=null;
		Token SEMI108=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope block84 =null;
		ParserRuleReturnScope block86 =null;
		ParserRuleReturnScope modifierList87 =null;
		ParserRuleReturnScope genericTypeParameterList88 =null;
		ParserRuleReturnScope formalParameterList90 =null;
		ParserRuleReturnScope arrayDeclaratorList91 =null;
		ParserRuleReturnScope throwsClause92 =null;
		ParserRuleReturnScope block93 =null;
		ParserRuleReturnScope formalParameterList97 =null;
		ParserRuleReturnScope throwsClause98 =null;
		ParserRuleReturnScope block99 =null;
		ParserRuleReturnScope formalParameterList101 =null;
		ParserRuleReturnScope throwsClause102 =null;
		ParserRuleReturnScope block103 =null;
		ParserRuleReturnScope type104 =null;
		ParserRuleReturnScope classFieldDeclaratorList105 =null;
		ParserRuleReturnScope typeDeclaration107 =null;

		CommonTree id_tree=null;
		CommonTree STATIC85_tree=null;
		CommonTree IDENT89_tree=null;
		CommonTree SEMI94_tree=null;
		CommonTree VOID95_tree=null;
		CommonTree IDENT96_tree=null;
		CommonTree SEMI100_tree=null;
		CommonTree SEMI106_tree=null;
		CommonTree SEMI108_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
		RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
		RewriteRuleSubtreeStream stream_throwsClause=new RewriteRuleSubtreeStream(adaptor,"rule throwsClause");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_genericTypeParameterList=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeParameterList");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_modifierList=new RewriteRuleSubtreeStream(adaptor,"rule modifierList");
		RewriteRuleSubtreeStream stream_arrayDeclaratorList=new RewriteRuleSubtreeStream(adaptor,"rule arrayDeclaratorList");
		RewriteRuleSubtreeStream stream_classFieldDeclaratorList=new RewriteRuleSubtreeStream(adaptor,"rule classFieldDeclaratorList");
		RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// Java.g:596:13: ( block -> ^( CLASS_INSTANCE_INITIALIZER block ) | STATIC block -> ^( CLASS_STATIC_INITIALIZER[$STATIC, \"CLASS_STATIC_INITIALIZER\"] block ) | modifierList ( ( genericTypeParameterList )? (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) |id= IDENT formalParameterList ( throwsClause )? block -> ^( CONSTRUCTOR_DECL[$id, \"CONSTRUCTOR_DECL\"] modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) ) | type classFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type classFieldDeclaratorList ) ) | typeDeclaration | SEMI !)
			int alt37=5;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt37=1;
				}
				break;
			case STATIC:
				{
				int LA37_2 = input.LA(2);
				if ( (synpred34_Java()) ) {
					alt37=2;
				}
				else if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PUBLIC:
				{
				int LA37_3 = input.LA(2);
				if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PROTECTED:
				{
				int LA37_4 = input.LA(2);
				if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PRIVATE:
				{
				int LA37_5 = input.LA(2);
				if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ABSTRACT:
				{
				int LA37_6 = input.LA(2);
				if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NATIVE:
				{
				int LA37_7 = input.LA(2);
				if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SYNCHRONIZED:
				{
				int LA37_8 = input.LA(2);
				if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TRANSIENT:
				{
				int LA37_9 = input.LA(2);
				if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOLATILE:
				{
				int LA37_10 = input.LA(2);
				if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRICTFP:
				{
				int LA37_11 = input.LA(2);
				if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FINAL:
				{
				int LA37_12 = input.LA(2);
				if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT:
				{
				int LA37_13 = input.LA(2);
				if ( (synpred45_Java()) ) {
					alt37=3;
				}
				else if ( (synpred46_Java()) ) {
					alt37=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case IDENT:
			case INT:
			case LESS_THAN:
			case LONG:
			case SHORT:
			case VOID:
				{
				alt37=3;
				}
				break;
			case CLASS:
			case ENUM:
			case INTERFACE:
				{
				alt37=4;
				}
				break;
			case SEMI:
				{
				alt37=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// Java.g:596:17: block
					{
					pushFollow(FOLLOW_block_in_classScopeDeclarations8176);
					block84=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_block.add(block84.getTree());
					// AST REWRITE
					// elements: block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 596:33: -> ^( CLASS_INSTANCE_INITIALIZER block )
					{
						// Java.g:596:37: ^( CLASS_INSTANCE_INITIALIZER block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS_INSTANCE_INITIALIZER, "CLASS_INSTANCE_INITIALIZER"), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Java.g:597:17: STATIC block
					{
					STATIC85=(Token)match(input,STATIC,FOLLOW_STATIC_in_classScopeDeclarations8213); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STATIC.add(STATIC85);

					pushFollow(FOLLOW_block_in_classScopeDeclarations8215);
					block86=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_block.add(block86.getTree());
					// AST REWRITE
					// elements: block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 597:33: -> ^( CLASS_STATIC_INITIALIZER[$STATIC, \"CLASS_STATIC_INITIALIZER\"] block )
					{
						// Java.g:597:37: ^( CLASS_STATIC_INITIALIZER[$STATIC, \"CLASS_STATIC_INITIALIZER\"] block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS_STATIC_INITIALIZER, STATIC85, "CLASS_STATIC_INITIALIZER"), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Java.g:598:17: modifierList ( ( genericTypeParameterList )? (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) |id= IDENT formalParameterList ( throwsClause )? block -> ^( CONSTRUCTOR_DECL[$id, \"CONSTRUCTOR_DECL\"] modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) ) | type classFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type classFieldDeclaratorList ) )
					{
					pushFollow(FOLLOW_modifierList_in_classScopeDeclarations8246);
					modifierList87=modifierList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_modifierList.add(modifierList87.getTree());
					// Java.g:599:17: ( ( genericTypeParameterList )? (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) |id= IDENT formalParameterList ( throwsClause )? block -> ^( CONSTRUCTOR_DECL[$id, \"CONSTRUCTOR_DECL\"] modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) ) | type classFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type classFieldDeclaratorList ) )
					int alt36=2;
					switch ( input.LA(1) ) {
					case LESS_THAN:
					case VOID:
						{
						alt36=1;
						}
						break;
					case BOOLEAN:
						{
						int LA36_2 = input.LA(2);
						if ( (synpred44_Java()) ) {
							alt36=1;
						}
						else if ( (true) ) {
							alt36=2;
						}

						}
						break;
					case CHAR:
						{
						int LA36_3 = input.LA(2);
						if ( (synpred44_Java()) ) {
							alt36=1;
						}
						else if ( (true) ) {
							alt36=2;
						}

						}
						break;
					case BYTE:
						{
						int LA36_4 = input.LA(2);
						if ( (synpred44_Java()) ) {
							alt36=1;
						}
						else if ( (true) ) {
							alt36=2;
						}

						}
						break;
					case SHORT:
						{
						int LA36_5 = input.LA(2);
						if ( (synpred44_Java()) ) {
							alt36=1;
						}
						else if ( (true) ) {
							alt36=2;
						}

						}
						break;
					case INT:
						{
						int LA36_6 = input.LA(2);
						if ( (synpred44_Java()) ) {
							alt36=1;
						}
						else if ( (true) ) {
							alt36=2;
						}

						}
						break;
					case LONG:
						{
						int LA36_7 = input.LA(2);
						if ( (synpred44_Java()) ) {
							alt36=1;
						}
						else if ( (true) ) {
							alt36=2;
						}

						}
						break;
					case FLOAT:
						{
						int LA36_8 = input.LA(2);
						if ( (synpred44_Java()) ) {
							alt36=1;
						}
						else if ( (true) ) {
							alt36=2;
						}

						}
						break;
					case DOUBLE:
						{
						int LA36_9 = input.LA(2);
						if ( (synpred44_Java()) ) {
							alt36=1;
						}
						else if ( (true) ) {
							alt36=2;
						}

						}
						break;
					case IDENT:
						{
						int LA36_10 = input.LA(2);
						if ( (synpred44_Java()) ) {
							alt36=1;
						}
						else if ( (true) ) {
							alt36=2;
						}

						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						throw nvae;
					}
					switch (alt36) {
						case 1 :
							// Java.g:599:21: ( genericTypeParameterList )? (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) |id= IDENT formalParameterList ( throwsClause )? block -> ^( CONSTRUCTOR_DECL[$id, \"CONSTRUCTOR_DECL\"] modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
							{
							// Java.g:599:21: ( genericTypeParameterList )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==LESS_THAN) ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// Java.g:599:21: genericTypeParameterList
									{
									pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations8268);
									genericTypeParameterList88=genericTypeParameterList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_genericTypeParameterList.add(genericTypeParameterList88.getTree());
									}
									break;

							}

							// Java.g:600:21: (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) |id= IDENT formalParameterList ( throwsClause )? block -> ^( CONSTRUCTOR_DECL[$id, \"CONSTRUCTOR_DECL\"] modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
							int alt35=3;
							switch ( input.LA(1) ) {
							case BOOLEAN:
							case BYTE:
							case CHAR:
							case DOUBLE:
							case FLOAT:
							case INT:
							case LONG:
							case SHORT:
								{
								alt35=1;
								}
								break;
							case IDENT:
								{
								int LA35_2 = input.LA(2);
								if ( (LA35_2==DOT||LA35_2==IDENT||LA35_2==LBRACK||LA35_2==LESS_THAN) ) {
									alt35=1;
								}
								else if ( (LA35_2==LPAREN) ) {
									alt35=3;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 35, 2, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case VOID:
								{
								alt35=2;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 35, 0, input);
								throw nvae;
							}
							switch (alt35) {
								case 1 :
									// Java.g:600:25: q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI )
									{
									pushFollow(FOLLOW_type_in_classScopeDeclarations8297);
									q=type();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_type.add(q.getTree());
									if ( state.backtracking==0 ) {
									    if (PolyverseScope.isPolyverse()) returnType=(q!=null?input.toString(q.start,q.stop):null) /*ident*/;
									  }
									IDENT89=(Token)match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations8329); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_IDENT.add(IDENT89);

									pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations8331);
									formalParameterList90=formalParameterList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_formalParameterList.add(formalParameterList90.getTree());
									// Java.g:604:51: ( arrayDeclaratorList )?
									int alt29=2;
									int LA29_0 = input.LA(1);
									if ( (LA29_0==LBRACK) ) {
										alt29=1;
									}
									switch (alt29) {
										case 1 :
											// Java.g:604:51: arrayDeclaratorList
											{
											pushFollow(FOLLOW_arrayDeclaratorList_in_classScopeDeclarations8333);
											arrayDeclaratorList91=arrayDeclaratorList();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) stream_arrayDeclaratorList.add(arrayDeclaratorList91.getTree());
											}
											break;

									}

									// Java.g:604:72: ( throwsClause )?
									int alt30=2;
									int LA30_0 = input.LA(1);
									if ( (LA30_0==THROWS) ) {
										alt30=1;
									}
									switch (alt30) {
										case 1 :
											// Java.g:604:72: throwsClause
											{
											pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations8336);
											throwsClause92=throwsClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) stream_throwsClause.add(throwsClause92.getTree());
											}
											break;

									}

									// Java.g:604:86: ( block | SEMI )
									int alt31=2;
									int LA31_0 = input.LA(1);
									if ( (LA31_0==LCURLY) ) {
										alt31=1;
									}
									else if ( (LA31_0==SEMI) ) {
										alt31=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										NoViableAltException nvae =
											new NoViableAltException("", 31, 0, input);
										throw nvae;
									}

									switch (alt31) {
										case 1 :
											// Java.g:604:87: block
											{
											pushFollow(FOLLOW_block_in_classScopeDeclarations8340);
											block93=block();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) stream_block.add(block93.getTree());
											}
											break;
										case 2 :
											// Java.g:604:95: SEMI
											{
											SEMI94=(Token)match(input,SEMI,FOLLOW_SEMI_in_classScopeDeclarations8344); if (state.failed) return retval; 
											if ( state.backtracking==0 ) stream_SEMI.add(SEMI94);

											}
											break;

									}

									if ( state.backtracking==0 ) {
									    metaVarStack.pop();
									  }
									// AST REWRITE
									// elements: block, formalParameterList, arrayDeclaratorList, throwsClause, type, modifierList, IDENT, genericTypeParameterList
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 608:25: -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
									{
										// Java.g:608:29: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_METHOD_DECL, "FUNCTION_METHOD_DECL"), root_1);
										adaptor.addChild(root_1, stream_modifierList.nextTree());
										// Java.g:608:65: ( genericTypeParameterList )?
										if ( stream_genericTypeParameterList.hasNext() ) {
											adaptor.addChild(root_1, stream_genericTypeParameterList.nextTree());
										}
										stream_genericTypeParameterList.reset();

										adaptor.addChild(root_1, stream_type.nextTree());
										adaptor.addChild(root_1, stream_IDENT.nextNode());
										adaptor.addChild(root_1, stream_formalParameterList.nextTree());
										// Java.g:608:122: ( arrayDeclaratorList )?
										if ( stream_arrayDeclaratorList.hasNext() ) {
											adaptor.addChild(root_1, stream_arrayDeclaratorList.nextTree());
										}
										stream_arrayDeclaratorList.reset();

										// Java.g:608:143: ( throwsClause )?
										if ( stream_throwsClause.hasNext() ) {
											adaptor.addChild(root_1, stream_throwsClause.nextTree());
										}
										stream_throwsClause.reset();

										// Java.g:608:157: ( block )?
										if ( stream_block.hasNext() ) {
											adaptor.addChild(root_1, stream_block.nextTree());
										}
										stream_block.reset();

										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;
								case 2 :
									// Java.g:609:25: VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI )
									{
									VOID95=(Token)match(input,VOID,FOLLOW_VOID_in_classScopeDeclarations8427); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_VOID.add(VOID95);

									IDENT96=(Token)match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations8429); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_IDENT.add(IDENT96);

									pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations8431);
									formalParameterList97=formalParameterList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_formalParameterList.add(formalParameterList97.getTree());
									// Java.g:609:56: ( throwsClause )?
									int alt32=2;
									int LA32_0 = input.LA(1);
									if ( (LA32_0==THROWS) ) {
										alt32=1;
									}
									switch (alt32) {
										case 1 :
											// Java.g:609:56: throwsClause
											{
											pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations8433);
											throwsClause98=throwsClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) stream_throwsClause.add(throwsClause98.getTree());
											}
											break;

									}

									// Java.g:609:70: ( block | SEMI )
									int alt33=2;
									int LA33_0 = input.LA(1);
									if ( (LA33_0==LCURLY) ) {
										alt33=1;
									}
									else if ( (LA33_0==SEMI) ) {
										alt33=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										NoViableAltException nvae =
											new NoViableAltException("", 33, 0, input);
										throw nvae;
									}

									switch (alt33) {
										case 1 :
											// Java.g:609:71: block
											{
											pushFollow(FOLLOW_block_in_classScopeDeclarations8437);
											block99=block();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) stream_block.add(block99.getTree());
											}
											break;
										case 2 :
											// Java.g:609:79: SEMI
											{
											SEMI100=(Token)match(input,SEMI,FOLLOW_SEMI_in_classScopeDeclarations8441); if (state.failed) return retval; 
											if ( state.backtracking==0 ) stream_SEMI.add(SEMI100);

											}
											break;

									}

									// AST REWRITE
									// elements: block, IDENT, formalParameterList, throwsClause, modifierList, genericTypeParameterList
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 610:25: -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
									{
										// Java.g:610:29: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VOID_METHOD_DECL, "VOID_METHOD_DECL"), root_1);
										adaptor.addChild(root_1, stream_modifierList.nextTree());
										// Java.g:610:61: ( genericTypeParameterList )?
										if ( stream_genericTypeParameterList.hasNext() ) {
											adaptor.addChild(root_1, stream_genericTypeParameterList.nextTree());
										}
										stream_genericTypeParameterList.reset();

										adaptor.addChild(root_1, stream_IDENT.nextNode());
										adaptor.addChild(root_1, stream_formalParameterList.nextTree());
										// Java.g:610:113: ( throwsClause )?
										if ( stream_throwsClause.hasNext() ) {
											adaptor.addChild(root_1, stream_throwsClause.nextTree());
										}
										stream_throwsClause.reset();

										// Java.g:610:127: ( block )?
										if ( stream_block.hasNext() ) {
											adaptor.addChild(root_1, stream_block.nextTree());
										}
										stream_block.reset();

										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;
								case 3 :
									// Java.g:611:25: id= IDENT formalParameterList ( throwsClause )? block
									{
									id=(Token)match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations8516); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_IDENT.add(id);

									pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations8518);
									formalParameterList101=formalParameterList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_formalParameterList.add(formalParameterList101.getTree());
									// Java.g:611:54: ( throwsClause )?
									int alt34=2;
									int LA34_0 = input.LA(1);
									if ( (LA34_0==THROWS) ) {
										alt34=1;
									}
									switch (alt34) {
										case 1 :
											// Java.g:611:54: throwsClause
											{
											pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations8520);
											throwsClause102=throwsClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) stream_throwsClause.add(throwsClause102.getTree());
											}
											break;

									}

									pushFollow(FOLLOW_block_in_classScopeDeclarations8523);
									block103=block();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_block.add(block103.getTree());
									// AST REWRITE
									// elements: throwsClause, genericTypeParameterList, modifierList, block, formalParameterList
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 612:25: -> ^( CONSTRUCTOR_DECL[$id, \"CONSTRUCTOR_DECL\"] modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
									{
										// Java.g:612:29: ^( CONSTRUCTOR_DECL[$id, \"CONSTRUCTOR_DECL\"] modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONSTRUCTOR_DECL, id, "CONSTRUCTOR_DECL"), root_1);
										adaptor.addChild(root_1, stream_modifierList.nextTree());
										// Java.g:612:86: ( genericTypeParameterList )?
										if ( stream_genericTypeParameterList.hasNext() ) {
											adaptor.addChild(root_1, stream_genericTypeParameterList.nextTree());
										}
										stream_genericTypeParameterList.reset();

										adaptor.addChild(root_1, stream_formalParameterList.nextTree());
										// Java.g:612:132: ( throwsClause )?
										if ( stream_throwsClause.hasNext() ) {
											adaptor.addChild(root_1, stream_throwsClause.nextTree());
										}
										stream_throwsClause.reset();

										adaptor.addChild(root_1, stream_block.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// Java.g:614:21: type classFieldDeclaratorList SEMI
							{
							pushFollow(FOLLOW_type_in_classScopeDeclarations8611);
							type104=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type.add(type104.getTree());
							pushFollow(FOLLOW_classFieldDeclaratorList_in_classScopeDeclarations8613);
							classFieldDeclaratorList105=classFieldDeclaratorList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_classFieldDeclaratorList.add(classFieldDeclaratorList105.getTree());
							SEMI106=(Token)match(input,SEMI,FOLLOW_SEMI_in_classScopeDeclarations8615); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI.add(SEMI106);

							// AST REWRITE
							// elements: modifierList, type, classFieldDeclaratorList
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 615:21: -> ^( VAR_DECLARATION modifierList type classFieldDeclaratorList )
							{
								// Java.g:615:25: ^( VAR_DECLARATION modifierList type classFieldDeclaratorList )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECLARATION, "VAR_DECLARATION"), root_1);
								adaptor.addChild(root_1, stream_modifierList.nextTree());
								adaptor.addChild(root_1, stream_type.nextTree());
								adaptor.addChild(root_1, stream_classFieldDeclaratorList.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 4 :
					// Java.g:617:17: typeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations8684);
					typeDeclaration107=typeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration107.getTree());

					}
					break;
				case 5 :
					// Java.g:618:17: SEMI !
					{
					root_0 = (CommonTree)adaptor.nil();


					SEMI108=(Token)match(input,SEMI,FOLLOW_SEMI_in_classScopeDeclarations8702); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, classScopeDeclarations_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classScopeDeclarations"


	public static class interfaceScopeDeclarations_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "interfaceScopeDeclarations"
	// Java.g:621:1: interfaceScopeDeclarations : ( modifierList ( ( genericTypeParameterList )? ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | VOID IDENT formalParameterList ( throwsClause )? SEMI -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) ) | type interfaceFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type interfaceFieldDeclaratorList ) ) | typeDeclaration | SEMI !);
	public final JavaParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException {
		JavaParser.interfaceScopeDeclarations_return retval = new JavaParser.interfaceScopeDeclarations_return();
		retval.start = input.LT(1);
		int interfaceScopeDeclarations_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IDENT112=null;
		Token SEMI116=null;
		Token VOID117=null;
		Token IDENT118=null;
		Token SEMI121=null;
		Token SEMI124=null;
		Token SEMI126=null;
		ParserRuleReturnScope modifierList109 =null;
		ParserRuleReturnScope genericTypeParameterList110 =null;
		ParserRuleReturnScope type111 =null;
		ParserRuleReturnScope formalParameterList113 =null;
		ParserRuleReturnScope arrayDeclaratorList114 =null;
		ParserRuleReturnScope throwsClause115 =null;
		ParserRuleReturnScope formalParameterList119 =null;
		ParserRuleReturnScope throwsClause120 =null;
		ParserRuleReturnScope type122 =null;
		ParserRuleReturnScope interfaceFieldDeclaratorList123 =null;
		ParserRuleReturnScope typeDeclaration125 =null;

		CommonTree IDENT112_tree=null;
		CommonTree SEMI116_tree=null;
		CommonTree VOID117_tree=null;
		CommonTree IDENT118_tree=null;
		CommonTree SEMI121_tree=null;
		CommonTree SEMI124_tree=null;
		CommonTree SEMI126_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
		RewriteRuleSubtreeStream stream_throwsClause=new RewriteRuleSubtreeStream(adaptor,"rule throwsClause");
		RewriteRuleSubtreeStream stream_interfaceFieldDeclaratorList=new RewriteRuleSubtreeStream(adaptor,"rule interfaceFieldDeclaratorList");
		RewriteRuleSubtreeStream stream_genericTypeParameterList=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeParameterList");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_modifierList=new RewriteRuleSubtreeStream(adaptor,"rule modifierList");
		RewriteRuleSubtreeStream stream_arrayDeclaratorList=new RewriteRuleSubtreeStream(adaptor,"rule arrayDeclaratorList");
		RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// Java.g:622:13: ( modifierList ( ( genericTypeParameterList )? ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | VOID IDENT formalParameterList ( throwsClause )? SEMI -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) ) | type interfaceFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type interfaceFieldDeclaratorList ) ) | typeDeclaration | SEMI !)
			int alt44=3;
			switch ( input.LA(1) ) {
			case PUBLIC:
				{
				int LA44_1 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PROTECTED:
				{
				int LA44_2 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PRIVATE:
				{
				int LA44_3 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STATIC:
				{
				int LA44_4 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ABSTRACT:
				{
				int LA44_5 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NATIVE:
				{
				int LA44_6 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SYNCHRONIZED:
				{
				int LA44_7 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TRANSIENT:
				{
				int LA44_8 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOLATILE:
				{
				int LA44_9 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRICTFP:
				{
				int LA44_10 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FINAL:
				{
				int LA44_11 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT:
				{
				int LA44_12 = input.LA(2);
				if ( (synpred53_Java()) ) {
					alt44=1;
				}
				else if ( (synpred54_Java()) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case IDENT:
			case INT:
			case LESS_THAN:
			case LONG:
			case SHORT:
			case VOID:
				{
				alt44=1;
				}
				break;
			case CLASS:
			case ENUM:
			case INTERFACE:
				{
				alt44=2;
				}
				break;
			case SEMI:
				{
				alt44=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// Java.g:622:17: modifierList ( ( genericTypeParameterList )? ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | VOID IDENT formalParameterList ( throwsClause )? SEMI -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) ) | type interfaceFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type interfaceFieldDeclaratorList ) )
					{
					pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations8758);
					modifierList109=modifierList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_modifierList.add(modifierList109.getTree());
					// Java.g:623:17: ( ( genericTypeParameterList )? ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | VOID IDENT formalParameterList ( throwsClause )? SEMI -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) ) | type interfaceFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type interfaceFieldDeclaratorList ) )
					int alt43=2;
					switch ( input.LA(1) ) {
					case LESS_THAN:
					case VOID:
						{
						alt43=1;
						}
						break;
					case BOOLEAN:
						{
						int LA43_2 = input.LA(2);
						if ( (synpred52_Java()) ) {
							alt43=1;
						}
						else if ( (true) ) {
							alt43=2;
						}

						}
						break;
					case CHAR:
						{
						int LA43_3 = input.LA(2);
						if ( (synpred52_Java()) ) {
							alt43=1;
						}
						else if ( (true) ) {
							alt43=2;
						}

						}
						break;
					case BYTE:
						{
						int LA43_4 = input.LA(2);
						if ( (synpred52_Java()) ) {
							alt43=1;
						}
						else if ( (true) ) {
							alt43=2;
						}

						}
						break;
					case SHORT:
						{
						int LA43_5 = input.LA(2);
						if ( (synpred52_Java()) ) {
							alt43=1;
						}
						else if ( (true) ) {
							alt43=2;
						}

						}
						break;
					case INT:
						{
						int LA43_6 = input.LA(2);
						if ( (synpred52_Java()) ) {
							alt43=1;
						}
						else if ( (true) ) {
							alt43=2;
						}

						}
						break;
					case LONG:
						{
						int LA43_7 = input.LA(2);
						if ( (synpred52_Java()) ) {
							alt43=1;
						}
						else if ( (true) ) {
							alt43=2;
						}

						}
						break;
					case FLOAT:
						{
						int LA43_8 = input.LA(2);
						if ( (synpred52_Java()) ) {
							alt43=1;
						}
						else if ( (true) ) {
							alt43=2;
						}

						}
						break;
					case DOUBLE:
						{
						int LA43_9 = input.LA(2);
						if ( (synpred52_Java()) ) {
							alt43=1;
						}
						else if ( (true) ) {
							alt43=2;
						}

						}
						break;
					case IDENT:
						{
						int LA43_10 = input.LA(2);
						if ( (synpred52_Java()) ) {
							alt43=1;
						}
						else if ( (true) ) {
							alt43=2;
						}

						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 43, 0, input);
						throw nvae;
					}
					switch (alt43) {
						case 1 :
							// Java.g:623:21: ( genericTypeParameterList )? ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | VOID IDENT formalParameterList ( throwsClause )? SEMI -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) )
							{
							// Java.g:623:21: ( genericTypeParameterList )?
							int alt38=2;
							int LA38_0 = input.LA(1);
							if ( (LA38_0==LESS_THAN) ) {
								alt38=1;
							}
							switch (alt38) {
								case 1 :
									// Java.g:623:21: genericTypeParameterList
									{
									pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations8780);
									genericTypeParameterList110=genericTypeParameterList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_genericTypeParameterList.add(genericTypeParameterList110.getTree());
									}
									break;

							}

							// Java.g:624:21: ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | VOID IDENT formalParameterList ( throwsClause )? SEMI -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) )
							int alt42=2;
							int LA42_0 = input.LA(1);
							if ( (LA42_0==BOOLEAN||LA42_0==BYTE||LA42_0==CHAR||LA42_0==DOUBLE||LA42_0==FLOAT||LA42_0==IDENT||LA42_0==INT||LA42_0==LONG||LA42_0==SHORT) ) {
								alt42=1;
							}
							else if ( (LA42_0==VOID) ) {
								alt42=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 42, 0, input);
								throw nvae;
							}

							switch (alt42) {
								case 1 :
									// Java.g:624:25: type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI
									{
									pushFollow(FOLLOW_type_in_interfaceScopeDeclarations8807);
									type111=type();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_type.add(type111.getTree());
									IDENT112=(Token)match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations8809); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_IDENT.add(IDENT112);

									pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations8811);
									formalParameterList113=formalParameterList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_formalParameterList.add(formalParameterList113.getTree());
									// Java.g:624:56: ( arrayDeclaratorList )?
									int alt39=2;
									int LA39_0 = input.LA(1);
									if ( (LA39_0==LBRACK) ) {
										alt39=1;
									}
									switch (alt39) {
										case 1 :
											// Java.g:624:56: arrayDeclaratorList
											{
											pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations8813);
											arrayDeclaratorList114=arrayDeclaratorList();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) stream_arrayDeclaratorList.add(arrayDeclaratorList114.getTree());
											}
											break;

									}

									// Java.g:624:77: ( throwsClause )?
									int alt40=2;
									int LA40_0 = input.LA(1);
									if ( (LA40_0==THROWS) ) {
										alt40=1;
									}
									switch (alt40) {
										case 1 :
											// Java.g:624:77: throwsClause
											{
											pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations8816);
											throwsClause115=throwsClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) stream_throwsClause.add(throwsClause115.getTree());
											}
											break;

									}

									SEMI116=(Token)match(input,SEMI,FOLLOW_SEMI_in_interfaceScopeDeclarations8819); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_SEMI.add(SEMI116);

									// AST REWRITE
									// elements: genericTypeParameterList, throwsClause, IDENT, type, modifierList, formalParameterList, arrayDeclaratorList
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 625:25: -> ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
									{
										// Java.g:625:29: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_METHOD_DECL, "FUNCTION_METHOD_DECL"), root_1);
										adaptor.addChild(root_1, stream_modifierList.nextTree());
										// Java.g:625:65: ( genericTypeParameterList )?
										if ( stream_genericTypeParameterList.hasNext() ) {
											adaptor.addChild(root_1, stream_genericTypeParameterList.nextTree());
										}
										stream_genericTypeParameterList.reset();

										adaptor.addChild(root_1, stream_type.nextTree());
										adaptor.addChild(root_1, stream_IDENT.nextNode());
										adaptor.addChild(root_1, stream_formalParameterList.nextTree());
										// Java.g:625:122: ( arrayDeclaratorList )?
										if ( stream_arrayDeclaratorList.hasNext() ) {
											adaptor.addChild(root_1, stream_arrayDeclaratorList.nextTree());
										}
										stream_arrayDeclaratorList.reset();

										// Java.g:625:143: ( throwsClause )?
										if ( stream_throwsClause.hasNext() ) {
											adaptor.addChild(root_1, stream_throwsClause.nextTree());
										}
										stream_throwsClause.reset();

										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;
								case 2 :
									// Java.g:626:25: VOID IDENT formalParameterList ( throwsClause )? SEMI
									{
									VOID117=(Token)match(input,VOID,FOLLOW_VOID_in_interfaceScopeDeclarations8893); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_VOID.add(VOID117);

									IDENT118=(Token)match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations8895); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_IDENT.add(IDENT118);

									pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations8897);
									formalParameterList119=formalParameterList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_formalParameterList.add(formalParameterList119.getTree());
									// Java.g:626:56: ( throwsClause )?
									int alt41=2;
									int LA41_0 = input.LA(1);
									if ( (LA41_0==THROWS) ) {
										alt41=1;
									}
									switch (alt41) {
										case 1 :
											// Java.g:626:56: throwsClause
											{
											pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations8899);
											throwsClause120=throwsClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) stream_throwsClause.add(throwsClause120.getTree());
											}
											break;

									}

									SEMI121=(Token)match(input,SEMI,FOLLOW_SEMI_in_interfaceScopeDeclarations8902); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_SEMI.add(SEMI121);

									// AST REWRITE
									// elements: modifierList, formalParameterList, throwsClause, genericTypeParameterList, IDENT
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 627:25: -> ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
									{
										// Java.g:627:29: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VOID_METHOD_DECL, "VOID_METHOD_DECL"), root_1);
										adaptor.addChild(root_1, stream_modifierList.nextTree());
										// Java.g:627:61: ( genericTypeParameterList )?
										if ( stream_genericTypeParameterList.hasNext() ) {
											adaptor.addChild(root_1, stream_genericTypeParameterList.nextTree());
										}
										stream_genericTypeParameterList.reset();

										adaptor.addChild(root_1, stream_IDENT.nextNode());
										adaptor.addChild(root_1, stream_formalParameterList.nextTree());
										// Java.g:627:113: ( throwsClause )?
										if ( stream_throwsClause.hasNext() ) {
											adaptor.addChild(root_1, stream_throwsClause.nextTree());
										}
										stream_throwsClause.reset();

										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// Java.g:629:21: type interfaceFieldDeclaratorList SEMI
							{
							pushFollow(FOLLOW_type_in_interfaceScopeDeclarations8989);
							type122=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type.add(type122.getTree());
							pushFollow(FOLLOW_interfaceFieldDeclaratorList_in_interfaceScopeDeclarations8991);
							interfaceFieldDeclaratorList123=interfaceFieldDeclaratorList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_interfaceFieldDeclaratorList.add(interfaceFieldDeclaratorList123.getTree());
							SEMI124=(Token)match(input,SEMI,FOLLOW_SEMI_in_interfaceScopeDeclarations8993); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI.add(SEMI124);

							// AST REWRITE
							// elements: interfaceFieldDeclaratorList, modifierList, type
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 630:21: -> ^( VAR_DECLARATION modifierList type interfaceFieldDeclaratorList )
							{
								// Java.g:630:25: ^( VAR_DECLARATION modifierList type interfaceFieldDeclaratorList )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECLARATION, "VAR_DECLARATION"), root_1);
								adaptor.addChild(root_1, stream_modifierList.nextTree());
								adaptor.addChild(root_1, stream_type.nextTree());
								adaptor.addChild(root_1, stream_interfaceFieldDeclaratorList.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// Java.g:632:17: typeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations9062);
					typeDeclaration125=typeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration125.getTree());

					}
					break;
				case 3 :
					// Java.g:633:17: SEMI !
					{
					root_0 = (CommonTree)adaptor.nil();


					SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_interfaceScopeDeclarations9080); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, interfaceScopeDeclarations_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceScopeDeclarations"


	public static class classFieldDeclaratorList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classFieldDeclaratorList"
	// Java.g:636:1: classFieldDeclaratorList : q= classFieldDeclarator ( COMMA classFieldDeclarator )* -> ^( VAR_DECLARATOR_LIST ( classFieldDeclarator )+ ) ;
	public final JavaParser.classFieldDeclaratorList_return classFieldDeclaratorList() throws RecognitionException {
		JavaParser.classFieldDeclaratorList_return retval = new JavaParser.classFieldDeclaratorList_return();
		retval.start = input.LT(1);
		int classFieldDeclaratorList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA127=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope classFieldDeclarator128 =null;

		CommonTree COMMA127_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_classFieldDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule classFieldDeclarator");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// Java.g:637:13: (q= classFieldDeclarator ( COMMA classFieldDeclarator )* -> ^( VAR_DECLARATOR_LIST ( classFieldDeclarator )+ ) )
			// Java.g:637:17: q= classFieldDeclarator ( COMMA classFieldDeclarator )*
			{
			pushFollow(FOLLOW_classFieldDeclarator_in_classFieldDeclaratorList9126);
			q=classFieldDeclarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classFieldDeclarator.add(q.getTree());
			// Java.g:637:40: ( COMMA classFieldDeclarator )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==COMMA) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// Java.g:637:41: COMMA classFieldDeclarator
					{
					COMMA127=(Token)match(input,COMMA,FOLLOW_COMMA_in_classFieldDeclaratorList9129); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA127);

					pushFollow(FOLLOW_classFieldDeclarator_in_classFieldDeclaratorList9131);
					classFieldDeclarator128=classFieldDeclarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classFieldDeclarator.add(classFieldDeclarator128.getTree());
					}
					break;

				default :
					break loop45;
				}
			}

			// AST REWRITE
			// elements: classFieldDeclarator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 638:17: -> ^( VAR_DECLARATOR_LIST ( classFieldDeclarator )+ )
			{
				// Java.g:638:21: ^( VAR_DECLARATOR_LIST ( classFieldDeclarator )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECLARATOR_LIST, "VAR_DECLARATOR_LIST"), root_1);
				if ( !(stream_classFieldDeclarator.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_classFieldDeclarator.hasNext() ) {
					adaptor.addChild(root_1, stream_classFieldDeclarator.nextTree());
				}
				stream_classFieldDeclarator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, classFieldDeclaratorList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classFieldDeclaratorList"


	public static class classFieldDeclarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classFieldDeclarator"
	// Java.g:641:1: classFieldDeclarator : variableDeclaratorId ( ASSIGN variableInitializer )? -> ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) ;
	public final JavaParser.classFieldDeclarator_return classFieldDeclarator() throws RecognitionException {
		JavaParser.classFieldDeclarator_return retval = new JavaParser.classFieldDeclarator_return();
		retval.start = input.LT(1);
		int classFieldDeclarator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ASSIGN130=null;
		ParserRuleReturnScope variableDeclaratorId129 =null;
		ParserRuleReturnScope variableInitializer131 =null;

		CommonTree ASSIGN130_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_variableInitializer=new RewriteRuleSubtreeStream(adaptor,"rule variableInitializer");
		RewriteRuleSubtreeStream stream_variableDeclaratorId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaratorId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// Java.g:642:13: ( variableDeclaratorId ( ASSIGN variableInitializer )? -> ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) )
			// Java.g:642:17: variableDeclaratorId ( ASSIGN variableInitializer )?
			{
			pushFollow(FOLLOW_variableDeclaratorId_in_classFieldDeclarator9202);
			variableDeclaratorId129=variableDeclaratorId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId129.getTree());
			// Java.g:642:38: ( ASSIGN variableInitializer )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==ASSIGN) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Java.g:642:39: ASSIGN variableInitializer
					{
					ASSIGN130=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_classFieldDeclarator9205); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN130);

					pushFollow(FOLLOW_variableInitializer_in_classFieldDeclarator9207);
					variableInitializer131=variableInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer131.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: variableDeclaratorId, variableInitializer
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 643:17: -> ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? )
			{
				// Java.g:643:21: ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECLARATOR, "VAR_DECLARATOR"), root_1);
				adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());
				// Java.g:643:59: ( variableInitializer )?
				if ( stream_variableInitializer.hasNext() ) {
					adaptor.addChild(root_1, stream_variableInitializer.nextTree());
				}
				stream_variableInitializer.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, classFieldDeclarator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classFieldDeclarator"


	public static class interfaceFieldDeclaratorList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "interfaceFieldDeclaratorList"
	// Java.g:646:1: interfaceFieldDeclaratorList : interfaceFieldDeclarator ( COMMA interfaceFieldDeclarator )* -> ^( VAR_DECLARATOR_LIST ( interfaceFieldDeclarator )+ ) ;
	public final JavaParser.interfaceFieldDeclaratorList_return interfaceFieldDeclaratorList() throws RecognitionException {
		JavaParser.interfaceFieldDeclaratorList_return retval = new JavaParser.interfaceFieldDeclaratorList_return();
		retval.start = input.LT(1);
		int interfaceFieldDeclaratorList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA133=null;
		ParserRuleReturnScope interfaceFieldDeclarator132 =null;
		ParserRuleReturnScope interfaceFieldDeclarator134 =null;

		CommonTree COMMA133_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_interfaceFieldDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule interfaceFieldDeclarator");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// Java.g:647:13: ( interfaceFieldDeclarator ( COMMA interfaceFieldDeclarator )* -> ^( VAR_DECLARATOR_LIST ( interfaceFieldDeclarator )+ ) )
			// Java.g:647:17: interfaceFieldDeclarator ( COMMA interfaceFieldDeclarator )*
			{
			pushFollow(FOLLOW_interfaceFieldDeclarator_in_interfaceFieldDeclaratorList9284);
			interfaceFieldDeclarator132=interfaceFieldDeclarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_interfaceFieldDeclarator.add(interfaceFieldDeclarator132.getTree());
			// Java.g:647:42: ( COMMA interfaceFieldDeclarator )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==COMMA) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// Java.g:647:43: COMMA interfaceFieldDeclarator
					{
					COMMA133=(Token)match(input,COMMA,FOLLOW_COMMA_in_interfaceFieldDeclaratorList9287); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA133);

					pushFollow(FOLLOW_interfaceFieldDeclarator_in_interfaceFieldDeclaratorList9289);
					interfaceFieldDeclarator134=interfaceFieldDeclarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_interfaceFieldDeclarator.add(interfaceFieldDeclarator134.getTree());
					}
					break;

				default :
					break loop47;
				}
			}

			// AST REWRITE
			// elements: interfaceFieldDeclarator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 648:17: -> ^( VAR_DECLARATOR_LIST ( interfaceFieldDeclarator )+ )
			{
				// Java.g:648:21: ^( VAR_DECLARATOR_LIST ( interfaceFieldDeclarator )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECLARATOR_LIST, "VAR_DECLARATOR_LIST"), root_1);
				if ( !(stream_interfaceFieldDeclarator.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_interfaceFieldDeclarator.hasNext() ) {
					adaptor.addChild(root_1, stream_interfaceFieldDeclarator.nextTree());
				}
				stream_interfaceFieldDeclarator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, interfaceFieldDeclaratorList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceFieldDeclaratorList"


	public static class interfaceFieldDeclarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "interfaceFieldDeclarator"
	// Java.g:651:1: interfaceFieldDeclarator : variableDeclaratorId ASSIGN variableInitializer -> ^( VAR_DECLARATOR variableDeclaratorId variableInitializer ) ;
	public final JavaParser.interfaceFieldDeclarator_return interfaceFieldDeclarator() throws RecognitionException {
		JavaParser.interfaceFieldDeclarator_return retval = new JavaParser.interfaceFieldDeclarator_return();
		retval.start = input.LT(1);
		int interfaceFieldDeclarator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ASSIGN136=null;
		ParserRuleReturnScope variableDeclaratorId135 =null;
		ParserRuleReturnScope variableInitializer137 =null;

		CommonTree ASSIGN136_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_variableInitializer=new RewriteRuleSubtreeStream(adaptor,"rule variableInitializer");
		RewriteRuleSubtreeStream stream_variableDeclaratorId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaratorId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// Java.g:652:13: ( variableDeclaratorId ASSIGN variableInitializer -> ^( VAR_DECLARATOR variableDeclaratorId variableInitializer ) )
			// Java.g:652:17: variableDeclaratorId ASSIGN variableInitializer
			{
			pushFollow(FOLLOW_variableDeclaratorId_in_interfaceFieldDeclarator9360);
			variableDeclaratorId135=variableDeclaratorId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId135.getTree());
			ASSIGN136=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_interfaceFieldDeclarator9362); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN136);

			pushFollow(FOLLOW_variableInitializer_in_interfaceFieldDeclarator9364);
			variableInitializer137=variableInitializer();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer137.getTree());
			// AST REWRITE
			// elements: variableDeclaratorId, variableInitializer
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 653:17: -> ^( VAR_DECLARATOR variableDeclaratorId variableInitializer )
			{
				// Java.g:653:21: ^( VAR_DECLARATOR variableDeclaratorId variableInitializer )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECLARATOR, "VAR_DECLARATOR"), root_1);
				adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());
				adaptor.addChild(root_1, stream_variableInitializer.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, interfaceFieldDeclarator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceFieldDeclarator"


	public static class variableDeclaratorId_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaratorId"
	// Java.g:656:9: variableDeclaratorId : q= IDENT ^ ( arrayDeclaratorList )? ;
	public final JavaParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
		JavaParser.variableDeclaratorId_return retval = new JavaParser.variableDeclaratorId_return();
		retval.start = input.LT(1);
		int variableDeclaratorId_StartIndex = input.index();

		CommonTree root_0 = null;

		Token q=null;
		ParserRuleReturnScope arrayDeclaratorList138 =null;

		CommonTree q_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// Java.g:657:13: (q= IDENT ^ ( arrayDeclaratorList )? )
			// Java.g:657:17: q= IDENT ^ ( arrayDeclaratorList )?
			{
			root_0 = (CommonTree)adaptor.nil();


			q=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId9448); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			q_tree = (CommonTree)adaptor.create(q);
			root_0 = (CommonTree)adaptor.becomeRoot(q_tree, root_0);
			}

			if ( state.backtracking==0 ) {
			    if (PolyverseScope.isPolyverse()) {
			      symbolTable.addId((q!=null?q.getText():null),true);
			    } else {
			      symbolTable.addId((q!=null?q.getText():null),false);
			    }
			  }
			// Java.g:665:9: ( arrayDeclaratorList )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==LBRACK) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// Java.g:665:9: arrayDeclaratorList
					{
					pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId9465);
					arrayDeclaratorList138=arrayDeclaratorList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayDeclaratorList138.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, variableDeclaratorId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaratorId"


	public static class variableInitializer_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableInitializer"
	// Java.g:668:1: variableInitializer : ( arrayInitializer | expression );
	public final JavaParser.variableInitializer_return variableInitializer() throws RecognitionException {
		JavaParser.variableInitializer_return retval = new JavaParser.variableInitializer_return();
		retval.start = input.LT(1);
		int variableInitializer_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope arrayInitializer139 =null;
		ParserRuleReturnScope expression140 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// Java.g:669:13: ( arrayInitializer | expression )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==LCURLY) ) {
				alt49=1;
			}
			else if ( (LA49_0==BOOLEAN||LA49_0==BYTE||(LA49_0 >= CHAR && LA49_0 <= CHARACTER_LITERAL)||(LA49_0 >= DEC && LA49_0 <= DECIMAL_LITERAL)||LA49_0==DOUBLE||LA49_0==FALSE||(LA49_0 >= FLOAT && LA49_0 <= FLOATING_POINT_LITERAL)||(LA49_0 >= HEX_LITERAL && LA49_0 <= IDENT)||LA49_0==INC||LA49_0==INT||LA49_0==LESS_THAN||LA49_0==LOGICAL_NOT||(LA49_0 >= LONG && LA49_0 <= LPAREN)||LA49_0==MINUS||(LA49_0 >= NEW && LA49_0 <= NOT)||LA49_0==NULL||LA49_0==OCTAL_LITERAL||LA49_0==PLUS||LA49_0==SHORT||(LA49_0 >= STRING_LITERAL && LA49_0 <= SUPER)||LA49_0==THIS||LA49_0==TRUE||LA49_0==VOID) ) {
				alt49=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// Java.g:669:17: arrayInitializer
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_arrayInitializer_in_variableInitializer9509);
					arrayInitializer139=arrayInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer139.getTree());

					}
					break;
				case 2 :
					// Java.g:670:17: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_variableInitializer9527);
					expression140=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression140.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, variableInitializer_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableInitializer"


	public static class arrayDeclarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayDeclarator"
	// Java.g:673:1: arrayDeclarator : LBRACK RBRACK -> ^( ARRAY_DECLARATOR ) ;
	public final JavaParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException {
		JavaParser.arrayDeclarator_return retval = new JavaParser.arrayDeclarator_return();
		retval.start = input.LT(1);
		int arrayDeclarator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LBRACK141=null;
		Token RBRACK142=null;

		CommonTree LBRACK141_tree=null;
		CommonTree RBRACK142_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// Java.g:674:13: ( LBRACK RBRACK -> ^( ARRAY_DECLARATOR ) )
			// Java.g:674:17: LBRACK RBRACK
			{
			LBRACK141=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arrayDeclarator9570); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK141);

			RBRACK142=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_arrayDeclarator9572); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK142);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 675:17: -> ^( ARRAY_DECLARATOR )
			{
				// Java.g:675:21: ^( ARRAY_DECLARATOR )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_DECLARATOR, "ARRAY_DECLARATOR"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, arrayDeclarator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayDeclarator"


	public static class arrayDeclaratorList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayDeclaratorList"
	// Java.g:678:1: arrayDeclaratorList : ( arrayDeclarator )+ -> ^( ARRAY_DECLARATOR_LIST ( arrayDeclarator )+ ) ;
	public final JavaParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException {
		JavaParser.arrayDeclaratorList_return retval = new JavaParser.arrayDeclaratorList_return();
		retval.start = input.LT(1);
		int arrayDeclaratorList_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope arrayDeclarator143 =null;

		RewriteRuleSubtreeStream stream_arrayDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule arrayDeclarator");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// Java.g:679:13: ( ( arrayDeclarator )+ -> ^( ARRAY_DECLARATOR_LIST ( arrayDeclarator )+ ) )
			// Java.g:679:17: ( arrayDeclarator )+
			{
			// Java.g:679:17: ( arrayDeclarator )+
			int cnt50=0;
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==LBRACK) ) {
					int LA50_2 = input.LA(2);
					if ( (synpred60_Java()) ) {
						alt50=1;
					}

				}

				switch (alt50) {
				case 1 :
					// Java.g:679:17: arrayDeclarator
					{
					pushFollow(FOLLOW_arrayDeclarator_in_arrayDeclaratorList9638);
					arrayDeclarator143=arrayDeclarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arrayDeclarator.add(arrayDeclarator143.getTree());
					}
					break;

				default :
					if ( cnt50 >= 1 ) break loop50;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(50, input);
					throw eee;
				}
				cnt50++;
			}

			// AST REWRITE
			// elements: arrayDeclarator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 680:17: -> ^( ARRAY_DECLARATOR_LIST ( arrayDeclarator )+ )
			{
				// Java.g:680:21: ^( ARRAY_DECLARATOR_LIST ( arrayDeclarator )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_DECLARATOR_LIST, "ARRAY_DECLARATOR_LIST"), root_1);
				if ( !(stream_arrayDeclarator.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_arrayDeclarator.hasNext() ) {
					adaptor.addChild(root_1, stream_arrayDeclarator.nextTree());
				}
				stream_arrayDeclarator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, arrayDeclaratorList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayDeclaratorList"


	public static class arrayInitializer_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayInitializer"
	// Java.g:683:9: arrayInitializer : LCURLY ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )? RCURLY -> ^( ARRAY_INITIALIZER[$LCURLY, \"ARRAY_INITIALIZER\"] ( variableInitializer )* ) ;
	public final JavaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
		JavaParser.arrayInitializer_return retval = new JavaParser.arrayInitializer_return();
		retval.start = input.LT(1);
		int arrayInitializer_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LCURLY144=null;
		Token COMMA146=null;
		Token COMMA148=null;
		Token RCURLY149=null;
		ParserRuleReturnScope variableInitializer145 =null;
		ParserRuleReturnScope variableInitializer147 =null;

		CommonTree LCURLY144_tree=null;
		CommonTree COMMA146_tree=null;
		CommonTree COMMA148_tree=null;
		CommonTree RCURLY149_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_variableInitializer=new RewriteRuleSubtreeStream(adaptor,"rule variableInitializer");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// Java.g:684:13: ( LCURLY ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )? RCURLY -> ^( ARRAY_INITIALIZER[$LCURLY, \"ARRAY_INITIALIZER\"] ( variableInitializer )* ) )
			// Java.g:684:17: LCURLY ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )? RCURLY
			{
			LCURLY144=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_arrayInitializer9723); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY144);

			// Java.g:684:24: ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==BOOLEAN||LA53_0==BYTE||(LA53_0 >= CHAR && LA53_0 <= CHARACTER_LITERAL)||(LA53_0 >= DEC && LA53_0 <= DECIMAL_LITERAL)||LA53_0==DOUBLE||LA53_0==FALSE||(LA53_0 >= FLOAT && LA53_0 <= FLOATING_POINT_LITERAL)||(LA53_0 >= HEX_LITERAL && LA53_0 <= IDENT)||LA53_0==INC||LA53_0==INT||LA53_0==LCURLY||LA53_0==LESS_THAN||LA53_0==LOGICAL_NOT||(LA53_0 >= LONG && LA53_0 <= LPAREN)||LA53_0==MINUS||(LA53_0 >= NEW && LA53_0 <= NOT)||LA53_0==NULL||LA53_0==OCTAL_LITERAL||LA53_0==PLUS||LA53_0==SHORT||(LA53_0 >= STRING_LITERAL && LA53_0 <= SUPER)||LA53_0==THIS||LA53_0==TRUE||LA53_0==VOID) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// Java.g:684:25: variableInitializer ( COMMA variableInitializer )* ( COMMA )?
					{
					pushFollow(FOLLOW_variableInitializer_in_arrayInitializer9726);
					variableInitializer145=variableInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer145.getTree());
					// Java.g:684:45: ( COMMA variableInitializer )*
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==COMMA) ) {
							int LA51_1 = input.LA(2);
							if ( (LA51_1==BOOLEAN||LA51_1==BYTE||(LA51_1 >= CHAR && LA51_1 <= CHARACTER_LITERAL)||(LA51_1 >= DEC && LA51_1 <= DECIMAL_LITERAL)||LA51_1==DOUBLE||LA51_1==FALSE||(LA51_1 >= FLOAT && LA51_1 <= FLOATING_POINT_LITERAL)||(LA51_1 >= HEX_LITERAL && LA51_1 <= IDENT)||LA51_1==INC||LA51_1==INT||LA51_1==LCURLY||LA51_1==LESS_THAN||LA51_1==LOGICAL_NOT||(LA51_1 >= LONG && LA51_1 <= LPAREN)||LA51_1==MINUS||(LA51_1 >= NEW && LA51_1 <= NOT)||LA51_1==NULL||LA51_1==OCTAL_LITERAL||LA51_1==PLUS||LA51_1==SHORT||(LA51_1 >= STRING_LITERAL && LA51_1 <= SUPER)||LA51_1==THIS||LA51_1==TRUE||LA51_1==VOID) ) {
								alt51=1;
							}

						}

						switch (alt51) {
						case 1 :
							// Java.g:684:46: COMMA variableInitializer
							{
							COMMA146=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer9729); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA146);

							pushFollow(FOLLOW_variableInitializer_in_arrayInitializer9731);
							variableInitializer147=variableInitializer();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer147.getTree());
							}
							break;

						default :
							break loop51;
						}
					}

					// Java.g:684:74: ( COMMA )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==COMMA) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// Java.g:684:74: COMMA
							{
							COMMA148=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer9735); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA148);

							}
							break;

					}

					}
					break;

			}

			RCURLY149=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_arrayInitializer9740); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY149);

			// AST REWRITE
			// elements: variableInitializer
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 685:17: -> ^( ARRAY_INITIALIZER[$LCURLY, \"ARRAY_INITIALIZER\"] ( variableInitializer )* )
			{
				// Java.g:685:21: ^( ARRAY_INITIALIZER[$LCURLY, \"ARRAY_INITIALIZER\"] ( variableInitializer )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_INITIALIZER, LCURLY144, "ARRAY_INITIALIZER"), root_1);
				// Java.g:685:71: ( variableInitializer )*
				while ( stream_variableInitializer.hasNext() ) {
					adaptor.addChild(root_1, stream_variableInitializer.nextTree());
				}
				stream_variableInitializer.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, arrayInitializer_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayInitializer"


	public static class throwsClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "throwsClause"
	// Java.g:688:1: throwsClause : THROWS qualifiedIdentList -> ^( THROWS_CLAUSE[$THROWS, \"THROWS_CLAUSE\"] qualifiedIdentList ) ;
	public final JavaParser.throwsClause_return throwsClause() throws RecognitionException {
		JavaParser.throwsClause_return retval = new JavaParser.throwsClause_return();
		retval.start = input.LT(1);
		int throwsClause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token THROWS150=null;
		ParserRuleReturnScope qualifiedIdentList151 =null;

		CommonTree THROWS150_tree=null;
		RewriteRuleTokenStream stream_THROWS=new RewriteRuleTokenStream(adaptor,"token THROWS");
		RewriteRuleSubtreeStream stream_qualifiedIdentList=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedIdentList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// Java.g:689:13: ( THROWS qualifiedIdentList -> ^( THROWS_CLAUSE[$THROWS, \"THROWS_CLAUSE\"] qualifiedIdentList ) )
			// Java.g:689:17: THROWS qualifiedIdentList
			{
			THROWS150=(Token)match(input,THROWS,FOLLOW_THROWS_in_throwsClause9810); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_THROWS.add(THROWS150);

			pushFollow(FOLLOW_qualifiedIdentList_in_throwsClause9812);
			qualifiedIdentList151=qualifiedIdentList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_qualifiedIdentList.add(qualifiedIdentList151.getTree());
			// AST REWRITE
			// elements: qualifiedIdentList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 690:17: -> ^( THROWS_CLAUSE[$THROWS, \"THROWS_CLAUSE\"] qualifiedIdentList )
			{
				// Java.g:690:21: ^( THROWS_CLAUSE[$THROWS, \"THROWS_CLAUSE\"] qualifiedIdentList )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THROWS_CLAUSE, THROWS150, "THROWS_CLAUSE"), root_1);
				adaptor.addChild(root_1, stream_qualifiedIdentList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, throwsClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "throwsClause"


	public static class modifierList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "modifierList"
	// Java.g:693:1: modifierList : ( modifier )* -> ^( MODIFIER_LIST ( modifier )* ) ;
	public final JavaParser.modifierList_return modifierList() throws RecognitionException {
		JavaParser.modifierList_return retval = new JavaParser.modifierList_return();
		retval.start = input.LT(1);
		int modifierList_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope modifier152 =null;

		RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// Java.g:694:13: ( ( modifier )* -> ^( MODIFIER_LIST ( modifier )* ) )
			// Java.g:694:17: ( modifier )*
			{
			// Java.g:694:17: ( modifier )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==AT) ) {
					int LA54_2 = input.LA(2);
					if ( (LA54_2==IDENT) ) {
						alt54=1;
					}

				}
				else if ( (LA54_0==ABSTRACT||LA54_0==FINAL||LA54_0==NATIVE||(LA54_0 >= PRIVATE && LA54_0 <= PUBLIC)||LA54_0==STATIC||LA54_0==STRICTFP||LA54_0==SYNCHRONIZED||LA54_0==TRANSIENT||LA54_0==VOLATILE) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// Java.g:694:17: modifier
					{
					pushFollow(FOLLOW_modifier_in_modifierList9881);
					modifier152=modifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_modifier.add(modifier152.getTree());
					}
					break;

				default :
					break loop54;
				}
			}

			// AST REWRITE
			// elements: modifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 695:17: -> ^( MODIFIER_LIST ( modifier )* )
			{
				// Java.g:695:21: ^( MODIFIER_LIST ( modifier )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODIFIER_LIST, "MODIFIER_LIST"), root_1);
				// Java.g:695:37: ( modifier )*
				while ( stream_modifier.hasNext() ) {
					adaptor.addChild(root_1, stream_modifier.nextTree());
				}
				stream_modifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, modifierList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "modifierList"


	public static class modifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "modifier"
	// Java.g:698:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
	public final JavaParser.modifier_return modifier() throws RecognitionException {
		JavaParser.modifier_return retval = new JavaParser.modifier_return();
		retval.start = input.LT(1);
		int modifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token PUBLIC153=null;
		Token PROTECTED154=null;
		Token PRIVATE155=null;
		Token STATIC156=null;
		Token ABSTRACT157=null;
		Token NATIVE158=null;
		Token SYNCHRONIZED159=null;
		Token TRANSIENT160=null;
		Token VOLATILE161=null;
		Token STRICTFP162=null;
		ParserRuleReturnScope localModifier163 =null;

		CommonTree PUBLIC153_tree=null;
		CommonTree PROTECTED154_tree=null;
		CommonTree PRIVATE155_tree=null;
		CommonTree STATIC156_tree=null;
		CommonTree ABSTRACT157_tree=null;
		CommonTree NATIVE158_tree=null;
		CommonTree SYNCHRONIZED159_tree=null;
		CommonTree TRANSIENT160_tree=null;
		CommonTree VOLATILE161_tree=null;
		CommonTree STRICTFP162_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// Java.g:699:13: ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
			int alt55=11;
			switch ( input.LA(1) ) {
			case PUBLIC:
				{
				alt55=1;
				}
				break;
			case PROTECTED:
				{
				alt55=2;
				}
				break;
			case PRIVATE:
				{
				alt55=3;
				}
				break;
			case STATIC:
				{
				alt55=4;
				}
				break;
			case ABSTRACT:
				{
				alt55=5;
				}
				break;
			case NATIVE:
				{
				alt55=6;
				}
				break;
			case SYNCHRONIZED:
				{
				alt55=7;
				}
				break;
			case TRANSIENT:
				{
				alt55=8;
				}
				break;
			case VOLATILE:
				{
				alt55=9;
				}
				break;
			case STRICTFP:
				{
				alt55=10;
				}
				break;
			case AT:
			case FINAL:
				{
				alt55=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// Java.g:699:17: PUBLIC
					{
					root_0 = (CommonTree)adaptor.nil();


					PUBLIC153=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier9954); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PUBLIC153_tree = (CommonTree)adaptor.create(PUBLIC153);
					adaptor.addChild(root_0, PUBLIC153_tree);
					}

					}
					break;
				case 2 :
					// Java.g:700:17: PROTECTED
					{
					root_0 = (CommonTree)adaptor.nil();


					PROTECTED154=(Token)match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier9972); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PROTECTED154_tree = (CommonTree)adaptor.create(PROTECTED154);
					adaptor.addChild(root_0, PROTECTED154_tree);
					}

					}
					break;
				case 3 :
					// Java.g:701:17: PRIVATE
					{
					root_0 = (CommonTree)adaptor.nil();


					PRIVATE155=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier9990); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PRIVATE155_tree = (CommonTree)adaptor.create(PRIVATE155);
					adaptor.addChild(root_0, PRIVATE155_tree);
					}

					}
					break;
				case 4 :
					// Java.g:702:17: STATIC
					{
					root_0 = (CommonTree)adaptor.nil();


					STATIC156=(Token)match(input,STATIC,FOLLOW_STATIC_in_modifier10008); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STATIC156_tree = (CommonTree)adaptor.create(STATIC156);
					adaptor.addChild(root_0, STATIC156_tree);
					}

					}
					break;
				case 5 :
					// Java.g:703:17: ABSTRACT
					{
					root_0 = (CommonTree)adaptor.nil();


					ABSTRACT157=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier10026); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ABSTRACT157_tree = (CommonTree)adaptor.create(ABSTRACT157);
					adaptor.addChild(root_0, ABSTRACT157_tree);
					}

					}
					break;
				case 6 :
					// Java.g:704:17: NATIVE
					{
					root_0 = (CommonTree)adaptor.nil();


					NATIVE158=(Token)match(input,NATIVE,FOLLOW_NATIVE_in_modifier10044); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NATIVE158_tree = (CommonTree)adaptor.create(NATIVE158);
					adaptor.addChild(root_0, NATIVE158_tree);
					}

					}
					break;
				case 7 :
					// Java.g:705:17: SYNCHRONIZED
					{
					root_0 = (CommonTree)adaptor.nil();


					SYNCHRONIZED159=(Token)match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier10062); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SYNCHRONIZED159_tree = (CommonTree)adaptor.create(SYNCHRONIZED159);
					adaptor.addChild(root_0, SYNCHRONIZED159_tree);
					}

					}
					break;
				case 8 :
					// Java.g:706:17: TRANSIENT
					{
					root_0 = (CommonTree)adaptor.nil();


					TRANSIENT160=(Token)match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier10080); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TRANSIENT160_tree = (CommonTree)adaptor.create(TRANSIENT160);
					adaptor.addChild(root_0, TRANSIENT160_tree);
					}

					}
					break;
				case 9 :
					// Java.g:707:17: VOLATILE
					{
					root_0 = (CommonTree)adaptor.nil();


					VOLATILE161=(Token)match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier10098); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VOLATILE161_tree = (CommonTree)adaptor.create(VOLATILE161);
					adaptor.addChild(root_0, VOLATILE161_tree);
					}

					}
					break;
				case 10 :
					// Java.g:708:17: STRICTFP
					{
					root_0 = (CommonTree)adaptor.nil();


					STRICTFP162=(Token)match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier10116); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRICTFP162_tree = (CommonTree)adaptor.create(STRICTFP162);
					adaptor.addChild(root_0, STRICTFP162_tree);
					}

					}
					break;
				case 11 :
					// Java.g:709:17: localModifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_localModifier_in_modifier10134);
					localModifier163=localModifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, localModifier163.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, modifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "modifier"


	public static class localModifierList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "localModifierList"
	// Java.g:712:1: localModifierList : ( localModifier )* -> ^( LOCAL_MODIFIER_LIST ( localModifier )* ) ;
	public final JavaParser.localModifierList_return localModifierList() throws RecognitionException {
		JavaParser.localModifierList_return retval = new JavaParser.localModifierList_return();
		retval.start = input.LT(1);
		int localModifierList_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope localModifier164 =null;

		RewriteRuleSubtreeStream stream_localModifier=new RewriteRuleSubtreeStream(adaptor,"rule localModifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// Java.g:713:13: ( ( localModifier )* -> ^( LOCAL_MODIFIER_LIST ( localModifier )* ) )
			// Java.g:713:17: ( localModifier )*
			{
			// Java.g:713:17: ( localModifier )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==AT||LA56_0==FINAL) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// Java.g:713:17: localModifier
					{
					pushFollow(FOLLOW_localModifier_in_localModifierList10177);
					localModifier164=localModifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_localModifier.add(localModifier164.getTree());
					}
					break;

				default :
					break loop56;
				}
			}

			// AST REWRITE
			// elements: localModifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 714:17: -> ^( LOCAL_MODIFIER_LIST ( localModifier )* )
			{
				// Java.g:714:20: ^( LOCAL_MODIFIER_LIST ( localModifier )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCAL_MODIFIER_LIST, "LOCAL_MODIFIER_LIST"), root_1);
				// Java.g:714:42: ( localModifier )*
				while ( stream_localModifier.hasNext() ) {
					adaptor.addChild(root_1, stream_localModifier.nextTree());
				}
				stream_localModifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, localModifierList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "localModifierList"


	public static class localModifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "localModifier"
	// Java.g:717:1: localModifier : ( FINAL | annotation );
	public final JavaParser.localModifier_return localModifier() throws RecognitionException {
		JavaParser.localModifier_return retval = new JavaParser.localModifier_return();
		retval.start = input.LT(1);
		int localModifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FINAL165=null;
		ParserRuleReturnScope annotation166 =null;

		CommonTree FINAL165_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// Java.g:718:13: ( FINAL | annotation )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==FINAL) ) {
				alt57=1;
			}
			else if ( (LA57_0==AT) ) {
				alt57=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// Java.g:718:17: FINAL
					{
					root_0 = (CommonTree)adaptor.nil();


					FINAL165=(Token)match(input,FINAL,FOLLOW_FINAL_in_localModifier10250); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FINAL165_tree = (CommonTree)adaptor.create(FINAL165);
					adaptor.addChild(root_0, FINAL165_tree);
					}

					}
					break;
				case 2 :
					// Java.g:719:17: annotation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_annotation_in_localModifier10268);
					annotation166=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation166.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, localModifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "localModifier"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Java.g:722:1: type : ( simpleType | objectType );
	public final JavaParser.type_return type() throws RecognitionException {
		JavaParser.type_return retval = new JavaParser.type_return();
		retval.start = input.LT(1);
		int type_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope simpleType167 =null;
		ParserRuleReturnScope objectType168 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// Java.g:723:13: ( simpleType | objectType )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==BOOLEAN||LA58_0==BYTE||LA58_0==CHAR||LA58_0==DOUBLE||LA58_0==FLOAT||LA58_0==INT||LA58_0==LONG||LA58_0==SHORT) ) {
				alt58=1;
			}
			else if ( (LA58_0==IDENT) ) {
				alt58=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// Java.g:723:17: simpleType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simpleType_in_type10311);
					simpleType167=simpleType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType167.getTree());

					}
					break;
				case 2 :
					// Java.g:724:17: objectType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_objectType_in_type10329);
					objectType168=objectType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, objectType168.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "type"


	public static class simpleType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleType"
	// Java.g:727:1: simpleType : primitiveType ( arrayDeclaratorList )? -> ^( TYPE primitiveType ( arrayDeclaratorList )? ) ;
	public final JavaParser.simpleType_return simpleType() throws RecognitionException {
		JavaParser.simpleType_return retval = new JavaParser.simpleType_return();
		retval.start = input.LT(1);
		int simpleType_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveType169 =null;
		ParserRuleReturnScope arrayDeclaratorList170 =null;

		RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
		RewriteRuleSubtreeStream stream_arrayDeclaratorList=new RewriteRuleSubtreeStream(adaptor,"rule arrayDeclaratorList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// Java.g:728:13: ( primitiveType ( arrayDeclaratorList )? -> ^( TYPE primitiveType ( arrayDeclaratorList )? ) )
			// Java.g:728:17: primitiveType ( arrayDeclaratorList )?
			{
			pushFollow(FOLLOW_primitiveType_in_simpleType10373);
			primitiveType169=primitiveType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType169.getTree());
			// Java.g:728:31: ( arrayDeclaratorList )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==LBRACK) ) {
				int LA59_1 = input.LA(2);
				if ( (LA59_1==RBRACK) ) {
					int LA59_3 = input.LA(3);
					if ( (synpred78_Java()) ) {
						alt59=1;
					}
				}
			}
			switch (alt59) {
				case 1 :
					// Java.g:728:31: arrayDeclaratorList
					{
					pushFollow(FOLLOW_arrayDeclaratorList_in_simpleType10375);
					arrayDeclaratorList170=arrayDeclaratorList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arrayDeclaratorList.add(arrayDeclaratorList170.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: primitiveType, arrayDeclaratorList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 729:17: -> ^( TYPE primitiveType ( arrayDeclaratorList )? )
			{
				// Java.g:729:21: ^( TYPE primitiveType ( arrayDeclaratorList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);
				adaptor.addChild(root_1, stream_primitiveType.nextTree());
				// Java.g:729:42: ( arrayDeclaratorList )?
				if ( stream_arrayDeclaratorList.hasNext() ) {
					adaptor.addChild(root_1, stream_arrayDeclaratorList.nextTree());
				}
				stream_arrayDeclaratorList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, simpleType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "simpleType"


	public static class objectType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "objectType"
	// Java.g:732:1: objectType : qualifiedTypeIdent ( arrayDeclaratorList )? -> ^( TYPE qualifiedTypeIdent ( arrayDeclaratorList )? ) ;
	public final JavaParser.objectType_return objectType() throws RecognitionException {
		JavaParser.objectType_return retval = new JavaParser.objectType_return();
		retval.start = input.LT(1);
		int objectType_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope qualifiedTypeIdent171 =null;
		ParserRuleReturnScope arrayDeclaratorList172 =null;

		RewriteRuleSubtreeStream stream_qualifiedTypeIdent=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedTypeIdent");
		RewriteRuleSubtreeStream stream_arrayDeclaratorList=new RewriteRuleSubtreeStream(adaptor,"rule arrayDeclaratorList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// Java.g:733:13: ( qualifiedTypeIdent ( arrayDeclaratorList )? -> ^( TYPE qualifiedTypeIdent ( arrayDeclaratorList )? ) )
			// Java.g:733:17: qualifiedTypeIdent ( arrayDeclaratorList )?
			{
			pushFollow(FOLLOW_qualifiedTypeIdent_in_objectType10454);
			qualifiedTypeIdent171=qualifiedTypeIdent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_qualifiedTypeIdent.add(qualifiedTypeIdent171.getTree());
			// Java.g:733:36: ( arrayDeclaratorList )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==LBRACK) ) {
				int LA60_1 = input.LA(2);
				if ( (synpred79_Java()) ) {
					alt60=1;
				}
			}
			switch (alt60) {
				case 1 :
					// Java.g:733:36: arrayDeclaratorList
					{
					pushFollow(FOLLOW_arrayDeclaratorList_in_objectType10456);
					arrayDeclaratorList172=arrayDeclaratorList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arrayDeclaratorList.add(arrayDeclaratorList172.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: arrayDeclaratorList, qualifiedTypeIdent
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 734:17: -> ^( TYPE qualifiedTypeIdent ( arrayDeclaratorList )? )
			{
				// Java.g:734:21: ^( TYPE qualifiedTypeIdent ( arrayDeclaratorList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);
				adaptor.addChild(root_1, stream_qualifiedTypeIdent.nextTree());
				// Java.g:734:47: ( arrayDeclaratorList )?
				if ( stream_arrayDeclaratorList.hasNext() ) {
					adaptor.addChild(root_1, stream_arrayDeclaratorList.nextTree());
				}
				stream_arrayDeclaratorList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, objectType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "objectType"


	public static class objectTypeSimplified_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "objectTypeSimplified"
	// Java.g:737:1: objectTypeSimplified : qualifiedTypeIdentSimplified ( arrayDeclaratorList )? -> ^( TYPE qualifiedTypeIdentSimplified ( arrayDeclaratorList )? ) ;
	public final JavaParser.objectTypeSimplified_return objectTypeSimplified() throws RecognitionException {
		JavaParser.objectTypeSimplified_return retval = new JavaParser.objectTypeSimplified_return();
		retval.start = input.LT(1);
		int objectTypeSimplified_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope qualifiedTypeIdentSimplified173 =null;
		ParserRuleReturnScope arrayDeclaratorList174 =null;

		RewriteRuleSubtreeStream stream_qualifiedTypeIdentSimplified=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedTypeIdentSimplified");
		RewriteRuleSubtreeStream stream_arrayDeclaratorList=new RewriteRuleSubtreeStream(adaptor,"rule arrayDeclaratorList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// Java.g:738:13: ( qualifiedTypeIdentSimplified ( arrayDeclaratorList )? -> ^( TYPE qualifiedTypeIdentSimplified ( arrayDeclaratorList )? ) )
			// Java.g:738:17: qualifiedTypeIdentSimplified ( arrayDeclaratorList )?
			{
			pushFollow(FOLLOW_qualifiedTypeIdentSimplified_in_objectTypeSimplified10528);
			qualifiedTypeIdentSimplified173=qualifiedTypeIdentSimplified();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_qualifiedTypeIdentSimplified.add(qualifiedTypeIdentSimplified173.getTree());
			// Java.g:738:46: ( arrayDeclaratorList )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==LBRACK) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// Java.g:738:46: arrayDeclaratorList
					{
					pushFollow(FOLLOW_arrayDeclaratorList_in_objectTypeSimplified10530);
					arrayDeclaratorList174=arrayDeclaratorList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arrayDeclaratorList.add(arrayDeclaratorList174.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: qualifiedTypeIdentSimplified, arrayDeclaratorList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 739:17: -> ^( TYPE qualifiedTypeIdentSimplified ( arrayDeclaratorList )? )
			{
				// Java.g:739:21: ^( TYPE qualifiedTypeIdentSimplified ( arrayDeclaratorList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);
				adaptor.addChild(root_1, stream_qualifiedTypeIdentSimplified.nextTree());
				// Java.g:739:57: ( arrayDeclaratorList )?
				if ( stream_arrayDeclaratorList.hasNext() ) {
					adaptor.addChild(root_1, stream_arrayDeclaratorList.nextTree());
				}
				stream_arrayDeclaratorList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, objectTypeSimplified_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "objectTypeSimplified"


	public static class qualifiedTypeIdent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualifiedTypeIdent"
	// Java.g:742:1: qualifiedTypeIdent : typeIdent ( DOT typeIdent )* -> ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) ;
	public final JavaParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException {
		JavaParser.qualifiedTypeIdent_return retval = new JavaParser.qualifiedTypeIdent_return();
		retval.start = input.LT(1);
		int qualifiedTypeIdent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DOT176=null;
		ParserRuleReturnScope typeIdent175 =null;
		ParserRuleReturnScope typeIdent177 =null;

		CommonTree DOT176_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_typeIdent=new RewriteRuleSubtreeStream(adaptor,"rule typeIdent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// Java.g:743:13: ( typeIdent ( DOT typeIdent )* -> ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) )
			// Java.g:743:17: typeIdent ( DOT typeIdent )*
			{
			pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent10602);
			typeIdent175=typeIdent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeIdent.add(typeIdent175.getTree());
			// Java.g:743:27: ( DOT typeIdent )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==DOT) ) {
					int LA62_2 = input.LA(2);
					if ( (synpred81_Java()) ) {
						alt62=1;
					}

				}

				switch (alt62) {
				case 1 :
					// Java.g:743:28: DOT typeIdent
					{
					DOT176=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedTypeIdent10605); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT176);

					pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent10607);
					typeIdent177=typeIdent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typeIdent.add(typeIdent177.getTree());
					}
					break;

				default :
					break loop62;
				}
			}

			// AST REWRITE
			// elements: typeIdent
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 744:17: -> ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
			{
				// Java.g:744:21: ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUALIFIED_TYPE_IDENT, "QUALIFIED_TYPE_IDENT"), root_1);
				if ( !(stream_typeIdent.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_typeIdent.hasNext() ) {
					adaptor.addChild(root_1, stream_typeIdent.nextTree());
				}
				stream_typeIdent.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, qualifiedTypeIdent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "qualifiedTypeIdent"


	public static class qualifiedTypeIdentSimplified_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualifiedTypeIdentSimplified"
	// Java.g:747:1: qualifiedTypeIdentSimplified : typeIdentSimplified ( DOT typeIdentSimplified )* -> ^( QUALIFIED_TYPE_IDENT ( typeIdentSimplified )+ ) ;
	public final JavaParser.qualifiedTypeIdentSimplified_return qualifiedTypeIdentSimplified() throws RecognitionException {
		JavaParser.qualifiedTypeIdentSimplified_return retval = new JavaParser.qualifiedTypeIdentSimplified_return();
		retval.start = input.LT(1);
		int qualifiedTypeIdentSimplified_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DOT179=null;
		ParserRuleReturnScope typeIdentSimplified178 =null;
		ParserRuleReturnScope typeIdentSimplified180 =null;

		CommonTree DOT179_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_typeIdentSimplified=new RewriteRuleSubtreeStream(adaptor,"rule typeIdentSimplified");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// Java.g:748:13: ( typeIdentSimplified ( DOT typeIdentSimplified )* -> ^( QUALIFIED_TYPE_IDENT ( typeIdentSimplified )+ ) )
			// Java.g:748:17: typeIdentSimplified ( DOT typeIdentSimplified )*
			{
			pushFollow(FOLLOW_typeIdentSimplified_in_qualifiedTypeIdentSimplified10679);
			typeIdentSimplified178=typeIdentSimplified();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeIdentSimplified.add(typeIdentSimplified178.getTree());
			// Java.g:748:37: ( DOT typeIdentSimplified )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==DOT) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// Java.g:748:38: DOT typeIdentSimplified
					{
					DOT179=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedTypeIdentSimplified10682); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT179);

					pushFollow(FOLLOW_typeIdentSimplified_in_qualifiedTypeIdentSimplified10684);
					typeIdentSimplified180=typeIdentSimplified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typeIdentSimplified.add(typeIdentSimplified180.getTree());
					}
					break;

				default :
					break loop63;
				}
			}

			// AST REWRITE
			// elements: typeIdentSimplified
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 749:17: -> ^( QUALIFIED_TYPE_IDENT ( typeIdentSimplified )+ )
			{
				// Java.g:749:21: ^( QUALIFIED_TYPE_IDENT ( typeIdentSimplified )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUALIFIED_TYPE_IDENT, "QUALIFIED_TYPE_IDENT"), root_1);
				if ( !(stream_typeIdentSimplified.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_typeIdentSimplified.hasNext() ) {
					adaptor.addChild(root_1, stream_typeIdentSimplified.nextTree());
				}
				stream_typeIdentSimplified.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, qualifiedTypeIdentSimplified_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "qualifiedTypeIdentSimplified"


	public static class typeIdent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typeIdent"
	// Java.g:752:1: typeIdent : IDENT ^ ( genericTypeArgumentList )? ;
	public final JavaParser.typeIdent_return typeIdent() throws RecognitionException {
		JavaParser.typeIdent_return retval = new JavaParser.typeIdent_return();
		retval.start = input.LT(1);
		int typeIdent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IDENT181=null;
		ParserRuleReturnScope genericTypeArgumentList182 =null;

		CommonTree IDENT181_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// Java.g:753:13: ( IDENT ^ ( genericTypeArgumentList )? )
			// Java.g:753:17: IDENT ^ ( genericTypeArgumentList )?
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT181=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeIdent10756); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT181_tree = (CommonTree)adaptor.create(IDENT181);
			root_0 = (CommonTree)adaptor.becomeRoot(IDENT181_tree, root_0);
			}

			if ( state.backtracking==0 ) {
			    if (PolyverseScope.isPolyverse()) {
			      tokens.replace(IDENT181, "polyverse." + (IDENT181!=null?IDENT181.getText():null));
			    }
			  }
			// Java.g:759:13: ( genericTypeArgumentList )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==LESS_THAN) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// Java.g:759:13: genericTypeArgumentList
					{
					pushFollow(FOLLOW_genericTypeArgumentList_in_typeIdent10776);
					genericTypeArgumentList182=genericTypeArgumentList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, genericTypeArgumentList182.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, typeIdent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeIdent"


	public static class typeIdentSimplified_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typeIdentSimplified"
	// Java.g:762:1: typeIdentSimplified : IDENT ^ ( genericTypeArgumentListSimplified )? ;
	public final JavaParser.typeIdentSimplified_return typeIdentSimplified() throws RecognitionException {
		JavaParser.typeIdentSimplified_return retval = new JavaParser.typeIdentSimplified_return();
		retval.start = input.LT(1);
		int typeIdentSimplified_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IDENT183=null;
		ParserRuleReturnScope genericTypeArgumentListSimplified184 =null;

		CommonTree IDENT183_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// Java.g:763:13: ( IDENT ^ ( genericTypeArgumentListSimplified )? )
			// Java.g:763:17: IDENT ^ ( genericTypeArgumentListSimplified )?
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT183=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeIdentSimplified10820); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT183_tree = (CommonTree)adaptor.create(IDENT183);
			root_0 = (CommonTree)adaptor.becomeRoot(IDENT183_tree, root_0);
			}

			// Java.g:763:24: ( genericTypeArgumentListSimplified )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==LESS_THAN) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// Java.g:763:24: genericTypeArgumentListSimplified
					{
					pushFollow(FOLLOW_genericTypeArgumentListSimplified_in_typeIdentSimplified10823);
					genericTypeArgumentListSimplified184=genericTypeArgumentListSimplified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, genericTypeArgumentListSimplified184.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, typeIdentSimplified_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeIdentSimplified"


	public static class primitiveType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primitiveType"
	// Java.g:766:1: primitiveType : ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
	public final JavaParser.primitiveType_return primitiveType() throws RecognitionException {
		JavaParser.primitiveType_return retval = new JavaParser.primitiveType_return();
		retval.start = input.LT(1);
		int primitiveType_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BOOLEAN185=null;
		Token CHAR186=null;
		Token BYTE187=null;
		Token SHORT188=null;
		Token INT189=null;
		Token LONG190=null;
		Token FLOAT191=null;
		Token DOUBLE192=null;

		CommonTree BOOLEAN185_tree=null;
		CommonTree CHAR186_tree=null;
		CommonTree BYTE187_tree=null;
		CommonTree SHORT188_tree=null;
		CommonTree INT189_tree=null;
		CommonTree LONG190_tree=null;
		CommonTree FLOAT191_tree=null;
		CommonTree DOUBLE192_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// Java.g:767:13: ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
			int alt66=8;
			switch ( input.LA(1) ) {
			case BOOLEAN:
				{
				alt66=1;
				}
				break;
			case CHAR:
				{
				alt66=2;
				}
				break;
			case BYTE:
				{
				alt66=3;
				}
				break;
			case SHORT:
				{
				alt66=4;
				}
				break;
			case INT:
				{
				alt66=5;
				}
				break;
			case LONG:
				{
				alt66=6;
				}
				break;
			case FLOAT:
				{
				alt66=7;
				}
				break;
			case DOUBLE:
				{
				alt66=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// Java.g:767:17: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN185=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType10867); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN185_tree = (CommonTree)adaptor.create(BOOLEAN185);
					adaptor.addChild(root_0, BOOLEAN185_tree);
					}

					if ( state.backtracking==0 ) { if (PolyverseScope.isPolyverse()) { tokens.replace(BOOLEAN185, "polyverse.scalar.Boolean"); } }
					}
					break;
				case 2 :
					// Java.g:769:17: CHAR
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR186=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveType10890); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR186_tree = (CommonTree)adaptor.create(CHAR186);
					adaptor.addChild(root_0, CHAR186_tree);
					}

					if ( state.backtracking==0 ) { if (PolyverseScope.isPolyverse()) { tokens.replace(CHAR186, "polyverse.scalar.Char"); } }
					}
					break;
				case 3 :
					// Java.g:771:17: BYTE
					{
					root_0 = (CommonTree)adaptor.nil();


					BYTE187=(Token)match(input,BYTE,FOLLOW_BYTE_in_primitiveType10912); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BYTE187_tree = (CommonTree)adaptor.create(BYTE187);
					adaptor.addChild(root_0, BYTE187_tree);
					}

					if ( state.backtracking==0 ) { if (PolyverseScope.isPolyverse()) { tokens.replace(BYTE187, "polyverse.scalar.Byte"); } }
					}
					break;
				case 4 :
					// Java.g:773:17: SHORT
					{
					root_0 = (CommonTree)adaptor.nil();


					SHORT188=(Token)match(input,SHORT,FOLLOW_SHORT_in_primitiveType10934); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SHORT188_tree = (CommonTree)adaptor.create(SHORT188);
					adaptor.addChild(root_0, SHORT188_tree);
					}

					if ( state.backtracking==0 ) { if (PolyverseScope.isPolyverse()) { tokens.replace(SHORT188, "polyverse.scalar.Short"); } }
					}
					break;
				case 5 :
					// Java.g:775:17: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT189=(Token)match(input,INT,FOLLOW_INT_in_primitiveType10956); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT189_tree = (CommonTree)adaptor.create(INT189);
					adaptor.addChild(root_0, INT189_tree);
					}

					if ( state.backtracking==0 ) { if (PolyverseScope.isPolyverse()) { tokens.replace(INT189, "polyverse.scalar.Integer"); } }
					}
					break;
				case 6 :
					// Java.g:777:17: LONG
					{
					root_0 = (CommonTree)adaptor.nil();


					LONG190=(Token)match(input,LONG,FOLLOW_LONG_in_primitiveType10981); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LONG190_tree = (CommonTree)adaptor.create(LONG190);
					adaptor.addChild(root_0, LONG190_tree);
					}

					if ( state.backtracking==0 ) { if (PolyverseScope.isPolyverse()) { tokens.replace(LONG190, "polyverse.scalar.Long"); } }
					}
					break;
				case 7 :
					// Java.g:779:17: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT191=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType11003); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT191_tree = (CommonTree)adaptor.create(FLOAT191);
					adaptor.addChild(root_0, FLOAT191_tree);
					}

					if ( state.backtracking==0 ) { if (PolyverseScope.isPolyverse()) { tokens.replace(FLOAT191, "polyverse.scalar.Float"); } }
					}
					break;
				case 8 :
					// Java.g:781:17: DOUBLE
					{
					root_0 = (CommonTree)adaptor.nil();


					DOUBLE192=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType11025); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOUBLE192_tree = (CommonTree)adaptor.create(DOUBLE192);
					adaptor.addChild(root_0, DOUBLE192_tree);
					}

					if ( state.backtracking==0 ) { if (PolyverseScope.isPolyverse()) { tokens.replace(DOUBLE192, "polyverse.scalar.Double"); } }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, primitiveType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveType"


	public static class genericTypeArgumentList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "genericTypeArgumentList"
	// Java.g:786:1: genericTypeArgumentList : LESS_THAN genericTypeArgument ( COMMA genericTypeArgument )* genericTypeListClosing -> ^( GENERIC_TYPE_ARG_LIST[$LESS_THAN, \"GENERIC_TYPE_ARG_LIST\"] ( genericTypeArgument )+ ) ;
	public final JavaParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException {
		JavaParser.genericTypeArgumentList_return retval = new JavaParser.genericTypeArgumentList_return();
		retval.start = input.LT(1);
		int genericTypeArgumentList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LESS_THAN193=null;
		Token COMMA195=null;
		ParserRuleReturnScope genericTypeArgument194 =null;
		ParserRuleReturnScope genericTypeArgument196 =null;
		ParserRuleReturnScope genericTypeListClosing197 =null;

		CommonTree LESS_THAN193_tree=null;
		CommonTree COMMA195_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LESS_THAN=new RewriteRuleTokenStream(adaptor,"token LESS_THAN");
		RewriteRuleSubtreeStream stream_genericTypeArgument=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeArgument");
		RewriteRuleSubtreeStream stream_genericTypeListClosing=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeListClosing");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// Java.g:787:13: ( LESS_THAN genericTypeArgument ( COMMA genericTypeArgument )* genericTypeListClosing -> ^( GENERIC_TYPE_ARG_LIST[$LESS_THAN, \"GENERIC_TYPE_ARG_LIST\"] ( genericTypeArgument )+ ) )
			// Java.g:787:17: LESS_THAN genericTypeArgument ( COMMA genericTypeArgument )* genericTypeListClosing
			{
			LESS_THAN193=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_genericTypeArgumentList11073); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LESS_THAN.add(LESS_THAN193);

			pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList11075);
			genericTypeArgument194=genericTypeArgument();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_genericTypeArgument.add(genericTypeArgument194.getTree());
			// Java.g:787:47: ( COMMA genericTypeArgument )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==COMMA) ) {
					int LA67_2 = input.LA(2);
					if ( (synpred92_Java()) ) {
						alt67=1;
					}

				}

				switch (alt67) {
				case 1 :
					// Java.g:787:48: COMMA genericTypeArgument
					{
					COMMA195=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericTypeArgumentList11078); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA195);

					pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList11080);
					genericTypeArgument196=genericTypeArgument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_genericTypeArgument.add(genericTypeArgument196.getTree());
					}
					break;

				default :
					break loop67;
				}
			}

			pushFollow(FOLLOW_genericTypeListClosing_in_genericTypeArgumentList11084);
			genericTypeListClosing197=genericTypeListClosing();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_genericTypeListClosing.add(genericTypeListClosing197.getTree());
			// AST REWRITE
			// elements: genericTypeArgument
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 788:17: -> ^( GENERIC_TYPE_ARG_LIST[$LESS_THAN, \"GENERIC_TYPE_ARG_LIST\"] ( genericTypeArgument )+ )
			{
				// Java.g:788:21: ^( GENERIC_TYPE_ARG_LIST[$LESS_THAN, \"GENERIC_TYPE_ARG_LIST\"] ( genericTypeArgument )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GENERIC_TYPE_ARG_LIST, LESS_THAN193, "GENERIC_TYPE_ARG_LIST"), root_1);
				if ( !(stream_genericTypeArgument.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_genericTypeArgument.hasNext() ) {
					adaptor.addChild(root_1, stream_genericTypeArgument.nextTree());
				}
				stream_genericTypeArgument.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, genericTypeArgumentList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "genericTypeArgumentList"


	public static class genericTypeArgument_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "genericTypeArgument"
	// Java.g:791:1: genericTypeArgument : ( type | QUESTION ( genericWildcardBoundType )? -> ^( QUESTION ( genericWildcardBoundType )? ) );
	public final JavaParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException {
		JavaParser.genericTypeArgument_return retval = new JavaParser.genericTypeArgument_return();
		retval.start = input.LT(1);
		int genericTypeArgument_StartIndex = input.index();

		CommonTree root_0 = null;

		Token QUESTION199=null;
		ParserRuleReturnScope type198 =null;
		ParserRuleReturnScope genericWildcardBoundType200 =null;

		CommonTree QUESTION199_tree=null;
		RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
		RewriteRuleSubtreeStream stream_genericWildcardBoundType=new RewriteRuleSubtreeStream(adaptor,"rule genericWildcardBoundType");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// Java.g:792:13: ( type | QUESTION ( genericWildcardBoundType )? -> ^( QUESTION ( genericWildcardBoundType )? ) )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==BOOLEAN||LA69_0==BYTE||LA69_0==CHAR||LA69_0==DOUBLE||LA69_0==FLOAT||LA69_0==IDENT||LA69_0==INT||LA69_0==LONG||LA69_0==SHORT) ) {
				alt69=1;
			}
			else if ( (LA69_0==QUESTION) ) {
				alt69=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// Java.g:792:17: type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_type_in_genericTypeArgument11154);
					type198=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type198.getTree());

					}
					break;
				case 2 :
					// Java.g:793:17: QUESTION ( genericWildcardBoundType )?
					{
					QUESTION199=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgument11172); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION199);

					// Java.g:793:26: ( genericWildcardBoundType )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==EXTENDS) ) {
						switch ( input.LA(2) ) {
							case BOOLEAN:
								{
								int LA68_4 = input.LA(3);
								if ( (synpred94_Java()) ) {
									alt68=1;
								}
								}
								break;
							case CHAR:
								{
								int LA68_5 = input.LA(3);
								if ( (synpred94_Java()) ) {
									alt68=1;
								}
								}
								break;
							case BYTE:
								{
								int LA68_6 = input.LA(3);
								if ( (synpred94_Java()) ) {
									alt68=1;
								}
								}
								break;
							case SHORT:
								{
								int LA68_7 = input.LA(3);
								if ( (synpred94_Java()) ) {
									alt68=1;
								}
								}
								break;
							case INT:
								{
								int LA68_8 = input.LA(3);
								if ( (synpred94_Java()) ) {
									alt68=1;
								}
								}
								break;
							case LONG:
								{
								int LA68_9 = input.LA(3);
								if ( (synpred94_Java()) ) {
									alt68=1;
								}
								}
								break;
							case FLOAT:
								{
								int LA68_10 = input.LA(3);
								if ( (synpred94_Java()) ) {
									alt68=1;
								}
								}
								break;
							case DOUBLE:
								{
								int LA68_11 = input.LA(3);
								if ( (synpred94_Java()) ) {
									alt68=1;
								}
								}
								break;
							case IDENT:
								{
								int LA68_12 = input.LA(3);
								if ( (synpred94_Java()) ) {
									alt68=1;
								}
								}
								break;
						}
					}
					else if ( (LA68_0==SUPER) ) {
						int LA68_3 = input.LA(2);
						if ( (LA68_3==BOOLEAN||LA68_3==BYTE||LA68_3==CHAR||LA68_3==DOUBLE||LA68_3==FLOAT||LA68_3==IDENT||LA68_3==INT||LA68_3==LONG||LA68_3==SHORT) ) {
							alt68=1;
						}
					}
					switch (alt68) {
						case 1 :
							// Java.g:793:26: genericWildcardBoundType
							{
							pushFollow(FOLLOW_genericWildcardBoundType_in_genericTypeArgument11174);
							genericWildcardBoundType200=genericWildcardBoundType();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_genericWildcardBoundType.add(genericWildcardBoundType200.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: QUESTION, genericWildcardBoundType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 794:17: -> ^( QUESTION ( genericWildcardBoundType )? )
					{
						// Java.g:794:21: ^( QUESTION ( genericWildcardBoundType )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION.nextNode(), root_1);
						// Java.g:794:32: ( genericWildcardBoundType )?
						if ( stream_genericWildcardBoundType.hasNext() ) {
							adaptor.addChild(root_1, stream_genericWildcardBoundType.nextTree());
						}
						stream_genericWildcardBoundType.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, genericTypeArgument_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "genericTypeArgument"


	public static class genericWildcardBoundType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "genericWildcardBoundType"
	// Java.g:797:1: genericWildcardBoundType : ( EXTENDS | SUPER ) ^ type ;
	public final JavaParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException {
		JavaParser.genericWildcardBoundType_return retval = new JavaParser.genericWildcardBoundType_return();
		retval.start = input.LT(1);
		int genericWildcardBoundType_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set201=null;
		ParserRuleReturnScope type202 =null;

		CommonTree set201_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// Java.g:798:13: ( ( EXTENDS | SUPER ) ^ type )
			// Java.g:798:17: ( EXTENDS | SUPER ) ^ type
			{
			root_0 = (CommonTree)adaptor.nil();


			set201=input.LT(1);
			set201=input.LT(1);
			if ( input.LA(1)==EXTENDS||input.LA(1)==SUPER ) {
				input.consume();
				if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set201), root_0);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_type_in_genericWildcardBoundType11257);
			type202=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type202.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, genericWildcardBoundType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "genericWildcardBoundType"


	public static class genericTypeArgumentListSimplified_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "genericTypeArgumentListSimplified"
	// Java.g:801:1: genericTypeArgumentListSimplified : LESS_THAN genericTypeArgumentSimplified ( COMMA genericTypeArgumentSimplified )* genericTypeListClosing -> ^( GENERIC_TYPE_ARG_LIST[$LESS_THAN, \"GENERIC_TYPE_ARG_LIST\"] ( genericTypeArgumentSimplified )+ ) ;
	public final JavaParser.genericTypeArgumentListSimplified_return genericTypeArgumentListSimplified() throws RecognitionException {
		JavaParser.genericTypeArgumentListSimplified_return retval = new JavaParser.genericTypeArgumentListSimplified_return();
		retval.start = input.LT(1);
		int genericTypeArgumentListSimplified_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LESS_THAN203=null;
		Token COMMA205=null;
		ParserRuleReturnScope genericTypeArgumentSimplified204 =null;
		ParserRuleReturnScope genericTypeArgumentSimplified206 =null;
		ParserRuleReturnScope genericTypeListClosing207 =null;

		CommonTree LESS_THAN203_tree=null;
		CommonTree COMMA205_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LESS_THAN=new RewriteRuleTokenStream(adaptor,"token LESS_THAN");
		RewriteRuleSubtreeStream stream_genericTypeArgumentSimplified=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeArgumentSimplified");
		RewriteRuleSubtreeStream stream_genericTypeListClosing=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeListClosing");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// Java.g:802:13: ( LESS_THAN genericTypeArgumentSimplified ( COMMA genericTypeArgumentSimplified )* genericTypeListClosing -> ^( GENERIC_TYPE_ARG_LIST[$LESS_THAN, \"GENERIC_TYPE_ARG_LIST\"] ( genericTypeArgumentSimplified )+ ) )
			// Java.g:802:17: LESS_THAN genericTypeArgumentSimplified ( COMMA genericTypeArgumentSimplified )* genericTypeListClosing
			{
			LESS_THAN203=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_genericTypeArgumentListSimplified11300); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LESS_THAN.add(LESS_THAN203);

			pushFollow(FOLLOW_genericTypeArgumentSimplified_in_genericTypeArgumentListSimplified11302);
			genericTypeArgumentSimplified204=genericTypeArgumentSimplified();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_genericTypeArgumentSimplified.add(genericTypeArgumentSimplified204.getTree());
			// Java.g:802:57: ( COMMA genericTypeArgumentSimplified )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==COMMA) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// Java.g:802:58: COMMA genericTypeArgumentSimplified
					{
					COMMA205=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericTypeArgumentListSimplified11305); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA205);

					pushFollow(FOLLOW_genericTypeArgumentSimplified_in_genericTypeArgumentListSimplified11307);
					genericTypeArgumentSimplified206=genericTypeArgumentSimplified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_genericTypeArgumentSimplified.add(genericTypeArgumentSimplified206.getTree());
					}
					break;

				default :
					break loop70;
				}
			}

			pushFollow(FOLLOW_genericTypeListClosing_in_genericTypeArgumentListSimplified11311);
			genericTypeListClosing207=genericTypeListClosing();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_genericTypeListClosing.add(genericTypeListClosing207.getTree());
			// AST REWRITE
			// elements: genericTypeArgumentSimplified
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 803:17: -> ^( GENERIC_TYPE_ARG_LIST[$LESS_THAN, \"GENERIC_TYPE_ARG_LIST\"] ( genericTypeArgumentSimplified )+ )
			{
				// Java.g:803:21: ^( GENERIC_TYPE_ARG_LIST[$LESS_THAN, \"GENERIC_TYPE_ARG_LIST\"] ( genericTypeArgumentSimplified )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GENERIC_TYPE_ARG_LIST, LESS_THAN203, "GENERIC_TYPE_ARG_LIST"), root_1);
				if ( !(stream_genericTypeArgumentSimplified.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_genericTypeArgumentSimplified.hasNext() ) {
					adaptor.addChild(root_1, stream_genericTypeArgumentSimplified.nextTree());
				}
				stream_genericTypeArgumentSimplified.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, genericTypeArgumentListSimplified_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "genericTypeArgumentListSimplified"


	public static class genericTypeArgumentSimplified_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "genericTypeArgumentSimplified"
	// Java.g:806:1: genericTypeArgumentSimplified : ( type | QUESTION );
	public final JavaParser.genericTypeArgumentSimplified_return genericTypeArgumentSimplified() throws RecognitionException {
		JavaParser.genericTypeArgumentSimplified_return retval = new JavaParser.genericTypeArgumentSimplified_return();
		retval.start = input.LT(1);
		int genericTypeArgumentSimplified_StartIndex = input.index();

		CommonTree root_0 = null;

		Token QUESTION209=null;
		ParserRuleReturnScope type208 =null;

		CommonTree QUESTION209_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// Java.g:807:13: ( type | QUESTION )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==BOOLEAN||LA71_0==BYTE||LA71_0==CHAR||LA71_0==DOUBLE||LA71_0==FLOAT||LA71_0==IDENT||LA71_0==INT||LA71_0==LONG||LA71_0==SHORT) ) {
				alt71=1;
			}
			else if ( (LA71_0==QUESTION) ) {
				alt71=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// Java.g:807:17: type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_type_in_genericTypeArgumentSimplified11385);
					type208=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type208.getTree());

					}
					break;
				case 2 :
					// Java.g:808:17: QUESTION
					{
					root_0 = (CommonTree)adaptor.nil();


					QUESTION209=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgumentSimplified11403); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QUESTION209_tree = (CommonTree)adaptor.create(QUESTION209);
					adaptor.addChild(root_0, QUESTION209_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, genericTypeArgumentSimplified_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "genericTypeArgumentSimplified"


	public static class qualifiedIdentList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualifiedIdentList"
	// Java.g:811:1: qualifiedIdentList : qualifiedIdentifier ( COMMA ! qualifiedIdentifier )* ;
	public final JavaParser.qualifiedIdentList_return qualifiedIdentList() throws RecognitionException {
		JavaParser.qualifiedIdentList_return retval = new JavaParser.qualifiedIdentList_return();
		retval.start = input.LT(1);
		int qualifiedIdentList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA211=null;
		ParserRuleReturnScope qualifiedIdentifier210 =null;
		ParserRuleReturnScope qualifiedIdentifier212 =null;

		CommonTree COMMA211_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// Java.g:812:13: ( qualifiedIdentifier ( COMMA ! qualifiedIdentifier )* )
			// Java.g:812:17: qualifiedIdentifier ( COMMA ! qualifiedIdentifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentList11450);
			qualifiedIdentifier210=qualifiedIdentifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedIdentifier210.getTree());

			// Java.g:812:37: ( COMMA ! qualifiedIdentifier )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==COMMA) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// Java.g:812:38: COMMA ! qualifiedIdentifier
					{
					COMMA211=(Token)match(input,COMMA,FOLLOW_COMMA_in_qualifiedIdentList11453); if (state.failed) return retval;
					pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentList11456);
					qualifiedIdentifier212=qualifiedIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedIdentifier212.getTree());

					}
					break;

				default :
					break loop72;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, qualifiedIdentList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "qualifiedIdentList"


	public static class formalParameterList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formalParameterList"
	// Java.g:815:1: formalParameterList : LPAREN ( formalParameterStandardDecl ( COMMA formalParameterStandardDecl )* ( COMMA formalParameterVarArgDecl )? -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] ( formalParameterStandardDecl )+ ( formalParameterVarArgDecl )? ) | formalParameterVarArgDecl -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] formalParameterVarArgDecl ) | -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] ) ) RPAREN ;
	public final JavaParser.formalParameterList_return formalParameterList() throws RecognitionException {
		JavaParser.formalParameterList_return retval = new JavaParser.formalParameterList_return();
		retval.start = input.LT(1);
		int formalParameterList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LPAREN213=null;
		Token COMMA215=null;
		Token COMMA217=null;
		Token RPAREN220=null;
		ParserRuleReturnScope formalParameterStandardDecl214 =null;
		ParserRuleReturnScope formalParameterStandardDecl216 =null;
		ParserRuleReturnScope formalParameterVarArgDecl218 =null;
		ParserRuleReturnScope formalParameterVarArgDecl219 =null;

		CommonTree LPAREN213_tree=null;
		CommonTree COMMA215_tree=null;
		CommonTree COMMA217_tree=null;
		CommonTree RPAREN220_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_formalParameterStandardDecl=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterStandardDecl");
		RewriteRuleSubtreeStream stream_formalParameterVarArgDecl=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterVarArgDecl");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// Java.g:816:13: ( LPAREN ( formalParameterStandardDecl ( COMMA formalParameterStandardDecl )* ( COMMA formalParameterVarArgDecl )? -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] ( formalParameterStandardDecl )+ ( formalParameterVarArgDecl )? ) | formalParameterVarArgDecl -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] formalParameterVarArgDecl ) | -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] ) ) RPAREN )
			// Java.g:816:17: LPAREN ( formalParameterStandardDecl ( COMMA formalParameterStandardDecl )* ( COMMA formalParameterVarArgDecl )? -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] ( formalParameterStandardDecl )+ ( formalParameterVarArgDecl )? ) | formalParameterVarArgDecl -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] formalParameterVarArgDecl ) | -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] ) ) RPAREN
			{
			LPAREN213=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList11505); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN213);

			// Java.g:817:17: ( formalParameterStandardDecl ( COMMA formalParameterStandardDecl )* ( COMMA formalParameterVarArgDecl )? -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] ( formalParameterStandardDecl )+ ( formalParameterVarArgDecl )? ) | formalParameterVarArgDecl -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] formalParameterVarArgDecl ) | -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] ) )
			int alt75=3;
			switch ( input.LA(1) ) {
			case FINAL:
				{
				int LA75_1 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt75=1;
				}
				else if ( (synpred102_Java()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT:
				{
				int LA75_2 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt75=1;
				}
				else if ( (synpred102_Java()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
				{
				int LA75_3 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt75=1;
				}
				else if ( (synpred102_Java()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA75_4 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt75=1;
				}
				else if ( (synpred102_Java()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BYTE:
				{
				int LA75_5 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt75=1;
				}
				else if ( (synpred102_Java()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHORT:
				{
				int LA75_6 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt75=1;
				}
				else if ( (synpred102_Java()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT:
				{
				int LA75_7 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt75=1;
				}
				else if ( (synpred102_Java()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONG:
				{
				int LA75_8 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt75=1;
				}
				else if ( (synpred102_Java()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA75_9 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt75=1;
				}
				else if ( (synpred102_Java()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA75_10 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt75=1;
				}
				else if ( (synpred102_Java()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IDENT:
				{
				int LA75_11 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt75=1;
				}
				else if ( (synpred102_Java()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RPAREN:
				{
				alt75=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}
			switch (alt75) {
				case 1 :
					// Java.g:818:3: formalParameterStandardDecl ( COMMA formalParameterStandardDecl )* ( COMMA formalParameterVarArgDecl )?
					{
					if ( state.backtracking==0 ) { 
					    if (PolyverseScope.isPolyverse()) {
					      String name = newPolyverseVar();
					      metaVarStack.push(name);
					      tokens.insertAfter(LPAREN213, "Polyverse " + name + ",");
					      //isPolyverse = false;
					      methodBlock = true;
					    }
					  }
					pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList11570);
					formalParameterStandardDecl214=formalParameterStandardDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_formalParameterStandardDecl.add(formalParameterStandardDecl214.getTree());
					// Java.g:828:49: ( COMMA formalParameterStandardDecl )*
					loop73:
					while (true) {
						int alt73=2;
						int LA73_0 = input.LA(1);
						if ( (LA73_0==COMMA) ) {
							int LA73_1 = input.LA(2);
							if ( (synpred99_Java()) ) {
								alt73=1;
							}

						}

						switch (alt73) {
						case 1 :
							// Java.g:828:50: COMMA formalParameterStandardDecl
							{
							COMMA215=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalParameterList11573); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA215);

							pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList11575);
							formalParameterStandardDecl216=formalParameterStandardDecl();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_formalParameterStandardDecl.add(formalParameterStandardDecl216.getTree());
							}
							break;

						default :
							break loop73;
						}
					}

					// Java.g:828:86: ( COMMA formalParameterVarArgDecl )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==COMMA) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// Java.g:828:87: COMMA formalParameterVarArgDecl
							{
							COMMA217=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalParameterList11580); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA217);

							pushFollow(FOLLOW_formalParameterVarArgDecl_in_formalParameterList11582);
							formalParameterVarArgDecl218=formalParameterVarArgDecl();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_formalParameterVarArgDecl.add(formalParameterVarArgDecl218.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: formalParameterStandardDecl, formalParameterVarArgDecl
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 829:21: -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] ( formalParameterStandardDecl )+ ( formalParameterVarArgDecl )? )
					{
						// Java.g:829:25: ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] ( formalParameterStandardDecl )+ ( formalParameterVarArgDecl )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, LPAREN213, "FORMAL_PARAM_LIST"), root_1);
						if ( !(stream_formalParameterStandardDecl.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_formalParameterStandardDecl.hasNext() ) {
							adaptor.addChild(root_1, stream_formalParameterStandardDecl.nextTree());
						}
						stream_formalParameterStandardDecl.reset();

						// Java.g:829:104: ( formalParameterVarArgDecl )?
						if ( stream_formalParameterVarArgDecl.hasNext() ) {
							adaptor.addChild(root_1, stream_formalParameterVarArgDecl.nextTree());
						}
						stream_formalParameterVarArgDecl.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Java.g:831:21: formalParameterVarArgDecl
					{
					pushFollow(FOLLOW_formalParameterVarArgDecl_in_formalParameterList11663);
					formalParameterVarArgDecl219=formalParameterVarArgDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_formalParameterVarArgDecl.add(formalParameterVarArgDecl219.getTree());
					// AST REWRITE
					// elements: formalParameterVarArgDecl
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 832:21: -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] formalParameterVarArgDecl )
					{
						// Java.g:832:25: ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] formalParameterVarArgDecl )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, LPAREN213, "FORMAL_PARAM_LIST"), root_1);
						adaptor.addChild(root_1, stream_formalParameterVarArgDecl.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Java.g:834:21: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 834:21: -> ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] )
					{
						// Java.g:834:25: ^( FORMAL_PARAM_LIST[$LPAREN, \"FORMAL_PARAM_LIST\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, LPAREN213, "FORMAL_PARAM_LIST"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			RPAREN220=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList11780); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN220);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, formalParameterList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formalParameterList"


	public static class formalParameterStandardDecl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formalParameterStandardDecl"
	// Java.g:839:1: formalParameterStandardDecl : localModifierList type variableDeclaratorId -> ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) ;
	public final JavaParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException {
		JavaParser.formalParameterStandardDecl_return retval = new JavaParser.formalParameterStandardDecl_return();
		retval.start = input.LT(1);
		int formalParameterStandardDecl_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope localModifierList221 =null;
		ParserRuleReturnScope type222 =null;
		ParserRuleReturnScope variableDeclaratorId223 =null;

		RewriteRuleSubtreeStream stream_localModifierList=new RewriteRuleSubtreeStream(adaptor,"rule localModifierList");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_variableDeclaratorId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaratorId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// Java.g:840:13: ( localModifierList type variableDeclaratorId -> ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) )
			// Java.g:840:17: localModifierList type variableDeclaratorId
			{
			pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl11827);
			localModifierList221=localModifierList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_localModifierList.add(localModifierList221.getTree());
			pushFollow(FOLLOW_type_in_formalParameterStandardDecl11829);
			type222=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type222.getTree());
			pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl11831);
			variableDeclaratorId223=variableDeclaratorId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId223.getTree());
			// AST REWRITE
			// elements: type, variableDeclaratorId, localModifierList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 841:17: -> ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
			{
				// Java.g:841:21: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_STD_DECL, "FORMAL_PARAM_STD_DECL"), root_1);
				adaptor.addChild(root_1, stream_localModifierList.nextTree());
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, formalParameterStandardDecl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formalParameterStandardDecl"


	public static class formalParameterVarArgDecl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formalParameterVarArgDecl"
	// Java.g:844:1: formalParameterVarArgDecl : localModifierList type ELLIPSIS variableDeclaratorId -> ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
	public final JavaParser.formalParameterVarArgDecl_return formalParameterVarArgDecl() throws RecognitionException {
		JavaParser.formalParameterVarArgDecl_return retval = new JavaParser.formalParameterVarArgDecl_return();
		retval.start = input.LT(1);
		int formalParameterVarArgDecl_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ELLIPSIS226=null;
		ParserRuleReturnScope localModifierList224 =null;
		ParserRuleReturnScope type225 =null;
		ParserRuleReturnScope variableDeclaratorId227 =null;

		CommonTree ELLIPSIS226_tree=null;
		RewriteRuleTokenStream stream_ELLIPSIS=new RewriteRuleTokenStream(adaptor,"token ELLIPSIS");
		RewriteRuleSubtreeStream stream_localModifierList=new RewriteRuleSubtreeStream(adaptor,"rule localModifierList");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_variableDeclaratorId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaratorId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// Java.g:845:13: ( localModifierList type ELLIPSIS variableDeclaratorId -> ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
			// Java.g:845:17: localModifierList type ELLIPSIS variableDeclaratorId
			{
			pushFollow(FOLLOW_localModifierList_in_formalParameterVarArgDecl11907);
			localModifierList224=localModifierList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_localModifierList.add(localModifierList224.getTree());
			pushFollow(FOLLOW_type_in_formalParameterVarArgDecl11909);
			type225=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type225.getTree());
			ELLIPSIS226=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_formalParameterVarArgDecl11911); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ELLIPSIS.add(ELLIPSIS226);

			pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarArgDecl11913);
			variableDeclaratorId227=variableDeclaratorId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId227.getTree());
			// AST REWRITE
			// elements: type, variableDeclaratorId, localModifierList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 846:17: -> ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
			{
				// Java.g:846:21: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_VARARG_DECL, "FORMAL_PARAM_VARARG_DECL"), root_1);
				adaptor.addChild(root_1, stream_localModifierList.nextTree());
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, formalParameterVarArgDecl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formalParameterVarArgDecl"


	public static class qualifiedIdentifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualifiedIdentifier"
	// Java.g:849:1: qualifiedIdentifier : (i= IDENT -> IDENT ) ( DOT ident= IDENT -> ^( DOT $qualifiedIdentifier $ident) )* ;
	public final JavaParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
		JavaParser.qualifiedIdentifier_return retval = new JavaParser.qualifiedIdentifier_return();
		retval.start = input.LT(1);
		int qualifiedIdentifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token i=null;
		Token ident=null;
		Token DOT228=null;

		CommonTree i_tree=null;
		CommonTree ident_tree=null;
		CommonTree DOT228_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// Java.g:850:13: ( (i= IDENT -> IDENT ) ( DOT ident= IDENT -> ^( DOT $qualifiedIdentifier $ident) )* )
			// Java.g:850:17: (i= IDENT -> IDENT ) ( DOT ident= IDENT -> ^( DOT $qualifiedIdentifier $ident) )*
			{
			// Java.g:850:17: (i= IDENT -> IDENT )
			// Java.g:850:21: i= IDENT
			{
			i=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier11996); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(i);

			if ( state.backtracking==0 ) {
			    if (PolyverseScope.isPolyverse()) {
			      symbolTable.addId((i!=null?i.getText():null),true);
			    } else {
			      symbolTable.addId((i!=null?i.getText():null),false);
			    }        
			  }
			// AST REWRITE
			// elements: IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 858:23: -> IDENT
			{
				adaptor.addChild(root_0, stream_IDENT.nextNode());
			}


			retval.tree = root_0;
			}

			}

			// Java.g:860:17: ( DOT ident= IDENT -> ^( DOT $qualifiedIdentifier $ident) )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==DOT) ) {
					int LA76_2 = input.LA(2);
					if ( (LA76_2==IDENT) ) {
						int LA76_3 = input.LA(3);
						if ( (synpred103_Java()) ) {
							alt76=1;
						}

					}

				}

				switch (alt76) {
				case 1 :
					// Java.g:860:21: DOT ident= IDENT
					{
					DOT228=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier12082); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT228);

					ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier12086); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENT.add(ident);

					// AST REWRITE
					// elements: qualifiedIdentifier, DOT, ident
					// token labels: ident
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_ident=new RewriteRuleTokenStream(adaptor,"token ident",ident);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 860:41: -> ^( DOT $qualifiedIdentifier $ident)
					{
						// Java.g:860:45: ^( DOT $qualifiedIdentifier $ident)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_ident.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop76;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, qualifiedIdentifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "qualifiedIdentifier"


	public static class annotationList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotationList"
	// Java.g:866:1: annotationList : ( annotation )* -> ^( ANNOTATION_LIST ( annotation )* ) ;
	public final JavaParser.annotationList_return annotationList() throws RecognitionException {
		JavaParser.annotationList_return retval = new JavaParser.annotationList_return();
		retval.start = input.LT(1);
		int annotationList_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope annotation229 =null;

		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// Java.g:867:13: ( ( annotation )* -> ^( ANNOTATION_LIST ( annotation )* ) )
			// Java.g:867:17: ( annotation )*
			{
			// Java.g:867:17: ( annotation )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==AT) ) {
					int LA77_2 = input.LA(2);
					if ( (LA77_2==IDENT) ) {
						int LA77_3 = input.LA(3);
						if ( (synpred104_Java()) ) {
							alt77=1;
						}

					}

				}

				switch (alt77) {
				case 1 :
					// Java.g:867:17: annotation
					{
					pushFollow(FOLLOW_annotation_in_annotationList12187);
					annotation229=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation229.getTree());
					}
					break;

				default :
					break loop77;
				}
			}

			// AST REWRITE
			// elements: annotation
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 868:17: -> ^( ANNOTATION_LIST ( annotation )* )
			{
				// Java.g:868:21: ^( ANNOTATION_LIST ( annotation )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOTATION_LIST, "ANNOTATION_LIST"), root_1);
				// Java.g:868:39: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, annotationList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationList"


	public static class annotation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotation"
	// Java.g:871:1: annotation : ( AT ^q= qualifiedIdentifier ( annotationInit )? ) ;
	public final JavaParser.annotation_return annotation() throws RecognitionException {
		JavaParser.annotation_return retval = new JavaParser.annotation_return();
		retval.start = input.LT(1);
		int annotation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AT230=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope annotationInit231 =null;

		CommonTree AT230_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// Java.g:872:13: ( ( AT ^q= qualifiedIdentifier ( annotationInit )? ) )
			// Java.g:877:17: ( AT ^q= qualifiedIdentifier ( annotationInit )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			// Java.g:877:17: ( AT ^q= qualifiedIdentifier ( annotationInit )? )
			// Java.g:877:18: AT ^q= qualifiedIdentifier ( annotationInit )?
			{
			AT230=(Token)match(input,AT,FOLLOW_AT_in_annotation12280); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			AT230_tree = (CommonTree)adaptor.create(AT230);
			root_0 = (CommonTree)adaptor.becomeRoot(AT230_tree, root_0);
			}

			pushFollow(FOLLOW_qualifiedIdentifier_in_annotation12285);
			q=qualifiedIdentifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:877:44: ( annotationInit )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==LPAREN) ) {
				int LA78_1 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt78=1;
				}
			}
			switch (alt78) {
				case 1 :
					// Java.g:877:44: annotationInit
					{
					pushFollow(FOLLOW_annotationInit_in_annotation12287);
					annotationInit231=annotationInit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationInit231.getTree());

					}
					break;

			}

			}

			if ( state.backtracking==0 ) {
			    //System.out.println("IN ");
			    if ((q!=null?input.toString(q.start,q.stop):null).equals("Polyverse")) {
			      PolyverseScope.enterPolyverseScope();
			      //PolyverseScope.isPolyverse() = true;
			      //temp = true;
			      //System.out.println("IN ");
			      if ((annotationInit231!=null?input.toString(annotationInit231.start,annotationInit231.stop):null) !=null) {
			        tokens.replace(AT230.getTokenIndex(),(annotationInit231!=null?(annotationInit231.stop):null).getTokenIndex(),"");
			      } else {
			        tokens.replace(AT230.getTokenIndex(),(q!=null?(q.stop):null).getTokenIndex(),"");
			      }
			      //System.out.println("OUT ");
			    }
			 }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, annotation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotation"


	public static class annotationInit_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotationInit"
	// Java.g:894:1: annotationInit : LPAREN annotationInitializers RPAREN -> ^( ANNOTATION_INIT_BLOCK[$LPAREN, \"ANNOTATION_INIT_BLOCK\"] annotationInitializers ) ;
	public final JavaParser.annotationInit_return annotationInit() throws RecognitionException {
		JavaParser.annotationInit_return retval = new JavaParser.annotationInit_return();
		retval.start = input.LT(1);
		int annotationInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LPAREN232=null;
		Token RPAREN234=null;
		ParserRuleReturnScope annotationInitializers233 =null;

		CommonTree LPAREN232_tree=null;
		CommonTree RPAREN234_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_annotationInitializers=new RewriteRuleSubtreeStream(adaptor,"rule annotationInitializers");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// Java.g:895:13: ( LPAREN annotationInitializers RPAREN -> ^( ANNOTATION_INIT_BLOCK[$LPAREN, \"ANNOTATION_INIT_BLOCK\"] annotationInitializers ) )
			// Java.g:895:17: LPAREN annotationInitializers RPAREN
			{
			LPAREN232=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotationInit12328); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN232);

			pushFollow(FOLLOW_annotationInitializers_in_annotationInit12330);
			annotationInitializers233=annotationInitializers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_annotationInitializers.add(annotationInitializers233.getTree());
			RPAREN234=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotationInit12332); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN234);

			// AST REWRITE
			// elements: annotationInitializers
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 896:17: -> ^( ANNOTATION_INIT_BLOCK[$LPAREN, \"ANNOTATION_INIT_BLOCK\"] annotationInitializers )
			{
				// Java.g:896:21: ^( ANNOTATION_INIT_BLOCK[$LPAREN, \"ANNOTATION_INIT_BLOCK\"] annotationInitializers )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOTATION_INIT_BLOCK, LPAREN232, "ANNOTATION_INIT_BLOCK"), root_1);
				adaptor.addChild(root_1, stream_annotationInitializers.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, annotationInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationInit"


	public static class annotationInitializers_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotationInitializers"
	// Java.g:899:1: annotationInitializers : ( annotationInitializer ( COMMA annotationInitializer )* -> ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | annotationElementValue -> ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) );
	public final JavaParser.annotationInitializers_return annotationInitializers() throws RecognitionException {
		JavaParser.annotationInitializers_return retval = new JavaParser.annotationInitializers_return();
		retval.start = input.LT(1);
		int annotationInitializers_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA236=null;
		ParserRuleReturnScope annotationInitializer235 =null;
		ParserRuleReturnScope annotationInitializer237 =null;
		ParserRuleReturnScope annotationElementValue238 =null;

		CommonTree COMMA236_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_annotationInitializer=new RewriteRuleSubtreeStream(adaptor,"rule annotationInitializer");
		RewriteRuleSubtreeStream stream_annotationElementValue=new RewriteRuleSubtreeStream(adaptor,"rule annotationElementValue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// Java.g:900:13: ( annotationInitializer ( COMMA annotationInitializer )* -> ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | annotationElementValue -> ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==IDENT) ) {
				int LA80_1 = input.LA(2);
				if ( (LA80_1==ASSIGN) ) {
					alt80=1;
				}
				else if ( (LA80_1==AND||LA80_1==BIT_SHIFT_RIGHT||LA80_1==DEC||LA80_1==DIV||LA80_1==DOT||LA80_1==EQUAL||(LA80_1 >= GREATER_OR_EQUAL && LA80_1 <= GREATER_THAN)||(LA80_1 >= INC && LA80_1 <= INSTANCEOF)||LA80_1==LBRACK||(LA80_1 >= LESS_OR_EQUAL && LA80_1 <= LESS_THAN)||LA80_1==LOGICAL_AND||LA80_1==LOGICAL_OR||LA80_1==LPAREN||LA80_1==MINUS||LA80_1==MOD||LA80_1==NOT_EQUAL||LA80_1==OR||LA80_1==PLUS||LA80_1==QUESTION||LA80_1==RPAREN||LA80_1==SHIFT_LEFT||LA80_1==SHIFT_RIGHT||LA80_1==STAR||LA80_1==XOR) ) {
					alt80=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 80, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA80_0==AT||LA80_0==BOOLEAN||LA80_0==BYTE||(LA80_0 >= CHAR && LA80_0 <= CHARACTER_LITERAL)||(LA80_0 >= DEC && LA80_0 <= DECIMAL_LITERAL)||LA80_0==DOUBLE||LA80_0==FALSE||(LA80_0 >= FLOAT && LA80_0 <= FLOATING_POINT_LITERAL)||LA80_0==HEX_LITERAL||LA80_0==INC||LA80_0==INT||LA80_0==LCURLY||LA80_0==LESS_THAN||LA80_0==LOGICAL_NOT||(LA80_0 >= LONG && LA80_0 <= LPAREN)||LA80_0==MINUS||(LA80_0 >= NEW && LA80_0 <= NOT)||LA80_0==NULL||LA80_0==OCTAL_LITERAL||LA80_0==PLUS||LA80_0==SHORT||(LA80_0 >= STRING_LITERAL && LA80_0 <= SUPER)||LA80_0==THIS||LA80_0==TRUE||LA80_0==VOID) ) {
				alt80=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// Java.g:900:17: annotationInitializer ( COMMA annotationInitializer )*
					{
					pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers12401);
					annotationInitializer235=annotationInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotationInitializer.add(annotationInitializer235.getTree());
					// Java.g:900:39: ( COMMA annotationInitializer )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==COMMA) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// Java.g:900:40: COMMA annotationInitializer
							{
							COMMA236=(Token)match(input,COMMA,FOLLOW_COMMA_in_annotationInitializers12404); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA236);

							pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers12406);
							annotationInitializer237=annotationInitializer();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_annotationInitializer.add(annotationInitializer237.getTree());
							}
							break;

						default :
							break loop79;
						}
					}

					// AST REWRITE
					// elements: annotationInitializer
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 901:17: -> ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
					{
						// Java.g:901:21: ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOTATION_INIT_KEY_LIST, "ANNOTATION_INIT_KEY_LIST"), root_1);
						if ( !(stream_annotationInitializer.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_annotationInitializer.hasNext() ) {
							adaptor.addChild(root_1, stream_annotationInitializer.nextTree());
						}
						stream_annotationInitializer.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Java.g:902:17: annotationElementValue
					{
					pushFollow(FOLLOW_annotationElementValue_in_annotationInitializers12452);
					annotationElementValue238=annotationElementValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotationElementValue.add(annotationElementValue238.getTree());
					// AST REWRITE
					// elements: annotationElementValue
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 903:17: -> ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
					{
						// Java.g:903:21: ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOTATION_INIT_DEFAULT_KEY, "ANNOTATION_INIT_DEFAULT_KEY"), root_1);
						adaptor.addChild(root_1, stream_annotationElementValue.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, annotationInitializers_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationInitializers"


	public static class annotationInitializer_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotationInitializer"
	// Java.g:906:1: annotationInitializer : IDENT ^ ASSIGN ! annotationElementValue ;
	public final JavaParser.annotationInitializer_return annotationInitializer() throws RecognitionException {
		JavaParser.annotationInitializer_return retval = new JavaParser.annotationInitializer_return();
		retval.start = input.LT(1);
		int annotationInitializer_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IDENT239=null;
		Token ASSIGN240=null;
		ParserRuleReturnScope annotationElementValue241 =null;

		CommonTree IDENT239_tree=null;
		CommonTree ASSIGN240_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// Java.g:907:13: ( IDENT ^ ASSIGN ! annotationElementValue )
			// Java.g:907:17: IDENT ^ ASSIGN ! annotationElementValue
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT239=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationInitializer12525); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT239_tree = (CommonTree)adaptor.create(IDENT239);
			root_0 = (CommonTree)adaptor.becomeRoot(IDENT239_tree, root_0);
			}

			ASSIGN240=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationInitializer12528); if (state.failed) return retval;
			pushFollow(FOLLOW_annotationElementValue_in_annotationInitializer12531);
			annotationElementValue241=annotationElementValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationElementValue241.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, annotationInitializer_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationInitializer"


	public static class annotationElementValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotationElementValue"
	// Java.g:910:1: annotationElementValue : ( annotationElementValueExpression | annotation | annotationElementValueArrayInitializer );
	public final JavaParser.annotationElementValue_return annotationElementValue() throws RecognitionException {
		JavaParser.annotationElementValue_return retval = new JavaParser.annotationElementValue_return();
		retval.start = input.LT(1);
		int annotationElementValue_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope annotationElementValueExpression242 =null;
		ParserRuleReturnScope annotation243 =null;
		ParserRuleReturnScope annotationElementValueArrayInitializer244 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// Java.g:911:13: ( annotationElementValueExpression | annotation | annotationElementValueArrayInitializer )
			int alt81=3;
			switch ( input.LA(1) ) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CHARACTER_LITERAL:
			case DEC:
			case DECIMAL_LITERAL:
			case DOUBLE:
			case FALSE:
			case FLOAT:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case IDENT:
			case INC:
			case INT:
			case LESS_THAN:
			case LOGICAL_NOT:
			case LONG:
			case LPAREN:
			case MINUS:
			case NEW:
			case NOT:
			case NULL:
			case OCTAL_LITERAL:
			case PLUS:
			case SHORT:
			case STRING_LITERAL:
			case SUPER:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt81=1;
				}
				break;
			case AT:
				{
				alt81=2;
				}
				break;
			case LCURLY:
				{
				alt81=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// Java.g:911:17: annotationElementValueExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_annotationElementValueExpression_in_annotationElementValue12578);
					annotationElementValueExpression242=annotationElementValueExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationElementValueExpression242.getTree());

					}
					break;
				case 2 :
					// Java.g:912:17: annotation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_annotation_in_annotationElementValue12596);
					annotation243=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation243.getTree());

					}
					break;
				case 3 :
					// Java.g:913:17: annotationElementValueArrayInitializer
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_annotationElementValueArrayInitializer_in_annotationElementValue12614);
					annotationElementValueArrayInitializer244=annotationElementValueArrayInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationElementValueArrayInitializer244.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, annotationElementValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationElementValue"


	public static class annotationElementValueExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotationElementValueExpression"
	// Java.g:916:1: annotationElementValueExpression : conditionalExpression -> ^( EXPR conditionalExpression ) ;
	public final JavaParser.annotationElementValueExpression_return annotationElementValueExpression() throws RecognitionException {
		JavaParser.annotationElementValueExpression_return retval = new JavaParser.annotationElementValueExpression_return();
		retval.start = input.LT(1);
		int annotationElementValueExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope conditionalExpression245 =null;

		RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// Java.g:917:13: ( conditionalExpression -> ^( EXPR conditionalExpression ) )
			// Java.g:917:17: conditionalExpression
			{
			pushFollow(FOLLOW_conditionalExpression_in_annotationElementValueExpression12661);
			conditionalExpression245=conditionalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression245.getTree());
			// AST REWRITE
			// elements: conditionalExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 918:17: -> ^( EXPR conditionalExpression )
			{
				// Java.g:918:21: ^( EXPR conditionalExpression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_conditionalExpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, annotationElementValueExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationElementValueExpression"


	public static class annotationElementValueArrayInitializer_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotationElementValueArrayInitializer"
	// Java.g:921:1: annotationElementValueArrayInitializer : LCURLY ( annotationElementValue ( COMMA annotationElementValue )* )? ( COMMA )? RCURLY -> ^( ANNOTATION_INIT_ARRAY_ELEMENT[$LCURLY, \"ANNOTATION_ELEM_VALUE_ARRAY_INIT\"] ( annotationElementValue )* ) ;
	public final JavaParser.annotationElementValueArrayInitializer_return annotationElementValueArrayInitializer() throws RecognitionException {
		JavaParser.annotationElementValueArrayInitializer_return retval = new JavaParser.annotationElementValueArrayInitializer_return();
		retval.start = input.LT(1);
		int annotationElementValueArrayInitializer_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LCURLY246=null;
		Token COMMA248=null;
		Token COMMA250=null;
		Token RCURLY251=null;
		ParserRuleReturnScope annotationElementValue247 =null;
		ParserRuleReturnScope annotationElementValue249 =null;

		CommonTree LCURLY246_tree=null;
		CommonTree COMMA248_tree=null;
		CommonTree COMMA250_tree=null;
		CommonTree RCURLY251_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_annotationElementValue=new RewriteRuleSubtreeStream(adaptor,"rule annotationElementValue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// Java.g:922:13: ( LCURLY ( annotationElementValue ( COMMA annotationElementValue )* )? ( COMMA )? RCURLY -> ^( ANNOTATION_INIT_ARRAY_ELEMENT[$LCURLY, \"ANNOTATION_ELEM_VALUE_ARRAY_INIT\"] ( annotationElementValue )* ) )
			// Java.g:922:17: LCURLY ( annotationElementValue ( COMMA annotationElementValue )* )? ( COMMA )? RCURLY
			{
			LCURLY246=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_annotationElementValueArrayInitializer12733); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY246);

			// Java.g:922:24: ( annotationElementValue ( COMMA annotationElementValue )* )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==AT||LA83_0==BOOLEAN||LA83_0==BYTE||(LA83_0 >= CHAR && LA83_0 <= CHARACTER_LITERAL)||(LA83_0 >= DEC && LA83_0 <= DECIMAL_LITERAL)||LA83_0==DOUBLE||LA83_0==FALSE||(LA83_0 >= FLOAT && LA83_0 <= FLOATING_POINT_LITERAL)||(LA83_0 >= HEX_LITERAL && LA83_0 <= IDENT)||LA83_0==INC||LA83_0==INT||LA83_0==LCURLY||LA83_0==LESS_THAN||LA83_0==LOGICAL_NOT||(LA83_0 >= LONG && LA83_0 <= LPAREN)||LA83_0==MINUS||(LA83_0 >= NEW && LA83_0 <= NOT)||LA83_0==NULL||LA83_0==OCTAL_LITERAL||LA83_0==PLUS||LA83_0==SHORT||(LA83_0 >= STRING_LITERAL && LA83_0 <= SUPER)||LA83_0==THIS||LA83_0==TRUE||LA83_0==VOID) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// Java.g:922:25: annotationElementValue ( COMMA annotationElementValue )*
					{
					pushFollow(FOLLOW_annotationElementValue_in_annotationElementValueArrayInitializer12736);
					annotationElementValue247=annotationElementValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotationElementValue.add(annotationElementValue247.getTree());
					// Java.g:922:48: ( COMMA annotationElementValue )*
					loop82:
					while (true) {
						int alt82=2;
						int LA82_0 = input.LA(1);
						if ( (LA82_0==COMMA) ) {
							int LA82_1 = input.LA(2);
							if ( (LA82_1==AT||LA82_1==BOOLEAN||LA82_1==BYTE||(LA82_1 >= CHAR && LA82_1 <= CHARACTER_LITERAL)||(LA82_1 >= DEC && LA82_1 <= DECIMAL_LITERAL)||LA82_1==DOUBLE||LA82_1==FALSE||(LA82_1 >= FLOAT && LA82_1 <= FLOATING_POINT_LITERAL)||(LA82_1 >= HEX_LITERAL && LA82_1 <= IDENT)||LA82_1==INC||LA82_1==INT||LA82_1==LCURLY||LA82_1==LESS_THAN||LA82_1==LOGICAL_NOT||(LA82_1 >= LONG && LA82_1 <= LPAREN)||LA82_1==MINUS||(LA82_1 >= NEW && LA82_1 <= NOT)||LA82_1==NULL||LA82_1==OCTAL_LITERAL||LA82_1==PLUS||LA82_1==SHORT||(LA82_1 >= STRING_LITERAL && LA82_1 <= SUPER)||LA82_1==THIS||LA82_1==TRUE||LA82_1==VOID) ) {
								alt82=1;
							}

						}

						switch (alt82) {
						case 1 :
							// Java.g:922:49: COMMA annotationElementValue
							{
							COMMA248=(Token)match(input,COMMA,FOLLOW_COMMA_in_annotationElementValueArrayInitializer12739); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA248);

							pushFollow(FOLLOW_annotationElementValue_in_annotationElementValueArrayInitializer12741);
							annotationElementValue249=annotationElementValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_annotationElementValue.add(annotationElementValue249.getTree());
							}
							break;

						default :
							break loop82;
						}
					}

					}
					break;

			}

			// Java.g:922:82: ( COMMA )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==COMMA) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// Java.g:922:83: COMMA
					{
					COMMA250=(Token)match(input,COMMA,FOLLOW_COMMA_in_annotationElementValueArrayInitializer12748); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA250);

					}
					break;

			}

			RCURLY251=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_annotationElementValueArrayInitializer12752); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY251);

			// AST REWRITE
			// elements: annotationElementValue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 923:17: -> ^( ANNOTATION_INIT_ARRAY_ELEMENT[$LCURLY, \"ANNOTATION_ELEM_VALUE_ARRAY_INIT\"] ( annotationElementValue )* )
			{
				// Java.g:923:21: ^( ANNOTATION_INIT_ARRAY_ELEMENT[$LCURLY, \"ANNOTATION_ELEM_VALUE_ARRAY_INIT\"] ( annotationElementValue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOTATION_INIT_ARRAY_ELEMENT, LCURLY246, "ANNOTATION_ELEM_VALUE_ARRAY_INIT"), root_1);
				// Java.g:923:98: ( annotationElementValue )*
				while ( stream_annotationElementValue.hasNext() ) {
					adaptor.addChild(root_1, stream_annotationElementValue.nextTree());
				}
				stream_annotationElementValue.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, annotationElementValueArrayInitializer_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationElementValueArrayInitializer"


	public static class annotationTypeDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotationTypeDeclaration"
	// Java.g:926:1: annotationTypeDeclaration[CommonTree modifiers] : AT INTERFACE IDENT annotationBody -> ^( AT IDENT annotationBody ) ;
	public final JavaParser.annotationTypeDeclaration_return annotationTypeDeclaration(CommonTree modifiers) throws RecognitionException {
		JavaParser.annotationTypeDeclaration_return retval = new JavaParser.annotationTypeDeclaration_return();
		retval.start = input.LT(1);
		int annotationTypeDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AT252=null;
		Token INTERFACE253=null;
		Token IDENT254=null;
		ParserRuleReturnScope annotationBody255 =null;

		CommonTree AT252_tree=null;
		CommonTree INTERFACE253_tree=null;
		CommonTree IDENT254_tree=null;
		RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
		RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleSubtreeStream stream_annotationBody=new RewriteRuleSubtreeStream(adaptor,"rule annotationBody");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// Java.g:927:13: ( AT INTERFACE IDENT annotationBody -> ^( AT IDENT annotationBody ) )
			// Java.g:927:17: AT INTERFACE IDENT annotationBody
			{
			AT252=(Token)match(input,AT,FOLLOW_AT_in_annotationTypeDeclaration12827); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_AT.add(AT252);

			INTERFACE253=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_annotationTypeDeclaration12829); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE253);

			IDENT254=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationTypeDeclaration12831); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT254);

			pushFollow(FOLLOW_annotationBody_in_annotationTypeDeclaration12833);
			annotationBody255=annotationBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_annotationBody.add(annotationBody255.getTree());
			// AST REWRITE
			// elements: annotationBody, IDENT, AT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 928:21: -> ^( AT IDENT annotationBody )
			{
				// Java.g:928:24: ^( AT IDENT annotationBody )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_AT.nextNode(), root_1);
				adaptor.addChild(root_1, modifiers);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				adaptor.addChild(root_1, stream_annotationBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, annotationTypeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationTypeDeclaration"


	public static class annotationBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotationBody"
	// Java.g:931:1: annotationBody : LCURLY ( annotationScopeDeclarations )* RCURLY -> ^( ANNOTATION_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( annotationScopeDeclarations )* ) ;
	public final JavaParser.annotationBody_return annotationBody() throws RecognitionException {
		JavaParser.annotationBody_return retval = new JavaParser.annotationBody_return();
		retval.start = input.LT(1);
		int annotationBody_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LCURLY256=null;
		Token RCURLY258=null;
		ParserRuleReturnScope annotationScopeDeclarations257 =null;

		CommonTree LCURLY256_tree=null;
		CommonTree RCURLY258_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_annotationScopeDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule annotationScopeDeclarations");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// Java.g:932:13: ( LCURLY ( annotationScopeDeclarations )* RCURLY -> ^( ANNOTATION_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( annotationScopeDeclarations )* ) )
			// Java.g:932:17: LCURLY ( annotationScopeDeclarations )* RCURLY
			{
			LCURLY256=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_annotationBody12912); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY256);

			// Java.g:932:24: ( annotationScopeDeclarations )*
			loop85:
			while (true) {
				int alt85=2;
				int LA85_0 = input.LA(1);
				if ( (LA85_0==ABSTRACT||LA85_0==AT||LA85_0==BOOLEAN||LA85_0==BYTE||LA85_0==CHAR||LA85_0==CLASS||LA85_0==DOUBLE||LA85_0==ENUM||LA85_0==FINAL||LA85_0==FLOAT||LA85_0==IDENT||LA85_0==INT||LA85_0==INTERFACE||LA85_0==LESS_THAN||LA85_0==LONG||LA85_0==NATIVE||(LA85_0 >= PRIVATE && LA85_0 <= PUBLIC)||LA85_0==SHORT||LA85_0==STATIC||LA85_0==STRICTFP||LA85_0==SYNCHRONIZED||LA85_0==TRANSIENT||LA85_0==VOID||LA85_0==VOLATILE) ) {
					alt85=1;
				}

				switch (alt85) {
				case 1 :
					// Java.g:932:24: annotationScopeDeclarations
					{
					pushFollow(FOLLOW_annotationScopeDeclarations_in_annotationBody12914);
					annotationScopeDeclarations257=annotationScopeDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotationScopeDeclarations.add(annotationScopeDeclarations257.getTree());
					}
					break;

				default :
					break loop85;
				}
			}

			RCURLY258=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_annotationBody12917); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY258);

			// AST REWRITE
			// elements: annotationScopeDeclarations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 933:17: -> ^( ANNOTATION_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( annotationScopeDeclarations )* )
			{
				// Java.g:933:21: ^( ANNOTATION_TOP_LEVEL_SCOPE[$LCURLY, \"CLASS_TOP_LEVEL_SCOPE\"] ( annotationScopeDeclarations )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOTATION_TOP_LEVEL_SCOPE, LCURLY256, "CLASS_TOP_LEVEL_SCOPE"), root_1);
				// Java.g:933:84: ( annotationScopeDeclarations )*
				while ( stream_annotationScopeDeclarations.hasNext() ) {
					adaptor.addChild(root_1, stream_annotationScopeDeclarations.nextTree());
				}
				stream_annotationScopeDeclarations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, annotationBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationBody"


	public static class annotationScopeDeclarations_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotationScopeDeclarations"
	// Java.g:936:1: annotationScopeDeclarations : ( modifierList type ( IDENT LPAREN RPAREN ( annotationDefaultValue )? SEMI -> ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | classFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type classFieldDeclaratorList ) ) | typeDeclaration );
	public final JavaParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException {
		JavaParser.annotationScopeDeclarations_return retval = new JavaParser.annotationScopeDeclarations_return();
		retval.start = input.LT(1);
		int annotationScopeDeclarations_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IDENT261=null;
		Token LPAREN262=null;
		Token RPAREN263=null;
		Token SEMI265=null;
		Token SEMI267=null;
		ParserRuleReturnScope modifierList259 =null;
		ParserRuleReturnScope type260 =null;
		ParserRuleReturnScope annotationDefaultValue264 =null;
		ParserRuleReturnScope classFieldDeclaratorList266 =null;
		ParserRuleReturnScope typeDeclaration268 =null;

		CommonTree IDENT261_tree=null;
		CommonTree LPAREN262_tree=null;
		CommonTree RPAREN263_tree=null;
		CommonTree SEMI265_tree=null;
		CommonTree SEMI267_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_annotationDefaultValue=new RewriteRuleSubtreeStream(adaptor,"rule annotationDefaultValue");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_modifierList=new RewriteRuleSubtreeStream(adaptor,"rule modifierList");
		RewriteRuleSubtreeStream stream_classFieldDeclaratorList=new RewriteRuleSubtreeStream(adaptor,"rule classFieldDeclaratorList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// Java.g:937:13: ( modifierList type ( IDENT LPAREN RPAREN ( annotationDefaultValue )? SEMI -> ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | classFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type classFieldDeclaratorList ) ) | typeDeclaration )
			int alt88=2;
			switch ( input.LA(1) ) {
			case PUBLIC:
				{
				int LA88_1 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case PROTECTED:
				{
				int LA88_2 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case PRIVATE:
				{
				int LA88_3 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case STATIC:
				{
				int LA88_4 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case ABSTRACT:
				{
				int LA88_5 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case NATIVE:
				{
				int LA88_6 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case SYNCHRONIZED:
				{
				int LA88_7 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case TRANSIENT:
				{
				int LA88_8 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case VOLATILE:
				{
				int LA88_9 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case STRICTFP:
				{
				int LA88_10 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case FINAL:
				{
				int LA88_11 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case AT:
				{
				int LA88_12 = input.LA(2);
				if ( (synpred116_Java()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case IDENT:
			case INT:
			case LONG:
			case SHORT:
				{
				alt88=1;
				}
				break;
			case CLASS:
			case ENUM:
			case INTERFACE:
				{
				alt88=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}
			switch (alt88) {
				case 1 :
					// Java.g:937:17: modifierList type ( IDENT LPAREN RPAREN ( annotationDefaultValue )? SEMI -> ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | classFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type classFieldDeclaratorList ) )
					{
					pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations12991);
					modifierList259=modifierList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_modifierList.add(modifierList259.getTree());
					pushFollow(FOLLOW_type_in_annotationScopeDeclarations12993);
					type260=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type.add(type260.getTree());
					// Java.g:938:17: ( IDENT LPAREN RPAREN ( annotationDefaultValue )? SEMI -> ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | classFieldDeclaratorList SEMI -> ^( VAR_DECLARATION modifierList type classFieldDeclaratorList ) )
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==IDENT) ) {
						int LA87_1 = input.LA(2);
						if ( (LA87_1==LPAREN) ) {
							alt87=1;
						}
						else if ( (LA87_1==ASSIGN||LA87_1==COMMA||LA87_1==LBRACK||LA87_1==SEMI) ) {
							alt87=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 87, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 87, 0, input);
						throw nvae;
					}

					switch (alt87) {
						case 1 :
							// Java.g:938:21: IDENT LPAREN RPAREN ( annotationDefaultValue )? SEMI
							{
							IDENT261=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationScopeDeclarations13015); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_IDENT.add(IDENT261);

							LPAREN262=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotationScopeDeclarations13017); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN262);

							RPAREN263=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotationScopeDeclarations13019); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN263);

							// Java.g:938:41: ( annotationDefaultValue )?
							int alt86=2;
							int LA86_0 = input.LA(1);
							if ( (LA86_0==DEFAULT) ) {
								alt86=1;
							}
							switch (alt86) {
								case 1 :
									// Java.g:938:41: annotationDefaultValue
									{
									pushFollow(FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations13021);
									annotationDefaultValue264=annotationDefaultValue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_annotationDefaultValue.add(annotationDefaultValue264.getTree());
									}
									break;

							}

							SEMI265=(Token)match(input,SEMI,FOLLOW_SEMI_in_annotationScopeDeclarations13024); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI.add(SEMI265);

							// AST REWRITE
							// elements: modifierList, type, IDENT, annotationDefaultValue
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 939:21: -> ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
							{
								// Java.g:939:25: ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOTATION_METHOD_DECL, "ANNOTATION_METHOD_DECL"), root_1);
								adaptor.addChild(root_1, stream_modifierList.nextTree());
								adaptor.addChild(root_1, stream_type.nextTree());
								adaptor.addChild(root_1, stream_IDENT.nextNode());
								// Java.g:939:74: ( annotationDefaultValue )?
								if ( stream_annotationDefaultValue.hasNext() ) {
									adaptor.addChild(root_1, stream_annotationDefaultValue.nextTree());
								}
								stream_annotationDefaultValue.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// Java.g:940:21: classFieldDeclaratorList SEMI
							{
							pushFollow(FOLLOW_classFieldDeclaratorList_in_annotationScopeDeclarations13082);
							classFieldDeclaratorList266=classFieldDeclaratorList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_classFieldDeclaratorList.add(classFieldDeclaratorList266.getTree());
							SEMI267=(Token)match(input,SEMI,FOLLOW_SEMI_in_annotationScopeDeclarations13084); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI.add(SEMI267);

							// AST REWRITE
							// elements: type, modifierList, classFieldDeclaratorList
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 941:21: -> ^( VAR_DECLARATION modifierList type classFieldDeclaratorList )
							{
								// Java.g:941:25: ^( VAR_DECLARATION modifierList type classFieldDeclaratorList )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECLARATION, "VAR_DECLARATION"), root_1);
								adaptor.addChild(root_1, stream_modifierList.nextTree());
								adaptor.addChild(root_1, stream_type.nextTree());
								adaptor.addChild(root_1, stream_classFieldDeclaratorList.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// Java.g:943:17: typeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typeDeclaration_in_annotationScopeDeclarations13153);
					typeDeclaration268=typeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration268.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, annotationScopeDeclarations_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationScopeDeclarations"


	public static class annotationDefaultValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotationDefaultValue"
	// Java.g:946:1: annotationDefaultValue : DEFAULT ^ annotationElementValue ;
	public final JavaParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException {
		JavaParser.annotationDefaultValue_return retval = new JavaParser.annotationDefaultValue_return();
		retval.start = input.LT(1);
		int annotationDefaultValue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DEFAULT269=null;
		ParserRuleReturnScope annotationElementValue270 =null;

		CommonTree DEFAULT269_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// Java.g:947:13: ( DEFAULT ^ annotationElementValue )
			// Java.g:947:17: DEFAULT ^ annotationElementValue
			{
			root_0 = (CommonTree)adaptor.nil();


			DEFAULT269=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationDefaultValue13200); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFAULT269_tree = (CommonTree)adaptor.create(DEFAULT269);
			root_0 = (CommonTree)adaptor.becomeRoot(DEFAULT269_tree, root_0);
			}

			pushFollow(FOLLOW_annotationElementValue_in_annotationDefaultValue13203);
			annotationElementValue270=annotationElementValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationElementValue270.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, annotationDefaultValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationDefaultValue"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// Java.g:952:1: block : LCURLY ( blockStatement )* RCURLY -> ^( BLOCK_SCOPE[$LCURLY, \"BLOCK_SCOPE\"] ( blockStatement )* ) ;
	public final JavaParser.block_return block() throws RecognitionException {
		JavaParser.block_return retval = new JavaParser.block_return();
		retval.start = input.LT(1);
		int block_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LCURLY271=null;
		Token RCURLY273=null;
		ParserRuleReturnScope blockStatement272 =null;

		CommonTree LCURLY271_tree=null;
		CommonTree RCURLY273_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_blockStatement=new RewriteRuleSubtreeStream(adaptor,"rule blockStatement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// Java.g:953:13: ( LCURLY ( blockStatement )* RCURLY -> ^( BLOCK_SCOPE[$LCURLY, \"BLOCK_SCOPE\"] ( blockStatement )* ) )
			// Java.g:953:17: LCURLY ( blockStatement )* RCURLY
			{
			LCURLY271=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block13256); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY271);

			if ( state.backtracking==0 ) {
			    symbolTable.enterScope();
			    if (leftCurly) {
			      tokens.replace(LCURLY271,"");
			    }
			    // code to insert for Polyverse for Loop
			    if (forBlock) {
			      metaPairStack.push("tp"+count);
			      count++;
			      metaVarStack.push("tTrue"+count);
			      count++;
			      tokens.insertAfter(LCURLY271,"\n \t if ("+ metaVarStack.peek() +".empty()) break;");
			      tokens.insertAfter(LCURLY271, "\n \t Metadata "+metaVarStack.peek()+" = "+metaPairStack.peek()+".trueMetadata();");
			      tokens.insertAfter(LCURLY271, "\n \t MetadataPair "+metaPairStack.peek()+" = "+forcondition+").MetadataPair();");
			      forBlock = false;
			    }
			    // code to insert in polyverse while block 
			    if (whileBlock) {
			      metaPairStack.push("tp"+count);
			      count++;
			      metaVarStack.push("tTrue"+count);
			      count++;
			      tokens.insertAfter(LCURLY271,"\n \t if ("+ metaVarStack.peek() +".empty()) break;");
			      tokens.insertAfter(LCURLY271, "\n \t Metadata "+metaVarStack.peek()+" = "+metaPairStack.peek()+".trueMetadata();");
			      tokens.insertAfter(LCURLY271, "\n \t MetadataPair "+metaPairStack.peek()+" = "+forcondition+".MetadataPair();");
			      //whileBlock = false;
			    }
			    if (methodBlock && !("void".equals(returnType))) {
			      tokens.insertAfter(LCURLY271,"\n"+returnType+" ret1 = new "+returnType+"("+metaPairStack.peek()+");");
			      methodBlock = false;
			      returnType="void";
			    }
			    /*if(doWhile) {
			      metaPairStack.push("tp"+count);
			      count++;
			      metaVarStack.push("tTrue"+count);
			      count++;
			      tokens.insertAfter(LCURLY271,"\n \t if ("+ metaVarStack.peek() +".empty()) break;");
			      tokens.insertAfter(LCURLY271, "\n \t Metadata "+metaVarStack.peek()+" = "+metaPairStack.peek()+".trueMetadata();");
			      tokens.insertAfter(LCURLY271, "\n \t MetadataPair "+metaPairStack.peek()+" = "+forcondition+".MetadataPair();");
			    }*/
			  }
			// Java.g:996:14: ( blockStatement )*
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==ABSTRACT||LA89_0==ASSERT||LA89_0==AT||(LA89_0 >= BOOLEAN && LA89_0 <= BYTE)||(LA89_0 >= CHAR && LA89_0 <= CLASS)||(LA89_0 >= CONTINUE && LA89_0 <= DECIMAL_LITERAL)||LA89_0==DO||LA89_0==DOUBLE||LA89_0==ENUM||(LA89_0 >= FALSE && LA89_0 <= FINAL)||(LA89_0 >= FLOAT && LA89_0 <= FLOATING_POINT_LITERAL)||LA89_0==FOR||(LA89_0 >= HEX_LITERAL && LA89_0 <= IF)||LA89_0==INC||LA89_0==INT||LA89_0==INTERFACE||LA89_0==LCURLY||LA89_0==LESS_THAN||LA89_0==LOGICAL_NOT||(LA89_0 >= LONG && LA89_0 <= LPAREN)||LA89_0==MINUS||(LA89_0 >= NATIVE && LA89_0 <= NOT)||LA89_0==NULL||LA89_0==OCTAL_LITERAL||LA89_0==PLUS||(LA89_0 >= PRIVATE && LA89_0 <= PUBLIC)||LA89_0==RETURN||LA89_0==SEMI||LA89_0==SHORT||LA89_0==STATIC||(LA89_0 >= STRICTFP && LA89_0 <= SUPER)||LA89_0==SWITCH||(LA89_0 >= SYNCHRONIZED && LA89_0 <= THIS)||LA89_0==THROW||(LA89_0 >= TRANSIENT && LA89_0 <= TRY)||LA89_0==VOID||(LA89_0 >= VOLATILE && LA89_0 <= WHILE)) ) {
					alt89=1;
				}

				switch (alt89) {
				case 1 :
					// Java.g:996:14: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_block13276);
					blockStatement272=blockStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_blockStatement.add(blockStatement272.getTree());
					}
					break;

				default :
					break loop89;
				}
			}

			if ( state.backtracking==0 ) {symbolTable.exitScope();}
			RCURLY273=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block13281); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY273);

			if ( state.backtracking==0 ) {
			    if (doPara) {
			      tokens.replace(RCURLY273,"");
			      doPara = false;
			    }
			    if (rightCurly) {
			      tokens.replace(RCURLY273,"");
			    }
			  }
			// AST REWRITE
			// elements: blockStatement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1006:17: -> ^( BLOCK_SCOPE[$LCURLY, \"BLOCK_SCOPE\"] ( blockStatement )* )
			{
				// Java.g:1006:21: ^( BLOCK_SCOPE[$LCURLY, \"BLOCK_SCOPE\"] ( blockStatement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, LCURLY271, "BLOCK_SCOPE"), root_1);
				// Java.g:1006:59: ( blockStatement )*
				while ( stream_blockStatement.hasNext() ) {
					adaptor.addChild(root_1, stream_blockStatement.nextTree());
				}
				stream_blockStatement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, block_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "block"


	public static class blockStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "blockStatement"
	// Java.g:1010:1: blockStatement : ( localVariableDeclaration SEMI !| typeDeclaration |q= statement );
	public final JavaParser.blockStatement_return blockStatement() throws RecognitionException {
		JavaParser.blockStatement_return retval = new JavaParser.blockStatement_return();
		retval.start = input.LT(1);
		int blockStatement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SEMI275=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope localVariableDeclaration274 =null;
		ParserRuleReturnScope typeDeclaration276 =null;

		CommonTree SEMI275_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// Java.g:1011:13: ( localVariableDeclaration SEMI !| typeDeclaration |q= statement )
			int alt90=3;
			switch ( input.LA(1) ) {
			case FINAL:
				{
				int LA90_1 = input.LA(2);
				if ( (synpred118_Java()) ) {
					alt90=1;
				}
				else if ( (synpred119_Java()) ) {
					alt90=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT:
				{
				int LA90_2 = input.LA(2);
				if ( (synpred118_Java()) ) {
					alt90=1;
				}
				else if ( (synpred119_Java()) ) {
					alt90=2;
				}
				else if ( (true) ) {
					alt90=3;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA90_3 = input.LA(2);
				if ( (synpred118_Java()) ) {
					alt90=1;
				}
				else if ( (true) ) {
					alt90=3;
				}

				}
				break;
			case CHAR:
				{
				int LA90_4 = input.LA(2);
				if ( (synpred118_Java()) ) {
					alt90=1;
				}
				else if ( (true) ) {
					alt90=3;
				}

				}
				break;
			case BYTE:
				{
				int LA90_5 = input.LA(2);
				if ( (synpred118_Java()) ) {
					alt90=1;
				}
				else if ( (true) ) {
					alt90=3;
				}

				}
				break;
			case SHORT:
				{
				int LA90_6 = input.LA(2);
				if ( (synpred118_Java()) ) {
					alt90=1;
				}
				else if ( (true) ) {
					alt90=3;
				}

				}
				break;
			case INT:
				{
				int LA90_7 = input.LA(2);
				if ( (synpred118_Java()) ) {
					alt90=1;
				}
				else if ( (true) ) {
					alt90=3;
				}

				}
				break;
			case LONG:
				{
				int LA90_8 = input.LA(2);
				if ( (synpred118_Java()) ) {
					alt90=1;
				}
				else if ( (true) ) {
					alt90=3;
				}

				}
				break;
			case FLOAT:
				{
				int LA90_9 = input.LA(2);
				if ( (synpred118_Java()) ) {
					alt90=1;
				}
				else if ( (true) ) {
					alt90=3;
				}

				}
				break;
			case DOUBLE:
				{
				int LA90_10 = input.LA(2);
				if ( (synpred118_Java()) ) {
					alt90=1;
				}
				else if ( (true) ) {
					alt90=3;
				}

				}
				break;
			case IDENT:
				{
				int LA90_11 = input.LA(2);
				if ( (synpred118_Java()) ) {
					alt90=1;
				}
				else if ( (true) ) {
					alt90=3;
				}

				}
				break;
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case INTERFACE:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case TRANSIENT:
			case VOLATILE:
				{
				alt90=2;
				}
				break;
			case SYNCHRONIZED:
				{
				int LA90_18 = input.LA(2);
				if ( (synpred119_Java()) ) {
					alt90=2;
				}
				else if ( (true) ) {
					alt90=3;
				}

				}
				break;
			case ASSERT:
			case BREAK:
			case CHARACTER_LITERAL:
			case CONTINUE:
			case DEC:
			case DECIMAL_LITERAL:
			case DO:
			case FALSE:
			case FLOATING_POINT_LITERAL:
			case FOR:
			case HEX_LITERAL:
			case IF:
			case INC:
			case LCURLY:
			case LESS_THAN:
			case LOGICAL_NOT:
			case LPAREN:
			case MINUS:
			case NEW:
			case NOT:
			case NULL:
			case OCTAL_LITERAL:
			case PLUS:
			case RETURN:
			case SEMI:
			case STRING_LITERAL:
			case SUPER:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case VOID:
			case WHILE:
				{
				alt90=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}
			switch (alt90) {
				case 1 :
					// Java.g:1011:17: localVariableDeclaration SEMI !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement13374);
					localVariableDeclaration274=localVariableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration274.getTree());

					SEMI275=(Token)match(input,SEMI,FOLLOW_SEMI_in_blockStatement13376); if (state.failed) return retval;
					}
					break;
				case 2 :
					// Java.g:1012:17: typeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typeDeclaration_in_blockStatement13395);
					typeDeclaration276=typeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration276.getTree());

					}
					break;
				case 3 :
					// Java.g:1013:17: q= statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_statement_in_blockStatement13415);
					q=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, blockStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "blockStatement"


	public static class localVariableDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "localVariableDeclaration"
	// Java.g:1016:9: localVariableDeclaration : localModifierList type classFieldDeclaratorList -> ^( VAR_DECLARATION localModifierList type classFieldDeclaratorList ) ;
	public final JavaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
		JavaParser.localVariableDeclaration_return retval = new JavaParser.localVariableDeclaration_return();
		retval.start = input.LT(1);
		int localVariableDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope localModifierList277 =null;
		ParserRuleReturnScope type278 =null;
		ParserRuleReturnScope classFieldDeclaratorList279 =null;

		RewriteRuleSubtreeStream stream_localModifierList=new RewriteRuleSubtreeStream(adaptor,"rule localModifierList");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_classFieldDeclaratorList=new RewriteRuleSubtreeStream(adaptor,"rule classFieldDeclaratorList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// Java.g:1017:13: ( localModifierList type classFieldDeclaratorList -> ^( VAR_DECLARATION localModifierList type classFieldDeclaratorList ) )
			// Java.g:1017:17: localModifierList type classFieldDeclaratorList
			{
			pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration13471);
			localModifierList277=localModifierList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_localModifierList.add(localModifierList277.getTree());
			pushFollow(FOLLOW_type_in_localVariableDeclaration13473);
			type278=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type278.getTree());
			pushFollow(FOLLOW_classFieldDeclaratorList_in_localVariableDeclaration13475);
			classFieldDeclaratorList279=classFieldDeclaratorList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classFieldDeclaratorList.add(classFieldDeclaratorList279.getTree());
			// AST REWRITE
			// elements: type, classFieldDeclaratorList, localModifierList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1018:17: -> ^( VAR_DECLARATION localModifierList type classFieldDeclaratorList )
			{
				// Java.g:1018:21: ^( VAR_DECLARATION localModifierList type classFieldDeclaratorList )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECLARATION, "VAR_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_localModifierList.nextTree());
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_classFieldDeclaratorList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, localVariableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "localVariableDeclaration"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// Java.g:1022:9: statement : ( block | annotation statement | ASSERT expr1= expression ( COLON expr2= expression SEMI -> ^( ASSERT $expr1 $expr2) | SEMI -> ^( ASSERT $expr1) ) | IF parenthesizedExpression ifStat= statement ( ELSE elseStat= statement -> ^( IF parenthesizedExpression $ifStat $elseStat) | -> ^( IF parenthesizedExpression $ifStat) ) | FOR LPAREN ( forInit SEMI z= forCondition SEMI forUpdater RPAREN statement -> ^( FOR forInit forCondition forUpdater statement ) | localModifierList type IDENT COLON expression RPAREN statement -> ^( FOR_EACH[$FOR, \"FOR_EACH\"] localModifierList type IDENT expression statement ) ) | WHILE q= parenthesizedExpression statement -> ^( WHILE parenthesizedExpression statement ) | DO statement WHILE q= parenthesizedExpression SEMI -> ^( DO statement parenthesizedExpression ) | TRY block ( catches ( finallyClause )? | finallyClause ) -> ^( TRY block ( catches )? ( finallyClause )? ) | SWITCH q= parenthesizedExpression LCURLY switchBlockLabels RCURLY -> ^( SWITCH parenthesizedExpression switchBlockLabels ) | SYNCHRONIZED parenthesizedExpression block -> ^( SYNCHRONIZED parenthesizedExpression block ) | RETURN (q= expression )? SEMI -> ^( RETURN ( expression )? ) | THROW expression SEMI -> ^( THROW expression ) | BREAK ( IDENT )? SEMI -> ^( BREAK ( IDENT )? ) | CONTINUE ( IDENT )? SEMI -> ^( CONTINUE ( IDENT )? ) | IDENT COLON statement -> ^( LABELED_STATEMENT IDENT statement ) | expression SEMI !| SEMI );
	public final JavaParser.statement_return statement() throws RecognitionException {
		JavaParser.statement_return retval = new JavaParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ASSERT283=null;
		Token COLON284=null;
		Token SEMI285=null;
		Token SEMI286=null;
		Token IF287=null;
		Token ELSE289=null;
		Token FOR290=null;
		Token LPAREN291=null;
		Token SEMI293=null;
		Token SEMI294=null;
		Token RPAREN296=null;
		Token IDENT300=null;
		Token COLON301=null;
		Token RPAREN303=null;
		Token WHILE305=null;
		Token DO307=null;
		Token WHILE309=null;
		Token SEMI310=null;
		Token TRY311=null;
		Token SWITCH316=null;
		Token LCURLY317=null;
		Token RCURLY319=null;
		Token SYNCHRONIZED320=null;
		Token RETURN323=null;
		Token SEMI324=null;
		Token THROW325=null;
		Token SEMI327=null;
		Token BREAK328=null;
		Token IDENT329=null;
		Token SEMI330=null;
		Token CONTINUE331=null;
		Token IDENT332=null;
		Token SEMI333=null;
		Token IDENT334=null;
		Token COLON335=null;
		Token SEMI338=null;
		Token SEMI339=null;
		ParserRuleReturnScope expr1 =null;
		ParserRuleReturnScope expr2 =null;
		ParserRuleReturnScope ifStat =null;
		ParserRuleReturnScope elseStat =null;
		ParserRuleReturnScope z =null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope block280 =null;
		ParserRuleReturnScope annotation281 =null;
		ParserRuleReturnScope statement282 =null;
		ParserRuleReturnScope parenthesizedExpression288 =null;
		ParserRuleReturnScope forInit292 =null;
		ParserRuleReturnScope forUpdater295 =null;
		ParserRuleReturnScope statement297 =null;
		ParserRuleReturnScope localModifierList298 =null;
		ParserRuleReturnScope type299 =null;
		ParserRuleReturnScope expression302 =null;
		ParserRuleReturnScope statement304 =null;
		ParserRuleReturnScope statement306 =null;
		ParserRuleReturnScope statement308 =null;
		ParserRuleReturnScope block312 =null;
		ParserRuleReturnScope catches313 =null;
		ParserRuleReturnScope finallyClause314 =null;
		ParserRuleReturnScope finallyClause315 =null;
		ParserRuleReturnScope switchBlockLabels318 =null;
		ParserRuleReturnScope parenthesizedExpression321 =null;
		ParserRuleReturnScope block322 =null;
		ParserRuleReturnScope expression326 =null;
		ParserRuleReturnScope statement336 =null;
		ParserRuleReturnScope expression337 =null;

		CommonTree ASSERT283_tree=null;
		CommonTree COLON284_tree=null;
		CommonTree SEMI285_tree=null;
		CommonTree SEMI286_tree=null;
		CommonTree IF287_tree=null;
		CommonTree ELSE289_tree=null;
		CommonTree FOR290_tree=null;
		CommonTree LPAREN291_tree=null;
		CommonTree SEMI293_tree=null;
		CommonTree SEMI294_tree=null;
		CommonTree RPAREN296_tree=null;
		CommonTree IDENT300_tree=null;
		CommonTree COLON301_tree=null;
		CommonTree RPAREN303_tree=null;
		CommonTree WHILE305_tree=null;
		CommonTree DO307_tree=null;
		CommonTree WHILE309_tree=null;
		CommonTree SEMI310_tree=null;
		CommonTree TRY311_tree=null;
		CommonTree SWITCH316_tree=null;
		CommonTree LCURLY317_tree=null;
		CommonTree RCURLY319_tree=null;
		CommonTree SYNCHRONIZED320_tree=null;
		CommonTree RETURN323_tree=null;
		CommonTree SEMI324_tree=null;
		CommonTree THROW325_tree=null;
		CommonTree SEMI327_tree=null;
		CommonTree BREAK328_tree=null;
		CommonTree IDENT329_tree=null;
		CommonTree SEMI330_tree=null;
		CommonTree CONTINUE331_tree=null;
		CommonTree IDENT332_tree=null;
		CommonTree SEMI333_tree=null;
		CommonTree IDENT334_tree=null;
		CommonTree COLON335_tree=null;
		CommonTree SEMI338_tree=null;
		CommonTree SEMI339_tree=null;
		RewriteRuleTokenStream stream_SYNCHRONIZED=new RewriteRuleTokenStream(adaptor,"token SYNCHRONIZED");
		RewriteRuleTokenStream stream_ASSERT=new RewriteRuleTokenStream(adaptor,"token ASSERT");
		RewriteRuleTokenStream stream_THROW=new RewriteRuleTokenStream(adaptor,"token THROW");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
		RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
		RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_parenthesizedExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenthesizedExpression");
		RewriteRuleSubtreeStream stream_forCondition=new RewriteRuleSubtreeStream(adaptor,"rule forCondition");
		RewriteRuleSubtreeStream stream_forUpdater=new RewriteRuleSubtreeStream(adaptor,"rule forUpdater");
		RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
		RewriteRuleSubtreeStream stream_localModifierList=new RewriteRuleSubtreeStream(adaptor,"rule localModifierList");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_catches=new RewriteRuleSubtreeStream(adaptor,"rule catches");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_switchBlockLabels=new RewriteRuleSubtreeStream(adaptor,"rule switchBlockLabels");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_finallyClause=new RewriteRuleSubtreeStream(adaptor,"rule finallyClause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// Java.g:1023:13: ( block | annotation statement | ASSERT expr1= expression ( COLON expr2= expression SEMI -> ^( ASSERT $expr1 $expr2) | SEMI -> ^( ASSERT $expr1) ) | IF parenthesizedExpression ifStat= statement ( ELSE elseStat= statement -> ^( IF parenthesizedExpression $ifStat $elseStat) | -> ^( IF parenthesizedExpression $ifStat) ) | FOR LPAREN ( forInit SEMI z= forCondition SEMI forUpdater RPAREN statement -> ^( FOR forInit forCondition forUpdater statement ) | localModifierList type IDENT COLON expression RPAREN statement -> ^( FOR_EACH[$FOR, \"FOR_EACH\"] localModifierList type IDENT expression statement ) ) | WHILE q= parenthesizedExpression statement -> ^( WHILE parenthesizedExpression statement ) | DO statement WHILE q= parenthesizedExpression SEMI -> ^( DO statement parenthesizedExpression ) | TRY block ( catches ( finallyClause )? | finallyClause ) -> ^( TRY block ( catches )? ( finallyClause )? ) | SWITCH q= parenthesizedExpression LCURLY switchBlockLabels RCURLY -> ^( SWITCH parenthesizedExpression switchBlockLabels ) | SYNCHRONIZED parenthesizedExpression block -> ^( SYNCHRONIZED parenthesizedExpression block ) | RETURN (q= expression )? SEMI -> ^( RETURN ( expression )? ) | THROW expression SEMI -> ^( THROW expression ) | BREAK ( IDENT )? SEMI -> ^( BREAK ( IDENT )? ) | CONTINUE ( IDENT )? SEMI -> ^( CONTINUE ( IDENT )? ) | IDENT COLON statement -> ^( LABELED_STATEMENT IDENT statement ) | expression SEMI !| SEMI )
			int alt99=17;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt99=1;
				}
				break;
			case AT:
				{
				alt99=2;
				}
				break;
			case ASSERT:
				{
				alt99=3;
				}
				break;
			case IF:
				{
				alt99=4;
				}
				break;
			case FOR:
				{
				alt99=5;
				}
				break;
			case WHILE:
				{
				alt99=6;
				}
				break;
			case DO:
				{
				alt99=7;
				}
				break;
			case TRY:
				{
				alt99=8;
				}
				break;
			case SWITCH:
				{
				alt99=9;
				}
				break;
			case SYNCHRONIZED:
				{
				alt99=10;
				}
				break;
			case RETURN:
				{
				alt99=11;
				}
				break;
			case THROW:
				{
				alt99=12;
				}
				break;
			case BREAK:
				{
				alt99=13;
				}
				break;
			case CONTINUE:
				{
				alt99=14;
				}
				break;
			case IDENT:
				{
				int LA99_15 = input.LA(2);
				if ( (LA99_15==COLON) ) {
					alt99=15;
				}
				else if ( ((LA99_15 >= AND && LA99_15 <= AND_ASSIGN)||LA99_15==ASSIGN||(LA99_15 >= BIT_SHIFT_RIGHT && LA99_15 <= BIT_SHIFT_RIGHT_ASSIGN)||LA99_15==DEC||(LA99_15 >= DIV && LA99_15 <= DIV_ASSIGN)||LA99_15==DOT||LA99_15==EQUAL||(LA99_15 >= GREATER_OR_EQUAL && LA99_15 <= GREATER_THAN)||(LA99_15 >= INC && LA99_15 <= INSTANCEOF)||LA99_15==LBRACK||(LA99_15 >= LESS_OR_EQUAL && LA99_15 <= LESS_THAN)||LA99_15==LOGICAL_AND||LA99_15==LOGICAL_OR||LA99_15==LPAREN||(LA99_15 >= MINUS && LA99_15 <= MOD)||LA99_15==MOD_ASSIGN||LA99_15==NOT_EQUAL||(LA99_15 >= OR && LA99_15 <= OR_ASSIGN)||(LA99_15 >= PLUS && LA99_15 <= PLUS_ASSIGN)||LA99_15==QUESTION||(LA99_15 >= SEMI && LA99_15 <= SHIFT_RIGHT_ASSIGN)||(LA99_15 >= STAR && LA99_15 <= STAR_ASSIGN)||(LA99_15 >= XOR && LA99_15 <= XOR_ASSIGN)) ) {
					alt99=16;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CHARACTER_LITERAL:
			case DEC:
			case DECIMAL_LITERAL:
			case DOUBLE:
			case FALSE:
			case FLOAT:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case INC:
			case INT:
			case LESS_THAN:
			case LOGICAL_NOT:
			case LONG:
			case LPAREN:
			case MINUS:
			case NEW:
			case NOT:
			case NULL:
			case OCTAL_LITERAL:
			case PLUS:
			case SHORT:
			case STRING_LITERAL:
			case SUPER:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt99=16;
				}
				break;
			case SEMI:
				{
				alt99=17;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// Java.g:1023:17: block
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_block_in_statement13577);
					block280=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block280.getTree());

					}
					break;
				case 2 :
					// Java.g:1032:18: annotation statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_annotation_in_statement13605);
					annotation281=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation281.getTree());

					pushFollow(FOLLOW_statement_in_statement13607);
					statement282=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement282.getTree());

					}
					break;
				case 3 :
					// Java.g:1033:18: ASSERT expr1= expression ( COLON expr2= expression SEMI -> ^( ASSERT $expr1 $expr2) | SEMI -> ^( ASSERT $expr1) )
					{
					ASSERT283=(Token)match(input,ASSERT,FOLLOW_ASSERT_in_statement13627); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSERT.add(ASSERT283);

					pushFollow(FOLLOW_expression_in_statement13631);
					expr1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expr1.getTree());
					// Java.g:1034:17: ( COLON expr2= expression SEMI -> ^( ASSERT $expr1 $expr2) | SEMI -> ^( ASSERT $expr1) )
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==COLON) ) {
						alt91=1;
					}
					else if ( (LA91_0==SEMI) ) {
						alt91=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 91, 0, input);
						throw nvae;
					}

					switch (alt91) {
						case 1 :
							// Java.g:1034:21: COLON expr2= expression SEMI
							{
							COLON284=(Token)match(input,COLON,FOLLOW_COLON_in_statement13655); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COLON.add(COLON284);

							pushFollow(FOLLOW_expression_in_statement13659);
							expr2=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expr2.getTree());
							SEMI285=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement13661); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI.add(SEMI285);

							// AST REWRITE
							// elements: ASSERT, expr1, expr2
							// token labels: 
							// rule labels: expr2, expr1, retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.getTree():null);
							RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1034:85: -> ^( ASSERT $expr1 $expr2)
							{
								// Java.g:1034:89: ^( ASSERT $expr1 $expr2)
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSERT.nextNode(), root_1);
								adaptor.addChild(root_1, stream_expr1.nextTree());
								adaptor.addChild(root_1, stream_expr2.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// Java.g:1035:21: SEMI
							{
							SEMI286=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement13732); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI.add(SEMI286);

							// AST REWRITE
							// elements: ASSERT, expr1
							// token labels: 
							// rule labels: expr1, retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1035:85: -> ^( ASSERT $expr1)
							{
								// Java.g:1035:89: ^( ASSERT $expr1)
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSERT.nextNode(), root_1);
								adaptor.addChild(root_1, stream_expr1.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 4 :
					// Java.g:1037:17: IF parenthesizedExpression ifStat= statement ( ELSE elseStat= statement -> ^( IF parenthesizedExpression $ifStat $elseStat) | -> ^( IF parenthesizedExpression $ifStat) )
					{
					IF287=(Token)match(input,IF,FOLLOW_IF_in_statement13837); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IF.add(IF287);

					pushFollow(FOLLOW_parenthesizedExpression_in_statement13858);
					parenthesizedExpression288=parenthesizedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parenthesizedExpression.add(parenthesizedExpression288.getTree());
					if ( state.backtracking==0 ) {
					    ifcondition = (parenthesizedExpression288!=null?input.toString(parenthesizedExpression288.start,parenthesizedExpression288.stop):null);
					    if (PolyverseScope.isPolyverse()) {
					      metaPairStack.push("tp"+count);
					      count++;
					      metaVarStack.push("tTrue"+count);
					      count++;
					      tokens.replace((parenthesizedExpression288!=null?(parenthesizedExpression288.start):null).getTokenIndex(),(parenthesizedExpression288!=null?(parenthesizedExpression288.stop):null).getTokenIndex(),"("+ metaVarStack.peek() +".notEmpty())");
					      tokens.insertBefore(IF287,"\t Metadata "+ metaVarStack.peek() +" = "+metaPairStack.peek()+".trueMetadata();\n"); 
					      tokens.insertBefore(IF287,"MetadataPair "+ metaPairStack.peek() +" = "+ifcondition+".MetadataPair();\n"); 
					      //polyverseIf = false;
					      //polyverseElse = true;
					      //seqIf = true;
					      //metaVarStack.pop();
					    }
					  }
					pushFollow(FOLLOW_statement_in_statement13887);
					ifStat=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(ifStat.getTree());
					if ( state.backtracking==0 ) {
					    if (PolyverseScope.isPolyverse()) {
					      metaVarStack.pop();
					    }
					  }
					// Java.g:1061:17: ( ELSE elseStat= statement -> ^( IF parenthesizedExpression $ifStat $elseStat) | -> ^( IF parenthesizedExpression $ifStat) )
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==ELSE) ) {
						int LA92_1 = input.LA(2);
						if ( (synpred124_Java()) ) {
							alt92=1;
						}
						else if ( (true) ) {
							alt92=2;
						}

					}
					else if ( (LA92_0==EOF||LA92_0==ABSTRACT||LA92_0==ASSERT||LA92_0==AT||(LA92_0 >= BOOLEAN && LA92_0 <= CASE)||(LA92_0 >= CHAR && LA92_0 <= CLASS)||(LA92_0 >= CONTINUE && LA92_0 <= DEFAULT)||LA92_0==DO||LA92_0==DOUBLE||LA92_0==ENUM||(LA92_0 >= FALSE && LA92_0 <= FINAL)||(LA92_0 >= FLOAT && LA92_0 <= FLOATING_POINT_LITERAL)||LA92_0==FOR||(LA92_0 >= HEX_LITERAL && LA92_0 <= IF)||LA92_0==INC||LA92_0==INT||LA92_0==INTERFACE||LA92_0==LCURLY||LA92_0==LESS_THAN||LA92_0==LOGICAL_NOT||(LA92_0 >= LONG && LA92_0 <= LPAREN)||LA92_0==MINUS||(LA92_0 >= NATIVE && LA92_0 <= NOT)||LA92_0==NULL||LA92_0==OCTAL_LITERAL||LA92_0==PLUS||(LA92_0 >= PRIVATE && LA92_0 <= PUBLIC)||(LA92_0 >= RCURLY && LA92_0 <= RETURN)||LA92_0==SEMI||LA92_0==SHORT||LA92_0==STATIC||(LA92_0 >= STRICTFP && LA92_0 <= SUPER)||LA92_0==SWITCH||(LA92_0 >= SYNCHRONIZED && LA92_0 <= THIS)||LA92_0==THROW||(LA92_0 >= TRANSIENT && LA92_0 <= TRY)||LA92_0==VOID||(LA92_0 >= VOLATILE && LA92_0 <= WHILE)) ) {
						alt92=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 92, 0, input);
						throw nvae;
					}

					switch (alt92) {
						case 1 :
							// Java.g:1061:21: ELSE elseStat= statement
							{
							ELSE289=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement13915); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ELSE.add(ELSE289);

							if ( state.backtracking==0 ) {
							    if (PolyverseScope.isPolyverse()) {
							      metaVarStack.push("tFalse"+count);
							      count++;
							      tokens.replace(ELSE289,"\t if ("+ metaVarStack.peek() +".notEmpty())");
							      tokens.insertBefore(ELSE289,"\t Metadata "+ metaVarStack.peek() +" = "+metaPairStack.peek()+".falseMetadata();\n");         
							      //polyverseElse = false;
							    }
							  }
							pushFollow(FOLLOW_statement_in_statement13940);
							elseStat=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_statement.add(elseStat.getTree());
							if ( state.backtracking==0 ) {
							    // remove the Metadata and MetadataPair
							    //metaVarStack.pop();
							    if (PolyverseScope.isPolyverse()) {
							      //System.out.println("In seqIf "+metaPairStack.peek());
							      metaPairStack.pop();
							      //seqIf = false;
							      //polyverseIf = false;
							      //polyverseElse = false;
							    }
							  }
							// AST REWRITE
							// elements: parenthesizedExpression, elseStat, IF, ifStat
							// token labels: 
							// rule labels: ifStat, elseStat, retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat",ifStat!=null?ifStat.getTree():null);
							RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat",elseStat!=null?elseStat.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1083:46: -> ^( IF parenthesizedExpression $ifStat $elseStat)
							{
								// Java.g:1083:50: ^( IF parenthesizedExpression $ifStat $elseStat)
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
								adaptor.addChild(root_1, stream_parenthesizedExpression.nextTree());
								adaptor.addChild(root_1, stream_ifStat.nextTree());
								adaptor.addChild(root_1, stream_elseStat.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// Java.g:1085:3: 
							{
							if ( state.backtracking==0 ) {
							    //if (seqIf)
							    if (PolyverseScope.isPolyverse()) {
							      //System.out.println("In seqIf "+metaPairStack.peek());
							      metaPairStack.pop();
							      //seqIf = false;
							      //polyverseElse = false;
							      //polyverseIf = false;
							    }
							  }
							// AST REWRITE
							// elements: parenthesizedExpression, IF, ifStat
							// token labels: 
							// rule labels: ifStat, retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat",ifStat!=null?ifStat.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1095:32: -> ^( IF parenthesizedExpression $ifStat)
							{
								// Java.g:1095:36: ^( IF parenthesizedExpression $ifStat)
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
								adaptor.addChild(root_1, stream_parenthesizedExpression.nextTree());
								adaptor.addChild(root_1, stream_ifStat.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 5 :
					// Java.g:1097:17: FOR LPAREN ( forInit SEMI z= forCondition SEMI forUpdater RPAREN statement -> ^( FOR forInit forCondition forUpdater statement ) | localModifierList type IDENT COLON expression RPAREN statement -> ^( FOR_EACH[$FOR, \"FOR_EACH\"] localModifierList type IDENT expression statement ) )
					{
					FOR290=(Token)match(input,FOR,FOLLOW_FOR_in_statement14183); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOR.add(FOR290);

					if ( state.backtracking==0 ) { 
					    if (PolyverseScope.isPolyverse()) {
					      forBlock=true;
					      forStart = true;
					    }
					  }
					LPAREN291=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement14212); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN291);

					// Java.g:1105:17: ( forInit SEMI z= forCondition SEMI forUpdater RPAREN statement -> ^( FOR forInit forCondition forUpdater statement ) | localModifierList type IDENT COLON expression RPAREN statement -> ^( FOR_EACH[$FOR, \"FOR_EACH\"] localModifierList type IDENT expression statement ) )
					int alt93=2;
					switch ( input.LA(1) ) {
					case FINAL:
						{
						int LA93_1 = input.LA(2);
						if ( (synpred126_Java()) ) {
							alt93=1;
						}
						else if ( (true) ) {
							alt93=2;
						}

						}
						break;
					case AT:
						{
						int LA93_2 = input.LA(2);
						if ( (synpred126_Java()) ) {
							alt93=1;
						}
						else if ( (true) ) {
							alt93=2;
						}

						}
						break;
					case BOOLEAN:
						{
						int LA93_3 = input.LA(2);
						if ( (synpred126_Java()) ) {
							alt93=1;
						}
						else if ( (true) ) {
							alt93=2;
						}

						}
						break;
					case CHAR:
						{
						int LA93_4 = input.LA(2);
						if ( (synpred126_Java()) ) {
							alt93=1;
						}
						else if ( (true) ) {
							alt93=2;
						}

						}
						break;
					case BYTE:
						{
						int LA93_5 = input.LA(2);
						if ( (synpred126_Java()) ) {
							alt93=1;
						}
						else if ( (true) ) {
							alt93=2;
						}

						}
						break;
					case SHORT:
						{
						int LA93_6 = input.LA(2);
						if ( (synpred126_Java()) ) {
							alt93=1;
						}
						else if ( (true) ) {
							alt93=2;
						}

						}
						break;
					case INT:
						{
						int LA93_7 = input.LA(2);
						if ( (synpred126_Java()) ) {
							alt93=1;
						}
						else if ( (true) ) {
							alt93=2;
						}

						}
						break;
					case LONG:
						{
						int LA93_8 = input.LA(2);
						if ( (synpred126_Java()) ) {
							alt93=1;
						}
						else if ( (true) ) {
							alt93=2;
						}

						}
						break;
					case FLOAT:
						{
						int LA93_9 = input.LA(2);
						if ( (synpred126_Java()) ) {
							alt93=1;
						}
						else if ( (true) ) {
							alt93=2;
						}

						}
						break;
					case DOUBLE:
						{
						int LA93_10 = input.LA(2);
						if ( (synpred126_Java()) ) {
							alt93=1;
						}
						else if ( (true) ) {
							alt93=2;
						}

						}
						break;
					case IDENT:
						{
						int LA93_11 = input.LA(2);
						if ( (synpred126_Java()) ) {
							alt93=1;
						}
						else if ( (true) ) {
							alt93=2;
						}

						}
						break;
					case CHARACTER_LITERAL:
					case DEC:
					case DECIMAL_LITERAL:
					case FALSE:
					case FLOATING_POINT_LITERAL:
					case HEX_LITERAL:
					case INC:
					case LESS_THAN:
					case LOGICAL_NOT:
					case LPAREN:
					case MINUS:
					case NEW:
					case NOT:
					case NULL:
					case OCTAL_LITERAL:
					case PLUS:
					case SEMI:
					case STRING_LITERAL:
					case SUPER:
					case THIS:
					case TRUE:
					case VOID:
						{
						alt93=1;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 93, 0, input);
						throw nvae;
					}
					switch (alt93) {
						case 1 :
							// Java.g:1105:21: forInit SEMI z= forCondition SEMI forUpdater RPAREN statement
							{
							pushFollow(FOLLOW_forInit_in_statement14234);
							forInit292=forInit();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_forInit.add(forInit292.getTree());
							SEMI293=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement14236); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI.add(SEMI293);

							pushFollow(FOLLOW_forCondition_in_statement14240);
							z=forCondition();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_forCondition.add(z.getTree());
							if ( state.backtracking==0 ) {
							    if (forStart) {
							      //System.out.println("for condition "+(z!=null?input.toString(z.start,z.stop):null));
							      forcondition = (z!=null?input.toString(z.start,z.stop):null);
							      tokens.replace((z!=null?(z.start):null).getTokenIndex(),(z!=null?(z.stop):null).getTokenIndex()+1,";");
							      forStart = false;
							    }
							  }
							SEMI294=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement14263); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI.add(SEMI294);

							pushFollow(FOLLOW_forUpdater_in_statement14265);
							forUpdater295=forUpdater();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_forUpdater.add(forUpdater295.getTree());
							RPAREN296=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement14267); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN296);

							pushFollow(FOLLOW_statement_in_statement14269);
							statement297=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_statement.add(statement297.getTree());
							if ( state.backtracking==0 ) {
							    // POPPING Metadata and MetadataPair
							    metaPairStack.pop();
							    metaVarStack.pop();
							  }
							// AST REWRITE
							// elements: forCondition, forInit, statement, FOR, forUpdater
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1120:21: -> ^( FOR forInit forCondition forUpdater statement )
							{
								// Java.g:1120:25: ^( FOR forInit forCondition forUpdater statement )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);
								adaptor.addChild(root_1, stream_forInit.nextTree());
								adaptor.addChild(root_1, stream_forCondition.nextTree());
								adaptor.addChild(root_1, stream_forUpdater.nextTree());
								adaptor.addChild(root_1, stream_statement.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// Java.g:1121:21: localModifierList type IDENT COLON expression RPAREN statement
							{
							pushFollow(FOLLOW_localModifierList_in_statement14333);
							localModifierList298=localModifierList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_localModifierList.add(localModifierList298.getTree());
							pushFollow(FOLLOW_type_in_statement14335);
							type299=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type.add(type299.getTree());
							IDENT300=(Token)match(input,IDENT,FOLLOW_IDENT_in_statement14337); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_IDENT.add(IDENT300);

							COLON301=(Token)match(input,COLON,FOLLOW_COLON_in_statement14339); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COLON.add(COLON301);

							pushFollow(FOLLOW_expression_in_statement14341);
							expression302=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression302.getTree());
							RPAREN303=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement14343); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN303);

							pushFollow(FOLLOW_statement_in_statement14345);
							statement304=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_statement.add(statement304.getTree());
							// AST REWRITE
							// elements: type, expression, localModifierList, statement, IDENT
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1121:85: -> ^( FOR_EACH[$FOR, \"FOR_EACH\"] localModifierList type IDENT expression statement )
							{
								// Java.g:1121:89: ^( FOR_EACH[$FOR, \"FOR_EACH\"] localModifierList type IDENT expression statement )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_EACH, FOR290, "FOR_EACH"), root_1);
								adaptor.addChild(root_1, stream_localModifierList.nextTree());
								adaptor.addChild(root_1, stream_type.nextTree());
								adaptor.addChild(root_1, stream_IDENT.nextNode());
								adaptor.addChild(root_1, stream_expression.nextTree());
								adaptor.addChild(root_1, stream_statement.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 6 :
					// Java.g:1124:16: WHILE q= parenthesizedExpression statement
					{
					WHILE305=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement14483); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHILE.add(WHILE305);

					if ( state.backtracking==0 ) { 
					    if (PolyverseScope.isPolyverse()) {
					      whileBlock=true;
					      //forStart = true;
					    }
					  }
					pushFollow(FOLLOW_parenthesizedExpression_in_statement14512);
					q=parenthesizedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parenthesizedExpression.add(q.getTree());
					if ( state.backtracking==0 ) {
					    if (whileBlock) {
					      forcondition = (q!=null?input.toString(q.start,q.stop):null);
					      tokens.replace((q!=null?(q.start):null).getTokenIndex(),(q!=null?(q.stop):null).getTokenIndex(),"(true)");
					    }
					  }
					pushFollow(FOLLOW_statement_in_statement14535);
					statement306=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement306.getTree());
					if ( state.backtracking==0 ) {
					    // POPPING Metadata and MetadataPair
					    if (whileBlock) {
					      //System.out.println("In while "+metaPairStack.peek());
					      if (!breakTrue) {
					        metaPairStack.pop();
					      }
					      metaVarStack.pop();
					      whileBlock = false;
					      breakTrue = false;
					    }
					  }
					// AST REWRITE
					// elements: parenthesizedExpression, WHILE, statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1151:17: -> ^( WHILE parenthesizedExpression statement )
					{
						// Java.g:1151:21: ^( WHILE parenthesizedExpression statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_parenthesizedExpression.nextTree());
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// Java.g:1152:17: DO statement WHILE q= parenthesizedExpression SEMI
					{
					DO307=(Token)match(input,DO,FOLLOW_DO_in_statement14613); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO.add(DO307);

					if ( state.backtracking==0 ) {
					    if (PolyverseScope.isPolyverse()) {
					      doWhile = true;
					      doPara = true;
					      //tokens.insertBefore(DO307,"\t Metadata "+ metaVarStack.peek() +" = "+metaPairStack.peek()+".falseMetadata();\n");         
					    }
					  }
					pushFollow(FOLLOW_statement_in_statement14632);
					statement308=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement308.getTree());
					WHILE309=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement14634); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHILE.add(WHILE309);

					pushFollow(FOLLOW_parenthesizedExpression_in_statement14638);
					q=parenthesizedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parenthesizedExpression.add(q.getTree());
					if ( state.backtracking==0 ) {
					    if (doWhile) {
					      //code 
					      metaPairStack.push("tp"+count);
					      count++;
					      metaVarStack.push("tTrue"+count);
					      count++;
					      tokens.insertBefore(WHILE309,"\t Metadata "+ metaVarStack.peek() +" = "+metaPairStack.peek()+".trueMetadata();\n }\n"); 
					      tokens.insertBefore(WHILE309,"MetadataPair "+ metaPairStack.peek() +" = "+(q!=null?input.toString(q.start,q.stop):null)+".MetadataPair();\n"); 
					      tokens.replace((q!=null?(q.start):null).getTokenIndex(),(q!=null?(q.stop):null).getTokenIndex(),"(true)");        
					      doWhile = false;
					    }
					  }
					SEMI310=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement14659); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI.add(SEMI310);

					if ( state.backtracking==0 ) {
					    metaVarStack.pop(); 
					    metaPairStack.pop();
					  }
					// AST REWRITE
					// elements: statement, parenthesizedExpression, DO
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1179:36: -> ^( DO statement parenthesizedExpression )
					{
						// Java.g:1179:40: ^( DO statement parenthesizedExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_DO.nextNode(), root_1);
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_1, stream_parenthesizedExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// Java.g:1180:16: TRY block ( catches ( finallyClause )? | finallyClause )
					{
					TRY311=(Token)match(input,TRY,FOLLOW_TRY_in_statement14736); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TRY.add(TRY311);

					pushFollow(FOLLOW_block_in_statement14738);
					block312=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_block.add(block312.getTree());
					// Java.g:1180:26: ( catches ( finallyClause )? | finallyClause )
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==CATCH) ) {
						alt95=1;
					}
					else if ( (LA95_0==FINALLY) ) {
						alt95=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 95, 0, input);
						throw nvae;
					}

					switch (alt95) {
						case 1 :
							// Java.g:1180:27: catches ( finallyClause )?
							{
							pushFollow(FOLLOW_catches_in_statement14741);
							catches313=catches();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_catches.add(catches313.getTree());
							// Java.g:1180:35: ( finallyClause )?
							int alt94=2;
							int LA94_0 = input.LA(1);
							if ( (LA94_0==FINALLY) ) {
								alt94=1;
							}
							switch (alt94) {
								case 1 :
									// Java.g:1180:35: finallyClause
									{
									pushFollow(FOLLOW_finallyClause_in_statement14743);
									finallyClause314=finallyClause();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_finallyClause.add(finallyClause314.getTree());
									}
									break;

							}

							}
							break;
						case 2 :
							// Java.g:1180:52: finallyClause
							{
							pushFollow(FOLLOW_finallyClause_in_statement14748);
							finallyClause315=finallyClause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_finallyClause.add(finallyClause315.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: block, catches, finallyClause, TRY
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1180:82: -> ^( TRY block ( catches )? ( finallyClause )? )
					{
						// Java.g:1180:86: ^( TRY block ( catches )? ( finallyClause )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						// Java.g:1180:98: ( catches )?
						if ( stream_catches.hasNext() ) {
							adaptor.addChild(root_1, stream_catches.nextTree());
						}
						stream_catches.reset();

						// Java.g:1180:107: ( finallyClause )?
						if ( stream_finallyClause.hasNext() ) {
							adaptor.addChild(root_1, stream_finallyClause.nextTree());
						}
						stream_finallyClause.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					// Java.g:1181:16: SWITCH q= parenthesizedExpression LCURLY switchBlockLabels RCURLY
					{
					SWITCH316=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement14796); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH316);

					if ( state.backtracking==0 ) {
					    if (PolyverseScope.isPolyverse()) {
					      switchCase = true;
					      doPara = true;
					      leftCurly = true;
					      rightCurly = true;
					    }
					    tokens.replace(SWITCH316,"");
					  }
					pushFollow(FOLLOW_parenthesizedExpression_in_statement14817);
					q=parenthesizedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parenthesizedExpression.add(q.getTree());
					if ( state.backtracking==0 ) {
					    tokens.replace((q!=null?(q.start):null).getTokenIndex(),(q!=null?(q.stop):null).getTokenIndex(),"");
					  }
					LCURLY317=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_statement14845); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY317);

					if ( state.backtracking==0 ) {
					    tokens.replace(LCURLY317,"");
					    symbolTable.enterScope();
					  }
					pushFollow(FOLLOW_switchBlockLabels_in_statement14879);
					switchBlockLabels318=switchBlockLabels();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_switchBlockLabels.add(switchBlockLabels318.getTree());
					if ( state.backtracking==0 ) {
					    symbolTable.exitScope(); 
					    cases.removeAllElements(); 
					    statements.removeAllElements();
					    switchCase = false;
					    doPara = false;
					    leftCurly = false;
					    rightCurly = false;
					  }
					RCURLY319=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_statement14899); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY319);

					if ( state.backtracking==0 ) {
					    tokens.replace(RCURLY319,"");
					  }
					// AST REWRITE
					// elements: SWITCH, parenthesizedExpression, switchBlockLabels
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1215:16: -> ^( SWITCH parenthesizedExpression switchBlockLabels )
					{
						// Java.g:1215:20: ^( SWITCH parenthesizedExpression switchBlockLabels )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_SWITCH.nextNode(), root_1);
						adaptor.addChild(root_1, stream_parenthesizedExpression.nextTree());
						adaptor.addChild(root_1, stream_switchBlockLabels.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 10 :
					// Java.g:1216:17: SYNCHRONIZED parenthesizedExpression block
					{
					SYNCHRONIZED320=(Token)match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement14953); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SYNCHRONIZED.add(SYNCHRONIZED320);

					pushFollow(FOLLOW_parenthesizedExpression_in_statement14955);
					parenthesizedExpression321=parenthesizedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parenthesizedExpression.add(parenthesizedExpression321.getTree());
					pushFollow(FOLLOW_block_in_statement14957);
					block322=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_block.add(block322.getTree());
					// AST REWRITE
					// elements: block, SYNCHRONIZED, parenthesizedExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1216:84: -> ^( SYNCHRONIZED parenthesizedExpression block )
					{
						// Java.g:1216:88: ^( SYNCHRONIZED parenthesizedExpression block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_SYNCHRONIZED.nextNode(), root_1);
						adaptor.addChild(root_1, stream_parenthesizedExpression.nextTree());
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 11 :
					// Java.g:1217:17: RETURN (q= expression )? SEMI
					{
					RETURN323=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement15010); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RETURN.add(RETURN323);

					if ( state.backtracking==0 ) {
					    if (PolyverseScope.isPolyverse()) {
					      polyverseReturn = true;
					      //PolyverseScope.isPolyverse() = false;
					    }
					  }
					// Java.g:1224:15: (q= expression )?
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==BOOLEAN||LA96_0==BYTE||(LA96_0 >= CHAR && LA96_0 <= CHARACTER_LITERAL)||(LA96_0 >= DEC && LA96_0 <= DECIMAL_LITERAL)||LA96_0==DOUBLE||LA96_0==FALSE||(LA96_0 >= FLOAT && LA96_0 <= FLOATING_POINT_LITERAL)||(LA96_0 >= HEX_LITERAL && LA96_0 <= IDENT)||LA96_0==INC||LA96_0==INT||LA96_0==LESS_THAN||LA96_0==LOGICAL_NOT||(LA96_0 >= LONG && LA96_0 <= LPAREN)||LA96_0==MINUS||(LA96_0 >= NEW && LA96_0 <= NOT)||LA96_0==NULL||LA96_0==OCTAL_LITERAL||LA96_0==PLUS||LA96_0==SHORT||(LA96_0 >= STRING_LITERAL && LA96_0 <= SUPER)||LA96_0==THIS||LA96_0==TRUE||LA96_0==VOID) ) {
						alt96=1;
					}
					switch (alt96) {
						case 1 :
							// Java.g:1224:15: q= expression
							{
							pushFollow(FOLLOW_expression_in_statement15032);
							q=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(q.getTree());
							}
							break;

					}

					if ( state.backtracking==0 ) {
					    if (polyverseReturn) {
					      tokens.replace(RETURN323,"ret1.merge("+(q!=null?input.toString(q.start,q.stop):null)+");\n");        
					      String temp = metaVarStack.peek();
					      tokens.insertAfter(RETURN323,temp+" = new Time(null);");
					      //tokens.replace(RETURN323,"");  
					      tokens.replace((q!=null?(q.start):null).getTokenIndex(),(q!=null?(q.stop):null).getTokenIndex(),"");
					      polyverseReturn = false;          
					    }
					  }
					SEMI324=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement15053); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI.add(SEMI324);

					// AST REWRITE
					// elements: RETURN, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1236:15: -> ^( RETURN ( expression )? )
					{
						// Java.g:1236:19: ^( RETURN ( expression )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);
						// Java.g:1236:28: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 12 :
					// Java.g:1237:17: THROW expression SEMI
					{
					THROW325=(Token)match(input,THROW,FOLLOW_THROW_in_statement15095); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_THROW.add(THROW325);

					pushFollow(FOLLOW_expression_in_statement15097);
					expression326=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression326.getTree());
					SEMI327=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement15099); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI.add(SEMI327);

					// AST REWRITE
					// elements: expression, THROW
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1237:85: -> ^( THROW expression )
					{
						// Java.g:1237:89: ^( THROW expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_THROW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 13 :
					// Java.g:1238:17: BREAK ( IDENT )? SEMI
					{
					BREAK328=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement15172); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BREAK.add(BREAK328);

					if ( state.backtracking==0 ) {
					    isBreak = true;
					    if (PolyverseScope.isPolyverse()) {
					      String temp = metaVarStack.peek();
					      metaPairStack.pop();
					      breakTrue = true;
					      x = metaPairStack.iterator();
					      while (x.hasNext()) {
					        tokens.insertAfter(BREAK328,x.next()+".subtractTime("+temp+");\n");
					      }
					      tokens.replace(BREAK328,"");
					      //PolyverseScope.isPolyverse() = false;
					    }
					  }
					// Java.g:1253:14: ( IDENT )?
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==IDENT) ) {
						alt97=1;
					}
					switch (alt97) {
						case 1 :
							// Java.g:1253:14: IDENT
							{
							IDENT329=(Token)match(input,IDENT,FOLLOW_IDENT_in_statement15191); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_IDENT.add(IDENT329);

							}
							break;

					}

					SEMI330=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement15194); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI.add(SEMI330);

					// AST REWRITE
					// elements: BREAK, IDENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1253:65: -> ^( BREAK ( IDENT )? )
					{
						// Java.g:1253:69: ^( BREAK ( IDENT )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);
						// Java.g:1253:77: ( IDENT )?
						if ( stream_IDENT.hasNext() ) {
							adaptor.addChild(root_1, stream_IDENT.nextNode());
						}
						stream_IDENT.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 14 :
					// Java.g:1254:17: CONTINUE ( IDENT )? SEMI
					{
					CONTINUE331=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement15261); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE331);

					if ( state.backtracking==0 ) {
					    if (PolyverseScope.isPolyverse()) {
					      String temp = metaVarStack.peek();
					      tokens.replace(CONTINUE331,temp+" = new Time(null);");
					      //PolyverseScope.isPolyverse() = false;
					    }
					  }
					// Java.g:1262:17: ( IDENT )?
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==IDENT) ) {
						alt98=1;
					}
					switch (alt98) {
						case 1 :
							// Java.g:1262:17: IDENT
							{
							IDENT332=(Token)match(input,IDENT,FOLLOW_IDENT_in_statement15284); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_IDENT.add(IDENT332);

							}
							break;

					}

					SEMI333=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement15287); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI.add(SEMI333);

					// AST REWRITE
					// elements: CONTINUE, IDENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1263:17: -> ^( CONTINUE ( IDENT )? )
					{
						// Java.g:1263:21: ^( CONTINUE ( IDENT )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);
						// Java.g:1263:32: ( IDENT )?
						if ( stream_IDENT.hasNext() ) {
							adaptor.addChild(root_1, stream_IDENT.nextNode());
						}
						stream_IDENT.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 15 :
					// Java.g:1264:17: IDENT COLON statement
					{
					IDENT334=(Token)match(input,IDENT,FOLLOW_IDENT_in_statement15331); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENT.add(IDENT334);

					COLON335=(Token)match(input,COLON,FOLLOW_COLON_in_statement15333); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON.add(COLON335);

					pushFollow(FOLLOW_statement_in_statement15335);
					statement336=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement336.getTree());
					// AST REWRITE
					// elements: statement, IDENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1265:17: -> ^( LABELED_STATEMENT IDENT statement )
					{
						// Java.g:1265:21: ^( LABELED_STATEMENT IDENT statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABELED_STATEMENT, "LABELED_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_IDENT.nextNode());
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 16 :
					// Java.g:1266:17: expression SEMI !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_statement15380);
					expression337=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression337.getTree());

					SEMI338=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement15382); if (state.failed) return retval;
					}
					break;
				case 17 :
					// Java.g:1267:17: SEMI
					{
					root_0 = (CommonTree)adaptor.nil();


					SEMI339=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement15401); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMI339_tree = (CommonTree)adaptor.create(SEMI339);
					adaptor.addChild(root_0, SEMI339_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class catches_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "catches"
	// Java.g:1270:1: catches : ( catchClause )+ -> ^( CATCH_CLAUSE_LIST ( catchClause )+ ) ;
	public final JavaParser.catches_return catches() throws RecognitionException {
		JavaParser.catches_return retval = new JavaParser.catches_return();
		retval.start = input.LT(1);
		int catches_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope catchClause340 =null;

		RewriteRuleSubtreeStream stream_catchClause=new RewriteRuleSubtreeStream(adaptor,"rule catchClause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// Java.g:1271:13: ( ( catchClause )+ -> ^( CATCH_CLAUSE_LIST ( catchClause )+ ) )
			// Java.g:1271:17: ( catchClause )+
			{
			// Java.g:1271:17: ( catchClause )+
			int cnt100=0;
			loop100:
			while (true) {
				int alt100=2;
				int LA100_0 = input.LA(1);
				if ( (LA100_0==CATCH) ) {
					alt100=1;
				}

				switch (alt100) {
				case 1 :
					// Java.g:1271:17: catchClause
					{
					pushFollow(FOLLOW_catchClause_in_catches15464);
					catchClause340=catchClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_catchClause.add(catchClause340.getTree());
					}
					break;

				default :
					if ( cnt100 >= 1 ) break loop100;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(100, input);
					throw eee;
				}
				cnt100++;
			}

			// AST REWRITE
			// elements: catchClause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1272:17: -> ^( CATCH_CLAUSE_LIST ( catchClause )+ )
			{
				// Java.g:1272:21: ^( CATCH_CLAUSE_LIST ( catchClause )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CATCH_CLAUSE_LIST, "CATCH_CLAUSE_LIST"), root_1);
				if ( !(stream_catchClause.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_catchClause.hasNext() ) {
					adaptor.addChild(root_1, stream_catchClause.nextTree());
				}
				stream_catchClause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, catches_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "catches"


	public static class catchClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "catchClause"
	// Java.g:1275:1: catchClause : CATCH ^ LPAREN ! formalParameterStandardDecl RPAREN ! block ;
	public final JavaParser.catchClause_return catchClause() throws RecognitionException {
		JavaParser.catchClause_return retval = new JavaParser.catchClause_return();
		retval.start = input.LT(1);
		int catchClause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CATCH341=null;
		Token LPAREN342=null;
		Token RPAREN344=null;
		ParserRuleReturnScope formalParameterStandardDecl343 =null;
		ParserRuleReturnScope block345 =null;

		CommonTree CATCH341_tree=null;
		CommonTree LPAREN342_tree=null;
		CommonTree RPAREN344_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// Java.g:1276:13: ( CATCH ^ LPAREN ! formalParameterStandardDecl RPAREN ! block )
			// Java.g:1276:17: CATCH ^ LPAREN ! formalParameterStandardDecl RPAREN ! block
			{
			root_0 = (CommonTree)adaptor.nil();


			CATCH341=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchClause15538); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CATCH341_tree = (CommonTree)adaptor.create(CATCH341);
			root_0 = (CommonTree)adaptor.becomeRoot(CATCH341_tree, root_0);
			}

			LPAREN342=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchClause15541); if (state.failed) return retval;
			pushFollow(FOLLOW_formalParameterStandardDecl_in_catchClause15544);
			formalParameterStandardDecl343=formalParameterStandardDecl();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterStandardDecl343.getTree());

			RPAREN344=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchClause15546); if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_catchClause15549);
			block345=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block345.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, catchClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "catchClause"


	public static class finallyClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "finallyClause"
	// Java.g:1279:1: finallyClause : FINALLY block -> block ;
	public final JavaParser.finallyClause_return finallyClause() throws RecognitionException {
		JavaParser.finallyClause_return retval = new JavaParser.finallyClause_return();
		retval.start = input.LT(1);
		int finallyClause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FINALLY346=null;
		ParserRuleReturnScope block347 =null;

		CommonTree FINALLY346_tree=null;
		RewriteRuleTokenStream stream_FINALLY=new RewriteRuleTokenStream(adaptor,"token FINALLY");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// Java.g:1280:13: ( FINALLY block -> block )
			// Java.g:1280:17: FINALLY block
			{
			FINALLY346=(Token)match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause15592); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FINALLY.add(FINALLY346);

			pushFollow(FOLLOW_block_in_finallyClause15594);
			block347=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block347.getTree());
			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1281:17: -> block
			{
				adaptor.addChild(root_0, stream_block.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, finallyClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "finallyClause"


	public static class switchBlockLabels_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "switchBlockLabels"
	// Java.g:1284:1: switchBlockLabels : switchCaseLabels ( switchDefaultLabel )? switchCaseLabels -> ^( SWITCH_BLOCK_LABEL_LIST switchCaseLabels ( switchDefaultLabel )? switchCaseLabels ) ;
	public final JavaParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException {
		JavaParser.switchBlockLabels_return retval = new JavaParser.switchBlockLabels_return();
		retval.start = input.LT(1);
		int switchBlockLabels_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope switchCaseLabels348 =null;
		ParserRuleReturnScope switchDefaultLabel349 =null;
		ParserRuleReturnScope switchCaseLabels350 =null;

		RewriteRuleSubtreeStream stream_switchDefaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule switchDefaultLabel");
		RewriteRuleSubtreeStream stream_switchCaseLabels=new RewriteRuleSubtreeStream(adaptor,"rule switchCaseLabels");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// Java.g:1285:13: ( switchCaseLabels ( switchDefaultLabel )? switchCaseLabels -> ^( SWITCH_BLOCK_LABEL_LIST switchCaseLabels ( switchDefaultLabel )? switchCaseLabels ) )
			// Java.g:1285:17: switchCaseLabels ( switchDefaultLabel )? switchCaseLabels
			{
			pushFollow(FOLLOW_switchCaseLabels_in_switchBlockLabels15658);
			switchCaseLabels348=switchCaseLabels();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_switchCaseLabels.add(switchCaseLabels348.getTree());
			// Java.g:1285:34: ( switchDefaultLabel )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==DEFAULT) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// Java.g:1285:34: switchDefaultLabel
					{
					pushFollow(FOLLOW_switchDefaultLabel_in_switchBlockLabels15660);
					switchDefaultLabel349=switchDefaultLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_switchDefaultLabel.add(switchDefaultLabel349.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_switchCaseLabels_in_switchBlockLabels15663);
			switchCaseLabels350=switchCaseLabels();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_switchCaseLabels.add(switchCaseLabels350.getTree());
			// AST REWRITE
			// elements: switchCaseLabels, switchCaseLabels, switchDefaultLabel
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1286:17: -> ^( SWITCH_BLOCK_LABEL_LIST switchCaseLabels ( switchDefaultLabel )? switchCaseLabels )
			{
				// Java.g:1286:21: ^( SWITCH_BLOCK_LABEL_LIST switchCaseLabels ( switchDefaultLabel )? switchCaseLabels )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SWITCH_BLOCK_LABEL_LIST, "SWITCH_BLOCK_LABEL_LIST"), root_1);
				adaptor.addChild(root_1, stream_switchCaseLabels.nextTree());
				// Java.g:1286:64: ( switchDefaultLabel )?
				if ( stream_switchDefaultLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_switchDefaultLabel.nextTree());
				}
				stream_switchDefaultLabel.reset();

				adaptor.addChild(root_1, stream_switchCaseLabels.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, switchBlockLabels_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchBlockLabels"


	public static class switchCaseLabels_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "switchCaseLabels"
	// Java.g:1289:1: switchCaseLabels : ( switchCaseLabel )* ;
	public final JavaParser.switchCaseLabels_return switchCaseLabels() throws RecognitionException {
		JavaParser.switchCaseLabels_return retval = new JavaParser.switchCaseLabels_return();
		retval.start = input.LT(1);
		int switchCaseLabels_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope switchCaseLabel351 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// Java.g:1290:13: ( ( switchCaseLabel )* )
			// Java.g:1290:17: ( switchCaseLabel )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Java.g:1290:17: ( switchCaseLabel )*
			loop102:
			while (true) {
				int alt102=2;
				int LA102_0 = input.LA(1);
				if ( (LA102_0==CASE) ) {
					int LA102_2 = input.LA(2);
					if ( (synpred146_Java()) ) {
						alt102=1;
					}

				}

				switch (alt102) {
				case 1 :
					// Java.g:1290:17: switchCaseLabel
					{
					pushFollow(FOLLOW_switchCaseLabel_in_switchCaseLabels15740);
					switchCaseLabel351=switchCaseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCaseLabel351.getTree());

					}
					break;

				default :
					break loop102;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, switchCaseLabels_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchCaseLabels"


	public static class switchCaseLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "switchCaseLabel"
	// Java.g:1293:1: switchCaseLabel : CASE ^z= expression COLON ! (q= blockStatement )* ;
	public final JavaParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException {
		JavaParser.switchCaseLabel_return retval = new JavaParser.switchCaseLabel_return();
		retval.start = input.LT(1);
		int switchCaseLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASE352=null;
		Token COLON353=null;
		ParserRuleReturnScope z =null;
		ParserRuleReturnScope q =null;

		CommonTree CASE352_tree=null;
		CommonTree COLON353_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// Java.g:1294:13: ( CASE ^z= expression COLON ! (q= blockStatement )* )
			// Java.g:1294:17: CASE ^z= expression COLON ! (q= blockStatement )*
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE352=(Token)match(input,CASE,FOLLOW_CASE_in_switchCaseLabel15792); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE352_tree = (CommonTree)adaptor.create(CASE352);
			root_0 = (CommonTree)adaptor.becomeRoot(CASE352_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_switchCaseLabel15797);
			z=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

			COLON353=(Token)match(input,COLON,FOLLOW_COLON_in_switchCaseLabel15799); if (state.failed) return retval;
			// Java.g:1294:44: (q= blockStatement )*
			loop103:
			while (true) {
				int alt103=2;
				int LA103_0 = input.LA(1);
				if ( (LA103_0==ABSTRACT||LA103_0==ASSERT||LA103_0==AT||(LA103_0 >= BOOLEAN && LA103_0 <= BYTE)||(LA103_0 >= CHAR && LA103_0 <= CLASS)||(LA103_0 >= CONTINUE && LA103_0 <= DECIMAL_LITERAL)||LA103_0==DO||LA103_0==DOUBLE||LA103_0==ENUM||(LA103_0 >= FALSE && LA103_0 <= FINAL)||(LA103_0 >= FLOAT && LA103_0 <= FLOATING_POINT_LITERAL)||LA103_0==FOR||(LA103_0 >= HEX_LITERAL && LA103_0 <= IF)||LA103_0==INC||LA103_0==INT||LA103_0==INTERFACE||LA103_0==LCURLY||LA103_0==LESS_THAN||LA103_0==LOGICAL_NOT||(LA103_0 >= LONG && LA103_0 <= LPAREN)||LA103_0==MINUS||(LA103_0 >= NATIVE && LA103_0 <= NOT)||LA103_0==NULL||LA103_0==OCTAL_LITERAL||LA103_0==PLUS||(LA103_0 >= PRIVATE && LA103_0 <= PUBLIC)||LA103_0==RETURN||LA103_0==SEMI||LA103_0==SHORT||LA103_0==STATIC||(LA103_0 >= STRICTFP && LA103_0 <= SUPER)||LA103_0==SWITCH||(LA103_0 >= SYNCHRONIZED && LA103_0 <= THIS)||LA103_0==THROW||(LA103_0 >= TRANSIENT && LA103_0 <= TRY)||LA103_0==VOID||(LA103_0 >= VOLATILE && LA103_0 <= WHILE)) ) {
					alt103=1;
				}

				switch (alt103) {
				case 1 :
					// Java.g:1294:44: q= blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_switchCaseLabel15804);
					q=blockStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

					}
					break;

				default :
					break loop103;
				}
			}

			if ( state.backtracking==0 ) {
			    //System.out.println(switchCase+"in case labels "+isBreak);
			    if (switchCase) {
			      cases.push((z!=null?input.toString(z.start,z.stop):null));
			      statements.push((q!=null?input.toString(q.start,q.stop):null));
			      //System.out.println("in case labels "+isBreak);
			      tokens.replace((z!=null?(z.start):null).getTokenIndex(),(q!=null?(q.stop):null).getTokenIndex(),"");
			      tokens.replace(CASE352,"");
			      if (isBreak == true) {
			        String code = "";
			        int size = cases.size();
			        for (int i = 0; i < size; i++) {
			          code = statements.pop() + "\n" + code;
			          //System.out.println("if(" + cases.pop() + ")\n" + code );
			          tokens.insertAfter(CASE352,"if(" + cases.pop() + ")\n{" + code+"}\n");                 
			        }
			        isBreak = false;
			      }
			    }
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, switchCaseLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchCaseLabel"


	public static class switchDefaultLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "switchDefaultLabel"
	// Java.g:1317:1: switchDefaultLabel : DEFAULT ^ COLON ! ( blockStatement )* ;
	public final JavaParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException {
		JavaParser.switchDefaultLabel_return retval = new JavaParser.switchDefaultLabel_return();
		retval.start = input.LT(1);
		int switchDefaultLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DEFAULT354=null;
		Token COLON355=null;
		ParserRuleReturnScope blockStatement356 =null;

		CommonTree DEFAULT354_tree=null;
		CommonTree COLON355_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// Java.g:1318:13: ( DEFAULT ^ COLON ! ( blockStatement )* )
			// Java.g:1318:17: DEFAULT ^ COLON ! ( blockStatement )*
			{
			root_0 = (CommonTree)adaptor.nil();


			DEFAULT354=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLabel15857); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFAULT354_tree = (CommonTree)adaptor.create(DEFAULT354);
			root_0 = (CommonTree)adaptor.becomeRoot(DEFAULT354_tree, root_0);
			}

			COLON355=(Token)match(input,COLON,FOLLOW_COLON_in_switchDefaultLabel15860); if (state.failed) return retval;
			// Java.g:1318:33: ( blockStatement )*
			loop104:
			while (true) {
				int alt104=2;
				int LA104_0 = input.LA(1);
				if ( (LA104_0==ABSTRACT||LA104_0==ASSERT||LA104_0==AT||(LA104_0 >= BOOLEAN && LA104_0 <= BYTE)||(LA104_0 >= CHAR && LA104_0 <= CLASS)||(LA104_0 >= CONTINUE && LA104_0 <= DECIMAL_LITERAL)||LA104_0==DO||LA104_0==DOUBLE||LA104_0==ENUM||(LA104_0 >= FALSE && LA104_0 <= FINAL)||(LA104_0 >= FLOAT && LA104_0 <= FLOATING_POINT_LITERAL)||LA104_0==FOR||(LA104_0 >= HEX_LITERAL && LA104_0 <= IF)||LA104_0==INC||LA104_0==INT||LA104_0==INTERFACE||LA104_0==LCURLY||LA104_0==LESS_THAN||LA104_0==LOGICAL_NOT||(LA104_0 >= LONG && LA104_0 <= LPAREN)||LA104_0==MINUS||(LA104_0 >= NATIVE && LA104_0 <= NOT)||LA104_0==NULL||LA104_0==OCTAL_LITERAL||LA104_0==PLUS||(LA104_0 >= PRIVATE && LA104_0 <= PUBLIC)||LA104_0==RETURN||LA104_0==SEMI||LA104_0==SHORT||LA104_0==STATIC||(LA104_0 >= STRICTFP && LA104_0 <= SUPER)||LA104_0==SWITCH||(LA104_0 >= SYNCHRONIZED && LA104_0 <= THIS)||LA104_0==THROW||(LA104_0 >= TRANSIENT && LA104_0 <= TRY)||LA104_0==VOID||(LA104_0 >= VOLATILE && LA104_0 <= WHILE)) ) {
					alt104=1;
				}

				switch (alt104) {
				case 1 :
					// Java.g:1318:33: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_switchDefaultLabel15863);
					blockStatement356=blockStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement356.getTree());

					}
					break;

				default :
					break loop104;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, switchDefaultLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchDefaultLabel"


	public static class forInit_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// Java.g:1321:1: forInit : ( localVariableDeclaration -> ^( FOR_INIT localVariableDeclaration ) | expressionList -> ^( FOR_INIT expressionList ) | -> ^( FOR_INIT ) );
	public final JavaParser.forInit_return forInit() throws RecognitionException {
		JavaParser.forInit_return retval = new JavaParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope localVariableDeclaration357 =null;
		ParserRuleReturnScope expressionList358 =null;

		RewriteRuleSubtreeStream stream_localVariableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule localVariableDeclaration");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// Java.g:1322:13: ( localVariableDeclaration -> ^( FOR_INIT localVariableDeclaration ) | expressionList -> ^( FOR_INIT expressionList ) | -> ^( FOR_INIT ) )
			int alt105=3;
			switch ( input.LA(1) ) {
			case AT:
			case FINAL:
				{
				alt105=1;
				}
				break;
			case BOOLEAN:
				{
				int LA105_3 = input.LA(2);
				if ( (synpred149_Java()) ) {
					alt105=1;
				}
				else if ( (synpred150_Java()) ) {
					alt105=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA105_4 = input.LA(2);
				if ( (synpred149_Java()) ) {
					alt105=1;
				}
				else if ( (synpred150_Java()) ) {
					alt105=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BYTE:
				{
				int LA105_5 = input.LA(2);
				if ( (synpred149_Java()) ) {
					alt105=1;
				}
				else if ( (synpred150_Java()) ) {
					alt105=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHORT:
				{
				int LA105_6 = input.LA(2);
				if ( (synpred149_Java()) ) {
					alt105=1;
				}
				else if ( (synpred150_Java()) ) {
					alt105=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT:
				{
				int LA105_7 = input.LA(2);
				if ( (synpred149_Java()) ) {
					alt105=1;
				}
				else if ( (synpred150_Java()) ) {
					alt105=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONG:
				{
				int LA105_8 = input.LA(2);
				if ( (synpred149_Java()) ) {
					alt105=1;
				}
				else if ( (synpred150_Java()) ) {
					alt105=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA105_9 = input.LA(2);
				if ( (synpred149_Java()) ) {
					alt105=1;
				}
				else if ( (synpred150_Java()) ) {
					alt105=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA105_10 = input.LA(2);
				if ( (synpred149_Java()) ) {
					alt105=1;
				}
				else if ( (synpred150_Java()) ) {
					alt105=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IDENT:
				{
				int LA105_11 = input.LA(2);
				if ( (synpred149_Java()) ) {
					alt105=1;
				}
				else if ( (synpred150_Java()) ) {
					alt105=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHARACTER_LITERAL:
			case DEC:
			case DECIMAL_LITERAL:
			case FALSE:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case INC:
			case LESS_THAN:
			case LOGICAL_NOT:
			case LPAREN:
			case MINUS:
			case NEW:
			case NOT:
			case NULL:
			case OCTAL_LITERAL:
			case PLUS:
			case STRING_LITERAL:
			case SUPER:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt105=2;
				}
				break;
			case SEMI:
				{
				alt105=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}
			switch (alt105) {
				case 1 :
					// Java.g:1323:17: localVariableDeclaration
					{
					pushFollow(FOLLOW_localVariableDeclaration_in_forInit15930);
					localVariableDeclaration357=localVariableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_localVariableDeclaration.add(localVariableDeclaration357.getTree());
					// AST REWRITE
					// elements: localVariableDeclaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1323:45: -> ^( FOR_INIT localVariableDeclaration )
					{
						// Java.g:1323:49: ^( FOR_INIT localVariableDeclaration )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_INIT, "FOR_INIT"), root_1);
						adaptor.addChild(root_1, stream_localVariableDeclaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Java.g:1324:17: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forInit15960);
					expressionList358=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList358.getTree());
					// AST REWRITE
					// elements: expressionList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1324:45: -> ^( FOR_INIT expressionList )
					{
						// Java.g:1324:49: ^( FOR_INIT expressionList )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_INIT, "FOR_INIT"), root_1);
						adaptor.addChild(root_1, stream_expressionList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Java.g:1325:45: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1325:45: -> ^( FOR_INIT )
					{
						// Java.g:1325:49: ^( FOR_INIT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_INIT, "FOR_INIT"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class forCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forCondition"
	// Java.g:1330:1: forCondition : (q= expression )? -> ^( FOR_CONDITION ( expression )? ) ;
	public final JavaParser.forCondition_return forCondition() throws RecognitionException {
		JavaParser.forCondition_return retval = new JavaParser.forCondition_return();
		retval.start = input.LT(1);
		int forCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope q =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// Java.g:1331:13: ( (q= expression )? -> ^( FOR_CONDITION ( expression )? ) )
			// Java.g:1333:6: (q= expression )?
			{
			// Java.g:1333:7: (q= expression )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==BOOLEAN||LA106_0==BYTE||(LA106_0 >= CHAR && LA106_0 <= CHARACTER_LITERAL)||(LA106_0 >= DEC && LA106_0 <= DECIMAL_LITERAL)||LA106_0==DOUBLE||LA106_0==FALSE||(LA106_0 >= FLOAT && LA106_0 <= FLOATING_POINT_LITERAL)||(LA106_0 >= HEX_LITERAL && LA106_0 <= IDENT)||LA106_0==INC||LA106_0==INT||LA106_0==LESS_THAN||LA106_0==LOGICAL_NOT||(LA106_0 >= LONG && LA106_0 <= LPAREN)||LA106_0==MINUS||(LA106_0 >= NEW && LA106_0 <= NOT)||LA106_0==NULL||LA106_0==OCTAL_LITERAL||LA106_0==PLUS||LA106_0==SHORT||(LA106_0 >= STRING_LITERAL && LA106_0 <= SUPER)||LA106_0==THIS||LA106_0==TRUE||LA106_0==VOID) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// Java.g:1333:7: q= expression
					{
					pushFollow(FOLLOW_expression_in_forCondition16108);
					q=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(q.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1334:17: -> ^( FOR_CONDITION ( expression )? )
			{
				// Java.g:1334:21: ^( FOR_CONDITION ( expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_CONDITION, "FOR_CONDITION"), root_1);
				// Java.g:1334:37: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, forCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forCondition"


	public static class forUpdater_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forUpdater"
	// Java.g:1337:9: forUpdater : (q= expressionList )? -> ^( FOR_UPDATE ( expressionList )? ) ;
	public final JavaParser.forUpdater_return forUpdater() throws RecognitionException {
		JavaParser.forUpdater_return retval = new JavaParser.forUpdater_return();
		retval.start = input.LT(1);
		int forUpdater_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope q =null;

		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// Java.g:1338:13: ( (q= expressionList )? -> ^( FOR_UPDATE ( expressionList )? ) )
			// Java.g:1338:17: (q= expressionList )?
			{
			// Java.g:1338:18: (q= expressionList )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==BOOLEAN||LA107_0==BYTE||(LA107_0 >= CHAR && LA107_0 <= CHARACTER_LITERAL)||(LA107_0 >= DEC && LA107_0 <= DECIMAL_LITERAL)||LA107_0==DOUBLE||LA107_0==FALSE||(LA107_0 >= FLOAT && LA107_0 <= FLOATING_POINT_LITERAL)||(LA107_0 >= HEX_LITERAL && LA107_0 <= IDENT)||LA107_0==INC||LA107_0==INT||LA107_0==LESS_THAN||LA107_0==LOGICAL_NOT||(LA107_0 >= LONG && LA107_0 <= LPAREN)||LA107_0==MINUS||(LA107_0 >= NEW && LA107_0 <= NOT)||LA107_0==NULL||LA107_0==OCTAL_LITERAL||LA107_0==PLUS||LA107_0==SHORT||(LA107_0 >= STRING_LITERAL && LA107_0 <= SUPER)||LA107_0==THIS||LA107_0==TRUE||LA107_0==VOID) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// Java.g:1338:18: q= expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forUpdater16197);
					q=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(q.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1339:17: -> ^( FOR_UPDATE ( expressionList )? )
			{
				// Java.g:1339:21: ^( FOR_UPDATE ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_UPDATE, "FOR_UPDATE"), root_1);
				// Java.g:1339:34: ( expressionList )?
				if ( stream_expressionList.hasNext() ) {
					adaptor.addChild(root_1, stream_expressionList.nextTree());
				}
				stream_expressionList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, forUpdater_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forUpdater"


	public static class parenthesizedExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parenthesizedExpression"
	// Java.g:1344:1: parenthesizedExpression : LPAREN expression RPAREN -> ^( PARENTESIZED_EXPR[$LPAREN, \"PARENTESIZED_EXPR\"] expression ) ;
	public final JavaParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException {
		JavaParser.parenthesizedExpression_return retval = new JavaParser.parenthesizedExpression_return();
		retval.start = input.LT(1);
		int parenthesizedExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LPAREN359=null;
		Token RPAREN361=null;
		ParserRuleReturnScope expression360 =null;

		CommonTree LPAREN359_tree=null;
		CommonTree RPAREN361_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// Java.g:1345:13: ( LPAREN expression RPAREN -> ^( PARENTESIZED_EXPR[$LPAREN, \"PARENTESIZED_EXPR\"] expression ) )
			// Java.g:1345:17: LPAREN expression RPAREN
			{
			LPAREN359=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedExpression16278); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN359);

			pushFollow(FOLLOW_expression_in_parenthesizedExpression16281);
			expression360=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression360.getTree());
			RPAREN361=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedExpression16284); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN361);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1346:17: -> ^( PARENTESIZED_EXPR[$LPAREN, \"PARENTESIZED_EXPR\"] expression )
			{
				// Java.g:1346:21: ^( PARENTESIZED_EXPR[$LPAREN, \"PARENTESIZED_EXPR\"] expression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARENTESIZED_EXPR, LPAREN359, "PARENTESIZED_EXPR"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, parenthesizedExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "parenthesizedExpression"


	public static class expressionList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// Java.g:1349:1: expressionList : q= expression ( COMMA ! expression )* ;
	public final JavaParser.expressionList_return expressionList() throws RecognitionException {
		JavaParser.expressionList_return retval = new JavaParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA362=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope expression363 =null;

		CommonTree COMMA362_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// Java.g:1350:13: (q= expression ( COMMA ! expression )* )
			// Java.g:1350:17: q= expression ( COMMA ! expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList16359);
			q=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			if ( state.backtracking==0 ) {
			    if (PolyverseScope.isPolyverse()) {
			      tokens.insertBefore((q!=null?(q.start):null),"Metadata " + metaVarStack.peek() + ",");
			      //temp.pop();
			      //PolyverseScope.isPolyverse() = false;
			    }
			  }
			// Java.g:1358:22: ( COMMA ! expression )*
			loop108:
			while (true) {
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==COMMA) ) {
					alt108=1;
				}

				switch (alt108) {
				case 1 :
					// Java.g:1358:23: COMMA ! expression
					{
					COMMA362=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList16388); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expressionList16391);
					expression363=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression363.getTree());

					}
					break;

				default :
					break loop108;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, expressionList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// Java.g:1361:1: expression : q= assignmentExpression -> ^( EXPR assignmentExpression ) ;
	public final JavaParser.expression_return expression() throws RecognitionException {
		JavaParser.expression_return retval = new JavaParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope q =null;

		RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// Java.g:1362:13: (q= assignmentExpression -> ^( EXPR assignmentExpression ) )
			// Java.g:1362:17: q= assignmentExpression
			{
			pushFollow(FOLLOW_assignmentExpression_in_expression16438);
			q=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignmentExpression.add(q.getTree());
			// AST REWRITE
			// elements: assignmentExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1363:17: -> ^( EXPR assignmentExpression )
			{
				// Java.g:1363:21: ^( EXPR assignmentExpression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_assignmentExpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class assignmentExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignmentExpression"
	// Java.g:1366:1: assignmentExpression : c= conditionalExpression (op= ( ASSIGN ^| PLUS_ASSIGN ^| MINUS_ASSIGN ^| STAR_ASSIGN ^| DIV_ASSIGN ^| AND_ASSIGN ^| OR_ASSIGN ^| XOR_ASSIGN ^| MOD_ASSIGN ^| SHIFT_LEFT_ASSIGN ^| SHIFT_RIGHT_ASSIGN ^| BIT_SHIFT_RIGHT_ASSIGN ^) x= assignmentExpression )? ;
	public final JavaParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
		JavaParser.assignmentExpression_return retval = new JavaParser.assignmentExpression_return();
		retval.start = input.LT(1);
		int assignmentExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token op=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope x =null;

		CommonTree op_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// Java.g:1367:5: (c= conditionalExpression (op= ( ASSIGN ^| PLUS_ASSIGN ^| MINUS_ASSIGN ^| STAR_ASSIGN ^| DIV_ASSIGN ^| AND_ASSIGN ^| OR_ASSIGN ^| XOR_ASSIGN ^| MOD_ASSIGN ^| SHIFT_LEFT_ASSIGN ^| SHIFT_RIGHT_ASSIGN ^| BIT_SHIFT_RIGHT_ASSIGN ^) x= assignmentExpression )? )
			// Java.g:1368:9: c= conditionalExpression (op= ( ASSIGN ^| PLUS_ASSIGN ^| MINUS_ASSIGN ^| STAR_ASSIGN ^| DIV_ASSIGN ^| AND_ASSIGN ^| OR_ASSIGN ^| XOR_ASSIGN ^| MOD_ASSIGN ^| SHIFT_LEFT_ASSIGN ^| SHIFT_RIGHT_ASSIGN ^| BIT_SHIFT_RIGHT_ASSIGN ^) x= assignmentExpression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression16515);
			c=conditionalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());

			// Java.g:1369:9: (op= ( ASSIGN ^| PLUS_ASSIGN ^| MINUS_ASSIGN ^| STAR_ASSIGN ^| DIV_ASSIGN ^| AND_ASSIGN ^| OR_ASSIGN ^| XOR_ASSIGN ^| MOD_ASSIGN ^| SHIFT_LEFT_ASSIGN ^| SHIFT_RIGHT_ASSIGN ^| BIT_SHIFT_RIGHT_ASSIGN ^) x= assignmentExpression )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==AND_ASSIGN||LA110_0==ASSIGN||LA110_0==BIT_SHIFT_RIGHT_ASSIGN||LA110_0==DIV_ASSIGN||LA110_0==MINUS_ASSIGN||LA110_0==MOD_ASSIGN||LA110_0==OR_ASSIGN||LA110_0==PLUS_ASSIGN||LA110_0==SHIFT_LEFT_ASSIGN||LA110_0==SHIFT_RIGHT_ASSIGN||LA110_0==STAR_ASSIGN||LA110_0==XOR_ASSIGN) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// Java.g:1369:13: op= ( ASSIGN ^| PLUS_ASSIGN ^| MINUS_ASSIGN ^| STAR_ASSIGN ^| DIV_ASSIGN ^| AND_ASSIGN ^| OR_ASSIGN ^| XOR_ASSIGN ^| MOD_ASSIGN ^| SHIFT_LEFT_ASSIGN ^| SHIFT_RIGHT_ASSIGN ^| BIT_SHIFT_RIGHT_ASSIGN ^) x= assignmentExpression
					{
					// Java.g:1369:16: ( ASSIGN ^| PLUS_ASSIGN ^| MINUS_ASSIGN ^| STAR_ASSIGN ^| DIV_ASSIGN ^| AND_ASSIGN ^| OR_ASSIGN ^| XOR_ASSIGN ^| MOD_ASSIGN ^| SHIFT_LEFT_ASSIGN ^| SHIFT_RIGHT_ASSIGN ^| BIT_SHIFT_RIGHT_ASSIGN ^)
					int alt109=12;
					switch ( input.LA(1) ) {
					case ASSIGN:
						{
						alt109=1;
						}
						break;
					case PLUS_ASSIGN:
						{
						alt109=2;
						}
						break;
					case MINUS_ASSIGN:
						{
						alt109=3;
						}
						break;
					case STAR_ASSIGN:
						{
						alt109=4;
						}
						break;
					case DIV_ASSIGN:
						{
						alt109=5;
						}
						break;
					case AND_ASSIGN:
						{
						alt109=6;
						}
						break;
					case OR_ASSIGN:
						{
						alt109=7;
						}
						break;
					case XOR_ASSIGN:
						{
						alt109=8;
						}
						break;
					case MOD_ASSIGN:
						{
						alt109=9;
						}
						break;
					case SHIFT_LEFT_ASSIGN:
						{
						alt109=10;
						}
						break;
					case SHIFT_RIGHT_ASSIGN:
						{
						alt109=11;
						}
						break;
					case BIT_SHIFT_RIGHT_ASSIGN:
						{
						alt109=12;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 109, 0, input);
						throw nvae;
					}
					switch (alt109) {
						case 1 :
							// Java.g:1369:20: ASSIGN ^
							{
							op=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentExpression16536); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;
						case 2 :
							// Java.g:1370:17: PLUS_ASSIGN ^
							{
							op=(Token)match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_assignmentExpression16555); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;
						case 3 :
							// Java.g:1371:17: MINUS_ASSIGN ^
							{
							op=(Token)match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_assignmentExpression16574); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;
						case 4 :
							// Java.g:1372:17: STAR_ASSIGN ^
							{
							op=(Token)match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_assignmentExpression16593); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;
						case 5 :
							// Java.g:1373:17: DIV_ASSIGN ^
							{
							op=(Token)match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_assignmentExpression16612); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;
						case 6 :
							// Java.g:1374:17: AND_ASSIGN ^
							{
							op=(Token)match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_assignmentExpression16631); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;
						case 7 :
							// Java.g:1375:17: OR_ASSIGN ^
							{
							op=(Token)match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_assignmentExpression16650); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;
						case 8 :
							// Java.g:1376:17: XOR_ASSIGN ^
							{
							op=(Token)match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_assignmentExpression16669); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;
						case 9 :
							// Java.g:1377:17: MOD_ASSIGN ^
							{
							op=(Token)match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_assignmentExpression16688); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;
						case 10 :
							// Java.g:1378:17: SHIFT_LEFT_ASSIGN ^
							{
							op=(Token)match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_assignmentExpression16707); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;
						case 11 :
							// Java.g:1379:17: SHIFT_RIGHT_ASSIGN ^
							{
							op=(Token)match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_assignmentExpression16726); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;
						case 12 :
							// Java.g:1380:17: BIT_SHIFT_RIGHT_ASSIGN ^
							{
							op=(Token)match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_assignmentExpression16745); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							op_tree = (CommonTree)adaptor.create(op);
							root_0 = (CommonTree)adaptor.becomeRoot(op_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression16773);
					x=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, x.getTree());

					}
					break;

			}

			if ( state.backtracking==0 ) {/*-----*/ // Now we see assignment operator, so fix up LHS of assignment
			    if (PolyverseScope.isPolyverse()) {
			      String opText = "";
			      if (op != null) {
			        String xText = tokens.toString((x!=null?(x.start):null).getTokenIndex(), (x!=null?(x.stop):null).getTokenIndex());
			        String cText = tokens.toString((c!=null?(c.start):null).getTokenIndex(), (c!=null?(c.stop):null).getTokenIndex());
			        System.out.println("Assignment op " + (x!=null?input.toString(x.start,x.stop):null) + " :: " + opText + " " + (c!=null?input.toString(c.start,c.stop):null));
			        System.out.println("Assignment op " + xText + " :: " + opText + " " + cText);
			        tokens.replace((c!=null?(c.start):null).getTokenIndex(), (c!=null?(c.stop):null).getTokenIndex(), cText + ".binaryOperation(" + vtop() + ", JavaLexer." + opText + "," + xText + ")");
			        tokens.delete(op);
			        tokens.delete((x!=null?(x.start):null), (x!=null?(x.stop):null));
			/*
			        switch ((op!=null?op.getType():0)) {
			          case ASSIGN : opText = "assign"; break;
			          case PLUS_ASSIGN : opText = "assignPlus"; break;
			          case MINUS_ASSIGN : opText = "assignMinus"; break;
			          case STAR_ASSIGN : opText = "assignStar"; break;
			          case DIV_ASSIGN : opText = "assignDiv"; break;
			          case AND_ASSIGN : opText = "assignAnd"; break;
			          case OR_ASSIGN : opText = "assignOr"; break;
			          case XOR_ASSIGN : opText = "assignXOr"; break;
			          case MOD_ASSIGN : opText = "assignMod"; break;
			          case SHIFT_LEFT_ASSIGN : opText = "assignShiftLeft"; break;
			          case SHIFT_RIGHT_ASSIGN : opText = "assignShiftRight"; break;
			          case BIT_SHIFT_RIGHT_ASSIGN : opText = "assignBigShiftRight"; break;
			          default: System.err.println("Bad assignment operator in parser " + (op!=null?op.getText():null)); System.exit(-1);
			        }
			        String xText = tokens.toString((x!=null?(x.start):null).getTokenIndex(), (x!=null?(x.stop):null).getTokenIndex());
			        String cText = tokens.toString((c!=null?(c.start):null).getTokenIndex(), (c!=null?(c.stop):null).getTokenIndex());
			        System.out.println("Assignment op " + (x!=null?input.toString(x.start,x.stop):null) + " :: " + opText + " " + (c!=null?input.toString(c.start,c.stop):null));
			        System.out.println("Assignment op " + xText + " :: " + opText + " " + cText);
			        tokens.replace((c!=null?(c.start):null).getTokenIndex(), (c!=null?(c.stop):null).getTokenIndex(), cText + "." + opText + "(" + vtop() + "," + xText + ")");
			        tokens.delete(op);
			        tokens.delete((x!=null?(x.start):null), (x!=null?(x.stop):null));
			*/
			      }
			    }
			  /*-----*/}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, assignmentExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentExpression"


	public static class conditionalExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conditionalExpression"
	// Java.g:1424:1: conditionalExpression : e= logicalOrExpression ( QUESTION ^e1= assignmentExpression COLON !e2= conditionalExpression )? ;
	public final JavaParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		JavaParser.conditionalExpression_return retval = new JavaParser.conditionalExpression_return();
		retval.start = input.LT(1);
		int conditionalExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token QUESTION364=null;
		Token COLON365=null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		CommonTree QUESTION364_tree=null;
		CommonTree COLON365_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// Java.g:1425:13: (e= logicalOrExpression ( QUESTION ^e1= assignmentExpression COLON !e2= conditionalExpression )? )
			// Java.g:1426:16: e= logicalOrExpression ( QUESTION ^e1= assignmentExpression COLON !e2= conditionalExpression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalOrExpression_in_conditionalExpression16833);
			e=logicalOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());

			// Java.g:1427:16: ( QUESTION ^e1= assignmentExpression COLON !e2= conditionalExpression )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==QUESTION) ) {
				alt111=1;
			}
			switch (alt111) {
				case 1 :
					// Java.g:1427:17: QUESTION ^e1= assignmentExpression COLON !e2= conditionalExpression
					{
					QUESTION364=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression16852); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QUESTION364_tree = (CommonTree)adaptor.create(QUESTION364);
					root_0 = (CommonTree)adaptor.becomeRoot(QUESTION364_tree, root_0);
					}

					pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression16857);
					e1=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

					COLON365=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression16859); if (state.failed) return retval;
					pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression16864);
					e2=conditionalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, conditionalExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditionalExpression"


	public static class logicalOrExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalOrExpression"
	// Java.g:1430:1: logicalOrExpression : q= logicalAndExpression (opr= LOGICAL_OR ^z= logicalAndExpression )* ;
	public final JavaParser.logicalOrExpression_return logicalOrExpression() throws RecognitionException {
		JavaParser.logicalOrExpression_return retval = new JavaParser.logicalOrExpression_return();
		retval.start = input.LT(1);
		int logicalOrExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope z =null;

		CommonTree opr_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// Java.g:1431:13: (q= logicalAndExpression (opr= LOGICAL_OR ^z= logicalAndExpression )* )
			// Java.g:1431:15: q= logicalAndExpression (opr= LOGICAL_OR ^z= logicalAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression16911);
			q=logicalAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:1431:38: (opr= LOGICAL_OR ^z= logicalAndExpression )*
			loop112:
			while (true) {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==LOGICAL_OR) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// Java.g:1431:39: opr= LOGICAL_OR ^z= logicalAndExpression
					{
					opr=(Token)match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression16916); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					opr_tree = (CommonTree)adaptor.create(opr);
					root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
					}

					pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression16921);
					z=logicalAndExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      if (z != null) {
					        String opText = ".logicalOr";
					        String zText = tokens.toString((z!=null?(z.start):null).getTokenIndex(), (z!=null?(z.stop):null).getTokenIndex());
					        String qText = tokens.toString((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex());
					        tokens.replace((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
					        tokens.delete(opr);
					        tokens.delete((z!=null?(z.start):null), (z!=null?(z.stop):null));
					      }
					    }
					  /*-----*/}
					}
					break;

				default :
					break loop112;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 92, logicalOrExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicalOrExpression"


	public static class logicalAndExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalAndExpression"
	// Java.g:1447:1: logicalAndExpression : q= inclusiveOrExpression (opr= LOGICAL_AND ^z= inclusiveOrExpression )* ;
	public final JavaParser.logicalAndExpression_return logicalAndExpression() throws RecognitionException {
		JavaParser.logicalAndExpression_return retval = new JavaParser.logicalAndExpression_return();
		retval.start = input.LT(1);
		int logicalAndExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope z =null;

		CommonTree opr_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// Java.g:1448:13: (q= inclusiveOrExpression (opr= LOGICAL_AND ^z= inclusiveOrExpression )* )
			// Java.g:1448:15: q= inclusiveOrExpression (opr= LOGICAL_AND ^z= inclusiveOrExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_inclusiveOrExpression_in_logicalAndExpression16984);
			q=inclusiveOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:1448:39: (opr= LOGICAL_AND ^z= inclusiveOrExpression )*
			loop113:
			while (true) {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==LOGICAL_AND) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// Java.g:1448:40: opr= LOGICAL_AND ^z= inclusiveOrExpression
					{
					opr=(Token)match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression16989); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					opr_tree = (CommonTree)adaptor.create(opr);
					root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
					}

					pushFollow(FOLLOW_inclusiveOrExpression_in_logicalAndExpression16994);
					z=inclusiveOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      if (z != null) {
					        String opText = ".logicalAnd";
					        String zText = tokens.toString((z!=null?(z.start):null).getTokenIndex(), (z!=null?(z.stop):null).getTokenIndex());
					        String qText = tokens.toString((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex());
					        tokens.replace((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
					        tokens.delete(opr);
					        tokens.delete((z!=null?(z.start):null), (z!=null?(z.stop):null));
					      }
					    }
					  /*-----*/}
					}
					break;

				default :
					break loop113;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 93, logicalAndExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicalAndExpression"


	public static class inclusiveOrExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "inclusiveOrExpression"
	// Java.g:1464:1: inclusiveOrExpression : q= exclusiveOrExpression (opr= OR ^z= exclusiveOrExpression )* ;
	public final JavaParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
		JavaParser.inclusiveOrExpression_return retval = new JavaParser.inclusiveOrExpression_return();
		retval.start = input.LT(1);
		int inclusiveOrExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope z =null;

		CommonTree opr_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// Java.g:1465:13: (q= exclusiveOrExpression (opr= OR ^z= exclusiveOrExpression )* )
			// Java.g:1465:16: q= exclusiveOrExpression (opr= OR ^z= exclusiveOrExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression17059);
			q=exclusiveOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:1465:40: (opr= OR ^z= exclusiveOrExpression )*
			loop114:
			while (true) {
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==OR) ) {
					alt114=1;
				}

				switch (alt114) {
				case 1 :
					// Java.g:1465:41: opr= OR ^z= exclusiveOrExpression
					{
					opr=(Token)match(input,OR,FOLLOW_OR_in_inclusiveOrExpression17064); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					opr_tree = (CommonTree)adaptor.create(opr);
					root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
					}

					pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression17069);
					z=exclusiveOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      if (z != null) {
					        String opText = ".or";
					        String zText = tokens.toString((z!=null?(z.start):null).getTokenIndex(), (z!=null?(z.stop):null).getTokenIndex());
					        String qText = tokens.toString((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex());
					        tokens.replace((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
					        tokens.delete(opr);
					        tokens.delete((z!=null?(z.start):null), (z!=null?(z.stop):null));
					      }
					    }
					  /*-----*/}
					}
					break;

				default :
					break loop114;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 94, inclusiveOrExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "inclusiveOrExpression"


	public static class exclusiveOrExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exclusiveOrExpression"
	// Java.g:1481:1: exclusiveOrExpression : q= andExpression (opr= XOR ^z= andExpression )* ;
	public final JavaParser.exclusiveOrExpression_return exclusiveOrExpression() throws RecognitionException {
		JavaParser.exclusiveOrExpression_return retval = new JavaParser.exclusiveOrExpression_return();
		retval.start = input.LT(1);
		int exclusiveOrExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope z =null;

		CommonTree opr_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// Java.g:1482:13: (q= andExpression (opr= XOR ^z= andExpression )* )
			// Java.g:1482:16: q= andExpression (opr= XOR ^z= andExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression17132);
			q=andExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:1482:32: (opr= XOR ^z= andExpression )*
			loop115:
			while (true) {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==XOR) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// Java.g:1482:33: opr= XOR ^z= andExpression
					{
					opr=(Token)match(input,XOR,FOLLOW_XOR_in_exclusiveOrExpression17137); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					opr_tree = (CommonTree)adaptor.create(opr);
					root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
					}

					pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression17142);
					z=andExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      if (z != null) {
					        String opText = ".xor";
					        String zText = tokens.toString((z!=null?(z.start):null).getTokenIndex(), (z!=null?(z.stop):null).getTokenIndex());
					        String qText = tokens.toString((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex());
					        tokens.replace((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
					        tokens.delete(opr);
					        tokens.delete((z!=null?(z.start):null), (z!=null?(z.stop):null));
					      }
					    }
					  /*-----*/}
					}
					break;

				default :
					break loop115;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 95, exclusiveOrExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "exclusiveOrExpression"


	public static class andExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "andExpression"
	// Java.g:1498:1: andExpression : q= equalityExpression (opr= AND ^z= equalityExpression )* ;
	public final JavaParser.andExpression_return andExpression() throws RecognitionException {
		JavaParser.andExpression_return retval = new JavaParser.andExpression_return();
		retval.start = input.LT(1);
		int andExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope z =null;

		CommonTree opr_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// Java.g:1499:13: (q= equalityExpression (opr= AND ^z= equalityExpression )* )
			// Java.g:1499:15: q= equalityExpression (opr= AND ^z= equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_andExpression17205);
			q=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:1499:36: (opr= AND ^z= equalityExpression )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==AND) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// Java.g:1499:37: opr= AND ^z= equalityExpression
					{
					opr=(Token)match(input,AND,FOLLOW_AND_in_andExpression17210); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					opr_tree = (CommonTree)adaptor.create(opr);
					root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
					}

					pushFollow(FOLLOW_equalityExpression_in_andExpression17215);
					z=equalityExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      if (z != null) {
					        String opText = ".and";
					        String zText = tokens.toString((z!=null?(z.start):null).getTokenIndex(), (z!=null?(z.stop):null).getTokenIndex());
					        String qText = tokens.toString((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex());
					        tokens.replace((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
					        tokens.delete(opr);
					        tokens.delete((z!=null?(z.start):null), (z!=null?(z.stop):null));
					      }
					    }
					  /*-----*/}
					}
					break;

				default :
					break loop116;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, andExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "andExpression"


	public static class equalityExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equalityExpression"
	// Java.g:1515:1: equalityExpression : q= instanceOfExpression (opr= ( EQUAL ^| NOT_EQUAL ^) z= instanceOfExpression )* ;
	public final JavaParser.equalityExpression_return equalityExpression() throws RecognitionException {
		JavaParser.equalityExpression_return retval = new JavaParser.equalityExpression_return();
		retval.start = input.LT(1);
		int equalityExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope z =null;

		CommonTree opr_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// Java.g:1516:13: (q= instanceOfExpression (opr= ( EQUAL ^| NOT_EQUAL ^) z= instanceOfExpression )* )
			// Java.g:1516:15: q= instanceOfExpression (opr= ( EQUAL ^| NOT_EQUAL ^) z= instanceOfExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression17278);
			q=instanceOfExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:1517:17: (opr= ( EQUAL ^| NOT_EQUAL ^) z= instanceOfExpression )*
			loop118:
			while (true) {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==EQUAL||LA118_0==NOT_EQUAL) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// Java.g:1517:21: opr= ( EQUAL ^| NOT_EQUAL ^) z= instanceOfExpression
					{
					// Java.g:1517:25: ( EQUAL ^| NOT_EQUAL ^)
					int alt117=2;
					int LA117_0 = input.LA(1);
					if ( (LA117_0==EQUAL) ) {
						alt117=1;
					}
					else if ( (LA117_0==NOT_EQUAL) ) {
						alt117=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 117, 0, input);
						throw nvae;
					}

					switch (alt117) {
						case 1 :
							// Java.g:1517:26: EQUAL ^
							{
							opr=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression17304); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;
						case 2 :
							// Java.g:1517:35: NOT_EQUAL ^
							{
							opr=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression17309); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression17336);
					z=instanceOfExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      String opText = "";
					      if (opr != null) {
					        switch ((opr!=null?opr.getType():0)) {
					          case EQUAL: opText = "equal"; break;
					          case NOT_EQUAL: opText = "notEqual"; break;
					          default: System.err.println("Bad equality operator in parser " + (opr!=null?opr.getText():null)); System.exit(-1);
					        }
					        String zText = tokens.toString((z!=null?(z.start):null).getTokenIndex(), (z!=null?(z.stop):null).getTokenIndex());
					        String qText = tokens.toString((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex());
					        tokens.replace((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
					        tokens.delete(opr);
					        tokens.delete((z!=null?(z.start):null), (z!=null?(z.stop):null));
					      }
					    }
					  /*-----*/}
					}
					break;

				default :
					break loop118;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, equalityExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityExpression"


	public static class instanceOfExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instanceOfExpression"
	// Java.g:1539:1: instanceOfExpression : q= relationalExpression (opr= INSTANCEOF ^z= type )? ;
	public final JavaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
		JavaParser.instanceOfExpression_return retval = new JavaParser.instanceOfExpression_return();
		retval.start = input.LT(1);
		int instanceOfExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope z =null;

		CommonTree opr_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// Java.g:1540:13: (q= relationalExpression (opr= INSTANCEOF ^z= type )? )
			// Java.g:1540:15: q= relationalExpression (opr= INSTANCEOF ^z= type )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression17403);
			q=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:1540:38: (opr= INSTANCEOF ^z= type )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==INSTANCEOF) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// Java.g:1540:39: opr= INSTANCEOF ^z= type
					{
					opr=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression17408); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					opr_tree = (CommonTree)adaptor.create(opr);
					root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
					}

					pushFollow(FOLLOW_type_in_instanceOfExpression17413);
					z=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					}
					break;

			}

			if ( state.backtracking==0 ) {/*-----*/
			    if (z != null) {
			      System.err.println("INSTANCEOF not implemented");
			      System.exit(-1);
			      //tokens.replace((z!=null?(z.start):null).getTokenIndex(),(z!=null?(z.stop):null).getTokenIndex(),"polyverse."+(z!=null?input.toString(z.start,z.stop):null));
			    }
			  /*-----*/}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 98, instanceOfExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instanceOfExpression"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relationalExpression"
	// Java.g:1550:1: relationalExpression : q= shiftExpression (opr= ( LESS_OR_EQUAL ^| GREATER_OR_EQUAL ^| LESS_THAN ^| GREATER_THAN ^) z= shiftExpression )* ;
	public final JavaParser.relationalExpression_return relationalExpression() throws RecognitionException {
		JavaParser.relationalExpression_return retval = new JavaParser.relationalExpression_return();
		retval.start = input.LT(1);
		int relationalExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope z =null;

		CommonTree opr_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// Java.g:1551:13: (q= shiftExpression (opr= ( LESS_OR_EQUAL ^| GREATER_OR_EQUAL ^| LESS_THAN ^| GREATER_THAN ^) z= shiftExpression )* )
			// Java.g:1551:15: q= shiftExpression (opr= ( LESS_OR_EQUAL ^| GREATER_OR_EQUAL ^| LESS_THAN ^| GREATER_THAN ^) z= shiftExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_shiftExpression_in_relationalExpression17463);
			q=shiftExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:1552:15: (opr= ( LESS_OR_EQUAL ^| GREATER_OR_EQUAL ^| LESS_THAN ^| GREATER_THAN ^) z= shiftExpression )*
			loop121:
			while (true) {
				int alt121=2;
				int LA121_0 = input.LA(1);
				if ( ((LA121_0 >= GREATER_OR_EQUAL && LA121_0 <= GREATER_THAN)||(LA121_0 >= LESS_OR_EQUAL && LA121_0 <= LESS_THAN)) ) {
					alt121=1;
				}

				switch (alt121) {
				case 1 :
					// Java.g:1552:17: opr= ( LESS_OR_EQUAL ^| GREATER_OR_EQUAL ^| LESS_THAN ^| GREATER_THAN ^) z= shiftExpression
					{
					// Java.g:1552:21: ( LESS_OR_EQUAL ^| GREATER_OR_EQUAL ^| LESS_THAN ^| GREATER_THAN ^)
					int alt120=4;
					switch ( input.LA(1) ) {
					case LESS_OR_EQUAL:
						{
						alt120=1;
						}
						break;
					case GREATER_OR_EQUAL:
						{
						alt120=2;
						}
						break;
					case LESS_THAN:
						{
						alt120=3;
						}
						break;
					case GREATER_THAN:
						{
						alt120=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 120, 0, input);
						throw nvae;
					}
					switch (alt120) {
						case 1 :
							// Java.g:1552:23: LESS_OR_EQUAL ^
							{
							opr=(Token)match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression17485); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;
						case 2 :
							// Java.g:1552:40: GREATER_OR_EQUAL ^
							{
							opr=(Token)match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression17490); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;
						case 3 :
							// Java.g:1552:60: LESS_THAN ^
							{
							opr=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression17495); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;
						case 4 :
							// Java.g:1552:73: GREATER_THAN ^
							{
							opr=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression17500); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_shiftExpression_in_relationalExpression17522);
					z=shiftExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      String opText = "";
					      if (opr != null) {
					        switch ((opr!=null?opr.getType():0)) {
					          case LESS_OR_EQUAL: opText = "lessOrEqual"; break;
					          case GREATER_OR_EQUAL: opText = "greaterOrEqual"; break;
					          case LESS_THAN: opText = "lessThan"; break;
					          case GREATER_THAN: opText = "greaterThan"; break;
					          default: System.err.println("Bad relational operator in parser " + (opr!=null?opr.getText():null)); System.exit(-1);
					        }
					        String zText = tokens.toString((z!=null?(z.start):null).getTokenIndex(), (z!=null?(z.stop):null).getTokenIndex());
					        String qText = tokens.toString((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex());
					        tokens.replace((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
					        tokens.delete(opr);
					        tokens.delete((z!=null?(z.start):null), (z!=null?(z.stop):null));
					      }
					    }
					  /*-----*/}
					}
					break;

				default :
					break loop121;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 99, relationalExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "relationalExpression"


	public static class shiftExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "shiftExpression"
	// Java.g:1576:1: shiftExpression : q= additiveExpression (opr= ( BIT_SHIFT_RIGHT ^| SHIFT_RIGHT ^| SHIFT_LEFT ^) z= additiveExpression )* ;
	public final JavaParser.shiftExpression_return shiftExpression() throws RecognitionException {
		JavaParser.shiftExpression_return retval = new JavaParser.shiftExpression_return();
		retval.start = input.LT(1);
		int shiftExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope z =null;

		CommonTree opr_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// Java.g:1577:13: (q= additiveExpression (opr= ( BIT_SHIFT_RIGHT ^| SHIFT_RIGHT ^| SHIFT_LEFT ^) z= additiveExpression )* )
			// Java.g:1577:16: q= additiveExpression (opr= ( BIT_SHIFT_RIGHT ^| SHIFT_RIGHT ^| SHIFT_LEFT ^) z= additiveExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_shiftExpression17595);
			q=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:1578:16: (opr= ( BIT_SHIFT_RIGHT ^| SHIFT_RIGHT ^| SHIFT_LEFT ^) z= additiveExpression )*
			loop123:
			while (true) {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==BIT_SHIFT_RIGHT||LA123_0==SHIFT_LEFT||LA123_0==SHIFT_RIGHT) ) {
					alt123=1;
				}

				switch (alt123) {
				case 1 :
					// Java.g:1578:18: opr= ( BIT_SHIFT_RIGHT ^| SHIFT_RIGHT ^| SHIFT_LEFT ^) z= additiveExpression
					{
					// Java.g:1578:22: ( BIT_SHIFT_RIGHT ^| SHIFT_RIGHT ^| SHIFT_LEFT ^)
					int alt122=3;
					switch ( input.LA(1) ) {
					case BIT_SHIFT_RIGHT:
						{
						alt122=1;
						}
						break;
					case SHIFT_RIGHT:
						{
						alt122=2;
						}
						break;
					case SHIFT_LEFT:
						{
						alt122=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 122, 0, input);
						throw nvae;
					}
					switch (alt122) {
						case 1 :
							// Java.g:1578:23: BIT_SHIFT_RIGHT ^
							{
							opr=(Token)match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_shiftExpression17618); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;
						case 2 :
							// Java.g:1578:42: SHIFT_RIGHT ^
							{
							opr=(Token)match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_shiftExpression17623); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;
						case 3 :
							// Java.g:1578:57: SHIFT_LEFT ^
							{
							opr=(Token)match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_shiftExpression17628); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_additiveExpression_in_shiftExpression17652);
					z=additiveExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      String opText = "";
					      if (opr != null) {
					        switch ((opr!=null?opr.getType():0)) {
					          case BIT_SHIFT_RIGHT: opText = "bitShiftRight"; break;
					          case SHIFT_RIGHT: opText = "shiftRight"; break;
					          case SHIFT_LEFT: opText = "shiftLeft"; break;
					          default: System.err.println("Bad shift operator in parser " + (opr!=null?opr.getText():null)); System.exit(-1);
					        }
					        String zText = tokens.toString((z!=null?(z.start):null).getTokenIndex(), (z!=null?(z.stop):null).getTokenIndex());
					        String qText = tokens.toString((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex());
					        tokens.replace((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
					        tokens.delete(opr);
					        tokens.delete((z!=null?(z.start):null), (z!=null?(z.stop):null));
					      }
					    }
					  /*-----*/}
					}
					break;

				default :
					break loop123;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 100, shiftExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "shiftExpression"


	public static class additiveExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// Java.g:1601:1: additiveExpression : q= multiplicativeExpression (opr= ( PLUS ^| MINUS ^) z= multiplicativeExpression )* ;
	public final JavaParser.additiveExpression_return additiveExpression() throws RecognitionException {
		JavaParser.additiveExpression_return retval = new JavaParser.additiveExpression_return();
		retval.start = input.LT(1);
		int additiveExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope z =null;

		CommonTree opr_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// Java.g:1602:13: (q= multiplicativeExpression (opr= ( PLUS ^| MINUS ^) z= multiplicativeExpression )* )
			// Java.g:1602:16: q= multiplicativeExpression (opr= ( PLUS ^| MINUS ^) z= multiplicativeExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression17720);
			q=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:1603:17: (opr= ( PLUS ^| MINUS ^) z= multiplicativeExpression )*
			loop125:
			while (true) {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==MINUS||LA125_0==PLUS) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// Java.g:1603:21: opr= ( PLUS ^| MINUS ^) z= multiplicativeExpression
					{
					// Java.g:1603:25: ( PLUS ^| MINUS ^)
					int alt124=2;
					int LA124_0 = input.LA(1);
					if ( (LA124_0==PLUS) ) {
						alt124=1;
					}
					else if ( (LA124_0==MINUS) ) {
						alt124=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 124, 0, input);
						throw nvae;
					}

					switch (alt124) {
						case 1 :
							// Java.g:1603:26: PLUS ^
							{
							opr=(Token)match(input,PLUS,FOLLOW_PLUS_in_additiveExpression17746); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;
						case 2 :
							// Java.g:1603:34: MINUS ^
							{
							opr=(Token)match(input,MINUS,FOLLOW_MINUS_in_additiveExpression17751); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression17777);
					z=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      String opText = "";
					      if (opr != null) {
					        switch ((opr!=null?opr.getType():0)) {
					          case PLUS: opText = "plus"; break;
					          case MINUS: opText = "minus"; break;
					          default: System.err.println("Bad additive operator in parser " + (opr!=null?opr.getText():null)); System.exit(-1);
					        }
					        String zText = tokens.toString((z!=null?(z.start):null).getTokenIndex(), (z!=null?(z.stop):null).getTokenIndex());
					        String qText = tokens.toString((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex());
					        tokens.replace((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
					        tokens.delete(opr);
					        tokens.delete((z!=null?(z.start):null), (z!=null?(z.stop):null));
					      }
					    }
					  /*-----*/}
					}
					break;

				default :
					break loop125;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, additiveExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "additiveExpression"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeExpression"
	// Java.g:1625:1: multiplicativeExpression : q= unaryExpression (opr= ( STAR ^| DIV ^| MOD ^) z= unaryExpression )* ;
	public final JavaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		JavaParser.multiplicativeExpression_return retval = new JavaParser.multiplicativeExpression_return();
		retval.start = input.LT(1);
		int multiplicativeExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope z =null;

		CommonTree opr_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// Java.g:1626:13: (q= unaryExpression (opr= ( STAR ^| DIV ^| MOD ^) z= unaryExpression )* )
			// Java.g:1626:15: q= unaryExpression (opr= ( STAR ^| DIV ^| MOD ^) z= unaryExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression17844);
			q=unaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

			// Java.g:1627:15: (opr= ( STAR ^| DIV ^| MOD ^) z= unaryExpression )*
			loop127:
			while (true) {
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==DIV||LA127_0==MOD||LA127_0==STAR) ) {
					alt127=1;
				}

				switch (alt127) {
				case 1 :
					// Java.g:1627:17: opr= ( STAR ^| DIV ^| MOD ^) z= unaryExpression
					{
					// Java.g:1627:21: ( STAR ^| DIV ^| MOD ^)
					int alt126=3;
					switch ( input.LA(1) ) {
					case STAR:
						{
						alt126=1;
						}
						break;
					case DIV:
						{
						alt126=2;
						}
						break;
					case MOD:
						{
						alt126=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 126, 0, input);
						throw nvae;
					}
					switch (alt126) {
						case 1 :
							// Java.g:1627:22: STAR ^
							{
							opr=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression17866); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;
						case 2 :
							// Java.g:1627:30: DIV ^
							{
							opr=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression17871); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;
						case 3 :
							// Java.g:1627:37: MOD ^
							{
							opr=(Token)match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression17876); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							opr_tree = (CommonTree)adaptor.create(opr);
							root_0 = (CommonTree)adaptor.becomeRoot(opr_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression17898);
					z=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      String opText = "";
					      if (opr != null) {
					        switch ((opr!=null?opr.getType():0)) {
					          case STAR: opText = "star"; break;
					          case DIV: opText = "div"; break;
					          case MOD: opText = "mod"; break;
					          default: System.err.println("Bad multiplicative operator in parser " + (opr!=null?opr.getText():null)); System.exit(-1);
					        }
					        String zText = tokens.toString((z!=null?(z.start):null).getTokenIndex(), (z!=null?(z.stop):null).getTokenIndex());
					        String qText = tokens.toString((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex());
					        tokens.replace((q!=null?(q.start):null).getTokenIndex(), (q!=null?(q.stop):null).getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
					        tokens.delete(opr);
					        tokens.delete((z!=null?(z.start):null), (z!=null?(z.stop):null));
					      }
					    }
					  /*-----*/}
					}
					break;

				default :
					break loop127;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, multiplicativeExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiplicativeExpression"


	public static class unaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unaryExpression"
	// Java.g:1650:1: unaryExpression : (opr= PLUS p= unaryExpression -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] unaryExpression ) |opr= MINUS p= unaryExpression -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] unaryExpression ) |opr= INC p= postfixedExpression -> ^( PRE_INC[$INC, \"PRE_INC\"] postfixedExpression ) |opr= DEC p= postfixedExpression -> ^( PRE_DEC[$DEC, \"PRE_DEC\"] postfixedExpression ) | unaryExpressionNotPlusMinus );
	public final JavaParser.unaryExpression_return unaryExpression() throws RecognitionException {
		JavaParser.unaryExpression_return retval = new JavaParser.unaryExpression_return();
		retval.start = input.LT(1);
		int unaryExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		ParserRuleReturnScope p =null;
		ParserRuleReturnScope unaryExpressionNotPlusMinus366 =null;

		CommonTree opr_tree=null;
		RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");
		RewriteRuleSubtreeStream stream_postfixedExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixedExpression");
		RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// Java.g:1651:13: (opr= PLUS p= unaryExpression -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] unaryExpression ) |opr= MINUS p= unaryExpression -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] unaryExpression ) |opr= INC p= postfixedExpression -> ^( PRE_INC[$INC, \"PRE_INC\"] postfixedExpression ) |opr= DEC p= postfixedExpression -> ^( PRE_DEC[$DEC, \"PRE_DEC\"] postfixedExpression ) | unaryExpressionNotPlusMinus )
			int alt128=5;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt128=1;
				}
				break;
			case MINUS:
				{
				alt128=2;
				}
				break;
			case INC:
				{
				alt128=3;
				}
				break;
			case DEC:
				{
				alt128=4;
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case DOUBLE:
			case FALSE:
			case FLOAT:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case IDENT:
			case INT:
			case LESS_THAN:
			case LOGICAL_NOT:
			case LONG:
			case LPAREN:
			case NEW:
			case NOT:
			case NULL:
			case OCTAL_LITERAL:
			case SHORT:
			case STRING_LITERAL:
			case SUPER:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt128=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}
			switch (alt128) {
				case 1 :
					// Java.g:1651:15: opr= PLUS p= unaryExpression
					{
					opr=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression17969); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(opr);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression17973);
					p=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(p.getTree());
					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      String opText = "unaryPlus";
					      String pText = tokens.toString((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex());
					      tokens.replace((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
					      tokens.delete(opr);
					      tokens.delete((p!=null?(p.start):null), (p!=null?(p.stop):null));
					    }
					  /*-----*/}
					// AST REWRITE
					// elements: unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1661:18: -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] unaryExpression )
					{
						// Java.g:1661:22: ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] unaryExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_PLUS, opr, "UNARY_PLUS"), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Java.g:1662:15: opr= MINUS p= unaryExpression
					{
					opr=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression18024); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(opr);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression18028);
					p=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(p.getTree());
					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      String opText = "unaryMinus";
					      String pText = tokens.toString((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex());
					      tokens.replace((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
					      tokens.delete(opr);
					      tokens.delete((p!=null?(p.start):null), (p!=null?(p.stop):null));
					    }
					  /*-----*/}
					// AST REWRITE
					// elements: unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1672:18: -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] unaryExpression )
					{
						// Java.g:1672:22: ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] unaryExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_MINUS, opr, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Java.g:1673:15: opr= INC p= postfixedExpression
					{
					opr=(Token)match(input,INC,FOLLOW_INC_in_unaryExpression18079); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INC.add(opr);

					pushFollow(FOLLOW_postfixedExpression_in_unaryExpression18083);
					p=postfixedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfixedExpression.add(p.getTree());
					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      String opText = "preIncrement";
					      String pText = tokens.toString((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex());
					      tokens.replace((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
					      tokens.delete(opr);
					      tokens.delete((p!=null?(p.start):null), (p!=null?(p.stop):null));
					    }
					  /*-----*/}
					// AST REWRITE
					// elements: postfixedExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1683:18: -> ^( PRE_INC[$INC, \"PRE_INC\"] postfixedExpression )
					{
						// Java.g:1683:22: ^( PRE_INC[$INC, \"PRE_INC\"] postfixedExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRE_INC, opr, "PRE_INC"), root_1);
						adaptor.addChild(root_1, stream_postfixedExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Java.g:1684:15: opr= DEC p= postfixedExpression
					{
					opr=(Token)match(input,DEC,FOLLOW_DEC_in_unaryExpression18135); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEC.add(opr);

					pushFollow(FOLLOW_postfixedExpression_in_unaryExpression18139);
					p=postfixedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfixedExpression.add(p.getTree());
					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      String opText = "preDecrement";
					      String pText = tokens.toString((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex());
					      tokens.replace((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
					      tokens.delete(opr);
					      tokens.delete((p!=null?(p.start):null), (p!=null?(p.stop):null));
					    }
					  /*-----*/}
					// AST REWRITE
					// elements: postfixedExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1694:16: -> ^( PRE_DEC[$DEC, \"PRE_DEC\"] postfixedExpression )
					{
						// Java.g:1694:20: ^( PRE_DEC[$DEC, \"PRE_DEC\"] postfixedExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRE_DEC, opr, "PRE_DEC"), root_1);
						adaptor.addChild(root_1, stream_postfixedExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Java.g:1695:17: unaryExpressionNotPlusMinus
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression18188);
					unaryExpressionNotPlusMinus366=unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus366.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, unaryExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryExpression"


	public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unaryExpressionNotPlusMinus"
	// Java.g:1698:1: unaryExpressionNotPlusMinus : (opr= NOT p= unaryExpression -> ^( NOT unaryExpression ) |opr= LOGICAL_NOT p= unaryExpression -> ^( LOGICAL_NOT unaryExpression ) | LPAREN t= type RPAREN p= unaryExpression -> ^( CAST_EXPR[$LPAREN, \"CAST_EXPR\"] type unaryExpression ) | postfixedExpression );
	public final JavaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
		JavaParser.unaryExpressionNotPlusMinus_return retval = new JavaParser.unaryExpressionNotPlusMinus_return();
		retval.start = input.LT(1);
		int unaryExpressionNotPlusMinus_StartIndex = input.index();

		CommonTree root_0 = null;

		Token opr=null;
		Token LPAREN367=null;
		Token RPAREN368=null;
		ParserRuleReturnScope p =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope postfixedExpression369 =null;

		CommonTree opr_tree=null;
		CommonTree LPAREN367_tree=null;
		CommonTree RPAREN368_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_LOGICAL_NOT=new RewriteRuleTokenStream(adaptor,"token LOGICAL_NOT");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// Java.g:1699:13: (opr= NOT p= unaryExpression -> ^( NOT unaryExpression ) |opr= LOGICAL_NOT p= unaryExpression -> ^( LOGICAL_NOT unaryExpression ) | LPAREN t= type RPAREN p= unaryExpression -> ^( CAST_EXPR[$LPAREN, \"CAST_EXPR\"] type unaryExpression ) | postfixedExpression )
			int alt129=4;
			switch ( input.LA(1) ) {
			case NOT:
				{
				alt129=1;
				}
				break;
			case LOGICAL_NOT:
				{
				alt129=2;
				}
				break;
			case LPAREN:
				{
				int LA129_3 = input.LA(2);
				if ( (synpred193_Java()) ) {
					alt129=3;
				}
				else if ( (true) ) {
					alt129=4;
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case DOUBLE:
			case FALSE:
			case FLOAT:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case IDENT:
			case INT:
			case LESS_THAN:
			case LONG:
			case NEW:
			case NULL:
			case OCTAL_LITERAL:
			case SHORT:
			case STRING_LITERAL:
			case SUPER:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt129=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}
			switch (alt129) {
				case 1 :
					// Java.g:1699:16: opr= NOT p= unaryExpression
					{
					opr=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpressionNotPlusMinus18233); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(opr);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus18237);
					p=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(p.getTree());
					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      String opText = "not";
					      String pText = tokens.toString((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex());
					      tokens.replace((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
					      tokens.delete(opr);
					      tokens.delete((p!=null?(p.start):null), (p!=null?(p.stop):null));
					    }
					  /*-----*/}
					// AST REWRITE
					// elements: NOT, unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1709:17: -> ^( NOT unaryExpression )
					{
						// Java.g:1709:21: ^( NOT unaryExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Java.g:1710:16: opr= LOGICAL_NOT p= unaryExpression
					{
					opr=(Token)match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_unaryExpressionNotPlusMinus18289); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LOGICAL_NOT.add(opr);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus18293);
					p=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(p.getTree());
					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      String opText = "logicalNot";
					      String pText = tokens.toString((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex());
					      tokens.replace((p!=null?(p.start):null).getTokenIndex(), (p!=null?(p.stop):null).getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
					      tokens.delete(opr);
					      tokens.delete((p!=null?(p.start):null), (p!=null?(p.stop):null));
					    }
					  /*-----*/}
					// AST REWRITE
					// elements: unaryExpression, LOGICAL_NOT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1720:34: -> ^( LOGICAL_NOT unaryExpression )
					{
						// Java.g:1720:38: ^( LOGICAL_NOT unaryExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_LOGICAL_NOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Java.g:1721:16: LPAREN t= type RPAREN p= unaryExpression
					{
					LPAREN367=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_unaryExpressionNotPlusMinus18356); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN367);

					pushFollow(FOLLOW_type_in_unaryExpressionNotPlusMinus18360);
					t=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type.add(t.getTree());
					RPAREN368=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_unaryExpressionNotPlusMinus18362); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN368);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus18366);
					p=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(p.getTree());
					if ( state.backtracking==0 ) {/*-----*/
					    if (PolyverseScope.isPolyverse()) {
					      System.err.println("Cast not yet implemented");
					      System.exit(-1);
					    }
					  /*-----*/}
					// AST REWRITE
					// elements: type, unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1728:17: -> ^( CAST_EXPR[$LPAREN, \"CAST_EXPR\"] type unaryExpression )
					{
						// Java.g:1728:21: ^( CAST_EXPR[$LPAREN, \"CAST_EXPR\"] type unaryExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAST_EXPR, LPAREN367, "CAST_EXPR"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Java.g:1729:16: postfixedExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postfixedExpression_in_unaryExpressionNotPlusMinus18415);
					postfixedExpression369=postfixedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixedExpression369.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, unaryExpressionNotPlusMinus_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryExpressionNotPlusMinus"


	public static class postfixedExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "postfixedExpression"
	// Java.g:1732:1: postfixedExpression : (q= primaryExpression -> primaryExpression ) (outerDot= DOT ( ( ( genericTypeArgumentListSimplified )? IDENT -> ^( DOT $postfixedExpression IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression ( genericTypeArgumentListSimplified )? arguments ) )? | THIS -> ^( DOT $postfixedExpression THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] $postfixedExpression arguments ) | ( SUPER innerDot= DOT IDENT -> ^( $innerDot ^( $outerDot $postfixedExpression SUPER ) IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression arguments ) )? | innerNewExpression -> ^( DOT $postfixedExpression innerNewExpression ) ) | LBRACK expression RBRACK -> ^( ARRAY_ELEMENT_ACCESS $postfixedExpression expression ) )* ( INC -> ^( POST_INC[$INC, \"POST_INC\"] $postfixedExpression) | DEC -> ^( POST_DEC[$DEC, \"POST_DEC\"] $postfixedExpression) )? ;
	public final JavaParser.postfixedExpression_return postfixedExpression() throws RecognitionException {
		JavaParser.postfixedExpression_return retval = new JavaParser.postfixedExpression_return();
		retval.start = input.LT(1);
		int postfixedExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token outerDot=null;
		Token Super=null;
		Token innerDot=null;
		Token IDENT371=null;
		Token THIS373=null;
		Token SUPER375=null;
		Token IDENT376=null;
		Token LBRACK379=null;
		Token RBRACK381=null;
		Token INC382=null;
		Token DEC383=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope genericTypeArgumentListSimplified370 =null;
		ParserRuleReturnScope arguments372 =null;
		ParserRuleReturnScope arguments374 =null;
		ParserRuleReturnScope arguments377 =null;
		ParserRuleReturnScope innerNewExpression378 =null;
		ParserRuleReturnScope expression380 =null;

		CommonTree outerDot_tree=null;
		CommonTree Super_tree=null;
		CommonTree innerDot_tree=null;
		CommonTree IDENT371_tree=null;
		CommonTree THIS373_tree=null;
		CommonTree SUPER375_tree=null;
		CommonTree IDENT376_tree=null;
		CommonTree LBRACK379_tree=null;
		CommonTree RBRACK381_tree=null;
		CommonTree INC382_tree=null;
		CommonTree DEC383_tree=null;
		RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
		RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");
		RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
		RewriteRuleSubtreeStream stream_innerNewExpression=new RewriteRuleSubtreeStream(adaptor,"rule innerNewExpression");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_genericTypeArgumentListSimplified=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeArgumentListSimplified");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// Java.g:1734:13: ( (q= primaryExpression -> primaryExpression ) (outerDot= DOT ( ( ( genericTypeArgumentListSimplified )? IDENT -> ^( DOT $postfixedExpression IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression ( genericTypeArgumentListSimplified )? arguments ) )? | THIS -> ^( DOT $postfixedExpression THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] $postfixedExpression arguments ) | ( SUPER innerDot= DOT IDENT -> ^( $innerDot ^( $outerDot $postfixedExpression SUPER ) IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression arguments ) )? | innerNewExpression -> ^( DOT $postfixedExpression innerNewExpression ) ) | LBRACK expression RBRACK -> ^( ARRAY_ELEMENT_ACCESS $postfixedExpression expression ) )* ( INC -> ^( POST_INC[$INC, \"POST_INC\"] $postfixedExpression) | DEC -> ^( POST_DEC[$DEC, \"POST_DEC\"] $postfixedExpression) )? )
			// Java.g:1734:17: (q= primaryExpression -> primaryExpression ) (outerDot= DOT ( ( ( genericTypeArgumentListSimplified )? IDENT -> ^( DOT $postfixedExpression IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression ( genericTypeArgumentListSimplified )? arguments ) )? | THIS -> ^( DOT $postfixedExpression THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] $postfixedExpression arguments ) | ( SUPER innerDot= DOT IDENT -> ^( $innerDot ^( $outerDot $postfixedExpression SUPER ) IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression arguments ) )? | innerNewExpression -> ^( DOT $postfixedExpression innerNewExpression ) ) | LBRACK expression RBRACK -> ^( ARRAY_ELEMENT_ACCESS $postfixedExpression expression ) )* ( INC -> ^( POST_INC[$INC, \"POST_INC\"] $postfixedExpression) | DEC -> ^( POST_DEC[$DEC, \"POST_DEC\"] $postfixedExpression) )?
			{
			// Java.g:1734:17: (q= primaryExpression -> primaryExpression )
			// Java.g:1734:19: q= primaryExpression
			{
			pushFollow(FOLLOW_primaryExpression_in_postfixedExpression18484);
			q=primaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primaryExpression.add(q.getTree());
			// AST REWRITE
			// elements: primaryExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1735:21: -> primaryExpression
			{
				adaptor.addChild(root_0, stream_primaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// Java.g:1738:17: (outerDot= DOT ( ( ( genericTypeArgumentListSimplified )? IDENT -> ^( DOT $postfixedExpression IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression ( genericTypeArgumentListSimplified )? arguments ) )? | THIS -> ^( DOT $postfixedExpression THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] $postfixedExpression arguments ) | ( SUPER innerDot= DOT IDENT -> ^( $innerDot ^( $outerDot $postfixedExpression SUPER ) IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression arguments ) )? | innerNewExpression -> ^( DOT $postfixedExpression innerNewExpression ) ) | LBRACK expression RBRACK -> ^( ARRAY_ELEMENT_ACCESS $postfixedExpression expression ) )*
			loop134:
			while (true) {
				int alt134=3;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==DOT) ) {
					alt134=1;
				}
				else if ( (LA134_0==LBRACK) ) {
					alt134=2;
				}

				switch (alt134) {
				case 1 :
					// Java.g:1738:21: outerDot= DOT ( ( ( genericTypeArgumentListSimplified )? IDENT -> ^( DOT $postfixedExpression IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression ( genericTypeArgumentListSimplified )? arguments ) )? | THIS -> ^( DOT $postfixedExpression THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] $postfixedExpression arguments ) | ( SUPER innerDot= DOT IDENT -> ^( $innerDot ^( $outerDot $postfixedExpression SUPER ) IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression arguments ) )? | innerNewExpression -> ^( DOT $postfixedExpression innerNewExpression ) )
					{
					outerDot=(Token)match(input,DOT,FOLLOW_DOT_in_postfixedExpression18570); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(outerDot);

					// Java.g:1739:21: ( ( ( genericTypeArgumentListSimplified )? IDENT -> ^( DOT $postfixedExpression IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression ( genericTypeArgumentListSimplified )? arguments ) )? | THIS -> ^( DOT $postfixedExpression THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] $postfixedExpression arguments ) | ( SUPER innerDot= DOT IDENT -> ^( $innerDot ^( $outerDot $postfixedExpression SUPER ) IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression arguments ) )? | innerNewExpression -> ^( DOT $postfixedExpression innerNewExpression ) )
					int alt133=5;
					switch ( input.LA(1) ) {
					case IDENT:
					case LESS_THAN:
						{
						alt133=1;
						}
						break;
					case THIS:
						{
						alt133=2;
						}
						break;
					case SUPER:
						{
						int LA133_3 = input.LA(2);
						if ( (LA133_3==DOT) ) {
							alt133=4;
						}
						else if ( (LA133_3==LPAREN) ) {
							alt133=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 133, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case NEW:
						{
						alt133=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 133, 0, input);
						throw nvae;
					}
					switch (alt133) {
						case 1 :
							// Java.g:1739:25: ( ( genericTypeArgumentListSimplified )? IDENT -> ^( DOT $postfixedExpression IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression ( genericTypeArgumentListSimplified )? arguments ) )?
							{
							// Java.g:1739:25: ( ( genericTypeArgumentListSimplified )? IDENT -> ^( DOT $postfixedExpression IDENT ) )
							// Java.g:1739:29: ( genericTypeArgumentListSimplified )? IDENT
							{
							// Java.g:1739:29: ( genericTypeArgumentListSimplified )?
							int alt130=2;
							int LA130_0 = input.LA(1);
							if ( (LA130_0==LESS_THAN) ) {
								alt130=1;
							}
							switch (alt130) {
								case 1 :
									// Java.g:1739:29: genericTypeArgumentListSimplified
									{
									pushFollow(FOLLOW_genericTypeArgumentListSimplified_in_postfixedExpression18628);
									genericTypeArgumentListSimplified370=genericTypeArgumentListSimplified();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_genericTypeArgumentListSimplified.add(genericTypeArgumentListSimplified370.getTree());
									}
									break;

							}

							IDENT371=(Token)match(input,IDENT,FOLLOW_IDENT_in_postfixedExpression18726); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_IDENT.add(IDENT371);

							// AST REWRITE
							// elements: DOT, IDENT, postfixedExpression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1741:61: -> ^( DOT $postfixedExpression IDENT )
							{
								// Java.g:1741:65: ^( DOT $postfixedExpression IDENT )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);
								adaptor.addChild(root_1, stream_retval.nextTree());
								adaptor.addChild(root_1, stream_IDENT.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}

							// Java.g:1743:25: ( arguments -> ^( METHOD_CALL $postfixedExpression ( genericTypeArgumentListSimplified )? arguments ) )?
							int alt131=2;
							int LA131_0 = input.LA(1);
							if ( (LA131_0==LPAREN) ) {
								alt131=1;
							}
							switch (alt131) {
								case 1 :
									// Java.g:1743:29: arguments
									{
									pushFollow(FOLLOW_arguments_in_postfixedExpression18821);
									arguments372=arguments();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_arguments.add(arguments372.getTree());
									// AST REWRITE
									// elements: arguments, postfixedExpression, genericTypeArgumentListSimplified
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 1744:46: -> ^( METHOD_CALL $postfixedExpression ( genericTypeArgumentListSimplified )? arguments )
									{
										// Java.g:1744:50: ^( METHOD_CALL $postfixedExpression ( genericTypeArgumentListSimplified )? arguments )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_CALL, "METHOD_CALL"), root_1);
										adaptor.addChild(root_1, stream_retval.nextTree());
										// Java.g:1744:85: ( genericTypeArgumentListSimplified )?
										if ( stream_genericTypeArgumentListSimplified.hasNext() ) {
											adaptor.addChild(root_1, stream_genericTypeArgumentListSimplified.nextTree());
										}
										stream_genericTypeArgumentListSimplified.reset();

										adaptor.addChild(root_1, stream_arguments.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// Java.g:1746:25: THIS
							{
							THIS373=(Token)match(input,THIS,FOLLOW_THIS_in_postfixedExpression18936); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_THIS.add(THIS373);

							// AST REWRITE
							// elements: DOT, postfixedExpression, THIS
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1746:61: -> ^( DOT $postfixedExpression THIS )
							{
								// Java.g:1746:65: ^( DOT $postfixedExpression THIS )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);
								adaptor.addChild(root_1, stream_retval.nextTree());
								adaptor.addChild(root_1, stream_THIS.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 3 :
							// Java.g:1747:25: Super= SUPER arguments
							{
							Super=(Token)match(input,SUPER,FOLLOW_SUPER_in_postfixedExpression19007); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SUPER.add(Super);

							pushFollow(FOLLOW_arguments_in_postfixedExpression19009);
							arguments374=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(arguments374.getTree());
							// AST REWRITE
							// elements: arguments, postfixedExpression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1747:65: -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] $postfixedExpression arguments )
							{
								// Java.g:1747:69: ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] $postfixedExpression arguments )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER_CONSTRUCTOR_CALL, Super, "SUPER_CONSTRUCTOR_CALL"), root_1);
								adaptor.addChild(root_1, stream_retval.nextTree());
								adaptor.addChild(root_1, stream_arguments.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 4 :
							// Java.g:1748:25: ( SUPER innerDot= DOT IDENT -> ^( $innerDot ^( $outerDot $postfixedExpression SUPER ) IDENT ) ) ( arguments -> ^( METHOD_CALL $postfixedExpression arguments ) )?
							{
							// Java.g:1748:25: ( SUPER innerDot= DOT IDENT -> ^( $innerDot ^( $outerDot $postfixedExpression SUPER ) IDENT ) )
							// Java.g:1748:29: SUPER innerDot= DOT IDENT
							{
							SUPER375=(Token)match(input,SUPER,FOLLOW_SUPER_in_postfixedExpression19070); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SUPER.add(SUPER375);

							innerDot=(Token)match(input,DOT,FOLLOW_DOT_in_postfixedExpression19074); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DOT.add(innerDot);

							IDENT376=(Token)match(input,IDENT,FOLLOW_IDENT_in_postfixedExpression19076); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_IDENT.add(IDENT376);

							// AST REWRITE
							// elements: outerDot, IDENT, innerDot, SUPER, postfixedExpression
							// token labels: innerDot, outerDot
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleTokenStream stream_innerDot=new RewriteRuleTokenStream(adaptor,"token innerDot",innerDot);
							RewriteRuleTokenStream stream_outerDot=new RewriteRuleTokenStream(adaptor,"token outerDot",outerDot);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1748:61: -> ^( $innerDot ^( $outerDot $postfixedExpression SUPER ) IDENT )
							{
								// Java.g:1748:65: ^( $innerDot ^( $outerDot $postfixedExpression SUPER ) IDENT )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_innerDot.nextNode(), root_1);
								// Java.g:1748:77: ^( $outerDot $postfixedExpression SUPER )
								{
								CommonTree root_2 = (CommonTree)adaptor.nil();
								root_2 = (CommonTree)adaptor.becomeRoot(stream_outerDot.nextNode(), root_2);
								adaptor.addChild(root_2, stream_retval.nextTree());
								adaptor.addChild(root_2, stream_SUPER.nextNode());
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_1, stream_IDENT.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}

							// Java.g:1750:25: ( arguments -> ^( METHOD_CALL $postfixedExpression arguments ) )?
							int alt132=2;
							int LA132_0 = input.LA(1);
							if ( (LA132_0==LPAREN) ) {
								alt132=1;
							}
							switch (alt132) {
								case 1 :
									// Java.g:1750:29: arguments
									{
									pushFollow(FOLLOW_arguments_in_postfixedExpression19159);
									arguments377=arguments();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_arguments.add(arguments377.getTree());
									// AST REWRITE
									// elements: arguments, postfixedExpression
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 1751:41: -> ^( METHOD_CALL $postfixedExpression arguments )
									{
										// Java.g:1751:45: ^( METHOD_CALL $postfixedExpression arguments )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_CALL, "METHOD_CALL"), root_1);
										adaptor.addChild(root_1, stream_retval.nextTree());
										adaptor.addChild(root_1, stream_arguments.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;

							}

							}
							break;
						case 5 :
							// Java.g:1753:25: innerNewExpression
							{
							pushFollow(FOLLOW_innerNewExpression_in_postfixedExpression19271);
							innerNewExpression378=innerNewExpression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_innerNewExpression.add(innerNewExpression378.getTree());
							// AST REWRITE
							// elements: postfixedExpression, DOT, innerNewExpression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1753:61: -> ^( DOT $postfixedExpression innerNewExpression )
							{
								// Java.g:1753:65: ^( DOT $postfixedExpression innerNewExpression )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);
								adaptor.addChild(root_1, stream_retval.nextTree());
								adaptor.addChild(root_1, stream_innerNewExpression.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// Java.g:1755:21: LBRACK expression RBRACK
					{
					LBRACK379=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfixedExpression19344); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK379);

					pushFollow(FOLLOW_expression_in_postfixedExpression19346);
					expression380=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression380.getTree());
					RBRACK381=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfixedExpression19348); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK381);

					// AST REWRITE
					// elements: expression, postfixedExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1755:61: -> ^( ARRAY_ELEMENT_ACCESS $postfixedExpression expression )
					{
						// Java.g:1755:65: ^( ARRAY_ELEMENT_ACCESS $postfixedExpression expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY_ELEMENT_ACCESS, "ARRAY_ELEMENT_ACCESS"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop134;
				}
			}

			// Java.g:1758:17: ( INC -> ^( POST_INC[$INC, \"POST_INC\"] $postfixedExpression) | DEC -> ^( POST_DEC[$DEC, \"POST_DEC\"] $postfixedExpression) )?
			int alt135=3;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==INC) ) {
				alt135=1;
			}
			else if ( (LA135_0==DEC) ) {
				alt135=2;
			}
			switch (alt135) {
				case 1 :
					// Java.g:1758:21: INC
					{
					INC382=(Token)match(input,INC,FOLLOW_INC_in_postfixedExpression19433); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INC.add(INC382);

					// AST REWRITE
					// elements: postfixedExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1759:18: -> ^( POST_INC[$INC, \"POST_INC\"] $postfixedExpression)
					{
						// Java.g:1759:21: ^( POST_INC[$INC, \"POST_INC\"] $postfixedExpression)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POST_INC, INC382, "POST_INC"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Java.g:1760:21: DEC
					{
					DEC383=(Token)match(input,DEC,FOLLOW_DEC_in_postfixedExpression19483); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEC.add(DEC383);

					// AST REWRITE
					// elements: postfixedExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1761:17: -> ^( POST_DEC[$DEC, \"POST_DEC\"] $postfixedExpression)
					{
						// Java.g:1761:20: ^( POST_DEC[$DEC, \"POST_DEC\"] $postfixedExpression)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POST_DEC, DEC383, "POST_DEC"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 105, postfixedExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postfixedExpression"


	public static class primaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primaryExpression"
	// Java.g:1765:1: primaryExpression : ( parenthesizedExpression |z= literal | newExpression |q= qualifiedIdentExpression | genericTypeArgumentListSimplified ( SUPER ( arguments -> ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments ) | DOT IDENT arguments -> ^( METHOD_CALL ^( DOT SUPER IDENT ) genericTypeArgumentListSimplified arguments ) ) |q1= IDENT arguments -> ^( METHOD_CALL IDENT genericTypeArgumentListSimplified arguments ) | THIS arguments -> ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments ) ) | ( THIS -> THIS ) ( arguments -> ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] arguments ) )? | SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] arguments ) | ( SUPER DOT IDENT ) ( arguments -> ^( METHOD_CALL ^( DOT SUPER IDENT ) arguments ) | -> ^( DOT SUPER IDENT ) ) | ( primitiveType -> primitiveType ) ( arrayDeclarator -> ^( arrayDeclarator $primaryExpression) )* DOT CLASS -> ^( DOT $primaryExpression CLASS ) | VOID DOT CLASS -> ^( DOT VOID CLASS ) );
	public final JavaParser.primaryExpression_return primaryExpression() throws RecognitionException {
		JavaParser.primaryExpression_return retval = new JavaParser.primaryExpression_return();
		retval.start = input.LT(1);
		int primaryExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token q1=null;
		Token SUPER387=null;
		Token DOT389=null;
		Token IDENT390=null;
		Token THIS393=null;
		Token THIS395=null;
		Token SUPER397=null;
		Token SUPER399=null;
		Token DOT400=null;
		Token IDENT401=null;
		Token DOT405=null;
		Token CLASS406=null;
		Token VOID407=null;
		Token DOT408=null;
		Token CLASS409=null;
		ParserRuleReturnScope z =null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope parenthesizedExpression384 =null;
		ParserRuleReturnScope newExpression385 =null;
		ParserRuleReturnScope genericTypeArgumentListSimplified386 =null;
		ParserRuleReturnScope arguments388 =null;
		ParserRuleReturnScope arguments391 =null;
		ParserRuleReturnScope arguments392 =null;
		ParserRuleReturnScope arguments394 =null;
		ParserRuleReturnScope arguments396 =null;
		ParserRuleReturnScope arguments398 =null;
		ParserRuleReturnScope arguments402 =null;
		ParserRuleReturnScope primitiveType403 =null;
		ParserRuleReturnScope arrayDeclarator404 =null;

		CommonTree q1_tree=null;
		CommonTree SUPER387_tree=null;
		CommonTree DOT389_tree=null;
		CommonTree IDENT390_tree=null;
		CommonTree THIS393_tree=null;
		CommonTree THIS395_tree=null;
		CommonTree SUPER397_tree=null;
		CommonTree SUPER399_tree=null;
		CommonTree DOT400_tree=null;
		CommonTree IDENT401_tree=null;
		CommonTree DOT405_tree=null;
		CommonTree CLASS406_tree=null;
		CommonTree VOID407_tree=null;
		CommonTree DOT408_tree=null;
		CommonTree CLASS409_tree=null;
		RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
		RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
		RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
		RewriteRuleSubtreeStream stream_arrayDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule arrayDeclarator");
		RewriteRuleSubtreeStream stream_genericTypeArgumentListSimplified=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeArgumentListSimplified");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
		RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// Java.g:1766:13: ( parenthesizedExpression |z= literal | newExpression |q= qualifiedIdentExpression | genericTypeArgumentListSimplified ( SUPER ( arguments -> ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments ) | DOT IDENT arguments -> ^( METHOD_CALL ^( DOT SUPER IDENT ) genericTypeArgumentListSimplified arguments ) ) |q1= IDENT arguments -> ^( METHOD_CALL IDENT genericTypeArgumentListSimplified arguments ) | THIS arguments -> ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments ) ) | ( THIS -> THIS ) ( arguments -> ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] arguments ) )? | SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] arguments ) | ( SUPER DOT IDENT ) ( arguments -> ^( METHOD_CALL ^( DOT SUPER IDENT ) arguments ) | -> ^( DOT SUPER IDENT ) ) | ( primitiveType -> primitiveType ) ( arrayDeclarator -> ^( arrayDeclarator $primaryExpression) )* DOT CLASS -> ^( DOT $primaryExpression CLASS ) | VOID DOT CLASS -> ^( DOT VOID CLASS ) )
			int alt141=10;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt141=1;
				}
				break;
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FALSE:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case NULL:
			case OCTAL_LITERAL:
			case STRING_LITERAL:
			case TRUE:
				{
				alt141=2;
				}
				break;
			case NEW:
				{
				alt141=3;
				}
				break;
			case IDENT:
				{
				alt141=4;
				}
				break;
			case LESS_THAN:
				{
				alt141=5;
				}
				break;
			case THIS:
				{
				alt141=6;
				}
				break;
			case SUPER:
				{
				int LA141_7 = input.LA(2);
				if ( (LA141_7==DOT) ) {
					alt141=8;
				}
				else if ( (LA141_7==LPAREN) ) {
					alt141=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 141, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				alt141=9;
				}
				break;
			case VOID:
				{
				alt141=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 141, 0, input);
				throw nvae;
			}
			switch (alt141) {
				case 1 :
					// Java.g:1766:15: parenthesizedExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression19578);
					parenthesizedExpression384=parenthesizedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedExpression384.getTree());

					}
					break;
				case 2 :
					// Java.g:1767:17: z= literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_literal_in_primaryExpression19598);
					z=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, z.getTree());

					}
					break;
				case 3 :
					// Java.g:1768:17: newExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newExpression_in_primaryExpression19617);
					newExpression385=newExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpression385.getTree());

					}
					break;
				case 4 :
					// Java.g:1769:17: q= qualifiedIdentExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualifiedIdentExpression_in_primaryExpression19637);
					q=qualifiedIdentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, q.getTree());

					}
					break;
				case 5 :
					// Java.g:1781:17: genericTypeArgumentListSimplified ( SUPER ( arguments -> ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments ) | DOT IDENT arguments -> ^( METHOD_CALL ^( DOT SUPER IDENT ) genericTypeArgumentListSimplified arguments ) ) |q1= IDENT arguments -> ^( METHOD_CALL IDENT genericTypeArgumentListSimplified arguments ) | THIS arguments -> ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments ) )
					{
					pushFollow(FOLLOW_genericTypeArgumentListSimplified_in_primaryExpression19720);
					genericTypeArgumentListSimplified386=genericTypeArgumentListSimplified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_genericTypeArgumentListSimplified.add(genericTypeArgumentListSimplified386.getTree());
					// Java.g:1782:17: ( SUPER ( arguments -> ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments ) | DOT IDENT arguments -> ^( METHOD_CALL ^( DOT SUPER IDENT ) genericTypeArgumentListSimplified arguments ) ) |q1= IDENT arguments -> ^( METHOD_CALL IDENT genericTypeArgumentListSimplified arguments ) | THIS arguments -> ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments ) )
					int alt137=3;
					switch ( input.LA(1) ) {
					case SUPER:
						{
						alt137=1;
						}
						break;
					case IDENT:
						{
						alt137=2;
						}
						break;
					case THIS:
						{
						alt137=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 137, 0, input);
						throw nvae;
					}
					switch (alt137) {
						case 1 :
							// Java.g:1782:21: SUPER ( arguments -> ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments ) | DOT IDENT arguments -> ^( METHOD_CALL ^( DOT SUPER IDENT ) genericTypeArgumentListSimplified arguments ) )
							{
							SUPER387=(Token)match(input,SUPER,FOLLOW_SUPER_in_primaryExpression19743); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SUPER.add(SUPER387);

							// Java.g:1783:21: ( arguments -> ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments ) | DOT IDENT arguments -> ^( METHOD_CALL ^( DOT SUPER IDENT ) genericTypeArgumentListSimplified arguments ) )
							int alt136=2;
							int LA136_0 = input.LA(1);
							if ( (LA136_0==LPAREN) ) {
								alt136=1;
							}
							else if ( (LA136_0==DOT) ) {
								alt136=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 136, 0, input);
								throw nvae;
							}

							switch (alt136) {
								case 1 :
									// Java.g:1783:25: arguments
									{
									pushFollow(FOLLOW_arguments_in_primaryExpression19769);
									arguments388=arguments();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_arguments.add(arguments388.getTree());
									// AST REWRITE
									// elements: genericTypeArgumentListSimplified, arguments
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 1783:65: -> ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments )
									{
										// Java.g:1783:69: ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER_CONSTRUCTOR_CALL, SUPER387, "SUPER_CONSTRUCTOR_CALL"), root_1);
										adaptor.addChild(root_1, stream_genericTypeArgumentListSimplified.nextTree());
										adaptor.addChild(root_1, stream_arguments.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;
								case 2 :
									// Java.g:1784:25: DOT IDENT arguments
									{
									DOT389=(Token)match(input,DOT,FOLLOW_DOT_in_primaryExpression19837); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DOT.add(DOT389);

									IDENT390=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression19839); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_IDENT.add(IDENT390);

									pushFollow(FOLLOW_arguments_in_primaryExpression19841);
									arguments391=arguments();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_arguments.add(arguments391.getTree());
									// AST REWRITE
									// elements: DOT, arguments, IDENT, SUPER, genericTypeArgumentListSimplified
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 1784:65: -> ^( METHOD_CALL ^( DOT SUPER IDENT ) genericTypeArgumentListSimplified arguments )
									{
										// Java.g:1784:69: ^( METHOD_CALL ^( DOT SUPER IDENT ) genericTypeArgumentListSimplified arguments )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_CALL, "METHOD_CALL"), root_1);
										// Java.g:1784:83: ^( DOT SUPER IDENT )
										{
										CommonTree root_2 = (CommonTree)adaptor.nil();
										root_2 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_2);
										adaptor.addChild(root_2, stream_SUPER.nextNode());
										adaptor.addChild(root_2, stream_IDENT.nextNode());
										adaptor.addChild(root_1, root_2);
										}

										adaptor.addChild(root_1, stream_genericTypeArgumentListSimplified.nextTree());
										adaptor.addChild(root_1, stream_arguments.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// Java.g:1786:21: q1= IDENT arguments
							{
							q1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression19926); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_IDENT.add(q1);

							pushFollow(FOLLOW_arguments_in_primaryExpression19945);
							arguments392=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(arguments392.getTree());
							// AST REWRITE
							// elements: genericTypeArgumentListSimplified, IDENT, arguments
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1787:55: -> ^( METHOD_CALL IDENT genericTypeArgumentListSimplified arguments )
							{
								// Java.g:1787:59: ^( METHOD_CALL IDENT genericTypeArgumentListSimplified arguments )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_CALL, "METHOD_CALL"), root_1);
								adaptor.addChild(root_1, stream_IDENT.nextNode());
								adaptor.addChild(root_1, stream_genericTypeArgumentListSimplified.nextTree());
								adaptor.addChild(root_1, stream_arguments.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 3 :
							// Java.g:1788:21: THIS arguments
							{
							THIS393=(Token)match(input,THIS,FOLLOW_THIS_in_primaryExpression20008); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_THIS.add(THIS393);

							pushFollow(FOLLOW_arguments_in_primaryExpression20010);
							arguments394=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(arguments394.getTree());
							// AST REWRITE
							// elements: arguments, genericTypeArgumentListSimplified
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1788:65: -> ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments )
							{
								// Java.g:1788:69: ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] genericTypeArgumentListSimplified arguments )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THIS_CONSTRUCTOR_CALL, THIS393, "THIS_CONSTRUCTOR_CALL"), root_1);
								adaptor.addChild(root_1, stream_genericTypeArgumentListSimplified.nextTree());
								adaptor.addChild(root_1, stream_arguments.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 6 :
					// Java.g:1790:17: ( THIS -> THIS ) ( arguments -> ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] arguments ) )?
					{
					// Java.g:1790:17: ( THIS -> THIS )
					// Java.g:1790:21: THIS
					{
					THIS395=(Token)match(input,THIS,FOLLOW_THIS_in_primaryExpression20091); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_THIS.add(THIS395);

					// AST REWRITE
					// elements: THIS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1790:65: -> THIS
					{
						adaptor.addChild(root_0, stream_THIS.nextNode());
					}


					retval.tree = root_0;
					}

					}

					// Java.g:1792:17: ( arguments -> ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] arguments ) )?
					int alt138=2;
					int LA138_0 = input.LA(1);
					if ( (LA138_0==LPAREN) ) {
						alt138=1;
					}
					switch (alt138) {
						case 1 :
							// Java.g:1792:21: arguments
							{
							pushFollow(FOLLOW_arguments_in_primaryExpression20175);
							arguments396=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(arguments396.getTree());
							// AST REWRITE
							// elements: arguments
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1792:65: -> ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] arguments )
							{
								// Java.g:1792:69: ^( THIS_CONSTRUCTOR_CALL[$THIS, \"THIS_CONSTRUCTOR_CALL\"] arguments )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THIS_CONSTRUCTOR_CALL, THIS395, "THIS_CONSTRUCTOR_CALL"), root_1);
								adaptor.addChild(root_1, stream_arguments.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 7 :
					// Java.g:1794:17: SUPER arguments
					{
					SUPER397=(Token)match(input,SUPER,FOLLOW_SUPER_in_primaryExpression20256); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SUPER.add(SUPER397);

					pushFollow(FOLLOW_arguments_in_primaryExpression20258);
					arguments398=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arguments.add(arguments398.getTree());
					// AST REWRITE
					// elements: arguments
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1794:65: -> ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] arguments )
					{
						// Java.g:1794:69: ^( SUPER_CONSTRUCTOR_CALL[$SUPER, \"SUPER_CONSTRUCTOR_CALL\"] arguments )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER_CONSTRUCTOR_CALL, SUPER397, "SUPER_CONSTRUCTOR_CALL"), root_1);
						adaptor.addChild(root_1, stream_arguments.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// Java.g:1795:17: ( SUPER DOT IDENT ) ( arguments -> ^( METHOD_CALL ^( DOT SUPER IDENT ) arguments ) | -> ^( DOT SUPER IDENT ) )
					{
					// Java.g:1795:17: ( SUPER DOT IDENT )
					// Java.g:1795:21: SUPER DOT IDENT
					{
					SUPER399=(Token)match(input,SUPER,FOLLOW_SUPER_in_primaryExpression20322); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SUPER.add(SUPER399);

					DOT400=(Token)match(input,DOT,FOLLOW_DOT_in_primaryExpression20324); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT400);

					IDENT401=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression20326); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENT.add(IDENT401);

					}

					// Java.g:1797:17: ( arguments -> ^( METHOD_CALL ^( DOT SUPER IDENT ) arguments ) | -> ^( DOT SUPER IDENT ) )
					int alt139=2;
					int LA139_0 = input.LA(1);
					if ( (LA139_0==LPAREN) ) {
						alt139=1;
					}
					else if ( (LA139_0==EOF||(LA139_0 >= AND && LA139_0 <= AND_ASSIGN)||LA139_0==ASSIGN||(LA139_0 >= BIT_SHIFT_RIGHT && LA139_0 <= BIT_SHIFT_RIGHT_ASSIGN)||(LA139_0 >= COLON && LA139_0 <= COMMA)||LA139_0==DEC||(LA139_0 >= DIV && LA139_0 <= DIV_ASSIGN)||LA139_0==DOT||LA139_0==EQUAL||(LA139_0 >= GREATER_OR_EQUAL && LA139_0 <= GREATER_THAN)||(LA139_0 >= INC && LA139_0 <= INSTANCEOF)||LA139_0==LBRACK||(LA139_0 >= LESS_OR_EQUAL && LA139_0 <= LESS_THAN)||LA139_0==LOGICAL_AND||LA139_0==LOGICAL_OR||(LA139_0 >= MINUS && LA139_0 <= MOD)||LA139_0==MOD_ASSIGN||LA139_0==NOT_EQUAL||(LA139_0 >= OR && LA139_0 <= OR_ASSIGN)||(LA139_0 >= PLUS && LA139_0 <= PLUS_ASSIGN)||(LA139_0 >= QUESTION && LA139_0 <= RCURLY)||(LA139_0 >= RPAREN && LA139_0 <= SHIFT_RIGHT_ASSIGN)||(LA139_0 >= STAR && LA139_0 <= STAR_ASSIGN)||(LA139_0 >= XOR && LA139_0 <= XOR_ASSIGN)) ) {
						alt139=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 139, 0, input);
						throw nvae;
					}

					switch (alt139) {
						case 1 :
							// Java.g:1797:21: arguments
							{
							pushFollow(FOLLOW_arguments_in_primaryExpression20366);
							arguments402=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(arguments402.getTree());
							// AST REWRITE
							// elements: DOT, arguments, SUPER, IDENT
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1798:49: -> ^( METHOD_CALL ^( DOT SUPER IDENT ) arguments )
							{
								// Java.g:1798:53: ^( METHOD_CALL ^( DOT SUPER IDENT ) arguments )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_CALL, "METHOD_CALL"), root_1);
								// Java.g:1798:67: ^( DOT SUPER IDENT )
								{
								CommonTree root_2 = (CommonTree)adaptor.nil();
								root_2 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_2);
								adaptor.addChild(root_2, stream_SUPER.nextNode());
								adaptor.addChild(root_2, stream_IDENT.nextNode());
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_1, stream_arguments.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// Java.g:1799:65: 
							{
							// AST REWRITE
							// elements: SUPER, IDENT, DOT
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1799:65: -> ^( DOT SUPER IDENT )
							{
								// Java.g:1799:69: ^( DOT SUPER IDENT )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);
								adaptor.addChild(root_1, stream_SUPER.nextNode());
								adaptor.addChild(root_1, stream_IDENT.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 9 :
					// Java.g:1801:17: ( primitiveType -> primitiveType ) ( arrayDeclarator -> ^( arrayDeclarator $primaryExpression) )* DOT CLASS
					{
					// Java.g:1801:17: ( primitiveType -> primitiveType )
					// Java.g:1801:21: primitiveType
					{
					pushFollow(FOLLOW_primitiveType_in_primaryExpression20549);
					primitiveType403=primitiveType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType403.getTree());
					// AST REWRITE
					// elements: primitiveType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1801:65: -> primitiveType
					{
						adaptor.addChild(root_0, stream_primitiveType.nextTree());
					}


					retval.tree = root_0;
					}

					}

					// Java.g:1803:17: ( arrayDeclarator -> ^( arrayDeclarator $primaryExpression) )*
					loop140:
					while (true) {
						int alt140=2;
						int LA140_0 = input.LA(1);
						if ( (LA140_0==LBRACK) ) {
							alt140=1;
						}

						switch (alt140) {
						case 1 :
							// Java.g:1803:21: arrayDeclarator
							{
							pushFollow(FOLLOW_arrayDeclarator_in_primaryExpression20624);
							arrayDeclarator404=arrayDeclarator();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayDeclarator.add(arrayDeclarator404.getTree());
							// AST REWRITE
							// elements: arrayDeclarator, primaryExpression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1803:65: -> ^( arrayDeclarator $primaryExpression)
							{
								// Java.g:1803:69: ^( arrayDeclarator $primaryExpression)
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_arrayDeclarator.nextNode(), root_1);
								adaptor.addChild(root_1, stream_retval.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

						default :
							break loop140;
						}
					}

					DOT405=(Token)match(input,DOT,FOLLOW_DOT_in_primaryExpression20703); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT405);

					CLASS406=(Token)match(input,CLASS,FOLLOW_CLASS_in_primaryExpression20705); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CLASS.add(CLASS406);

					// AST REWRITE
					// elements: DOT, primaryExpression, CLASS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1805:65: -> ^( DOT $primaryExpression CLASS )
					{
						// Java.g:1805:69: ^( DOT $primaryExpression CLASS )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_CLASS.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 10 :
					// Java.g:1806:17: VOID DOT CLASS
					{
					VOID407=(Token)match(input,VOID,FOLLOW_VOID_in_primaryExpression20773); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VOID.add(VOID407);

					DOT408=(Token)match(input,DOT,FOLLOW_DOT_in_primaryExpression20775); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT408);

					CLASS409=(Token)match(input,CLASS,FOLLOW_CLASS_in_primaryExpression20777); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CLASS.add(CLASS409);

					// AST REWRITE
					// elements: CLASS, VOID, DOT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1806:65: -> ^( DOT VOID CLASS )
					{
						// Java.g:1806:69: ^( DOT VOID CLASS )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_VOID.nextNode());
						adaptor.addChild(root_1, stream_CLASS.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 106, primaryExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primaryExpression"


	public static class qualifiedIdentExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualifiedIdentExpression"
	// Java.g:1809:1: qualifiedIdentExpression : (x= qualifiedIdentifier -> qualifiedIdentifier ) ( ( arrayDeclarator -> ^( arrayDeclarator $qualifiedIdentExpression) )+ ( DOT CLASS -> ^( DOT $qualifiedIdentExpression CLASS ) ) | arguments -> ^( METHOD_CALL qualifiedIdentifier arguments ) |outerDot= DOT ( CLASS -> ^( DOT qualifiedIdentifier CLASS ) | genericTypeArgumentListSimplified (Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier genericTypeArgumentListSimplified arguments ) | SUPER innerDot= DOT IDENT arguments -> ^( METHOD_CALL ^( $innerDot ^( $outerDot qualifiedIdentifier SUPER ) IDENT ) genericTypeArgumentListSimplified arguments ) | IDENT arguments -> ^( METHOD_CALL ^( DOT qualifiedIdentifier IDENT ) genericTypeArgumentListSimplified arguments ) ) | THIS -> ^( DOT qualifiedIdentifier THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier arguments ) | innerNewExpression -> ^( DOT qualifiedIdentifier innerNewExpression ) ) )? ;
	public final JavaParser.qualifiedIdentExpression_return qualifiedIdentExpression() throws RecognitionException {
		JavaParser.qualifiedIdentExpression_return retval = new JavaParser.qualifiedIdentExpression_return();
		retval.start = input.LT(1);
		int qualifiedIdentExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token outerDot=null;
		Token Super=null;
		Token innerDot=null;
		Token DOT411=null;
		Token CLASS412=null;
		Token CLASS414=null;
		Token SUPER417=null;
		Token IDENT418=null;
		Token IDENT420=null;
		Token THIS422=null;
		ParserRuleReturnScope x =null;
		ParserRuleReturnScope arrayDeclarator410 =null;
		ParserRuleReturnScope arguments413 =null;
		ParserRuleReturnScope genericTypeArgumentListSimplified415 =null;
		ParserRuleReturnScope arguments416 =null;
		ParserRuleReturnScope arguments419 =null;
		ParserRuleReturnScope arguments421 =null;
		ParserRuleReturnScope arguments423 =null;
		ParserRuleReturnScope innerNewExpression424 =null;

		CommonTree outerDot_tree=null;
		CommonTree Super_tree=null;
		CommonTree innerDot_tree=null;
		CommonTree DOT411_tree=null;
		CommonTree CLASS412_tree=null;
		CommonTree CLASS414_tree=null;
		CommonTree SUPER417_tree=null;
		CommonTree IDENT418_tree=null;
		CommonTree IDENT420_tree=null;
		CommonTree THIS422_tree=null;
		RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
		RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
		RewriteRuleSubtreeStream stream_innerNewExpression=new RewriteRuleSubtreeStream(adaptor,"rule innerNewExpression");
		RewriteRuleSubtreeStream stream_arrayDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule arrayDeclarator");
		RewriteRuleSubtreeStream stream_genericTypeArgumentListSimplified=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeArgumentListSimplified");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
		RewriteRuleSubtreeStream stream_qualifiedIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedIdentifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// Java.g:1811:13: ( (x= qualifiedIdentifier -> qualifiedIdentifier ) ( ( arrayDeclarator -> ^( arrayDeclarator $qualifiedIdentExpression) )+ ( DOT CLASS -> ^( DOT $qualifiedIdentExpression CLASS ) ) | arguments -> ^( METHOD_CALL qualifiedIdentifier arguments ) |outerDot= DOT ( CLASS -> ^( DOT qualifiedIdentifier CLASS ) | genericTypeArgumentListSimplified (Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier genericTypeArgumentListSimplified arguments ) | SUPER innerDot= DOT IDENT arguments -> ^( METHOD_CALL ^( $innerDot ^( $outerDot qualifiedIdentifier SUPER ) IDENT ) genericTypeArgumentListSimplified arguments ) | IDENT arguments -> ^( METHOD_CALL ^( DOT qualifiedIdentifier IDENT ) genericTypeArgumentListSimplified arguments ) ) | THIS -> ^( DOT qualifiedIdentifier THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier arguments ) | innerNewExpression -> ^( DOT qualifiedIdentifier innerNewExpression ) ) )? )
			// Java.g:1811:17: (x= qualifiedIdentifier -> qualifiedIdentifier ) ( ( arrayDeclarator -> ^( arrayDeclarator $qualifiedIdentExpression) )+ ( DOT CLASS -> ^( DOT $qualifiedIdentExpression CLASS ) ) | arguments -> ^( METHOD_CALL qualifiedIdentifier arguments ) |outerDot= DOT ( CLASS -> ^( DOT qualifiedIdentifier CLASS ) | genericTypeArgumentListSimplified (Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier genericTypeArgumentListSimplified arguments ) | SUPER innerDot= DOT IDENT arguments -> ^( METHOD_CALL ^( $innerDot ^( $outerDot qualifiedIdentifier SUPER ) IDENT ) genericTypeArgumentListSimplified arguments ) | IDENT arguments -> ^( METHOD_CALL ^( DOT qualifiedIdentifier IDENT ) genericTypeArgumentListSimplified arguments ) ) | THIS -> ^( DOT qualifiedIdentifier THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier arguments ) | innerNewExpression -> ^( DOT qualifiedIdentifier innerNewExpression ) ) )?
			{
			// Java.g:1811:17: (x= qualifiedIdentifier -> qualifiedIdentifier )
			// Java.g:1811:18: x= qualifiedIdentifier
			{
			pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentExpression20889);
			x=qualifiedIdentifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_qualifiedIdentifier.add(x.getTree());
			// AST REWRITE
			// elements: qualifiedIdentifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1812:18: -> qualifiedIdentifier
			{
				adaptor.addChild(root_0, stream_qualifiedIdentifier.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// Java.g:1819:17: ( ( arrayDeclarator -> ^( arrayDeclarator $qualifiedIdentExpression) )+ ( DOT CLASS -> ^( DOT $qualifiedIdentExpression CLASS ) ) | arguments -> ^( METHOD_CALL qualifiedIdentifier arguments ) |outerDot= DOT ( CLASS -> ^( DOT qualifiedIdentifier CLASS ) | genericTypeArgumentListSimplified (Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier genericTypeArgumentListSimplified arguments ) | SUPER innerDot= DOT IDENT arguments -> ^( METHOD_CALL ^( $innerDot ^( $outerDot qualifiedIdentifier SUPER ) IDENT ) genericTypeArgumentListSimplified arguments ) | IDENT arguments -> ^( METHOD_CALL ^( DOT qualifiedIdentifier IDENT ) genericTypeArgumentListSimplified arguments ) ) | THIS -> ^( DOT qualifiedIdentifier THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier arguments ) | innerNewExpression -> ^( DOT qualifiedIdentifier innerNewExpression ) ) )?
			int alt145=4;
			switch ( input.LA(1) ) {
				case LBRACK:
					{
					int LA145_1 = input.LA(2);
					if ( (synpred221_Java()) ) {
						alt145=1;
					}
					}
					break;
				case LPAREN:
					{
					alt145=2;
					}
					break;
				case DOT:
					{
					int LA145_3 = input.LA(2);
					if ( (synpred229_Java()) ) {
						alt145=3;
					}
					}
					break;
			}
			switch (alt145) {
				case 1 :
					// Java.g:1819:21: ( arrayDeclarator -> ^( arrayDeclarator $qualifiedIdentExpression) )+ ( DOT CLASS -> ^( DOT $qualifiedIdentExpression CLASS ) )
					{
					// Java.g:1819:21: ( arrayDeclarator -> ^( arrayDeclarator $qualifiedIdentExpression) )+
					int cnt142=0;
					loop142:
					while (true) {
						int alt142=2;
						int LA142_0 = input.LA(1);
						if ( (LA142_0==LBRACK) ) {
							alt142=1;
						}

						switch (alt142) {
						case 1 :
							// Java.g:1819:25: arrayDeclarator
							{
							pushFollow(FOLLOW_arrayDeclarator_in_qualifiedIdentExpression21000);
							arrayDeclarator410=arrayDeclarator();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayDeclarator.add(arrayDeclarator410.getTree());
							// AST REWRITE
							// elements: arrayDeclarator, qualifiedIdentExpression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1820:25: -> ^( arrayDeclarator $qualifiedIdentExpression)
							{
								// Java.g:1820:29: ^( arrayDeclarator $qualifiedIdentExpression)
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_arrayDeclarator.nextNode(), root_1);
								adaptor.addChild(root_1, stream_retval.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

						default :
							if ( cnt142 >= 1 ) break loop142;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(142, input);
							throw eee;
						}
						cnt142++;
					}

					// Java.g:1822:21: ( DOT CLASS -> ^( DOT $qualifiedIdentExpression CLASS ) )
					// Java.g:1822:25: DOT CLASS
					{
					DOT411=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentExpression21109); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT411);

					CLASS412=(Token)match(input,CLASS,FOLLOW_CLASS_in_qualifiedIdentExpression21111); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CLASS.add(CLASS412);

					// AST REWRITE
					// elements: CLASS, qualifiedIdentExpression, DOT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1823:25: -> ^( DOT $qualifiedIdentExpression CLASS )
					{
						// Java.g:1823:29: ^( DOT $qualifiedIdentExpression CLASS )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_CLASS.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// Java.g:1825:19: arguments
					{
					pushFollow(FOLLOW_arguments_in_qualifiedIdentExpression21220);
					arguments413=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arguments.add(arguments413.getTree());
					// AST REWRITE
					// elements: qualifiedIdentifier, arguments
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1826:20: -> ^( METHOD_CALL qualifiedIdentifier arguments )
					{
						// Java.g:1826:24: ^( METHOD_CALL qualifiedIdentifier arguments )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_CALL, "METHOD_CALL"), root_1);
						adaptor.addChild(root_1, stream_qualifiedIdentifier.nextTree());
						adaptor.addChild(root_1, stream_arguments.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Java.g:1827:21: outerDot= DOT ( CLASS -> ^( DOT qualifiedIdentifier CLASS ) | genericTypeArgumentListSimplified (Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier genericTypeArgumentListSimplified arguments ) | SUPER innerDot= DOT IDENT arguments -> ^( METHOD_CALL ^( $innerDot ^( $outerDot qualifiedIdentifier SUPER ) IDENT ) genericTypeArgumentListSimplified arguments ) | IDENT arguments -> ^( METHOD_CALL ^( DOT qualifiedIdentifier IDENT ) genericTypeArgumentListSimplified arguments ) ) | THIS -> ^( DOT qualifiedIdentifier THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier arguments ) | innerNewExpression -> ^( DOT qualifiedIdentifier innerNewExpression ) )
					{
					outerDot=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentExpression21276); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(outerDot);

					// Java.g:1828:21: ( CLASS -> ^( DOT qualifiedIdentifier CLASS ) | genericTypeArgumentListSimplified (Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier genericTypeArgumentListSimplified arguments ) | SUPER innerDot= DOT IDENT arguments -> ^( METHOD_CALL ^( $innerDot ^( $outerDot qualifiedIdentifier SUPER ) IDENT ) genericTypeArgumentListSimplified arguments ) | IDENT arguments -> ^( METHOD_CALL ^( DOT qualifiedIdentifier IDENT ) genericTypeArgumentListSimplified arguments ) ) | THIS -> ^( DOT qualifiedIdentifier THIS ) |Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier arguments ) | innerNewExpression -> ^( DOT qualifiedIdentifier innerNewExpression ) )
					int alt144=5;
					switch ( input.LA(1) ) {
					case CLASS:
						{
						alt144=1;
						}
						break;
					case LESS_THAN:
						{
						alt144=2;
						}
						break;
					case THIS:
						{
						alt144=3;
						}
						break;
					case SUPER:
						{
						alt144=4;
						}
						break;
					case NEW:
						{
						alt144=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 144, 0, input);
						throw nvae;
					}
					switch (alt144) {
						case 1 :
							// Java.g:1828:25: CLASS
							{
							CLASS414=(Token)match(input,CLASS,FOLLOW_CLASS_in_qualifiedIdentExpression21302); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_CLASS.add(CLASS414);

							// AST REWRITE
							// elements: qualifiedIdentifier, CLASS, DOT
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1829:25: -> ^( DOT qualifiedIdentifier CLASS )
							{
								// Java.g:1829:29: ^( DOT qualifiedIdentifier CLASS )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);
								adaptor.addChild(root_1, stream_qualifiedIdentifier.nextTree());
								adaptor.addChild(root_1, stream_CLASS.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// Java.g:1830:25: genericTypeArgumentListSimplified (Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier genericTypeArgumentListSimplified arguments ) | SUPER innerDot= DOT IDENT arguments -> ^( METHOD_CALL ^( $innerDot ^( $outerDot qualifiedIdentifier SUPER ) IDENT ) genericTypeArgumentListSimplified arguments ) | IDENT arguments -> ^( METHOD_CALL ^( DOT qualifiedIdentifier IDENT ) genericTypeArgumentListSimplified arguments ) )
							{
							pushFollow(FOLLOW_genericTypeArgumentListSimplified_in_qualifiedIdentExpression21398);
							genericTypeArgumentListSimplified415=genericTypeArgumentListSimplified();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_genericTypeArgumentListSimplified.add(genericTypeArgumentListSimplified415.getTree());
							// Java.g:1831:25: (Super= SUPER arguments -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier genericTypeArgumentListSimplified arguments ) | SUPER innerDot= DOT IDENT arguments -> ^( METHOD_CALL ^( $innerDot ^( $outerDot qualifiedIdentifier SUPER ) IDENT ) genericTypeArgumentListSimplified arguments ) | IDENT arguments -> ^( METHOD_CALL ^( DOT qualifiedIdentifier IDENT ) genericTypeArgumentListSimplified arguments ) )
							int alt143=3;
							int LA143_0 = input.LA(1);
							if ( (LA143_0==SUPER) ) {
								int LA143_1 = input.LA(2);
								if ( (LA143_1==DOT) ) {
									alt143=2;
								}
								else if ( (LA143_1==LPAREN) ) {
									alt143=1;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 143, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA143_0==IDENT) ) {
								alt143=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 143, 0, input);
								throw nvae;
							}

							switch (alt143) {
								case 1 :
									// Java.g:1831:29: Super= SUPER arguments
									{
									Super=(Token)match(input,SUPER,FOLLOW_SUPER_in_qualifiedIdentExpression21431); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_SUPER.add(Super);

									pushFollow(FOLLOW_arguments_in_qualifiedIdentExpression21433);
									arguments416=arguments();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_arguments.add(arguments416.getTree());
									// AST REWRITE
									// elements: genericTypeArgumentListSimplified, qualifiedIdentifier, arguments
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 1832:29: -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier genericTypeArgumentListSimplified arguments )
									{
										// Java.g:1832:33: ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier genericTypeArgumentListSimplified arguments )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER_CONSTRUCTOR_CALL, Super, "SUPER_CONSTRUCTOR_CALL"), root_1);
										adaptor.addChild(root_1, stream_qualifiedIdentifier.nextTree());
										adaptor.addChild(root_1, stream_genericTypeArgumentListSimplified.nextTree());
										adaptor.addChild(root_1, stream_arguments.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;
								case 2 :
									// Java.g:1833:29: SUPER innerDot= DOT IDENT arguments
									{
									SUPER417=(Token)match(input,SUPER,FOLLOW_SUPER_in_qualifiedIdentExpression21520); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_SUPER.add(SUPER417);

									innerDot=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentExpression21524); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DOT.add(innerDot);

									IDENT418=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentExpression21526); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_IDENT.add(IDENT418);

									pushFollow(FOLLOW_arguments_in_qualifiedIdentExpression21528);
									arguments419=arguments();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_arguments.add(arguments419.getTree());
									// AST REWRITE
									// elements: outerDot, innerDot, IDENT, qualifiedIdentifier, SUPER, arguments, genericTypeArgumentListSimplified
									// token labels: innerDot, outerDot
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleTokenStream stream_innerDot=new RewriteRuleTokenStream(adaptor,"token innerDot",innerDot);
									RewriteRuleTokenStream stream_outerDot=new RewriteRuleTokenStream(adaptor,"token outerDot",outerDot);
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 1834:29: -> ^( METHOD_CALL ^( $innerDot ^( $outerDot qualifiedIdentifier SUPER ) IDENT ) genericTypeArgumentListSimplified arguments )
									{
										// Java.g:1834:33: ^( METHOD_CALL ^( $innerDot ^( $outerDot qualifiedIdentifier SUPER ) IDENT ) genericTypeArgumentListSimplified arguments )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_CALL, "METHOD_CALL"), root_1);
										// Java.g:1834:47: ^( $innerDot ^( $outerDot qualifiedIdentifier SUPER ) IDENT )
										{
										CommonTree root_2 = (CommonTree)adaptor.nil();
										root_2 = (CommonTree)adaptor.becomeRoot(stream_innerDot.nextNode(), root_2);
										// Java.g:1834:59: ^( $outerDot qualifiedIdentifier SUPER )
										{
										CommonTree root_3 = (CommonTree)adaptor.nil();
										root_3 = (CommonTree)adaptor.becomeRoot(stream_outerDot.nextNode(), root_3);
										adaptor.addChild(root_3, stream_qualifiedIdentifier.nextTree());
										adaptor.addChild(root_3, stream_SUPER.nextNode());
										adaptor.addChild(root_2, root_3);
										}

										adaptor.addChild(root_2, stream_IDENT.nextNode());
										adaptor.addChild(root_1, root_2);
										}

										adaptor.addChild(root_1, stream_genericTypeArgumentListSimplified.nextTree());
										adaptor.addChild(root_1, stream_arguments.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;
								case 3 :
									// Java.g:1835:29: IDENT arguments
									{
									IDENT420=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentExpression21614); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_IDENT.add(IDENT420);

									pushFollow(FOLLOW_arguments_in_qualifiedIdentExpression21616);
									arguments421=arguments();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_arguments.add(arguments421.getTree());
									// AST REWRITE
									// elements: IDENT, DOT, qualifiedIdentifier, genericTypeArgumentListSimplified, arguments
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 1836:29: -> ^( METHOD_CALL ^( DOT qualifiedIdentifier IDENT ) genericTypeArgumentListSimplified arguments )
									{
										// Java.g:1836:33: ^( METHOD_CALL ^( DOT qualifiedIdentifier IDENT ) genericTypeArgumentListSimplified arguments )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_CALL, "METHOD_CALL"), root_1);
										// Java.g:1836:47: ^( DOT qualifiedIdentifier IDENT )
										{
										CommonTree root_2 = (CommonTree)adaptor.nil();
										root_2 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_2);
										adaptor.addChild(root_2, stream_qualifiedIdentifier.nextTree());
										adaptor.addChild(root_2, stream_IDENT.nextNode());
										adaptor.addChild(root_1, root_2);
										}

										adaptor.addChild(root_1, stream_genericTypeArgumentListSimplified.nextTree());
										adaptor.addChild(root_1, stream_arguments.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;
									}

									}
									break;

							}

							}
							break;
						case 3 :
							// Java.g:1838:25: THIS
							{
							THIS422=(Token)match(input,THIS,FOLLOW_THIS_in_qualifiedIdentExpression21716); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_THIS.add(THIS422);

							// AST REWRITE
							// elements: THIS, DOT, qualifiedIdentifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1839:25: -> ^( DOT qualifiedIdentifier THIS )
							{
								// Java.g:1839:29: ^( DOT qualifiedIdentifier THIS )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);
								adaptor.addChild(root_1, stream_qualifiedIdentifier.nextTree());
								adaptor.addChild(root_1, stream_THIS.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 4 :
							// Java.g:1840:25: Super= SUPER arguments
							{
							Super=(Token)match(input,SUPER,FOLLOW_SUPER_in_qualifiedIdentExpression21779); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SUPER.add(Super);

							pushFollow(FOLLOW_arguments_in_qualifiedIdentExpression21781);
							arguments423=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(arguments423.getTree());
							// AST REWRITE
							// elements: qualifiedIdentifier, arguments
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1841:25: -> ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier arguments )
							{
								// Java.g:1841:29: ^( SUPER_CONSTRUCTOR_CALL[$Super, \"SUPER_CONSTRUCTOR_CALL\"] qualifiedIdentifier arguments )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER_CONSTRUCTOR_CALL, Super, "SUPER_CONSTRUCTOR_CALL"), root_1);
								adaptor.addChild(root_1, stream_qualifiedIdentifier.nextTree());
								adaptor.addChild(root_1, stream_arguments.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 5 :
							// Java.g:1842:25: innerNewExpression
							{
							pushFollow(FOLLOW_innerNewExpression_in_qualifiedIdentExpression21843);
							innerNewExpression424=innerNewExpression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_innerNewExpression.add(innerNewExpression424.getTree());
							// AST REWRITE
							// elements: DOT, innerNewExpression, qualifiedIdentifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1843:25: -> ^( DOT qualifiedIdentifier innerNewExpression )
							{
								// Java.g:1843:29: ^( DOT qualifiedIdentifier innerNewExpression )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);
								adaptor.addChild(root_1, stream_qualifiedIdentifier.nextTree());
								adaptor.addChild(root_1, stream_innerNewExpression.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 107, qualifiedIdentExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "qualifiedIdentExpression"


	public static class newExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "newExpression"
	// Java.g:1848:1: newExpression : NEW ( primitiveType newArrayConstruction -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] primitiveType newArrayConstruction ) | ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified ( newArrayConstruction -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified newArrayConstruction ) | arguments ( classBody )? -> ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified arguments ( classBody )? ) ) ) ;
	public final JavaParser.newExpression_return newExpression() throws RecognitionException {
		JavaParser.newExpression_return retval = new JavaParser.newExpression_return();
		retval.start = input.LT(1);
		int newExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NEW425=null;
		ParserRuleReturnScope primitiveType426 =null;
		ParserRuleReturnScope newArrayConstruction427 =null;
		ParserRuleReturnScope genericTypeArgumentListSimplified428 =null;
		ParserRuleReturnScope qualifiedTypeIdentSimplified429 =null;
		ParserRuleReturnScope newArrayConstruction430 =null;
		ParserRuleReturnScope arguments431 =null;
		ParserRuleReturnScope classBody432 =null;

		CommonTree NEW425_tree=null;
		RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
		RewriteRuleSubtreeStream stream_newArrayConstruction=new RewriteRuleSubtreeStream(adaptor,"rule newArrayConstruction");
		RewriteRuleSubtreeStream stream_genericTypeArgumentListSimplified=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeArgumentListSimplified");
		RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
		RewriteRuleSubtreeStream stream_qualifiedTypeIdentSimplified=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedTypeIdentSimplified");
		RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// Java.g:1849:13: ( NEW ( primitiveType newArrayConstruction -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] primitiveType newArrayConstruction ) | ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified ( newArrayConstruction -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified newArrayConstruction ) | arguments ( classBody )? -> ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified arguments ( classBody )? ) ) ) )
			// Java.g:1849:17: NEW ( primitiveType newArrayConstruction -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] primitiveType newArrayConstruction ) | ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified ( newArrayConstruction -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified newArrayConstruction ) | arguments ( classBody )? -> ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified arguments ( classBody )? ) ) )
			{
			NEW425=(Token)match(input,NEW,FOLLOW_NEW_in_newExpression21963); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NEW.add(NEW425);

			// Java.g:1850:17: ( primitiveType newArrayConstruction -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] primitiveType newArrayConstruction ) | ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified ( newArrayConstruction -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified newArrayConstruction ) | arguments ( classBody )? -> ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified arguments ( classBody )? ) ) )
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==BOOLEAN||LA149_0==BYTE||LA149_0==CHAR||LA149_0==DOUBLE||LA149_0==FLOAT||LA149_0==INT||LA149_0==LONG||LA149_0==SHORT) ) {
				alt149=1;
			}
			else if ( (LA149_0==IDENT||LA149_0==LESS_THAN) ) {
				alt149=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 149, 0, input);
				throw nvae;
			}

			switch (alt149) {
				case 1 :
					// Java.g:1850:21: primitiveType newArrayConstruction
					{
					pushFollow(FOLLOW_primitiveType_in_newExpression21987);
					primitiveType426=primitiveType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType426.getTree());
					pushFollow(FOLLOW_newArrayConstruction_in_newExpression21989);
					newArrayConstruction427=newArrayConstruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_newArrayConstruction.add(newArrayConstruction427.getTree());
					// AST REWRITE
					// elements: primitiveType, newArrayConstruction
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1851:21: -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] primitiveType newArrayConstruction )
					{
						// Java.g:1851:25: ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] primitiveType newArrayConstruction )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATIC_ARRAY_CREATOR, NEW425, "STATIC_ARRAY_CREATOR"), root_1);
						adaptor.addChild(root_1, stream_primitiveType.nextTree());
						adaptor.addChild(root_1, stream_newArrayConstruction.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Java.g:1852:21: ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified ( newArrayConstruction -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified newArrayConstruction ) | arguments ( classBody )? -> ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified arguments ( classBody )? ) )
					{
					// Java.g:1852:21: ( genericTypeArgumentListSimplified )?
					int alt146=2;
					int LA146_0 = input.LA(1);
					if ( (LA146_0==LESS_THAN) ) {
						alt146=1;
					}
					switch (alt146) {
						case 1 :
							// Java.g:1852:21: genericTypeArgumentListSimplified
							{
							pushFollow(FOLLOW_genericTypeArgumentListSimplified_in_newExpression22049);
							genericTypeArgumentListSimplified428=genericTypeArgumentListSimplified();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_genericTypeArgumentListSimplified.add(genericTypeArgumentListSimplified428.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_qualifiedTypeIdentSimplified_in_newExpression22052);
					qualifiedTypeIdentSimplified429=qualifiedTypeIdentSimplified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_qualifiedTypeIdentSimplified.add(qualifiedTypeIdentSimplified429.getTree());
					// Java.g:1853:21: ( newArrayConstruction -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified newArrayConstruction ) | arguments ( classBody )? -> ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified arguments ( classBody )? ) )
					int alt148=2;
					int LA148_0 = input.LA(1);
					if ( (LA148_0==LBRACK) ) {
						alt148=1;
					}
					else if ( (LA148_0==LPAREN) ) {
						alt148=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 148, 0, input);
						throw nvae;
					}

					switch (alt148) {
						case 1 :
							// Java.g:1853:25: newArrayConstruction
							{
							pushFollow(FOLLOW_newArrayConstruction_in_newExpression22078);
							newArrayConstruction430=newArrayConstruction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_newArrayConstruction.add(newArrayConstruction430.getTree());
							// AST REWRITE
							// elements: genericTypeArgumentListSimplified, qualifiedTypeIdentSimplified, newArrayConstruction
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1854:25: -> ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified newArrayConstruction )
							{
								// Java.g:1854:29: ^( STATIC_ARRAY_CREATOR[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified newArrayConstruction )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATIC_ARRAY_CREATOR, NEW425, "STATIC_ARRAY_CREATOR"), root_1);
								// Java.g:1854:82: ( genericTypeArgumentListSimplified )?
								if ( stream_genericTypeArgumentListSimplified.hasNext() ) {
									adaptor.addChild(root_1, stream_genericTypeArgumentListSimplified.nextTree());
								}
								stream_genericTypeArgumentListSimplified.reset();

								adaptor.addChild(root_1, stream_qualifiedTypeIdentSimplified.nextTree());
								adaptor.addChild(root_1, stream_newArrayConstruction.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// Java.g:1855:25: arguments ( classBody )?
							{
							pushFollow(FOLLOW_arguments_in_newExpression22159);
							arguments431=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(arguments431.getTree());
							// Java.g:1855:35: ( classBody )?
							int alt147=2;
							int LA147_0 = input.LA(1);
							if ( (LA147_0==LCURLY) ) {
								alt147=1;
							}
							switch (alt147) {
								case 1 :
									// Java.g:1855:35: classBody
									{
									pushFollow(FOLLOW_classBody_in_newExpression22161);
									classBody432=classBody();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_classBody.add(classBody432.getTree());
									}
									break;

							}

							// AST REWRITE
							// elements: qualifiedTypeIdentSimplified, classBody, genericTypeArgumentListSimplified, arguments
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 1856:25: -> ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified arguments ( classBody )? )
							{
								// Java.g:1856:29: ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? qualifiedTypeIdentSimplified arguments ( classBody )? )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS_CONSTRUCTOR_CALL, NEW425, "STATIC_ARRAY_CREATOR"), root_1);
								// Java.g:1856:84: ( genericTypeArgumentListSimplified )?
								if ( stream_genericTypeArgumentListSimplified.hasNext() ) {
									adaptor.addChild(root_1, stream_genericTypeArgumentListSimplified.nextTree());
								}
								stream_genericTypeArgumentListSimplified.reset();

								adaptor.addChild(root_1, stream_qualifiedTypeIdentSimplified.nextTree());
								adaptor.addChild(root_1, stream_arguments.nextTree());
								// Java.g:1856:158: ( classBody )?
								if ( stream_classBody.hasNext() ) {
									adaptor.addChild(root_1, stream_classBody.nextTree());
								}
								stream_classBody.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 108, newExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newExpression"


	public static class innerNewExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "innerNewExpression"
	// Java.g:1861:9: innerNewExpression : NEW ( genericTypeArgumentListSimplified )? IDENT arguments ( classBody )? -> ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? IDENT arguments ( classBody )? ) ;
	public final JavaParser.innerNewExpression_return innerNewExpression() throws RecognitionException {
		JavaParser.innerNewExpression_return retval = new JavaParser.innerNewExpression_return();
		retval.start = input.LT(1);
		int innerNewExpression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NEW433=null;
		Token IDENT435=null;
		ParserRuleReturnScope genericTypeArgumentListSimplified434 =null;
		ParserRuleReturnScope arguments436 =null;
		ParserRuleReturnScope classBody437 =null;

		CommonTree NEW433_tree=null;
		CommonTree IDENT435_tree=null;
		RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleSubtreeStream stream_genericTypeArgumentListSimplified=new RewriteRuleSubtreeStream(adaptor,"rule genericTypeArgumentListSimplified");
		RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// Java.g:1862:13: ( NEW ( genericTypeArgumentListSimplified )? IDENT arguments ( classBody )? -> ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? IDENT arguments ( classBody )? ) )
			// Java.g:1862:17: NEW ( genericTypeArgumentListSimplified )? IDENT arguments ( classBody )?
			{
			NEW433=(Token)match(input,NEW,FOLLOW_NEW_in_innerNewExpression22316); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NEW.add(NEW433);

			// Java.g:1862:21: ( genericTypeArgumentListSimplified )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==LESS_THAN) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// Java.g:1862:21: genericTypeArgumentListSimplified
					{
					pushFollow(FOLLOW_genericTypeArgumentListSimplified_in_innerNewExpression22318);
					genericTypeArgumentListSimplified434=genericTypeArgumentListSimplified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_genericTypeArgumentListSimplified.add(genericTypeArgumentListSimplified434.getTree());
					}
					break;

			}

			IDENT435=(Token)match(input,IDENT,FOLLOW_IDENT_in_innerNewExpression22321); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT435);

			pushFollow(FOLLOW_arguments_in_innerNewExpression22323);
			arguments436=arguments();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_arguments.add(arguments436.getTree());
			// Java.g:1862:72: ( classBody )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==LCURLY) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// Java.g:1862:72: classBody
					{
					pushFollow(FOLLOW_classBody_in_innerNewExpression22325);
					classBody437=classBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classBody.add(classBody437.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IDENT, classBody, genericTypeArgumentListSimplified, arguments
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1863:17: -> ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? IDENT arguments ( classBody )? )
			{
				// Java.g:1863:21: ^( CLASS_CONSTRUCTOR_CALL[$NEW, \"STATIC_ARRAY_CREATOR\"] ( genericTypeArgumentListSimplified )? IDENT arguments ( classBody )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS_CONSTRUCTOR_CALL, NEW433, "STATIC_ARRAY_CREATOR"), root_1);
				// Java.g:1863:76: ( genericTypeArgumentListSimplified )?
				if ( stream_genericTypeArgumentListSimplified.hasNext() ) {
					adaptor.addChild(root_1, stream_genericTypeArgumentListSimplified.nextTree());
				}
				stream_genericTypeArgumentListSimplified.reset();

				adaptor.addChild(root_1, stream_IDENT.nextNode());
				adaptor.addChild(root_1, stream_arguments.nextTree());
				// Java.g:1863:127: ( classBody )?
				if ( stream_classBody.hasNext() ) {
					adaptor.addChild(root_1, stream_classBody.nextTree());
				}
				stream_classBody.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 109, innerNewExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "innerNewExpression"


	public static class newArrayConstruction_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "newArrayConstruction"
	// Java.g:1866:1: newArrayConstruction : ( arrayDeclaratorList arrayInitializer | LBRACK ! expression RBRACK ! ( LBRACK ! expression RBRACK !)* ( arrayDeclaratorList )? );
	public final JavaParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException {
		JavaParser.newArrayConstruction_return retval = new JavaParser.newArrayConstruction_return();
		retval.start = input.LT(1);
		int newArrayConstruction_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LBRACK440=null;
		Token RBRACK442=null;
		Token LBRACK443=null;
		Token RBRACK445=null;
		ParserRuleReturnScope arrayDeclaratorList438 =null;
		ParserRuleReturnScope arrayInitializer439 =null;
		ParserRuleReturnScope expression441 =null;
		ParserRuleReturnScope expression444 =null;
		ParserRuleReturnScope arrayDeclaratorList446 =null;

		CommonTree LBRACK440_tree=null;
		CommonTree RBRACK442_tree=null;
		CommonTree LBRACK443_tree=null;
		CommonTree RBRACK445_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// Java.g:1867:13: ( arrayDeclaratorList arrayInitializer | LBRACK ! expression RBRACK ! ( LBRACK ! expression RBRACK !)* ( arrayDeclaratorList )? )
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==LBRACK) ) {
				int LA154_1 = input.LA(2);
				if ( (LA154_1==RBRACK) ) {
					alt154=1;
				}
				else if ( (LA154_1==BOOLEAN||LA154_1==BYTE||(LA154_1 >= CHAR && LA154_1 <= CHARACTER_LITERAL)||(LA154_1 >= DEC && LA154_1 <= DECIMAL_LITERAL)||LA154_1==DOUBLE||LA154_1==FALSE||(LA154_1 >= FLOAT && LA154_1 <= FLOATING_POINT_LITERAL)||(LA154_1 >= HEX_LITERAL && LA154_1 <= IDENT)||LA154_1==INC||LA154_1==INT||LA154_1==LESS_THAN||LA154_1==LOGICAL_NOT||(LA154_1 >= LONG && LA154_1 <= LPAREN)||LA154_1==MINUS||(LA154_1 >= NEW && LA154_1 <= NOT)||LA154_1==NULL||LA154_1==OCTAL_LITERAL||LA154_1==PLUS||LA154_1==SHORT||(LA154_1 >= STRING_LITERAL && LA154_1 <= SUPER)||LA154_1==THIS||LA154_1==TRUE||LA154_1==VOID) ) {
					alt154=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 154, 0, input);
				throw nvae;
			}

			switch (alt154) {
				case 1 :
					// Java.g:1867:17: arrayDeclaratorList arrayInitializer
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction22403);
					arrayDeclaratorList438=arrayDeclaratorList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayDeclaratorList438.getTree());

					pushFollow(FOLLOW_arrayInitializer_in_newArrayConstruction22405);
					arrayInitializer439=arrayInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer439.getTree());

					}
					break;
				case 2 :
					// Java.g:1868:17: LBRACK ! expression RBRACK ! ( LBRACK ! expression RBRACK !)* ( arrayDeclaratorList )?
					{
					root_0 = (CommonTree)adaptor.nil();


					LBRACK440=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_newArrayConstruction22423); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_newArrayConstruction22426);
					expression441=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression441.getTree());

					RBRACK442=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_newArrayConstruction22428); if (state.failed) return retval;
					// Java.g:1868:44: ( LBRACK ! expression RBRACK !)*
					loop152:
					while (true) {
						int alt152=2;
						int LA152_0 = input.LA(1);
						if ( (LA152_0==LBRACK) ) {
							int LA152_1 = input.LA(2);
							if ( (synpred237_Java()) ) {
								alt152=1;
							}

						}

						switch (alt152) {
						case 1 :
							// Java.g:1868:45: LBRACK ! expression RBRACK !
							{
							LBRACK443=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_newArrayConstruction22432); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_newArrayConstruction22435);
							expression444=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression444.getTree());

							RBRACK445=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_newArrayConstruction22437); if (state.failed) return retval;
							}
							break;

						default :
							break loop152;
						}
					}

					// Java.g:1868:74: ( arrayDeclaratorList )?
					int alt153=2;
					int LA153_0 = input.LA(1);
					if ( (LA153_0==LBRACK) ) {
						int LA153_1 = input.LA(2);
						if ( (LA153_1==RBRACK) ) {
							alt153=1;
						}
					}
					switch (alt153) {
						case 1 :
							// Java.g:1868:74: arrayDeclaratorList
							{
							pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction22442);
							arrayDeclaratorList446=arrayDeclaratorList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayDeclaratorList446.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 110, newArrayConstruction_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newArrayConstruction"


	public static class arguments_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arguments"
	// Java.g:1871:1: arguments : LPAREN ( expressionList )? RPAREN -> ^( ARGUMENT_LIST[$LPAREN, \"ARGUMENT_LIST\"] ( expressionList )? ) ;
	public final JavaParser.arguments_return arguments() throws RecognitionException {
		JavaParser.arguments_return retval = new JavaParser.arguments_return();
		retval.start = input.LT(1);
		int arguments_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LPAREN447=null;
		Token RPAREN449=null;
		ParserRuleReturnScope expressionList448 =null;

		CommonTree LPAREN447_tree=null;
		CommonTree RPAREN449_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// Java.g:1872:13: ( LPAREN ( expressionList )? RPAREN -> ^( ARGUMENT_LIST[$LPAREN, \"ARGUMENT_LIST\"] ( expressionList )? ) )
			// Java.g:1872:17: LPAREN ( expressionList )? RPAREN
			{
			LPAREN447=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments22486); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN447);

			if ( state.backtracking==0 ) {
			                        if(methodCall)
			                        {
			                                //System.out.println("method call");
			                                tokens.insertAfter(LPAREN447,metaVarStack.peek()+",");
			                                methodCall = false;
			                        }
			                }
			// Java.g:1881:17: ( expressionList )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==BOOLEAN||LA155_0==BYTE||(LA155_0 >= CHAR && LA155_0 <= CHARACTER_LITERAL)||(LA155_0 >= DEC && LA155_0 <= DECIMAL_LITERAL)||LA155_0==DOUBLE||LA155_0==FALSE||(LA155_0 >= FLOAT && LA155_0 <= FLOATING_POINT_LITERAL)||(LA155_0 >= HEX_LITERAL && LA155_0 <= IDENT)||LA155_0==INC||LA155_0==INT||LA155_0==LESS_THAN||LA155_0==LOGICAL_NOT||(LA155_0 >= LONG && LA155_0 <= LPAREN)||LA155_0==MINUS||(LA155_0 >= NEW && LA155_0 <= NOT)||LA155_0==NULL||LA155_0==OCTAL_LITERAL||LA155_0==PLUS||LA155_0==SHORT||(LA155_0 >= STRING_LITERAL && LA155_0 <= SUPER)||LA155_0==THIS||LA155_0==TRUE||LA155_0==VOID) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// Java.g:1881:17: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_arguments22523);
					expressionList448=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList448.getTree());
					}
					break;

			}

			RPAREN449=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments22527); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN449);

			// AST REWRITE
			// elements: expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1882:17: -> ^( ARGUMENT_LIST[$LPAREN, \"ARGUMENT_LIST\"] ( expressionList )? )
			{
				// Java.g:1882:21: ^( ARGUMENT_LIST[$LPAREN, \"ARGUMENT_LIST\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT_LIST, LPAREN447, "ARGUMENT_LIST"), root_1);
				// Java.g:1882:63: ( expressionList )?
				if ( stream_expressionList.hasNext() ) {
					adaptor.addChild(root_1, stream_expressionList.nextTree());
				}
				stream_expressionList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 111, arguments_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arguments"


	public static class literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// Java.g:1885:1: literal : q= ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL ) ;
	public final JavaParser.literal_return literal() throws RecognitionException {
		JavaParser.literal_return retval = new JavaParser.literal_return();
		retval.start = input.LT(1);
		int literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token q=null;

		CommonTree q_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// Java.g:1886:13: (q= ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL ) )
			// Java.g:1886:15: q= ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL )
			{
			root_0 = (CommonTree)adaptor.nil();


			q=input.LT(1);
			if ( input.LA(1)==CHARACTER_LITERAL||input.LA(1)==DECIMAL_LITERAL||input.LA(1)==FALSE||input.LA(1)==FLOATING_POINT_LITERAL||input.LA(1)==HEX_LITERAL||input.LA(1)==NULL||input.LA(1)==OCTAL_LITERAL||input.LA(1)==STRING_LITERAL||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(q));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) {/*-----*/ // Generate a new polyverse literal for a literal
			    String classType = "BAD CLASS";
			    switch ((q!=null?q.getType():0)) {
			      case HEX_LITERAL: classType = "Hex"; break;
			      case OCTAL_LITERAL: classType = "Octal"; break;
			      case DECIMAL_LITERAL: classType = "Integer"; break;
			      case FLOATING_POINT_LITERAL: classType = "FloatingPoint"; break;
			      case CHARACTER_LITERAL: classType = "Character"; break;
			      case STRING_LITERAL: classType = "String"; break;
			      case TRUE: classType = "Boolean"; break;
			      case FALSE: classType = "Boolean"; break;
			      case NULL: classType = "Null"; break;
			      default: System.err.println("Bad literal in parser"); System.exit(-1);
			    }
			    tokens.replace(q, "new polyverse.scalar.Polyverse" + classType + "(" + vtop() + "," + (q!=null?q.getText():null) + ")");
			  /*-----*/}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 112, literal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "literal"

	// $ANTLR start synpred16_Java
	public final void synpred16_Java_fragment() throws RecognitionException {
		// Java.g:519:17: ( GREATER_THAN )
		// Java.g:519:17: GREATER_THAN
		{
		match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_synpred16_Java7162); if (state.failed) return;

		}

	}
	// $ANTLR end synpred16_Java

	// $ANTLR start synpred17_Java
	public final void synpred17_Java_fragment() throws RecognitionException {
		// Java.g:520:17: ( SHIFT_RIGHT )
		// Java.g:520:17: SHIFT_RIGHT
		{
		match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_synpred17_Java7180); if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_Java

	// $ANTLR start synpred18_Java
	public final void synpred18_Java_fragment() throws RecognitionException {
		// Java.g:521:17: ( BIT_SHIFT_RIGHT )
		// Java.g:521:17: BIT_SHIFT_RIGHT
		{
		match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_synpred18_Java7198); if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_Java

	// $ANTLR start synpred19_Java
	public final void synpred19_Java_fragment() throws RecognitionException {
		// Java.g:526:21: ( bound )
		// Java.g:526:21: bound
		{
		pushFollow(FOLLOW_bound_in_synpred19_Java7259);
		bound();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_Java

	// $ANTLR start synpred34_Java
	public final void synpred34_Java_fragment() throws RecognitionException {
		// Java.g:597:17: ( STATIC block )
		// Java.g:597:17: STATIC block
		{
		match(input,STATIC,FOLLOW_STATIC_in_synpred34_Java8213); if (state.failed) return;

		pushFollow(FOLLOW_block_in_synpred34_Java8215);
		block();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred34_Java

	// $ANTLR start synpred44_Java
	public final void synpred44_Java_fragment() throws RecognitionException {
		Token id=null;
		ParserRuleReturnScope q =null;


		// Java.g:599:21: ( ( genericTypeParameterList )? (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) |id= IDENT formalParameterList ( throwsClause )? block ) )
		// Java.g:599:21: ( genericTypeParameterList )? (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) |id= IDENT formalParameterList ( throwsClause )? block )
		{
		// Java.g:599:21: ( genericTypeParameterList )?
		int alt161=2;
		int LA161_0 = input.LA(1);
		if ( (LA161_0==LESS_THAN) ) {
			alt161=1;
		}
		switch (alt161) {
			case 1 :
				// Java.g:599:21: genericTypeParameterList
				{
				pushFollow(FOLLOW_genericTypeParameterList_in_synpred44_Java8268);
				genericTypeParameterList();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		// Java.g:600:21: (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) |id= IDENT formalParameterList ( throwsClause )? block )
		int alt168=3;
		switch ( input.LA(1) ) {
		case BOOLEAN:
		case BYTE:
		case CHAR:
		case DOUBLE:
		case FLOAT:
		case INT:
		case LONG:
		case SHORT:
			{
			alt168=1;
			}
			break;
		case IDENT:
			{
			int LA168_2 = input.LA(2);
			if ( (LA168_2==DOT||LA168_2==IDENT||LA168_2==LBRACK||LA168_2==LESS_THAN) ) {
				alt168=1;
			}
			else if ( (LA168_2==LPAREN) ) {
				alt168=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 168, 2, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case VOID:
			{
			alt168=2;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 168, 0, input);
			throw nvae;
		}
		switch (alt168) {
			case 1 :
				// Java.g:600:25: q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI )
				{
				pushFollow(FOLLOW_type_in_synpred44_Java8297);
				q=type();
				state._fsp--;
				if (state.failed) return;

				match(input,IDENT,FOLLOW_IDENT_in_synpred44_Java8329); if (state.failed) return;

				pushFollow(FOLLOW_formalParameterList_in_synpred44_Java8331);
				formalParameterList();
				state._fsp--;
				if (state.failed) return;

				// Java.g:604:51: ( arrayDeclaratorList )?
				int alt162=2;
				int LA162_0 = input.LA(1);
				if ( (LA162_0==LBRACK) ) {
					alt162=1;
				}
				switch (alt162) {
					case 1 :
						// Java.g:604:51: arrayDeclaratorList
						{
						pushFollow(FOLLOW_arrayDeclaratorList_in_synpred44_Java8333);
						arrayDeclaratorList();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				// Java.g:604:72: ( throwsClause )?
				int alt163=2;
				int LA163_0 = input.LA(1);
				if ( (LA163_0==THROWS) ) {
					alt163=1;
				}
				switch (alt163) {
					case 1 :
						// Java.g:604:72: throwsClause
						{
						pushFollow(FOLLOW_throwsClause_in_synpred44_Java8336);
						throwsClause();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				// Java.g:604:86: ( block | SEMI )
				int alt164=2;
				int LA164_0 = input.LA(1);
				if ( (LA164_0==LCURLY) ) {
					alt164=1;
				}
				else if ( (LA164_0==SEMI) ) {
					alt164=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					NoViableAltException nvae =
						new NoViableAltException("", 164, 0, input);
					throw nvae;
				}

				switch (alt164) {
					case 1 :
						// Java.g:604:87: block
						{
						pushFollow(FOLLOW_block_in_synpred44_Java8340);
						block();
						state._fsp--;
						if (state.failed) return;

						}
						break;
					case 2 :
						// Java.g:604:95: SEMI
						{
						match(input,SEMI,FOLLOW_SEMI_in_synpred44_Java8344); if (state.failed) return;

						}
						break;

				}

				}
				break;
			case 2 :
				// Java.g:609:25: VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI )
				{
				match(input,VOID,FOLLOW_VOID_in_synpred44_Java8427); if (state.failed) return;

				match(input,IDENT,FOLLOW_IDENT_in_synpred44_Java8429); if (state.failed) return;

				pushFollow(FOLLOW_formalParameterList_in_synpred44_Java8431);
				formalParameterList();
				state._fsp--;
				if (state.failed) return;

				// Java.g:609:56: ( throwsClause )?
				int alt165=2;
				int LA165_0 = input.LA(1);
				if ( (LA165_0==THROWS) ) {
					alt165=1;
				}
				switch (alt165) {
					case 1 :
						// Java.g:609:56: throwsClause
						{
						pushFollow(FOLLOW_throwsClause_in_synpred44_Java8433);
						throwsClause();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				// Java.g:609:70: ( block | SEMI )
				int alt166=2;
				int LA166_0 = input.LA(1);
				if ( (LA166_0==LCURLY) ) {
					alt166=1;
				}
				else if ( (LA166_0==SEMI) ) {
					alt166=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					NoViableAltException nvae =
						new NoViableAltException("", 166, 0, input);
					throw nvae;
				}

				switch (alt166) {
					case 1 :
						// Java.g:609:71: block
						{
						pushFollow(FOLLOW_block_in_synpred44_Java8437);
						block();
						state._fsp--;
						if (state.failed) return;

						}
						break;
					case 2 :
						// Java.g:609:79: SEMI
						{
						match(input,SEMI,FOLLOW_SEMI_in_synpred44_Java8441); if (state.failed) return;

						}
						break;

				}

				}
				break;
			case 3 :
				// Java.g:611:25: id= IDENT formalParameterList ( throwsClause )? block
				{
				id=(Token)match(input,IDENT,FOLLOW_IDENT_in_synpred44_Java8516); if (state.failed) return;

				pushFollow(FOLLOW_formalParameterList_in_synpred44_Java8518);
				formalParameterList();
				state._fsp--;
				if (state.failed) return;

				// Java.g:611:54: ( throwsClause )?
				int alt167=2;
				int LA167_0 = input.LA(1);
				if ( (LA167_0==THROWS) ) {
					alt167=1;
				}
				switch (alt167) {
					case 1 :
						// Java.g:611:54: throwsClause
						{
						pushFollow(FOLLOW_throwsClause_in_synpred44_Java8520);
						throwsClause();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				pushFollow(FOLLOW_block_in_synpred44_Java8523);
				block();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred44_Java

	// $ANTLR start synpred45_Java
	public final void synpred45_Java_fragment() throws RecognitionException {
		Token id=null;
		ParserRuleReturnScope q =null;


		// Java.g:598:17: ( modifierList ( ( genericTypeParameterList )? (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) |id= IDENT formalParameterList ( throwsClause )? block ) | type classFieldDeclaratorList SEMI ) )
		// Java.g:598:17: modifierList ( ( genericTypeParameterList )? (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) |id= IDENT formalParameterList ( throwsClause )? block ) | type classFieldDeclaratorList SEMI )
		{
		pushFollow(FOLLOW_modifierList_in_synpred45_Java8246);
		modifierList();
		state._fsp--;
		if (state.failed) return;

		// Java.g:599:17: ( ( genericTypeParameterList )? (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) |id= IDENT formalParameterList ( throwsClause )? block ) | type classFieldDeclaratorList SEMI )
		int alt177=2;
		switch ( input.LA(1) ) {
		case LESS_THAN:
		case VOID:
			{
			alt177=1;
			}
			break;
		case BOOLEAN:
			{
			int LA177_2 = input.LA(2);
			if ( (synpred44_Java()) ) {
				alt177=1;
			}
			else if ( (true) ) {
				alt177=2;
			}

			}
			break;
		case CHAR:
			{
			int LA177_3 = input.LA(2);
			if ( (synpred44_Java()) ) {
				alt177=1;
			}
			else if ( (true) ) {
				alt177=2;
			}

			}
			break;
		case BYTE:
			{
			int LA177_4 = input.LA(2);
			if ( (synpred44_Java()) ) {
				alt177=1;
			}
			else if ( (true) ) {
				alt177=2;
			}

			}
			break;
		case SHORT:
			{
			int LA177_5 = input.LA(2);
			if ( (synpred44_Java()) ) {
				alt177=1;
			}
			else if ( (true) ) {
				alt177=2;
			}

			}
			break;
		case INT:
			{
			int LA177_6 = input.LA(2);
			if ( (synpred44_Java()) ) {
				alt177=1;
			}
			else if ( (true) ) {
				alt177=2;
			}

			}
			break;
		case LONG:
			{
			int LA177_7 = input.LA(2);
			if ( (synpred44_Java()) ) {
				alt177=1;
			}
			else if ( (true) ) {
				alt177=2;
			}

			}
			break;
		case FLOAT:
			{
			int LA177_8 = input.LA(2);
			if ( (synpred44_Java()) ) {
				alt177=1;
			}
			else if ( (true) ) {
				alt177=2;
			}

			}
			break;
		case DOUBLE:
			{
			int LA177_9 = input.LA(2);
			if ( (synpred44_Java()) ) {
				alt177=1;
			}
			else if ( (true) ) {
				alt177=2;
			}

			}
			break;
		case IDENT:
			{
			int LA177_10 = input.LA(2);
			if ( (synpred44_Java()) ) {
				alt177=1;
			}
			else if ( (true) ) {
				alt177=2;
			}

			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 177, 0, input);
			throw nvae;
		}
		switch (alt177) {
			case 1 :
				// Java.g:599:21: ( genericTypeParameterList )? (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) |id= IDENT formalParameterList ( throwsClause )? block )
				{
				// Java.g:599:21: ( genericTypeParameterList )?
				int alt169=2;
				int LA169_0 = input.LA(1);
				if ( (LA169_0==LESS_THAN) ) {
					alt169=1;
				}
				switch (alt169) {
					case 1 :
						// Java.g:599:21: genericTypeParameterList
						{
						pushFollow(FOLLOW_genericTypeParameterList_in_synpred45_Java8268);
						genericTypeParameterList();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				// Java.g:600:21: (q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI ) | VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI ) |id= IDENT formalParameterList ( throwsClause )? block )
				int alt176=3;
				switch ( input.LA(1) ) {
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
					{
					alt176=1;
					}
					break;
				case IDENT:
					{
					int LA176_2 = input.LA(2);
					if ( (LA176_2==DOT||LA176_2==IDENT||LA176_2==LBRACK||LA176_2==LESS_THAN) ) {
						alt176=1;
					}
					else if ( (LA176_2==LPAREN) ) {
						alt176=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 176, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case VOID:
					{
					alt176=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					NoViableAltException nvae =
						new NoViableAltException("", 176, 0, input);
					throw nvae;
				}
				switch (alt176) {
					case 1 :
						// Java.g:600:25: q= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block | SEMI )
						{
						pushFollow(FOLLOW_type_in_synpred45_Java8297);
						q=type();
						state._fsp--;
						if (state.failed) return;

						match(input,IDENT,FOLLOW_IDENT_in_synpred45_Java8329); if (state.failed) return;

						pushFollow(FOLLOW_formalParameterList_in_synpred45_Java8331);
						formalParameterList();
						state._fsp--;
						if (state.failed) return;

						// Java.g:604:51: ( arrayDeclaratorList )?
						int alt170=2;
						int LA170_0 = input.LA(1);
						if ( (LA170_0==LBRACK) ) {
							alt170=1;
						}
						switch (alt170) {
							case 1 :
								// Java.g:604:51: arrayDeclaratorList
								{
								pushFollow(FOLLOW_arrayDeclaratorList_in_synpred45_Java8333);
								arrayDeclaratorList();
								state._fsp--;
								if (state.failed) return;

								}
								break;

						}

						// Java.g:604:72: ( throwsClause )?
						int alt171=2;
						int LA171_0 = input.LA(1);
						if ( (LA171_0==THROWS) ) {
							alt171=1;
						}
						switch (alt171) {
							case 1 :
								// Java.g:604:72: throwsClause
								{
								pushFollow(FOLLOW_throwsClause_in_synpred45_Java8336);
								throwsClause();
								state._fsp--;
								if (state.failed) return;

								}
								break;

						}

						// Java.g:604:86: ( block | SEMI )
						int alt172=2;
						int LA172_0 = input.LA(1);
						if ( (LA172_0==LCURLY) ) {
							alt172=1;
						}
						else if ( (LA172_0==SEMI) ) {
							alt172=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							NoViableAltException nvae =
								new NoViableAltException("", 172, 0, input);
							throw nvae;
						}

						switch (alt172) {
							case 1 :
								// Java.g:604:87: block
								{
								pushFollow(FOLLOW_block_in_synpred45_Java8340);
								block();
								state._fsp--;
								if (state.failed) return;

								}
								break;
							case 2 :
								// Java.g:604:95: SEMI
								{
								match(input,SEMI,FOLLOW_SEMI_in_synpred45_Java8344); if (state.failed) return;

								}
								break;

						}

						}
						break;
					case 2 :
						// Java.g:609:25: VOID IDENT formalParameterList ( throwsClause )? ( block | SEMI )
						{
						match(input,VOID,FOLLOW_VOID_in_synpred45_Java8427); if (state.failed) return;

						match(input,IDENT,FOLLOW_IDENT_in_synpred45_Java8429); if (state.failed) return;

						pushFollow(FOLLOW_formalParameterList_in_synpred45_Java8431);
						formalParameterList();
						state._fsp--;
						if (state.failed) return;

						// Java.g:609:56: ( throwsClause )?
						int alt173=2;
						int LA173_0 = input.LA(1);
						if ( (LA173_0==THROWS) ) {
							alt173=1;
						}
						switch (alt173) {
							case 1 :
								// Java.g:609:56: throwsClause
								{
								pushFollow(FOLLOW_throwsClause_in_synpred45_Java8433);
								throwsClause();
								state._fsp--;
								if (state.failed) return;

								}
								break;

						}

						// Java.g:609:70: ( block | SEMI )
						int alt174=2;
						int LA174_0 = input.LA(1);
						if ( (LA174_0==LCURLY) ) {
							alt174=1;
						}
						else if ( (LA174_0==SEMI) ) {
							alt174=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							NoViableAltException nvae =
								new NoViableAltException("", 174, 0, input);
							throw nvae;
						}

						switch (alt174) {
							case 1 :
								// Java.g:609:71: block
								{
								pushFollow(FOLLOW_block_in_synpred45_Java8437);
								block();
								state._fsp--;
								if (state.failed) return;

								}
								break;
							case 2 :
								// Java.g:609:79: SEMI
								{
								match(input,SEMI,FOLLOW_SEMI_in_synpred45_Java8441); if (state.failed) return;

								}
								break;

						}

						}
						break;
					case 3 :
						// Java.g:611:25: id= IDENT formalParameterList ( throwsClause )? block
						{
						id=(Token)match(input,IDENT,FOLLOW_IDENT_in_synpred45_Java8516); if (state.failed) return;

						pushFollow(FOLLOW_formalParameterList_in_synpred45_Java8518);
						formalParameterList();
						state._fsp--;
						if (state.failed) return;

						// Java.g:611:54: ( throwsClause )?
						int alt175=2;
						int LA175_0 = input.LA(1);
						if ( (LA175_0==THROWS) ) {
							alt175=1;
						}
						switch (alt175) {
							case 1 :
								// Java.g:611:54: throwsClause
								{
								pushFollow(FOLLOW_throwsClause_in_synpred45_Java8520);
								throwsClause();
								state._fsp--;
								if (state.failed) return;

								}
								break;

						}

						pushFollow(FOLLOW_block_in_synpred45_Java8523);
						block();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				}
				break;
			case 2 :
				// Java.g:614:21: type classFieldDeclaratorList SEMI
				{
				pushFollow(FOLLOW_type_in_synpred45_Java8611);
				type();
				state._fsp--;
				if (state.failed) return;

				pushFollow(FOLLOW_classFieldDeclaratorList_in_synpred45_Java8613);
				classFieldDeclaratorList();
				state._fsp--;
				if (state.failed) return;

				match(input,SEMI,FOLLOW_SEMI_in_synpred45_Java8615); if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred45_Java

	// $ANTLR start synpred46_Java
	public final void synpred46_Java_fragment() throws RecognitionException {
		// Java.g:617:17: ( typeDeclaration )
		// Java.g:617:17: typeDeclaration
		{
		pushFollow(FOLLOW_typeDeclaration_in_synpred46_Java8684);
		typeDeclaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred46_Java

	// $ANTLR start synpred52_Java
	public final void synpred52_Java_fragment() throws RecognitionException {
		// Java.g:623:21: ( ( genericTypeParameterList )? ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI | VOID IDENT formalParameterList ( throwsClause )? SEMI ) )
		// Java.g:623:21: ( genericTypeParameterList )? ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI | VOID IDENT formalParameterList ( throwsClause )? SEMI )
		{
		// Java.g:623:21: ( genericTypeParameterList )?
		int alt180=2;
		int LA180_0 = input.LA(1);
		if ( (LA180_0==LESS_THAN) ) {
			alt180=1;
		}
		switch (alt180) {
			case 1 :
				// Java.g:623:21: genericTypeParameterList
				{
				pushFollow(FOLLOW_genericTypeParameterList_in_synpred52_Java8780);
				genericTypeParameterList();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		// Java.g:624:21: ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI | VOID IDENT formalParameterList ( throwsClause )? SEMI )
		int alt184=2;
		int LA184_0 = input.LA(1);
		if ( (LA184_0==BOOLEAN||LA184_0==BYTE||LA184_0==CHAR||LA184_0==DOUBLE||LA184_0==FLOAT||LA184_0==IDENT||LA184_0==INT||LA184_0==LONG||LA184_0==SHORT) ) {
			alt184=1;
		}
		else if ( (LA184_0==VOID) ) {
			alt184=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 184, 0, input);
			throw nvae;
		}

		switch (alt184) {
			case 1 :
				// Java.g:624:25: type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI
				{
				pushFollow(FOLLOW_type_in_synpred52_Java8807);
				type();
				state._fsp--;
				if (state.failed) return;

				match(input,IDENT,FOLLOW_IDENT_in_synpred52_Java8809); if (state.failed) return;

				pushFollow(FOLLOW_formalParameterList_in_synpred52_Java8811);
				formalParameterList();
				state._fsp--;
				if (state.failed) return;

				// Java.g:624:56: ( arrayDeclaratorList )?
				int alt181=2;
				int LA181_0 = input.LA(1);
				if ( (LA181_0==LBRACK) ) {
					alt181=1;
				}
				switch (alt181) {
					case 1 :
						// Java.g:624:56: arrayDeclaratorList
						{
						pushFollow(FOLLOW_arrayDeclaratorList_in_synpred52_Java8813);
						arrayDeclaratorList();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				// Java.g:624:77: ( throwsClause )?
				int alt182=2;
				int LA182_0 = input.LA(1);
				if ( (LA182_0==THROWS) ) {
					alt182=1;
				}
				switch (alt182) {
					case 1 :
						// Java.g:624:77: throwsClause
						{
						pushFollow(FOLLOW_throwsClause_in_synpred52_Java8816);
						throwsClause();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				match(input,SEMI,FOLLOW_SEMI_in_synpred52_Java8819); if (state.failed) return;

				}
				break;
			case 2 :
				// Java.g:626:25: VOID IDENT formalParameterList ( throwsClause )? SEMI
				{
				match(input,VOID,FOLLOW_VOID_in_synpred52_Java8893); if (state.failed) return;

				match(input,IDENT,FOLLOW_IDENT_in_synpred52_Java8895); if (state.failed) return;

				pushFollow(FOLLOW_formalParameterList_in_synpred52_Java8897);
				formalParameterList();
				state._fsp--;
				if (state.failed) return;

				// Java.g:626:56: ( throwsClause )?
				int alt183=2;
				int LA183_0 = input.LA(1);
				if ( (LA183_0==THROWS) ) {
					alt183=1;
				}
				switch (alt183) {
					case 1 :
						// Java.g:626:56: throwsClause
						{
						pushFollow(FOLLOW_throwsClause_in_synpred52_Java8899);
						throwsClause();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				match(input,SEMI,FOLLOW_SEMI_in_synpred52_Java8902); if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred52_Java

	// $ANTLR start synpred53_Java
	public final void synpred53_Java_fragment() throws RecognitionException {
		// Java.g:622:17: ( modifierList ( ( genericTypeParameterList )? ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI | VOID IDENT formalParameterList ( throwsClause )? SEMI ) | type interfaceFieldDeclaratorList SEMI ) )
		// Java.g:622:17: modifierList ( ( genericTypeParameterList )? ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI | VOID IDENT formalParameterList ( throwsClause )? SEMI ) | type interfaceFieldDeclaratorList SEMI )
		{
		pushFollow(FOLLOW_modifierList_in_synpred53_Java8758);
		modifierList();
		state._fsp--;
		if (state.failed) return;

		// Java.g:623:17: ( ( genericTypeParameterList )? ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI | VOID IDENT formalParameterList ( throwsClause )? SEMI ) | type interfaceFieldDeclaratorList SEMI )
		int alt190=2;
		switch ( input.LA(1) ) {
		case LESS_THAN:
		case VOID:
			{
			alt190=1;
			}
			break;
		case BOOLEAN:
			{
			int LA190_2 = input.LA(2);
			if ( (synpred52_Java()) ) {
				alt190=1;
			}
			else if ( (true) ) {
				alt190=2;
			}

			}
			break;
		case CHAR:
			{
			int LA190_3 = input.LA(2);
			if ( (synpred52_Java()) ) {
				alt190=1;
			}
			else if ( (true) ) {
				alt190=2;
			}

			}
			break;
		case BYTE:
			{
			int LA190_4 = input.LA(2);
			if ( (synpred52_Java()) ) {
				alt190=1;
			}
			else if ( (true) ) {
				alt190=2;
			}

			}
			break;
		case SHORT:
			{
			int LA190_5 = input.LA(2);
			if ( (synpred52_Java()) ) {
				alt190=1;
			}
			else if ( (true) ) {
				alt190=2;
			}

			}
			break;
		case INT:
			{
			int LA190_6 = input.LA(2);
			if ( (synpred52_Java()) ) {
				alt190=1;
			}
			else if ( (true) ) {
				alt190=2;
			}

			}
			break;
		case LONG:
			{
			int LA190_7 = input.LA(2);
			if ( (synpred52_Java()) ) {
				alt190=1;
			}
			else if ( (true) ) {
				alt190=2;
			}

			}
			break;
		case FLOAT:
			{
			int LA190_8 = input.LA(2);
			if ( (synpred52_Java()) ) {
				alt190=1;
			}
			else if ( (true) ) {
				alt190=2;
			}

			}
			break;
		case DOUBLE:
			{
			int LA190_9 = input.LA(2);
			if ( (synpred52_Java()) ) {
				alt190=1;
			}
			else if ( (true) ) {
				alt190=2;
			}

			}
			break;
		case IDENT:
			{
			int LA190_10 = input.LA(2);
			if ( (synpred52_Java()) ) {
				alt190=1;
			}
			else if ( (true) ) {
				alt190=2;
			}

			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 190, 0, input);
			throw nvae;
		}
		switch (alt190) {
			case 1 :
				// Java.g:623:21: ( genericTypeParameterList )? ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI | VOID IDENT formalParameterList ( throwsClause )? SEMI )
				{
				// Java.g:623:21: ( genericTypeParameterList )?
				int alt185=2;
				int LA185_0 = input.LA(1);
				if ( (LA185_0==LESS_THAN) ) {
					alt185=1;
				}
				switch (alt185) {
					case 1 :
						// Java.g:623:21: genericTypeParameterList
						{
						pushFollow(FOLLOW_genericTypeParameterList_in_synpred53_Java8780);
						genericTypeParameterList();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				// Java.g:624:21: ( type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI | VOID IDENT formalParameterList ( throwsClause )? SEMI )
				int alt189=2;
				int LA189_0 = input.LA(1);
				if ( (LA189_0==BOOLEAN||LA189_0==BYTE||LA189_0==CHAR||LA189_0==DOUBLE||LA189_0==FLOAT||LA189_0==IDENT||LA189_0==INT||LA189_0==LONG||LA189_0==SHORT) ) {
					alt189=1;
				}
				else if ( (LA189_0==VOID) ) {
					alt189=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					NoViableAltException nvae =
						new NoViableAltException("", 189, 0, input);
					throw nvae;
				}

				switch (alt189) {
					case 1 :
						// Java.g:624:25: type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? SEMI
						{
						pushFollow(FOLLOW_type_in_synpred53_Java8807);
						type();
						state._fsp--;
						if (state.failed) return;

						match(input,IDENT,FOLLOW_IDENT_in_synpred53_Java8809); if (state.failed) return;

						pushFollow(FOLLOW_formalParameterList_in_synpred53_Java8811);
						formalParameterList();
						state._fsp--;
						if (state.failed) return;

						// Java.g:624:56: ( arrayDeclaratorList )?
						int alt186=2;
						int LA186_0 = input.LA(1);
						if ( (LA186_0==LBRACK) ) {
							alt186=1;
						}
						switch (alt186) {
							case 1 :
								// Java.g:624:56: arrayDeclaratorList
								{
								pushFollow(FOLLOW_arrayDeclaratorList_in_synpred53_Java8813);
								arrayDeclaratorList();
								state._fsp--;
								if (state.failed) return;

								}
								break;

						}

						// Java.g:624:77: ( throwsClause )?
						int alt187=2;
						int LA187_0 = input.LA(1);
						if ( (LA187_0==THROWS) ) {
							alt187=1;
						}
						switch (alt187) {
							case 1 :
								// Java.g:624:77: throwsClause
								{
								pushFollow(FOLLOW_throwsClause_in_synpred53_Java8816);
								throwsClause();
								state._fsp--;
								if (state.failed) return;

								}
								break;

						}

						match(input,SEMI,FOLLOW_SEMI_in_synpred53_Java8819); if (state.failed) return;

						}
						break;
					case 2 :
						// Java.g:626:25: VOID IDENT formalParameterList ( throwsClause )? SEMI
						{
						match(input,VOID,FOLLOW_VOID_in_synpred53_Java8893); if (state.failed) return;

						match(input,IDENT,FOLLOW_IDENT_in_synpred53_Java8895); if (state.failed) return;

						pushFollow(FOLLOW_formalParameterList_in_synpred53_Java8897);
						formalParameterList();
						state._fsp--;
						if (state.failed) return;

						// Java.g:626:56: ( throwsClause )?
						int alt188=2;
						int LA188_0 = input.LA(1);
						if ( (LA188_0==THROWS) ) {
							alt188=1;
						}
						switch (alt188) {
							case 1 :
								// Java.g:626:56: throwsClause
								{
								pushFollow(FOLLOW_throwsClause_in_synpred53_Java8899);
								throwsClause();
								state._fsp--;
								if (state.failed) return;

								}
								break;

						}

						match(input,SEMI,FOLLOW_SEMI_in_synpred53_Java8902); if (state.failed) return;

						}
						break;

				}

				}
				break;
			case 2 :
				// Java.g:629:21: type interfaceFieldDeclaratorList SEMI
				{
				pushFollow(FOLLOW_type_in_synpred53_Java8989);
				type();
				state._fsp--;
				if (state.failed) return;

				pushFollow(FOLLOW_interfaceFieldDeclaratorList_in_synpred53_Java8991);
				interfaceFieldDeclaratorList();
				state._fsp--;
				if (state.failed) return;

				match(input,SEMI,FOLLOW_SEMI_in_synpred53_Java8993); if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred53_Java

	// $ANTLR start synpred54_Java
	public final void synpred54_Java_fragment() throws RecognitionException {
		// Java.g:632:17: ( typeDeclaration )
		// Java.g:632:17: typeDeclaration
		{
		pushFollow(FOLLOW_typeDeclaration_in_synpred54_Java9062);
		typeDeclaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred54_Java

	// $ANTLR start synpred60_Java
	public final void synpred60_Java_fragment() throws RecognitionException {
		// Java.g:679:17: ( arrayDeclarator )
		// Java.g:679:17: arrayDeclarator
		{
		pushFollow(FOLLOW_arrayDeclarator_in_synpred60_Java9638);
		arrayDeclarator();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred60_Java

	// $ANTLR start synpred78_Java
	public final void synpred78_Java_fragment() throws RecognitionException {
		// Java.g:728:31: ( arrayDeclaratorList )
		// Java.g:728:31: arrayDeclaratorList
		{
		pushFollow(FOLLOW_arrayDeclaratorList_in_synpred78_Java10375);
		arrayDeclaratorList();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred78_Java

	// $ANTLR start synpred79_Java
	public final void synpred79_Java_fragment() throws RecognitionException {
		// Java.g:733:36: ( arrayDeclaratorList )
		// Java.g:733:36: arrayDeclaratorList
		{
		pushFollow(FOLLOW_arrayDeclaratorList_in_synpred79_Java10456);
		arrayDeclaratorList();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred79_Java

	// $ANTLR start synpred81_Java
	public final void synpred81_Java_fragment() throws RecognitionException {
		// Java.g:743:28: ( DOT typeIdent )
		// Java.g:743:28: DOT typeIdent
		{
		match(input,DOT,FOLLOW_DOT_in_synpred81_Java10605); if (state.failed) return;

		pushFollow(FOLLOW_typeIdent_in_synpred81_Java10607);
		typeIdent();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred81_Java

	// $ANTLR start synpred92_Java
	public final void synpred92_Java_fragment() throws RecognitionException {
		// Java.g:787:48: ( COMMA genericTypeArgument )
		// Java.g:787:48: COMMA genericTypeArgument
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred92_Java11078); if (state.failed) return;

		pushFollow(FOLLOW_genericTypeArgument_in_synpred92_Java11080);
		genericTypeArgument();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred92_Java

	// $ANTLR start synpred94_Java
	public final void synpred94_Java_fragment() throws RecognitionException {
		// Java.g:793:26: ( genericWildcardBoundType )
		// Java.g:793:26: genericWildcardBoundType
		{
		pushFollow(FOLLOW_genericWildcardBoundType_in_synpred94_Java11174);
		genericWildcardBoundType();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred94_Java

	// $ANTLR start synpred99_Java
	public final void synpred99_Java_fragment() throws RecognitionException {
		// Java.g:828:50: ( COMMA formalParameterStandardDecl )
		// Java.g:828:50: COMMA formalParameterStandardDecl
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred99_Java11573); if (state.failed) return;

		pushFollow(FOLLOW_formalParameterStandardDecl_in_synpred99_Java11575);
		formalParameterStandardDecl();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred99_Java

	// $ANTLR start synpred101_Java
	public final void synpred101_Java_fragment() throws RecognitionException {
		// Java.g:818:3: ( formalParameterStandardDecl ( COMMA formalParameterStandardDecl )* ( COMMA formalParameterVarArgDecl )? )
		// Java.g:818:3: formalParameterStandardDecl ( COMMA formalParameterStandardDecl )* ( COMMA formalParameterVarArgDecl )?
		{
		pushFollow(FOLLOW_formalParameterStandardDecl_in_synpred101_Java11570);
		formalParameterStandardDecl();
		state._fsp--;
		if (state.failed) return;

		// Java.g:828:49: ( COMMA formalParameterStandardDecl )*
		loop193:
		while (true) {
			int alt193=2;
			int LA193_0 = input.LA(1);
			if ( (LA193_0==COMMA) ) {
				int LA193_1 = input.LA(2);
				if ( (synpred99_Java()) ) {
					alt193=1;
				}

			}

			switch (alt193) {
			case 1 :
				// Java.g:828:50: COMMA formalParameterStandardDecl
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred101_Java11573); if (state.failed) return;

				pushFollow(FOLLOW_formalParameterStandardDecl_in_synpred101_Java11575);
				formalParameterStandardDecl();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop193;
			}
		}

		// Java.g:828:86: ( COMMA formalParameterVarArgDecl )?
		int alt194=2;
		int LA194_0 = input.LA(1);
		if ( (LA194_0==COMMA) ) {
			alt194=1;
		}
		switch (alt194) {
			case 1 :
				// Java.g:828:87: COMMA formalParameterVarArgDecl
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred101_Java11580); if (state.failed) return;

				pushFollow(FOLLOW_formalParameterVarArgDecl_in_synpred101_Java11582);
				formalParameterVarArgDecl();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred101_Java

	// $ANTLR start synpred102_Java
	public final void synpred102_Java_fragment() throws RecognitionException {
		// Java.g:831:21: ( formalParameterVarArgDecl )
		// Java.g:831:21: formalParameterVarArgDecl
		{
		pushFollow(FOLLOW_formalParameterVarArgDecl_in_synpred102_Java11663);
		formalParameterVarArgDecl();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred102_Java

	// $ANTLR start synpred103_Java
	public final void synpred103_Java_fragment() throws RecognitionException {
		Token ident=null;


		// Java.g:860:21: ( DOT ident= IDENT )
		// Java.g:860:21: DOT ident= IDENT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred103_Java12082); if (state.failed) return;

		ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_synpred103_Java12086); if (state.failed) return;

		}

	}
	// $ANTLR end synpred103_Java

	// $ANTLR start synpred104_Java
	public final void synpred104_Java_fragment() throws RecognitionException {
		// Java.g:867:17: ( annotation )
		// Java.g:867:17: annotation
		{
		pushFollow(FOLLOW_annotation_in_synpred104_Java12187);
		annotation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred104_Java

	// $ANTLR start synpred105_Java
	public final void synpred105_Java_fragment() throws RecognitionException {
		// Java.g:877:44: ( annotationInit )
		// Java.g:877:44: annotationInit
		{
		pushFollow(FOLLOW_annotationInit_in_synpred105_Java12287);
		annotationInit();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred105_Java

	// $ANTLR start synpred116_Java
	public final void synpred116_Java_fragment() throws RecognitionException {
		// Java.g:937:17: ( modifierList type ( IDENT LPAREN RPAREN ( annotationDefaultValue )? SEMI | classFieldDeclaratorList SEMI ) )
		// Java.g:937:17: modifierList type ( IDENT LPAREN RPAREN ( annotationDefaultValue )? SEMI | classFieldDeclaratorList SEMI )
		{
		pushFollow(FOLLOW_modifierList_in_synpred116_Java12991);
		modifierList();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_type_in_synpred116_Java12993);
		type();
		state._fsp--;
		if (state.failed) return;

		// Java.g:938:17: ( IDENT LPAREN RPAREN ( annotationDefaultValue )? SEMI | classFieldDeclaratorList SEMI )
		int alt199=2;
		int LA199_0 = input.LA(1);
		if ( (LA199_0==IDENT) ) {
			int LA199_1 = input.LA(2);
			if ( (LA199_1==LPAREN) ) {
				alt199=1;
			}
			else if ( (LA199_1==ASSIGN||LA199_1==COMMA||LA199_1==LBRACK||LA199_1==SEMI) ) {
				alt199=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 199, 1, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 199, 0, input);
			throw nvae;
		}

		switch (alt199) {
			case 1 :
				// Java.g:938:21: IDENT LPAREN RPAREN ( annotationDefaultValue )? SEMI
				{
				match(input,IDENT,FOLLOW_IDENT_in_synpred116_Java13015); if (state.failed) return;

				match(input,LPAREN,FOLLOW_LPAREN_in_synpred116_Java13017); if (state.failed) return;

				match(input,RPAREN,FOLLOW_RPAREN_in_synpred116_Java13019); if (state.failed) return;

				// Java.g:938:41: ( annotationDefaultValue )?
				int alt198=2;
				int LA198_0 = input.LA(1);
				if ( (LA198_0==DEFAULT) ) {
					alt198=1;
				}
				switch (alt198) {
					case 1 :
						// Java.g:938:41: annotationDefaultValue
						{
						pushFollow(FOLLOW_annotationDefaultValue_in_synpred116_Java13021);
						annotationDefaultValue();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				match(input,SEMI,FOLLOW_SEMI_in_synpred116_Java13024); if (state.failed) return;

				}
				break;
			case 2 :
				// Java.g:940:21: classFieldDeclaratorList SEMI
				{
				pushFollow(FOLLOW_classFieldDeclaratorList_in_synpred116_Java13082);
				classFieldDeclaratorList();
				state._fsp--;
				if (state.failed) return;

				match(input,SEMI,FOLLOW_SEMI_in_synpred116_Java13084); if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred116_Java

	// $ANTLR start synpred118_Java
	public final void synpred118_Java_fragment() throws RecognitionException {
		// Java.g:1011:17: ( localVariableDeclaration SEMI )
		// Java.g:1011:17: localVariableDeclaration SEMI
		{
		pushFollow(FOLLOW_localVariableDeclaration_in_synpred118_Java13374);
		localVariableDeclaration();
		state._fsp--;
		if (state.failed) return;

		match(input,SEMI,FOLLOW_SEMI_in_synpred118_Java13376); if (state.failed) return;

		}

	}
	// $ANTLR end synpred118_Java

	// $ANTLR start synpred119_Java
	public final void synpred119_Java_fragment() throws RecognitionException {
		// Java.g:1012:17: ( typeDeclaration )
		// Java.g:1012:17: typeDeclaration
		{
		pushFollow(FOLLOW_typeDeclaration_in_synpred119_Java13395);
		typeDeclaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred119_Java

	// $ANTLR start synpred124_Java
	public final void synpred124_Java_fragment() throws RecognitionException {
		ParserRuleReturnScope elseStat =null;


		// Java.g:1061:21: ( ELSE elseStat= statement )
		// Java.g:1061:21: ELSE elseStat= statement
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred124_Java13915); if (state.failed) return;

		pushFollow(FOLLOW_statement_in_synpred124_Java13940);
		elseStat=statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred124_Java

	// $ANTLR start synpred126_Java
	public final void synpred126_Java_fragment() throws RecognitionException {
		ParserRuleReturnScope z =null;


		// Java.g:1105:21: ( forInit SEMI z= forCondition SEMI forUpdater RPAREN statement )
		// Java.g:1105:21: forInit SEMI z= forCondition SEMI forUpdater RPAREN statement
		{
		pushFollow(FOLLOW_forInit_in_synpred126_Java14234);
		forInit();
		state._fsp--;
		if (state.failed) return;

		match(input,SEMI,FOLLOW_SEMI_in_synpred126_Java14236); if (state.failed) return;

		pushFollow(FOLLOW_forCondition_in_synpred126_Java14240);
		z=forCondition();
		state._fsp--;
		if (state.failed) return;

		match(input,SEMI,FOLLOW_SEMI_in_synpred126_Java14263); if (state.failed) return;

		pushFollow(FOLLOW_forUpdater_in_synpred126_Java14265);
		forUpdater();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred126_Java14267); if (state.failed) return;

		pushFollow(FOLLOW_statement_in_synpred126_Java14269);
		statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred126_Java

	// $ANTLR start synpred146_Java
	public final void synpred146_Java_fragment() throws RecognitionException {
		// Java.g:1290:17: ( switchCaseLabel )
		// Java.g:1290:17: switchCaseLabel
		{
		pushFollow(FOLLOW_switchCaseLabel_in_synpred146_Java15740);
		switchCaseLabel();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred146_Java

	// $ANTLR start synpred149_Java
	public final void synpred149_Java_fragment() throws RecognitionException {
		// Java.g:1323:17: ( localVariableDeclaration )
		// Java.g:1323:17: localVariableDeclaration
		{
		pushFollow(FOLLOW_localVariableDeclaration_in_synpred149_Java15930);
		localVariableDeclaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred149_Java

	// $ANTLR start synpred150_Java
	public final void synpred150_Java_fragment() throws RecognitionException {
		// Java.g:1324:17: ( expressionList )
		// Java.g:1324:17: expressionList
		{
		pushFollow(FOLLOW_expressionList_in_synpred150_Java15960);
		expressionList();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred150_Java

	// $ANTLR start synpred193_Java
	public final void synpred193_Java_fragment() throws RecognitionException {
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope p =null;


		// Java.g:1721:16: ( LPAREN t= type RPAREN p= unaryExpression )
		// Java.g:1721:16: LPAREN t= type RPAREN p= unaryExpression
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred193_Java18356); if (state.failed) return;

		pushFollow(FOLLOW_type_in_synpred193_Java18360);
		t=type();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred193_Java18362); if (state.failed) return;

		pushFollow(FOLLOW_unaryExpression_in_synpred193_Java18366);
		p=unaryExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred193_Java

	// $ANTLR start synpred221_Java
	public final void synpred221_Java_fragment() throws RecognitionException {
		// Java.g:1819:21: ( ( arrayDeclarator )+ ( DOT CLASS ) )
		// Java.g:1819:21: ( arrayDeclarator )+ ( DOT CLASS )
		{
		// Java.g:1819:21: ( arrayDeclarator )+
		int cnt222=0;
		loop222:
		while (true) {
			int alt222=2;
			int LA222_0 = input.LA(1);
			if ( (LA222_0==LBRACK) ) {
				alt222=1;
			}

			switch (alt222) {
			case 1 :
				// Java.g:1819:25: arrayDeclarator
				{
				pushFollow(FOLLOW_arrayDeclarator_in_synpred221_Java21000);
				arrayDeclarator();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				if ( cnt222 >= 1 ) break loop222;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(222, input);
				throw eee;
			}
			cnt222++;
		}

		// Java.g:1822:21: ( DOT CLASS )
		// Java.g:1822:25: DOT CLASS
		{
		match(input,DOT,FOLLOW_DOT_in_synpred221_Java21109); if (state.failed) return;

		match(input,CLASS,FOLLOW_CLASS_in_synpred221_Java21111); if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred221_Java

	// $ANTLR start synpred229_Java
	public final void synpred229_Java_fragment() throws RecognitionException {
		Token outerDot=null;
		Token Super=null;
		Token innerDot=null;


		// Java.g:1827:21: (outerDot= DOT ( CLASS | genericTypeArgumentListSimplified (Super= SUPER arguments | SUPER innerDot= DOT IDENT arguments | IDENT arguments ) | THIS |Super= SUPER arguments | innerNewExpression ) )
		// Java.g:1827:21: outerDot= DOT ( CLASS | genericTypeArgumentListSimplified (Super= SUPER arguments | SUPER innerDot= DOT IDENT arguments | IDENT arguments ) | THIS |Super= SUPER arguments | innerNewExpression )
		{
		outerDot=(Token)match(input,DOT,FOLLOW_DOT_in_synpred229_Java21276); if (state.failed) return;

		// Java.g:1828:21: ( CLASS | genericTypeArgumentListSimplified (Super= SUPER arguments | SUPER innerDot= DOT IDENT arguments | IDENT arguments ) | THIS |Super= SUPER arguments | innerNewExpression )
		int alt225=5;
		switch ( input.LA(1) ) {
		case CLASS:
			{
			alt225=1;
			}
			break;
		case LESS_THAN:
			{
			alt225=2;
			}
			break;
		case THIS:
			{
			alt225=3;
			}
			break;
		case SUPER:
			{
			alt225=4;
			}
			break;
		case NEW:
			{
			alt225=5;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 225, 0, input);
			throw nvae;
		}
		switch (alt225) {
			case 1 :
				// Java.g:1828:25: CLASS
				{
				match(input,CLASS,FOLLOW_CLASS_in_synpred229_Java21302); if (state.failed) return;

				}
				break;
			case 2 :
				// Java.g:1830:25: genericTypeArgumentListSimplified (Super= SUPER arguments | SUPER innerDot= DOT IDENT arguments | IDENT arguments )
				{
				pushFollow(FOLLOW_genericTypeArgumentListSimplified_in_synpred229_Java21398);
				genericTypeArgumentListSimplified();
				state._fsp--;
				if (state.failed) return;

				// Java.g:1831:25: (Super= SUPER arguments | SUPER innerDot= DOT IDENT arguments | IDENT arguments )
				int alt224=3;
				int LA224_0 = input.LA(1);
				if ( (LA224_0==SUPER) ) {
					int LA224_1 = input.LA(2);
					if ( (LA224_1==DOT) ) {
						alt224=2;
					}
					else if ( (LA224_1==LPAREN) ) {
						alt224=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 224, 1, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA224_0==IDENT) ) {
					alt224=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					NoViableAltException nvae =
						new NoViableAltException("", 224, 0, input);
					throw nvae;
				}

				switch (alt224) {
					case 1 :
						// Java.g:1831:29: Super= SUPER arguments
						{
						Super=(Token)match(input,SUPER,FOLLOW_SUPER_in_synpred229_Java21431); if (state.failed) return;

						pushFollow(FOLLOW_arguments_in_synpred229_Java21433);
						arguments();
						state._fsp--;
						if (state.failed) return;

						}
						break;
					case 2 :
						// Java.g:1833:29: SUPER innerDot= DOT IDENT arguments
						{
						match(input,SUPER,FOLLOW_SUPER_in_synpred229_Java21520); if (state.failed) return;

						innerDot=(Token)match(input,DOT,FOLLOW_DOT_in_synpred229_Java21524); if (state.failed) return;

						match(input,IDENT,FOLLOW_IDENT_in_synpred229_Java21526); if (state.failed) return;

						pushFollow(FOLLOW_arguments_in_synpred229_Java21528);
						arguments();
						state._fsp--;
						if (state.failed) return;

						}
						break;
					case 3 :
						// Java.g:1835:29: IDENT arguments
						{
						match(input,IDENT,FOLLOW_IDENT_in_synpred229_Java21614); if (state.failed) return;

						pushFollow(FOLLOW_arguments_in_synpred229_Java21616);
						arguments();
						state._fsp--;
						if (state.failed) return;

						}
						break;

				}

				}
				break;
			case 3 :
				// Java.g:1838:25: THIS
				{
				match(input,THIS,FOLLOW_THIS_in_synpred229_Java21716); if (state.failed) return;

				}
				break;
			case 4 :
				// Java.g:1840:25: Super= SUPER arguments
				{
				Super=(Token)match(input,SUPER,FOLLOW_SUPER_in_synpred229_Java21779); if (state.failed) return;

				pushFollow(FOLLOW_arguments_in_synpred229_Java21781);
				arguments();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 5 :
				// Java.g:1842:25: innerNewExpression
				{
				pushFollow(FOLLOW_innerNewExpression_in_synpred229_Java21843);
				innerNewExpression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred229_Java

	// $ANTLR start synpred237_Java
	public final void synpred237_Java_fragment() throws RecognitionException {
		// Java.g:1868:45: ( LBRACK expression RBRACK )
		// Java.g:1868:45: LBRACK expression RBRACK
		{
		match(input,LBRACK,FOLLOW_LBRACK_in_synpred237_Java22432); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred237_Java22435);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RBRACK,FOLLOW_RBRACK_in_synpred237_Java22437); if (state.failed) return;

		}

	}
	// $ANTLR end synpred237_Java

	// Delegated rules

	public final boolean synpred34_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred34_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred79_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred79_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred81_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred81_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred92_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred92_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred116_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred116_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred119_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred119_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred124_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred124_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred78_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred78_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred45_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred45_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred102_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred102_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred221_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred221_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred105_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred105_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred104_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred104_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred146_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred146_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred44_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred44_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred149_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred149_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred94_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred94_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred193_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred193_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred52_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred52_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred60_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred60_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred101_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred101_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred46_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred46_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred237_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred237_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred103_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred103_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred54_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred54_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred99_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred99_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred229_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred229_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred118_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred118_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred126_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred126_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred150_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred150_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_compilationUnit_in_javaSource6000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationList_in_compilationUnit6089 = new BitSet(new long[]{0x0400000800400012L,0x0500000210000010L,0x00800820A0207008L});
	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit6108 = new BitSet(new long[]{0x0400000800400012L,0x0500000210000010L,0x00800820A0207000L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit6128 = new BitSet(new long[]{0x0400000800400012L,0x0500000210000010L,0x00800820A0207000L});
	public static final BitSet FOLLOW_typeDecls_in_compilationUnit6148 = new BitSet(new long[]{0x0400000800400012L,0x0500000200000010L,0x00800820A0207000L});
	public static final BitSet FOLLOW_typeDeclaration_in_typeDecls6196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_polyverseDeclaration_in_typeDecls6214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_typeDecls6232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration6276 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration6280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_packageDeclaration6282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_importDeclaration6340 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_STATIC_in_importDeclaration6343 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration6346 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration6348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_importDeclaration6351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MVENTER_in_polyverseDeclaration6405 = new BitSet(new long[]{0x0400000800400010L,0x0600000200000010L,0x00800820A0007000L});
	public static final BitSet FOLLOW_typeDeclaration_in_polyverseDeclaration6427 = new BitSet(new long[]{0x0400000800400010L,0x0600000200000010L,0x00800820A0007000L});
	public static final BitSet FOLLOW_MVEXIT_in_polyverseDeclaration6448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifierList_in_typeDeclaration6488 = new BitSet(new long[]{0x0400000800400000L,0x0000000200000000L});
	public static final BitSet FOLLOW_classTypeDeclaration_in_typeDeclaration6511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceTypeDeclaration_in_typeDeclaration6534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumTypeDeclaration_in_typeDeclaration6557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_typeDeclaration6580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classTypeDeclaration6647 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_classTypeDeclaration6649 = new BitSet(new long[]{0x0000000000000000L,0x0000050004000001L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_classTypeDeclaration6651 = new BitSet(new long[]{0x0000000000000000L,0x0000010004000001L});
	public static final BitSet FOLLOW_classExtendsClause_in_classTypeDeclaration6654 = new BitSet(new long[]{0x0000000000000000L,0x0000010004000000L});
	public static final BitSet FOLLOW_implementsClause_in_classTypeDeclaration6657 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_classBody_in_classTypeDeclaration6660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_classExtendsClause6745 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_classExtendsClause6747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_interfaceExtendsClause6823 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_typeList_in_interfaceExtendsClause6825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLEMENTS_in_implementsClause6901 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_typeList_in_implementsClause6903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESS_THAN_in_genericTypeParameterList6980 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList6982 = new BitSet(new long[]{0x0000020000800000L,0x0000000000200000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_genericTypeParameterList6985 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList6987 = new BitSet(new long[]{0x0000020000800000L,0x0000000000200000L,0x0000000001000000L});
	public static final BitSet FOLLOW_genericTypeListClosing_in_genericTypeParameterList6991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_THAN_in_genericTypeListClosing7162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHIFT_RIGHT_in_genericTypeListClosing7180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_genericTypeListClosing7198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_genericTypeParameter7257 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_bound_in_genericTypeParameter7259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_bound7347 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_bound7349 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_bound7352 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_bound7354 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ENUM_in_enumTypeDeclaration7427 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_enumTypeDeclaration7429 = new BitSet(new long[]{0x0000000000000000L,0x0000010004000000L});
	public static final BitSet FOLLOW_implementsClause_in_enumTypeDeclaration7431 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_enumBody_in_enumTypeDeclaration7434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_enumBody7513 = new BitSet(new long[]{0x0000000000400000L,0x0000000001000000L});
	public static final BitSet FOLLOW_enumScopeDeclarations_in_enumBody7516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RCURLY_in_enumBody7520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumConstants_in_enumScopeDeclarations7590 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_enumScopeDeclarations7593 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_enumClassScopeDeclarations_in_enumScopeDeclarations7598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_enumClassScopeDeclarations7642 = new BitSet(new long[]{0x0480000A14400012L,0x0401050281000050L,0x00A00820A4207000L});
	public static final BitSet FOLLOW_classScopeDeclarations_in_enumClassScopeDeclarations7644 = new BitSet(new long[]{0x0480000A14400012L,0x0401050281000050L,0x00A00820A4207000L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants7715 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_COMMA_in_enumConstants7718 = new BitSet(new long[]{0x0000000000400000L,0x0000000001000000L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants7721 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_annotationList_in_enumConstant7770 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_enumConstant7772 = new BitSet(new long[]{0x0000000000000002L,0x0002010000000000L});
	public static final BitSet FOLLOW_arguments_in_enumConstant7775 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_classBody_in_enumConstant7778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERFACE_in_interfaceTypeDeclaration7827 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_interfaceTypeDeclaration7829 = new BitSet(new long[]{0x0000000000000000L,0x0000050000000001L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceTypeDeclaration7831 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000001L});
	public static final BitSet FOLLOW_interfaceExtendsClause_in_interfaceTypeDeclaration7834 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceTypeDeclaration7837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeList7919 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_COMMA_in_typeList7922 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_typeList7925 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_LCURLY_in_classBody7974 = new BitSet(new long[]{0x0480000A14400010L,0x0401050281000050L,0x00A00820A4247000L});
	public static final BitSet FOLLOW_classScopeDeclarations_in_classBody7999 = new BitSet(new long[]{0x0480000A14400010L,0x0401050281000050L,0x00A00820A4247000L});
	public static final BitSet FOLLOW_RCURLY_in_classBody8024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_interfaceBody8098 = new BitSet(new long[]{0x0480000A14400010L,0x0401040281000050L,0x00A00820A4247000L});
	public static final BitSet FOLLOW_interfaceScopeDeclarations_in_interfaceBody8102 = new BitSet(new long[]{0x0480000A14400010L,0x0401040281000050L,0x00A00820A4247000L});
	public static final BitSet FOLLOW_RCURLY_in_interfaceBody8106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_classScopeDeclarations8176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_classScopeDeclarations8213 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_block_in_classScopeDeclarations8215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations8246 = new BitSet(new long[]{0x0080000214000000L,0x0001040081000040L,0x0020000004000000L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations8268 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0020000004000000L});
	public static final BitSet FOLLOW_type_in_classScopeDeclarations8297 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations8329 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations8331 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_classScopeDeclarations8333 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations8336 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_block_in_classScopeDeclarations8340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_classScopeDeclarations8344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_classScopeDeclarations8427 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations8429 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations8431 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations8433 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_block_in_classScopeDeclarations8437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_classScopeDeclarations8441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations8516 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations8518 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations8520 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_block_in_classScopeDeclarations8523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_classScopeDeclarations8611 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_classFieldDeclaratorList_in_classScopeDeclarations8613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_classScopeDeclarations8615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations8684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_classScopeDeclarations8702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations8758 = new BitSet(new long[]{0x0080000214000000L,0x0001040081000040L,0x0020000004000000L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations8780 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0020000004000000L});
	public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations8807 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations8809 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations8811 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations8813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations8816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_interfaceScopeDeclarations8819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_interfaceScopeDeclarations8893 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations8895 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations8897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations8899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_interfaceScopeDeclarations8902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations8989 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_interfaceFieldDeclaratorList_in_interfaceScopeDeclarations8991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_interfaceScopeDeclarations8993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations9062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_interfaceScopeDeclarations9080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classFieldDeclarator_in_classFieldDeclaratorList9126 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_COMMA_in_classFieldDeclaratorList9129 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_classFieldDeclarator_in_classFieldDeclaratorList9131 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_classFieldDeclarator9202 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_ASSIGN_in_classFieldDeclarator9205 = new BitSet(new long[]{0x0081800614000000L,0x580B4500A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_variableInitializer_in_classFieldDeclarator9207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceFieldDeclarator_in_interfaceFieldDeclaratorList9284 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_COMMA_in_interfaceFieldDeclaratorList9287 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_interfaceFieldDeclarator_in_interfaceFieldDeclaratorList9289 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_interfaceFieldDeclarator9360 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ASSIGN_in_interfaceFieldDeclarator9362 = new BitSet(new long[]{0x0081800614000000L,0x580B4500A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_variableInitializer_in_interfaceFieldDeclarator9364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId9448 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId9465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer9509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableInitializer9527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_arrayDeclarator9570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RBRACK_in_arrayDeclarator9572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDeclarator_in_arrayDeclaratorList9638 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_LCURLY_in_arrayInitializer9723 = new BitSet(new long[]{0x0081800614000000L,0x580B4500A18000C8L,0x0020104304040021L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer9726 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_arrayInitializer9729 = new BitSet(new long[]{0x0081800614000000L,0x580B4500A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer9731 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_arrayInitializer9735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RCURLY_in_arrayInitializer9740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROWS_in_throwsClause9810 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_qualifiedIdentList_in_throwsClause9812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifierList9881 = new BitSet(new long[]{0x0000000000400012L,0x0400000000000010L,0x00800820A0007000L});
	public static final BitSet FOLLOW_PUBLIC_in_modifier9954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROTECTED_in_modifier9972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIVATE_in_modifier9990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_modifier10008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ABSTRACT_in_modifier10026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIVE_in_modifier10044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier10062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSIENT_in_modifier10080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOLATILE_in_modifier10098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRICTFP_in_modifier10116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localModifier_in_modifier10134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localModifier_in_localModifierList10177 = new BitSet(new long[]{0x0000000000400002L,0x0000000000000010L});
	public static final BitSet FOLLOW_FINAL_in_localModifier10250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_localModifier10268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleType_in_type10311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectType_in_type10329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_simpleType10373 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_simpleType10375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedTypeIdent_in_objectType10454 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_objectType10456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedTypeIdentSimplified_in_objectTypeSimplified10528 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_objectTypeSimplified10530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent10602 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_DOT_in_qualifiedTypeIdent10605 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent10607 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_typeIdentSimplified_in_qualifiedTypeIdentSimplified10679 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_DOT_in_qualifiedTypeIdentSimplified10682 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_typeIdentSimplified_in_qualifiedTypeIdentSimplified10684 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_IDENT_in_typeIdent10756 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_genericTypeArgumentList_in_typeIdent10776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_typeIdentSimplified10820 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_genericTypeArgumentListSimplified_in_typeIdentSimplified10823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_primitiveType10867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_primitiveType10890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_in_primitiveType10912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_primitiveType10934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_primitiveType10956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_primitiveType10981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_primitiveType11003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_primitiveType11025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESS_THAN_in_genericTypeArgumentList11073 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004010000L});
	public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList11075 = new BitSet(new long[]{0x0000020000800000L,0x0000000000200000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_genericTypeArgumentList11078 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004010000L});
	public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList11080 = new BitSet(new long[]{0x0000020000800000L,0x0000000000200000L,0x0000000001000000L});
	public static final BitSet FOLLOW_genericTypeListClosing_in_genericTypeArgumentList11084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_genericTypeArgument11154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUESTION_in_genericTypeArgument11172 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L,0x0000000200000000L});
	public static final BitSet FOLLOW_genericWildcardBoundType_in_genericTypeArgument11174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_genericWildcardBoundType11248 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_genericWildcardBoundType11257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESS_THAN_in_genericTypeArgumentListSimplified11300 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004010000L});
	public static final BitSet FOLLOW_genericTypeArgumentSimplified_in_genericTypeArgumentListSimplified11302 = new BitSet(new long[]{0x0000020000800000L,0x0000000000200000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_genericTypeArgumentListSimplified11305 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004010000L});
	public static final BitSet FOLLOW_genericTypeArgumentSimplified_in_genericTypeArgumentListSimplified11307 = new BitSet(new long[]{0x0000020000800000L,0x0000000000200000L,0x0000000001000000L});
	public static final BitSet FOLLOW_genericTypeListClosing_in_genericTypeArgumentListSimplified11311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_genericTypeArgumentSimplified11385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUESTION_in_genericTypeArgumentSimplified11403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentList11450 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_COMMA_in_qualifiedIdentList11453 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentList11456 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_LPAREN_in_formalParameterList11505 = new BitSet(new long[]{0x0080000214400000L,0x0001000081000050L,0x0000000004100000L});
	public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList11570 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_formalParameterList11573 = new BitSet(new long[]{0x0080000214400000L,0x0001000081000050L,0x0000000004000000L});
	public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList11575 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_formalParameterList11580 = new BitSet(new long[]{0x0080000214400000L,0x0001000081000050L,0x0000000004000000L});
	public static final BitSet FOLLOW_formalParameterVarArgDecl_in_formalParameterList11582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_formalParameterVarArgDecl_in_formalParameterList11663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_formalParameterList11780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl11827 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_formalParameterStandardDecl11829 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl11831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localModifierList_in_formalParameterVarArgDecl11907 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_formalParameterVarArgDecl11909 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_ELLIPSIS_in_formalParameterVarArgDecl11911 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarArgDecl11913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier11996 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier12082 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier12086 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_annotation_in_annotationList12187 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_AT_in_annotation12280 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_annotation12285 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_annotationInit_in_annotation12287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_annotationInit12328 = new BitSet(new long[]{0x0081800614400000L,0x580B4500A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_annotationInitializers_in_annotationInit12330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_annotationInit12332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers12401 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_COMMA_in_annotationInitializers12404 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers12406 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializers12452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_annotationInitializer12525 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ASSIGN_in_annotationInitializer12528 = new BitSet(new long[]{0x0081800614400000L,0x580B4500A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializer12531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationElementValueExpression_in_annotationElementValue12578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_annotationElementValue12596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationElementValueArrayInitializer_in_annotationElementValue12614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_annotationElementValueExpression12661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_annotationElementValueArrayInitializer12733 = new BitSet(new long[]{0x0081820614400000L,0x580B4500A18000C8L,0x0020104304040021L});
	public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValueArrayInitializer12736 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_annotationElementValueArrayInitializer12739 = new BitSet(new long[]{0x0081800614400000L,0x580B4500A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValueArrayInitializer12741 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_annotationElementValueArrayInitializer12748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RCURLY_in_annotationElementValueArrayInitializer12752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_annotationTypeDeclaration12827 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_INTERFACE_in_annotationTypeDeclaration12829 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_annotationTypeDeclaration12831 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_annotationBody_in_annotationTypeDeclaration12833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_annotationBody12912 = new BitSet(new long[]{0x0480000A14400010L,0x0401000281000050L,0x00800820A4047000L});
	public static final BitSet FOLLOW_annotationScopeDeclarations_in_annotationBody12914 = new BitSet(new long[]{0x0480000A14400010L,0x0401000281000050L,0x00800820A4047000L});
	public static final BitSet FOLLOW_RCURLY_in_annotationBody12917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations12991 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_annotationScopeDeclarations12993 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_annotationScopeDeclarations13015 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_annotationScopeDeclarations13017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_annotationScopeDeclarations13019 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations13021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_annotationScopeDeclarations13024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classFieldDeclaratorList_in_annotationScopeDeclarations13082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_annotationScopeDeclarations13084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_annotationScopeDeclarations13153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_annotationDefaultValue13200 = new BitSet(new long[]{0x0081800614400000L,0x580B4500A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_annotationElementValue_in_annotationDefaultValue13203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_block13256 = new BitSet(new long[]{0x0491C00E1C500010L,0x5C0B4502A38002D8L,0x01A0396BA42C7021L});
	public static final BitSet FOLLOW_blockStatement_in_block13276 = new BitSet(new long[]{0x0491C00E1C500010L,0x5C0B4502A38002D8L,0x01A0396BA42C7021L});
	public static final BitSet FOLLOW_RCURLY_in_block13281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement13374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_blockStatement13376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_blockStatement13395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_blockStatement13415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration13471 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_localVariableDeclaration13473 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_classFieldDeclaratorList_in_localVariableDeclaration13475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement13577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_statement13605 = new BitSet(new long[]{0x0091C0061C500000L,0x580B4500A38002C8L,0x0120316B04280021L});
	public static final BitSet FOLLOW_statement_in_statement13607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSERT_in_statement13627 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_expression_in_statement13631 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_COLON_in_statement13655 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_expression_in_statement13659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_statement13661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_statement13732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement13837 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_statement13858 = new BitSet(new long[]{0x0091C0061C500000L,0x580B4500A38002C8L,0x0120316B04280021L});
	public static final BitSet FOLLOW_statement_in_statement13887 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_ELSE_in_statement13915 = new BitSet(new long[]{0x0091C0061C500000L,0x580B4500A38002C8L,0x0120316B04280021L});
	public static final BitSet FOLLOW_statement_in_statement13940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_statement14183 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_statement14212 = new BitSet(new long[]{0x0081800614400000L,0x580B4400A18000D8L,0x0020104304200021L});
	public static final BitSet FOLLOW_forInit_in_statement14234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_statement14236 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304200021L});
	public static final BitSet FOLLOW_forCondition_in_statement14240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_statement14263 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304100021L});
	public static final BitSet FOLLOW_forUpdater_in_statement14265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_statement14267 = new BitSet(new long[]{0x0091C0061C500000L,0x580B4500A38002C8L,0x0120316B04280021L});
	public static final BitSet FOLLOW_statement_in_statement14269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localModifierList_in_statement14333 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_statement14335 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_statement14337 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_COLON_in_statement14339 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_expression_in_statement14341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_statement14343 = new BitSet(new long[]{0x0091C0061C500000L,0x580B4500A38002C8L,0x0120316B04280021L});
	public static final BitSet FOLLOW_statement_in_statement14345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement14483 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_statement14512 = new BitSet(new long[]{0x0091C0061C500000L,0x580B4500A38002C8L,0x0120316B04280021L});
	public static final BitSet FOLLOW_statement_in_statement14535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_statement14613 = new BitSet(new long[]{0x0091C0061C500000L,0x580B4500A38002C8L,0x0120316B04280021L});
	public static final BitSet FOLLOW_statement_in_statement14632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_WHILE_in_statement14634 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_statement14638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_statement14659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_in_statement14736 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_block_in_statement14738 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_catches_in_statement14741 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_finallyClause_in_statement14743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finallyClause_in_statement14748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_statement14796 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_statement14817 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LCURLY_in_statement14845 = new BitSet(new long[]{0x0002000020000000L});
	public static final BitSet FOLLOW_switchBlockLabels_in_statement14879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RCURLY_in_statement14899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYNCHRONIZED_in_statement14953 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_statement14955 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_block_in_statement14957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement15010 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304200021L});
	public static final BitSet FOLLOW_expression_in_statement15032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_statement15053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROW_in_statement15095 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_expression_in_statement15097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_statement15099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_statement15172 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_IDENT_in_statement15191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_statement15194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_statement15261 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_IDENT_in_statement15284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_statement15287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_statement15331 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_COLON_in_statement15333 = new BitSet(new long[]{0x0091C0061C500000L,0x580B4500A38002C8L,0x0120316B04280021L});
	public static final BitSet FOLLOW_statement_in_statement15335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_statement15380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_statement15382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_statement15401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catchClause_in_catches15464 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_CATCH_in_catchClause15538 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClause15541 = new BitSet(new long[]{0x0080000214400000L,0x0001000081000050L,0x0000000004000000L});
	public static final BitSet FOLLOW_formalParameterStandardDecl_in_catchClause15544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClause15546 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_block_in_catchClause15549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINALLY_in_finallyClause15592 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_block_in_finallyClause15594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCaseLabels_in_switchBlockLabels15658 = new BitSet(new long[]{0x0002000020000000L});
	public static final BitSet FOLLOW_switchDefaultLabel_in_switchBlockLabels15660 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_switchCaseLabels_in_switchBlockLabels15663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCaseLabel_in_switchCaseLabels15740 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_CASE_in_switchCaseLabel15792 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_expression_in_switchCaseLabel15797 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_COLON_in_switchCaseLabel15799 = new BitSet(new long[]{0x0491C00E1C500012L,0x5C0B4502A38002D8L,0x01A0396BA4287021L});
	public static final BitSet FOLLOW_blockStatement_in_switchCaseLabel15804 = new BitSet(new long[]{0x0491C00E1C500012L,0x5C0B4502A38002D8L,0x01A0396BA4287021L});
	public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLabel15857 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_COLON_in_switchDefaultLabel15860 = new BitSet(new long[]{0x0491C00E1C500012L,0x5C0B4502A38002D8L,0x01A0396BA4287021L});
	public static final BitSet FOLLOW_blockStatement_in_switchDefaultLabel15863 = new BitSet(new long[]{0x0491C00E1C500012L,0x5C0B4502A38002D8L,0x01A0396BA4287021L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_forInit15930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit15960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_forCondition16108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forUpdater16197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedExpression16278 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_expression_in_parenthesizedExpression16281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedExpression16284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList16359 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_COMMA_in_expressionList16388 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_expression_in_expressionList16391 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_assignmentExpression_in_expression16438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression16515 = new BitSet(new long[]{0x0008000001200042L,0x0090000000000000L,0x0800000012800044L});
	public static final BitSet FOLLOW_ASSIGN_in_assignmentExpression16536 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_PLUS_ASSIGN_in_assignmentExpression16555 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_MINUS_ASSIGN_in_assignmentExpression16574 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_STAR_ASSIGN_in_assignmentExpression16593 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_DIV_ASSIGN_in_assignmentExpression16612 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_AND_ASSIGN_in_assignmentExpression16631 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_OR_ASSIGN_in_assignmentExpression16650 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_XOR_ASSIGN_in_assignmentExpression16669 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_MOD_ASSIGN_in_assignmentExpression16688 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_assignmentExpression16707 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_assignmentExpression16726 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_assignmentExpression16745 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression16773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalOrExpression_in_conditionalExpression16833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_QUESTION_in_conditionalExpression16852 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression16857 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_COLON_in_conditionalExpression16859 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression16864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression16911 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression16916 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression16921 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_logicalAndExpression16984 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression16989 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_logicalAndExpression16994 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression17059 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_inclusiveOrExpression17064 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression17069 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression17132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_XOR_in_exclusiveOrExpression17137 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression17142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression17205 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_andExpression17210 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression17215 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression17278 = new BitSet(new long[]{0x1000000000000002L,0x2000000000000000L});
	public static final BitSet FOLLOW_EQUAL_in_equalityExpression17304 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression17309 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression17336 = new BitSet(new long[]{0x1000000000000002L,0x2000000000000000L});
	public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression17403 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression17408 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_instanceOfExpression17413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression17463 = new BitSet(new long[]{0x0000000000000002L,0x0000060000300000L});
	public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression17485 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression17490 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression17495 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression17500 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression17522 = new BitSet(new long[]{0x0000000000000002L,0x0000060000300000L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression17595 = new BitSet(new long[]{0x0000000000800002L,0x0000000000000000L,0x0000000001400000L});
	public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_shiftExpression17618 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_SHIFT_RIGHT_in_shiftExpression17623 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_SHIFT_LEFT_in_shiftExpression17628 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression17652 = new BitSet(new long[]{0x0000000000800002L,0x0000000000000000L,0x0000000001400000L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression17720 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PLUS_in_additiveExpression17746 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_MINUS_in_additiveExpression17751 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression17777 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression17844 = new BitSet(new long[]{0x0004000000000002L,0x0020000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_STAR_in_multiplicativeExpression17866 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_DIV_in_multiplicativeExpression17871 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_MOD_in_multiplicativeExpression17876 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression17898 = new BitSet(new long[]{0x0004000000000002L,0x0020000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_PLUS_in_unaryExpression17969 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression17973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpression18024 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression18028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INC_in_unaryExpression18079 = new BitSet(new long[]{0x0081000614000000L,0x48030400818000C8L,0x0020104304000001L});
	public static final BitSet FOLLOW_postfixedExpression_in_unaryExpression18083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_unaryExpression18135 = new BitSet(new long[]{0x0081000614000000L,0x48030400818000C8L,0x0020104304000001L});
	public static final BitSet FOLLOW_postfixedExpression_in_unaryExpression18139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression18188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpressionNotPlusMinus18233 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus18237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOGICAL_NOT_in_unaryExpressionNotPlusMinus18289 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus18293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_unaryExpressionNotPlusMinus18356 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_unaryExpressionNotPlusMinus18360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_unaryExpressionNotPlusMinus18362 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus18366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixedExpression_in_unaryExpressionNotPlusMinus18415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_postfixedExpression18484 = new BitSet(new long[]{0x0020800000000002L,0x0000008020000000L});
	public static final BitSet FOLLOW_DOT_in_postfixedExpression18570 = new BitSet(new long[]{0x0000000000000000L,0x0800040001000000L,0x0000004200000000L});
	public static final BitSet FOLLOW_genericTypeArgumentListSimplified_in_postfixedExpression18628 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_postfixedExpression18726 = new BitSet(new long[]{0x0020800000000002L,0x0002008020000000L});
	public static final BitSet FOLLOW_arguments_in_postfixedExpression18821 = new BitSet(new long[]{0x0020800000000002L,0x0000008020000000L});
	public static final BitSet FOLLOW_THIS_in_postfixedExpression18936 = new BitSet(new long[]{0x0020800000000002L,0x0000008020000000L});
	public static final BitSet FOLLOW_SUPER_in_postfixedExpression19007 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_postfixedExpression19009 = new BitSet(new long[]{0x0020800000000002L,0x0000008020000000L});
	public static final BitSet FOLLOW_SUPER_in_postfixedExpression19070 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_DOT_in_postfixedExpression19074 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_postfixedExpression19076 = new BitSet(new long[]{0x0020800000000002L,0x0002008020000000L});
	public static final BitSet FOLLOW_arguments_in_postfixedExpression19159 = new BitSet(new long[]{0x0020800000000002L,0x0000008020000000L});
	public static final BitSet FOLLOW_innerNewExpression_in_postfixedExpression19271 = new BitSet(new long[]{0x0020800000000002L,0x0000008020000000L});
	public static final BitSet FOLLOW_LBRACK_in_postfixedExpression19344 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_expression_in_postfixedExpression19346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RBRACK_in_postfixedExpression19348 = new BitSet(new long[]{0x0020800000000002L,0x0000008020000000L});
	public static final BitSet FOLLOW_INC_in_postfixedExpression19433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_postfixedExpression19483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression19578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primaryExpression19598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newExpression_in_primaryExpression19617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedIdentExpression_in_primaryExpression19637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericTypeArgumentListSimplified_in_primaryExpression19720 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000004200000000L});
	public static final BitSet FOLLOW_SUPER_in_primaryExpression19743 = new BitSet(new long[]{0x0020000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_primaryExpression19769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression19837 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression19839 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_primaryExpression19841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression19926 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_primaryExpression19945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_primaryExpression20008 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_primaryExpression20010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_primaryExpression20091 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_primaryExpression20175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_in_primaryExpression20256 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_primaryExpression20258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_in_primaryExpression20322 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression20324 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression20326 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_primaryExpression20366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_primaryExpression20549 = new BitSet(new long[]{0x0020000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_arrayDeclarator_in_primaryExpression20624 = new BitSet(new long[]{0x0020000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression20703 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_CLASS_in_primaryExpression20705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_primaryExpression20773 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression20775 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_CLASS_in_primaryExpression20777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentExpression20889 = new BitSet(new long[]{0x0020000000000002L,0x0002008000000000L});
	public static final BitSet FOLLOW_arrayDeclarator_in_qualifiedIdentExpression21000 = new BitSet(new long[]{0x0020000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_DOT_in_qualifiedIdentExpression21109 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_CLASS_in_qualifiedIdentExpression21111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arguments_in_qualifiedIdentExpression21220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_qualifiedIdentExpression21276 = new BitSet(new long[]{0x0000000800000000L,0x0800040000000000L,0x0000004200000000L});
	public static final BitSet FOLLOW_CLASS_in_qualifiedIdentExpression21302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericTypeArgumentListSimplified_in_qualifiedIdentExpression21398 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SUPER_in_qualifiedIdentExpression21431 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_qualifiedIdentExpression21433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_in_qualifiedIdentExpression21520 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_DOT_in_qualifiedIdentExpression21524 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedIdentExpression21526 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_qualifiedIdentExpression21528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedIdentExpression21614 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_qualifiedIdentExpression21616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_qualifiedIdentExpression21716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_in_qualifiedIdentExpression21779 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_qualifiedIdentExpression21781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_innerNewExpression_in_qualifiedIdentExpression21843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_newExpression21963 = new BitSet(new long[]{0x0080000214000000L,0x0001040081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_primitiveType_in_newExpression21987 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_newArrayConstruction_in_newExpression21989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericTypeArgumentListSimplified_in_newExpression22049 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_qualifiedTypeIdentSimplified_in_newExpression22052 = new BitSet(new long[]{0x0000000000000000L,0x0002008000000000L});
	public static final BitSet FOLLOW_newArrayConstruction_in_newExpression22078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arguments_in_newExpression22159 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_classBody_in_newExpression22161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_innerNewExpression22316 = new BitSet(new long[]{0x0000000000000000L,0x0000040001000000L});
	public static final BitSet FOLLOW_genericTypeArgumentListSimplified_in_innerNewExpression22318 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_innerNewExpression22321 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_innerNewExpression22323 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_classBody_in_innerNewExpression22325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction22403 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_arrayInitializer_in_newArrayConstruction22405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_newArrayConstruction22423 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_expression_in_newArrayConstruction22426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RBRACK_in_newArrayConstruction22428 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_LBRACK_in_newArrayConstruction22432 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_expression_in_newArrayConstruction22435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RBRACK_in_newArrayConstruction22437 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction22442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_arguments22486 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304100021L});
	public static final BitSet FOLLOW_expressionList_in_arguments22523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_arguments22527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_literal22597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_THAN_in_synpred16_Java7162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHIFT_RIGHT_in_synpred17_Java7180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_synpred18_Java7198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bound_in_synpred19_Java7259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_synpred34_Java8213 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_block_in_synpred34_Java8215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_synpred44_Java8268 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0020000004000000L});
	public static final BitSet FOLLOW_type_in_synpred44_Java8297 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_synpred44_Java8329 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_synpred44_Java8331 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_synpred44_Java8333 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_synpred44_Java8336 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_block_in_synpred44_Java8340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_synpred44_Java8344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_synpred44_Java8427 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_synpred44_Java8429 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_synpred44_Java8431 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_synpred44_Java8433 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_block_in_synpred44_Java8437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_synpred44_Java8441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_synpred44_Java8516 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_synpred44_Java8518 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_throwsClause_in_synpred44_Java8520 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_block_in_synpred44_Java8523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifierList_in_synpred45_Java8246 = new BitSet(new long[]{0x0080000214000000L,0x0001040081000040L,0x0020000004000000L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_synpred45_Java8268 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0020000004000000L});
	public static final BitSet FOLLOW_type_in_synpred45_Java8297 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_synpred45_Java8329 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_synpred45_Java8331 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_synpred45_Java8333 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_synpred45_Java8336 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_block_in_synpred45_Java8340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_synpred45_Java8344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_synpred45_Java8427 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_synpred45_Java8429 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_synpred45_Java8431 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_synpred45_Java8433 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_block_in_synpred45_Java8437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_synpred45_Java8441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_synpred45_Java8516 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_synpred45_Java8518 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_throwsClause_in_synpred45_Java8520 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_block_in_synpred45_Java8523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred45_Java8611 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_classFieldDeclaratorList_in_synpred45_Java8613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_synpred45_Java8615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred46_Java8684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_synpred52_Java8780 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0020000004000000L});
	public static final BitSet FOLLOW_type_in_synpred52_Java8807 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_synpred52_Java8809 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_synpred52_Java8811 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_synpred52_Java8813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_synpred52_Java8816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_synpred52_Java8819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_synpred52_Java8893 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_synpred52_Java8895 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_synpred52_Java8897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_synpred52_Java8899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_synpred52_Java8902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifierList_in_synpred53_Java8758 = new BitSet(new long[]{0x0080000214000000L,0x0001040081000040L,0x0020000004000000L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_synpred53_Java8780 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0020000004000000L});
	public static final BitSet FOLLOW_type_in_synpred53_Java8807 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_synpred53_Java8809 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_synpred53_Java8811 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_synpred53_Java8813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_synpred53_Java8816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_synpred53_Java8819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_synpred53_Java8893 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_synpred53_Java8895 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formalParameterList_in_synpred53_Java8897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000200000L});
	public static final BitSet FOLLOW_throwsClause_in_synpred53_Java8899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_synpred53_Java8902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred53_Java8989 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_interfaceFieldDeclaratorList_in_synpred53_Java8991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_synpred53_Java8993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred54_Java9062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDeclarator_in_synpred60_Java9638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_synpred78_Java10375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_synpred79_Java10456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred81_Java10605 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_typeIdent_in_synpred81_Java10607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred92_Java11078 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004010000L});
	public static final BitSet FOLLOW_genericTypeArgument_in_synpred92_Java11080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericWildcardBoundType_in_synpred94_Java11174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred99_Java11573 = new BitSet(new long[]{0x0080000214400000L,0x0001000081000050L,0x0000000004000000L});
	public static final BitSet FOLLOW_formalParameterStandardDecl_in_synpred99_Java11575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameterStandardDecl_in_synpred101_Java11570 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred101_Java11573 = new BitSet(new long[]{0x0080000214400000L,0x0001000081000050L,0x0000000004000000L});
	public static final BitSet FOLLOW_formalParameterStandardDecl_in_synpred101_Java11575 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred101_Java11580 = new BitSet(new long[]{0x0080000214400000L,0x0001000081000050L,0x0000000004000000L});
	public static final BitSet FOLLOW_formalParameterVarArgDecl_in_synpred101_Java11582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameterVarArgDecl_in_synpred102_Java11663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred103_Java12082 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_synpred103_Java12086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_synpred104_Java12187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationInit_in_synpred105_Java12287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifierList_in_synpred116_Java12991 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_synpred116_Java12993 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_synpred116_Java13015 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred116_Java13017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred116_Java13019 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_annotationDefaultValue_in_synpred116_Java13021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_synpred116_Java13024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classFieldDeclaratorList_in_synpred116_Java13082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_synpred116_Java13084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_synpred118_Java13374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_synpred118_Java13376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred119_Java13395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred124_Java13915 = new BitSet(new long[]{0x0091C0061C500000L,0x580B4500A38002C8L,0x0120316B04280021L});
	public static final BitSet FOLLOW_statement_in_synpred124_Java13940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_synpred126_Java14234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_synpred126_Java14236 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304200021L});
	public static final BitSet FOLLOW_forCondition_in_synpred126_Java14240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_in_synpred126_Java14263 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304100021L});
	public static final BitSet FOLLOW_forUpdater_in_synpred126_Java14265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred126_Java14267 = new BitSet(new long[]{0x0091C0061C500000L,0x580B4500A38002C8L,0x0120316B04280021L});
	public static final BitSet FOLLOW_statement_in_synpred126_Java14269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCaseLabel_in_synpred146_Java15740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_synpred149_Java15930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_synpred150_Java15960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred193_Java18356 = new BitSet(new long[]{0x0080000214000000L,0x0001000081000040L,0x0000000004000000L});
	public static final BitSet FOLLOW_type_in_synpred193_Java18360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred193_Java18362 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_unaryExpression_in_synpred193_Java18366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDeclarator_in_synpred221_Java21000 = new BitSet(new long[]{0x0020000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_DOT_in_synpred221_Java21109 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_CLASS_in_synpred221_Java21111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred229_Java21276 = new BitSet(new long[]{0x0000000800000000L,0x0800040000000000L,0x0000004200000000L});
	public static final BitSet FOLLOW_CLASS_in_synpred229_Java21302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericTypeArgumentListSimplified_in_synpred229_Java21398 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SUPER_in_synpred229_Java21431 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_synpred229_Java21433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_in_synpred229_Java21520 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_DOT_in_synpred229_Java21524 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_synpred229_Java21526 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_synpred229_Java21528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_synpred229_Java21614 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_synpred229_Java21616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_synpred229_Java21716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_in_synpred229_Java21779 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_arguments_in_synpred229_Java21781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_innerNewExpression_in_synpred229_Java21843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_synpred237_Java22432 = new BitSet(new long[]{0x0081800614000000L,0x580B4400A18000C8L,0x0020104304000021L});
	public static final BitSet FOLLOW_expression_in_synpred237_Java22435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RBRACK_in_synpred237_Java22437 = new BitSet(new long[]{0x0000000000000002L});
}
