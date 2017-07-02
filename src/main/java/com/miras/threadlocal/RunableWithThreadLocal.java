package com.miras.threadlocal;

import static java.lang.Math.random;
import static java.lang.Thread.sleep;

/**
 * Created by miras108 on 2017-07-01.
 */
public class RunableWithThreadLocal implements Runnable{

    private int threadNumber = -1;

    public RunableWithThreadLocal(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {

        try {
            sleep(new Double(random()*10).longValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadLocalExample threadLocal1 = new ThreadLocalExample();
        ThreadLocalExample threadLocal2 = new ThreadLocalExample();

        threadLocal1.setThreadLocalNumber(threadNumber + 0.1);
        threadLocal2.setThreadLocalNumber(threadNumber + 0.2);

        System.out.println("threadNumber: " + threadNumber);
        System.out.println("First thread local number: " + threadLocal1.getThreadLocalNumber());
        System.out.println("Second thread local number: " + threadLocal2.getThreadLocalNumber());
    }
}
