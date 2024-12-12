package org.example;

import java.util.Scanner;

public class GetIntegerInputAtRuntime {

    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Value for N:");
        int number = scanner.nextInt();
        System.out.println("Entered Number Is..." + number);
        scanner.close();

    }
}
