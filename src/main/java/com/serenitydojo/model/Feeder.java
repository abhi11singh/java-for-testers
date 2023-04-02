package com.serenitydojo.model;

public class Feeder {
    public String feeds(AnimalType animal,boolean isPremium) {
//        if (animal.equals("Cat")) {
//            if (isPremium){
//                return "Salmon";
//            }else {
//                return "Tuna";
//            }
//            return (isPremium == true) ? "Salmon" : "Tuna";
//            return (isPremium) ? "Salmon" : "Tuna";
//        } else if (animal.equals("Dog")) {
//            return "Dogs Food";
//        }
//        return "Cabbage";
            switch (animal) {
                case CAT:
                    return (isPremium) ? "Salmon" : "Tuna";
                case DOG:
                    return (isPremium) ? "Parle G" : "Dog Food";
                case HAMSTER:
                    return (isPremium) ? "Lettuce" : "Cabbage";
                default:
                    return "Don't know this animal - don't know the food";
            }


    }
}