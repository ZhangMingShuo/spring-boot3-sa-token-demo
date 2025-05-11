package com.mingshuo.springboot3satokendemo;

import cn.dev33.satoken.SaManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot3SaTokenDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3SaTokenDemoApplication.class, args);
        System.out.println("启动成功，Sa-Token 配置如下：" + SaManager.getConfig());
    }

}
