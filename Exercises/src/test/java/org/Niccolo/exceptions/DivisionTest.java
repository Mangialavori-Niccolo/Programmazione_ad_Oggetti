package org.Niccolo.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    @Test
    void divisionTest(){
        assertThrows(IllegalArgumentException.class, () -> Division.division(-1, 0));
        assertThrows(IllegalArgumentException.class, () -> Division.division(1, 0));
        assertEquals(2.0, Division.division(4.0, 2), 0.001);
        assertEquals(5, Division.division(25.0, 5), 0.001);
    }
}