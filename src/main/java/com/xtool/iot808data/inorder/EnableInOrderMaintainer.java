package com.xtool.iot808data.inorder;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;
import com.xtool.iot808data.MongoDBConfig;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({InOrderMaintainerAutoConfiguration.class,MongoDBConfig.class})
@Documented
public @interface EnableInOrderMaintainer {

}
