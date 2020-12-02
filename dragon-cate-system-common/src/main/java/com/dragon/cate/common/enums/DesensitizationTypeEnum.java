package com.dragon.cate.common.enums;


public enum DesensitizationTypeEnum {

    PHONE("phone", "11位手机号", "^(\\d{3})\\d{4}(\\d{4})$", "$1****$2"),

    ID_CARD("idCard", "16或者18身份证号", "^(\\d{4})\\d{8,10}(\\w{4})$", "$1****$2"),
    BANK_CARD("bankCardNo", "银行卡号", "^(\\d{4})\\d*(\\d{4})$", "$1****$2"),
    REAL_NAME("realName","真实姓名","(?<=.{1}).*(?=.{1})","*"),
    EMAIL("email","电子邮箱","(\\w+)\\w{5}@(\\w+)", "$1***@$2");

    String type;

    String describe;

    String[] regular;

    DesensitizationTypeEnum(String type, String describe, String... regular) {
        this.type = type;
        this.describe = describe;
        this.regular = regular;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String[] getRegular() {
        return regular;
    }

    public void setRegular(String[] regular) {
        this.regular = regular;
    }
}
