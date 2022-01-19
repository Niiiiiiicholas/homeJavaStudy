package ru.newStudy.homeJava.Exceptions.exceptionAndDebugLesson1.Exception;

public class AddException extends Exception {
    public AddException() {
        System.out.println("Неверный формат ввода покупателя, нужно по шаблону:\n" +
                "add ИМЯ ФАМИЛИЯ ПОЧТА ТЕЛЕНФОН");
    }
}