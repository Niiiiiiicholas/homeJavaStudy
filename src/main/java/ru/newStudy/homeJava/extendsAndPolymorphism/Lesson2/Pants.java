package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2;

import ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2.interfaces.printMen;
import ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2.interfaces.printWoman;

public class Pants extends Clothes implements printWoman, printMen {

    private String clothesName = "Брюки";

    public Pants(Size size, int price, Color color) {
        super(size, price, color);
    }

    public String getClothesName() {
        return clothesName;
    }

    @Override
    public void printMen() {
        System.out.print("\nМужские " + getClothesName() + ": " +
                getSize().getDescription() +
                ", цена " + getPrice() + ", цвет " + getColor().getColor());
    }

    @Override
    public void printWoman() {
        System.out.print("\nЖенские " + getClothesName() + ": " +
                getSize().getDescription() +
                ", цена " + getPrice() + ", цвет " + getColor().getColor());
    }
}

