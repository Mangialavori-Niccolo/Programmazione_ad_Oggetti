package org.Niccolo.oop.reverse;

public class ReverserSlow implements Reverser{
    @Override
    public String reverse(String s){
        char[] res = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            res[s.length() -1 - i] = s.charAt(i);
        }

        return String.valueOf(res);
    }
}
