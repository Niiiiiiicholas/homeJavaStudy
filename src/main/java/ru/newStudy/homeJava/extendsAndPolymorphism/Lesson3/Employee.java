package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson3;

public class Employee implements Comparable<Employee> {
    private double salary;
    private static final Company company = new Company();

    public Company getCompany() {
        return company;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public int compareTo(Employee o) {
        if (this.getSalary() == o.getSalary()) {
            return 0;
        } else if (this.getSalary() < o.getSalary()) {
            return -1;
        } else return 1;
    }
}

