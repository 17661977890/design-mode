package com.qidian.mall.design.mode.observer.demo3;

import java.util.Observable;

/**
 * 具体目标类：  继承java自定义的 Observable
 * Observable 类是抽象目标类，它有一个 Vector 向量，用于保存所有要通知的观察者对象，
 * void addObserver(Observer o) 方法：用于将新的观察者对象添加到向量中。
 * void notifyObservers(Object arg) 方法：调用向量中的所有观察者对象的 update。方法，通知它们数据发生改变。通常越晚加入向量的观察者越先得到通知。
 * void setChange() 方法：用来设置一个 boolean 类型的内部标志位，注明目标对象发生了变化。当它为真时，notifyObservers() 才会通知观察者。
 * @Author binsun
 * @Date
 * @Description
 */
public class OliFutures extends Observable {

    private Float price;

    public Float getPrice(){
        return this.price;
    }

    public void setPrice(Float price){
        // 内部标志位设置为true 才会进行通知
        super.setChanged();
        super.notifyObservers(price);
        this.price=price;
    }
}
