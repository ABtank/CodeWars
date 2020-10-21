package ru.abramov.tests_middle.models;

import java.util.List;

public class DElement {

    private String info;
    private String d_Ref_Key;
    private String d_LineNumber;
    private String d_Тип;
    private String d_Вид_Key;
    private String d_Представление;
    private String d_ЗначенияПолей;
    private String d_Страна;
    private String d_Регион;
    private String d_Город;
    private String d_АдресЭП;
    private String d_ДоменноеИмяСервера;
    private String d_НомерТелефона;
    private String d_НомерТелефонаБезКодов;
    private String d_ВидДляСписка_Key;
    private String d_ДействуетС;

    public DElement(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "DElement{" +
                "d_Ref_Key='" + d_Ref_Key + '\n' +
                "d_LineNumber='" + d_LineNumber + '\n' +
                ", d_Тип='" + d_Тип + '\n' +
                ", d_Вид_Key='" + d_Вид_Key + '\n' +
                ", d_Представление='" + d_Представление + '\n' +
                ", d_ЗначенияПолей='" + d_ЗначенияПолей + '\n' +
                ", d_Страна='" + d_Страна + '\n' +
                ", d_Регион='" + d_Регион + '\n' +
                ", d_Город='" + d_Город + '\n' +
                ", d_АдресЭП='" + d_АдресЭП + '\n' +
                ", d_ДоменноеИмяСервера='" + d_ДоменноеИмяСервера + '\n' +
                ", d_НомерТелефона='" + d_НомерТелефона + '\n' +
                ", d_НомерТелефонаБезКодов='" + d_НомерТелефонаБезКодов + '\n' +
                ", d_ВидДляСписка_Key='" + d_ВидДляСписка_Key + '\n' +
                ", d_ДействуетС='" + d_ДействуетС + '\n' +
                '}';
    }

    public String getD_Ref_Key() {
        return d_Ref_Key;
    }

    public void setD_Ref_Key(String d_Ref_Key) {
        this.d_Ref_Key = d_Ref_Key;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getD_LineNumber() {
        return d_LineNumber;
    }

    public void setD_LineNumber(String d_LineNumber) {
        this.d_LineNumber = d_LineNumber;
    }

    public String getD_Тип() {
        return d_Тип;
    }

    public void setD_Тип(String d_Тип) {
        this.d_Тип = d_Тип;
    }

    public String getD_Вид_Key() {
        return d_Вид_Key;
    }

    public void setD_Вид_Key(String d_Вид_Key) {
        this.d_Вид_Key = d_Вид_Key;
    }

    public String getD_Представление() {
        return d_Представление;
    }

    public void setD_Представление(String d_Представление) {
        this.d_Представление = d_Представление;
    }

    public String getD_ЗначенияПолей() {
        return d_ЗначенияПолей;
    }

    public void setD_ЗначенияПолей(String d_ЗначенияПолей) {
        this.d_ЗначенияПолей = d_ЗначенияПолей;
    }

    public String getD_Страна() {
        return d_Страна;
    }

    public void setD_Страна(String d_Страна) {
        this.d_Страна = d_Страна;
    }

    public String getD_Регион() {
        return d_Регион;
    }

    public void setD_Регион(String d_Регион) {
        this.d_Регион = d_Регион;
    }

    public String getD_Город() {
        return d_Город;
    }

    public void setD_Город(String d_Город) {
        this.d_Город = d_Город;
    }

    public String getD_АдресЭП() {
        return d_АдресЭП;
    }

    public void setD_АдресЭП(String d_АдресЭП) {
        this.d_АдресЭП = d_АдресЭП;
    }

    public String getD_ДоменноеИмяСервера() {
        return d_ДоменноеИмяСервера;
    }

    public void setD_ДоменноеИмяСервера(String d_ДоменноеИмяСервера) {
        this.d_ДоменноеИмяСервера = d_ДоменноеИмяСервера;
    }

    public String getD_НомерТелефона() {
        return d_НомерТелефона;
    }

    public void setD_НомерТелефона(String d_НомерТелефона) {
        this.d_НомерТелефона = d_НомерТелефона;
    }

    public String getD_НомерТелефонаБезКодов() {
        return d_НомерТелефонаБезКодов;
    }

    public void setD_НомерТелефонаБезКодов(String d_НомерТелефонаБезКодов) {
        this.d_НомерТелефонаБезКодов = d_НомерТелефонаБезКодов;
    }

    public String getD_ВидДляСписка_Key() {
        return d_ВидДляСписка_Key;
    }

    public void setD_ВидДляСписка_Key(String d_ВидДляСписка_Key) {
        this.d_ВидДляСписка_Key = d_ВидДляСписка_Key;
    }

    public String getD_ДействуетС() {
        return d_ДействуетС;
    }

    public void setD_ДействуетС(String d_ДействуетС) {
        this.d_ДействуетС = d_ДействуетС;
    }
}
