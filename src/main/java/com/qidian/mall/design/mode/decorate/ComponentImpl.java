package com.qidian.mall.design.mode.decorate;

/**
 * 具体构件
 * @Author binsun
 * @Date
 * @Description
 */
public class ComponentImpl implements Component{
    @Override
    public void run() {
        System.out.println("构件可以跑步");
    }
}
