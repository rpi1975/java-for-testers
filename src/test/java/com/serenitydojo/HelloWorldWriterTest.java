package com.serenitydojo;

import org.junit.Test;


public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorld(){
        HelloWorldWriter helloWorldWriter = new HelloWorldWriter();
        helloWorldWriter.writeGreeting();

    }
}
