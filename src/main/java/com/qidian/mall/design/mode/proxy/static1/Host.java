package com.qidian.mall.design.mode.proxy.static1;

/**
 * 真是主题类
 */
public class Host implements Rent{

    @Override
    public void rent(){
        System.out.println("房东要出租房子");
    }
}
