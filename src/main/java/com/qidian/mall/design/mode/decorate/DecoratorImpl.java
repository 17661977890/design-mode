package com.qidian.mall.design.mode.decorate;

/**
 * 具体装饰角色
 * @Author binsun
 * @Date
 * @Description
 */
public class DecoratorImpl extends Decorator {

    public DecoratorImpl(Component component) {
        super(component);
    }

    @Override
    public void run() {
        super.run();
        addFunction();
    }

    public void addFunction(){
        System.out.println(" 添加飞行的能力 ");
    }
}
