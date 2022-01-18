package ru.newStudy.homeJava.ClassStudy.Lesson6;

public class Loader {
    public static void main(String[] args) {
        getKitten().setColor(Color.BLACK);
    }
    private static Cat getKitten(){
        return new Cat(1100.0);
    }
}
