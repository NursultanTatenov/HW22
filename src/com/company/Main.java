package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        Random random=new Random();

        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1, 100));
        }
        System.out.println(numbers);
        System.out.println("Array size: "+numbers.size());

        ArrayList<Integer> evenNumbers=new ArrayList<>();
        ArrayList<Integer> oddNumbers=new ArrayList<>();

        for (Integer a:numbers)
            if (a%2==0){
               evenNumbers.add(a);}
            else {
               oddNumbers.add(a);
            }
        System.out.println("Even numbers:"+evenNumbers);
        System.out.println("Odd numbers:"+oddNumbers);
        }
    }

//        ArrayList тузунуз
//        1ден 100го чейинки 50 сан менен толтурунуз
//        Дагы 2 ArrayList тузуп бирисине так сандарды, экинчисине жуп сандарды салыныз
//        Аларды консольго чыгарыныз