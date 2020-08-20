package com.qidian.mall.design.mode.facade;

/**
 * @Author binsun
 * @Date
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade1();
        facade.method1();
    }



}
