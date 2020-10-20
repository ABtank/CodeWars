package ru.abramov.tests_middle;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.util.Scanner;

public class StAXExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input ="x";
                input = sc.nextLine();

        // get the default factory instance
        XMLInputFactory factory = XMLInputFactory.newInstance();
// configure it to create readers that coalesce adjacent character sections
        factory.setProperty(XMLInputFactory.IS_COALESCING, Boolean.TRUE);
//        XMLStreamReader r = factory.createXMLStreamReader(input + ".xml");
// ...
    }
}
