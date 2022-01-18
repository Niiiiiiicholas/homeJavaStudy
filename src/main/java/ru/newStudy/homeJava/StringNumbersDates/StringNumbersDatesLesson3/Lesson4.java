package ru.newStudy.homeJava.StringNumbersDates.StringNumbersDatesLesson3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите телефон: ");
        String phoneNumber = scanner.nextLine();
        Pattern p = Pattern.compile("^\\+?[78][-\\(]?\\d{3}\\)?-?\\d{3}-?\\d{2}-?\\d{2}$");
        Matcher m = p.matcher(phoneNumber);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}