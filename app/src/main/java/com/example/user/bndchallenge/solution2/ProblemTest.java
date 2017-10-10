package com.example.user.bndchallenge.solution2;

import com.example.user.bndchallenge.solution2.problemsolutions.Crypto;
import com.example.user.bndchallenge.solution2.problemsolutions.FrequencyCalculator;

/**
 * Created by user on 9/29/17.
 */

public class ProblemTest {

    public static void main(String[] args) {

        String inputString = "Errors in strategy cannot be correct through tactical maneuvers";
        System.out.println("INPUT STRING");
        System.out.println(inputString + "\n");


        //Problem 1
        //Reverse the given string with the complimentary alphabet
        System.out.println("PROBLEM 1: Reverse the given string with the complimentary alphabet");

        //Create an instance of crypto class that use encoding algorithms
        Crypto crypto = new Crypto(inputString);
        //Print the encoding string
        System.out.println("OUTPUT" + "\n" + crypto.encode(Crypto.ALGO.REVERSE) + "\n");


        //Problem 2
        //Count the number of each alphabet present in a given string
        System.out.println("PROBLEM 2: Count the number of each alphabet present in a given string");
        FrequencyCalculator frequencyCalculator = new FrequencyCalculator(inputString);
        System.out.println("OUTPUT");
        frequencyCalculator.countCharacters();


    }
}
