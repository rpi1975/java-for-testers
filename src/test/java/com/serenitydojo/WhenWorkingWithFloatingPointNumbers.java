package com.serenitydojo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class WhenWorkingWithFloatingPointNumbers {

    @Test
    public void convertCelciusToFahrenheit(){
        float celcius = 25;
        float fahrenheit = ((9f/5f) * celcius) + 32;

        assertThat(fahrenheit, equalTo(77f));

    }

    @Test
    public void convertKgToPounds(){
        float kg = 70;
        final float kgToPound = 2.2046f;
        float pounds = kg * kgToPound;

        assertThat(pounds, equalTo(154.322F));
    }
}
