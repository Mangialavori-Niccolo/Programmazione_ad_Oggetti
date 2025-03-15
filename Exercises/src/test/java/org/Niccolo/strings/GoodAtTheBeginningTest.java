package org.Niccolo.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAtTheBeginningTest {
    @Test
    public void goodAtTheBeginning() {
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good Sweet"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning(" good Sweet"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("goo"));
    }
}