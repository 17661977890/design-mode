package com.qidian.mall.design.mode.strategy.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂： 用来获取具体策略类的实例
 * @Author binsun
 * @Date
 * @Description
 */
public class StrategyFactory {

    //如果想获取工厂对象，做一个获取工厂对象的工厂方法即可。  即为单例模式（饿汉式：线程安全）创建工厂对象
    private static StrategyFactory strategyFactory = new StrategyFactory();
    private static Map<String,Strategy> factory=new HashMap<>();

    private StrategyFactory(){
    }

    static {
        factory.put(PayType.ALI_PAY.getType(),new AliPay());
        factory.put(PayType.WECHET_PAY.getType(),new WechetPay());
    }

    // 获取策略类实例得 静态工厂方法
    public static Strategy getInstance(String type){
        return factory.get(type);
    }
}
