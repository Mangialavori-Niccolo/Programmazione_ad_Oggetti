package org.Niccolo.collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


class ReverseTest {
    final List<String> sentence1 = new ArrayList<>(List.of("I", "am", "happy"));
    final List<String> sentence2 = new ArrayList<>(List.of("I", "love"));
    final List<String> sentence3 = new ArrayList<>(List.of("I"));
    final List<String> sentence4 = new ArrayList<>(List.of());

    @Test
    void testReverseList(){
        Reverse.reverse(sentence1);
        Reverse.reverse(sentence2);
        Reverse.reverse(sentence3);
        Reverse.reverse(sentence4);

        assertEquals(List.of("happy", "am", "I"), sentence1);
        assertEquals(List.of("love", "I"), sentence2);
        assertEquals(List.of("I"), sentence3);
        assertEquals(List.of(), sentence4);
    }
}