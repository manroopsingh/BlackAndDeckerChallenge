package com.example.user.bndchallenge.solution1.animals;

import com.example.user.bndchallenge.solution1.food.Food;
import com.example.user.bndchallenge.solution1.jungle.Jungle;

import java.util.List;


/**
 * Created by user on 9/29/17.
 */

public abstract class Animal {

    private String animal;
    private int energy;
    private boolean canPlay;
    private List<Food> foods;
    private Jungle jungle;
    public static final String MONKEY = "Monkey";
    public static final String TIGER = "Tiger";
    public static final String SNAKE = "Snake";

    public Animal(String animal, Jungle jungle) {
        this.animal = animal;
        this.jungle = jungle;
        foods = jungle.getStoredFood();
    }

    //check which animal can play
    public boolean canPlay() {
        if (animal.equals(Animal.MONKEY))
            this.canPlay = true;
        else
            this.canPlay = false;
        return canPlay;
    }


    //by default only monkey can play
    public void play() {

        if (canPlay()) {
            if (energy > 8) {
                System.out.println("oooo ooo oooo");
                energy -= 8;
            } else System.out.println("Monkey is too tired");
        }
    }


    public void makeSound() {
        if (energy > 3) {
            System.out.println("This is " + animal + " making a sound");

            //Monkey consumes more energy to make a sound
            if (!animal.equals(Animal.MONKEY))
                energy -= 3;
            else if (energy > 4)
                energy -= 4;
        } else
            System.out.println("Not enough energy");
    }


    public void eatFood() {

        String foodType = "something";

        //Check if food store is empty
        if (foods != null && foods.size() > 0) {
            int foodIndex = foods.size() - 1;
            foodType = foods.get(foodIndex).getType();

            //Tiger can't eat grain
            if (!(isTiger() && foodType.equals(Food.GRAIN))) {
                foods.remove(foodIndex);
            } else {
                System.out.println("Tiger can't eat Grain, so I gave something.");
                foodType = "something";
            }

        } else {
            System.out.println("Food store is empty. Please add food to the store. I gave his something for now.");
        }

        System.out.println("This " + animal + " is eating " + foodType);

        //Monkey gets 2 energy on eating
        if (isMonkey()) energy += 2;
        else energy += 5;
    }

    public void sleep() {
        System.out.println("This " + animal + " is sleeping");
        if (isTiger()) energy += 5;
        else energy += 10;

    }


    public int getType() {
        int animalCount = 0;
        switch (animal) {
            case Animal.MONKEY:
                animalCount = jungle.getMonkeys();
                break;
            case Animal.TIGER:
                animalCount = jungle.getTigers();
                break;
            case Animal.SNAKE:
                animalCount = jungle.getSnakes();
                break;
        }
        return animalCount;
    }

    public int getEnergy() {
        System.out.println("This " + animal + "'s energy:" + energy);
        return energy;
    }

    public boolean isTiger() {
        return animal.equals(Animal.TIGER);
    }

    public boolean isMonkey() {
        return animal.equals(Animal.MONKEY);
    }

    public boolean isSnake() {
        return animal.equals(Animal.SNAKE);
    }

}
