/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usu.polyverse.grammar;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.CommonToken;

/**
 *
 * @author Curtis Dyreson
 */
public class OurTree extends CommonTree {
    public String text = "asdf";
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();
    
    public OurTree(int i, String t) {
                      super();
              System.out.println("Constructor ");
              //super(i, t);
        //adaptor.create(i, t);
              token = new CommonToken(i, t);
    }
    
  public String toString() {
      System.out.println("asdfasdfsadf");
    return "asdf";
  }
}
