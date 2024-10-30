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
         
        grammar Java;
        
options {
            backtrack = true; 
            memoize = true;
            output = AST;
            ASTLabelType = CommonTree;
        }
        

        
tokens {
        
    // operators and other special chars
            
            AND                     = '&'               ;
            AND_ASSIGN              = '&='              ;
            ASSIGN                  = '='               ;
            AT                      = '@'               ;
            BIT_SHIFT_RIGHT         = '>>>'             ;
            BIT_SHIFT_RIGHT_ASSIGN  = '>>>='            ;
            COLON                   = ':'               ;
            COMMA                   = ','               ;
            DEC                     = '--'              ;
            DIV                     = '/'               ;
            DIV_ASSIGN              = '/='              ;
            DOT                     = '.'               ;
            DOTSTAR                 = '.*'              ;
            ELLIPSIS                = '...'             ;
            EQUAL                   = '=='              ;
            GREATER_OR_EQUAL        = '>='              ;
            GREATER_THAN            = '>'               ;
            INC                     = '++'              ;
            LBRACK                  = '['               ;
            LCURLY                  = '{'               ;
            LESS_OR_EQUAL           = '<='              ;
            LESS_THAN               = '<'               ;
            LOGICAL_AND             = '&&'              ;
            LOGICAL_NOT             = '!'               ;
            LOGICAL_OR              = '||'              ;
            LPAREN                  = '('               ;
            MINUS                   = '-'               ;
            MINUS_ASSIGN            = '-='              ;
            MOD                     = '%'               ;
            MOD_ASSIGN              = '%='              ;
            NOT                     = '~'               ;
            NOT_EQUAL               = '!='              ;
            OR                      = '|'               ;
            OR_ASSIGN               = '|='              ;
            PLUS                    = '+'               ;
            PLUS_ASSIGN             = '+='              ;
            QUESTION                = '?'               ;
            RBRACK                  = ']'               ;
            RCURLY                  = '}'               ;
            RPAREN                  = ')'               ;
            SEMI                    = ';'               ;
            SHIFT_LEFT              = '<<'              ;
            SHIFT_LEFT_ASSIGN       = '<<='             ;
            SHIFT_RIGHT             = '>>'              ;
            SHIFT_RIGHT_ASSIGN      = '>>='             ;
            STAR                    = '*'               ;
            STAR_ASSIGN             = '*='              ;
            XOR                     = '^'               ;
            XOR_ASSIGN              = '^='              ;

        
    // keywords
            
            ABSTRACT                = 'abstract'        ;
            ASSERT                  = 'assert'          ;
            BOOLEAN                 = 'boolean'         ;
            BREAK                   = 'break'           ;
            BYTE                    = 'byte'            ;
            CASE                    = 'case'            ;
            CATCH                   = 'catch'           ;
            CHAR                    = 'char'            ;
            CLASS                   = 'class'           ;
            CONTINUE                = 'continue'        ;
            DEFAULT                 = 'default'         ;
            DO                      = 'do'              ;
            DOUBLE                  = 'double'          ;
            ELSE                    = 'else'            ;
            ENUM                    = 'enum'            ;
            EXTENDS                 = 'extends'         ;
            FALSE                   = 'false'           ;
            FINAL                   = 'final'           ;
            FINALLY                 = 'finally'         ;
            FLOAT                   = 'float'           ;
            FOR                     = 'for'             ;
            IF                      = 'if'              ;
            IMPLEMENTS              = 'implements'      ;
            INSTANCEOF              = 'instanceof'      ;
            INTERFACE               = 'interface'       ;
            IMPORT                  = 'import'          ;
            INT                     = 'int'             ;
            LONG                    = 'long'            ;
            NATIVE                  = 'native'          ;
            NEW                     = 'new'             ;
            NULL                    = 'null'            ;
            PACKAGE                 = 'package'         ;
            PRIVATE                 = 'private'         ;
            PROTECTED               = 'protected'       ;
            PUBLIC                  = 'public'          ;
            RETURN                  = 'return'          ;
            SHORT                   = 'short'           ;
            STATIC                  = 'static'          ;
            STRICTFP                = 'strictfp'        ;
            SUPER                   = 'super'           ;
            SWITCH                  = 'switch'          ;
            SYNCHRONIZED            = 'synchronized'    ;
            THIS                    = 'this'            ;
            THROW                   = 'throw'           ;
            THROWS                  = 'throws'          ;
            TRANSIENT               = 'transient'       ;
            TRUE                    = 'true'            ;
            TRY                     = 'try'             ;
            VOID                    = 'void'            ;
            VOLATILE                = 'volatile'        ;
            WHILE                   = 'while'           ;
            
            // tokens for imaginary nodes
            
            ANNOTATION_INIT_ARRAY_ELEMENT;
            ANNOTATION_INIT_BLOCK;
            ANNOTATION_INIT_DEFAULT_KEY;
            ANNOTATION_INIT_KEY_LIST;
            ANNOTATION_LIST;
            ANNOTATION_METHOD_DECL;
            ANNOTATION_SCOPE;
            ANNOTATION_TOP_LEVEL_SCOPE;
            ARGUMENT_LIST;
            ARRAY_DECLARATOR;
            ARRAY_DECLARATOR_LIST;
            ARRAY_ELEMENT_ACCESS;
            ARRAY_INITIALIZER;
            BLOCK_SCOPE;
            CAST_EXPR;
            CATCH_CLAUSE_LIST;
            CLASS_CONSTRUCTOR_CALL;
            CLASS_INSTANCE_INITIALIZER;
            CLASS_STATIC_INITIALIZER;
            CLASS_TOP_LEVEL_SCOPE;
            CONSTRUCTOR_DECL;
            ENUM_TOP_LEVEL_SCOPE;
            EXPR;
            EXTENDS_BOUND_LIST;
            EXTENDS_CLAUSE;
            FOR_CONDITION;
            FOR_EACH;
            FOR_INIT;
            FOR_UPDATE;
            FORMAL_PARAM_LIST;
            FORMAL_PARAM_STD_DECL;
            FORMAL_PARAM_VARARG_DECL;
            FUNCTION_METHOD_DECL;
            GENERIC_TYPE_ARG_LIST;
            GENERIC_TYPE_PARAM_LIST;
            INTERFACE_TOP_LEVEL_SCOPE;
            IMPLEMENTS_CLAUSE;
            LABELED_STATEMENT;
            LOCAL_MODIFIER_LIST;
            JAVA_SOURCE;
            METHOD_CALL;
            MODIFIER_LIST;
            PARENTESIZED_EXPR;
            POST_DEC;
            POST_INC;
            PRE_DEC;
            PRE_INC;
            QUALIFIED_TYPE_IDENT;
            STATIC_ARRAY_CREATOR;
            SUPER_CONSTRUCTOR_CALL;
            SWITCH_BLOCK_LABEL_LIST;
            THIS_CONSTRUCTOR_CALL;
            THROWS_CLAUSE;
            TYPE;
            UNARY_MINUS;
            UNARY_PLUS;
            VAR_DECLARATION;
            VAR_DECLARATOR;
            VAR_DECLARATOR_LIST;
            VOID_METHOD_DECL;
        }
        
@header {
  package edu.usu.polyverse.grammar;
  import java.util.Iterator;
}
        
@members {
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
        }
        
@lexer::header {
        package edu.usu.polyverse.grammar;
        }
        
@lexer::members {
        /** 
         *  Determines if whitespaces and comments should be preserved or thrown away.
         *
         *  If <code>true</code> whitespaces and comments will be preserved within the
         *  hidden channel, otherwise the appropriate tokens will be skiped. This is
         *  a 'little bit' expensive, of course. If only one of the two behaviours is
         *  needed forever the lexer part of the grammar should be changed by replacing 
         *  the 'if-else' stuff within the approprate lexer grammar actions.
         */
        public boolean preserveWhitespacesAndComments = true;
        }
        
/*
        @rulecatch 
        {        catch(RecognitionException re)         { throw re; } }
        */
        
// Starting point for parsing a Java file.
javaSource
            :   compilationUnit
                ->  ^(JAVA_SOURCE compilationUnit)
            ;
        
compilationUnit
            :   
  {
    symbolTable.enterScope();
    metaVarStack.push("metaDefault");
    metaPairStack.push("metaPairDefault");
  }
                annotationList 
                packageDeclaration? 
                importDeclaration* 
                typeDecls*
  { 
    //System.out.println("last metaVarStack "+metaVarStack.peek());
    //System.out.println("last metaPairStack "+metaPairStack.peek());
    metaPairStack.pop();
    metaVarStack.pop();
    symbolTable.exitScope();
  }
            ;
        
