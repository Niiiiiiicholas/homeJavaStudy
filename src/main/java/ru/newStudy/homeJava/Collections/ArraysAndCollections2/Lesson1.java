package ru.newStudy.homeJava.Collections.ArraysAndCollections2;

import java.util.ArrayList;

public class Lesson1 {
    public static ArrayList<String> note = new ArrayList<>();

    public static void main(String[] args) {
        note.add("Поспать");
        note.add("Умыться");
        note.add("Позавтракать");
        note.add("Сходить в магазин");
        note.add("Приготовить покушать");
        note.add("Посмотреть телевизор");
        note.add("Сходить погулять");
        note.add("Убраться в квартире");
        note.add("Погладить вещи");

        if (args.length < 1) {
            System.out.println("Введите комманду!");
        } else if (args[0].equals("LIST")) {
            for (int i = 0; i < note.size(); i++) {
                System.out.println("# " + i + " " + note.get(i));
            }
        } else if (args[0].equals("ADD")) {
            if (!intTrueFalse(args[1])) {
                note.add(args[1]);
                printNote();
                //System.out.println(note.get(note.size() - 1) + " <----Элемент до " + note.get(note.size() - 2));
            } else {
                note.add(Integer.parseInt(args[1]), args[2]);
                printNote();
            }
        } else if (args[0].equals("EDIT")) {
            note.set(Integer.parseInt(args[1]), args[2]);
            printNote();
        } else if (args[0].equals("DELETE")) {
            note.remove(note.get(Integer.parseInt(args[1])));
            printNote();
        }
    }

    public static boolean intTrueFalse(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void printNote() {
        System.out.println("Печать всего NOTE: ");
        for (String s : note) {
            System.out.println(s);
        }
    }
}
