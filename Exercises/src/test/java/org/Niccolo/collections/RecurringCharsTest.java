package org.Niccolo.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecurringCharsTest {
    @Test
    void testRecurringChars(){
        assertEquals(Set.of('l', 'e', 'y', 'o'), RecurringChars.recurringChars("Hello everybody"));
        assertEquals(Set.of('l', 'e', 'h', '!'), RecurringChars.recurringChars("hello there!!"));
        assertEquals(Set.of(), RecurringChars.recurringChars("abcd"));
        assertEquals(Set.of('b', ' '), RecurringChars.recurringChars("a b c b"));
        assertEquals(Set.of(), RecurringChars.recurringChars(""));
        assertEquals(Set.of(), RecurringChars.recurringChars(null));
    }
}