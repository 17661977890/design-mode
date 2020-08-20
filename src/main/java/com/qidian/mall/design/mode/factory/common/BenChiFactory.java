package com.qidian.mall.design.mode.factory.common;

public class BenChiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BenChi();
    }
}
