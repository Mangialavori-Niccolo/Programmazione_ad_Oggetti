package org.Niccolo.collections;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        List<String> sentence = new ArrayList<>(List.of("I", "am", "a friend"));
        reverse(sentence);
    }

    public static void reverse(List<String> sentence){
        /*
        Sentence = "I" "am" "happy"
        stack = "happy" "am" "I"

        => Sentence = "happy" "am" "I"
         */

        Deque<String> stack = new LinkedList<>();
        while(!sentence.isEmpty()){
            stack.push(sentence.removeFirst());
        }
        while(!stack.isEmpty()){
            sentence.addLast(stack.pollFirst());
        }
    }
}
