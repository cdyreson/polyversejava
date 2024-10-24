/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usu.polyverse.metadata;

import java.util.List;

/**
 *
 * @author curt
 */
public interface Semantics<K> {

    PolyverseContext<K> meld(PolyverseContext<K> a, PolyverseContext<K> b);

    PolyverseContext<K> meld(PolyverseContext<K> a, PolyverseContext<K> b, PolyverseContext<K> c);
}
