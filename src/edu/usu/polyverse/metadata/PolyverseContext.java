package edu.usu.polyverse.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * The PolyverseContext class has information about the metadata in a
 polyverse value. The PolyverseContext is a value chosen from each metadata
 domain.
 *
 * @author Curtis Dyreson
 */
public class PolyverseContext<K> {

    K value;
    List<K> valueList;
    public boolean isList;
    //static Semantics semantics;

    public PolyverseContext() {
        valueList = new ArrayList();
        isList = true;
    }

    public PolyverseContext(K v) {
        value = v;
        isList = false;
    }

    public PolyverseContext(List<K> v) {
        valueList = v;
        isList = true;
    }

    public void add(PolyverseContext<K> v) {
        if (!isList) {
            System.err.println("Error in MulitverseContext, trying to add to non-list");
            System.exit(-1);
        }
        if (v.isList) {
            valueList.addAll(v.valueList);
        } else {
            valueList.add(v.value);
        }
    }

    public boolean isEmpty() {
        if (!isList) {
            System.err.println("Error in MulitverseContext, trying to use as list in isEmpty");
            System.exit(-1);
        }
        return valueList.isEmpty();
    }

    public List<K> getList() {
        if (!isList) {
            System.err.println("Error in MulitverseContext, trying to use as list");
            System.exit(-1);
        }
        return valueList;
    }

    /*
    public PolyverseContext meld(PolyverseContext m) {
        return new PolyverseContext(semantics.meld(value, m.value));
    }
    
    public static void setSemantics(Semantics s) {
        semantics = s;
    }
    
    public PolyverseContext meld(PolyverseContext m1, PolyverseContext m2) {
        return new PolyverseContext(semantics.meld(value, m1.value, m2.value));
    }
     */
}
