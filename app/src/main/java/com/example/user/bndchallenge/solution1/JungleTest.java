package com.example.user.bndchallenge.solution1;

import android.view.MotionEvent;

import com.example.user.bndchallenge.solution1.animals.Monkey;
import com.example.user.bndchallenge.solution1.animals.Snake;
import com.example.user.bndchallenge.solution1.animals.Tiger;
import com.example.user.bndchallenge.solution1.food.Bugs;
import com.example.user.bndchallenge.solution1.food.Fish;
import com.example.user.bndchallenge.solution1.food.Grain;
import com.example.user.bndchallenge.solution1.food.Meat;
import com.example.user.bndchallenge.solution1.jungle.Jungle;

/**
 * Created by user on 9/29/17.
 */

public class JungleTest {

    public static void main(String[] args) {

        Jungle jungle = new Jungle();

        //adding animals
        jungle.addTiger();
        jungle.addTiger(new Tiger(jungle));
        jungle.addMonkey();
        jungle.addMonkey(new Monkey(jungle));
        jungle.addSnake();
        jungle.addSnake(new Snake(jungle));

        //adding food
        jungle.addFood(new Bugs());
        jungle.addFood(new Meat());
        jungle.addFood(new Fish());
        jungle.addFood(new Grain());

        //sound off before animals eat
        jungle.makeJungleSound();

        //get animal objects
        Monkey firstMonkey = jungle.getAllMonkeys().get(0);
        Monkey secondMonkey = jungle.getAllMonkeys().get(1);
        Snake snake = jungle.getAllSnakes().get(0);
        Tiger tiger = jungle.getAllTigers().get(0);

        //animals after eating
        tiger.eatFood();//tiger wont be able to eat grain
        firstMonkey.eatFood();
        snake.eatFood();
        secondMonkey.eatFood();
        secondMonkey.eatFood();

        //animals sleeping
        tiger.sleep();
        firstMonkey.sleep();
        secondMonkey.sleep();
        snake.sleep();

        //monkey playing
        firstMonkey.play();

        //sounding off animals
        jungle.makeJungleSound();



    }
}
