package com.qidian.mall.design.mode.proxy.dynamic1.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 * @Author binsun
 * @Date
 * @Description
 */
public class Intermediary implements InvocationHandler {


    private Object object;

    public Intermediary(Object object){
        this.object=object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(object, args);
        System.out.println("中介：该房源已发布！");
        return invoke;
    }
}
