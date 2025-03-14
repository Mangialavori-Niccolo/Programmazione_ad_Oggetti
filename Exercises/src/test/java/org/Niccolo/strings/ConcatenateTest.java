package org.Niccolo.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {
    @Test
    public void concatenate() {
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"Hello", " ", "World", "!"}));
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"H", "e", "llo", " ", "World!"}));
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"Hello World", "!"}));
    }
}