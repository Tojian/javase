package com.javase.java8.Functional;

@FunctionalInterface
public
interface Converter<F, T> {
    T convert(F from);
}