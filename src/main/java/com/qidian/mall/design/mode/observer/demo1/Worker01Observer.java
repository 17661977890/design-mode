package com.qidian.mall.design.mode.observer.demo1;

/**
 * 具体观察者1号
 * @Author binsun
 * @Date
 * @Description
 */
public class Worker01Observer implements Observer{

    @Override
    public void response() {
        System.out.println("01号工人观察者发现 设备损坏： 前往维修");
    }
}