typeDecls
            :   typeDeclaration
            |   polyverseDeclaration
            |   SEMI!
            ;
        
packageDeclaration
            :   PACKAGE^  qualifiedIdentifier SEMI!  
            ;
            
        importDeclaration
            :   IMPORT^ STATIC? qualifiedIdentifier DOTSTAR? SEMI! 
  {
    tokens.insertBefore($IMPORT,"import edu.usu.polyverse.*;\n");
  }
            ;
            
polyverseDeclaration 
            :   POLYVERSEENTER
  {/*-----*/ // Enters a polyverse scope
    PolyverseScope.enterPolyverseScope();
  /*-----*/}
                typeDeclaration*  
                POLYVERSEEXIT
  {/*-----*/ // Exit a polyverse scope
    PolyverseScope.exitPolyverseScope();
  /*-----*/}
            ;
 
typeDeclaration
            :   modifierList!
                (   classTypeDeclaration[$modifierList.tree]
                |   interfaceTypeDeclaration[$modifierList.tree]
                |   enumTypeDeclaration[$modifierList.tree]
                |   annotationTypeDeclaration[$modifierList.tree]
                )
            ;
            
classTypeDeclaration[CommonTree modifiers]
            :   CLASS IDENT genericTypeParameterList? classExtendsClause? implementsClause? classBody
                ->  ^(CLASS {$modifiers} IDENT genericTypeParameterList? classExtendsClause? implementsClause? classBody)
            ;
            
classExtendsClause
            :   EXTENDS type
                ->  ^(EXTENDS_CLAUSE[$EXTENDS, "EXTENDS_CLAUSE"] type)
            ;   
            
interfaceExtendsClause
            :   EXTENDS typeList
                ->  ^(EXTENDS_CLAUSE[$EXTENDS, "EXTENDS_CLAUSE"] typeList)
            ;   
            
implementsClause
            :   IMPLEMENTS typeList
                ->  ^(IMPLEMENTS_CLAUSE[$IMPLEMENTS, "IMPLEMENTS_CLAUSE"] typeList)
            ;
                
genericTypeParameterList
            :   LESS_THAN genericTypeParameter (COMMA genericTypeParameter)* genericTypeListClosing
                ->  ^(GENERIC_TYPE_PARAM_LIST[$LESS_THAN, "GENERIC_TYPE_PARAM_LIST"] genericTypeParameter+)
            ;
        
genericTypeListClosing  // This 'trick' is fairly dirty - if there's some time a better solution should 
                                // be found to resolve the problem with nested generic type parameter lists 
                                // (i.e. <T1 extends AnyType<T2>> for generic type parameters or <T1<T2>> for 
                                // generic type arguments etc). 
            :   GREATER_THAN
            |   SHIFT_RIGHT
            |   BIT_SHIFT_RIGHT
            |   // nothing
            ;
        
genericTypeParameter 
            : IDENT bound?
                ->  ^(IDENT bound?)
            ;
                
bound            
            : EXTENDS type (AND type)*
                ->  ^(EXTENDS_BOUND_LIST[$EXTENDS, "EXTENDS_BOUND_LIST"] type+)
            ;
        
enumTypeDeclaration[CommonTree modifiers]
            :   ENUM IDENT implementsClause? enumBody
                ->  ^(ENUM {$modifiers} IDENT implementsClause? enumBody)
            ;
            
enumBody
            :   LCURLY {symbolTable.enterScope();}enumScopeDeclarations {symbolTable.exitScope();} RCURLY 
                ->  ^(ENUM_TOP_LEVEL_SCOPE[$LCURLY, "ENUM_TOP_LEVEL_SCOPE"] enumScopeDeclarations)
            ;
        
enumScopeDeclarations
            :   enumConstants (COMMA!)? enumClassScopeDeclarations?
            ;
        
enumClassScopeDeclarations
            :   SEMI classScopeDeclarations*
                ->  ^(CLASS_TOP_LEVEL_SCOPE[$SEMI, "CLASS_TOP_LEVEL_SCOPE"] classScopeDeclarations*)
            ;
        
enumConstants
            :   enumConstant (COMMA! enumConstant)*
            ;
            
enumConstant
            :   annotationList IDENT^ arguments? classBody?
            ;
            
interfaceTypeDeclaration[CommonTree modifiers]
            :   INTERFACE IDENT genericTypeParameterList? interfaceExtendsClause? interfaceBody
                ->  ^(INTERFACE {$modifiers} IDENT genericTypeParameterList? interfaceExtendsClause? interfaceBody)
            ;
            
typeList
            :   type (COMMA! type)*
            ;
            
classBody
            :   LCURLY 
  {
    symbolTable.enterScope();  
    String defaultName = "defaultPolyverse";
    metaVarStack.push(defaultName);
    metaPairStack.push(defaultName);
    tokens.insertAfter($LCURLY,"\n static Polyverse " + defaultName + " = new Polyverse();\n");
  } 
                 classScopeDeclarations* 
  {
    metaVarStack.pop();
    metaPairStack.pop();
    symbolTable.exitScope();
  }
                 RCURLY
                ->  ^(CLASS_TOP_LEVEL_SCOPE[$LCURLY, "CLASS_TOP_LEVEL_SCOPE"] classScopeDeclarations*)
            ;
            
interfaceBody
            :   LCURLY {symbolTable.enterScope();} interfaceScopeDeclarations* {symbolTable.exitScope();}RCURLY
                ->  ^(INTERFACE_TOP_LEVEL_SCOPE[$LCURLY, "CLASS_TOP_LEVEL_SCOPE"] interfaceScopeDeclarations*)
            ;
        
classScopeDeclarations
            :   block           ->  ^(CLASS_INSTANCE_INITIALIZER block)
            |   STATIC block    ->  ^(CLASS_STATIC_INITIALIZER[$STATIC, "CLASS_STATIC_INITIALIZER"] block)
            |   modifierList
                (   genericTypeParameterList?
                    (   q=type 
  {
    if (PolyverseScope.isPolyverse()) returnType=$q.text /*ident*/;
  } 
                        IDENT formalParameterList arrayDeclaratorList? throwsClause? (block | SEMI) 
  {
    metaVarStack.pop();
  }
                        ->  ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause? block?)
                    |   VOID IDENT formalParameterList throwsClause? (block | SEMI)
                        ->  ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause? block?)
                    |   id=IDENT formalParameterList throwsClause? block
                        ->  ^(CONSTRUCTOR_DECL[$id, "CONSTRUCTOR_DECL"] modifierList genericTypeParameterList? formalParameterList throwsClause? block)
                    )
                |   type classFieldDeclaratorList SEMI
                    ->  ^(VAR_DECLARATION modifierList type classFieldDeclaratorList)
                )
            |   typeDeclaration
            |   SEMI!
            ;
                    
interfaceScopeDeclarations
            :   modifierList
                (   genericTypeParameterList?
                    (   type IDENT formalParameterList arrayDeclaratorList? throwsClause? SEMI
                        ->  ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause?)
                    |   VOID IDENT formalParameterList throwsClause? SEMI
                        ->  ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause?)
                    )
                |   type interfaceFieldDeclaratorList SEMI
                    ->  ^(VAR_DECLARATION modifierList type interfaceFieldDeclaratorList)
                )
            |   typeDeclaration
            |   SEMI!
            ;
        
classFieldDeclaratorList
            :   q=classFieldDeclarator (COMMA classFieldDeclarator)*
                ->  ^(VAR_DECLARATOR_LIST classFieldDeclarator+)
            ;
        
classFieldDeclarator
            :   variableDeclaratorId (ASSIGN variableInitializer)?
                ->  ^(VAR_DECLARATOR variableDeclaratorId variableInitializer?)
            ;
            
interfaceFieldDeclaratorList
            :   interfaceFieldDeclarator (COMMA interfaceFieldDeclarator)*
                ->  ^(VAR_DECLARATOR_LIST interfaceFieldDeclarator+)
            ;
        
interfaceFieldDeclarator
            :   variableDeclaratorId ASSIGN variableInitializer
                ->  ^(VAR_DECLARATOR variableDeclaratorId variableInitializer)
            ;
            
        variableDeclaratorId
            :   q=IDENT^ 
  {
    if (PolyverseScope.isPolyverse()) {
      symbolTable.addId($q.text,true);
    } else {
      symbolTable.addId($q.text,false);
    }
  } 
        arrayDeclaratorList?
            ;
        
