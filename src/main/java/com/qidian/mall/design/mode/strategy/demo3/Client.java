package com.qidian.mall.design.mode.strategy.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * 策略工厂模式   ---------应用
 * @Author binsun
 * @Date
 * @Description
 */
@Controller
public class Client {

    @Autowired
    private SendMsgStrategyBeans sendMsgStrategyBeans;

    @RequestMapping("/test")
    public  void test(Integer type) {
        Strategy strategy = sendMsgStrategyBeans.get(type);
        strategy.pay();
    }
}
