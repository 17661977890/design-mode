package com.qidian.mall.design.mode.proxy.static1;

/**
 * 客户
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("房东直接销售");
        Host host = new Host();
        host.rent();

        System.out.println("找中介代理");
        Proxy proxy = new Proxy(new Host());
        proxy.rent();
    }
}
