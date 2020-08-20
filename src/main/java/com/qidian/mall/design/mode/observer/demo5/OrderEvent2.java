package com.qidian.mall.design.mode.observer.demo5;

import org.springframework.context.ApplicationEvent;

/**
 *  事件类： 订单时间   测试类测试
 * @Author binsun
 * @Date
 * @Description
 */
public class OrderEvent2 extends ApplicationEvent {

    private String message;

    public OrderEvent2(Object source) {
        super(source);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
