package com.fastcampus.ch2;

public class Main {
    public static void main(String[] args){
        System.out.println("Hellow World");
        System.out.println(1);
        System.out.println(2);

        try {
//            Exception e = new Exception();
//            throw e;
            throw new Exception("요금이 부족합니다.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외메시지 : " + e.getMessage());
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }
}
