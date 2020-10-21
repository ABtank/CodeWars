package ru.abramov.tests_middle.models;

import java.util.List;

public class Content {
    private String type;
    private Properties m_Properties;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Properties getM_Properties() {
        if (m_Properties == null) m_Properties = new Properties();
        return m_Properties;
    }

    public void setM_Properties(Properties m_Properties) {
        this.m_Properties = m_Properties;
    }

    @Override
    public String toString() {
        return "Content{" +
                "type='" + type + '\'' +
                ", m_Properties=" + m_Properties +
                '}';
    }
}
