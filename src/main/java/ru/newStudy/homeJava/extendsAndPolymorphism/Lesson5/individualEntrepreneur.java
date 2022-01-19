package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson5;

public class individualEntrepreneur extends Client {
    public final double COMMISSION_ONE = 0.01;
    public final double COMMISSION_TWO = 0.005;
    public final double MIN_AMOUNT = 1000;


    //Инфо о счете
    public void info() {
        System.out.println(
                "О счете ⟱ \n" +
                        "Тип счета :    < Счет индивидуального предпринимателя >\n" +
                        "Обслуживание : < Без абоненской платы >\n" +
                        "Пополнение :   < 1% <1000 руб. или 0.5% >=1000 руб. >\n" +
                        "Снятие :       < Без комиссии >\n");
        System.out.printf("Текущий баланс: %.2f\n", balanceAccount());
    }

    @Override
    public void putMoney(double sum) {
        double com1 = sum * COMMISSION_ONE;
        double com2 = sum * COMMISSION_TWO;
        if (sum < MIN_AMOUNT) {
            setAmount(sum -= (com1));
            System.out.format("Деньги зачислены на счет!\nКомиссия за зачисление денег составляет: %.1f \n", com1);
        } else if (sum >= MIN_AMOUNT) {
            setAmount(sum -= (com2));
            System.out.format("Деньги зачислены на счет!\nКомиссия за зачисление денег составляет: %.1f \n", com2);
        }
    }
}

