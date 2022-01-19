package ru.newStudy.homeJava.Exceptions.exceptionAndDebugLesson2;

public class AuthException extends Exception{
    public AuthException() {
    }

    public AuthException(String message) {
        super(message);
    }
}
