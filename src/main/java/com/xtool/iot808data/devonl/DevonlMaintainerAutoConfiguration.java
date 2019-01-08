package com.xtool.iot808data.devonl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevonlMaintainerAutoConfiguration {
	@Bean
	public devonlMaintainer createDevonlMaintainer() {
		return new devonlMaintainer();
	}
}
