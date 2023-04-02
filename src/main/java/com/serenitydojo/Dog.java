package com.serenitydojo;

public class Dog extends Pet {
    private static final String DOG_NOISE = "Woof";
    private String FavoriteToy;
    public Dog(String name, String FavoriteToy, int age) {
        super(name,age);
        this.FavoriteToy = FavoriteToy;
    }

    public String getFavoriteToy() {
        return FavoriteToy;
    }
    @Override
    public String makeNoise() {
        return DOG_NOISE;
    }
}