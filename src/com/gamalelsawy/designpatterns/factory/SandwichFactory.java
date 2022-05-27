package com.gamalelsawy.designpatterns.factory;

public class SandwichFactory {
    public static final int CHEESEBURGER = 1;
    public static final int BEEFBURGER = 2;

    public static Sandwich createSandwich(int sandwichId){
        switch (sandwichId){
            case CHEESEBURGER:
                return new CheeseBurger();
            case BEEFBURGER:
                return new BeefBurger();
            default:
                return null;
        }
    }
}
