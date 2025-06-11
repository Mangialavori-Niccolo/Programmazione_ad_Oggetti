package org.Niccolo.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterLists {
    public static List<List<String>> filterLists(List<List<String>> lists){
        List<List<String>> dst = new ArrayList<>();

        for (List<String> list : lists) {
            try{
                for(String s : list){
                    CheckString.checkString(s);
                }
                dst.add(list);
            } catch (ParseException ignored) {}
        }

        return dst;
    }
}
