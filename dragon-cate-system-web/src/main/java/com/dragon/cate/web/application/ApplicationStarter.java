package com.dragon.cate.web.application;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目启动入口
 */
@ComponentScan(basePackages = {"com.dragon.cate"})
@MapperScan("com.dragon.cate.dao")
@EnableAutoConfiguration(exclude = {DataSourceTransactionManagerAutoConfiguration.class, SessionAutoConfiguration.class,
        DataSourceAutoConfiguration.class, FreeMarkerAutoConfiguration.class})
@SpringBootApplication
public class ApplicationStarter {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApplicationStarter.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);
    }

}
