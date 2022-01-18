package ru.newStudy.homeJava.ClassStudy.Lesson1;

public class Loader {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());
        System.out.println(cat3.getWeight());
        System.out.println(cat4.getWeight());
        System.out.println(cat5.getWeight());
        cat1.feed(12.4);
        cat2.feed(10.2);
        System.out.println();
        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());

        while (!cat1.getStatus().equals("Exploded")) {
            cat1.feed(113.1);
        }
        System.out.println(cat1.getStatus());
        System.out.println(cat1.getWeight());

        while (!cat1.getStatus().equals("Dead")) {
            cat1.meow();
        }

        System.out.println(cat1.getStatus());


    }
}