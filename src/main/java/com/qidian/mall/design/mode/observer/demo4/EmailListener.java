package com.qidian.mall.design.mode.observer.demo4;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 邮件观察者： 监听邮件
 * @Author binsun
 * @Date
 * @Description
 */
@Component
public class EmailListener implements ApplicationListener<OrderEvent> {

    @Async
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println(Thread.currentThread() + "...邮件监听到..." + orderEvent.getMessage()+ "......" + orderEvent.getSource());
    }
}
