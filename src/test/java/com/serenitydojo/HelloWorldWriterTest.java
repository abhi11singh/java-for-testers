package com.serenitydojo;

import org.junit.Test;

import java.util.Locale;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsol() {
        HelloWorldWriter writer=new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalvariables() {
//        Integer age=42;
//        age=age+1;
//        System.out.println("age = "+age);

        final int ageThisYear = 42;
        int ageNextYear = ageThisYear +1;
        System.out.println("age Next year = "+ageNextYear);

        long tradeID=202303260000L;
        float weight =15.54F;
        double weight1 =15.54;

    }

    @Test
    public void workingWithStrings() {
        String firstName = "  Abhishek  ";

        String upperCaseFirstName = firstName.toUpperCase();

        System.out.println(upperCaseFirstName);

        System.out.println("Length of String firstName "+firstName.length());

        System.out.println(firstName.trim());

    }
}
