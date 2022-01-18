package ru.newStudy.homeJava.StringNumbersDates.StringNumbersDatesLesson3;

public class Lesson2 {
    public static void main(String[] args) {
        String book = "In the other direction, beyond Reg's deathly neighbour, was Watkin, the Classics Professor, a man of terrifying dryness and oddity. His heavy rimless glasses were almost solid cubes of glass within which his eyes appeared to lead independent existences like goldfish. His nose was straight enough and ordinary, but beneath it he wore the same beard as Clint Eastwood. His eyes gazed swimmingly around the table as he selected who was going to be spoken at tonight. He had thought that his prey might be one of the guests, the newly appointed Head of Radio Three, who was sitting opposite - but unfortunately he had already been ensnared by the Music Director of the college and a Professor of Philosophy. These two were busy explaining to the harassed man that the phrase 'too much Mozart' was, given any reasonable definition of those three words, an inherently self-contradictory expression, and that any sentence which contained such a phrase would be thereby rendered meaningless and could not, consequently, be advanced as part of an argument in favour of any given programme-scheduling strategy. The poor man was already beginning to grip his cutlery too tightly. His eyes darted about desperately looking for rescue, and made the mistake of lighting on those of Watkin.";

        String sing = "[,;:'?!^.]";
        String str = book.replaceAll(sing, " ");
        String[] book2 = str.split(" ");

        for (String printBook : book2) {
            if (!printBook.isEmpty()) {
                System.out.println(printBook);
            }
        }
    }
}