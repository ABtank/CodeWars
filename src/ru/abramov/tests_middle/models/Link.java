package ru.abramov.tests_middle.models;

public class Link {

    private String rel;
    private String href;
    private String type;
    private String title;

    public Link(String rel, String href, String type, String title) {
        this.rel = rel;
        this.href = href;
        this.type = type;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Link{" +
                "rel='" + rel + '\'' +
                ", href='" + href + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
