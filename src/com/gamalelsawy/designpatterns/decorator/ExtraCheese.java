package com.gamalelsawy.designpatterns.decorator;

public class ExtraCheese extends SandwichDecorator{
    public ExtraCheese(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 7;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", cheese";
    }
}
