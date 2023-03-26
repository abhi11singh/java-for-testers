package com.serenitydojo;

public class Dog {
    private String name;
    private String FavoriteToy;
    private int age;
    public Dog(String name, String FavoriteToy, int age) {
        this.name = name;
        this.FavoriteToy = FavoriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return FavoriteToy;
    }

    public int getAge() {
        return age;
    }

}