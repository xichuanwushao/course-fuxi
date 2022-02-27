package com.xichuan.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

@EnableEurekaServer
@SpringBootApplication
public class EurekaFuxiApplication {

    private static final Logger LOG = LoggerFactory.getLogger(EurekaFuxiApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EurekaFuxiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("Eureka地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
