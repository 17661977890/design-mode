package com.qidian.mall.design.mode.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标: 设备
 * @Author binsun
 * @Date
 * @Description
 */
public abstract class EquipmentTarget {
    // 观察者集合
    protected List<Observer> observerList = new ArrayList<>();

    // 添加观察者
    public void add(Observer observer){
        observerList.add(observer);
    }
    // 移除观察者
    public void remove(Observer observer){
        observerList.remove(observer);
    }

    // 通知观察者方法
    public abstract void notifyObserver();

}


