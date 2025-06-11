package org.Niccolo.exceptions;

import java.text.ParseException;

public class CheckString {
    public static void checkString(String s) throws ParseException{
        if(s.length() < 2 || s.length() % 2 != 0){
            throw new ParseException("Length not divisible by 2", 0);
        }

        char[] array = s.toCharArray();
        for(int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                if(!Character.isLetter(array[i])) throw new ParseException(String.format("array[%d] not a letter", i), i);
            }
            else if (!Character.isDigit(array[i])) throw new ParseException(String.format("array[%d] not a digit", i), i);
        }
    }

    /*
    Versione del Prof
     */
    public static void checkStringProf(String s) throws ParseException {
        if (s.length() < 2 || s.length() % 2 != 0) {
            throw new ParseException(s, 0);
        }
        boolean waitingLetter = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c) && (waitingLetter)) {
                throw new ParseException(s, i);
            }
            if (Character.isLetter(c) && (!waitingLetter)) {
                throw new ParseException(s, i);
            }
            waitingLetter = !waitingLetter;
        }
    }
}
