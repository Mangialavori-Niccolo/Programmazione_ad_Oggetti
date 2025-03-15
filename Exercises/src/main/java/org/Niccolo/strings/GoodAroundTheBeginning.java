package org.Niccolo.strings;

/*
Write a method accepting a string and returning true if "good" appears either at index 0 or 1 of the given string
(see String.startsWith() method).

Examples:

goodAroundTheBeginning("good Sweet") → true
goodAroundTheBeginning("_good Sweet") → true
goodAroundTheBeginning("__good Sweet") → false
goodAroundTheBeginning("goo") → false
The method has the following prototype:

public static boolean goodAroundTheBeginning(String s);
where:

string is the string to be processed
 */
public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String s){
        return s.startsWith("good") || s.substring(1).startsWith("good");
    }
}
