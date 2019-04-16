package com.javase.java8.Lambda;

import com.javase.java8.Functional.Converter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {

        testCharacteristic();
    }


    public static void testCharacteristic() {

        // 平常的表示方法
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        names.forEach(name -> System.out.println(name));
        System.out.println("==========================");
        List<String> names1 = Arrays.asList("peter", "anna", "mike", "xenia");
        // lambda 表示方法
        Collections.sort(names1, (String a, String b) -> {
            return b.compareTo(a);
        });

        names1.forEach(name -> System.out.println(name));

    }

    public void testScopes() {
        // Accessing local variables We can read final local variables from the outer scope of lambda expression
        final int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);
        stringConverter.convert(2);     // 3

        // But different to anonymous objects the variable num does not have to be declared final. This code is also valid:
        int num1 = 1;
        Converter<Integer, String> stringConverter1 =
                (from) -> String.valueOf(from + num1);

        stringConverter.convert(2);     // 3

        
    }
}
