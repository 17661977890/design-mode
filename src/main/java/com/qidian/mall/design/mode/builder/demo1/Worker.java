package com.qidian.mall.design.mode.builder.demo1;

/**
 * 具体建造者
 */
public class Worker extends Builder {

    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋");
    }

    @Override
    void buildC() {
        product.setBuildC("电线");
    }

    @Override
    void buildD() {
        product.setBuildD("墙面");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
