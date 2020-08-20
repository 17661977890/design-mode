package com.qidian.mall.design.mode.observer.demo1;

/**
 * 具体目标: 电力设备
 * @Author binsun
 * @Date
 * @Description
 */
public  class EnergyEquipmentTarget extends EquipmentTarget{

    @Override
    public void notifyObserver() {
        System.out.println("电力设备损坏，请维修工人观察者前往维修");

        // 各位观察者 收到消息 及时赶往维修
        for (Object o:observerList) {
            ((Observer)o).response();
        }
    }
}


