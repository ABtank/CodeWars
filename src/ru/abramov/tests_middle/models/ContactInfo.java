package ru.abramov.tests_middle.models;

import java.util.ArrayList;
import java.util.List;

public class ContactInfo {
    private String info;
    private List<DElement> element;

    public List<DElement> getElement() {
        if (element == null) element = new ArrayList<>();
        return element;
    }
    public DElement getLastDElement(){
        return getElement().get(element.size()-1);
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "ContactInfo{" + '\n' +
                "info='" + info + '\n' +
                ", element=" + element +
                '}';
    }
}
