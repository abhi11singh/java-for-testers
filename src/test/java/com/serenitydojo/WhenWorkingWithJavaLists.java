package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
public class WhenWorkingWithJavaLists {
    @Test
    public void creatingASimpleList() {
        List simpleList = new ArrayList();
        simpleList.add("a string value");
        simpleList.add(123);

        Assertions.assertThat(simpleList).contains("a string value",123);
    }

    @Test
    public void createATypeList() {
        List<String> names = new ArrayList<String>();
        List<Integer> ages = Arrays.asList(4,5,6);
        names.add("Abhishek");
        names.add("John");
        names.add("pete");
        assertThat(names).contains("Abhishek","John","pete");
        assertThat(ages).contains(4,5,6);
    }
    @Test
    public void removingStuff() {
        List<String> names = new ArrayList<String>();
        names.add("Joe");
        names.add("Pete");
        names.add("Sally");
        System.out.println(names);
        names.remove("Pete");
        System.out.println(names);

        names.clear();
        assertThat(names).isEmpty();
    }
    @Test
    public void immutableList() {
        //This type of list is immutable we can't add and remove values from this
        List<String> names = Arrays.asList("Abhi","Joe","Pete");

        //java.lang.UnsupportedOperationException
//        names.add("John");
//        names.remove("Joe");

    }
    @Test
    public void findElementInList() { //    0      1     2       3      4
        List<String> names = Arrays.asList("Abhi","Joe","Pete","Joe","Paul");
        int indexofJoe = names.indexOf("Joe");
        int lastIndexOfJoe = names.lastIndexOf("Joe");
        assertThat(indexofJoe).isEqualTo(1);
        assertThat(lastIndexOfJoe).isEqualTo(3);
    }
    @Test
    public void findingASubList() {
        List<String> name = Arrays.asList("Abhi","Joe","Pete","Joe","Paul");

        List<String> middleNames = name.subList(2,4);
        assertThat(middleNames).contains("Pete","Joe");
    }
    @Test
    public void findingTheSizeOfList() {
        List<String> name = Arrays.asList("Abhi","Joe","Pete","Joe","Paul");
        assertThat(name.size()).isEqualTo(5);
    }
    @Test
    public void convertingAListToSet() {
        List<String> name = Arrays.asList("Abhi","Joe","Pete","Joe","Paul");

        Set<String> uniqueName = new HashSet<String>(name);

        assertThat(uniqueName).containsExactlyInAnyOrder("Abhi","Joe","Pete","Paul");
    }
    @Test
    public void sortingAList() {
        List<String> name = Arrays.asList("Abhi","Joe","Pete","Joe","Paul");

        Collections.sort(name);
        assertThat(name).containsExactly("Abhi","Joe","Joe","Paul","Pete");
    }
    @Test
    public void findingMaxAndMin() {
        List<Integer> ages = Arrays.asList(7,88,9,2,3,2,55);
        assertThat(Collections.max(ages)).isEqualTo(88);
        assertThat(Collections.min(ages)).isEqualTo(2);
    }
    @Test
    public void combiningList() {
        List<String> names = new ArrayList<String>();
        names.add("Abhi");
        names.add("Bill");
        names.add("Paul");
        names.add("Vlad");
        names.add("Ram");

        List<String> moreNames = new ArrayList<String>();
        moreNames.add("Nitin");
        moreNames.add("Aprose");
        moreNames.add("Manasvi");
        moreNames.add("Ganesh");

        names.addAll(moreNames);
        assertThat(names).contains("Abhi","Paul","Vlad","Aprose","Nitin","Bill","Ram","Ganesh","Manasvi");

        names.removeAll(moreNames);
        assertThat(names).contains("Abhi","Bill","Paul","Vlad","Ram");
    }

    @Test
    public void numberList() {
        //NumberList can hold all type of number
        List<Number> favoriteNumbers = Arrays.asList(5,5.5,100000000000000000L,20.33333);
        assertThat(favoriteNumbers).contains(5,5.5,100000000000000000L,20.33333);

    }

}
