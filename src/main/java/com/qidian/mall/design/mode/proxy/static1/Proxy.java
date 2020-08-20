package com.qidian.mall.design.mode.proxy.static1;

/**
 * 代理类
 */
public class Proxy implements Rent{

    private Host host;

    // 可以用set方法代替
    public Proxy(Host host){
        this.host=host;
    }


    @Override
    public void rent() {
        // 这行输出为什么不再原来真实主题类加，为了不该动原有的业务代码，可以切面编程
        System.out.println("代理模式： 代理看房了");
        host.rent();
    }

    /**
     * 代理类 一般会有附属操作
     */
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void fare(){
        System.out.println("中介收中介费");
    }

    public void heTong(){
        System.out.println("中介代签合同");
    }

}
