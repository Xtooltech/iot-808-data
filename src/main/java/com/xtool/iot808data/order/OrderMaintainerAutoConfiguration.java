package com.xtool.iot808data.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderMaintainerAutoConfiguration {
	@Bean
	public orderMaintainer createOrderMaintainer() {
		return new orderMaintainer();
	}
}
