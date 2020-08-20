package com.qidian.mall.design.mode.builder.demo2;

/**
 * 无指挥者情况 ： 这里相当于客户端充当指挥者---告诉工人构建什么产品
 */
public class Test {

    public static void main(String[] args) {
        // 默认套餐
        Product build1 = new Worker().getProduct();
        // 链式编程：在原来基础上，套餐可以自由组合，根据传入的参数。指挥权交给了 具体的建造者。
        Product build = new Worker()
                .buildA("全家桶")
                .buildB("雪碧")
                .buildC("薯条")
                .buildD("鸡腿")
                .getProduct();
        System.out.println(build.toString());
    }
}
