package com.qidian.mall.design.mode.builder.demo1;

/**
 * 抽象建造者
 */
public abstract class Builder {

    abstract void buildA();//墙面

    abstract void buildB();//钢筋

    abstract void buildC();//电线

    abstract void buildD();//墙面

    abstract Product getProduct();
}
