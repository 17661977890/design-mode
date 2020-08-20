package com.qidian.mall.design.mode.observer.demo1;

/**
 * @Author binsun
 * @Date
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        EquipmentTarget equipmentTarget = new EnergyEquipmentTarget();
        equipmentTarget.add(new Worker01Observer());
        equipmentTarget.add(new Worker02Observer());
        equipmentTarget.notifyObserver();
    }
}
