package com.itself;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;

import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 * @Author duJi
 * @Date 2023/09/23
 */
@Slf4j
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})//取消数据库配置
public class CommonService implements ApplicationListener<WebServerInitializedEvent> {
    public static void main(String[] args) {
        SpringApplication.run(CommonService.class,args);
    }

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        try {
            log.info("=====>>>CommonService start successful , IP Address:http:"+ Inet4Address.getLocalHost().getHostAddress()+":"+event.getWebServer().getPort());
            log.warn("test warn log level ");
            log.error("test error log level ");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
