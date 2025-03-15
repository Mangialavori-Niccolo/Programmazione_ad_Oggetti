package org.Niccolo.strings;

/*
Write two methods accepting a string and returning the reversed string.
The first one has to use only String's methods (see String.charAt()),
while the second one has to use StringBuilder's methods (see StringBuilder.reverse()).

Examples:

reverse("String test") → "tset gnirtS"
reverse("John Doe") → "eoD nhoJ"
reverse("Hello World!") → "!dlroW olleH"
Methods have the following prototype:

public static String reverseCharAt(String string);
public static String reverseStringBuilder(String string);
where:

string is the string to be reversed
 */
public class Reverse {
    public static String reverseCharAt(String string){
        char[] out = new char[string.length()];

        for(int i = 0; i < string.length(); i++){
            out[out.length - i - 1] = string.charAt(i);
        }

        return String.valueOf(out);
    }

    public static String reverseStringBuilder(String string){
        /*StringBuilder out = new StringBuilder(string);
        out.reverse();
        return out.toString();*/
        return new StringBuilder(string).reverse().toString();
    }
}
