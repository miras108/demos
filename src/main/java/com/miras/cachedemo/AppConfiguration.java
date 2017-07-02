package com.miras.cachedemo;

import com.google.common.cache.CacheBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Created by miras108 on 2017-07-01.
 */

@Configuration
public class AppConfiguration {

    @Bean
    public CacheManager cacheManager()
    {
        System.out.println("Initializing simple Guava Cache manager.");

        GuavaCacheManager cacheManager = new GuavaCacheManager("car");
        CacheBuilder<Object, Object> cacheBuilder = CacheBuilder.newBuilder()
                .maximumSize(3);
//                .maximumWeight(10)
//                .weakKeys()
//                .weakValues()
//                .expireAfterAccess(10, TimeUnit.SECONDS)
//                .expireAfterWrite(10, TimeUnit.SECONDS);
        cacheManager.setCacheBuilder(cacheBuilder);
        return cacheManager;
    }
}
