package edu.usu.polyverse.grammar;

import java.util.HashMap;

public class SymbolTable<K, Boolean> {

    private ltab<K, Boolean> tbl;
    private int level;

    public SymbolTable() {
        level = 0;
        tbl = new ltab<K, Boolean>();
        // enterScope();
    }

    public int enterScope() {
        tbl = new ltab<K, Boolean>(new HashMap<K, Boolean>(), tbl);
        level = level + 1;
        return 0;
    }

    /**
     * Exits the most recently entered scope.
     */
    public int exitScope() {
        if (tbl.empty()) {
            System.out.println(" escopeERROR: trying to exit ");
        }
        tbl = tbl.tail;
        level = level - 1;
        return 0;
    }

    public void addId(K k, Boolean v) {
        if (tbl.empty()) {
            System.out.println(" addidERROR: empty table ");
        }
        HashMap<K, Boolean> h = tbl.ht;
        if (!h.containsKey(k)) {
            h.put(k, v);
        }
    }

    public boolean lookup(K k) {
        ltab<K, Boolean> t = tbl;
        HashMap<K, Boolean> h = t.ht;
        if (tbl.empty()) {
            System.out.println(" lookupERROR: empty table ");
        }
        while (h != null) {
            Boolean v = h.get(k);
            if (v == null) {
                t = t.tail;
                h = t.ht;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean probe(K k) {
        if (tbl.empty()) {
            System.out.println(" probeERROR: empty table ");
        }
        if (this.lookup(k)) {

            ltab<K, Boolean> t = tbl;
            HashMap<K, Boolean> h = t.ht;
            int curl = level;
            Boolean value = null;
            while (h != null) {
                //System.out.println("Scope Level " + curl);
                if (h.containsKey(k)) {
                    value = h.get(k);
                    //System.out.printf("%s = %s%n", key, value);

                }
                t = t.tail;
                h = t.ht;
                curl = curl - 1;
            }

            if (value.toString().equals("true")) {
                return true;
            }
        }
        return false;

    }

    public void display() {
        ltab<K, Boolean> t = tbl;
        HashMap<K, Boolean> h = t.ht;
        int curl = level;
        while (h != null) {
            System.out.println("Scope Level " + curl);
            for (K key : h.keySet()) {
                Boolean value = h.get(key);
                System.out.printf("%s = %s%n", key, value);
            }
            t = t.tail;
            h = t.ht;
            curl = curl - 1;
        }
    }

    public String toString() {
        ltab<K, Boolean> t = tbl;
        String res = "";
        HashMap<K, Boolean> h = t.ht;
        while (h != null) {
            res += h;
            t = t.tail;
            h = t.ht;
        }
        return res;
    }

    public int scopeLevel() {
        return level;
    }

    /*public static void main(String args[]) {
        SymbolTable st = new SymbolTable();
        st.enterScope();
        st.addId("i", true);
        st.addId("s", false);
        st.addId("r", true);
        st.enterScope();
        st.addId("y", true);
        st.addId("u", false);

        System.out.println(st.probe("u"));
        System.out.println(st.probe("y"));
        System.out.println(st.probe("c"));
        System.out.println(st.probe("asdfg"));
        System.out.println(st.probe("s")); 
        
        st.exitScope();
        st.addId("o", true);
        System.out.println(st.probe("o"));
        st.exitScope();
        //st.display();
    }*/

}

class ltab<K, V> {

    HashMap<K, V> ht;
    ltab<K, V> tail;

    ltab() {
        ht = null;
        tail = null;
    }

    ltab(HashMap<K, V> h, ltab<K, V> t) {
        ht = h;
        tail = t;
    }

    boolean empty() {
        return tail == null;
    }
}
