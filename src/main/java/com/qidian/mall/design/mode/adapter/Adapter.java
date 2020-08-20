package com.qidian.mall.design.mode.adapter;

/**
 * 具体的适配器： 可以连接usb
 */
public class Adapter extends Adaptee implements NetToUsb {


    @Override
    public void handleRequest() {
        System.out.println("准备适配器，已经适配电脑usb接口、网线");
        super.request();// 适配好 可以准备上网了
    }
}
