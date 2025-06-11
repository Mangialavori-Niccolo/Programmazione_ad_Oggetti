package org.Niccolo.exceptions;

public class CheckLicencePlate {
    private static void checkMadeOfLetters(String string){
        for(char c : string.toCharArray()){
            if(!Character.isLetter(c)) throw new IllegalArgumentException();
        }
    }

    private static void checkMadeOfDigits(String string){
        for(char c : string.toCharArray()){
            if(!Character.isDigit(c)) throw new IllegalArgumentException();
        }
    }

    public static void checkLicencePlate(String licence) throws IllegalArgumentException{
        if(licence.length() != 7){
            throw new IllegalArgumentException("Lenght != 7");
        }
        checkMadeOfLetters(licence.substring(0, 2));
        checkMadeOfDigits(licence.substring(2, 5));
        checkMadeOfLetters(licence.substring(5, 7));
    }
}
