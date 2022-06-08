package com.gamalelsawy.designpatterns.strategy;

public class Unflyable implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
