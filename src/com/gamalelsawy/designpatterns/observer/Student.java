package com.gamalelsawy.designpatterns.observer;

public class Student implements Observer{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String availability) {
        System.out.println(this.name + " has new notification: " + availability);
    }
}
