package org.Niccolo.strings;

/*
Write a method accepting a String[] returning a single string representing the concatenation of all strings
of the array (see StringBuilder class).

Examples:

concatenate(["Hello", " ", "World!"]) → "Hello World!"
concatenate(["H", "e", "llo", " ", "World!"]) → "Hello World!"
concatenate(["Hello World", "!"]) → "Hello World!"
The method has the following prototype:

public static String concatenate(String[] strings);
where:

strings is the String array to be concatenated
 */
public class Concatenate {
    public static String concatenate(String[] strings){
        String out = strings[0];
        for(int i = 1; i < strings.length; i++){
            out = out.concat(strings[i]);
        }

        return out;
    }
}
