package ru.newStudy.homeJava.StringNumbersDates.StringNumbersDatesLesson3;

public class additionalLesson {
    public static void main(String[] args) {
        System.out.println(searchAndReplaceDiamonds("Номер кредитной карты <4008 1234 5678> 8912", "****"));
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        String str = text.replaceAll("\\<[^<]*[0-9]*[>$]", placeholder);

        return str;
    }
}