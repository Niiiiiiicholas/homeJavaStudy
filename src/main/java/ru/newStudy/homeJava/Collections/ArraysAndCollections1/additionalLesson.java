package ru.newStudy.homeJava.Collections.ArraysAndCollections1;

public class additionalLesson {
    public static void main(String[] args) {
        String[][] mass = new String[7][7];
        for(int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++) {
                if (j == i || j == mass.length - 1 - i){
                    mass[i][j] ="x";
                } else mass[i][j] =" ";
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }
    }
}
