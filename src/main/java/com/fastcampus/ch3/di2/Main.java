package com.fastcampus.ch3.di2;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

class Car{
    @Autowired Engine engine;
    @Resource Door door;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", door=" + door +
                '}';
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
class SportsCar extends Car{}
class Engine{}
class Door{}
public class Main {
    public static void main(String[] args) {
        AppContext ac = new AppContext(AppConfig.class);
        Car car = (Car) ac.getBean("car");
        Car car2 = (Car) ac.getBean(Car.class);
        Engine engine = (Engine) ac.getBean("engine");
        Door door = (Door) ac.getBean(Door.class);

        car.setEngine(engine);
        car.setDoor(door);

        System.out.println("car = " + car);
        System.out.println("car2 = " + car2);
        System.out.println("engine = " + engine);
        System.out.println("door = " + door);
    }
}
