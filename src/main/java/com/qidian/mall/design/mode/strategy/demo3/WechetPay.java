package com.qidian.mall.design.mode.strategy.demo3;

import org.springframework.stereotype.Service;

/**
 * @Author binsun
 * @Date
 * @Description
 */
@Service
public class WechetPay implements Strategy {
    @Override
    public void pay() {
        System.out.println("微信--->支付");
    }

    @Override
    public int msgType() {
        return PayType.WECHET_PAY.getCode();
    }
}
