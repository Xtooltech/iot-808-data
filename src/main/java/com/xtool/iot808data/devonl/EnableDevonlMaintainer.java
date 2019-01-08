package com.xtool.iot808data.devonl;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.xtool.iot808data.MongoDBConfig;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Import({DevonlMaintainerAutoConfiguration.class,MongoDBConfig.class})
public @interface EnableDevonlMaintainer {

}
