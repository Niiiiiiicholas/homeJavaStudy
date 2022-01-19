package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson4;

public class Wall implements Barriers {
    public final String nameBarrier = "Стена";
    private int height;


    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public String nameBarrier() {
        return nameBarrier;
    }
}

