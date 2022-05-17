package ru.skypro.MethodsOfObjects;

import java.util.Objects;

public class Author {
    public static String authorFirstName;
    public static String authorLastName;


    public Author (String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;

    }
    public String getFirstName() {
        return authorFirstName;
    }

    public static String getAuthorLastName() {
        return authorLastName;
    }

    @Override
    public String toString() {
        return this.authorFirstName + " " + this.authorLastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author authorFirstName = (Author) other;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName);
    }



}




