package ru.abramov.tests_middle.handlers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import ru.abramov.tests_middle.models.*;

import java.util.ArrayList;

public class SaxHandler extends DefaultHandler {
    Entity entity;
    DElement dElement;
    Properties properties;
    ContactInfo contactInfo;
    String content = null;
    int count = 0;
    private ArrayList<Entity> entities = new ArrayList<>();
    boolean isDElement = false;

    public SaxHandler(ArrayList<Entity> entities) {
        this.entities = entities;
        ;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        switch (qName) {
            case "entry":
                if (entity == null) {
                    entity = new Entity();
                }
                break;
            case "category":
                entity.setCategory(new Category(attributes.getValue("term"), attributes.getValue("scheme")));
                break;
            case "title":
                entity.setTitle(attributes.getValue("type"));
                break;
            case "link":
                entity.getLinks().add(new Link(attributes.getValue("rel"),
                        attributes.getValue("href"),
                        attributes.getValue("type"),
                        attributes.getValue("title")));
                break;
            case "content":
                entity.getContent().setType(attributes.getValue("type"));
                break;
            case "d:ДополнительныеРеквизиты":
                entity.getContent().getM_Properties().setD_ДополнительныеРеквизиты(attributes.getValue("m:type"));
                break;
            case "d:КонтактнаяИнформация":
                entity.getContent().getM_Properties().getContactInfo().setInfo(attributes.getValue("m:type"));
                break;
            case "d:element":
                DElement dElement = new DElement(attributes.getValue("m:type"));
                entity.getContent().getM_Properties().getContactInfo().getElement().add(dElement);
                isDElement = true;
                break;

        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        switch (qName) {
            case "entry":
                if (entity != null) {
                    entities.add(entity);
                    entity = null;
                }
                break;
            case "d:element":
                entity.getContent().getM_Properties().getContactInfo().getElement().add(dElement);
                dElement = null;
                isDElement = false;
                break;

            case "id":
                entity.setId(content);
                break;
            case "updated":
                entity.setUpdated(content);
                break;
            case "author":
                entity.setAuthor(content);
                break;
            case "summary":
                entity.setSummary(content);
                break;
//                ---Properties---
            case "m:properties":
                entity.getContent().getM_Properties();
                break;
            case "d:Ref_Key":
//                if (isDElement) entity.getContent().getM_Properties().getContactInfo().
//                        getLastDElement().setD_Ref_Key(content);
                     entity.getContent().getM_Properties().setD_Ref_Key(content);
                break;
            case "d:DataVersion":
                entity.getContent().getM_Properties().setD_DataVersion(content);
                break;
            case "d:DeletionMark":
                entity.getContent().getM_Properties().setD_DeletionMark(content);
                break;
            case "d:Parent_Key":
                entity.getContent().getM_Properties().setD_Parent_Key(content);
                break;
            case "d:IsFolder":
                entity.getContent().getM_Properties().setD_IsFolder(content);
                break;
            case "d:Code":
                entity.getContent().getM_Properties().setD_Code(content);
                break;
            case "d:Description":
                entity.getContent().getM_Properties().setD_Description(content);
                break;
            case "d:ГруппаДоступа_Key":
                entity.getContent().getM_Properties().setD_ГруппаДоступа_Key(content);
                break;
            case "d:ИНН":
                entity.getContent().getM_Properties().setD_ИНН(content);
                break;
            case "d:КодПоОКПО":
                entity.getContent().getM_Properties().setD_КодПоОКПО(content);
                break;
            case "d:Комментарий":
                entity.getContent().getM_Properties().setD_Комментарий(content);
                break;
            case "d:КПП":
                entity.getContent().getM_Properties().setD_КПП(content);
                break;
            case "d:НаименованиеПолное":
                entity.getContent().getM_Properties().setD_НаименованиеПолное(content);
                break;
            case "d:ОсновнойБанковскийСчет_Key":
                entity.getContent().getM_Properties().setD_ОсновнойБанковскийСчет_Key(content);
                break;
            case "d:Ответственный_Key":
                entity.getContent().getM_Properties().setD_Ответственный_Key(content);
                break;
            case "d:РегистрационныйНомер":
                entity.getContent().getM_Properties().setD_РегистрационныйНомер(content);
                break;
            case "d:ФизЛицо_Key":
                entity.getContent().getM_Properties().setD_ФизЛицо_Key(content);
                break;
            case "d:ЮрФизЛицо":
                entity.getContent().getM_Properties().setD_ЮрФизЛицо(content);
                break;
            case "d:сфпCoMagicID":
                entity.getContent().getM_Properties().setD_сфпCoMagicID(content);
                break;
//                ----DElement-----
            case "d:LineNumber":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_LineNumber(content);
                break;
            case "d:Тип":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_Тип(content);
                break;
            case "d:Вид_Key":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_Вид_Key(content);
                break;
            case "d:Представление":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_Представление(content);
                break;
            case "d:ЗначенияПолей":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_ЗначенияПолей(content);
                break;
            case "d:Страна":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_Страна(content);
                break;
            case "d:Регион":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_Регион(content);
                break;
            case "d:Город":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_Город(content);
                break;
            case "d:АдресЭП":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_АдресЭП(content);
                break;
            case "d:ДоменноеИмяСервера":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_ДоменноеИмяСервера(content);
                break;
            case "d:НомерТелефона":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_НомерТелефона(content);
                break;
            case "d:НомерТелефонаБезКодов":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_НомерТелефонаБезКодов(content);
                break;
            case "d:ВидДляСписка_Key":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_ВидДляСписка_Key(content);
                break;
            case "d:ДействуетС":
                entity.getContent().getM_Properties().getContactInfo().getLastDElement().setD_ДействуетС(content);
                break;

            case "d:Predefined":
                entity.setD_Predefined(content);
                break;
            case "d:PredefinedDataName":
                entity.setD_PredefinedDataName(content);
                break;

        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }
}
