package com.hyh.observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        WeixinUser weixinUser1 = new WeixinUser("111");
        WeixinUser weixinUser2 = new WeixinUser("222");
        WeixinUser weixinUser3 = new WeixinUser("333");
        subscriptionSubject.attach(weixinUser1);
        subscriptionSubject.attach(weixinUser2);
        subscriptionSubject.attach(weixinUser3);
        subscriptionSubject.notify("新的消息来了");
    }
}
