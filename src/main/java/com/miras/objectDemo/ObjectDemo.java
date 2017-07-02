package com.miras.objectDemo;

/**
 * Created by miras108 on 2017-07-02.
 */
public class ObjectDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car car = new Car();
        car.setModel("Audi");

        Car clonedCar = car.cloneCar();

        Integer i = 1;
        Integer clonedI = i;
        clonedI = 2;

        System.out.println("I = " + i);
        System.out.println("cloned I = " + clonedI);

        System.out.println("car1: " + car.getModel());
        System.out.println("car2: " + clonedCar.getModel());

        car.clean();
        clonedCar.clean();

        System.out.println("car after finalize: " + car.getModel());
    }
}
