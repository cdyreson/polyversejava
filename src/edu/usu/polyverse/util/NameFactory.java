/*
 * NameFactory 
 */
package edu.usu.polyverse.util;

import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * A NameFactory generates new names
 * @author Curt
 */
public class NameFactory {

    Set<String> namesSet;
    int counter;

    public NameFactory() {
        namesSet = new HashSet();
        counter = 0;
    }


    /* Add a new name for a data node
     * @param String - name of original data node
     * @return new name
     */
    public String getCutsName(String s) {
        return s + "_cuts";
    } 

    /* Add a new name 
     * @param String - original name
     * @return new name
     */
    public String addName(String s) {
        if (namesSet.contains(s)) {
            s += counter++;
        }
        namesSet.add(s);
        return s;
    }
}
