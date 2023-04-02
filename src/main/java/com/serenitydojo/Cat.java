package com.serenitydojo;

public class Cat extends Pet {

    private String favoriteFood;

    public static final String CAT_NOISE="Loud MEOW";

    public Cat(String name, String favoriteFood, int age) {
        super(name,age);
        this.favoriteFood = favoriteFood;

    }


    public String getFavoriteFood() {
        return favoriteFood;
    }

//    public void makeNoise() {
//        System.out.println("Meow");
//    }

    @Override
    public String makeNoise(){
    return CAT_NOISE;
    }
    public void feedFood(String food) {
        System.out.println(getName() + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(getName() + " clean his fur");
    }

    private void lickPaws() {
        System.out.println(getName() + " lick his paws");
        
    }
}

