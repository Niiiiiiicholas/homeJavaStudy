package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson3;

public class Manager extends Employee {

    private static final double FIX_SALARY = 70000;
    private static final double PREMIUM_RATIO = 0.05;

    public Manager() {
        setSalary(getMonthSalary());
        getCompany().setIncome(getCompany().getIncome() + genSalaryCompany());
    }
    //Генератор дохода компании
    public double genSalaryCompany() {
        return (Math.random() * ((140000 - 115000) + 1)) + 115000;
    }
    //Генератор дохода менеджера
    public double getMonthSalary() {
        return FIX_SALARY + (genSalaryCompany() * PREMIUM_RATIO);
    }
}

