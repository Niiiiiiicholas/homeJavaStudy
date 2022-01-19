package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2;

public class Start {
    public static void main(String[] args) {
        Clothes[] arr = {
                new Tshirt(Size.S, 100, Color.BLACK),
                new Pants(Size.L, 50, Color.BLACK),
                new Tie(Size.M, 1000, Color.RED),
                new Skirt(Size.XXS, 20, Color.WHITE),
        };
        Studio s = new Studio();
        s.dressMan(arr);
        s.dressWoman(arr);


    }
}
