package com.qidian.mall.design.mode.factory.common;

/**
 * 工厂方法模式： 只适用同一产品等级
 *
 * 我们只需要扩展 新的汽车工厂即可，而不需要对原有工厂进行改动。  即将汽车和汽车工厂 抽象出来作为接口提供 约束。具体车型具体工厂实现
 *
 * 弊端： 多一个车型，多一个车型实现和 车型工厂实现，代码编程会越来越多。相比简单工厂模式：不方便管理，编码更复杂，结构更复杂
 *
 * 所以根据设计原则：采用工厂方法模式
 * 根据实际业务： 简单工厂模式
 *
 * 设计原则只是一个标准，具体执行基于业务来定
 *
 */
public class Consumer {

    public static void main(String[] args) {
        Car car = new BenChiFactory().getCar();
        car.name();
        Car car1 = new TeslaFactory().getCar();
        car1.name();
    }
}
