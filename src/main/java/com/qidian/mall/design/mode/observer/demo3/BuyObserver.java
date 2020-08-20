package com.qidian.mall.design.mode.observer.demo3;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者： 实现java自定义的抽象观察者
 * Observer 接口是抽象观察者，它监视目标对象的变化，当目标对象发生变化时，观察者得到通知，
 *并调用 void update(Observable o,Object arg) 方法，进行相应的工作。
 * @Author binsun
 * @Date
 * @Description
 */
public class BuyObserver implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        Float price = (Float) arg;
        if(price>0){
            System.out.println("油价上涨，不买了");
        }else {
            System.out.println("油价下跌，多买");
        }

    }
}
