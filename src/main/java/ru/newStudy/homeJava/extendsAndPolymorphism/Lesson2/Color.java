package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2;

public enum Color {
    BLACK("Черный"),WHITE("Белый"),RED("Красный"),BLUE("Синий");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

