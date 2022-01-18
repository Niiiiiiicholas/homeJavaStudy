package ru.newStudy.homeJava.StringNumbersDates.StringNumbersDatesLesson1;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(5059191));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(12345));


    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }

        return sum;
    }
}
