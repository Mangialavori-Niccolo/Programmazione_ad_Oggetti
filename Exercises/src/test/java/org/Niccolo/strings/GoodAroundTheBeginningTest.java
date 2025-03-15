package org.Niccolo.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAroundTheBeginningTest {
    @Test
    public void goodAroundTheBeginning() {
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("good Sweet"));
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning(" good Sweet"));
        assertFalse(GoodAroundTheBeginning.goodAroundTheBeginning("goo"));
    }
}