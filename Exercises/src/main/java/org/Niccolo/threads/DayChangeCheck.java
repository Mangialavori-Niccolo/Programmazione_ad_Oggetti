package org.Niccolo.threads;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class DayChangeCheck extends Thread{
    public DayChangeCheck(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");
        while(!interrupted()){
            LocalDateTime lastChecked = LocalDateTime.now();

            try {
                Thread.sleep(TimeUnit.MINUTES.toMillis(15));
            } catch (InterruptedException ignored) {
            }

            LocalDateTime test = LocalDateTime.now();
            if(test.getDayOfMonth() != lastChecked.getDayOfMonth()){
                System.out.println(getName() + " the number of the Dat is changed");
                lastChecked = test;
            }
        }
    }

    public static void main(String[] args) {
        DayChangeCheck t1 = new DayChangeCheck("t1");
        t1.start();
    }
}
