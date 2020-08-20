package com.qidian.mall.design.mode.bridge;

/**
 * 具体实现化角色： 具体品牌
 */
public class Lenovo implements Brand {

    @Override
    public void info() {
        System.out.println("联想");
    }
}
