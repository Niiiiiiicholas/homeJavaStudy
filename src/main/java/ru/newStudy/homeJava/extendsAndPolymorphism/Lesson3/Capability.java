package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson3;

public interface Capability {
    void hire(Employee employee);

    void hireAll(Employee employee, int countEmployee);

    void fire(int count);
}
