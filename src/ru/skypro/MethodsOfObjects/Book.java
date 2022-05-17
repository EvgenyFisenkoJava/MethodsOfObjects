package ru.skypro.MethodsOfObjects;

import java.util.Objects;

public class Book {
    private Author author;
    private String title;
    private int publishYear;

    public Book(Author author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public Author getAuthorName() {
        return this.author;
    }
    public String getTitle() {
        return this.title;
    }
    public int getPublishYear(){
        return this.publishYear;
    }
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    @Override
    public String toString () {

        return "Автор книги: "+this.author+". "+"Название книги: " + this.title+". "+
                "Год издания книги: " + this.publishYear+".";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return publishYear == book.publishYear && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishYear);
    }
}
