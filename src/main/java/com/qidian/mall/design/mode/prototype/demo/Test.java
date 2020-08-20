package com.qidian.mall.design.mode.prototype.demo;

import java.util.Date;

public class Test {

    /**
     * 浅克隆-------------只想引用也克隆拷贝了，date变化，克隆的v2 跟着 v1 一起变了
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

        // 浅克隆： 连v1的引用也克隆了，date 改变，应该是只影响v1 ，不会影响v2。
        date.setTime(122223455);
        System.out.println("改变date v1="+v1);
        System.out.println("改变date v2="+v2);





    }
}
