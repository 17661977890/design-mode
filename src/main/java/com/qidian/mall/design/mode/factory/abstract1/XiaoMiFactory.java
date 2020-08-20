package com.qidian.mall.design.mode.factory.abstract1;

/**
 * 小米工厂
 */
public class XiaoMiFactory implements IProductFactory {
    @Override
    public IphoneProduct getPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct getRouter() {
        return new XiaoMiRouter();
    }
}
