package com.qidian.mall.design.mode.singleton;

/**
 * 双重检查锁
 * 给代码块加锁，比给方法加锁效率高一点
 * 双重判断
 *
 * 指令重排是什么意思呢？比如java中简单的一句 instance = new Singleton，会被编译器编译成如下JVM指令：
 * memory =allocate();    //1：分配对象的内存空间
 * ctorInstance(memory);  //2：初始化对象
 * instance =memory;     //3：设置instance指向刚分配的内存地址
 * 但是这些指令顺序并非一成不变，有可能会经过JVM和CPU的优化，指令重排成下面的顺序：
 * memory =allocate();    //1：分配对象的内存空间
 * instance =memory;     //3：设置instance指向刚分配的内存地址
 * ctorInstance(memory);  //2：初始化对象
 * 当线程A执行完1,3,时，instance对象还未完成初始化，但已经不再指向null。此时如果线程B抢占到CPU资源，执行  if（instance == null）的结果会是false，从而返回一个没有初始化完成的instance对象
 */
public class Mgr06 {

    //1、私有静态成员（不初始化）volatile 为了避免指令重排
    private static volatile Mgr06 INSTANCE;

    // 2、私有构造方法 --> 关键： 阻止外部调用 new Mrg01（）创建对象，只能通过调用下面的静态方法来获取 使用单例。
    private Mgr06(){
    }

    // 3、公共静态方法 --> 返回单例 （ 如果多线程访问此方法，会new 多个实例，线程不安全）
    public static Mgr06 getInstance(){
        // 第一次判断的必要性： 为了避免每次都上锁，降低性能，如果以及实例化了，就不需要走下边了
        if(INSTANCE==null){
            // 代码块加锁
            synchronized (Mgr06.class){
                // 双重判断
                if(INSTANCE==null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }

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
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }

}
