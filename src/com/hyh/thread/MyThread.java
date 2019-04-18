package com.hyh.thread;

public class MyThread implements Runnable{

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (true){
            System.out.println(Thread.currentThread().getName()+"程序在运行");
        }
    }

    public static void main(String[] args){
        MyThread myThread1 = new MyThread("张三");
        Thread thread = new Thread(myThread1,"进程名");
        thread.setDaemon(true);
        thread.start();
    }
}
