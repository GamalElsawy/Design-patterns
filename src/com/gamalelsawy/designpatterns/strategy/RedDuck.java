package com.gamalelsawy.designpatterns.strategy;

public class RedDuck extends Duck{

    // Assume the green ducks can fly
    public RedDuck() {
        this.flyBehavior = new FlyWithWings();
    }
}
