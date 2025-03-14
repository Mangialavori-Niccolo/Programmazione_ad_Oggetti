package org.Niccolo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanBalanceTest {
    @Test
    void canBalance() {
        assertTrue(CanBalance.canBalance(new int[]{5, 1, 1, 2, 1}));
        assertTrue(CanBalance.canBalance(new int[]{-5, -1, -1, -2, -1}));
        assertTrue(CanBalance.canBalance(new int[]{2, 1, 1, 2, 6}));
        assertTrue(CanBalance.canBalance(new int[]{10, 10}));
        assertFalse(CanBalance.canBalance(new int[]{11, 1, 1, 2, 1}));
        assertFalse(CanBalance.canBalance(new int[]{2, 1, 1, 2, 3}));
        assertFalse(CanBalance.canBalance(new int[]{-2, -1, -1, -2, -3}));
        assertFalse(CanBalance.canBalance(new int[]{1}));
    }
}