package ru.newStudy.homeJava.ArraysAndCollections4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson1 {
    public static Map<String, String> contacts = new HashMap<>();
    public static final String PATTERN_NUMBER = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3,4}\\)?[\\- ]?)?[\\d\\- ]{5,10}$";
    public static final String NAME = "^[a-zA-Zа-яА-Я\s]+$";
    public static int countClone = 0;

    static {
        contacts.put("+7 929 604 11 12", "Дмитрий");
        contacts.put("8 (923)-123-21-12", "Ольга");
        contacts.put("8 929 123 45 12", "Oleg");
        contacts.put("+7 923-122-23-22", "Ilya");
        contacts.put("8 926 123 23 21", "Ira");
        contacts.put("+7 (923) 222 11 11", "Ольга");
        System.out.println("Привет, это справочник, он умеет:\n"+
                "  ● Искать по номеру телефона\n"+
                "  ● Добавлять по номеру телефона\n"+
                "  ● Искать по имени\n"+
                "  ● Добавлять по имени\n"+
                "  ● Показывать весь список(команда LIST)");
    }

    public static void main(String[] args) {
        Start();
    }


    //Начало программы
    public static void Start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите Имя или Телефон для поиска или LIST: ");
        String nameOrNumber = scanner.nextLine();
        if (nameOrNumber.equals("LIST")) {
            printMap();
            Next();
        }
        else if (nameOrNumber.matches(PATTERN_NUMBER)) {
            searchNumber(nameOrNumber);
        }
        else if (nameOrNumber.matches(NAME)) {
            searchName(nameOrNumber);

        } else {
            System.out.println("Вы ввели неверно имя или телефон!");
            Next();
        }
    }

    //Продолжение выполнения
    public static void Next() {
        System.out.println("Хотите еще? напишите ДА или НЕТ ");
        Scanner scanner = new Scanner(System.in);
        String yesNot = scanner.nextLine();
        if (yesNot.equals("ДА")){ countClone=0;Start();}
        else System.out.println("ПОКА :)");

    }


    //Проверка имени
    public static boolean scanName(String s) {
        if (s.matches(NAME)) {
            return true;
        } else {
            System.out.println("Неверный формат имени: ");
            return false;
        }

    }

    //Проверка телефона
    public static boolean scanNumber(String s) {
        if (s.matches(PATTERN_NUMBER)) {
            return true;
        } else {
            System.out.println("Неверный формат телефона: ");
            return false;
        }

    }

    //Печать всей записной книги
    public static void printMap() {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Имя: " + entry.getValue() + ", " + " Номер телефона: " + entry.getKey());
        }
    }

    //Поиск по телефону
    public static void searchNumber(String number) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getKey().equals(number)) {
                countClone++;
                System.out.println(entry.getValue() + " " + entry.getKey());
            }
        }
        if (countClone == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Такого телефона нет!!!\nВведите имя для добавления нового контакта: ");
            String name = scanner.nextLine();
            if (scanName(name)) {
                contacts.put(number, name);
                printMap();
                Next();
            }
        }
        Next();
    }

    //Поиск по имени
    public static void searchName(String name) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(name)) {
                countClone++;
                System.out.println(entry.getValue() + " " + entry.getKey());
            }
        }
        if (countClone == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Такого имени нет!!!\nВведите телефон для добавления нового контакта: ");
            String number = scanner.nextLine();
            if (scanNumber(number)) {
                contacts.put(number, name);
                printMap();
                Next();
            }

        }
        Next();
    }
}
