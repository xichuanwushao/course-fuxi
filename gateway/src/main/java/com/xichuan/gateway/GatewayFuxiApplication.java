package com.xichuan.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

@EnableEurekaClient
@SpringBootApplication
public class GatewayFuxiApplication {

    private static final Logger LOG = LoggerFactory.getLogger(GatewayFuxiApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GatewayFuxiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("Gateway地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
