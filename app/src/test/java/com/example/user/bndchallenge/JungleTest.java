package com.example.user.bndchallenge;

import android.support.v4.media.MediaMetadataCompat;

import com.example.user.bndchallenge.solution1.animals.Monkey;
import com.example.user.bndchallenge.solution1.animals.Snake;
import com.example.user.bndchallenge.solution1.animals.Tiger;
import com.example.user.bndchallenge.solution1.food.Bugs;
import com.example.user.bndchallenge.solution1.food.Fish;
import com.example.user.bndchallenge.solution1.food.Grain;
import com.example.user.bndchallenge.solution1.food.Meat;
import com.example.user.bndchallenge.solution1.jungle.Jungle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 9/29/17.
 */

public class JungleTest {

    Jungle jungle;

    @Before
    public void setup(){
        jungle = new Jungle();

    }

    //Testing animal addition to the jungle
    @Test
    public void should_add_tigers_to_jungle() {

        jungle.addTiger();
        jungle.addTiger();

        Tiger tiger = new Tiger(jungle);
        jungle.addTiger(tiger);

        assertEquals(jungle.getTigers(), 3);

    }

    @Test
    public void should_add_snakes_to_jungle() {

        jungle.addSnake();
        jungle.addSnake();

        Snake snake = new Snake(jungle);
        jungle.addSnake(snake);

        assertEquals(jungle.getSnakes(), 3);

    }

    @Test
    public void should_add_monkey_to_jungle() {

        jungle.addMonkey();
        jungle.addMonkey();

        Monkey monkey = new Monkey(jungle);
        jungle.addMonkey(monkey);

        assertEquals(jungle.getMonkeys(), 3);

    }

    //Testing food added to the jungle food store
    @Test
    public void should_add_food_to_jungle_food_store(){

        jungle.addFood(new Bugs());
        jungle.addFood(new Grain());
        jungle.addFood(new Meat());
        jungle.addFood(new Fish());

        assertEquals(jungle.getStoredFood().size(), 4);

    }

    //Testing animal's energy after eating
    @Test
    public void should_add_energy_for_tiger_after_eating(){

        jungle.addTiger();
        Tiger tiger = jungle.getAllTigers().get(0);
        tiger.eatFood();

        assertEquals(tiger.getEnergy(), 5);

    }

    @Test
    public void should_add_energy_for_snake_after_eating(){

        jungle.addSnake();
        Snake snake = jungle.getAllSnakes().get(0);
        snake.eatFood();

        assertEquals(snake.getEnergy(), 5);

    }

    @Test
    public void should_add_energy_for_monkey_after_eating(){

        jungle.addMonkey();
        Monkey monkey = jungle.getAllMonkeys().get(0);
        monkey.eatFood();

        assertEquals(monkey.getEnergy(), 2);

    }


    // TODO: 9/30/17 Create more unit tests for testing animal activities



}
