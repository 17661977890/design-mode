package com.qidian.mall.design.mode.builder.demo1;

public class Test {

    public static void main(String[] args) {
        // 指挥具体的 工人（建造者） 建房子  ------->
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build.toString());
    }
}
