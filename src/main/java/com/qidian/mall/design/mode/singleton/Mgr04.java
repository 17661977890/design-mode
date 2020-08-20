package com.qidian.mall.design.mode.singleton;

/**
 * 懒汉式：
 *
 * 给方法加锁 确保线程安全，缺点：效率下降
 */
public class Mgr04 {

    //1、私有静态成员（不初始化）
    private static Mgr04 INSTANCE;

    // 2、私有构造方法 --> 关键： 阻止外部调用 new Mrg01（）创建对象，只能通过调用下面的静态方法来获取 使用单例。
    private Mgr04(){
    }

    // 3、加锁公共静态方法 --> 返回单例 （ 如果多线程访问此方法，会new 多个实例，线程不安全）
    public static synchronized Mgr04 getInstance(){
        if(INSTANCE==null){
            // 测试下面的
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
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
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    //....
//                }
//            }).start();

            new Thread(()->{
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }

}