variableInitializer
            :   arrayInitializer
            |   expression
            ;
        
arrayDeclarator
            :   LBRACK RBRACK
                ->  ^(ARRAY_DECLARATOR)
            ;
        
arrayDeclaratorList
            :   arrayDeclarator+
                ->  ^(ARRAY_DECLARATOR_LIST arrayDeclarator+)   
            ;
            
        arrayInitializer
            :   LCURLY (variableInitializer (COMMA variableInitializer)* COMMA?)? RCURLY
                ->  ^(ARRAY_INITIALIZER[$LCURLY, "ARRAY_INITIALIZER"] variableInitializer*)
            ;
        
throwsClause
            :   THROWS qualifiedIdentList
                ->  ^(THROWS_CLAUSE[$THROWS, "THROWS_CLAUSE"] qualifiedIdentList)
            ;
        
modifierList
            :   modifier*   
                ->  ^(MODIFIER_LIST modifier*)
            ;
        
modifier
            :   PUBLIC
            |   PROTECTED
            |   PRIVATE
            |   STATIC
            |   ABSTRACT
            |   NATIVE
            |   SYNCHRONIZED
            |   TRANSIENT
            |   VOLATILE
            |   STRICTFP
            |   localModifier
            ;
        
localModifierList
            :   localModifier*
                -> ^(LOCAL_MODIFIER_LIST localModifier*)
            ;
            
localModifier
            :   FINAL
            |   annotation
            ;
        
type
            :   simpleType
            |   objectType
            ;
        
simpleType // including static arrays of simple type elements
            :   primitiveType arrayDeclaratorList?
                ->  ^(TYPE primitiveType arrayDeclaratorList?)  
            ;
            
objectType // including static arrays of object type reference elements
            :   qualifiedTypeIdent arrayDeclaratorList?
                ->  ^(TYPE qualifiedTypeIdent arrayDeclaratorList?)
            ;
        
objectTypeSimplified
            :   qualifiedTypeIdentSimplified arrayDeclaratorList?
                ->  ^(TYPE qualifiedTypeIdentSimplified arrayDeclaratorList?)
            ;
        
qualifiedTypeIdent
            :   typeIdent (DOT typeIdent)*
                ->  ^(QUALIFIED_TYPE_IDENT typeIdent+) 
            ;
        
qualifiedTypeIdentSimplified
            :   typeIdentSimplified (DOT typeIdentSimplified)*
                ->  ^(QUALIFIED_TYPE_IDENT typeIdentSimplified+) 
            ;
        
typeIdent
            :   IDENT^ 
  {
    if (PolyverseScope.isPolyverse()) {
      tokens.replace($IDENT, "polyverse." + $IDENT.text);
    }
  }
            genericTypeArgumentList?
            ;
        
typeIdentSimplified
            :   IDENT^ genericTypeArgumentListSimplified?
            ;
        
primitiveType
            :   BOOLEAN 
  { if (PolyverseScope.isPolyverse()) { tokens.replace($BOOLEAN, "polyverse.scalar.Boolean"); } }
            |   CHAR
  { if (PolyverseScope.isPolyverse()) { tokens.replace($CHAR, "polyverse.scalar.Char"); } }
            |   BYTE
  { if (PolyverseScope.isPolyverse()) { tokens.replace($BYTE, "polyverse.scalar.Byte"); } }
            |   SHORT
  { if (PolyverseScope.isPolyverse()) { tokens.replace($SHORT, "polyverse.scalar.Short"); } }
            |   INT   
  { if (PolyverseScope.isPolyverse()) { tokens.replace($INT, "polyverse.scalar.Integer"); } }
            |   LONG
  { if (PolyverseScope.isPolyverse()) { tokens.replace($LONG, "polyverse.scalar.Long"); } }
            |   FLOAT
  { if (PolyverseScope.isPolyverse()) { tokens.replace($FLOAT, "polyverse.scalar.Float"); } }
            |   DOUBLE
  { if (PolyverseScope.isPolyverse()) { tokens.replace($DOUBLE, "polyverse.scalar.Double"); } }
            ;
        

genericTypeArgumentList
            :   LESS_THAN genericTypeArgument (COMMA genericTypeArgument)* genericTypeListClosing
                ->  ^(GENERIC_TYPE_ARG_LIST[$LESS_THAN, "GENERIC_TYPE_ARG_LIST"] genericTypeArgument+)
            ;
        
genericTypeArgument
            :   type
            |   QUESTION genericWildcardBoundType?
                ->  ^(QUESTION genericWildcardBoundType?)
            ;
            
genericWildcardBoundType
            :   (EXTENDS | SUPER)^ type
            ;
        
genericTypeArgumentListSimplified
            :   LESS_THAN genericTypeArgumentSimplified (COMMA genericTypeArgumentSimplified)* genericTypeListClosing
                ->  ^(GENERIC_TYPE_ARG_LIST[$LESS_THAN, "GENERIC_TYPE_ARG_LIST"] genericTypeArgumentSimplified+)
            ;
            
genericTypeArgumentSimplified
            :   type
            |   QUESTION
            ;
            
qualifiedIdentList
            :   qualifiedIdentifier (COMMA! qualifiedIdentifier)*
            ;
            
formalParameterList
            :   LPAREN 
                (   
  { 
    if (PolyverseScope.isPolyverse()) {
      String name = newPolyverseVar();
      metaVarStack.push(name);
      tokens.insertAfter($LPAREN, "Polyverse " + name + ",");
      //isPolyverse = false;
      methodBlock = true;
    }
  }
                // Contains at least one standard argument declaration and optionally a variable argument declaration.
                    formalParameterStandardDecl (COMMA formalParameterStandardDecl)* (COMMA formalParameterVarArgDecl)? 
                    ->  ^(FORMAL_PARAM_LIST[$LPAREN, "FORMAL_PARAM_LIST"] formalParameterStandardDecl+ formalParameterVarArgDecl?) 
                    // Contains a variable argument declaration only.
                |   formalParameterVarArgDecl
                    ->  ^(FORMAL_PARAM_LIST[$LPAREN, "FORMAL_PARAM_LIST"] formalParameterVarArgDecl) 
                    // Contains nothing.
                |   ->  ^(FORMAL_PARAM_LIST[$LPAREN, "FORMAL_PARAM_LIST"]) 
                )
                RPAREN
            ;
            
formalParameterStandardDecl
            :   localModifierList type variableDeclaratorId
                ->  ^(FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId)
            ;
            
formalParameterVarArgDecl
            :   localModifierList type ELLIPSIS variableDeclaratorId
                ->  ^(FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId)
            ;
            
qualifiedIdentifier 
            :   (   i=IDENT    
  {
    if (PolyverseScope.isPolyverse()) {
      symbolTable.addId($i.text,true);
    } else {
      symbolTable.addId($i.text,false);
    }        
  }           
                      ->  IDENT
                )
                (   DOT ident=IDENT     ->  ^(DOT $qualifiedIdentifier $ident)
                )*
            ;
            
        // ANNOTATIONS
        
annotationList
            :   annotation*
                ->  ^(ANNOTATION_LIST annotation*)
            ;
        
annotation
            :   
  /*POLYVERSE {
    PolyverseScope.isPolyverse() = true;
    System.out.println("asdfjklsdfajklsdfajkljklsdfa");
 } |  */ 
                (AT^ q=qualifiedIdentifier annotationInit?) 
  {
    //System.out.println("IN ");
    if ($q.text.equals("Polyverse")) {
      PolyverseScope.enterPolyverseScope();
      //PolyverseScope.isPolyverse() = true;
      //temp = true;
      //System.out.println("IN ");
      if ($annotationInit.text !=null) {
        tokens.replace($AT.getTokenIndex(),$annotationInit.stop.getTokenIndex(),"");
      } else {
        tokens.replace($AT.getTokenIndex(),$q.stop.getTokenIndex(),"");
      }
      //System.out.println("OUT ");
    }
 }
            ;
annotationInit
            :   LPAREN annotationInitializers RPAREN
                ->  ^(ANNOTATION_INIT_BLOCK[$LPAREN, "ANNOTATION_INIT_BLOCK"] annotationInitializers)
            ;
        
