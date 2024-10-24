package edu.usu.polyverse.metadata;

/**
 * The PolyverseSimplex class has information about the metadata in a polyverse value.
 * The PolyverseSimplex is a value chosen from each metadata domain.
 * @author Curtis Dyreson
 */
public class PolyverseSimplex {
    TemporalElement time;
    public PolyverseSimplex() {
        time = new TemporalElement();
    }
    
    public PolyverseSimplex(TemporalElement t) {
        time = t;
    }
    
    public PolyverseSimplex meld(PolyverseSimplex m) {
        return null;
    }
    
    public PolyverseSimplex meld(PolyverseSimplex m1, PolyverseSimplex m2) {
        return null;
    }
}
