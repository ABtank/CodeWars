package ru.abramov.tests_middle.models;

import java.util.ArrayList;
import java.util.List;

public class Entity {

    private String entry;
    private String id;
    private Category category;
    private String title;
    private String updated;
    private String author;
    private String summary;
    private List<Link> links;
    private Content content;

    private String d_Predefined;
    private String d_PredefinedDataName;

    @Override
    public String toString() {
        return "Entity{" +
                "entry='" + entry + '\n' +
                ", id='" + id + '\n' +
                ", category='" + category + '\n' +
                ", title='" + title + '\n' +
                ", updated='" + updated + '\n' +
                ", author='" + author + '\n' +
                ", summary='" + summary + '\n' +
                ", links=" + links + '\n' +
                ", content='" + content + '\n' +
                ", d_Predefined='" + d_Predefined + '\n' +
                ", d_PredefinedDataName='" + d_PredefinedDataName + '\'' +
                '}';
    }

    public Entity() {
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Link> getLinks() {
        if (links == null) links = new ArrayList<>();
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Content getContent() {
        if(content==null) content = new Content();
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getD_Predefined() {
        return d_Predefined;
    }

    public void setD_Predefined(String d_Predefined) {
        this.d_Predefined = d_Predefined;
    }

    public String getD_PredefinedDataName() {
        return d_PredefinedDataName;
    }

    public void setD_PredefinedDataName(String d_PredefinedDataName) {
        this.d_PredefinedDataName = d_PredefinedDataName;
    }
}
