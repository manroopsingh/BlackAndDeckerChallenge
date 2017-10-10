package com.example.user.bndchallenge.solution1.food;

/**
 * Created by user on 9/29/17.
 */

public abstract class Food{

    //Constants
    public static final String GRAIN = "Grain";
    public static final String MEAT = "Meat";
    public static final String FISH = "Fish";
    public static final String BUGS = "Bugs";


    String foodType;

    public Food(String foodType) {
        this.foodType = foodType;
    }

    public String getType(){
        return foodType;
    }
}
