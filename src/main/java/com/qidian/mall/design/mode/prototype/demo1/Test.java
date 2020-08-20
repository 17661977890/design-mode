package com.qidian.mall.design.mode.prototype.demo1;

import java.util.Date;

/**
 * spring 中的bean 创建采用 单例模式（默认）、原型模式（克隆拷贝）
 *
 * 原型模式：不需要每次重复创造，节省时间
 *
 * 一些使用场景：
 * 原型模式+工厂模式 结合使用
 *  将原来工厂模式中的 new ==替换用==》 原型模式
 */
public class Test {

    /**
     * 深克隆
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date();
        Video v1 =new Video("bilibili",date);
        System.out.println("v1="+v1);
        System.out.println("v1=>hash"+v1.hashCode());

        // v1 克隆 v2  (对象属性完全一样，hash值不一样 说明不是同一个对象，但是克隆后内容一致)
        Video v2 = (Video)v1.clone();
        System.out.println("v2="+v2);
        System.out.println("v2=>hash"+v2.hashCode());

        System.out.println("=========================");

        // 深克隆： date 改变，只影响v1 ，不会影响v2。
        date.setTime(122223455);
        System.out.println("改变date v1="+v1);
        System.out.println("改变date v2="+v2);





    }
}
