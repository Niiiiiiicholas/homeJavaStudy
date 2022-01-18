package ru.newStudy.homeJava.StringNumbersDates.StringNumbersDatesLesson3;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);

        String part = text.replaceAll("[^-0-9]", "");
        String[] num = part.split("-");
        System.out.println(Arrays.toString(num));
        int sum = 0;
        for (String n : num) {
            int numbers = Integer.parseInt(n);
            sum += numbers;
        }
        System.out.println(sum);
    }
}
