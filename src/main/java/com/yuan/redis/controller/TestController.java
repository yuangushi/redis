package com.yuan.redis.controller;

import com.yuan.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping("/setKey")
    public void setKey(String key,String value){
        redisUtil.setKey(key,value);
    }

        @RequestMapping("/getKey")
    public String getKey(String key){
        return redisUtil.getKey(key);
    }
}
