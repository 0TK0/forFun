package com.zyq.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zyq.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tk on 2018/12/8.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/queryAllUser",method = RequestMethod.GET)
    public String queryAllUser(){
        UserDTO userDTO = UserDTO.builder().name("zyq").age(12).build();
        String str = JSON.toJSONString(userDTO);
        System.out.println(JSON.toJSONString(str));
        System.out.println(JSONObject.parseObject(str,UserDTO.class));
        return str;

    }
}
