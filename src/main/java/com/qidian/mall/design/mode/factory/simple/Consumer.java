package com.qidian.mall.design.mode.factory.simple;

public class Consumer {

    public static void main(String[] args) {
        // 原来的方式 --- 通过 new 获取对象
        Car car = new BenChi();
        Car car1 = new Tesla();
        car.name();
        car1.name();

        // 如果增加 一种车（产品），需要修改 工厂的代码，违反了开闭原则（对扩展开放，对修改关闭）
        Car car2 = CarFactory.getCar("奔驰");
        car2.name();
    }
}
