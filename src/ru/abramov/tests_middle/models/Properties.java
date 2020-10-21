package ru.abramov.tests_middle.models;

public class Properties {

    private String d_Ref_Key;
    private String d_DataVersion;
    private String d_DeletionMark;
    private String d_Parent_Key;
    private String d_IsFolder;
    private String d_Code;
    private String d_Description;
    private String d_ГруппаДоступа_Key;
    private String d_ИНН;
    private String d_КодПоОКПО;
    private String d_Комментарий;
    private String d_КПП;
    private String d_НаименованиеПолное;
    private String d_ОсновнойБанковскийСчет_Key;
    private String d_Ответственный_Key;
    private String d_РегистрационныйНомер;
    private String d_ФизЛицо_Key;
    private String d_ЮрФизЛицо;
    private String d_сфпCoMagicID;
    private String d_ДополнительныеРеквизиты;
    private ContactInfo contactInfo;

    @Override
    public String toString() {
        return "Properties{" + '\n' +
                "d_Ref_Key=" + d_Ref_Key + '\n' +
                ", d_DataVersion='" + d_DataVersion + '\n' +
                ", d_DeletionMark='" + d_DeletionMark + '\n' +
                ", d_Parent_Key='" + d_Parent_Key + '\n' +
                ", d_IsFolder='" + d_IsFolder + '\n' +
                ", d_Code='" + d_Code + '\n' +
                ", d_Description='" + d_Description + '\n' +
                ", d_ГруппаДоступа_Key='" + d_ГруппаДоступа_Key + '\n' +
                ", d_ИНН='" + d_ИНН + '\n' +
                ", d_КодПоОКПО='" + d_КодПоОКПО + '\n' +
                ", d_Комментарий='" + d_Комментарий + '\n' +
                ", d_КПП='" + d_КПП + '\n' +
                ", d_НаименованиеПолное='" + d_НаименованиеПолное + '\n' +
                ", d_ОсновнойБанковскийСчет_Key'" + d_ОсновнойБанковскийСчет_Key + '\n' +
                ", d_Ответственный_Key='" + d_Ответственный_Key + '\n' +
                ", d_РегистрационныйНомер='" + d_РегистрационныйНомер + '\n' +
                ", d_ФизЛицо_Key='" + d_ФизЛицо_Key + '\n' +
                ", d_ЮрФизЛицо='" + d_ЮрФизЛицо + '\n' +
                ", d_сфпCoMagicID='" + d_сфпCoMagicID + '\n' +
                ", d_ДополнительныеРеквизиты='" + d_ДополнительныеРеквизиты + '\n' +
                ", КонтактнаяИнформация=" + contactInfo +
                '}';
    }

    public String getD_ОсновнойБанковскийСчет_Key() {
        return d_ОсновнойБанковскийСчет_Key;
    }

    public void setD_ОсновнойБанковскийСчет_Key(String d_ОсновнойБанковскийСчет_Key) {
        this.d_ОсновнойБанковскийСчет_Key = d_ОсновнойБанковскийСчет_Key;
    }

    public String getD_Ref_Key() {
        return d_Ref_Key;
    }

    public void setD_Ref_Key(String d_Ref_Key) {
        this.d_Ref_Key = d_Ref_Key;
    }

    public String getD_DataVersion() {
        return d_DataVersion;
    }

    public void setD_DataVersion(String d_DataVersion) {
        this.d_DataVersion = d_DataVersion;
    }

    public String getD_DeletionMark() {
        return d_DeletionMark;
    }

    public void setD_DeletionMark(String d_DeletionMark) {
        this.d_DeletionMark = d_DeletionMark;
    }

    public String getD_Parent_Key() {
        return d_Parent_Key;
    }

    public void setD_Parent_Key(String d_Parent_Key) {
        this.d_Parent_Key = d_Parent_Key;
    }

    public String getD_IsFolder() {
        return d_IsFolder;
    }

    public void setD_IsFolder(String d_IsFolder) {
        this.d_IsFolder = d_IsFolder;
    }

    public String getD_Code() {
        return d_Code;
    }

    public void setD_Code(String d_Code) {
        this.d_Code = d_Code;
    }

    public String getD_Description() {
        return d_Description;
    }

    public void setD_Description(String d_Description) {
        this.d_Description = d_Description;
    }

    public String getD_ГруппаДоступа_Key() {
        return d_ГруппаДоступа_Key;
    }

    public void setD_ГруппаДоступа_Key(String d_ГруппаДоступа_Key) {
        this.d_ГруппаДоступа_Key = d_ГруппаДоступа_Key;
    }

    public String getD_ИНН() {
        return d_ИНН;
    }

    public void setD_ИНН(String d_ИНН) {
        this.d_ИНН = d_ИНН;
    }

    public String getD_КодПоОКПО() {
        return d_КодПоОКПО;
    }

    public void setD_КодПоОКПО(String d_КодПоОКПО) {
        this.d_КодПоОКПО = d_КодПоОКПО;
    }

    public String getD_Комментарий() {
        return d_Комментарий;
    }

    public void setD_Комментарий(String d_Комментарий) {
        this.d_Комментарий = d_Комментарий;
    }

    public String getD_КПП() {
        return d_КПП;
    }

    public void setD_КПП(String d_КПП) {
        this.d_КПП = d_КПП;
    }

    public String getD_НаименованиеПолное() {
        return d_НаименованиеПолное;
    }

    public void setD_НаименованиеПолное(String d_НаименованиеПолное) {
        this.d_НаименованиеПолное = d_НаименованиеПолное;
    }

    public String getD_Ответственный_Key() {
        return d_Ответственный_Key;
    }

    public void setD_Ответственный_Key(String d_Ответственный_Key) {
        this.d_Ответственный_Key = d_Ответственный_Key;
    }

    public String getD_РегистрационныйНомер() {
        return d_РегистрационныйНомер;
    }

    public void setD_РегистрационныйНомер(String d_РегистрационныйНомер) {
        this.d_РегистрационныйНомер = d_РегистрационныйНомер;
    }

    public String getD_ФизЛицо_Key() {
        return d_ФизЛицо_Key;
    }

    public void setD_ФизЛицо_Key(String d_ФизЛицо_Key) {
        this.d_ФизЛицо_Key = d_ФизЛицо_Key;
    }

    public String getD_ЮрФизЛицо() {
        return d_ЮрФизЛицо;
    }

    public void setD_ЮрФизЛицо(String d_ЮрФизЛицо) {
        this.d_ЮрФизЛицо = d_ЮрФизЛицо;
    }

    public String getD_сфпCoMagicID() {
        return d_сфпCoMagicID;
    }

    public void setD_сфпCoMagicID(String d_сфпCoMagicID) {
        this.d_сфпCoMagicID = d_сфпCoMagicID;
    }

    public String getD_ДополнительныеРеквизиты() {
        return d_ДополнительныеРеквизиты;
    }

    public void setD_ДополнительныеРеквизиты(String d_ДополнительныеРеквизиты) {
        this.d_ДополнительныеРеквизиты = d_ДополнительныеРеквизиты;
    }

    public ContactInfo getContactInfo() {
        if(contactInfo == null) contactInfo = new ContactInfo();
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
