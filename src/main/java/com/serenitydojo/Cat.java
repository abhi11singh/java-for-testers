package com.serenitydojo;

public class Cat {
    private String name;
    private String favoriteFood;
    private int age;

    public static final String CAT_NOISE="Loud MEOW";

    public Cat(String name, String favoriteFood, int age) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }

//    public void makeNoise() {
//        System.out.println("Meow");
//    }

    public String makeNoise(){
    return CAT_NOISE;
    }
    public void feedFood(String food) {
        System.out.println(name + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(name + " clean his fur");
    }

    private void lickPaws() {
        System.out.println(name + " lick his paws");
        
    }
}

