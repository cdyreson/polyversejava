/*
 * Runs the SequencedJava compiler
 */
package edu.usu.polyverse.main;

import java.io.FileReader;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import edu.usu.polyverse.main.tools.ParseCmdLine;
import edu.usu.polyverse.grammar.JavaLexer;
import edu.usu.polyverse.grammar.JavaParseException;
import edu.usu.polyverse.grammar.JavaParser;
import edu.usu.polyverse.grammar.JavaTreeParser;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;
import org.antlr.runtime.TokenRewriteStream;

/**
 *
 * @author Curtis Dyreson
 */
public class SequencedJava {

    /**
     * @param args the command line arguments
     */
    public static void main2(String[] args) {
        ParseCmdLine.parse(args);

        // Compile a program
        ///System.out.println("Running compiler ");
        compile(ParseCmdLine.javaFileName);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            CharStream cs = new ANTLRFileStream(args[0]);
            JavaLexer jl = new JavaLexer(cs);
            String templateFileName = "src/edu/usu/polyverse/grammar/JavaTreeParser.stg";
            StringTemplateGroup templates = new StringTemplateGroup(new FileReader(templateFileName),
                            DefaultTemplateLexer.class);
     
        TokenRewriteStream tokens = new TokenRewriteStream(jl);
        JavaParser parser = new JavaParser(tokens);
        parser.setTokenStream(tokens);
        JavaParser.javaSource_return r = parser.javaSource();
        /**
        CommonTree t = (CommonTree)r.getTree();   
        //System.out.println(t.toStringTree());     
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);      
        nodes.setTokenStream(tokens);      
        JavaTreeParser walker = new JavaTreeParser(nodes);      
        //walker.setTemplateLib(templates);       
        System.out.println("\nWalk tree:\n");
        walker.javaSource();
        //StringTemplate output = (StringTemplate)walker.javaSource().getTemplate(); 
        //System.out.println(output.toString());// emit translation
        **/
        System.out.println(tokens.toString());
        
        // load in T.stg template group, put in templates variable
        /*
FileReader groupFileR = new FileReader("T.stg");
StringTemplateGroup templates =
new StringTemplateGroup(groupFileR);
groupFileR.close();
// PARSE INPUT AND COMPUTE TEMPLATE
ANTLRInputStream input = new ANTLRInputStream(System.in);
TLexer lexer = new TLexer(input); // create lexer
CommonTokenStream tokens = new CommonTokenStream(lexer);
TParser parser = new TParser(tokens); // create parser
parser.setTemplateLib(templates); // give parser templates
TParser.s_return r = parser.s(); // parse rule s
StringTemplate output = r.getTemplate();
System.out.println(output.toString());// emit translation
*/
            /*
            CommonTokenStream tokens = new CommonTokenStream();
            tokens.setTokenSource(jl);
            JavaParser jp = new JavaParser(tokens);
            RuleReturnScope result = jp.javaSource();
            CommonTree t = (CommonTree) result.getTree();

            CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);

            nodes.setTokenStream(tokens);

            JavaTreeParser walker = new JavaTreeParser(nodes);
            
            walker.javaSource();
            //System.out.println("\nWalk tree:\n");

            printTree(t, 0);
*/

            //System.out.println(tokens.toString());
        } catch (JavaParseException t) {
            System.out.println("SequencedJava.java: Error " + t.msg);
            //t.printStackTrace();
            //System.exit(-1);
        } catch (RecognitionException t) {
            //System.out.println("SequencedJava.java: Parse Error " + parser.getErrorMessage());
            //t.printStackTrace();
            //System.exit(-1);
        } catch (Exception t) {
            System.out.println("SequencedJava.java: other error ");
            t.printStackTrace();
            //System.exit(-1);
        }
    }

    public static void printTree(CommonTree t, int indent) {
        if (t != null) {
            StringBuffer sb = new StringBuffer(indent);
            for (int i = 0; i < indent; i++) {
                sb = sb.append("   ");
            }
            for (int i = 0; i < t.getChildCount(); i++) {
                System.out.println(sb.toString() + t.getChild(i).toString());
                printTree((CommonTree) t.getChild(i), indent + 1);
            }
        }
    }

    /*
     * Compile an XMorph program stored in a file. The name
     * of the file is passed as a String.
     */
    public static void compile(String fileName) {
        JavaLexer lex = null;

        try {
            if (ParseCmdLine.verbose) {
                System.out.println("Running compiler on " + fileName);
            }
            lex = new JavaLexer(new ANTLRFileStream(fileName));
        } catch (Exception t) {
            System.out.println("Error building the Java lexer: probably could not open file " + fileName);
            t.printStackTrace();
            //System.exit(-1);
        }
        CommonTokenStream tokens = new CommonTokenStream(lex);
        JavaParser parser = new JavaParser(tokens);

        try {
            //parser.compilationUnit();
            CommonTree tree = (CommonTree) parser.compilationUnit().getTree();
            //AOPigParser walker = new AOPigParser(nodes);
            //walker.query();
            //return walker.getResult().trim();
            //DOTTreeGenerator gen = new DOTTreeGenerator();
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
            JavaTreeParser jt = new JavaTreeParser(nodes);
            jt.javaSource();
            //StringTemplate st = jt.toDOT(tree);
            //System.out.println(st);
            //System.out.println("in here " + q);
        } catch (JavaParseException t) {
            System.out.println("SequencedJava.java: Error " + t.msg);
            //t.printStackTrace();
            //System.exit(-1);
        } catch (RecognitionException t) {
            //System.out.println("SequencedJava.java: Parse Error " + parser.getErrorMessage());
            //t.printStackTrace();
            //System.exit(-1);
        } catch (Exception t) {
            System.out.println("SequencedJava.java: other error ");
            t.printStackTrace();
            //System.exit(-1);
        }
    }
}
