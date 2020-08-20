package com.qidian.mall.design.mode.adapter;

/**
 * 第二种适配器
 *
 * 真正的适配器。 需要连接网线和电脑use接口
 */
public class Adapter2 implements NetToUsb {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee){
        System.out.println("提前连接usb接口、网线");
        this.adaptee=adaptee;
    }

    @Override
    public void handleRequest() {
        System.out.println("适配完毕，开始上网");
        adaptee.request();
    }
}
