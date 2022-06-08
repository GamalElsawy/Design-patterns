package com.gamalelsawy.designpatterns.builder;

public class StudentBuilder {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double lastGrade ;
    private int overallRanking;

    public StudentBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public StudentBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder lastGrade(double lastGrade) {
        this.lastGrade = lastGrade;
        return this;
    }

    public StudentBuilder overallRanking(int overallRanking) {
        this.overallRanking = overallRanking;
        return this;
    }

    public Student buildStudent() {
        return new Student(firstName, middleName, lastName, age, lastGrade, overallRanking);
    }
}
