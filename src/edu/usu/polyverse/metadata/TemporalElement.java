/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usu.polyverse.metadata;

import edu.usu.polyverse.metadata.TemporalPeriod;
import edu.usu.polyverse.scalar.PolyverseInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 *
 * @author dyreson
 */
public class TemporalElement implements Iterable<TemporalPeriod> {

    ArrayList<TemporalPeriod> queue = new ArrayList();
    private static TemporalElement defaultTemporalElement = new TemporalElement(new TemporalPeriod(0, 100));
    
    boolean debug = false;

    public TemporalElement() {
        queue = new ArrayList();
    }

    public TemporalElement(TemporalPeriod t) {
        queue.add(t);
    }

    public static TemporalElement getDefaultTemporalElement() {
        return defaultTemporalElement;
    }
    public void add(TemporalPeriod t) {
        queue.add(t);
    }

    @Override
    public Iterator<TemporalPeriod> iterator() {
        return queue.iterator();
    }

    @Override
    public String toString() {
        String s = "";
        for (TemporalPeriod t : queue) {
            s += t;
        }
        return s;
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public TemporalElement intersect(TemporalElement res) {
        TemporalElement result = new TemporalElement();

        for (TemporalPeriod timeA : res.queue) {
            for (TemporalPeriod timeB : this.queue) {

                int min = timeA.start > timeB.start ? timeA.start : timeB.start;
                int max = timeA.end > timeB.end ? timeB.end : timeA.end;

                // check if there is any intersection or overlapping
                if (min <= max) {
                    TemporalPeriod temp = new TemporalPeriod();

                    // assign the values
                    temp.data = timeA.data;
                    temp.start = min;
                    temp.end = max;

                    //add it to results
                    result.add(temp);
                }
            }
        }

        if (debug) {
            System.out.println("In intersect ");
            for (TemporalPeriod q : result) {
                System.out.println(q.data + " " + q.start + " " + q.end);
            }
        }
        return result;
    }
}
