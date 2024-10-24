/*
 * Runs the SequencedJava compiler
 */
package sequencedjava;

import java.io.FileReader;
import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import sequencedjava.tools.ParseCmdLine;
import sequencedjava.grammar.JavaLexer;
import sequencedjava.grammar.JavaParseException;
import sequencedjava.grammar.JavaParser;

/**
 *
 * @author Curtis Dyreson
 */
public class SequencedJava extends Object 
{

    /**
     * @param args the command line arguments
     */
public static void main( String[] args) throws IOException
    {
        
        ParseCmdLine.parse(args);
        // Compile a program
        ///System.out.println("Running compiler ");
        int x = 0;
        
     
        /**
         * sequence
         */
        @Sequence
        compile(ParseCmdLine.javaFileName);
        
        @Sequence
        test(x);
        
    }
    
    /*
     * Compile an XMorph program stored in a file. The name
     * of the file is passed as a String.
     */

@Sequence
  public static void test(int x) {
      @Sequence
      int y = 0;
      @Sequence
      int z = 0;
      
      @Sequence
      int a = y + z;
      
      
  }

    
  @Sequence 
  public static int compile( String fileName) throws IOException {
        
       @Sequence int x = 2;
       @Sequence  char c = 'x';
       @Sequence   short s = 3;
       @Sequence   long z = 5;
       @Sequence  int f = 0;
       String s1 = new String("");
       
       @Sequence  int u=0;
       
        @Sequence
        int y=0;
        
        @Sequence
        String a = "";
                
        int q=0;
        
        @Sequence 
        if (f==z)
        {
            x= x;
        }
        else
        {
            x= 20;
        }
            
        @Sequence 
        if(x>20)
        {
            
        }
        
        @Sequence 
        for(int i=0;i<x;i--)
        {
            
        }
        
        @Sequence
        if(~f)
        {
            
        }

        //sequenced
        +f;
        -f;
        f++;
        --f;
        
        //non sequenced
        ++x;
        x--;
        x++;
        --x;
        
        
        // sequenced with non sequenced
        x*f;
        f*x;
        x+f;
        f+x;
        x/f;
        f/x;
        f%x;
        x%f;
        x-f;
        f-x;
        f<<x;
        f>>x;
        f>>>x;
        x>f;
        f>x;
        f<x;
        x<f;
        f<x;
        x<=f;       
        f<=x;
        x>=f;
        f>=x;
        f==x;
        x==f;
        x!=f;
        f!=x;
        f&x;
        x&f;
        f=f^x;
        x^f;
        f|x;
        x|x;
        
        @Sequence
        if(f&&x)
        {
            f||x;
            x||f;
        }
        x&&f;
        x=f;
        f=x;
        f+=x;
        x+=f;
        f-=x;
        x-=f;
        f*=x;
        x*=f;
        f&=x;
        x&=f;
        f|=x;
        x|=f;
        f^=x;
        x^=f;
        f%=x;
        x%=f;
        f<<=x;
        x<<=f;
        f>>=x;
        x>>=f;
        f>>>=x;
        x>>>=f;
        
        // sequenced with sequenced
        y*f;
        f*y;
        y+f;
        f+y;
        y/f;
        f/y;
        f%y;
        y%f;
        y-f;
        f-y-x;
        
        @Sequence
        if(f instanceof Integer)
        {
            
        }
        f>y?f:x;
        x>x?x:x;
        f>x?x:x;
        x>x?f:x;
        f>f?f:f;
        y<<f;
        f<<y;
        f>>y;
        y>>f;
        f>>>y;
        y>>>f;
        y>f;
        f>y;
        f<y;
        y<f;
        f<y;
        y<=f;       
        f<=y;
        y>=f;
        f>=y;
        f==y;
        y==f;
        f!=y;
        y!=f;
        y&f;
        f&y;
        f=f^y;
        y^f;
        f|y;
        y|y;
        
        @Sequence
        if(f&&y)
        {
            f||y;
            y||f;
        }
        y&&f;
        y=f;
        f=y;
        f+=y;
        y+=f;
        f-=y;
        y-=f;
        f*=y;
        y*=f;;
        f&=y;
        y&=f;
        f|=y;
        y|=f;
        f^=y;
        y^=f;
        f%=y;
        y%=f;
        f<<=y;
        y<<=f;
        f>>=y;
        y>>=f;
        f>>>=y;
        y>>>=f;
        
        x=x+f;
        
        @Sequence 
        if(u>19)
        {
            
        }
        else
        {
            
        }
        
        @Sequence
        if(y<f)
        {
            
        }      
        else
        {
            
        }
        
 	/**
 	*  Block 1
 	**/
      @Sequence
      int test=0;

      @Sequence
      if (test==1) {
          test+=10;
      } else {
          @Sequence
          while(test>10) {
              test++;
              @Sequence
              break;
          }
      }
   

        /*@Sequence
        do
        {
            @Sequence
            int x=0;
            x++;
        }
        while(x<10);*/

        
        
        @Sequence
        switch(x)
        {
            case 1:
            {
                int x=0;
                int y=0;
                break;
            }
            case 2:
            {
                int x=0;
                int y=0;
            }
            case 3:
            {
                int x=0;
                int y=0;
            }
            case 4:
            {
                int x=0;
                int y=0;
                break;
            }  
        }
        
        
        
        
        @Sequence
        JavaLexer lex = null;
        
        try {
            if (ParseCmdLine.verbose) System.out.println("Running compiler on " + fileName);
            lex = new JavaLexer(new ANTLRFileStream(fileName));
        } catch (Exception t) {
            System.out.println("Error building the Java lexer: probably could not open file " + fileName);
            t.printStackTrace();
            //System.exit(-1);
        }
        CommonTokenStream tokens = new CommonTokenStream(lex);
        JavaParser parser = new JavaParser(tokens);
        try {
            parser.compilationUnit();
            //System.out.println("in here " + q);
        } catch (JavaParseException t) {
            System.out.println("SequencedJava.java: Error " + t.msg);
            //t.printStackTrace();
            //System.exit(-1);
        } catch (RecognitionException t) {
            System.out.println("SequencedJava.java: Parse Error " + parser.getMessages());
            //t.printStackTrace();
            //System.exit(-1);
        } catch (Exception t) {
            System.out.println("SequencedJava.java: other error ");
            t.printStackTrace();
            //System.exit(-1);
        }
        
        @Sequence
        return (x>y);
    }
}
