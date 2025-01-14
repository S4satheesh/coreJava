package org.example;

public class Employee extends Shape{
    @Override
    void pintinfo() {
        String name ="Sat";
        String age ="22";
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args)
    {
        Shape s = new Employee();
           s.testinfo();

        }
    }

