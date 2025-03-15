package org.Niccolo.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void isPalindrome() {
        assertFalse(Palindrome.isPalindrome("whistleblower"));
        assertTrue(Palindrome.isPalindrome("radar"));
        assertTrue(Palindrome.isPalindrome("r"));
        assertTrue(Palindrome.isPalindrome(""));
        assertTrue(Palindrome.isPalindrome("RaceCar"));
        assertFalse(Palindrome.isPalindrome("Algorithm"));
        assertTrue(Palindrome.isPalindrome("Level"));
    }
}