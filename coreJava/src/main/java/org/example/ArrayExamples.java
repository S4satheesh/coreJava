package org.example;

import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {
        //declaring the Array and Directly initializing the Array.
        int[] iArray = {1,2,3,4};
        char[] cArray = {'a','c','r'};
        String[] sArray = {"Satheesh", "Nichenametla"};

        //initializing the using new keyword

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] =9;

        System.out.println(Arrays.toString(arr));
        System.out.println(cArray);
        System.out.println(Arrays.toString(iArray));
        System.out.println(Arrays.toString(sArray));

    }
}
