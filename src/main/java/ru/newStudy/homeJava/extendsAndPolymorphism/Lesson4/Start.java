package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson4;

public class Start {
    public static void main(String[] args) {
        Actions[] actions = new Actions[]{new Cat("Tom", 14, 11),
                new Person("Mark", 20, 13), new Robot("Fredy", 9, 15)};

        Barriers[] barriers = new Barriers[]{new Wall(12), new Treadmill(9)};


        for (int i = 0; i < actions.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                if (barriers[j] instanceof Wall) {
                    if (actions[i].jumpHeight() > barriers[j].getHeight()) {
                        System.out.println(actions[i].getName() + " - прошел борьер " + barriers[j].nameBarrier());
                    } else {
                        System.out.println(actions[i].getName() + " - не прошел борьер " + barriers[j].nameBarrier());
                        break;
                    }
                } else {
                    if (actions[i].runLength() > barriers[j].getLength()) {
                        System.out.println(actions[i].getName() + " - прошел борьер " + barriers[j].nameBarrier());
                    } else {
                        System.out.println(actions[i].getName() + " - не прошел борьер " + barriers[j].nameBarrier());
                        break;
                    }
                }
            }
        }
    }
}
