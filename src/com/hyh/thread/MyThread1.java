package com.hyh.thread;

public class MyThread1 extends Thread {
    private String name;

    public MyThread1(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 0;i<10;i++){
            System.out.println("name"+name+"i"+i);
        }
    }

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1("王五");
        MyThread1 myThread11 = new MyThread1("刘六");
        myThread1.start();
        myThread11.start();
    }
}
