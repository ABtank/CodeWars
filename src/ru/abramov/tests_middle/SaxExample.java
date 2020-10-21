package ru.abramov.tests_middle;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.*;

//Тестовое задание:
//        Необходимо сделать парсер входного файла в формате xml
//        и подготовить данные из него для вставки в реляционную
//        базу данных (разворачивание структуры в строку таблицы)
//        Пример файла для парсинга: template.xml


public class SaxExample {
    private static Set<String> set = new LinkedHashSet();
    private static HashMap<String,Integer> hashMap =new LinkedHashMap<>();
    private static int count=0;

    public static void main(String args[]) {

        // Имя файла
        final String fileName = "template.xml";

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            // Здесь мы определили анонимный класс, расширяющий класс DefaultHandler
            DefaultHandler handler = new DefaultHandler() {
                // Поле для указания, что тэг NAME начался
                boolean name = false;

                // Метод вызывается когда SAXParser "натыкается" на начало тэга
                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    // Если тэг имеет имя NAME, то мы этот момент отмечаем - начался тэг NAME
                    set.add(qName);
                    searchDuplicate(qName);
                    if (qName.equalsIgnoreCase("id")) {
                        name = true;
                    }
                }

                // Метод вызывается когда SAXParser считывает текст между тэгами
                @Override
                public void characters(char ch[], int start, int length) throws SAXException {
                    // Если перед этим мы отметили, что имя тэга NAME - значит нам надо текст использовать.
                    if (name) {
                        count++;
//                        System.out.println("Name "+ "#"+ count+" : " + new String(ch, start, length));
                        name = false;
                    }
                }
            };

            // Стартуем разбор методом parse, которому передаем наследника от DefaultHandler, который будет вызываться в нужные моменты
            saxParser.parse(fileName, handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(set);
        System.out.println(hashMap);
    }

    private static void searchDuplicate(String str) {
            if(hashMap.containsKey(str)){
                hashMap.put(str,hashMap.get(str)+1);
            }else{
                hashMap.put(str,1);
            }
        }
}