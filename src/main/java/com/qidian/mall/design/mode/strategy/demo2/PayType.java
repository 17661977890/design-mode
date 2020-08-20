package com.qidian.mall.design.mode.strategy.demo2;

/**
 * 1、枚举的直接父类是java.lang.Enum，但是不能显示的继承Enum
 * 2、枚举就相当于一个类，可以定义构造方法、成员变量、普通方法和抽象方法
 * 3、默认私有的构造方法，即使不写访问权限也是private。（假构造器，底层没有无参数的构造器）
 * 4、每个实例分别用于一个全局常量表示，枚举类型的对象是固定的，实例个数有限，不能使用new关键字。
 * 5、枚举实例必须位于枚举中最开始部分，枚举实例列表的后面要有分号月其他成员相分隔
 * 6、枚举实例后有花括号时，该实例是枚举的匿名内部类对象
 * @Author binsun
 * @Date
 * @Description
 */
public enum PayType {

    ALI_PAY("支付宝"),
    WECHET_PAY("微信"),;

    private String type;

    //默认私有的构造方法，即使不写访问权限也是private。（假构造器，底层没有无参数的构造器）
    PayType(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }
}
