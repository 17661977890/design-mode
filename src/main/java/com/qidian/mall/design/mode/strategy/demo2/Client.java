package com.qidian.mall.design.mode.strategy.demo2;

import java.util.stream.Collectors;

/**
 *
 * 策略工厂模式
 * @Author binsun
 * @Date
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy =StrategyFactory.getInstance("微信");
        strategy.pay();

        Strategy strategyA =StrategyFactory.getInstance("支付宝");
        strategyA.pay();

    }
}
