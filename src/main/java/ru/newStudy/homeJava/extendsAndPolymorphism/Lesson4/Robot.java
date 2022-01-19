package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson4;

public class Robot implements Actions {
    private String name;
    private int jumpHeight;
    private int runLength;

    public Robot(String name, int jumpHeight, int runLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int jumpHeight() {
        return jumpHeight;
    }

    @Override
    public int runLength() {
        return runLength;
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }
}