annotationInitializers
            :   annotationInitializer (COMMA annotationInitializer)*
                ->  ^(ANNOTATION_INIT_KEY_LIST annotationInitializer+)
            |   annotationElementValue // implicite initialization of the annotation field 'value'
                ->  ^(ANNOTATION_INIT_DEFAULT_KEY annotationElementValue)
            ;
            
annotationInitializer
            :   IDENT^ ASSIGN! annotationElementValue
            ;
            
annotationElementValue
            :   annotationElementValueExpression
            |   annotation
            |   annotationElementValueArrayInitializer
            ;
            
annotationElementValueExpression
            :   conditionalExpression
                ->  ^(EXPR conditionalExpression)
            ;
            
annotationElementValueArrayInitializer
            :   LCURLY (annotationElementValue (COMMA annotationElementValue)*)? (COMMA)? RCURLY
                ->  ^(ANNOTATION_INIT_ARRAY_ELEMENT[$LCURLY, "ANNOTATION_ELEM_VALUE_ARRAY_INIT"] annotationElementValue*)
            ;
            
annotationTypeDeclaration[CommonTree modifiers]
            :   AT INTERFACE IDENT annotationBody
                    -> ^(AT {$modifiers} IDENT annotationBody)
            ;
            
annotationBody
            :   LCURLY annotationScopeDeclarations* RCURLY
                ->  ^(ANNOTATION_TOP_LEVEL_SCOPE[$LCURLY, "CLASS_TOP_LEVEL_SCOPE"] annotationScopeDeclarations*)
            ;
            
annotationScopeDeclarations
            :   modifierList type
                (   IDENT LPAREN RPAREN annotationDefaultValue? SEMI
                    ->  ^(ANNOTATION_METHOD_DECL modifierList type IDENT annotationDefaultValue?)
                |   classFieldDeclaratorList SEMI
                    ->  ^(VAR_DECLARATION modifierList type classFieldDeclaratorList)
                )
            |   typeDeclaration
            ;
            
annotationDefaultValue
            :   DEFAULT^ annotationElementValue
            ;
        
// STATEMENTS / BLOCKS
        
block
            :   LCURLY 
  {
    symbolTable.enterScope();
    if (leftCurly) {
      tokens.replace($LCURLY,"");
    }
    // code to insert for Polyverse for Loop
    if (forBlock) {
      metaPairStack.push("tp"+count);
      count++;
      metaVarStack.push("tTrue"+count);
      count++;
      tokens.insertAfter($LCURLY,"\n \t if ("+ metaVarStack.peek() +".empty()) break;");
      tokens.insertAfter($LCURLY, "\n \t Metadata "+metaVarStack.peek()+" = "+metaPairStack.peek()+".trueMetadata();");
      tokens.insertAfter($LCURLY, "\n \t MetadataPair "+metaPairStack.peek()+" = "+forcondition+").MetadataPair();");
      forBlock = false;
    }
    // code to insert in polyverse while block 
    if (whileBlock) {
      metaPairStack.push("tp"+count);
      count++;
      metaVarStack.push("tTrue"+count);
      count++;
      tokens.insertAfter($LCURLY,"\n \t if ("+ metaVarStack.peek() +".empty()) break;");
      tokens.insertAfter($LCURLY, "\n \t Metadata "+metaVarStack.peek()+" = "+metaPairStack.peek()+".trueMetadata();");
      tokens.insertAfter($LCURLY, "\n \t MetadataPair "+metaPairStack.peek()+" = "+forcondition+".MetadataPair();");
      //whileBlock = false;
    }
    if (methodBlock && !("void".equals(returnType))) {
      tokens.insertAfter($LCURLY,"\n"+returnType+" ret1 = new "+returnType+"("+metaPairStack.peek()+");");
      methodBlock = false;
      returnType="void";
    }
    /*if(doWhile) {
      metaPairStack.push("tp"+count);
      count++;
      metaVarStack.push("tTrue"+count);
      count++;
      tokens.insertAfter($LCURLY,"\n \t if ("+ metaVarStack.peek() +".empty()) break;");
      tokens.insertAfter($LCURLY, "\n \t Metadata "+metaVarStack.peek()+" = "+metaPairStack.peek()+".trueMetadata();");
      tokens.insertAfter($LCURLY, "\n \t MetadataPair "+metaPairStack.peek()+" = "+forcondition+".MetadataPair();");
    }*/
  }
             blockStatement* {symbolTable.exitScope();} RCURLY 
  {
    if (doPara) {
      tokens.replace($RCURLY,"");
      doPara = false;
    }
    if (rightCurly) {
      tokens.replace($RCURLY,"");
    }
  }
                ->  ^(BLOCK_SCOPE[$LCURLY, "BLOCK_SCOPE"] blockStatement*)
                
            ;
        
blockStatement 
            :   localVariableDeclaration SEMI!
            |   typeDeclaration
            |   q=statement 
            ;
            
        localVariableDeclaration
            :   localModifierList type classFieldDeclaratorList
                ->  ^(VAR_DECLARATION localModifierList type classFieldDeclaratorList)
            ;
            
                
        statement 
            :   block 
