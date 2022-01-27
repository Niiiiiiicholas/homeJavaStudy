package ru.newStudy.homeJava.Stream.Lesson3;

import java.io.LineNumberReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Start {
    public static void main(String[] args) {
    Library library = new Library(); //Создание библиотеки

    //Получить список всех книг библиотеки, отсортированных по году издания.
    List<Book> bookList = booksSortingByYears(library);
    bookList.forEach(System.out::println);

    //Требуется создать список рассылки....
    List<String> readerList = readersList(library);
    readerList.forEach(System.out::println);

    //Снова нужно получить список рассылки....
    List<String> readersListTrue = readersListTrue(library);
    readersListTrue.forEach(System.out::println);

    //Получить список всех книг, взятых читателями....
    List<Book> takenBooksList = takenBooksList(library);
    takenBooksList.forEach(s -> System.out.println(s.toString()));

    //Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Оруэлла
    System.out.println(scanAuthorsBooks(library, "Оруэлл"));

    //Узнать наибольшее число книг, которое сейчас на руках у читателя.
    Integer max = maxCountBook(library);
    System.out.println(max);

    //Вернёмся к нашим email-рассылкам.
    // Теперь нужно не просто отправить письма всем, кто согласился на рассылку,
    // — будем рассылать разные тексты двум группам:
    Map<String, List<String>> list = okAndToMuch(library);
    for (Map.Entry<String, List<String>> listMap : list.entrySet()) {
        System.out.println(listMap.getKey() + " --- " + listMap.getValue());
        }

    }
    //#1
    public static List<Book> booksSortingByYears(Library library){
        return library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .collect(Collectors.toList());
    }
    //#2
    public static List<String> readersList(Library library){
        return library.getReaders().stream()
                .map(Reader::getEmail)
                .collect(Collectors.toList());
    }
    //#3
    public static List<String> readersListTrue(Library library){
        return library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .filter(e -> e.getBooks().size() > 1)
                .map(Reader::getEmail)
                .collect(Collectors.toList());
    }
    //#4
    public static List<Book> takenBooksList(Library library){
        return library.getReaders().stream()
                .flatMap(s -> s.getBooks().stream())
                .distinct()
                .collect(Collectors.toList());
    }
    //#5
    public static boolean scanAuthorsBooks(Library library, String s){
        return library.getReaders().stream()
                .anyMatch(e -> e.getBooks().stream()
                        .anyMatch(t -> t.getAuthor().equals(s)));
    }
    public static Integer maxCountBook(Library library){
        return library.getReaders().stream()
                .map(s -> s.getBooks().size())
                .max(Integer::compare)
                .get();
    }
    public static Map<String, List<String>> okAndToMuch(Library library){
        Map<String, List<String>> map = new HashMap<>();

        List<String> OK = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .filter(m -> m.getBooks().size() < 2)
                .map(Reader::getEmail).collect(Collectors.toList());
        List<String> TO_MUCH = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .filter(m -> m.getBooks().size() >= 2)
                .map(Reader::getEmail)
                .collect(Collectors.toList());

        map.put("TO_MUCH", TO_MUCH);
        map.put("OK", OK);

        return map;
    }
}
