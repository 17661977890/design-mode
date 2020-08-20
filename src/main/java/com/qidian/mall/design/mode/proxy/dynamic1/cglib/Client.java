package com.qidian.mall.design.mode.proxy.dynamic1.cglib;


import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * 动态代理 + 反射
 * @Author binsun
 * @Date
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Intermediary intermediary = new Intermediary();
         // 这个可以提炼到 代理类中 作为一个 创建代理的方法
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Landlord.class);
        enhancer.setCallback(intermediary);
        Landlord rentProxy = (Landlord) enhancer.create();

        rentProxy.rent();
    }
}
