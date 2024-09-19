package com.example.myapplication.country;

public class CountryModel {

    private String name;
    private String flag;
    private String capital;

    public String getName() {
        return name;
    }

    public String getFlag() {
        return flag;
    }

    public String getCapital() {
        return capital;
    }

    public CountryModel(String name, String flag, String capital) {
        this.name = name;
        this.flag = flag;
        this.capital = capital;
    }
}