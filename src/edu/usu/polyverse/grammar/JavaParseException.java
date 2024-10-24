/*
 * A parser exception
 */

package edu.usu.polyverse.grammar;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author Curtis Dyreson
 */
public class JavaParseException extends RecognitionException {
   public String msg = "";
   
   public JavaParseException(String msg) {
       this.msg = msg;
   }
   
}
