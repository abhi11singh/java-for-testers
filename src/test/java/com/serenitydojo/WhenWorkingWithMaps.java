package com.serenitydojo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WhenWorkingWithMaps {
    @Test
    public void creatingMaps() {

        Map<String , Integer> numberOfBallsByColor = new HashMap<>();
        numberOfBallsByColor.put("red",3);
        numberOfBallsByColor.put("green",6);
        numberOfBallsByColor.put("blue",5);

        Integer numberOfRedBalls = numberOfBallsByColor.get("red");
        System.out.println("There are "+numberOfRedBalls+" red Balls");
    }
    @Test
    public void creatingMapMoreConcisely() {
        Map<String, Integer> numberOfBallsByColor = Map.of("red",3,"green",5,"blue",5);

        Map<String, Integer> moreColors = new HashMap<>();
        moreColors.put("yellow",10);
        moreColors.putAll(numberOfBallsByColor);

        System.out.println("No of white balls " + numberOfBallsByColor.get("white"));//default value return is null
        System.out.println("No of white balls " + numberOfBallsByColor.getOrDefault("white",0));//you can set default value
        System.out.println("purple tenis ball present "+moreColors.containsKey("purple"));
        System.out.println("check if any color have 99 balls in map "+moreColors.containsValue(99));

        moreColors.put("yellow",20);//replace a value , if it don't find value then add this in map
        System.out.println("Number of yellow balls "+moreColors.get("yellow"));

        moreColors.replace("pink",30);//If it don't find Pink in map then it will not add or replace
        System.out.println("Number of pink balls "+moreColors.getOrDefault("pink",0));

    }

    @Test
    public void iteratingOverMapKeys() {
        Map<String,Integer> numberOfBallsByColor = Map.of("red",3,"green",5,"blue",5);
        System.out.println("Key Set : "+numberOfBallsByColor.keySet());

        for (String key : numberOfBallsByColor.keySet()) {
            Integer numberOfTennisBall = numberOfBallsByColor.get(key);
            System.out.println(key +"=>"+numberOfTennisBall);

        }
        for (Map.Entry<String,Integer> entry : numberOfBallsByColor.entrySet()) {
            System.out.println(entry.getKey()+ " -> " +entry.getValue());
        }
    }
    @Test
    public void removeOverMapkeys() {
        Map<String,Integer> numberOfBallsByColor = new HashMap<>();
        numberOfBallsByColor.put("red",5);
        numberOfBallsByColor.put("green",7);
        numberOfBallsByColor.put("white",1);

        printMap(numberOfBallsByColor);
        numberOfBallsByColor.remove("red");
        printMap(numberOfBallsByColor);
    }

    private static void printMap(Map<String, Integer> numberOfBallsByColor) {
        for (Map.Entry<String,Integer> entry : numberOfBallsByColor.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
