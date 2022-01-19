package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2;

import ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2.interfaces.printWoman;

public class Skirt extends Clothes implements printWoman {

    private String clothesName = "Юбка";

    public Skirt(Size size, int price, Color color) {
        super(size, price, color);
    }

    public String getClothesName() {
        return clothesName;
    }

    @Override
    public void printWoman() {
        System.out.print("\nЖенская " + getClothesName() + ": " +
                getSize().getDescription() +
                ", цена " + getPrice() + ", цвет " + getColor().getColor());
    }
}

