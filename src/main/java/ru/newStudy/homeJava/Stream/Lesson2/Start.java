package ru.newStudy.homeJava.Stream.Lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Start {
    public static Random random = new Random();
    public static Person.Sex[] sexes = {Person.Sex.MAN, Person.Sex.WOMAN};

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            people.add(generatePerson());
        }
        //Проверка всего списка
        people.stream().forEach(s -> System.out.println(s.toString()));
        System.out.println();

        long count = people.stream().count();
        System.out.println("Кол-во людей: " + count);

        long countMan = people.stream().filter(s -> s.getSex().equals(Person.Sex.MAN)).count();
        System.out.println("Мужчин в списке: " + countMan);

        long countGirl = people.stream().filter(s -> s.getSex().equals(Person.Sex.WOMAN) && s.getAge() < 18).count();
        System.out.println("Женщин несовершеннолетних: " + countGirl);

        long retiredPeople = people.stream().
                filter(person -> person.getSex().equals(Person.Sex.MAN) && person.getAge() > 65 ||
                        person.getSex().equals(Person.Sex.WOMAN) && person.getAge() > 60).count();
        System.out.println("Мужчик и женщин пенсионного возраста: " + retiredPeople);


    }

    public static Person generateManPerson() {
        String[] listMaleName = {"Иван", "Данила", "Сергей", "Руслан", "Леша", "Олег",
                "Вадим", "Федя", "Максим", "Игнат", "Самвел", "Лев", "Егор", "Глеб", "Никита"};

        String[] listMaleSurname = {"Егоров", "Лысов", "Иванов", "Петров", "Сидоров", "Моисеев",
                "Баласян", "Егин", "Журавлев", "Кулаков", "Ачкасов", "Высоколян", "Дё", "Сурнев", "Цунаев"};

        String name = listMaleName[random.nextInt(listMaleName.length)];
        String surname = listMaleSurname[random.nextInt(listMaleSurname.length)];
        int age = (int) (Math.random() * ((90 - 3) + 1)) + 3;
        Person.Sex sex = Person.Sex.MAN;
        return new Person(name, surname, sex, age);

    }

    public static Person generateWomanPerson() {

        String[] listFemaleName = {"Ира", "Марина", "Яна", "Наталья",
                "Ольга", "Татьяна", "Даша", "Ульяна", "Света", "Мия", "Варвара", "Вера", "Женя", "Лена", "Эмилия"};

        String[] listFemaleSurname = {"Егорова", "Лысова", "Иванова", "Петрова", "Сидорова", "Моисеева",
                "Баласяна", "Егина", "Журавлева", "Кулакова", "Ачкасова", "Высоколян", "Дё", "Сурнева", "Цунаева"};

        String name = listFemaleName[random.nextInt(listFemaleName.length)];
        String surname = listFemaleSurname[random.nextInt(listFemaleSurname.length)];
        int age = (int) (Math.random() * ((90 - 3) + 1)) + 3;
        Person.Sex sex = Person.Sex.WOMAN;
        return new Person(name, surname, sex, age);
    }

    public static Person generatePerson() {
        Person.Sex sex = sexes[random.nextInt(sexes.length)];
        if (sex.getS().equals("Мужской")) return generateManPerson();
        return generateWomanPerson();
    }
}
