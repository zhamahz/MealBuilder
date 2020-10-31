package com.company;

import java.util.ArrayList;
import java.util.List;

public class Meal {
   private List <Item> items = new ArrayList<Item>();
   private List<MealBuilder> mealBuilders = new ArrayList<MealBuilder>();
    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Название : " + item.name()+"\n");
            System.out.print("Упаковка : " + item.packing().pack()+"\n");
            System.out.println("Цена : " + item.price()+"\n");
        }
    }
}
