package ru.abramov.tests_middle.models;

public class Category {
    private String term;
    private String scheme;

    public Category(String term, String scheme) {
        this.term = term;
        this.scheme = scheme;
    }

    @Override
    public String toString() {
        return "Category{" +
                "term='" + term + '\'' +
                ", scheme='" + scheme + '\'' +
                '}';
    }
}
