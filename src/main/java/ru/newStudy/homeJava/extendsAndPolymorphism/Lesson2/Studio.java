package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2;

import ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2.interfaces.menСlothing;
import ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2.interfaces.womanClothing;

public class Studio implements womanClothing, menСlothing {
    @Override
    public void dressMan(Clothes[] arr) {
        for (Clothes clothes : arr) {
            if (clothes instanceof Tshirt) {
                ((Tshirt) clothes).printMen();
            } else if (clothes instanceof Pants) {
                ((Pants) clothes).printMen();
            } else if (clothes instanceof Tie) {
                ((Tie) clothes).printMen();
            }
        }
    }

    @Override
    public void dressWoman(Clothes[] arr) {
        for (Clothes clothes : arr) {
            if (clothes instanceof Tshirt) {
                ((Tshirt) clothes).printWoman();
            } else if (clothes instanceof Pants) {
                ((Pants) clothes).printMen();
            } else if (clothes instanceof Skirt) {
                ((Skirt) clothes).printWoman();
            }
        }

    }

}

