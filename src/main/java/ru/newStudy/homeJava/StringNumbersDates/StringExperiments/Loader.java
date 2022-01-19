package ru.newStudy.homeJava.StringNumbersDates.StringExperiments;

import java.util.Arrays;

public class Loader {
    public static void main(String[] args) throws NumberFormatException {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);

        //Способ 1
//        int vasy = Integer.parseInt(text.substring(text.indexOf('л') + 1, text.indexOf("рублей")).trim());
//        int petya = Integer.parseInt(text.substring(text.indexOf("-") + 1, text.indexOf("рубля")).trim());
//        int masha = Integer.parseInt(text.substring(text.lastIndexOf('-') + 1, text.lastIndexOf("руб")).trim());
//        System.out.println(vasy + petya + masha);

        //Способ 2
//        int vas = Integer.parseInt(text.substring(15, 19));
//        int pet = Integer.parseInt(text.substring(35, 39));
//        int masha = Integer.parseInt(text.substring(56, 61));
//        System.out.println("substringMethod " + (vas + pet + masha));

        //Способ 3
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