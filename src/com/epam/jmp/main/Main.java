package com.epam.jmp.main;

import com.epam.jmp.entity.Author;
import com.epam.jmp.entity.Book;
import com.epam.jmp.task.TaskImplementation;
import com.epam.jmp.util.InitialParamsGenerator;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        InitialParamsGenerator initialParamsGenerator = InitialParamsGenerator.createInitialParamsGenerator();

        Author[] authors = initialParamsGenerator.getAuthors();
        Book[] books = initialParamsGenerator.getBooks();
    }
}
