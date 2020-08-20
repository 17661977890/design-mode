package com.qidian.mall.design.mode.strategy.demo4;


/**
 * 抽象策略： 比较器
 * @param <T>
 */
public interface Comparator<T> {

    int compareTo(T t,T t2);
}
