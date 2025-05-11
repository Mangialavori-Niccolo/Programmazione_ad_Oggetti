package org.Niccolo.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UnionTest {
    @Test
    void testUnionBruteForce(){
        assertEquals(Set.of(1, 2, 3, 4, 5, 6, 7, 8), Union.unionBruteForce(Set.of(1, 2, 3, 4), Set.of(1, 5, 6, 7, 8)));
        assertEquals(Set.of(1, 2, 3, 4), Union.unionBruteForce(Set.of(1, 2, 3, 4), Set.of()));
        assertEquals(Set.of(), Union.unionBruteForce(Set.of(), Set.of()));
        assertEquals(Set.of(1, 2), Union.unionBruteForce(Set.of(1, 2), Set.of(1, 2)));
    }

    @Test
    void testUnion(){
        assertEquals(Set.of(1, 2, 3, 4, 5, 6, 7, 8), Union.union(Set.of(1, 2, 3, 4), Set.of(1, 5, 6, 7, 8)));
        assertEquals(Set.of(1, 2, 3, 4), Union.union(Set.of(1, 2, 3, 4), Set.of()));
        assertEquals(Set.of(), Union.union(Set.of(), Set.of()));
        assertEquals(Set.of(1, 2), Union.union(Set.of(1, 2), Set.of(1, 2)));
    }

    @Test
    void testUnionAddAll(){
        assertEquals(Set.of(1, 2, 3, 4, 5, 6, 7, 8), Union.unionAddAll(Set.of(1, 2, 3, 4), Set.of(1, 5, 6, 7, 8)));
        assertEquals(Set.of(1, 2, 3, 4), Union.unionAddAll(Set.of(1, 2, 3, 4), Set.of()));
        assertEquals(Set.of(), Union.unionAddAll(Set.of(), Set.of()));
        assertEquals(Set.of(1, 2), Union.unionAddAll(Set.of(1, 2), Set.of(1, 2)));
    }


    /*TEST PROF
    @Test
    void union() {
        assertEquals(Set.of(1,2,3,4,5,6), Union.union(Set.of(1, 2, 3), Set.of(4, 5, 6)));
        assertEquals(Set.of(1,2,3,4,5), Union.union(Set.of(1, 2, 3), Set.of(3, 4, 5)));
        assertEquals(Set.of(), Union.union(Set.of(), Set.of()));
        assertEquals(Set.of(1,2,3), Union.union(Set.of(1, 2, 3), Set.of()));
        assertEquals(Set.of(4,5,6), Union.union(Set.of(), Set.of(4, 5, 6)));
        assertEquals(Set.of(5, 6, 7, 8), Union.union(Set.of(5, 6, 7, 8), Set.of(5, 6, 7, 8)));
    }

    @Test
    void unionAddAll() {
        assertEquals(Set.of(1,2,3,4,5,6), Union.unionAddAll(Set.of(1, 2, 3), Set.of(4, 5, 6)));
        assertEquals(Set.of(1,2,3,4,5), Union.unionAddAll(Set.of(1, 2, 3), Set.of(3, 4, 5)));
        assertEquals(Set.of(), Union.unionAddAll(Set.of(), Set.of()));
        assertEquals(Set.of(1,2,3), Union.unionAddAll(Set.of(1, 2, 3), Set.of()));
        assertEquals(Set.of(4,5,6), Union.unionAddAll(Set.of(), Set.of(4, 5, 6)));
        assertEquals(Set.of(5, 6, 7, 8), Union.unionAddAll(Set.of(5, 6, 7, 8), Set.of(5, 6, 7, 8)));
    }
     */
}