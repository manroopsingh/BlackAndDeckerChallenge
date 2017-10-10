package com.example.user.bndchallenge.solution2.problemsolutions;

/**
 * Created by user on 9/29/17.
 */

public class Crypto {


    String inputString;

    public Crypto(String inputString) {
        this.inputString = inputString.toLowerCase();
    }


    public String encode(int algorithm) {

        printAlgo(algorithm);

        char[] inputChar = inputString.toCharArray();

        for (int i = 0; i < inputChar.length; i++) {


            inputChar[i] = getReversedChar(inputChar[i]);


        }

        return String.valueOf(inputChar);

    }

    private void printAlgo(int algorithm) {
        String algoString = null;

        switch (algorithm) {
            case 1:
                algoString = "Reverse";
                break;
            //cases for other algos
        }

        System.out.println("Type of encoding: " + algoString);


    }

    private char getReversedChar(char c) {

        char currentChar = c;
        if (c > 96 && c < 122) {
            int currentCharInt = currentChar;
            int reversedCharInt = 27 - (currentCharInt - 96) + 96;
            return (char) reversedCharInt;
        } else return c;
    }

    public static class ALGO {

        public static final int REVERSE = 1;
    }

}
