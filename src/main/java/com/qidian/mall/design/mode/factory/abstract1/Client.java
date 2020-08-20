package com.qidian.mall.design.mode.factory.abstract1;

public class Client {

    public static void main(String[] args) {
        System.out.println("==========小米=============");
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();

        IphoneProduct iphoneProduct = xiaoMiFactory.getPhone();
        iphoneProduct.start();

        IRouterProduct iRouterProduct = xiaoMiFactory.getRouter();
        iRouterProduct.openWifi();


        System.out.println("===========华为============");
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();

        IphoneProduct iphoneProduct1 = huaWeiFactory.getPhone();
        iphoneProduct1.start();
        IRouterProduct iRouterProduct1 = huaWeiFactory.getRouter();
        iRouterProduct1.openWifi();
    }
}
