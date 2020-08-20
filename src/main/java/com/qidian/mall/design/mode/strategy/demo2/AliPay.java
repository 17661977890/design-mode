package com.qidian.mall.design.mode.strategy.demo2;

/**
 * @Author binsun
 * @Date
 * @Description
 */
public class AliPay implements Strategy {
    @Override
    public void pay() {
        System.out.println("支付宝---->支付");
    }
}
