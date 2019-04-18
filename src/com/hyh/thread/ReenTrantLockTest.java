package com.hyh.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenTrantLockTest {
    static class NumberWarpper {
        public int value = 1;
    }
    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();

        final Condition reachThreeCondition = lock.newCondition();

        final Condition reachSixCondition = lock.newCondition();

        final NumberWarpper numberWarpper = new NumberWarpper();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println("线程A开始了");
                    while (numberWarpper.value<=3){
                        System.out.println(numberWarpper.value);
                        numberWarpper.value++;
                    }
                    reachThreeCondition.signal();
                }finally {
                    lock.unlock();
                }
                lock.lock();
                try {
                    reachSixCondition.await();
                    System.out.println("线程A又开始了");
                    while (numberWarpper.value<=9){
                        System.out.println(numberWarpper.value);
                        numberWarpper.value++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (numberWarpper.value<=3){
                        reachThreeCondition.await();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
                try {
                    lock.lock();
                    System.out.println("线程B开始了");
                    while (numberWarpper.value<=6){
                        System.out.println(numberWarpper.value);
                        numberWarpper.value++;
                    }
                    reachSixCondition.signal();
                }finally {
                    lock.unlock();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
