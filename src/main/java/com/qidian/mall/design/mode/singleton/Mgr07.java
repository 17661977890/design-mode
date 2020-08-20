package com.qidian.mall.design.mode.singleton;

/**
 * 静态内部类
 * JVM保证单例，JVM保证线程安全（jvm虚拟机加载class 只加载一次）
 * 加载外部类时不会加载内部类，这样可以实现懒加载  换回时间空间
 */
public class Mgr07 {

    // 1、私有构造方法 --> 关键： 阻止外部调用 new Mrg01（）创建对象。
    private Mgr07(){
    }

    // 2、私有静态内部类 ———> 只有内部类可以访问外部类的私有成员
    private static class Mgr07Holder{
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    // 3、公共静态方法 --> 返回单例（静态内部类获取）
    public static Mgr07 getInstance(){
        return Mgr07Holder.INSTANCE;
    }

    /**
     * 证明 是单例 线程安全
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i <200 ; i++) {
            new Thread(()->{
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }

}
