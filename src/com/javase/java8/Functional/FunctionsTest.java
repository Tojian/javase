package com.javase.java8.Functional;

import java.util.function.Function;

/**
 * Functions accept one argument and produce a result.
 * <p>
 * Default methods can be used to chain multiple functions together (compose, andThen).
 */
public class FunctionsTest {

    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        backToString.apply("123");
    }
}
