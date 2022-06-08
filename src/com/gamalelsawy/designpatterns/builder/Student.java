package com.gamalelsawy.designpatterns.builder;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double lastGrade ;
    private int overallRanking;


    public Student(String firstName, String middleName, String lastName, int age, double lastGrade, int overallRanking) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.lastGrade = lastGrade;
        this.overallRanking = overallRanking;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getLastGrade() {
        return lastGrade;
    }

    public void setLastGrade(double lastGrade) {
        this.lastGrade = lastGrade;
    }

    public int getOverallRanking() {
        return overallRanking;
    }

    public void setOverallRanking(int overallRanking) {
        this.overallRanking = overallRanking;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", lastGrade=" + lastGrade +
                ", overallRanking=" + overallRanking +
                '}';
    }
}
