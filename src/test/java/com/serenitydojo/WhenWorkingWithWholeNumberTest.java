package com.serenitydojo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithWholeNumberTest {
    @Test
    public void addingNumbersTogether(){
        int initialYr = 1985;
        int targetYr = 0;
        int jumpYr = 30;
        targetYr = initialYr + jumpYr;

        assertThat(targetYr, equalTo(2015));
    }
}
