package com.qidian.mall.design.mode.strategy.demo1;

/**
 * 具体策略类C
 * @Author binsun
 * @Date
 * @Description
 */
public class PushMesStrategy implements Strategy {

    @Override
    public void sendMessage() {
        System.out.println("策略C: 推送消息");
    }
}
