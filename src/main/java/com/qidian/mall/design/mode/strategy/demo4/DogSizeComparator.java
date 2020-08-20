package com.qidian.mall.design.mode.strategy.demo4;

/**
 * 具体策略类： 具体比较器
 */
public class DogSizeComparator implements Comparator<Dog> {
    @Override
    public int compareTo(Dog dog, Dog dog2) {
        if(dog.getSize()>dog2.getSize()) return 1;
        else if(dog.getSize()<dog2.getSize()) return -1;
        else return 0;
    }
}
