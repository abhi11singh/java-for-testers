package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import org.assertj.core.api.ListAssert.*;
public class WhenAddingNumbers {
    @Test
    public void shouldAddTwoIntegersCorrectly() {
        int a = 1;
        int b = 2;

        int sum = a + b;

        assertThat(sum).isEqualTo(4);
        assertThat(sum).isBetween(1,5);

    }
    @Test
    public void assertStrings() {
        String color = "red";
        String otherColor = "Red";
        assertThat(color).isEqualToIgnoringCase(otherColor);

        String multipleColor = "red,green,blue";
        assertThat(multipleColor).contains("red");
        assertThat(multipleColor).startsWith("red");
        assertThat(multipleColor).containsPattern("[g|G]reen");
    }
    @Test
    public void assertCollections() {
        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).hasSize(3);
        assertThat(colors).contains("red");
        assertThat(colors).doesNotContain("yellow");
        assertThat(colors).containsExactly("red","green","blue");
        assertThat(colors).containsExactlyInAnyOrder("blue","green","red");
    }
}
