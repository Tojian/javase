package com.javase.java8.Lambda;

import com.javase.java8.Functional.Converter;

/**
 * Accessing fields and static variables
 * <p>
 * In contrast to local variables,
 * we have both read and write access to instance fields and static variables from within lambda expressions.
 * This behaviour is well known from anonymous objects.
 */
class Lambda4 {
    static int outerStaticNum;
    int outerNum;

    public void testScopes() {

        Converter<Integer, String> stringConverter = new Converter<Integer, String>() {
            @Override
            public String convert(Integer from) {
                outerNum = 23;
                return String.valueOf(from);
            }
        };


        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        System.out.println(stringConverter1.convert(100));
        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
        System.out.println(stringConverter2.convert(120));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Lambda4 lambda4 = new Lambda4();
        lambda4.testScopes();
    }
}