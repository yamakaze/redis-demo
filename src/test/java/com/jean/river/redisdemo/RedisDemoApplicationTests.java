package com.jean.river.redisdemo;

import com.jean.river.redisdemo.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;

@SpringBootTest
class RedisDemoApplicationTests {

    @Autowired
    private RedisTemplate<String, String> strRedisTemplate;

    @Autowired
     RedisTemplate<String, Serializable> serializableRedisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void testString(){
        strRedisTemplate.opsForValue().set("strKey", "zwqh");
        System.out.println(strRedisTemplate.opsForValue().get("strKey"));
    }

    @Test
    public void testSerializable(){
        UserEntity user = new UserEntity();
        user.setId(1L);
        user.setUserName("Jean");
        user.setUserSex("male");
        serializableRedisTemplate.opsForValue().set("user", user);
        UserEntity user2 = (UserEntity) serializableRedisTemplate.opsForValue().get("user");
        System.out.println("user:"+user2.getId()+","+user2.getUserName()+","+user2.getUserSex());
    }
}
