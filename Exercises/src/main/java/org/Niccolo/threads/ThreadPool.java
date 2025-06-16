package org.Niccolo.threads;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPool {
    public static final int MAX_TASKS = 8;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threadPool = new Thread[MAX_TASKS];
        RandomGenerator randomGenerator = RandomGenerator.getDefault();

        for(int task = 0; task < MAX_TASKS; task++){
            int taskNumber = task;
            threadPool[task] = new Thread(() -> {
                long startTime = System.nanoTime();
                System.out.printf("START thread = %s, task = %d\n", Thread.currentThread().getName(), taskNumber);

                try {
                    Thread.sleep(randomGenerator.nextInt(1000));
                } catch (InterruptedException ignored) {
                }

                long stopTime = System.nanoTime();
                System.out.println("STOP thread = " + Thread.currentThread().getName() + ", task = " + taskNumber + ", time = " + TimeUnit.NANOSECONDS.toMillis(stopTime - startTime));
            });
        }

        for (int i = 0; i < MAX_TASKS; i++) {
            threadPool[i].start();
        }

        for (int i = 0; i < MAX_TASKS; i++) {
            threadPool[i].join();
        }
    }
}
