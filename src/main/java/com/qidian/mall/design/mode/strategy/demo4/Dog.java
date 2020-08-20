package com.qidian.mall.design.mode.strategy.demo4;

public class Dog {

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int size;

    public Dog(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                '}';
    }
}
