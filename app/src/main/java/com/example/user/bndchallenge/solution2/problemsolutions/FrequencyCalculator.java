package com.example.user.bndchallenge.solution2.problemsolutions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 9/29/17.
 */

public class FrequencyCalculator {

    String inputString;
    HashMap<Character, Integer> hashMap;

    public FrequencyCalculator(String inputString) {
        this.inputString = inputString.toLowerCase();
    }


    public void countCharacters() {


        //Initialize the maps with 26 alphabets
        initializeMap(  );

        //Count each frequency of the each alphabet
        System.out.println("Counting the frequency...");
        char[] strCharArray = inputString.toCharArray();

        for (int i = 0; i < strCharArray.length; i++) {
            char currentChar = strCharArray[i];
            if (isValid(currentChar)) {
                int charCount = hashMap.get(currentChar);
                hashMap.put(currentChar, charCount + 1);
            }
        }


        //Print the count of each alphabet
        printMap(hashMap);


    }

    private boolean isValid(char currentChar) {
        int currentCharInt = currentChar;
        if (currentCharInt > 96 && currentCharInt <= 122)
            return true;
        else
            return false;
    }

    private void printMap(HashMap<Character, Integer> hashMap) {
        System.out.println("Printing the map with all the alphabets");
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.toString());
        }


    }

    private void initializeMap() {

        hashMap = new HashMap<>();
        System.out.println("Initializing the map with all the alphabets");
        for (int i = 0; i < 26; i++) {
            int alphabetASCII = i + 97;
            hashMap.put((char) alphabetASCII, 0);
        }


    }

}
