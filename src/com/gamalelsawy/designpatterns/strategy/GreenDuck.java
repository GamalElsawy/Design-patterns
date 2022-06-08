package com.gamalelsawy.designpatterns.strategy;

public class GreenDuck extends Duck{
    // Assume the green ducks can't fly
    public GreenDuck() {
        this.flyBehavior = new Unflyable();
    }
}
