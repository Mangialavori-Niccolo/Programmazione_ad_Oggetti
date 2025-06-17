package org.Niccolo.threads;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ProducerConsumerUnsafe {
    static class ProducerUnsafe extends Thread {
        Deque<Integer> queue;

        public ProducerUnsafe(Deque<Integer> queue) {
            super();
            this.queue = queue;
        }

        @Override
        public void run() {
            int value = 0;
            while (!isInterrupted()) {
                queue.addFirst(value);
            }
        }
    }

    static class ConsumerUnsafe extends Thread {
        Deque<Integer> queue;

        public ConsumerUnsafe(Deque<Integer> queue) {
            super();
            this.queue = queue;
        }

        @Override
        public void run() {
            long counter = 0;
            while (!isInterrupted()) {
                if(!queue.isEmpty()) {
                    queue.pollLast();
                    counter++;
                }
                else {
                    Thread.yield();
                }
            }
            System.out.println("Total number of consumed elements = " + counter);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> queue = new ConcurrentLinkedDeque<>();
        ProducerUnsafe producer = new ProducerUnsafe(queue);
        ConsumerUnsafe consumer = new ConsumerUnsafe(queue);

        producer.start();
        consumer.start();

        Thread.sleep(100L);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();
    }
}
