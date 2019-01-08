package com.xtool.iot808data.devstat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevStatMaintainerAutoConfiguration {
	@Bean
	public devstatMaintainer createInOrderMaintainer() {
		return new devstatMaintainer();
	}
}