//            |   POLYVERSEENTER 
//  { 
//    PolyverseScope.enterPolyverseScope(); 
//  } 
//            |   POLYVERSEXIT 
//  { 
//    PolyverseScope.exitPolyverseScope(); 
//  } 
            |    annotation statement 
            |    ASSERT expr1=expression  
                (   COLON expr2=expression SEMI                                     ->  ^(ASSERT $expr1 $expr2)
                |   SEMI                                                            ->  ^(ASSERT $expr1)
                )
            |   IF   
                parenthesizedExpression 
  {
    ifcondition = $parenthesizedExpression.text;
    if (PolyverseScope.isPolyverse()) {
      metaPairStack.push("tp"+count);
      count++;
      metaVarStack.push("tTrue"+count);
      count++;
      tokens.replace($parenthesizedExpression.start.getTokenIndex(),$parenthesizedExpression.stop.getTokenIndex(),"("+ metaVarStack.peek() +".notEmpty())");
      tokens.insertBefore($IF,"\t Metadata "+ metaVarStack.peek() +" = "+metaPairStack.peek()+".trueMetadata();\n"); 
      tokens.insertBefore($IF,"MetadataPair "+ metaPairStack.peek() +" = "+ifcondition+".MetadataPair();\n"); 
      //polyverseIf = false;
      //polyverseElse = true;
      //seqIf = true;
      //metaVarStack.pop();
    }
  }
                    ifStat=statement  
  {
    if (PolyverseScope.isPolyverse()) {
      metaVarStack.pop();
    }
  }
                (   ELSE 
  {
    if (PolyverseScope.isPolyverse()) {
      metaVarStack.push("tFalse"+count);
      count++;
      tokens.replace($ELSE,"\t if ("+ metaVarStack.peek() +".notEmpty())");
      tokens.insertBefore($ELSE,"\t Metadata "+ metaVarStack.peek() +" = "+metaPairStack.peek()+".falseMetadata();\n");         
      //polyverseElse = false;
    }
  }
                elseStat=statement    
  {
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
                                             ->  ^(IF parenthesizedExpression $ifStat $elseStat)
                |                                                                 
  {
    //if (seqIf)
    if (PolyverseScope.isPolyverse()) {
      //System.out.println("In seqIf "+metaPairStack.peek());
      metaPairStack.pop();
      //seqIf = false;
      //polyverseElse = false;
      //polyverseIf = false;
    }
  }
                               ->  ^(IF parenthesizedExpression $ifStat) 
                )   
            |   FOR  
  { 
    if (PolyverseScope.isPolyverse()) {
      forBlock=true;
      forStart = true;
    }
  }
                     LPAREN
                (   forInit SEMI z=forCondition 
  {
    if (forStart) {
      //System.out.println("for condition "+$z.text);
      forcondition = $z.text;
      tokens.replace($z.start.getTokenIndex(),$z.stop.getTokenIndex()+1,";");
      forStart = false;
    }
  }
                SEMI forUpdater RPAREN statement  
  {
    // POPPING Metadata and MetadataPair
    metaPairStack.pop();
    metaVarStack.pop();
  }
                    ->  ^(FOR forInit forCondition forUpdater statement) 
                |   localModifierList type IDENT COLON expression RPAREN statement  ->  ^(FOR_EACH[$FOR, "FOR_EACH"] localModifierList type IDENT expression statement)
                                                                                  
                ) 
            |  WHILE 
  { 
    if (PolyverseScope.isPolyverse()) {
      whileBlock=true;
      //forStart = true;
    }
  }
                    q=parenthesizedExpression 
  {
    if (whileBlock) {
      forcondition = $q.text;
      tokens.replace($q.start.getTokenIndex(),$q.stop.getTokenIndex(),"(true)");
    }
  }
                statement                             
  {
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
                ->  ^(WHILE parenthesizedExpression statement)
            |   DO
  {
    if (PolyverseScope.isPolyverse()) {
      doWhile = true;
      doPara = true;
      //tokens.insertBefore($DO,"\t Metadata "+ metaVarStack.peek() +" = "+metaPairStack.peek()+".falseMetadata();\n");         
    }
  }
             statement WHILE q=parenthesizedExpression  
  {
    if (doWhile) {
      //code 
      metaPairStack.push("tp"+count);
      count++;
      metaVarStack.push("tTrue"+count);
      count++;
      tokens.insertBefore($WHILE,"\t Metadata "+ metaVarStack.peek() +" = "+metaPairStack.peek()+".trueMetadata();\n }\n"); 
      tokens.insertBefore($WHILE,"MetadataPair "+ metaPairStack.peek() +" = "+$q.text+".MetadataPair();\n"); 
      tokens.replace($q.start.getTokenIndex(),$q.stop.getTokenIndex(),"(true)");        
      doWhile = false;
    }
  }
             SEMI          
  {
    metaVarStack.pop(); 
    metaPairStack.pop();
  }
                                   ->  ^(DO statement parenthesizedExpression)
            |  TRY block (catches finallyClause? | finallyClause)                ->  ^(TRY block catches? finallyClause?)
            |  SWITCH 
  {
    if (PolyverseScope.isPolyverse()) {
      switchCase = true;
      doPara = true;
      leftCurly = true;
      rightCurly = true;
    }
    tokens.replace($SWITCH,"");
  }
            q=parenthesizedExpression 
  {
    tokens.replace($q.start.getTokenIndex(),$q.stop.getTokenIndex(),"");
  }         
            LCURLY 
  {
    tokens.replace($LCURLY,"");
    symbolTable.enterScope();
  } 
             
            switchBlockLabels 
  {
    symbolTable.exitScope(); 
    cases.removeAllElements(); 
    statements.removeAllElements();
    switchCase = false;
    doPara = false;
    leftCurly = false;
    rightCurly = false;
  } 
            RCURLY 
  {
    tokens.replace($RCURLY,"");
  }     
               ->  ^(SWITCH parenthesizedExpression switchBlockLabels)
            |   SYNCHRONIZED parenthesizedExpression block                         ->  ^(SYNCHRONIZED parenthesizedExpression block)
            |   RETURN 
  {
    if (PolyverseScope.isPolyverse()) {
      polyverseReturn = true;
      //PolyverseScope.isPolyverse() = false;
    }
  }
             q=expression? 
  {
    if (polyverseReturn) {
      tokens.replace($RETURN,"ret1.merge("+$q.text+");\n");        
      String temp = metaVarStack.peek();
      tokens.insertAfter($RETURN,temp+" = new Time(null);");
      //tokens.replace($RETURN,"");  
      tokens.replace($q.start.getTokenIndex(),$q.stop.getTokenIndex(),"");
      polyverseReturn = false;          
    }
  }
             SEMI
              ->  ^(RETURN expression?)
            |   THROW expression SEMI                                               ->  ^(THROW expression)
            |   BREAK
  {
    isBreak = true;
    if (PolyverseScope.isPolyverse()) {
      String temp = metaVarStack.peek();
      metaPairStack.pop();
      breakTrue = true;
      x = metaPairStack.iterator();
      while (x.hasNext()) {
        tokens.insertAfter($BREAK,x.next()+".subtractTime("+temp+");\n");
      }
      tokens.replace($BREAK,"");
      //PolyverseScope.isPolyverse() = false;
    }
  }
             IDENT? SEMI                                        ->  ^(BREAK IDENT?)
            |   CONTINUE 
  {
    if (PolyverseScope.isPolyverse()) {
      String temp = metaVarStack.peek();
      tokens.replace($CONTINUE,temp+" = new Time(null);");
      //PolyverseScope.isPolyverse() = false;
    }
  }
                IDENT? SEMI
                ->  ^(CONTINUE IDENT?)
            |   IDENT COLON statement
                ->  ^(LABELED_STATEMENT IDENT statement)
            |   expression SEMI!
            |   SEMI 
            ;           
                
catches
            :   catchClause+
                ->  ^(CATCH_CLAUSE_LIST catchClause+)
            ;
            
catchClause
            :   CATCH^ LPAREN! formalParameterStandardDecl RPAREN! block
            ;
        
finallyClause
            :   FINALLY block
                ->  block
            ;
        
switchBlockLabels
            :   switchCaseLabels switchDefaultLabel? switchCaseLabels
                ->  ^(SWITCH_BLOCK_LABEL_LIST switchCaseLabels switchDefaultLabel? switchCaseLabels)
            ;
            
switchCaseLabels
            :   switchCaseLabel*
            ;
                
switchCaseLabel
            :   CASE^ z=expression COLON! q=blockStatement* 
  {
    //System.out.println(switchCase+"in case labels "+isBreak);
    if (switchCase) {
      cases.push($z.text);
      statements.push($q.text);
      //System.out.println("in case labels "+isBreak);
      tokens.replace($z.start.getTokenIndex(),$q.stop.getTokenIndex(),"");
      tokens.replace($CASE,"");
      if (isBreak == true) {
        String code = "";
        int size = cases.size();
        for (int i = 0; i < size; i++) {
          code = statements.pop() + "\n" + code;
          //System.out.println("if(" + cases.pop() + ")\n" + code );
          tokens.insertAfter($CASE,"if(" + cases.pop() + ")\n{" + code+"}\n");                 
        }
        isBreak = false;
      }
    }
  }
            ;
            
switchDefaultLabel
            :   DEFAULT^ COLON! blockStatement*
            ;
            
forInit
            :     
                localVariableDeclaration    ->  ^(FOR_INIT localVariableDeclaration)
            |   expressionList              ->  ^(FOR_INIT expressionList)
            |                               ->  ^(FOR_INIT)
            
        
    ;
            
forCondition
            :
        
     q=expression?     
                ->  ^(FOR_CONDITION expression?)
            ;
            
        forUpdater
            :   q=expressionList? 
                ->  ^(FOR_UPDATE expressionList?)
            ;
        
// EXPRESSIONS
        
parenthesizedExpression
            :   LPAREN  expression  RPAREN
                ->  ^(PARENTESIZED_EXPR[$LPAREN, "PARENTESIZED_EXPR"] expression)
            ;
            
expressionList
            :   q=expression 
  {
    if (PolyverseScope.isPolyverse()) {
      tokens.insertBefore($q.start,"Metadata " + metaVarStack.peek() + ",");
      //temp.pop();
      //PolyverseScope.isPolyverse() = false;
    }
  }
                     (COMMA! expression)*
            ;
        
expression
            :   q=assignmentExpression 
                ->  ^(EXPR assignmentExpression)
            ;
            
assignmentExpression 
    :   
        c=conditionalExpression 
        (   op=(   ASSIGN^
            |   PLUS_ASSIGN^
            |   MINUS_ASSIGN^
            |   STAR_ASSIGN^
            |   DIV_ASSIGN^
            |   AND_ASSIGN^
            |   OR_ASSIGN^
            |   XOR_ASSIGN^
            |   MOD_ASSIGN^
            |   SHIFT_LEFT_ASSIGN^
            |   SHIFT_RIGHT_ASSIGN^
            |   BIT_SHIFT_RIGHT_ASSIGN^
            ) 
        x=assignmentExpression
        )?
  {/*-----*/ // Now we see assignment operator, so fix up LHS of assignment
    if (PolyverseScope.isPolyverse()) {
      int opType = 0;
      if ($op != null) {
        opType = $op.type;
        String xText = tokens.toString($x.start.getTokenIndex(), $x.stop.getTokenIndex());
        String cText = tokens.toString($c.start.getTokenIndex(), $c.stop.getTokenIndex());
        System.out.println("Assignment op " + $x.text + " :: " + opType + " " + $c.text);
        System.out.println("Assignment op " + xText + " :: " + opType + " " + cText);
        tokens.replace($c.start.getTokenIndex(), $c.stop.getTokenIndex(), cText + ".binaryOperationSelf(" + vtop() + /*", JavaLexer." + opText */ opType + "," + xText + ")");
        tokens.delete($op);
        tokens.delete($x.start, $x.stop);
/*
        switch ($op.type) {
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
          default: System.err.println("Bad assignment operator in parser " + $op.text); System.exit(-1);
        }
        String xText = tokens.toString($x.start.getTokenIndex(), $x.stop.getTokenIndex());
        String cText = tokens.toString($c.start.getTokenIndex(), $c.stop.getTokenIndex());
        System.out.println("Assignment op " + $x.text + " :: " + opText + " " + $c.text);
        System.out.println("Assignment op " + xText + " :: " + opText + " " + cText);
        tokens.replace($c.start.getTokenIndex(), $c.stop.getTokenIndex(), cText + "." + opText + "(" + vtop() + "," + xText + ")");
        tokens.delete($op);
        tokens.delete($x.start, $x.stop);
*/
      }
    }
  /*-----*/}
    ;
 
conditionalExpression
            :  
               e=logicalOrExpression 
               (QUESTION^ e1=assignmentExpression COLON! e2=conditionalExpression )?
            ; 
        
logicalOrExpression
            : q=logicalAndExpression (opr=LOGICAL_OR^ z=logicalAndExpression
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      if (z != null) {
        String opText = ".logicalOr";
        String zText = tokens.toString($z.start.getTokenIndex(), $z.stop.getTokenIndex());
        String qText = tokens.toString($q.start.getTokenIndex(), $q.stop.getTokenIndex());
        tokens.replace($q.start.getTokenIndex(), $q.stop.getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
        tokens.delete($opr);
        tokens.delete($z.start, $z.stop);
      }
    }
  /*-----*/}
            )*
            ;
        
logicalAndExpression 
            : q=inclusiveOrExpression (opr=LOGICAL_AND^ z=inclusiveOrExpression
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      if (z != null) {
        String opText = ".logicalAnd";
        String zText = tokens.toString($z.start.getTokenIndex(), $z.stop.getTokenIndex());
        String qText = tokens.toString($q.start.getTokenIndex(), $q.stop.getTokenIndex());
        tokens.replace($q.start.getTokenIndex(), $q.stop.getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
        tokens.delete($opr);
        tokens.delete($z.start, $z.stop);
      }
    }
  /*-----*/}
             )*
            ;
        
