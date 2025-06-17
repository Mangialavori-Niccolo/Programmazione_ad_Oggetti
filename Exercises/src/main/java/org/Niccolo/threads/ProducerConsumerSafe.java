package org.Niccolo.threads;

import java.util.Deque;
import java.util.LinkedList;

public class ProducerConsumerSafe{
    static class ProducerSafe extends Thread {
        Deque<Integer> queue;

        public ProducerSafe(Deque<Integer> queue) {
            super();
            this.queue = queue;
        }

        @Override
        public void run() {
            int value = 0;
            while(!isInterrupted()){
                synchronized (queue){
                    queue.addFirst(value++);
                    queue.notifyAll();
                }
            }
        }
    }

    static class ConsumerSafe extends Thread {
        Deque<Integer> queue;

        public ConsumerSafe(Deque<Integer> queue) {
            super();
            this.queue = queue;
        }

        @Override
        public void run() {
            int counter = 0;
            while (!isInterrupted()) {
                synchronized (queue){
                    if(!queue.isEmpty()) {
                        queue.pollLast();
                        counter++;
                    }
                    else {
                        try {
                            queue.wait();
                        } catch (InterruptedException ignored) {
                        }
                    }
                }
            }
            System.out.println("Total number of elements consumed = " + counter);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> queue = new LinkedList<>();
        ProducerSafe producer = new ProducerSafe(queue);
        ConsumerSafe consumer = new ConsumerSafe(queue);

        producer.start();
        consumer.start();

        Thread.sleep(100);

        producer.interrupt();
        consumer.interrupt();

        consumer.join();
        producer.join();
    }
}
