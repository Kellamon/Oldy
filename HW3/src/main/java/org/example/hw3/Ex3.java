package org.example.hw3;


import org.example.hw3.model.book;

import java.util.ArrayList;
import java.util.List;

import static org.example.hw3.model.isSimple.isSimplee;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
 * и год издания после 2010 г, включительно.
 */
public class Ex3 {
    public static void main(String[] args) {
        book book1 = new book("книга_1", "Кинг", 17.99, 2000, 100);
        book book2 = new book("книга_2", "Дюма", 17.99, 2010, 17);
        book book3 = new book("книга_3", "Роулинг", 17.99, 2020, 7);
        book book4 = new book("книга_4", "Алексеев", 17.99, 2009, 100);
        book book5 = new book("книга_5", "Антонов", 17.99, 2021, 17);

        List<book> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);

        System.out.println(findSpecialBooks(booksList, 2010, "А"));
    }

    /**
     * Модуль поиска книги по параметрам (+ простое количество страниц)
     *
     * @param inputList      - список всех книг
     * @param year           - минимальный год издания
     * @param include - символы, содержащиеся в фамилии автора
     * @return - список книг, удовлетворяющих условиям
     */
    private static List<String> findSpecialBooks(List<book> inputList, int year, String include) {
        List<String> result = new ArrayList<>();
        for (book el : inputList) {
            if (el.getYear() >= year && isSimplee(el.getPages()) &&
                    el.getAuthor().toLowerCase().contains(include.toLowerCase())) {
                result.add(el.getName());
            }
        }
        return result;
    }


}