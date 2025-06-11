package org.Niccolo.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntervalBetweenDatesAltTest {
    @Test
    void checkIntervalBetweeenDatesAltTest(){
        assertTrue(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2022-03-12", "2025-01-01"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2022-03-12", "1999-12-31"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2022-03-12", "1999-31-31"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2022-03-12", "ciao-at-ut"));
    }
}