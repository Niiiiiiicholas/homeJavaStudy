package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson1;

public class CardAccount extends BankAccount {
    private final double COMMISSION = 0.01;

    public CardAccount() {
        amount = getMIN_BALANCE();
    }

    public void withdrawMoney(double sum) {
        if ((amount - sum) < getMIN_BALANCE()) {
            System.out.println("Вы ввели сумму превышающий остаток!");
        } else {
            double comm = sum * COMMISSION;
            amount -= (sum + comm);
            System.out.printf("Вы сняли со счета: %.2f руб.\n", sum);
        }
    }
}
