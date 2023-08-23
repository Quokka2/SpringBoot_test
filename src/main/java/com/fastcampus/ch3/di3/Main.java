package com.fastcampus.ch3.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Car{

    Engine engine;
    Door door;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", door=" + door +
                '}';
    }
}
@Component
class Engine{}
@Component
class Door{}
public class Main {
    public static void main(String[] args) {
        // AC를 생성 - AC의 설정파일은 AppConfig.class 자바설정
        ApplicationContext ac = new AnnotationConfigApplicationContext(com.fastcampus.ch3.di3.AppConfig.class);
        Car car = ac.getBean("car", com.fastcampus.ch3.di3.Car.class);
        Engine engine = ac.getBean(Engine.class);
        System.out.println("car = " + car);
        System.out.println("engine = " + engine);

        System.out.println("ac.getBeanDefinitionCount() = " + ac.getBeanDefinitionCount());
        System.out.println("ac.getBeanDefinitionNames() = " + Arrays.toString(ac.getBeanDefinitionNames()));
    }
}
