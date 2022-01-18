package ru.newStudy.homeJava.StringNumbersDates.StringNumbersDatesLesson2;

public class additionalLesson {
    public static int truck = 1;
    public static int container = 1;
    public static int countContainer = 1;
    public static int counterBox = 0;

    public static void main(String[] args) {
        distributionBoxes(1600);
    }

    public static void distributionBoxes(int box) {
        System.out.println("Грузовик " + truck + " :");
        System.out.println("\tКонтейнер " + container + " :");

        for (int i = 1; i <= box; i++) {
            if (counterBox == 27) {
                countContainer++;
                container++;
                counterBox = 0;
                if (container == 13) {
                    truck++;
                    System.out.println("Грузовик " + truck + " :");
                    container = 1;
                }
                System.out.println("\tКонтейнер " + container + " :");
            }

            System.out.println("\t\tЯщик " + i);
            counterBox++;
        }

        System.out.println("Необходимо:\n"
                + "грузовиков - " + truck + " шт\n"
                + "контейнеров - " + countContainer + " шт");
    }
}
