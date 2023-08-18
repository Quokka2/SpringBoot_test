package com.fastcampus.ch2;

public class Main {
    public static void main(String[] args){
        System.out.println("Hellow World");
        System.out.println(1+2);
        System.out.println(2);

        int[] num = {6, 10, 2};
        String[] str = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            str[i] = String.valueOf(num[i]);
        }
        System.out.println(str);


        try {
//            Exception e = new Exception();
//            throw e;
            throw new Exception("요금이 부족합니다.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외메시지 : " + e.getMessage());
            System.out.println(method());
        }
        System.out.println("프로그램이 정상 종료되었음.");

    }

    public static String method() {
        return "지금은 실습";
    }

}
