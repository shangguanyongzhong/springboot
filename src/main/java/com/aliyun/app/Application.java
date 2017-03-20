package com.aliyun.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by sg on 2017/3/15.
 */

@SpringBootApplication
public class Application {
    //hello、

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
        System.out.print("成功启动ddddddddddd");
    }
}
