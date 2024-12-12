package org.example;

import java.util.*;

public class splitsTheGivenStringIntoWords {

    public static void main(String[] arg)
    {
        //Declaring the Sentence
        String sentence = "This is Friday holiday";

        //Splitting into Words

        String[] wordsArray = sentence.split(" ");

        //Use Array List to Store the Words

        List<String> wordsList = new ArrayList<>();
        //Set<String> wordsSet = new HashSet<>();

        //Adding words to string
        for(String word: wordsArray)
        {
            //wordsSet.add(word);
            wordsList.add(word);
        }

        //2nd way of adding

        wordsList.addAll(Arrays.asList(wordsArray));


        //Printing the Array
        System.out.println("Printing the String");
        for (String word : wordsArray)
        {
            System.out.println(word);
        }



    }
}
