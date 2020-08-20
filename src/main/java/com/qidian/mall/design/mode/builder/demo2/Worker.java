package com.qidian.mall.design.mode.builder.demo2;

/**
 * 具体建造者
 */
public class Worker extends Builder {

    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    Builder buildA(String name) {
        product.setBuildA(name);
        return this;
    }

    @Override
    Builder buildB(String name) {
        product.setBuildB(name);
        return this;
    }

    @Override
    Builder buildC(String name) {
        product.setBuildC(name);
        return this;
    }

    @Override
    Builder buildD(String name) {
        product.setBuildD(name);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
