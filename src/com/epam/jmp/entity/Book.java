package com.epam.jmp.entity;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private int numberOfPages;
    List<Author> authors;

    public Book() {
    }

    public Book(String title, int numberOfPages, List<Author> authors) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (numberOfPages != book.numberOfPages) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return authors != null ? authors.equals(book.authors) : book.authors == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + numberOfPages;
        result = 31 * result + (authors != null ? authors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", authors=" + authors +
                '}';
    }
}
