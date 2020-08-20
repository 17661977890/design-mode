package com.qidian.mall.design.mode.proxy.dynamic1.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类 --- 方法拦截
 * @Author binsun
 * @Date
 * @Description
 */
public class Intermediary implements MethodInterceptor {


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("房东找到中介");
        Object intercept = methodProxy.invokeSuper(o, objects);
        System.out.println("中介 发布 该房东的 房源！");
        return intercept;
    }
}
