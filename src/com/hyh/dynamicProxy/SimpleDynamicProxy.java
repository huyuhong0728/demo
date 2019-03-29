package com.hyh.dynamicProxy;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bobobo");
    }
    public static void main(String[] ars) {
        RealObject realObject = new RealObject();
        consumer(realObject);
        //TODO 通过为 Proxy 类指定 ClassLoader 对象和一组 interface 来创建动态代理类，并通过构造函数创建动态代理类实例，构造时调用处理器对象作为参数被传入
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(realObject)
        );
        consumer(proxy);
    }
}
