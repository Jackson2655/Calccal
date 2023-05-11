package com.example.calccal;

public class weeks {
    private String name;

    public weeks(Integer name) {
        this.name = String.valueOf(name);
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;


        return name;
    }
}