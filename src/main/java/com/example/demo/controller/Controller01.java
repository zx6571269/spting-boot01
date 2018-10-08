package com.example.demo.controller;

import com.example.demo.bean.Person;
import com.example.demo.bean.PersonLoad;
import com.example.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by zenxin on 2018/10/7.
 */

@RestController
@ResponseBody
public class Controller01 {

    @Autowired
    Person person;

    @Autowired
    PersonLoad personLoad;

    @RequestMapping("/")
    public String hello(){

        System.out.println(person);

        System.out.println("personLoad:"+personLoad);
        return "hello 01";
    }

    @RequestMapping("/saveUser")
    public void  saveUser(@Valid User user, BindingResult result){
        System.out.println(user);
        if (result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error:list) {
                System.out.println(error.getCode()+"_"+error.getDefaultMessage());
            }
        }

    }
}
