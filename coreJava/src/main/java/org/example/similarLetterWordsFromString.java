package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class similarLetterWordsFromString {
    public static void main(String[] args){
    String myString ="Bangalore Bombay Pune Goa Bhubaneswar Birla Andhra City Cool Beach";

    String [] newWords = myString.split(" ");


        System.out.println(Arrays.toString(newWords));

        HashMap<Integer, String> words  = new HashMap<>();
        for(int i=0; i<newWords.length;i++)
        {
            if(newWords[i].startsWith("B"))
            {
                words.put(newWords[i].length(),newWords[i]);
                System.out.println(words);
            }
        }

    }

}
