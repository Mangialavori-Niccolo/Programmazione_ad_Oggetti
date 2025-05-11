package org.Niccolo.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EratosthenesTest {
    @Test
    void testMyEratosthenes(){
        assertEquals(Set.of(2, 3, 5, 7), Eratosthenes.myEratosthenes(10));
        assertEquals(Set.of(2, 3), Eratosthenes.myEratosthenes(4));
        assertEquals(Set.of(2, 3, 5, 7, 11, 13, 17, 19), Eratosthenes.myEratosthenes(20));
    }

    @Test
    void testEratosthenes(){
        assertEquals(Set.of(2, 3, 5, 7), Eratosthenes.eratosthenes(10));
        assertEquals(Set.of(2, 3), Eratosthenes.eratosthenes(4));
        assertEquals(Set.of(2, 3, 5, 7, 11, 13, 17, 19), Eratosthenes.eratosthenes(20));
    }


    //TEST DEL PROF
    @Test
    void eratosthenes() {
        assertEquals(Set.of(), Eratosthenes.eratosthenes(-1));
        assertEquals(Set.of(), Eratosthenes.eratosthenes(1));
        assertEquals(Set.of(2, 3), Eratosthenes.eratosthenes(3));
        assertEquals(Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23), Eratosthenes.eratosthenes(26));

        assertEquals(Set.of(), Eratosthenes.myEratosthenes(-1));
        assertEquals(Set.of(), Eratosthenes.myEratosthenes(1));
        assertEquals(Set.of(2, 3), Eratosthenes.myEratosthenes(3));
        assertEquals(Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23), Eratosthenes.myEratosthenes(26));
    }
}