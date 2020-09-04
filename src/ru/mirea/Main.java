package ru.mirea;


public class Main {

    public static void main(String[] args) {
        // task 1 //
        int[] intArray;
        intArray = new int[10];

        for (int i = 0; i < 10; i++){

        }
        int sum_1 = 0;
        for (int i = 0; i < 10; i++){
            sum_1 += intArray[i];
        }
        System.out.println(sum_1);
        int g = 0;
        int sum_2 = 0;
        while(g < 10){
            sum_2 += intArray[g];
            g++;
        }
        System.out.println(sum_2);
        int c =0;
        int sum_3 = 0;
        do {
            sum_3 += intArray[c];
            c++;
        } while (c<10);
        System.out.println(sum_3);
        //end of task 3//

        //task 4//
        for(String out5: args){
            System.out.println(out5);
            System.out.println(out5);
        }
        //end task 4//
    }
}
