package com.qidian.mall.design.mode.singleton;

/**
 * 饿汉式 同01 一样
 */
public class Mgr02 {

    //1、私有静态常量成员 (静态块实例化)
    private static final Mgr02 INSTANCE;
    static {
        INSTANCE=new Mgr02();
    }

    // 2、私有构造方法 --> 关键： 阻止外部调用 new Mrg01（）创建对象，只能通过调用下面的静态方法来获取 使用单例。
    private Mgr02(){
    }

    // 3、公共静态方法 --> 返回单例
    public static Mgr02 getInstance(){
        return INSTANCE;
    }

    /**
     * 证明 只是创建了一个对象
     * @param args
     */
    public static void main(String[] args) {
        Mgr02 mgr01 = Mgr02.getInstance();
        Mgr02 mgr02 = Mgr02.getInstance();
        System.out.println(mgr01==mgr02); // true
    }

}
