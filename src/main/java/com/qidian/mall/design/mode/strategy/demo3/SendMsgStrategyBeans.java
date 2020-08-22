package com.qidian.mall.design.mode.strategy.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class SendMsgStrategyBeans  {
    private Map<Integer, Strategy> map;

    @Autowired
    private ApplicationContext applicationContext ;

    /**
     * applicationContext.getBeansOfType(Strategy.class).values() 获取所有实现策略接口得 具体策略类 ，后续使用stream 将其转为map 并赋值
     *
     * list.stream().collect(Collectors.toMap(Option::getId, option -> option, (v1, v2) -> v1));
     * 第一个参数Option::getId 表示选择Option的getId作为map的key值；
     * 第二个参数option -> option表示选择将原来的对象作为map的value值；
     * 第三个参数(v1, v2) -> v1中，如果v1与v2的key值相同，选择v1作为那个key所对应的value值
     */
    @PostConstruct
    private void SendMsgStrategyInit(){
        List<Strategy> list =new ArrayList<>(applicationContext.getBeansOfType(Strategy.class).values());
        this.map = list.stream().collect(Collectors.toMap(Strategy::msgType, Function.identity(),(key1 , key2)-> key2 )); //(key1 , key2)-> key2 ) 避免重复value 这里可以不加
//        this.map = applicationContext.getBeansOfType(Strategy.class).values().stream().collect(Collectors.toMap(Strategy::msgType,t->t)); // t 随意命名  Collectors.toMap(Strategy::msgType,t->t) 只是为了map得value值
    }
    public Strategy get(int type) {
        return map.get(type);
    }
}