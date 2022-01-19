package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson3;

public class TopManager extends Employee {

    private static final double FIX_SALARY = 150000;
    private static final double FIX_INCOME = 10000000;
    private static final double PREMIUM_RATIO = 1.5;


    public TopManager() {
        setSalary(getMonthSalary());
    }

    //Генератор дохода менеджера
    public double getMonthSalary() {
        if (getCompany().getIncome() > FIX_INCOME) {
            return FIX_SALARY * PREMIUM_RATIO;
        } else return FIX_SALARY;
    }
}
