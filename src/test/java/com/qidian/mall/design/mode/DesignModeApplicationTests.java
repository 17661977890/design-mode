package com.qidian.mall.design.mode;

import com.qidian.mall.design.mode.strategy.demo3.SendMsgStrategyBeans;
import com.qidian.mall.design.mode.strategy.demo3.Strategy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}
