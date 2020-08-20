package com.qidian.mall.design.mode.factory.abstract1;

/**
 * 华为工厂
 */
public class HuaWeiFactory implements IProductFactory {
    @Override
    public IphoneProduct getPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct getRouter() {
        return new HuaweiRouter();
    }
}
