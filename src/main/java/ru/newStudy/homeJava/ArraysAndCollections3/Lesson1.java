package ru.newStudy.homeJava.ArraysAndCollections3;

import java.util.TreeSet;

public class Lesson1 {
    public  static TreeSet<String> email = new TreeSet<>();
    public static final String PATTERN_EMAIL = "^[A-Za-z0-9._%+-]+@[A-Z0-9a-z.-]+\\.[A-Za-z]{2,6}$";

    public static void main(String[] args) {
        if(args[0].equals("LIST")){
            for(String e:email){
                System.out.println(e);
            }
        }
        else if(args[0].equals("ADD")){
            if(args[1].matches(PATTERN_EMAIL)){
                email.add(args[1]);
                for(String e:email){
                    System.out.println(e+" ");
                }
            }else {
                System.out.println("Неверный формат!!!");
            }
        }
    }
}
