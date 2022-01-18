package ru.newStudy.homeJava.ClassStudy.Lesson2;

public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.feed(150.0);
        cat.pee();

        System.out.println(cat.getSumFeed());

    }
}