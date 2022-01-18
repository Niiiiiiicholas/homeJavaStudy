package ru.newStudy.homeJava.ClassStudy.Lesson7;

public class Loader {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat(1100.0);
        Cat cat1 = new Cat(cat);
    }
    private static Cat getKitten(){
        return new Cat(1100.0);
    }

}