inclusiveOrExpression 
            :  q=exclusiveOrExpression (opr=OR^ z=exclusiveOrExpression
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      if (z != null) {
        String opText = ".or";
        String zText = tokens.toString($z.start.getTokenIndex(), $z.stop.getTokenIndex());
        String qText = tokens.toString($q.start.getTokenIndex(), $q.stop.getTokenIndex());
        tokens.replace($q.start.getTokenIndex(), $q.stop.getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
        tokens.delete($opr);
        tokens.delete($z.start, $z.stop);
      }
    }
  /*-----*/}
            )*
            ;
        
exclusiveOrExpression
            :  q=andExpression (opr=XOR^ z=andExpression
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      if (z != null) {
        String opText = ".xor";
        String zText = tokens.toString($z.start.getTokenIndex(), $z.stop.getTokenIndex());
        String qText = tokens.toString($q.start.getTokenIndex(), $q.stop.getTokenIndex());
        tokens.replace($q.start.getTokenIndex(), $q.stop.getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
        tokens.delete($opr);
        tokens.delete($z.start, $z.stop);
      }
    }
  /*-----*/}
            )*
            ;
        
andExpression 
            : q=equalityExpression (opr=AND^ z=equalityExpression
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      if (z != null) {
        String opText = ".and";
        String zText = tokens.toString($z.start.getTokenIndex(), $z.stop.getTokenIndex());
        String qText = tokens.toString($q.start.getTokenIndex(), $q.stop.getTokenIndex());
        tokens.replace($q.start.getTokenIndex(), $q.stop.getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
        tokens.delete($opr);
        tokens.delete($z.start, $z.stop);
      }
    }
  /*-----*/}
            )*
            ;
        
equalityExpression 
            : q=instanceOfExpression 
                (   opr=(EQUAL^ | NOT_EQUAL^) 
                    z=instanceOfExpression
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      String opText = "";
      if ($opr != null) {
        switch ($opr.type) {
          case EQUAL: opText = "equal"; break;
          case NOT_EQUAL: opText = "notEqual"; break;
          default: System.err.println("Bad equality operator in parser " + $opr.text); System.exit(-1);
        }
        String zText = tokens.toString($z.start.getTokenIndex(), $z.stop.getTokenIndex());
        String qText = tokens.toString($q.start.getTokenIndex(), $q.stop.getTokenIndex());
        tokens.replace($q.start.getTokenIndex(), $q.stop.getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
        tokens.delete($opr);
        tokens.delete($z.start, $z.stop);
      }
    }
  /*-----*/}
                )*
            ;
        
instanceOfExpression 
            : q=relationalExpression (opr=INSTANCEOF^ z=type)?
  {/*-----*/
    if (z != null) {
      System.err.println("INSTANCEOF not implemented");
      System.exit(-1);
      //tokens.replace($z.start.getTokenIndex(),$z.stop.getTokenIndex(),"polyverse."+$z.text);
    }
  /*-----*/}
            ;
        
relationalExpression 
            : q=shiftExpression
              ( opr=( LESS_OR_EQUAL^ | GREATER_OR_EQUAL^ | LESS_THAN^ | GREATER_THAN^)
                z=shiftExpression 
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      String opText = "";
      if ($opr != null) {
        switch ($opr.type) {
          case LESS_OR_EQUAL: opText = "lessOrEqual"; break;
          case GREATER_OR_EQUAL: opText = "greaterOrEqual"; break;
          case LESS_THAN: opText = "lessThan"; break;
          case GREATER_THAN: opText = "greaterThan"; break;
          default: System.err.println("Bad relational operator in parser " + $opr.text); System.exit(-1);
        }
        String zText = tokens.toString($z.start.getTokenIndex(), $z.stop.getTokenIndex());
        String qText = tokens.toString($q.start.getTokenIndex(), $q.stop.getTokenIndex());
        tokens.replace($q.start.getTokenIndex(), $q.stop.getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
        tokens.delete($opr);
        tokens.delete($z.start, $z.stop);
      }
    }
  /*-----*/}
                )*
            ;
            
shiftExpression 
            :  q=additiveExpression 
               ( opr=(BIT_SHIFT_RIGHT^ | SHIFT_RIGHT^ | SHIFT_LEFT^ )
                 z=additiveExpression
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      String opText = "";
      if ($opr != null) {
        switch ($opr.type) {
          case BIT_SHIFT_RIGHT: opText = "bitShiftRight"; break;
          case SHIFT_RIGHT: opText = "shiftRight"; break;
          case SHIFT_LEFT: opText = "shiftLeft"; break;
          default: System.err.println("Bad shift operator in parser " + $opr.text); System.exit(-1);
        }
        String zText = tokens.toString($z.start.getTokenIndex(), $z.stop.getTokenIndex());
        String qText = tokens.toString($q.start.getTokenIndex(), $q.stop.getTokenIndex());
        tokens.replace($q.start.getTokenIndex(), $q.stop.getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
        tokens.delete($opr);
        tokens.delete($z.start, $z.stop);
      }
    }
  /*-----*/}
                )*
            ;
        
additiveExpression 
            :  q=multiplicativeExpression 
                (   opr=(PLUS^ | MINUS^)
                    z=multiplicativeExpression
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      String opText = "";
      if ($opr != null) {
        switch ($opr.type) {
          case PLUS: opText = "plus"; break;
          case MINUS: opText = "minus"; break;
          default: System.err.println("Bad additive operator in parser " + $opr.text); System.exit(-1);
        }
        String zText = tokens.toString($z.start.getTokenIndex(), $z.stop.getTokenIndex());
        String qText = tokens.toString($q.start.getTokenIndex(), $q.stop.getTokenIndex());
        tokens.replace($q.start.getTokenIndex(), $q.stop.getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
        tokens.delete($opr);
        tokens.delete($z.start, $z.stop);
      }
    }
  /*-----*/}
                )*
            ;
        
