package com.qidian.mall.design.mode.factory.abstract1;

/**
 * 小米手机
 */
public class XiaoMiPhone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("小米开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米关机机");
    }

    @Override
    public void callup() {
        System.out.println("小米打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("小米发短信");
    }
}
