package ru.newStudy.homeJava.ClassStudy.Lesson3;

public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();

        System.out.println(Cat.getCount());

        for (int i=0;i<10;i++){
            cat.feed(1000.0);
        }
        System.out.println(Cat.getCount());

        cat.meow();
        cat.pee();
    }
}
