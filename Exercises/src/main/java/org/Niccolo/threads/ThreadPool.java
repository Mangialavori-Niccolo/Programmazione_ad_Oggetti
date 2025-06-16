package org.Niccolo.threads;

import java.util.Random;
import java.util.random.RandomGenerator;

public class ThreadPool {
    public static final int MAX_TASKS = 8;

    public static void main(String[] args) {
        Thread[] threadPool = new Thread[MAX_TASKS];
        RandomGenerator randomGenerator = RandomGenerator.getDefault();

        for(int task = 0; task < MAX_TASKS; task++){

        }
    }
}
