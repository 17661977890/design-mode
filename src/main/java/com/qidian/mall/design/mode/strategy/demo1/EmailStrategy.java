package com.qidian.mall.design.mode.strategy.demo1;

/**
 * 具体策略类B
 * @Author binsun
 * @Date
 * @Description
 */
public class EmailStrategy implements Strategy {

    @Override
    public void sendMessage() {
        System.out.println("策略B: 发送邮件");
    }
}
