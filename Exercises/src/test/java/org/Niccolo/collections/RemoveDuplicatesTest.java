package org.Niccolo.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    void testRemoveDuplicatesSlow(){
        assertEquals(List.of(1, 2, 3), RemoveDuplicates.removeDuplicatesSlow(new ArrayList<>(List.of(1, 1, 2, 3, 1, 3, 2, 2))));
        assertEquals(List.of(1, 2, 3), RemoveDuplicates.removeDuplicatesSlow(new ArrayList<>(List.of(1, 2, 3))));
        assertEquals(List.of(1), RemoveDuplicates.removeDuplicatesSlow(new ArrayList<>(List.of(1, 1))));
        assertEquals(List.of(1), RemoveDuplicates.removeDuplicatesSlow(new ArrayList<>(List.of(1))));
        assertEquals(List.of(), RemoveDuplicates.removeDuplicatesSlow(new ArrayList<>(List.of())));
    }

    @Test
    void testRemoveDuplicatesFast(){
        assertEquals(List.of(1, 2, 3), RemoveDuplicates.removeDuplicatesFast(List.of(1, 1, 2, 3, 1, 3, 2, 2)));
        assertEquals(List.of(1, 2, 3), RemoveDuplicates.removeDuplicatesFast(List.of(1, 2, 3)));
        assertEquals(List.of(1, 2, 3), RemoveDuplicates.removeDuplicatesFast(List.of(3, 1, 2)));
        assertEquals(List.of(1), RemoveDuplicates.removeDuplicatesFast(List.of(1, 1)));
        assertEquals(List.of(1), RemoveDuplicates.removeDuplicatesFast(List.of(1)));
        assertEquals(List.of(), RemoveDuplicates.removeDuplicatesFast(List.of()));
    }
}