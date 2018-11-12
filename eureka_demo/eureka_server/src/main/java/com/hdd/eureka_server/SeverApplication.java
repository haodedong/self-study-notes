package com.hdd.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 启动类
 *
 * @author bill.hao
 * @create 2018/11/12 下午 3:49
 */

@EnableEurekaServer
@SpringBootApplication
public class SeverApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeverApplication.class,args);
    }
}
