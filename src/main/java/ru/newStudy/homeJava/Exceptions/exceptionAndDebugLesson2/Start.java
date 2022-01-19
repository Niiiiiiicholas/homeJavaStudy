package ru.newStudy.homeJava.Exceptions.exceptionAndDebugLesson2;

public class Start {
    private static final String PATTERN_LOGIN_PASSWORD = "^[a-zA-Z0-9_]{3,20}$";

    public static void main(String[] args) throws AuthException{
        System.out.println(authentication("asdfdsfsd_asda213as", "qwq", "qwq"));
    }

    public static boolean authentication(String login, String password, String confirmPassword) throws AuthException {
        if(!login.matches(PATTERN_LOGIN_PASSWORD)) throw new AuthException("не верно введен логин");
        if(!password.matches(PATTERN_LOGIN_PASSWORD)) throw new AuthException("не верно введен пароль");
        return password.matches(confirmPassword);
    }
}