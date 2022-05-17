package ru.skypro.MethodsOfObjects;

public class Main {

    public static void main(String[] args) {
        System.out.println("Книга 1:");
        Author author1 = new Author("Брюс", "Эккель");
        Book book1 = new Book(author1, "Философия Java",2015);
        System.out.println(book1);
        book1.setPublishYear(2016);
        System.out.println("Год издания книги = " + book1.getPublishYear());
        System.out.println("Книга 2:");
        Author author2 = new Author("Роберт", "Сэджвик");
        Book book2 = new Book(author2, "Алгоритмы на Java", 2018);
        System.out.println(book2);
        System.out.println(book2.equals(book1));
        System.out.println(author2.equals(author2));



    }
}
