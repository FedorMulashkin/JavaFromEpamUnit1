package com.company;

import java.util.Random;

public class RandomNumbers {
    private final int count;
    private int[] numbers;

    public RandomNumbers(int count) {
        this.count = count;
        try{
            numbers = new int[count];
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                numbers[i] = random.nextInt(1, 10);
            }
        } catch (Exception e){
            System.err.println("Error: " + e.toString());
        }
    }

    public void writeNumbersInRow(){
        for (int i = 0; i < count; i++) {
            System.out.printf(numbers[i] + " ");
        }
        System.out.println();
    }

    public void writeInColumn(){
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }
    public long countSum(){
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public long countMultiplicity(){
        long multiplicity = 1;
        for (int i = 0; i < count; i++) {
            multiplicity *= numbers[i];
        }
        return multiplicity;
    }
}
