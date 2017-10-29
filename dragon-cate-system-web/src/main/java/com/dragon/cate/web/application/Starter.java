package com.dragon.cate.web.application;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 项目启动入口
 */
@ComponentScan(basePackages = {"com.dragon.cate"})
@PropertySource(encoding = "UTF-8",value = { "classpath:db.properties","classpath:nos.properties", "classpath:oms.properties", "classpath:redis.properties", "classpath:server.properties"})
@EnableAutoConfiguration(exclude = {DataSourceTransactionManagerAutoConfiguration.class, SessionAutoConfiguration.class,
        DataSourceAutoConfiguration.class, FreeMarkerAutoConfiguration.class, SecurityAutoConfiguration.class})
@SpringBootApplication
public class Starter extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Starter.class);
        app.setWebEnvironment(true);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);
    }

}
