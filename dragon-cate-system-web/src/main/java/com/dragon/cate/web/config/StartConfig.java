package com.dragon.cate.web.config;

import org.apache.catalina.mapper.Mapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by chl on 2017/10/29.
 */
@Configuration
@ComponentScan("com.dragon.cate")
@EnableAutoConfiguration(exclude = { SessionAutoConfiguration.class, FreeMarkerAutoConfiguration.class, SecurityAutoConfiguration.class })
//@PropertySource(encoding = "UTF-8",value = { "classpath:db.properties","classpath:nos.properties", "classpath:oms.properties", "classpath:redis.properties", "classpath:server.properties", "classpath:zookeeper.properties"})
//@MapperScan(basePackages = "titan.wms.common.dao", annotationClass = Mapper.class)
public class StartConfig {
}
