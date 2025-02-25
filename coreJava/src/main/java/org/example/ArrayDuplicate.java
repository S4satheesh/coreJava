package org.example;

import java.util.Arrays;

public class ArrayDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 9};  // Added duplicate values for testing
        System.out.println("Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {  // Fix comparison operator
            for (int j = i + 1; j < arr.length; j++) {  // Fix inner loop condition
                if (arr[i] == arr[j]) {  // Remove incorrect condition
                    System.out.println("Duplicate number: " + arr[i]);
                }
                
                }

            }
        }
    }

