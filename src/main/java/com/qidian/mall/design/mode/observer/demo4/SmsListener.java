package com.qidian.mall.design.mode.observer.demo4;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 短信观察者： 监听短信
 * @Author binsun
 * @Date
 * @Description
 */
@Component
public class SmsListener implements ApplicationListener<OrderEvent> {

    @Async
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println(Thread.currentThread() + "...短信监听到..." + orderEvent.getMessage()+ "......" + orderEvent.getSource());
    }
}
