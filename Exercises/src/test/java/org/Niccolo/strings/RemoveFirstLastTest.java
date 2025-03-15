package org.Niccolo.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstLastTest {
    @Test
    public void removeFirstLast() {
        assertEquals("Google", RemoveFirstLast.removeFirstLast("Google"));
        assertEquals("oogl", RemoveFirstLast.removeFirstLast("eoogle"));
        assertEquals("", RemoveFirstLast.removeFirstLast("FF"));
        assertEquals("F", RemoveFirstLast.removeFirstLast("F"));
    }
}