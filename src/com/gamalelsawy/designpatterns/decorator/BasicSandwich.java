package com.gamalelsawy.designpatterns.decorator;

public class BasicSandwich implements Sandwich{
    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getIngredients() {
        return "bread";
    }
}
