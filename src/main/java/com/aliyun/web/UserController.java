package com.aliyun.web;

import com.aliyun.app.UserMapper;
import com.aliyun.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sg on 2017/3/15.
 */

@Controller

public class UserController {

    @Autowired
    UserMapper userMapper;
    @RequestMapping(value = "/user")
   @ResponseBody
    public String user(){
      User user = userMapper.findUserByName(1);
        System.out.print("kkkkkkkkkkkk");
        return "-----";
    }
}
