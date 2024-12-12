package org.example;

public class sampleCode {

    public void loopTest() {
        for (int i = 1; i < 10; i++) {

            System.out.println(i);
        }
    }




    public  void ifTest(int i)
    {
        if (i<=10){
            System.out.println("Hello world..");
        }
        else System.out.println("No world...");
    }

    public static void main(String[] args) {
        System.out.println("Sample code");
        sampleCode sc = new sampleCode();
        sc.loopTest();
        sc.ifTest(11);


    }
}
