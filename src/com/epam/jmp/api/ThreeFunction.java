package com.epam.jmp.api;


public interface ThreeFunction<R, F, S, T> {
    R apply(F f, S s, T t);
}
