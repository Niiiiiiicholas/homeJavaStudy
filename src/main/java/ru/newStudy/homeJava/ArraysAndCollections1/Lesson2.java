package ru.newStudy.homeJava.ArraysAndCollections1;

public class Lesson2 {
    public static final int ALL_PATIENTS = 12;
    public static final float MIN_TEMP = 32.0f;
    public static final float MAX_TEMP = 40.0f;
    public static final float HEALTH_MIN_TEMP = 36.2f;
    public static final float HEALTH_MAX_TEMP = 36.9f;
    public static int countPat = 0;
    public static float srSum = 0;

    public static void main(String[] args) {
        float[] massTemp = {36.3f, 35.4f, 37.7f, 36.5f, 38.9f, 39.7f, 40.1f, 36.6f, 35.9f, 37.0f, 35.1f, 38.3f};
        System.out.print("Температуры пациентов: ");
        for (float t : massTemp) {
            srSum += t;
            if (t > HEALTH_MIN_TEMP && t < HEALTH_MAX_TEMP) {
                countPat++;
            }
            System.out.print(t + " ");
        }
        System.out.println();

        System.out.printf("Средняя температура: %.2f\n", srSum / ALL_PATIENTS);
        System.out.println("Количество здоровых: " + countPat);
    }
}

