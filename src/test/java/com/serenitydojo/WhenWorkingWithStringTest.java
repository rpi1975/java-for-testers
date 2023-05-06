package com.serenitydojo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStringTest {
//    Exercise 1 - Converting to lower case
//    Exercise 2 - Converting to upper case
//    Exercise 3 - Trim extra space
//    Exercise 4 - Finding the length of a string
//    Exercise 5 - Replacing text in a string

    @Test
    public void convertToLowerCase(){
        String str = "This is a string";

        assertThat(str.toLowerCase(), equalTo("this is a string"));
    }

    @Test
    public void convertToUpperCase(){
        String str = "This is a string";

        assertThat(str.toUpperCase(), equalTo("THIS IS A STRING"));
    }

    @Test
    public void trimExtraSpace(){
        String str = "   This is a string          ";

        assertThat(str.trim(), equalTo("This is a string"));
    }

    @Test
    public void stringLength(){
        String str = "This is a string";

        assertThat(str.length(), equalTo(16));
    }

    @Test
    public void replaceString(){
        String str = "This is a string";

        assertThat(str.replace("This is", "These are"), equalTo("These are a string"));
    }
}
