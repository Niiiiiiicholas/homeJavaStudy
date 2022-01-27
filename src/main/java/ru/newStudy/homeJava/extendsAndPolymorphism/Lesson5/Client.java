package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson5;

public abstract class Client {
    private double amount;
    public final double MIN_BALANCE = 0;

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    //Внести на счет деньги
    public void putMoney(double sum) {
        amount += sum;
        System.out.printf("Пополнение счета прошло успешно, на сумму: %.2f руб.\n", amount);
    }
    //Снять со счет деньги
    public void withdrawMoney(double sum) {
        if ((amount - sum) < MIN_BALANCE) {
            System.out.println("Вы ввели сумму превышающий остаток!");
        } else {
            amount -= sum;
            System.out.printf("Вы сняли со счета: %.2f руб.\n", sum);
        }
    }
    //Получить остаток на счете
    public double balanceAccount() {
        return amount;
    }
}
