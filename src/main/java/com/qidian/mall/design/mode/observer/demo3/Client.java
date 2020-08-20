package com.qidian.mall.design.mode.observer.demo3;

/**
 * @Author binsun
 * @Date
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        OliFutures oliFutures = new OliFutures();
        oliFutures.addObserver(new BuyObserver());
        oliFutures.setPrice(10F);
    }
}
