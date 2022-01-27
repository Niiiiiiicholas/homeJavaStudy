package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson4;

public class Treadmill implements Barriers {
    public final String nameBarrier = "Беговая дорожка";
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }
    @Override
    public int getHeight() {
        return 0;
    }
    @Override
    public int getLength() {
        return length;
    }
    @Override
    public String nameBarrier() {
        return nameBarrier;
    }
}
