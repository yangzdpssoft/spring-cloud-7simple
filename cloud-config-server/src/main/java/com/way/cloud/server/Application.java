package com.way.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * Created by way on 2016/10/25.
 */
@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
