package ru.newStudy.homeJava.StringNumbersDates.StringNumbersDatesLesson3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson3 {
    public static int countString =0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите ФИО: ");
        String str = scanner.nextLine();
        Pattern p = Pattern.compile("([А-Яа-я])+([А-Яа-я])+([А-Яа-я])");

        Matcher m = p.matcher(str);
        while (m.find()){
            if (countString==0){
                System.out.println("Фамилия :"+m.group());
                countString++;
            }else if(countString==1) {
                System.out.println("Имя :"+m.group());
                countString++;
            }else if (countString==2){
                System.out.println("Отчество :"+m.group());
            }
        }
    }
}
