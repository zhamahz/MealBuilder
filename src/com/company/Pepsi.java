package com.company;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 45.0f;
    }

    @Override
    public String name() {
        return "Пепси";
    }
}
