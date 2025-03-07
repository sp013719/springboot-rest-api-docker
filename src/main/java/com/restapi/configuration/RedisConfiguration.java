package com.restapi.configuration;

import com.restapi.request.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfiguration {
    @Value("${REDIS_HOST:localhost}")
    private String redisHost;
    @Value("${REDIS_PORT:6379}")
    private int redisPort;

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration(this.redisHost, this.redisPort);
        return new JedisConnectionFactory(configuration);
    }

    @Bean
    public RedisTemplate<String, Customer> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String, Customer> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        return redisTemplate;
    }
}
