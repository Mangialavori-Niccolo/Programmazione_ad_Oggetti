package org.Niccolo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Eratosthenes {
    public static Set<Integer> myEratosthenes(int n){
        if(n <= 2) return new HashSet<>();

        Set<Integer> primeNumbers = IntStream.rangeClosed(2, n).boxed().collect(Collectors.toSet());
        Iterator<Integer> it = primeNumbers.iterator();
        Set<Integer> primeFound = new HashSet<>(Set.of(it.next()));

        while(it.hasNext()){
            boolean prime = true;
            Integer curr = it.next();
            for(Integer i : primeFound){
                if (curr % i == 0){
                    it.remove();
                    prime = false;
                    break;
                }
            }
            if(prime) primeFound.add(curr);
        }

        return primeNumbers;
    }


    public static Set<Integer> eratosthenes(int n){
        Set<Integer> primes = new HashSet<>();
        for (int i = 2; i <= n; i++){
            primes.add(i);
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            primes.removeAll(multiples(i, n));
        }

        return primes;
    }

    private static Set<Integer> multiples(int i, int limit){
        Set<Integer> multiples = new HashSet<>();
        for(int j = 2; j * i <= limit; j++){
            multiples.add(j*i);
        }
        return multiples;
    }
}
