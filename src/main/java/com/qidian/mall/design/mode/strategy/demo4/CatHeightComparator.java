package com.qidian.mall.design.mode.strategy.demo4;

/**
 * 具体策略类： 具体比较器
 */
public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compareTo(Cat cat, Cat cat1) {
        if(cat.getHeight()>cat1.getHeight()) return 1;
        else if(cat.getHeight()<cat1.getHeight()) return -1;
        else return 0;
    }
}
