package com.qidian.mall.design.mode;

import com.qidian.mall.design.mode.observer.demo4.OrderEvent;
import com.qidian.mall.design.mode.observer.demo5.OrderEvent2;
import com.qidian.mall.design.mode.strategy.demo3.SendMsgStrategyBeans;
import com.qidian.mall.design.mode.strategy.demo3.Strategy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DesignModeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	SendMsgStrategyBeans sendMsgStrategyBeans;

	@Test
	public void test(){
		Strategy strategy = sendMsgStrategyBeans.get(1);
		strategy.pay();
	}

	/**
	 * 基于spring的观察者模式（事件机制）
	 * * spring中的事件机制涉及到者几个类文件 ：ApplicationEvent(事件类型)、ApplicationListener（事件监听类）、ApplicationEventPublisher（事件发布类）。
	 * * ApplicationEvent：继承jdk Utill包中的 EventObject。
	 * * ApplicationListener ：接口继承了utill 包中的EventListener接口，泛型参数E必须继承ApplicationEvent类。
	 * * ApplicationEventPublisher： 事件发布接口 ，实现类很多，其中子类ApplicationContext，发布事件就用ApplicationContext类去发布。
	 */

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void test01(){
		OrderEvent orderEvent = new OrderEvent(this);
		orderEvent.setMessage("用户下单了");
		applicationContext.publishEvent(orderEvent);
		System.out.println("---------------over--------------");
	}

	/**
	 * 基于注解的事件监听机制 @EventListener
	 */
	@Test
	public void test02(){
		OrderEvent2 orderEvent = new OrderEvent2(this);
		orderEvent.setMessage("用户下单了");
		applicationContext.publishEvent(orderEvent);
		System.out.println("---------------over--------------");
	}

}
