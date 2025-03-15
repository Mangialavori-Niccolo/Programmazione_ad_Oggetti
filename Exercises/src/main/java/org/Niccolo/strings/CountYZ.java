package org.Niccolo.strings;

/*
Write a method accepting a string, and counting the number of words ending in 'y' or 'z' so the 'y' in "heavy" and
the 'z' in "fez" count, but not the 'y' in "yellow" (not case-sensitive)
(see java.util.StringTokenizer class, String.endsWith() method).

Examples:

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
The method has the following prototype:

public static int countYZ(String string);
where:

string is the string to be processed
 */
public class CountYZ {
    public static int countYZ(String string){
        if(string.isEmpty()) return 0;
        String[] vett = string.split(" ");
        int count = 0;

        for(int i = 0; i < vett.length; i++){
            if(vett[i].endsWith("z") || vett[i].endsWith("Z") || vett[i].endsWith("y") || vett[i].endsWith("Y")){
                count++;
            }
        }

        return count;

        /* Versione del prof:
        int countYZ = 0;
        StringTokenizer tokenizer = new StringTokenizer(string);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().toLowerCase();
            if (token.endsWith("z") || token.endsWith("y")) {
                countYZ++;
            }
        }
        return countYZ;
         */
    }
}
