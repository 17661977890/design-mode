package com.qidian.mall.design.mode.prototype.demo1;

import java.util.Date;

/**
 * 深克隆：
 * 1：实现一个接口 Cloneable
 * 2：重新一个方法 clone() 并改造
 */
public class Video implements Cloneable{

    private String name;

    private Date pubDate;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o=super.clone();
        Video video = (Video)o;
        video.pubDate = (Date)this.pubDate.clone();// 将这个对象的属性也克隆
        return o;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Video(){

    }

    public Video(String name, Date pubDate) {
        this.name = name;
        this.pubDate = pubDate;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", pubDate=" + pubDate +
                '}';
    }
}
