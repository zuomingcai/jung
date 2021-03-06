/*
 * Created on May 24, 2008
 *
 * Copyright (c) 2008, The JUNG Authors 
 *
 * All rights reserved.
 *
 * This software is open-source under the BSD license; see either
 * "license.txt" or
 * https://github.com/jrtom/jung/blob/master/LICENSE for a description.
 */
package edu.uci.ics.jung.graph;

import java.util.Collection;

import com.google.common.base.Predicate;

/**
 * An interface for graphs whose vertices are each members of one of 2 or more 
 * disjoint sets (partitions), and whose edges connect only vertices in distinct
 * partitions.
 * 
 * @author Joshua O'Madadhain
 */
public interface KPartiteGraph<V,E> extends Graph<V,E>
{
    /**
     * Returns all vertices which satisfy the specified <code>partition</code> predicate.
     * @param partition <code>Predicate</code> which defines a partition
     * @return all vertices satisfying <code>partition</code>
     */
    public Collection<V> getVertices(Predicate<V> partition);

    /**
     * Returns the set of <code>Predicate</code> instances which define this graph's partitions.
     * @return the set of <code>Predicate</code> instances which define this graph's partitions
     */
    public Collection<Predicate<V>> getPartitions();

}
