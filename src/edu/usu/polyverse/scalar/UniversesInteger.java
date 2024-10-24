package edu.usu.polyverse.scalar;

import edu.usu.polyverse.metadata.PolyverseContext;

/**
 *
 * @author Curtis Dyreson
 */
public class UniversesInteger {
    int scalar;
    PolyverseContext metadata;
    
    public UniversesInteger(int v, PolyverseContext m) {
        scalar = v;
        metadata = m;
    }
    
    public int getValue() {
        return scalar;
    }
    
    public PolyverseContext getPolyverseContext() {
        return metadata;
    } 
}
