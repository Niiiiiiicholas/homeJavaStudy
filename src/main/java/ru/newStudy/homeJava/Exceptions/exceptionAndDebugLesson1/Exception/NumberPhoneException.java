package ru.newStudy.homeJava.Exceptions.exceptionAndDebugLesson1.Exception;

public class NumberPhoneException extends Exception{
    public NumberPhoneException() {
        System.out.println("Неверный формат ввода телефона, попробуйте в таком формате: +7 ХХХ ХХХ ХХ ХХ");
    }
}
