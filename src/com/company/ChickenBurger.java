package com.company;

public class ChickenBurger  extends Burger {

    @Override
    public float price() {
        return 80.0f;
    }

    @Override
    public String name() {
        return "Бургер с курицей";
    }
}
