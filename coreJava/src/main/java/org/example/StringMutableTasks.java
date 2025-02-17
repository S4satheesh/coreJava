package org.example;

public class StringMutableTasks {

    public void StringBuilderAppending() {
        StringBuilder name = new StringBuilder("John");
        name.append(" Doe");
        System.out.println("Appending the String using String Builder.." + name);
    }

    public void StringBufferAppending()
    {
        StringBuffer name = new StringBuffer("Pandu");
        name.append(143);
        System.out.println("Appending the String with Number using Builder.."+ name);
    }


    public static void main(String[] args) {
        StringMutableTasks tasks = new StringMutableTasks();
        tasks.StringBuilderAppending();
        tasks.StringBufferAppending();
    }
}


