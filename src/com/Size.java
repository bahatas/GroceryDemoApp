package com;

public enum Size {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    String value;

    Size(String value){
        this.value=value;
    }
    public String getValue(){
    return value;
    }
}
