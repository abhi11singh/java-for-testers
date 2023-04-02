package com.serenitydojo;

public class Hampster extends Pet {

    private String name;
    private String FavoriteGame;
    private int age;

    public Hampster(String name, String FavoriteGame, int age) {
        super(name,age);
        this.FavoriteGame = FavoriteGame;
    }

    public String getFavoriteGame() {
        return FavoriteGame;
    }

    @Override
    public String makeNoise() {
        return "Squeak";
    }
}
