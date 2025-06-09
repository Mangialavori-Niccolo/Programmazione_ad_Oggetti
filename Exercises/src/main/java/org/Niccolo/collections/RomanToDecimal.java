package org.Niccolo.collections;

import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RomanToDecimal {
    private static Map<Character, Integer> conversionMap (){
        return Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
    }


    public static int romanToDecimal(String s){
        if(s.length() < 1 || s.length() > 15){
            return -1;
        }

        Map<Character, Integer> conversionMap = conversionMap();

        int result = 0;
        s.toUpperCase();
        for(int i = 0; i < s.length(); i++){
            if(i < (s.length() - 1) && conversionMap.get(s.charAt(i)) < conversionMap.get(s.charAt(i+1))) {
                result -= conversionMap.get(s.charAt(i));
            }
            else result += conversionMap.get(s.charAt(i));
        }

        return result;
    }
}
