package com.hyh.niu;

public class Test1 {
    public static Test1 t1 = new Test1();       //1
    {
        System.out.println("blockA");
    }
    static
    {
        System.out.println("blockB");           //2
    }
    public static void main(String[] args)
    {
        Test1 t2 = new Test1();                 //3
    }
}
