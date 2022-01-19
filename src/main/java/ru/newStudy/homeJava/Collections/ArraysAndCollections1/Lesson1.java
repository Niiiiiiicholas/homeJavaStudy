package ru.newStudy.homeJava.Collections.ArraysAndCollections1;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан.";
        String[] mass = text.split(" ");
        String temp;
        int masLen = mass.length;
        for (int i = 0; i < masLen/2; i++) {
            temp = mass[masLen-i-1];
            mass[masLen-i-1] = mass[i];
            mass[i] = temp;
        }
        System.out.println(Arrays.toString(mass));
    }
}
