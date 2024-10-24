/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usu.polyverse.metadata;

/**
 *
 * @author vishal

 Generic TemporalPeriod class to store temporal object
 */
public class TemporalPeriod {

    public int data;
    public int start;
    public int end;

    public TemporalPeriod() {
        data = 0;
        start = 0;
        end = 0;
    }

    public TemporalPeriod(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public TemporalPeriod(int data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }
}
