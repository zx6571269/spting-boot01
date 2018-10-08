package com.example.demo;

import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件
 *
 * 相当于在配置文件中用<bean><bean/>标签添加组件
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){

        System.out.println("helloService 方法");
        return new HelloService();
    }
}
