package com.example.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by zenxin on 2018/10/8.
 */




/**
 *
 * @PropertySource：加载指定的配置文件；
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *      prefix = "personload"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 *  @ConfigurationProperties(prefix = "personload")默认从全局配置文件中获取值；
 *
 */

@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "personload")
public class PersonLoad {
    private String name;
    private Integer age;
    private String addr ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    @Override
    public String toString() {
        return "PersonLoad{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
