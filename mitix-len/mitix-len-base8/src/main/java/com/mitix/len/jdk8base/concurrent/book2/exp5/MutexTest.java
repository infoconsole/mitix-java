package com.mitix.len.jdk8base.concurrent.book2.exp5;

import java.util.concurrent.TimeUnit;

/**
 * @author oldflame-jm
 * @create 2018/7/7
 * ${DESCRIPTION}
 */
public class MutexTest {
    public static void main(String[] args) {
        Mutex mutex = new Mutex();
        for (int i = 1; i < 4; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (; ; ) {
                        mutex.lock();
                        try {
//                            System.out.println("Thread t " + Thread.currentThread() + " locked");
                            TimeUnit.MILLISECONDS.sleep(20000000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            System.out.println("Thread t " + Thread.currentThread() + " unlocked");
                            mutex.unlock();
                            try {
                                TimeUnit.MILLISECONDS.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });
            thread.start();
        }
    }
}
