package ru.newStudy.homeJava.Collections.ArraysAndCollections5;

import java.util.*;

public class Lesson1 {
    public static ArrayList<String> arrayListNum = new ArrayList<>();
    public static HashSet<String> hashSetNum = new HashSet<>();
    public static TreeSet<String> treeSetNum = new TreeSet<>();
    public static char[] alphabetAutoNum  = {'А','В','Е','К','М','Н','О','Р','С','Т','У','Х'};

    public static void main(String[] args) {
        generationNumber();

        for(String c:hashSetNum){
            System.out.println(c);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер: ");
        String str = scanner.nextLine();
        long start1Time = System.nanoTime();
        if(arrayListNum.contains(str)){
            System.out.println("Поиск перебором: номер найден, поиск занял: " + (System.nanoTime() - start1Time) + "нс");
        }else {
            System.out.println("Поиск перебором: номер не найден, поиск занял: " + (System.nanoTime() - start1Time) + "нс");
        }
        long start2Time = System.nanoTime();
        if (Collections.binarySearch(arrayListNum, str) == 0) {
            System.out.println("Бинарный поиск: номер найден, поиск занял: " + (System.nanoTime() - start2Time) + "нс");
        } else {
            System.out.println("Бинарный поиск: номер не найден, поиск занял: " + (System.nanoTime() - start2Time) + "нс");
        }
        long start3Time = System.nanoTime();
        if (hashSetNum.contains(str)) {
            System.out.println("Поиск в HashSet: номер найден, поиск занял: " + (System.nanoTime() - start3Time) + "нс");
        } else {
            System.out.println("Поиск в HashSet: номер не найден, поиск занял: " + (System.nanoTime() - start3Time) + "нс");
        }
        long start4Time = System.nanoTime();
        if (treeSetNum.contains(str)) {
            System.out.println("Поиск в TreeSet: номер найден, поиск занял: " + (System.nanoTime() - start4Time) + "нс");
        } else {
            System.out.println("Поиск в TreeSet: номер не найден, поиск занял: " + (System.nanoTime() - start4Time) + "нс");
        }



    }
    public static void generationNumber(){
        for(int i = 111; i <= 999; i += 111) {
            for (Character sym1 : alphabetAutoNum) {
                for (Character sym2 : alphabetAutoNum) {
                    for (Character sym3 : alphabetAutoNum) {
                        for (int region = 1; region <= 199; region++) {
                            String num = String.format("%s%03d%s%s%d", sym1, i, sym2, sym3, region);
                            arrayListNum.add(num);
                            hashSetNum.add(num);
                            treeSetNum.add(num);
                        }
                    }
                }
            }
        }
    }
}
