package ru.abramov.tests_middle;

import ru.abramov.tests_middle.handlers.SaxHandler;

public class MainParser {

    public static void main(String[] args) {
        String xmlPath = "template.xml";
        SaxParser saxParser =new SaxParser();
        saxParser.parse(xmlPath);
        System.out.println(saxParser.getEntities().size());
        System.out.println(saxParser.getEntities().get(0));

    }
}
