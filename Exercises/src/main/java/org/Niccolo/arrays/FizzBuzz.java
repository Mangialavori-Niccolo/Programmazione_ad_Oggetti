package org.Niccolo.arrays;

/*
Consider the series of numbers beginning at start and running up to but not including end. For example start=1 and
end=5 gives the series 1, 2, 3, 4. Return a new String[] array (see Integer.toString()) containing:

Fizz for multiples of 3;
Buzz for multiples of 5;
FizzBuzz for multiple of both 3 and 5;
the String version of the number in all the other cases.
start has to be less than end and both must be greater or equal to 0. Otherwise, the method returns an empty String array.

Examples:

fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(12, 17) → ["Fizz", "13", "14", "FizzBuzz", "16"]
fizzBuzz(8, 1) → []
The method has the following prototype:

public static String[] fizzBuzz(int start, int end);
where:

start is the beginning of the number series (included)
end is the end of the number series (excluded)
 */
public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end){
        if(end < start || start < 0) return new String[]{};

        String[] out = new String[end-start];

        for(int i = start, j = 0; i < end; i++, j++){
            if (i % 3 == 0 && i % 5 == 0){
                out[j] = "FizzBuzz";
            }
            else if (i % 3 == 0){
                out[j] = "Fizz";
            }
            else if (i % 5 == 0){
                out[j] = "Buzz";
            }
            else{
                out[j] = Integer.toString(i);
            }
        }

        return out;
    }
}
