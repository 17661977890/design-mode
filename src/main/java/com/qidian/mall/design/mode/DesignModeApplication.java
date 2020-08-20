package com.qidian.mall.design.mode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class DesignModeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignModeApplication.class, args);
	}

}
