package com.xtool.iot808data.pos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PosMaintainerAutoConfiguration
{
	@Bean
	public posMaintainer createPosMaintainer()
    {
		return new posMaintainer();
	}
}
