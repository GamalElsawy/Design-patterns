package com.gamalelsawy.designpatterns.adapter;

public class Bicycle {

    public void pedal() {
        System.out.println("Bicycle is moving...");
    }

    public void stop() {
        System.out.println("Bicycle stopped");
    }

    public void ringBell() {
        System.out.println("Ring ring...");
    }
}
