package org.example;

import java.util.Arrays;

public class ArraySortNumber {

    public static void main(String[] arg)
    {
        int [] numbers= {12,13,29,25,1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
    }


}
