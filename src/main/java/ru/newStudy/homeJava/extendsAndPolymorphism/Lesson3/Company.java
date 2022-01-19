package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company implements Capability {
    private static double income; //доход компании
    private List<Employee> allEmployees = new ArrayList<>(); //список сотрудников

    public void setIncome(double income) {
        Company.income = income;
    }

    //получение значения дохода компании
    public double getIncome() {
        return income;
    }

    //Возврат списка
    public List<Employee> getAllEmployees() {
        return allEmployees;
    }

    //найм одного сотрудника
    @Override
    public void hire(Employee employee) {
        allEmployees.add(employee);
    }

    //найм списка сотрудников
    @Override
    public void hireAll(Employee employee, int countEmployee) {
        if (employee instanceof Manager) {
            for (int i = 0; i < countEmployee; i++) {
                allEmployees.add(i, new Manager());
            }
        } else if (employee instanceof Operator) {
            for (int i = 0; i < countEmployee; i++) {
                allEmployees.add(i, new Operator());
            }
        } else if (employee instanceof TopManager) {
            for (int i = 0; i < countEmployee; i++) {
                allEmployees.add(i, new TopManager());
            }
        }
    }

    //увольнение сотрудника
    @Override
    public void fire(int count) {
        for (int i = 0; i < count; i++) {
            allEmployees.remove(i);
        }
    }


    //Сортировка зарлаты по возратанию
    List<Employee> getTopSalaryStaff(int count) {
        List<Employee> employees2 = new ArrayList<>();
        Collections.sort(allEmployees);
        Collections.reverse(allEmployees);
        for (int i = 0; i < count; i++) {
            employees2.add(allEmployees.get(i));
        }
        return employees2;
    }

    //Сортировка зарплаты по убыванию
    List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> employees2 = new ArrayList<>();
        Collections.sort(allEmployees);
        for (int i = 0; i < count; i++) {
            employees2.add(allEmployees.get(i));
        }
        return employees2;
    }
}
