package com.xtool.iot808data.devparam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevparamMaintainerAutoConfiguration
{
	@Bean
	public devparamMaintainer createDevparamMaintainer()
    {
		return new devparamMaintainer();
	}
}
