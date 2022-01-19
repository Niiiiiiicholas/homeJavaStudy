package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson5;

public class Individual extends Client {

    public void info() {
        System.out.println(
                "О счете ⟱ \n" +
                        "Тип счета :    < Счет физического лица >\n" +
                        "Обслуживание : < Без абоненской платы >\n" +
                        "Пополнение :   < Без комиссии >\n" +
                        "Снятие :       < Без комиссии >\n");
        System.out.printf("Текущий баланс: %.2f\n", balanceAccount());
    }

}

