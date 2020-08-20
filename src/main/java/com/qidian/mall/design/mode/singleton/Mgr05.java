package com.qidian.mall.design.mode.singleton;

/**
 * 懒汉式：
 *
 * 给代码块加锁，比给方法加锁效率高一点
 * 但是 不是线程安全
 */
public class Mgr05 {

    //1、私有静态成员（不初始化）
    private static Mgr05 INSTANCE;

    // 2、私有构造方法 --> 关键： 阻止外部调用 new Mrg01（）创建对象，只能通过调用下面的静态方法来获取 使用单例。
    private Mgr05(){
    }

    // 3、公共静态方法 --> 返回单例 （ 如果多线程访问此方法，会new 多个实例，线程不安全）
    public static Mgr05 getInstance(){
        if(INSTANCE==null){
            // 代码块加锁 --- 这里加锁 也不是线程安全
            synchronized (Mgr05.class){
                // 测试下面的
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }

        }
        return INSTANCE;
    }

    /**
     * 证明 方法加锁后线程安全
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i <200 ; i++) {
            new Thread(()->{
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }

}
