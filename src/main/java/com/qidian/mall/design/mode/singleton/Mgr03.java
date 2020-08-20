package com.qidian.mall.design.mode.singleton;

/**
 * 懒汉式
 * 优点：什么时候用 什么时候初始化 （时间换空间）
 * 多线程访问，会线程不安全
 */
public class Mgr03 {

    //1、私有静态成员（不初始化）
    private static Mgr03 INSTANCE;

    // 2、私有构造方法 --> 关键： 阻止外部调用 new Mrg01（）创建对象，只能通过调用下面的静态方法来获取 使用单例。
    private Mgr03(){
    }

    // 3、公共静态方法 --> 返回单例 （ 如果多线程访问此方法，会new 多个实例，线程不安全）
    public static Mgr03 getInstance(){
        if(INSTANCE==null){
            // 测试下面的
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    /**
     * 证明 线程不安全
     *
     * lambada 对只有一个方法的匿名内部类 进行简化
     *
     * 不同对象的hashcode值可能是一样的
     * 但是"同一个类的不同对象"的hashcode值是不同的； 如果同一个类的对象的hash值一样，则证明出现同一个对象，否则就是多线程下出现了多个实例，即不是单例了
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i <200 ; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    //....
//                }
//            }).start();

            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }

}
