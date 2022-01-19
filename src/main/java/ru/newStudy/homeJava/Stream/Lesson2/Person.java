package ru.newStudy.homeJava.Stream.Lesson2;

public class Person {
    private String name;
    private String surname;
    private Sex sex;
    private int age;

    public Person(String name, String surname, Sex sex, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public enum Sex {
        MAN("Мужской"), WOMAN("Женский");
        private String s;

        Sex(String s) {
            this.s = s;
        }

        public String getS() {
            return s;
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + " Пол " + sex.s + " Возраст " + age;
    }
}
