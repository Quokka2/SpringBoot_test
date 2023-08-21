package com.fastcampus.ch3.di1;

import java.io.FileReader;
import java.util.Properties;

class Car{}
class SportsCar extends Car{}
class Truck extends Car{}
class Door{}


public class Main {
    public static void main(String[] args) throws Exception {
        Car car = (Car) getObject("car");
        Door door = (Door) getObject("door");
        System.out.println("car = " + car);
        System.out.println("door = " + door);
    }

    static Object getObject(String key) throws Exception {
        Properties prop = new Properties();
        Class clazz = null;

        prop.load(new FileReader("config.txt"));
        String className = prop.getProperty(key);
        clazz = Class.forName(className);

        return clazz.newInstance();
    }

    static Car getCar(){
        return new Truck();
    }
}
