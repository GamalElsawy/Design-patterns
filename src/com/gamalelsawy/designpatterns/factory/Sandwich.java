package com.gamalelsawy.designpatterns.factory;

public class Sandwich {
    private String name;
    private int calories;

    public void prepare() {
        System.out.println(name + " is being prepared with " + calories + " calories");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
