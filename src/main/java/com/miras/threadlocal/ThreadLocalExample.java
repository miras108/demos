package com.miras.threadlocal;

/**
 * Created by miras108 on 2017-07-02.
 */
public class ThreadLocalExample {
    private static ThreadLocal<Double> threadLocalNumber = new ThreadLocal<Double>() {
        @Override
        protected Double initialValue() {
            return -1.0;
        }
    };

    public static void setThreadLocalNumber(Double threadLocalNumber)
    {
        ThreadLocalExample.threadLocalNumber.set(threadLocalNumber);
    }

    public Double getThreadLocalNumber()
    {
        return threadLocalNumber.get();
    }
}
