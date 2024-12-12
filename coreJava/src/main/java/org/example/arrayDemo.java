package org.example;

public class arrayDemo {

    public void arrayLength(){

        int a[] = {5,4,5};
        System.out.println("Length of the Array is .."+a.length);
    }
    public void printingArray()
    {
        int[] a = {5,4,5};
        for (int j : a) {
            System.out.println("Array Contains is.." + j);
        }
    }

    public void arrayString()
    {
        String[] name ={"Pandu","Sat","Veni","Chiru"};

        for (String s : name) {
            System.out.println("Name of the Student is..." + s);
        }
    }

    /*To add two arrays we have two options.
    * Using System.arraycopy or by using utility classes like ArrayList.
    * */
    public void arrayConcatenation()
    {
            String[] name = {"Pandu", "Sat", "Veni", "Chiru"};
            String[] name2 = {"Oyee", "Lalli"};

            // Create a new array with the combined length of both arrays
            String[] combined = new String[name.length + name2.length];

            // Copy elements from the first array
            System.arraycopy(name, 0, combined, 0, name.length);

            // Copy elements from the second array
            System.arraycopy(name2, 0, combined, name.length, name2.length);

            // Print the combined array
            for (String element : combined) {
                System.out.println(element);
            }
        }




    public static  void main(String[] args){

        arrayDemo arr = new arrayDemo();
        //arr.arrayLength();
        //arr.printingArray();
        //arr.arrayString();
        arr.arrayConcatenation();


    }
}
