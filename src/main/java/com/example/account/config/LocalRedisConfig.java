package com.example.account.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import redis.embedded.RedisServer;

//@Configuration
//public class LocalRedisConfig {
//    @Value("${spring.data.redis.port}")
//    private int redisPort;
//
//    private RedisServer redisServer;
//
//    @PostConstruct
//    public void startRedis() {
//        redisServer = new RedisServer(redisPort);
//        redisServer.start(); //객체를 하나 만들어서 실행시킨 것
//    }
//
//    @PreDestroy //파괴전
//    public void stopRedis() {
//        if (redisServer != null) {
//            redisServer.stop();
//        }
//    }
//}

//m1에서는 brew install redis로 해서 로컬에 다운, brew services start redis 실행시켜야 함.
