package com.xtool.iot808data.ctrlog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CtrlogMaintainerAutoConfiguration
{
	@Bean
	public ctrlogMaintainer createCtrlogMaintainer() {
		return new ctrlogMaintainer();
	}
}
