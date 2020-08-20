package com.qidian.mall.design.mode.strategy.demo1;

/**
 * 环境类
 * @Author binsun
 * @Date
 * @Description
 */
public class Context {

    private Strategy strategy;

    // 可以使用 get set 方法 来代替构造器 给策略属性赋值
    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void sendMessage(){
        strategy.sendMessage();
    }


//    public Strategy getStrategy() {
//        return strategy;
//    }
//
//    public void setStrategy(Strategy strategy) {
//        this.strategy = strategy;
//    }
}
