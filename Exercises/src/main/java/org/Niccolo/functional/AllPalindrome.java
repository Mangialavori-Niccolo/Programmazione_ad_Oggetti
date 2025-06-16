package org.Niccolo.functional;

import java.util.List;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings){
        return strings.stream().allMatch(AllPalindrome::palindrome);
    }

    private static boolean palindrome (String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
