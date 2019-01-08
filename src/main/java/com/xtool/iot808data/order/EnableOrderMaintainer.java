package com.xtool.iot808data.order;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;
import com.xtool.iot808data.MongoDBConfig;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({OrderMaintainerAutoConfiguration.class,MongoDBConfig.class})
@Documented
public @interface EnableOrderMaintainer {

}
