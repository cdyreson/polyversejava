package edu.usu.polyverse.metadata;

/**
 *
 * @author curt
 */
public class PolyverseSemantics<T> {

    Semantics<T> semantics;
    static SequencedSemantics temporal = new SequencedSemantics();
    
    public PolyverseSemantics(Semantics<T> s){
        semantics = s;
    }

    public PolyverseContext meld(PolyverseContext<T> alpha, PolyverseContext<T> beta) {
        return semantics.meld(alpha, beta);
    }

    public PolyverseContext meld(PolyverseContext<T> alpha, PolyverseContext<T> beta, PolyverseContext<T> gamma) {
        return semantics.meld(alpha, beta, gamma);
    }
}
