package org.Niccolo.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelPrimes {
    public static final int MAX_THREADS = 4;
    public static final int MAX_NUM = 6;    //Fattore moltiplicativo di 1000

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);

        //Inizializzo il vettore di oggetti PrimeEngine
        List<PrimeEngine> callables = new ArrayList<>();
        for(int i = 0; i < MAX_NUM; i++){
            callables.add(new PrimeEngine(i * 1000, (i+1) * 1000));
        }

        List<Future<List<Integer>>> resultes = executor.invokeAll(callables);

        Thread.sleep(1000);

        //Leggo i risultati
        for(Future<List<Integer>> singleresult : resultes){
            System.out.println(singleresult.get());
        }

        executor.shutdown();
    }



    public static class PrimeEngine implements Callable<List<Integer>> {
        int start;
        int end;

        public PrimeEngine(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public List<Integer> call() {
            List<Integer> result = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }
}
