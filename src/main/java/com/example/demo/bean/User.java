package com.example.demo.bean;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created by zenxin on 2018/10/8.
 */
public class User {
    @NotEmpty(message = "名字不能为null")
    private  String name;
    @Max(value = 100,message = "年龄不能大于100岁")
    @Min(value = 18, message = "年龄不能小于18岁")
    private  Integer age;
    private  String sex;
    private  String addr;

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

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
