package com.gamalelsawy.designpatterns.adapter;

public class BicycleApapter implements Vehicle{

    private Bicycle bicycle;

    public BicycleApapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        this.bicycle.pedal();
    }

    @Override
    public void pushBreak() {
        this.bicycle.stop();
    }

    @Override
    public void soundHorn() {
        this.bicycle.ringBell();
    }
}
