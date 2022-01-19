package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson1;

import java.util.Date;

public class BankAccount {
    public double amount;
    private final double MIN_BALANCE = 0;
    private Date date;

    public BankAccount() {
        amount = MIN_BALANCE;
    }

    public Date getDate() {
        return date;
    }

    public double getMIN_BALANCE() {
        return MIN_BALANCE;
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

    //Внести на счет деньги
    public void putMoney(double sum) {
        date = new Date();
        amount += sum;
        System.out.printf("Пополнение счета прошло успешно, на сумму: %.2f руб.\n", amount);
    }

    //Получить остаток на счете
    public void balanceAccount() {
        System.out.printf("Ваш остаток по счету: %.2f руб.\n", amount);
    }

    //Перевод со счета на счет
    public boolean send(BankAccount receiver, double amount) {
        long time = System.currentTimeMillis();
        if (this.amount < amount) {
            return false;
        } else {
            this.withdrawMoney(amount);
            receiver.putMoney(amount);
            return true;
        }
    }
}

