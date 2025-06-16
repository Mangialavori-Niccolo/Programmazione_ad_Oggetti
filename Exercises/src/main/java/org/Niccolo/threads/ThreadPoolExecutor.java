package org.Niccolo.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPoolExecutor {
    public static final int MAX_TASKS = 8;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        RandomGenerator rnd = RandomGenerator.getDefault();

        for (int i = 0; i < MAX_TASKS; i++) {
            int taskNumber = i;
            executorService.submit(() -> {
                long startTime = System.nanoTime();
                System.out.println("START thread = " + Thread.currentThread().getName() + ", task = " + taskNumber);

                try {
                    Thread.sleep(rnd.nextInt(1000));
                } catch (InterruptedException ignored) {
                }

                long endTime = System.nanoTime();
                System.out.println("STOP thread = " + Thread.currentThread().getName() + ", task = " + taskNumber + ", time = " + TimeUnit.NANOSECONDS.toMillis(endTime - startTime));
            });
        }

        executorService.shutdown();
    }
}
