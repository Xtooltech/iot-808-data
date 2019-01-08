package com.xtool.iot808data.device;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeviceMaintainerAutoConfiguration {
	@Bean
	public deviceMaintainer createDeviceMaintainer() {
		return new deviceMaintainer();
	}
}
