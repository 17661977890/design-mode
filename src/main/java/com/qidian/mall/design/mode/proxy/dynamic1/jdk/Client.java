package com.qidian.mall.design.mode.proxy.dynamic1.jdk;

import java.lang.reflect.Proxy;

/**
 * 动态代理 + 反射
 * @Author binsun
 * @Date
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Rent rent = new Landlord();

        // 代理出租房子
        Intermediary intermediary = new Intermediary(rent);

        // 这个可以提炼到 代理类中 作为一个 创建代理的方法
        Rent rentProxy = (Rent) Proxy.newProxyInstance(rent.getClass().getClassLoader(), rent.getClass().getInterfaces(), intermediary);

        rentProxy.rent();

        //房东直接出租房子
//        rent.rent();
    }
}
