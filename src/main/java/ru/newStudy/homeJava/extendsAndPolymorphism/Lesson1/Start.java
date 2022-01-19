package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson1;

public class Start {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.putMoney(1500);
        DepositAccount depositAccount = new DepositAccount();

        System.out.println(bankAccount1.send(depositAccount, 1500));
        bankAccount1.balanceAccount();

        //Проверка работы метода перевода денег
        BankAccount bankAccount = new BankAccount();
        bankAccount.putMoney(2500);
        bankAccount.balanceAccount();

        CardAccount cardAccount = new CardAccount();
        cardAccount.balanceAccount();


        System.out.println(bankAccount.send(cardAccount, 2500));

        bankAccount.balanceAccount();
        cardAccount.balanceAccount();
    }
}
