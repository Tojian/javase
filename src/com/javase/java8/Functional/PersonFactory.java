package com.javase.java8.Functional;

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}