package edu.usu.polyverse.scalar;

import edu.usu.polyverse.metadata.PolyverseContext;

/**
 *
 * @author Curtis Dyreson
 */
public class UniversesBoolean {
    boolean scalar;
    PolyverseContext metadata;
    
    public UniversesBoolean(boolean v, PolyverseContext m) {
        scalar = v;
        metadata = m;
    }
    
    public boolean getValue() {
        return scalar;
    }
    
    public PolyverseContext getPolyverseContext() {
        return metadata;
    } 
}
