package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson3;

import java.util.List;

public class Start {
    public static void main(String[] args) {
        Company apple = new Company();
        apple.hireAll(new Operator(), 180);
        apple.hireAll(new Manager(), 80);
        apple.hireAll(new TopManager(), 10);
        System.out.println("1 Печать топ высоких зп: ");
        printSalary(apple.getTopSalaryStaff(15));
        System.out.println("1 Печать топ низких зп: ");
        printSalary(apple.getLowestSalaryStaff(30));
        apple.fire(apple.getAllEmployees().size() / 2);
        System.out.println("2 Печать топ высоких зп: ");
        printSalary(apple.getTopSalaryStaff(15));
        System.out.println("2 Печать топ низких зп: ");
        printSalary(apple.getLowestSalaryStaff(30));
    }

    //Вывод списка
    public static void printSalary(List<Employee> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("● " + arrayList.get(i).getSalary() + " .руб");
        }
    }
}
