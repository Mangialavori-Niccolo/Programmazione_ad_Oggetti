package org.Niccolo.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordAfterWordTest {
    final String filename = "C:/Users/Niccolò/NICCOLO/UNIVERSITA'/2^ Anno/Risorse Programmazione ad Oggetti/james-joyce-ulysses.txt";

    @Test
    void wordFrequency() throws IOException {
        assertEquals("yesterdays", WordAfterWord.wordAfterWord(filename, "yesterday"));
        assertEquals("gold", WordAfterWord.wordAfterWord(filename, "goings"));
        assertEquals("zero", WordAfterWord.wordAfterWord(filename, "zermatt"));
    }
}