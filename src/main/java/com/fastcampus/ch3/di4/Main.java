package com.fastcampus.ch3.di4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        // ApplicationContext 이게 스프링인지 톰캣인지 잘 확인해야됨.
        ApplicationContext ac = SpringApplication.run(Main.class, args);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        Arrays.sort(beanDefinitionNames);
        Arrays.stream(beanDefinitionNames) // 배열을 스트림으로 변환
                .filter(b->!b.startsWith("org"))
                .forEach(System.out::println);
    }
}
