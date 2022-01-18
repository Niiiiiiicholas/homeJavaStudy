package ru.newStudy.homeJava.ClassStudy.Lesson5;

public class Loader {
    public static void main(String[] args) {
        getKitten();
        getKitten();
        getKitten();
    }
    private static Cat getKitten(){
        return new Cat(1100.0);
    }

}
