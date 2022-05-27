package com.gamalelsawy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject{
    private String name;
    private String availability;
    private List<Observer> observerList;

    public Course(String name) {
        this.name = name;
        observerList = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllSubscribers() {
        for(Observer observer: observerList)
            observer.update(availability);
    }

    public void setAvailability(boolean isAvailable) {
        availability = this.name + (isAvailable? " course is available now": "is not available now");
        notifyAllSubscribers();
    }
}
