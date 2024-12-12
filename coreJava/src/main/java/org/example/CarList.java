package org.example;

import java.util.ArrayList;

public class CarList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //cars.remove(1);
        System.out.println(cars);
    }
}
