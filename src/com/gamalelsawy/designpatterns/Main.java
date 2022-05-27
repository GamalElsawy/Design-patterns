package com.gamalelsawy.designpatterns;

import com.gamalelsawy.designpatterns.adapter.Bicycle;
import com.gamalelsawy.designpatterns.adapter.BicycleApapter;
import com.gamalelsawy.designpatterns.adapter.Car;
import com.gamalelsawy.designpatterns.adapter.Vehicle;
import com.gamalelsawy.designpatterns.decorator.BasicSandwich;
import com.gamalelsawy.designpatterns.decorator.ExtraBeef;
import com.gamalelsawy.designpatterns.decorator.ExtraCheese;
import com.gamalelsawy.designpatterns.decorator.Sandwich;
import com.gamalelsawy.designpatterns.factory.SandwichFactory;
import com.gamalelsawy.designpatterns.observer.Course;
import com.gamalelsawy.designpatterns.observer.Student;
import com.gamalelsawy.designpatterns.proxy.InternetProxy;
import com.gamalelsawy.designpatterns.proxy.InternetServiceProvider;
import com.gamalelsawy.designpatterns.singleton.Singleton;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Singleton
        // Used when creating instances is costly (performance or memory)
        // EX: data source

        /*Singleton singleton = Singleton.getSingletonInstance();
        singleton.printData();

        Singleton singleton2 = Singleton.getSingletonInstance();
        singleton2.printData();*/

        // ----------------------------------------------------


        // Observer
        // Used when i want to know the state of some product

        /*Student student1 = new Student("Ahmed");
        Student student2 = new Student("Amr");
        Student student3 = new Student("Amgad");
        Student student4 = new Student("Omar");

        Course course1 = new Course("Java");

        course1.subscribe(student1);
        course1.subscribe(student2);
        course1.subscribe(student3);
        course1.subscribe(student4);

        course1.setAvailability(true);*/

        // ----------------------------------------------------


        // Factory
        // Used to work with subtypes of a class
        /*Sandwich sandwich = SandwichFactory.createSandwich(SandwichFactory.BEEFBURGER);
        sandwich.prepare();*/

        // ----------------------------------------------------


        // Decorator
        // Used to lower code refactoring when need to change in a single part of SW
        // Ex: want to change the price of beef, here will only change in Beef()

        /*Sandwich sandwich = new ExtraCheese(new ExtraBeef(new BasicSandwich()));
        System.out.println(sandwich.getCost());
        System.out.println(sandwich.getIngredients());*/

        // ----------------------------------------------------


        // Adapter
        // Used to adapt two diff components to work together

        /*Vehicle car = new Car();
        car.accelerate();
        car.pushBreak();
        car.soundHorn();

        System.out.println();

        Vehicle bicycle = new BicycleApapter(new Bicycle());
        bicycle.accelerate();
        bicycle.pushBreak();
        bicycle.soundHorn();*/

        // ----------------------------------------------------


        // Proxy
        // Used to make a middle layer of validation between two sides
        List<String> sites = Arrays.asList("facebook", "google", "whatsapp", "linkedin");
        InternetServiceProvider isp = new InternetProxy();
        for(String site: sites)
            System.out.println(isp.routeSite(site));

        // ----------------------------------------------------

        //
        // ----------------------------------------------------
        // ----------------------------------------------------

    }
}
