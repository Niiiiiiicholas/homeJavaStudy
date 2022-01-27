package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2;

public abstract class Clothes {
    private Size size;
    private int price;
    private Color color;

    public Clothes(Size size, int price, Color color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public Size getSize() {
        return size;
    }
    public int getPrice() {
        return price;
    }
    public Color getColor() {
        return color;
    }
}
