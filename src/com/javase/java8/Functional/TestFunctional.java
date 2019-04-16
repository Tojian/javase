package com.javase.java8.Functional;

/**
 * Keep in mind that the code is also valid if the @FunctionalInterface annotation would be omitted.
 * 就算@FunctionalInterface 被删除，也是有效的
 */
public class TestFunctional {

    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123


        // The above example code can be further simplified by utilizing static method references:
        // public static Integer valueOf(String s)  valueOf() 的方法是一个静态的方法。

        Converter<String, Integer> converter1 = Integer::valueOf;
        Integer converted1 = converter.convert("123");
        System.out.println(converted);   // 123


        // we can also reference object methods:
        Something something = new Something();
        Converter<String, String> converter3 = something::startsWith;
        String converted3 = converter3.convert("Java");
        System.out.println(converted);    // "J"


        // Instead of implementing the factory manually, we glue everything together via constructor references:
        // 关注构造器引用
        // We create a reference to the Person constructor via Person::new.
        // The Java compiler automatically chooses the right constructor by matching the signature of PersonFactory.create.
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println();
    }
}

