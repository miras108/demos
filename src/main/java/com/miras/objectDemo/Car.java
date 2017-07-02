package com.miras.objectDemo;

/**
 * Created by miras108 on 2017-07-02.
 */
public class Car implements Cloneable{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car cloneCar() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    public void clean()
    {
        finalize();
    }

    @Override
    protected void finalize()
    {
        try {
            super.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("FINALIZE");
    }
}