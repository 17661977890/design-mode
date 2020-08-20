package com.qidian.mall.design.mode.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 *
 * 唯一缺点： 不管用到与否，类加载时就完成实例化（空间换时间）
 */
public class Mgr01 {

    //1、私有静态常量成员 （类加载落到内存，静态成员就会加载，Mgr01 就会实例化）
    private static final Mgr01 INSTANCE =new Mgr01();

    // 2、私有构造方法 --> 关键： 阻止外部调用 new Mrg01（）创建对象，只能通过调用下面的静态方法来获取 使用单例。
    private Mgr01(){
    }

    // 3、公共静态方法 --> 返回单例
    public static  Mgr01 getInstance(){
        return INSTANCE;
    }

    /**
     * 证明 只是创建了一个对象
     * @param args
     */
    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02 = Mgr01.getInstance();
        System.out.println(mgr01==mgr02); // true
    }

}
