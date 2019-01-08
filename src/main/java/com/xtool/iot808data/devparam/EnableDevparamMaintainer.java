package com.xtool.iot808data.devparam;

import com.xtool.iot808data.MongoDBConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Import({DevparamMaintainerAutoConfiguration.class, MongoDBConfig.class})
public @interface EnableDevparamMaintainer
{

}
