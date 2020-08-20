package com.qidian.mall.design.mode.builder.demo1;

/**
 * 指挥者
 */
public class Director {

    /**
     * 指挥建造者 建房子
     * @param builder
     * @return
     */
    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }


}
