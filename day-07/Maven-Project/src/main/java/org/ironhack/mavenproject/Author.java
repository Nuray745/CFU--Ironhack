package org.ironhack.mavenproject;

import java.util.List;

public class Author {
    private String name;
    private String lastName;
    private List<Book> publishedBooks;

    public Author(String name, String lastName, List<Book> publishedBooks) {
        this.name = name;
        this.lastName = lastName;
        this.publishedBooks =publishedBooks;
    }
}
