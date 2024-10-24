/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.usu.polyverse.grammar;
import java.util.*;

/**
 *
 * @author Curt
 */
public class PolyverseScope {
    	    
            static Stack<Boolean> isPolyVerseStack = new Stack();
    
    	    public static boolean isPolyverse() {
              //System.out.println("checking");
	      if (isPolyVerseStack.empty()) return false;
	      Boolean b = isPolyVerseStack.peek();
              //System.out.println(b);
	      return b.booleanValue();
	    }
	    
	    public static void enterPolyverseScope() {
              //System.out.println("Entering scope");
	      isPolyVerseStack.push(true);
	    }
	    
	    public static void setUniverseScope() {
	      isPolyVerseStack.push(false);
	    }
	    
	    public static void exitUniverseScope() {
	      isPolyVerseStack.pop();
	    }
	    public static void exitPolyverseScope() {
              //System.out.println("Exiting scope");
	      isPolyVerseStack.pop();
	    }
    
}
