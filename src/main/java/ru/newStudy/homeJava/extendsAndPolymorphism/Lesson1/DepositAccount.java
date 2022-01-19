package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson1;

public class DepositAccount extends BankAccount {

    public DepositAccount() {
        amount = getMIN_BALANCE();
    }

    //Снять денег с депозитного счета
    @Override
    public void withdrawMoney(double sum) {
        long time = System.currentTimeMillis();
        if (((time - getDate().getTime()) / (24 * 60 * 60 * 1000)) < 31) {
            System.out.println("Нельзя снять деньги депозитного счета раньше 31 дней после размещения");
        } else {
            super.withdrawMoney(sum);
        }
    }
}
