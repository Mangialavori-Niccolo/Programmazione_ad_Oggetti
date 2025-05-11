package org.Niccolo.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {
    @Test
    void intersection(){
        assertEquals(Set.of(1, 2, 3, 4, 5), Intersection.intersection(Set.of(1, 2, 3, 4, 5, 6, 7, 8), Set.of(0, 1, 2, 3, 4, 5, 10)));
        assertEquals(Set.of(), Intersection.intersection(Set.of(), Set.of()));
        assertEquals(Set.of(), Intersection.intersection(Set.of(1, 2, 3), Set.of(4, 5, 6)));
        assertEquals(Set.of(), Intersection.intersection(Set.of(1, 2, 3), Set.of()));
        assertEquals(Set.of(3), Intersection.intersection(Set.of(1, 2, 3), Set.of(3, 4, 5, 6)));
    }

    @Test
    void intersectionRetainAll(){
        assertEquals(Set.of(1, 2, 3, 4, 5), Intersection.intersectionRetainAll(Set.of(1, 2, 3, 4, 5, 6, 7, 8), Set.of(0, 1, 2, 3, 4, 5, 10)));
        assertEquals(Set.of(), Intersection.intersectionRetainAll(Set.of(), Set.of()));
        assertEquals(Set.of(), Intersection.intersectionRetainAll(Set.of(1, 2, 3), Set.of(4, 5, 6)));
        assertEquals(Set.of(), Intersection.intersectionRetainAll(Set.of(1, 2, 3), Set.of()));
        assertEquals(Set.of(3), Intersection.intersectionRetainAll(Set.of(1, 2, 3), Set.of(3, 4, 5, 6)));
    }

    /*TEST PROF:

    @Test
    void intersection() {
        assertEquals(Set.of(), Intersection.intersection(Set.of(1, 2, 3), Set.of(4, 5, 6)));
        assertEquals(Set.of(3), Intersection.intersection(Set.of(1, 2, 3), Set.of(3, 4, 5)));
        assertEquals(Set.of(), Intersection.intersection(Set.of(), Set.of()));
        assertEquals(Set.of(), Intersection.intersection(Set.of(1, 2, 3), Set.of()));
        assertEquals(Set.of(), Intersection.intersection(Set.of(), Set.of(1, 2, 3)));
        assertEquals(Set.of(5, 6, 7, 8), Intersection.intersection(Set.of(5, 6, 7, 8), Set.of(5, 6, 7, 8)));
    }

    @Test
    void intersectionRetainAll() {
        assertEquals(Set.of(), Intersection.intersectionRetainAll(Set.of(1, 2, 3), Set.of(4, 5, 6)));
        assertEquals(Set.of(3), Intersection.intersectionRetainAll(Set.of(1, 2, 3), Set.of(3, 4, 5)));
        assertEquals(Set.of(), Intersection.intersectionRetainAll(Set.of(), Set.of()));
        assertEquals(Set.of(), Intersection.intersectionRetainAll(Set.of(1, 2, 3), Set.of()));
        assertEquals(Set.of(), Intersection.intersectionRetainAll(Set.of(), Set.of(1, 2, 3)));
        assertEquals(Set.of(5, 6, 7, 8), Intersection.intersectionRetainAll(Set.of(5, 6, 7, 8), Set.of(5, 6, 7, 8)));
    }
     */
}