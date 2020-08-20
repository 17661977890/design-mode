package com.qidian.mall.design.mode.strategy.demo1;

/**
 * 具体策略类A
 * @Author binsun
 * @Date
 * @Description
 */
public class SmsStrategy implements Strategy {

    @Override
    public void sendMessage() {
        System.out.println("策略A: 发送短信");
    }
}
