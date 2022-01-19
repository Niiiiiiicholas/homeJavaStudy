package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson5;

public class legalEntity extends Client {
    private final double COMMISSION = 0.01;


    public void info() {
        System.out.println(
                "О счете ⟱ \n" +
                        "Тип счета :    < Счет юридического лица >\n" +
                        "Обслуживание : < Без абоненской платы >\n" +
                        "Пополнение :   < Без комиссии >\n" +
                        "Снятие :       < Комиссия 1% >\n");
        System.out.printf("Текущий баланс: %.2f\n", balanceAccount());
    }

    @Override
    public void withdrawMoney(double sum) {
        if ((getAmount() - sum) < MIN_BALANCE) {
            System.out.println("Вы ввели сумму превышающий остаток!");
        } else {
            double com = getAmount() - (sum + (sum * COMMISSION));
            setAmount(com);
            System.out.println("Комиссия за перевод составит: " + (sum * COMMISSION) + " руб.");
        }
    }
}

