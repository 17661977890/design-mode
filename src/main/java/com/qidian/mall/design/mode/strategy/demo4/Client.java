package com.qidian.mall.design.mode.strategy.demo4;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Dog[] a = {new Dog(5),new Dog(3),new Dog(9)};
        Cat[] b = {new Cat(5,4),new Cat(3,8),new Cat(9,7)};

        // 通过传 不同对象，不同对象的比较器 进行排序
        Sorter<Dog> sorter = new Sorter<>();
        sorter.sort(a,new DogSizeComparator());
        System.out.println(Arrays.toString(a));


        Sorter<Cat> sorter1 = new Sorter<>();
        sorter1.sort(b,new CatHeightComparator());
        System.out.println(Arrays.toString(b));
    }
}
