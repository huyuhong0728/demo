package com.hyh.dynamicProxy;

public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bobobo");
    }
    public static void main(String[] args){
        consumer(new RealObject());
        //TODO 下面这个我理解为SimpleProxy为代理，相当于监护人，这个监护人有一个构造函数，需要传入他的小孩(RealObject)
        // ，在他的方法里调用他小孩的方法，监护人在管着小孩，不直接解除小孩
        consumer(new SimpleProxy(new RealObject()));
    }
}
