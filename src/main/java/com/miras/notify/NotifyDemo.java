package com.miras.notify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by miras108 on 2017-07-02.
 */
public class NotifyDemo {

    private static List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException{

        Runnable addJob = () -> {

            synchronized (synchronizedList) {

                synchronizedList.add("added");
                System.out.println("add job");
                synchronizedList.notifyAll();
            }
        };

        Runnable removeJob = () -> {
            synchronized (synchronizedList) {

                if (synchronizedList.isEmpty()) {
                    try {
                        synchronizedList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("remove job");
                synchronizedList.remove("removed");
            }
        };

        new Thread(removeJob).start();
        sleep(500);
        new Thread(removeJob).start();
        sleep(500);
        new Thread(addJob).start();
        sleep(500);
        new Thread(addJob).start();
    }
}
