package com.qidian.mall.design.mode.decorate;

/**
 * 抽象装饰角色
 * @Author binsun
 * @Date
 * @Description
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component){
        this.component=component;
    }

    @Override
    public void run() {
        component.run();
    }
}
