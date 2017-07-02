package com.miras.threadlocal;

/**
 * Created by miras108 on 2017-07-01.
 */
public class ThreadLocalDemo {

    public static void main(String[] args) {

        for(int i=0; i<10; i++) {
            new Thread(new RunableWithThreadLocal(i)).start();
        }
    }
}
