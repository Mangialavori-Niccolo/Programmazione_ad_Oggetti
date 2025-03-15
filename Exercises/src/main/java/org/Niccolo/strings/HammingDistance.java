package org.Niccolo.strings;

/*
In information theory, the Hamming distance between two strings of equal length is the number of positions at which
the corresponding symbols are different.
Given two strings, return their Hamming distance.
If the two strings have different lengths, return -1.

Examples:

hammingDistance("nicola", "n1cola") → 1
hammingDistance("nicola", "nicola") → 0
hammingDistance("nicola", "zzzzzz") → 6
hammingDistance("nicola", "nicol") → -1
hammingDistance("", "nicol") → -1
The method has the following prototype:

public static int hammingDistance(String s1, String s2);
where:

s1 is the first string
s2 is the second string
 */
public class HammingDistance {
    public static int hammingDistance(String s1, String s2){
        if(s1.length() != s2.length()) return -1;
        int cnt = 0;
        for (int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) cnt++;
        }

        return cnt;
    }
}
