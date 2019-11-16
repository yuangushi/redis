package com.yuan.redis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    public void setKey(String key,String value){
        redisTemplate.opsForValue().set(key,value);
    }

    public String getKey(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