multiplicativeExpression 
            : q=unaryExpression 
              ( opr=(STAR^ | DIV^ | MOD^)
                z=unaryExpression
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      String opText = "";
      if ($opr != null) {
        switch ($opr.type) {
          case STAR: opText = "star"; break;
          case DIV: opText = "div"; break;
          case MOD: opText = "mod"; break;
          default: System.err.println("Bad multiplicative operator in parser " + $opr.text); System.exit(-1);
        }
        String zText = tokens.toString($z.start.getTokenIndex(), $z.stop.getTokenIndex());
        String qText = tokens.toString($q.start.getTokenIndex(), $q.stop.getTokenIndex());
        tokens.replace($q.start.getTokenIndex(), $q.stop.getTokenIndex(), qText + "." + opText + "(" + vtop() + "," + zText + ")");
        tokens.delete($opr);
        tokens.delete($z.start, $z.stop);
      }
    }
  /*-----*/}
                )*
            ;
            
unaryExpression 
            : opr=PLUS p=unaryExpression  
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      String opText = "unaryPlus";
      String pText = tokens.toString($p.start.getTokenIndex(), $p.stop.getTokenIndex());
      tokens.replace($p.start.getTokenIndex(), $p.stop.getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
      tokens.delete($opr);
      tokens.delete($p.start, $p.stop);
    }
  /*-----*/}
                 ->  ^(UNARY_PLUS[$PLUS, "UNARY_PLUS"] unaryExpression)
            | opr=MINUS p=unaryExpression  
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      String opText = "unaryMinus";
      String pText = tokens.toString($p.start.getTokenIndex(), $p.stop.getTokenIndex());
      tokens.replace($p.start.getTokenIndex(), $p.stop.getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
      tokens.delete($opr);
      tokens.delete($p.start, $p.stop);
    }
  /*-----*/}
                 ->  ^(UNARY_MINUS[$MINUS, "UNARY_MINUS"] unaryExpression)
            | opr=INC p=postfixedExpression  
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      String opText = "preIncrement";
      String pText = tokens.toString($p.start.getTokenIndex(), $p.stop.getTokenIndex());
      tokens.replace($p.start.getTokenIndex(), $p.stop.getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
      tokens.delete($opr);
      tokens.delete($p.start, $p.stop);
    }
  /*-----*/}
                 ->  ^(PRE_INC[$INC, "PRE_INC"] postfixedExpression) 
            | opr=DEC p=postfixedExpression  
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      String opText = "preDecrement";
      String pText = tokens.toString($p.start.getTokenIndex(), $p.stop.getTokenIndex());
      tokens.replace($p.start.getTokenIndex(), $p.stop.getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
      tokens.delete($opr);
      tokens.delete($p.start, $p.stop);
    }
  /*-----*/}
               ->  ^(PRE_DEC[$DEC, "PRE_DEC"] postfixedExpression)
            |   unaryExpressionNotPlusMinus
            ;
        
unaryExpressionNotPlusMinus 
            :  opr=NOT p=unaryExpression    
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      String opText = "not";
      String pText = tokens.toString($p.start.getTokenIndex(), $p.stop.getTokenIndex());
      tokens.replace($p.start.getTokenIndex(), $p.stop.getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
      tokens.delete($opr);
      tokens.delete($p.start, $p.stop);
    }
  /*-----*/}
                ->  ^(NOT unaryExpression)
            |  opr=LOGICAL_NOT p=unaryExpression
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      String opText = "logicalNot";
      String pText = tokens.toString($p.start.getTokenIndex(), $p.stop.getTokenIndex());
      tokens.replace($p.start.getTokenIndex(), $p.stop.getTokenIndex(), pText + "." + opText + "(" + vtop() + ")");
      tokens.delete($opr);
      tokens.delete($p.start, $p.stop);
    }
  /*-----*/}
                                 ->  ^(LOGICAL_NOT unaryExpression)
            |  LPAREN t=type RPAREN p=unaryExpression
  {/*-----*/
    if (PolyverseScope.isPolyverse()) {
      System.err.println("Cast not yet implemented");
      System.exit(-1);
    }
  /*-----*/}
                ->  ^(CAST_EXPR[$LPAREN, "CAST_EXPR"] type unaryExpression)
            |  postfixedExpression
            ;
            
postfixedExpression 
                // At first resolve the primary expression ...
            :   ( q=primaryExpression  
                    ->  primaryExpression
                )
                // ... and than the optional things that may follow a primary expression 0 or more times.
                (   outerDot=DOT                            
                    (   (   genericTypeArgumentListSimplified?  // Note: generic type arguments are only valid for method calls, i.e. if there
                                                                //       is an argument list.
                            IDENT                           ->  ^(DOT $postfixedExpression IDENT)
                        ) 
                        (   arguments  
                                             ->  ^(METHOD_CALL $postfixedExpression genericTypeArgumentListSimplified? arguments)
                        )?
                    |   THIS                                ->  ^(DOT $postfixedExpression THIS)
                    |   Super=SUPER arguments                   ->  ^(SUPER_CONSTRUCTOR_CALL[$Super, "SUPER_CONSTRUCTOR_CALL"] $postfixedExpression arguments)
                    |   (   SUPER innerDot=DOT IDENT        ->  ^($innerDot ^($outerDot $postfixedExpression SUPER) IDENT)
                        )
                        (   arguments       
                                        ->  ^(METHOD_CALL $postfixedExpression arguments)
                        )?
                    |   innerNewExpression                  ->  ^(DOT $postfixedExpression innerNewExpression)
                    )
                |   LBRACK expression RBRACK                ->  ^(ARRAY_ELEMENT_ACCESS $postfixedExpression expression)
                )*
                // At the end there may follow a post increment/decrement.
                (   INC 
                 -> ^(POST_INC[$INC, "POST_INC"] $postfixedExpression)
                |   DEC 
                -> ^(POST_DEC[$DEC, "POST_DEC"] $postfixedExpression)
                )?
            ;    
            
primaryExpression
            : parenthesizedExpression
            |   z=literal 
            |   newExpression
            |   q=qualifiedIdentExpression
  //{/*-----*/ // Fetch the variable reference
    //System.out.println(" polyverse check "+$q.text + " "+t);
    //if (PolyverseScope.isPolyverse()) {
      //if(symbolTable.probe($x.text)) {        
      //toFetch.push($q.start);
      //  toFetch.push($q.stop);
      //  toFetchText.push($q.text);
        //tokens.replace($q.start.getTokenIndex(), $q.stop.getTokenIndex(), $q.text + ".fetch(" + "vtop" + ")");
      //}
    //}
  ///*-----*/}
            |   genericTypeArgumentListSimplified 
                (   SUPER
                    (   arguments                               ->  ^(SUPER_CONSTRUCTOR_CALL[$SUPER, "SUPER_CONSTRUCTOR_CALL"] genericTypeArgumentListSimplified arguments)
                    |   DOT IDENT arguments                     ->  ^(METHOD_CALL ^(DOT SUPER IDENT) genericTypeArgumentListSimplified arguments)
                    )
                |   q1=IDENT 
                arguments                             ->  ^(METHOD_CALL IDENT genericTypeArgumentListSimplified arguments)
                |   THIS arguments                              ->  ^(THIS_CONSTRUCTOR_CALL[$THIS, "THIS_CONSTRUCTOR_CALL"] genericTypeArgumentListSimplified arguments)
                )
            |   (   THIS                                        ->  THIS
                )
                (   arguments                                   ->  ^(THIS_CONSTRUCTOR_CALL[$THIS, "THIS_CONSTRUCTOR_CALL"] arguments)
                )?
            |   SUPER arguments                                 ->  ^(SUPER_CONSTRUCTOR_CALL[$SUPER, "SUPER_CONSTRUCTOR_CALL"] arguments)
            |   (   SUPER DOT IDENT
                )
                (   arguments   
                                                ->  ^(METHOD_CALL ^(DOT SUPER IDENT) arguments)
                |                                               ->  ^(DOT SUPER IDENT)
                )
            |   (   primitiveType                               ->  primitiveType
                )
                (   arrayDeclarator                             ->  ^(arrayDeclarator $primaryExpression)   
                )* 
                DOT CLASS                                       ->  ^(DOT $primaryExpression CLASS)
            |   VOID DOT CLASS                                  ->  ^(DOT VOID CLASS)
            ;
            
