package ru.abramov.tests_middle;

import org.xml.sax.helpers.DefaultHandler;
import ru.abramov.tests_middle.handlers.SaxHandler;
import ru.abramov.tests_middle.models.Entity;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;

public class SaxParser {
    private ArrayList<Entity> entities = new ArrayList<>();

    public void parse (String xmlPath){

        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(xmlPath, new SaxHandler(entities));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }
}
