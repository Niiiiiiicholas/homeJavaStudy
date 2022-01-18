package ru.newStudy.homeJava.StringNumbersDates.StringExperiments;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите ФИО: ");
        String str = scanner.nextLine();
        String[] people = str.split(" ");

        System.out.println("Фамилия: " + people[0]);
        System.out.println("Имя: " + people[1]);
        System.out.println("Отчество: " + people[2]);


    }

}