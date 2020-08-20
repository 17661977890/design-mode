package com.qidian.mall.design.mode.factory.simple;


/**
 * 简单工厂模式：（静态工厂模式）
 * 弊端： 如果要增加新的产品对象，需要修改扩展工厂方法的原有的代码
 */
public class CarFactory {


    public static Car getCar(String car){
        if(car.equals("奔驰")){
            return new BenChi();
        }else if (car.equals("特斯拉")){
            return new Tesla();
        }else {
            return null;
        }
    }
}
