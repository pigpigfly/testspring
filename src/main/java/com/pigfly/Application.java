package com.pigfly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pigfly.dao")
public class Application {
    public static void main(String[] args){
        //启动嵌入式的Tomcat并初始化Spring 环境及其各Spring 组件
        SpringApplication.run(Application.class,args);
        System.out.println("程序正在运行.....");
    }
}
