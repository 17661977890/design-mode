package com.qidian.mall.design.mode.decorate;

/**
 * @Author binsun
 * @Date
 * @Description
 */
public class DecoratorImpl2 extends Decorator {


    public DecoratorImpl2(Component component) {
        super(component);
    }

    @Override
    public void run() {
        super.run();
        addFunction();
    }


    public void addFunction(){
        System.out.println("添加游泳的能力");
    }
}
