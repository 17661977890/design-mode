package com.qidian.mall.design.mode.bridge;

/**
 * 这里 利用组合关系 建立 电脑和品牌的桥接关系。
 *
 *     电脑-----<桥>-----品牌
 * 笔记本 台式机       联想  mac
 *
 *
 * 抽象化角色
 */
public abstract  class Computer {

    //电脑 组合 品牌
    protected Brand brand;

    public Computer(Brand brand){
        this.brand=brand;
    }

    public void info(){
        brand.info();
    }
}

/**
 * 扩展抽象化角色
 */
class Desktop extends Computer{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}

class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}