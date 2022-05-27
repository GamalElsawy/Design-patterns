package com.gamalelsawy.designpatterns.adapter;

public class Car implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Car is moving...");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car stopped");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beeb beeb...");
    }
}
