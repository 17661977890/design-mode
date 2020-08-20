package com.qidian.mall.design.mode.strategy.demo2;

/**
 * @Author binsun
 * @Date
 * @Description
 */
public class WechetPay implements Strategy {
    @Override
    public void pay() {
        System.out.println("微信--->支付");
    }
}
