package com.company;

public class VegBurger  extends Burger {

    @Override
    public float price() {
        return 60.0f;
    }

    @Override
    public String name() {
        return "Вег Бургер";
    }
}
