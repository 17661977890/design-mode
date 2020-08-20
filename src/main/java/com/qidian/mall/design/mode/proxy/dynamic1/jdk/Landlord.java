package com.qidian.mall.design.mode.proxy.dynamic1.jdk;

/**
 * 具体实现类：房东
 * @Author binsun
 * @Date
 * @Description
 */
public class Landlord implements Rent {
    public void rent() {
        System.out.println("房东出租房子");
    }
}