qualifiedIdentExpression 
                // The qualified identifier itself is the starting point for this rule.
            :   (x=qualifiedIdentifier
                 ->  qualifiedIdentifier
                )
      //if (PolyverseScope.isPolyverse()) {
      //  if(symbolTable.probe($x.text)) {        
      //  }
      //}
                // And now comes the stuff that may follow the qualified identifier.
                (   (   arrayDeclarator                         
                        ->  ^(arrayDeclarator $qualifiedIdentExpression)
                    )+ 
                    (   DOT CLASS                               
                        ->  ^(DOT $qualifiedIdentExpression CLASS)
                    )
                | arguments  
                   ->  ^(METHOD_CALL qualifiedIdentifier arguments)
                |   outerDot=DOT
                    (   CLASS                                   
                        ->  ^(DOT qualifiedIdentifier CLASS)
                    |   genericTypeArgumentListSimplified 
                        (   Super=SUPER arguments               
                            ->  ^(SUPER_CONSTRUCTOR_CALL[$Super, "SUPER_CONSTRUCTOR_CALL"] qualifiedIdentifier genericTypeArgumentListSimplified arguments)
                        |   SUPER innerDot=DOT IDENT arguments 
                            ->  ^(METHOD_CALL ^($innerDot ^($outerDot qualifiedIdentifier SUPER) IDENT) genericTypeArgumentListSimplified arguments)
                        |   IDENT arguments 
                            ->  ^(METHOD_CALL ^(DOT qualifiedIdentifier IDENT) genericTypeArgumentListSimplified arguments)
                        )
                    |   THIS
                        ->  ^(DOT qualifiedIdentifier THIS)
                    |   Super=SUPER arguments
                        ->  ^(SUPER_CONSTRUCTOR_CALL[$Super, "SUPER_CONSTRUCTOR_CALL"] qualifiedIdentifier arguments)
                    |   innerNewExpression
                        ->  ^(DOT qualifiedIdentifier innerNewExpression)
                    ) 
                )?
            ;
        
newExpression
            :   NEW  
                (   primitiveType newArrayConstruction      // new static array of primitive type elements
                    ->  ^(STATIC_ARRAY_CREATOR[$NEW, "STATIC_ARRAY_CREATOR"] primitiveType newArrayConstruction)
                |   genericTypeArgumentListSimplified? qualifiedTypeIdentSimplified
                    (   newArrayConstruction                // new static array of object type reference elements
                        ->  ^(STATIC_ARRAY_CREATOR[$NEW, "STATIC_ARRAY_CREATOR"] genericTypeArgumentListSimplified? qualifiedTypeIdentSimplified newArrayConstruction)
                    |   arguments classBody?                // new object type via constructor invocation
                        ->  ^(CLASS_CONSTRUCTOR_CALL[$NEW, "STATIC_ARRAY_CREATOR"] genericTypeArgumentListSimplified? qualifiedTypeIdentSimplified arguments classBody?)
                    )
                )
            ;
            
        innerNewExpression // something like 'InnerType innerType = outer.new InnerType();'
            :   NEW genericTypeArgumentListSimplified? IDENT arguments classBody?
                ->  ^(CLASS_CONSTRUCTOR_CALL[$NEW, "STATIC_ARRAY_CREATOR"] genericTypeArgumentListSimplified? IDENT arguments classBody?)
            ;
        
newArrayConstruction
            :   arrayDeclaratorList arrayInitializer
            |   LBRACK! expression RBRACK! (LBRACK! expression RBRACK!)* arrayDeclaratorList?
            ;
        
arguments
            :   LPAREN 
                {
                        if(methodCall)
                        {
                                //System.out.println("method call");
                                tokens.insertAfter($LPAREN,metaVarStack.peek()+",");
                                methodCall = false;
                        }
                }
                expressionList?  RPAREN
                ->  ^(ARGUMENT_LIST[$LPAREN, "ARGUMENT_LIST"] expressionList?)
            ;
        
literal
            : q=( HEX_LITERAL
            |  OCTAL_LITERAL 
            |  DECIMAL_LITERAL 
            |  FLOATING_POINT_LITERAL   
            |  CHARACTER_LITERAL           
            |  STRING_LITERAL           
            |  TRUE                           
            |  FALSE                           
            |  NULL)
  {/*-----*/ // Generate a new polyverse literal for a literal
    String classType = "BAD CLASS";
    switch ($q.type) {
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
    tokens.replace($q, "new polyverse.scalar.Polyverse" + classType + "(" + vtop() + "," + $q.text + ")");
  /*-----*/}
            ;
        
// LEXER
        
HEX_LITERAL : '0' ('x'|'X') HEX_DIGIT+ INTEGER_TYPE_SUFFIX? ;
        
DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) INTEGER_TYPE_SUFFIX? ;
        
OCTAL_LITERAL : '0' ('0'..'7')+ INTEGER_TYPE_SUFFIX? ;
        
fragment
        HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;
        
fragment
        INTEGER_TYPE_SUFFIX : ('l'|'L') ;
        
FLOATING_POINT_LITERAL
            :   ('0'..'9')+ 
                (
                    DOT ('0'..'9')* EXPONENT? FLOAT_TYPE_SUFFIX?
                |   EXPONENT FLOAT_TYPE_SUFFIX?
                |   FLOAT_TYPE_SUFFIX
                )
            |   DOT ('0'..'9')+ EXPONENT? FLOAT_TYPE_SUFFIX?
            ;
        
fragment
        EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
        
fragment
        FLOAT_TYPE_SUFFIX : ('f'|'F'|'d'|'D') ;
        
CHARACTER_LITERAL
            :   '\'' ( ESCAPE_SEQUENCE | ~('\''|'\\') ) '\''
            ;
        
STRING_LITERAL
            :  '"' ( ESCAPE_SEQUENCE | ~('\\'|'"') )* '"'
            ;
        
POLYVERSE
            : '/*Polyverse*/' {System.out.println("asdfjklsdfajklsdfa");} 
            ;

POLYVERSEENTER
            : '/*polyverse enter*/' {System.out.println("asdfjklsdfajklsdfa");} 
            ;
                    
POLYVERSEEXIT
            : '/*polyverse exit*/' {System.out.println("asdfjklsdfajklsdfa");} 
            ;
                    
fragment
        ESCAPE_SEQUENCE
            :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
            |   UNICODE_ESCAPE
            |   OCTAL_ESCAPE
            ;
        
fragment
        OCTAL_ESCAPE
            :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
            |   '\\' ('0'..'7') ('0'..'7')
            |   '\\' ('0'..'7')
            ;
        
fragment
        UNICODE_ESCAPE
            :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            ;
        
IDENT
            :   JAVA_ID_START (JAVA_ID_PART)*
            ;
        
fragment
        JAVA_ID_START
            :  '\u0024'
            |  '\u0041'..'\u005a'
            |  '\u005f'
            |  '\u0061'..'\u007a'
            |  '\u00c0'..'\u00d6'
            |  '\u00d8'..'\u00f6'
            |  '\u00f8'..'\u00ff'
            |  '\u0100'..'\u1fff'
            |  '\u3040'..'\u318f'
            |  '\u3300'..'\u337f'
            |  '\u3400'..'\u3d2d'
            |  '\u4e00'..'\u9fff'
            |  '\uf900'..'\ufaff'
            ;
        
fragment
        JAVA_ID_PART
            :  JAVA_ID_START
            |  '\u0030'..'\u0039'
            ;
        
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') 
            {   
                if (!preserveWhitespacesAndComments) {
                    skip();
                } else {
                    $channel = HIDDEN;
                }
            }
            ;
        
fragment COMMENTSTART 
        :         '/*';
        
fragment COMMENTEND 
        : '*/';
        
COMMENT
            :   
             COMMENTSTART ( options {greedy=false;} : . )* COMMENTEND
            {   // Check for turning polyverse on and off
                String s = getText();
                s = s.trim();
                //System.out.println("jjj"+s);
        
                if (s.contentEquals("/*polyverse enter*/")) {
                  //Horrible Hack, setting the token type explicitly
                  _type = POLYVERSEENTER;
                  //PolyverseScope.enterPolyverseScope();
                }
                else if (s.contentEquals("/*polyverse exit*/")) {
                  //Horrible Hack, setting the token type explicitly
                  //System.out.println("mv exited");
                  _type = POLYVERSEEXIT;
                  //PolyverseScope.exitPolyverseScope();
                }
                
                else if (!preserveWhitespacesAndComments) {
                    skip();
                } else {
                    $channel = HIDDEN;
                }
            }
            ;
           
LINE_COMMENT
            : '//' ~('\n'|'\r')* '\r'? '\n'
            {   
                if (!preserveWhitespacesAndComments) {
                    skip();
                } else {
                    $channel = HIDDEN;
                }
            }
            ;
        
