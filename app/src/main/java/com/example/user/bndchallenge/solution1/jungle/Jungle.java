package com.example.user.bndchallenge.solution1.jungle;

import com.example.user.bndchallenge.solution1.animals.Monkey;
import com.example.user.bndchallenge.solution1.animals.Snake;
import com.example.user.bndchallenge.solution1.animals.Tiger;
import com.example.user.bndchallenge.solution1.food.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 9/29/17.
 */

public class Jungle {


    public List<Tiger> mTigers;
    public List<Monkey> mMonkeys;
    public List<Snake> mSnakes;

    public List<Food> mFood;

    public Jungle() {
        mTigers = new ArrayList<>();
        mMonkeys = new ArrayList<>();
        mSnakes = new ArrayList<>();
        mFood = new ArrayList<>();
    }

    public void addTiger() {
        mTigers.add(new Tiger(this));
    }

    public void addTiger(Tiger tiger) {
        mTigers.add(tiger);
    }

    public void addMonkey() {
        mMonkeys.add(new Monkey(this));
    }

    public void addMonkey(Monkey monkey) {
        mMonkeys.add(monkey);
    }

    public void addSnake() {
        mSnakes.add(new Snake(this));
    }

    public void addSnake(Snake snake) {
        mSnakes.add(snake);
    }

    public void addFood(Food food) {
        System.out.println(food.getType() +
                " was added to the food store. Food store capacity: "
                + (mFood.size() + 1) + " item(s)");
        mFood.add(food);
    }

    public void makeJungleSound() {
        for (Tiger tiger : mTigers) {
            tiger.makeSound();
            tiger.getEnergy();
        }
        for (Monkey monkey : mMonkeys) {
            monkey.makeSound();
            monkey.getEnergy();
        }
        for (Snake snake : mSnakes) {
            snake.makeSound();
            snake.getEnergy();
        }
    }

    public List<Food> getStoredFood() {
        return mFood;
    }

    public int getTigers() {
        return mTigers != null ? mTigers.size() : 0;
    }

    public int getMonkeys() {
        return mMonkeys != null ? mMonkeys.size() : 0;
    }

    public int getSnakes() {
        return mSnakes != null ? mSnakes.size() : 0;
    }


    public List<Tiger> getAllTigers() {
        return mTigers;
    }

    public List<Monkey> getAllMonkeys() {
        return mMonkeys;
    }

    public List<Snake> getAllSnakes() {
        return mSnakes;
    }


}
