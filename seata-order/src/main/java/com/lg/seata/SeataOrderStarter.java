package com.lg.seata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author amazfit
 * @date 2022-06-16 下午11:28
 **/
@SpringBootApplication
@MapperScan("com.lg.seata.mapper")
@EnableDiscoveryClient
public class SeataOrderStarter {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrderStarter.class,args);
    }
}
