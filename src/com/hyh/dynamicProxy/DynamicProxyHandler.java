package com.hyh.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    //TODO 动态代理上的所有调用都会重定向到单一的调用处理器上，他的工作是揭示调用类型并确定相应的对策
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*****proxy：" + proxy.getClass() +
                "method：" + method + ",args" +args);
        if (args != null){
            for (Object arg : args) {
                System.out.println("  " + arg);
            }
        }
        return method.invoke(proxied,args);
    }
}
