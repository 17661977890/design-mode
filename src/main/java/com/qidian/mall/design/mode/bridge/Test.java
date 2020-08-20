package com.qidian.mall.design.mode.bridge;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Laptop(new Mac());
        computer.info();


        Computer computer1 = new Desktop(new Lenovo());
        computer1.info();
    }
}
