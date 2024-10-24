/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.usu.polyverse.iterate;

/**
 *
 * @author curt
 */
public class Wrapper<T> {
    T value;

    /**
     *
     * @param o
     */
    public Wrapper(T o) {
        value = o;
    }
    
    public Object getValue() {
        return value;
    }
}
