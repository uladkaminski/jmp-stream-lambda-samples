package com.epam.jmp.util;


import com.epam.jmp.entity.Author;
import com.epam.jmp.entity.Book;

import java.util.Arrays;

import static java.util.Arrays.asList;

public class InitialParamsGenerator {
    private Author[] authors;
    private Book[] books;

    private InitialParamsGenerator() {
    }

    public static InitialParamsGenerator createInitialParamsGenerator() {
        InitialParamsGenerator initialParamsGenerator = new InitialParamsGenerator();
        initialParamsGenerator.generateParams();
        return initialParamsGenerator;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public Book[] getBooks() {
        return books;
    }

    private void generateParams() {
        Author janeAusten = new Author("Jane Austen", (short) 56);
        Author williamBlake = new Author("William Blake", (short) 100);
        Author geoffyChaucer = new Author("Geoffy Chaucer", (short) 20);
        Author charlesDickens = new Author("Charles Dickens", (short) 42);
        Author johnDonne = new Author("John Donne", (short) 32);
        Author aynRand = new Author("Ayn Rand", (short) 43);
        Author hemingway = new Author("Hemingway", (short) 33);

        Book sence = new Book("Sense and Sensibility", 302, asList(janeAusten));
        Book pride = new Book("Pride and Prejudice", 432, asList(janeAusten));
        Book park = new Book("Mansfield Park", 3312, asList(janeAusten));
        Book emma = new Book("Emma", 121, asList(janeAusten));

        janeAusten.setBooks(asList(sence, pride, park, emma));

        Book angels = new Book("The Angels Hovering Over the Body of Christ in the Sepulchre", 312, asList(williamBlake));
        Book acient = new Book("The Ancient of Days", 176, asList(williamBlake));
        Book adam = new Book("Adam Naming the Beasts", 134, asList(williamBlake));
        Book newton = new Book("Newton", 762, asList(williamBlake));

        williamBlake.setBooks(asList(angels, acient, adam, newton));

        Book roman = new Book("Roman de la Rose", 342, asList(geoffyChaucer));
        Book book = new Book("The Book of the Duchess", 1253, asList(geoffyChaucer));
        Book house = new Book("The House of Fame", 532, asList(geoffyChaucer));
        Book anelida = new Book("Anelida and Arcite", 565, asList(geoffyChaucer));
        Book foules = new Book("Parlement of Foules", 575, asList(geoffyChaucer));

        geoffyChaucer.setBooks(asList(roman, book, house, anelida, foules));

        Book papers = new Book("The Pickwick Papers", 141, asList(charlesDickens));
        Book oliver = new Book("The Adventures of Oliver Twist", 1534, asList(charlesDickens));
        Book life = new Book("The Life and Adventures of Nicholas Nickleby", 754, asList(charlesDickens));
        Book shop = new Book("The Old Curiosity Shop", 698, asList(charlesDickens));

        charlesDickens.setBooks(asList(papers, oliver, life, shop));

        Book biathanatos = new Book("Biathanatos", 743, asList(johnDonne));
        Book pseudo = new Book("Pseudo-Martyr", 1231, asList(johnDonne));
        Book ignatius = new Book("Ignatius His Conclave ", 543, asList(johnDonne));

        johnDonne.setBooks(asList(biathanatos, pseudo, ignatius));

        Book living = new Book("We the Living", 235, asList(aynRand));
        Book fountainhead = new Book("The Fountainhead", 362, asList(aynRand));
        Book atlas = new Book(" Atlas Shrugged", 2478, asList(aynRand));

        aynRand.setBooks(asList(living, fountainhead, atlas));

        Book sun = new Book("The Sun Also Rises", 2468, asList(hemingway));
        Book farewell = new Book("A Farewell to Arms ", 834, asList(hemingway));
        Book death = new Book("Death in the Afternoon ", 856, asList(hemingway));

        hemingway.setBooks(asList(sun, farewell, death));

        authors = (Author[]) asList(janeAusten, williamBlake, geoffyChaucer, charlesDickens, johnDonne, aynRand, hemingway).toArray();
        books = (Book[]) asList(emma, park, pride, sence, newton, adam, acient, angels, foules, anelida, house, book, roman, shop, life, oliver, papers, ignatius, pseudo, biathanatos, atlas, fountainhead, living, death, farewell, sun).toArray();
    }
}
