package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

   @Test
    public void creating_a_cat() {
       Cat felix = new Cat("Felix","Tuna",4);
       System.out.println(felix.getName());
       System.out.println(felix.getFavoriteFood());
       System.out.println(felix.getAge());
       felix.makeNoise();
       felix.feedFood("Tuna");

       System.out.println("===============================================");

       Cat kt = new Cat("kt","tuna",3);
       System.out.println(kt.getName());
       System.out.println(kt.getFavoriteFood());
       System.out.println(kt.getAge());

      System.out.println("===============================================");



   }

   @Test
   public void creating_a_dog() {
      Dog fido = new Dog("Fido","Bone", 5);
      Assert.assertEquals(fido.getName(), "Fido");
      Assert.assertEquals(fido.getFavoriteToy(), "Bone");
      Assert.assertEquals(fido.getAge(), 5);
   }

   @Test
   public void cats_make_noise() {
      Cat felix = new Cat("Felix","Tuna",4);

//      felix.makeNoise();
//      felix.feedFood("Tuna");
//      felix.groom();
      System.out.println("Felix goes "+felix.makeNoise());

   }

   @Test
   public void dog_make_noise() {
      Dog fido = new Dog("Fido","Bone",5);
      System.out.println("Fido goes "+fido.makeNoise());
   }

   @Test
   public void pets_make_noise() {
      Pet felix = new Cat("Felix","Tuna",4);
      Pet fido = new Dog("Fido","Bone",5);
      Pet rusty = new Hampster("Rusty","Wheel",3);

      System.out.println("Felix walks "+felix.goForWalks());
      System.out.println("Felix goes " + felix.makeNoise());
      System.out.println("Fido goes " + fido.makeNoise());
      System.out.println("Rust goes "+rusty.makeNoise());
   }

   @Test
   public void static_fina_variable_learning() {
      System.out.println("=========================================");
      Cat felix = new Cat("Felix","Tuna",4);
      Cat kt = new Cat("kt","Salmon",3);

      System.out.println(felix.makeNoise());;
      System.out.println(kt.makeNoise());;
   }

   @Test
   public void creating_a_hampster() {
      Hampster rusty = new Hampster("Rusty","Wheel",1);
      Assert.assertEquals(rusty.getName(),"Rusty");
      Assert.assertEquals(rusty.getFavoriteGame(),"Wheel");
      Assert.assertEquals(rusty.getAge(),1);
   }
}
