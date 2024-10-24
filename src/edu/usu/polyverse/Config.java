/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usu.polyverse;

import edu.usu.polyverse.metadata.BayesianSemantics;
import edu.usu.polyverse.metadata.PolyverseContext;
import edu.usu.polyverse.metadata.PolyverseSemantics;
import edu.usu.polyverse.metadata.Semantics;
import edu.usu.polyverse.metadata.SequencedSemantics;
import edu.usu.polyverse.metadata.TemporalElement;

/**
 *
 * @author Curt
 */
public class Config {
    public static int max = 10000;
    /*
    public static PolyverseSemantics<TemporalElement> semantics = new PolyverseSemantics(new SequencedSemantics());
    public static PolyverseContext<TemporalElement> defaultContext = new PolyverseContext(TemporalElement.getDefaultTemporalElement());
    */
    public static PolyverseSemantics<Double> semantics = new PolyverseSemantics(new BayesianSemantics());
    public static PolyverseContext<Double> defaultContext = new PolyverseContext(1);

}
