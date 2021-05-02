package com.jean.river.redisdemo.config;


import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.io.Serializable;

/**
 * @Author: JeanRiver
 * @Description:
 * @Date Created at 17:22 2021/5/2
 * @Modified By:
 */
@Configuration
@EnableCaching
public class LettuceRedisConfig extends CachingConfigurerSupport {

    @Bean
    public RedisTemplate<String, Serializable> redisTemplate
            (LettuceConnectionFactory connectionFactory){
        RedisTemplate<String, Serializable> redisTemplate
                = new RedisTemplate<>();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setConnectionFactory(connectionFactory);
        return redisTemplate;
    }
}
