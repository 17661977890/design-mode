package com.qidian.mall.design.mode.proxy.dynamic1.cglib;

import com.example.design.Dynamic.jdk.Rent;

/**
 * 具体实现类：房东
 * @Author binsun
 * @Date
 * @Description
 */
public class Landlord implements Rent {
    public void rent() {
        System.out.println("房东说要出租房子");
    }
}
