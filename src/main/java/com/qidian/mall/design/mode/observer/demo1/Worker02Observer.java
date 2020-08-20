package com.qidian.mall.design.mode.observer.demo1;

/**
 * 具体观察者1号
 * @Author binsun
 * @Date
 * @Description
 */
public class Worker02Observer implements Observer{

    @Override
    public void response() {
        System.out.println("02号工人观察者也发现设备损坏： 前往维修");
    }
}
