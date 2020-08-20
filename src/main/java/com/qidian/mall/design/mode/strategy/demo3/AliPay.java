package com.qidian.mall.design.mode.strategy.demo3;

import org.springframework.stereotype.Service;

/**
 * @Author binsun
 * @Date
 * @Description
 */
@Service
public class AliPay implements Strategy {
    @Override
    public void pay() {
        System.out.println("支付宝---->支付");
    }

    @Override
    public int msgType() {
        return PayType.ALI_PAY.getCode();
    }
}
