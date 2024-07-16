package com.example.bookstoreApplication.model;

public class Bookpage {
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Bookpage{" +
                "string='" + string + '\'' +
                '}';
    }
}
