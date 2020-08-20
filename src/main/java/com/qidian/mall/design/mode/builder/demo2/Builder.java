package com.qidian.mall.design.mode.builder.demo2;

/**
 * 抽象建造者
 */
public abstract class Builder {

    abstract Builder buildA(String name);

    abstract Builder buildB(String name);

    abstract Builder buildC(String name);

    abstract Builder buildD(String name);

    abstract Product getProduct();
}
