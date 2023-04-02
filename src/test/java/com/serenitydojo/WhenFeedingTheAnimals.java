package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.serenitydojo.model.AnimalType.*;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna () {
        Feeder feeder = new Feeder();
        String food = feeder.feeds(CAT,false);
        Assert.assertEquals("Tuna",food);

    }
    @Test
    public void shouldFeedHamstersCabbage () {
        Feeder feeder = new Feeder();
        String food = feeder.feeds(HAMSTER,false);
        Assert.assertEquals("Cabbage",food);

    }
    @Test
    public void shouldFeedDogsDogFood () {
        Feeder feeder = new Feeder();
        String food = feeder.feeds(DOG,false);
        Assert.assertEquals("Dog Food",food);

    }
    @Test
    public void shouldFeedPremiumCatsPremiumFood () {
        Feeder feeder = new Feeder();
        String food = feeder.feeds(CAT,true);
        Assert.assertEquals("Salmon",food);

    }
    @Test
    public void listOfColors() {
        String[] color = {"red","green","blue"};
        int[] age = {1,2,3};

        String[] moreColors = new String[3];
        moreColors[0] = "yellow";
        moreColors[1] = "purple";
        moreColors[2] = "pink";

        for (int i=0; i<moreColors.length;i++){
            System.out.println(moreColors[i]);
        }

        //List is orderd sequence of objects and duplicats are allowed in list
        List<String> myColors = new ArrayList<>();
        myColors.add("red");
        myColors.add("green");
        myColors.add("blue");
        myColors.add("red");//duplicats are allowed in list

        for (String someColor:myColors) {
            System.out.println("Color " + someColor);
        }

        //Set doesn't have order and values are unique
        Set<String> myColors1 = new HashSet<>();
        myColors1.add("red");
        myColors1.add("green");
        myColors1.add("purple");
        myColors1.add("red");

        for ( String someColor1 : myColors1) {
            System.out.println("Color1 " +someColor1);
        }
    }
}
