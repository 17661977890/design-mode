package com.qidian.mall.design.mode.singleton;

/**
 * 枚举单例 ---- 完美！
 *
 * 不仅可以解决线程同步，还可以防止反序列化（枚举类是没有构造方法的，所以反射也是不能获取他的对象的）
 */
public enum Mgr08 {

    INSTANCE;

    /**
     * 证明 是单例 线程安全
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i <200 ; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }

}
