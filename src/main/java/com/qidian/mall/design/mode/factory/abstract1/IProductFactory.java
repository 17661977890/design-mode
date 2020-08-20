package com.qidian.mall.design.mode.factory.abstract1;

/**
 * 抽象工厂： 抽象的抽象（抽象手机、抽象路由）
 *
 * 抽象产品工厂： 创建不同等级的产品
 *
 * 弊端： 新增一个等级产品，需要修改此接口工厂，所有子类都要变动，即违反开闭原则。所以适用于稳定产品。
 */
public interface IProductFactory {

    IphoneProduct getPhone();


    IRouterProduct getRouter();
}
