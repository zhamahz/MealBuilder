package com.company;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        // write your code here
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Вегетарианская еда\n");
        vegMeal.showItems();
        System.out.println("Общая стоимость: " + vegMeal.getCost());

        System.out.println("----------------------");
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Обычная еда\n");
        nonVegMeal.showItems();
        System.out.println("Общая стоимость: " + nonVegMeal.getCost());
    }
}
