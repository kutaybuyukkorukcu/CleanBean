package com.cleanbean.beans;

import com.cleanbean.regex.Regex;

public class RegexBean {

    @Regex(pattern = "clean")
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
