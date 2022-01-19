package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson5;

public class Start {
    public static void main(String[] args) {
        //Проверка физического лица
        Individual individual = new Individual();
        individual.info();
        individual.putMoney(2500);
        individual.withdrawMoney(1200);

        //Проверка юридического лица
        legalEntity legalEntity = new legalEntity();
        legalEntity.info();
        legalEntity.putMoney(5000);
        legalEntity.withdrawMoney(1000);
        System.out.printf("Текущий баланс: %.2f\n", legalEntity.balanceAccount());

        //Проверка ИП
        individualEntrepreneur individualEntrepreneur = new individualEntrepreneur();
        individualEntrepreneur.info();
        individualEntrepreneur.putMoney(1000);
        System.out.printf("Текущий баланс: %.2f\n", individualEntrepreneur.balanceAccount());
    }
}
