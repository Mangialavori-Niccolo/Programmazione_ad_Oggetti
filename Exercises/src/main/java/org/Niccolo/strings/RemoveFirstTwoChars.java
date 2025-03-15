package org.Niccolo.strings;

/*
Write two methods accepting a string and returning the same string without the first two characters.
The first one has to use String.charAt(), while the second one has to use StringBuilder.delete().

Examples:

removeFirstTwoChars("Hello World!") → "llo World!"
removeFirstTwoChars("No") → ""
removeFirstTwoChars("Y") → ""
The methods have the following prototype:

public static String removeFirstTwoCharsCharAt(String string);
public static String removeFirstTwoCharsStringBuilder(String string);
where:

string is the string to be processed
 */
public class RemoveFirstTwoChars {
    public static String removeFirstTwoCharsCharAt(String string){
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i < string.length(); i++){
            sb.append(string.charAt(i));
        }

        return sb.toString();
    }

    public static String removeFirstTwoCharsStringBuilder(String string){
        return new StringBuilder(string).delete(0, 2).toString();
    }
}
