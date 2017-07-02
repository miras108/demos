package com.miras.cachedemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by miras108 on 2017-07-01.
 */
@Component
public class AppRunner implements CommandLineRunner{

    private CarFactory carFactory;

    public AppRunner(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    @Override
    public void run(String... strings) throws Exception {
        carFactory.createCar("Audi", "A4");
        carFactory.createCar("BMW", "E345");
        carFactory.createCar("Audi", "A4");
        carFactory.createCar("Volvo", "445");
        carFactory.createCar("Mercedes", "SClass");
        carFactory.createCar("Peugeot", "407");
        carFactory.createCar("Volvo", "445");
        carFactory.createCar("Volvo", "445");
        carFactory.createCar("Citroen", "445");
        carFactory.createCar("Fiat", "445");
        carFactory.createCar("Audi", "A4");
        carFactory.createCar("Volvo", "445");
        carFactory.createCar("Peugeot", "407");

    }
}
