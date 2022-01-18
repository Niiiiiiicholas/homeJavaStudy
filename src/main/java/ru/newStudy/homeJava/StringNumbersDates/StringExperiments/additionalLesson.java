package ru.newStudy.homeJava.StringNumbersDates.StringExperiments;

public class additionalLesson {
    public static void main(String[] args) {
        System.out.println(searchAndReplaceDiamonds("Номер кредитной карты <4008 1234 5678> 8912", "***"));
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {

        String str1 = text.substring(text.indexOf('<'), text.indexOf('>') + 1);
        String str = text.replaceAll(str1, placeholder);

        return str;
    }
}
