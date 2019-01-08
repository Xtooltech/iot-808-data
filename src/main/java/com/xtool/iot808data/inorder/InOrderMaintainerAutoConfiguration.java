package com.xtool.iot808data.inorder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InOrderMaintainerAutoConfiguration {
	@Bean
	public inorderMaintainer createInOrderMaintainer() {
		return new inorderMaintainer();
	}
}
