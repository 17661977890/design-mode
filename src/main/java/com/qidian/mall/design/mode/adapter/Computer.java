package com.qidian.mall.design.mode.adapter;

/**
 * 客户端类：想上网，插不上网线，需要找一个转接头
 */
public class Computer {

    public void net(NetToUsb netToUsb){
        System.out.println("想上网");
        netToUsb.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();//电脑
        System.out.println("===============第一种适配器========类结构性：继承=======");
        Adapter adapter = new Adapter();// 适配器（继承了adaptee 所以用不到）
        computer.net(adapter);

        System.out.println("===============第二种适配器========对象结构性：组合=======");
        Adaptee adaptee = new Adaptee();// 电脑usb接口
        Adapter2 adapter2 = new Adapter2(adaptee);
        computer.net(adapter2);
    }


}
