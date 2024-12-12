package org.example;
import java.util.ArrayList;

public class arrayListDemo {

    public void arrayCreation()
    {
        ArrayList<String> morningBreakFast = new ArrayList<String>();
        morningBreakFast.add("Upma");
        morningBreakFast.add("Dosa");
        morningBreakFast.add("Idli");
        morningBreakFast.add("Vada");

        System.out.println(morningBreakFast);

        morningBreakFast.remove(0);
        System.out.println(morningBreakFast);

        morningBreakFast.set(0,"Pongal");

        System.out.println(morningBreakFast);

        System.out.println(morningBreakFast.size());

        System.out.println(morningBreakFast.get(2));
    }

    public void arrayListInteger()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(23);
        numbers.add(25);

        System.out.println(numbers);

        //removing the specific Integer from the arrayLit

        //numbers.remove(1);
        for (int i=0; i< numbers.size(); i++)
        {
            if (numbers.get(i)==25)
            {
                System.out.println("Deleting number is.." + numbers.get(i));
                numbers.remove(i);
                break;
            }
            else
            {
                System.out.println("Number not found");
            }

        }
    }

    public static  void main(String[] arg)
    {
        arrayListDemo demo = new arrayListDemo();
        demo.arrayCreation();
        demo.arrayListInteger();


    }

}
