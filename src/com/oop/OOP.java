package com.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OOP {

    public static <Itenger> void main(String[] args) {

        // creating list and initialising the elements
        List<Integer> numbers = Arrays.asList(2,4,6,8,10,12,14);

        // creating query parameter
        final int EVEN_NUMBER_BELOW_10 = 6;

        // using if statement
        if (numbers.contains(EVEN_NUMBER_BELOW_10)){
            System.out.println(EVEN_NUMBER_BELOW_10 + " is present");
        }
        else{
            System.out.println(EVEN_NUMBER_BELOW_10 + " is absent");
        }

        // using for loop to search for an even number above 10
        for(int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) > 10){
                System.out.println(numbers.get(i) + " is above 10");
            }
        }

        // using while to search for an even number above 10 in the list
        int i=0;
        while(i < numbers.size()){
            boolean y = numbers.get(i) > 10;

            switch(y){
                case true:
                    System.out.println(numbers.get(i) + " is above 10");
                    break;
                case false:
                    System.out.println(numbers.get(i) + " is below 10");
                    break;
            }
        }

        // find all even numbers in the list
        int [] evenNumbers;

        int position = 0;
        for(int x = 0; i < numbers.size(); x++){
            if (numbers.get(x) > 10){
                evenNumbers = new int[numbers.get(x)];
                position++;
                continue;

                System.out.println("not printed because of the continue statement");
            }
        }

    }
}
