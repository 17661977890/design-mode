package com.qidian.mall.design.mode.facade;

/**
 * 具体外观类
 * @Author binsun
 * @Date
 * @Description
 */
public class Facade1 implements Facade {

    private SubSystem01 subSystem01 = new SubSystem01();
    private SubSystem02 subSystem02 = new SubSystem02();

    @Override
    public void method1() {
        subSystem01.method01();
        subSystem01.method02();
        subSystem02.method01();
        subSystem02.method02();
    }

    @Override
    public void method2() {
        subSystem01.method01();
        subSystem01.method02();
        subSystem02.method01();
        subSystem02.method02();
    }
}
