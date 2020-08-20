package com.qidian.mall.design.mode.decorate;

/**
 * @Author binsun
 * @Date
 * @Description
 */
public class Client {


    public static void main(String[] args) {
        Component component = new ComponentImpl();
        System.out.println("===========构建本来的能力=================");
        component.run();

        System.out.println("============为构件装饰一下===============");
        Component component1 = new DecoratorImpl(component);
        component1.run();


        System.out.println("============为构件重新装饰一下===============");
        Component component2 = new DecoratorImpl2(component);
        component2.run();
    }
}
