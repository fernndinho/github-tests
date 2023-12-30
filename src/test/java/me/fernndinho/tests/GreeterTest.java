package me.fernndinho.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreeterTest {

    @Test
    public void shouldReturnCorrectHelloMessage() {
        String expectedMessage = "Hello Pep2ito!";

        String message = Greeter.getHelloMessage("Pepito");

        Assertions.assertEquals(expectedMessage, message);
    }
}
