package com.hdd.eureka_provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称
 *
 * @author bill.hao
 * @create 2018/11/12 下午 4:23
 */
@RestController
public class TestController {
    @Autowired
    private DiscoveryClient client;
    @RequestMapping("sayHello")
    public String sayHello(){
        ServiceInstance instance=client.getLocalServiceInstance();
      //  logger.info("serviceId"+instance.getServiceId()+"host:post="+instance.getHost()+":"+instance.getPort());
        return "hello spring";
    }
}
