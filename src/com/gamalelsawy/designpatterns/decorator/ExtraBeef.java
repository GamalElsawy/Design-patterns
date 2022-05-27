package com.gamalelsawy.designpatterns.decorator;

public class ExtraBeef extends SandwichDecorator{

    public ExtraBeef(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 15;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", beef";
    }
}
