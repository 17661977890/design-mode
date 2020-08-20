package com.qidian.mall.design.mode.observer.demo5;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 短信观察者： 监听短信(基于springboot注解)
 * @Author binsun
 * @Date
 * @Description
 */
@Component
public class SmsListener2 {

    @Async
    @EventListener
    public void onApplicationEvent(OrderEvent2 orderEvent) {
        System.out.println(Thread.currentThread() + "...短信监听到..." + orderEvent.getMessage()+ "......" + orderEvent.getSource());
    }
}
