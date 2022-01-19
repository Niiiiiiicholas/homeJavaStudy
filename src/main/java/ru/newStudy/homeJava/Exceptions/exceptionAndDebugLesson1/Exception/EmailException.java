package ru.newStudy.homeJava.Exceptions.exceptionAndDebugLesson1.Exception;

public class EmailException extends Throwable {
    public EmailException() {
        System.out.println("Неверный формат ввода ПОЧТЫ, попробуйте в таком формате: 123ABCD@MAIL.RU");
    }
}
