package com.fastcampus.ch2.aop;

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AopMain {
    public static void main(String[] args) throws Exception{
        Class myClass = Class.forName("com.fastcampus.ch2.aop.MyClass");
        Object o = myClass.newInstance();

        MyAdvice myAdvice = new MyAdvice();

        for (Method m : myClass.getDeclaredMethods()){
            myAdvice.invoke(m, o, null);
        }
    }
}

class MyAdvice{
    Pattern p = Pattern.compile("a.*");

    boolean matches(Method m){
        Matcher matcher = p.matcher(m.getName());
        return matcher.matches();
    }
    void invoke(Method m, Object o, Object... args) throws Exception{
        if (matches(m))
            System.out.println("[before]{"); // 공통 코드

        m.invoke(o, args);

        if (matches(m))
            System.out.println("}[after]"); // 공통 코드
    }
}
class MyClass {
    void aaa(){
        System.out.println("aaa() is called.");
    }
    void aaa2(){
        System.out.println("aaa2() is called.");
    }
    void bbb(){
        System.out.println("bbb() is called.");
    }
}
