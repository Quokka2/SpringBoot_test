package com.fastcampus.ch2;

public class Main2 {
    private String name;
    private int age;
    private int grade;

    public void Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void saveToDatabase() {
        // 데이터베이스에 학생 정보를 저장하는 코드
    }
}

