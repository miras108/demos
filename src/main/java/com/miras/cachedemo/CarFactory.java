package com.miras.cachedemo;

import com.google.common.cache.CacheBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by miras108 on 2017-07-01.
 */

@Component
public class CarFactory {

    @Cacheable("car")
    public Car createCar(String brand, String model) {
        simulateSlowService();
        System.out.println("car with brand: " + brand + " with model: " + model + " not found");
        Car car = new Car();
        car.setBrand(brand);
        car.setModel(model);
        return car;
    }

    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
