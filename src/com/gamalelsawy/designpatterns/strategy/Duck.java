package com.gamalelsawy.designpatterns.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public void performFly(){
        flyBehavior.fly();
    }
    public void swim() {
        System.out.println("All ducks can swim");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
