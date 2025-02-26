package com.ejemplo.animales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
    public void testMakeSound() {
        Dog dog = new Dog("Firulais");
        assertEquals("Woof!", dog.makeSound());
    }
    @Test
    public void testGetName() {
        Dog dog = new Dog("Firulais");
        assertEquals("Firulais", dog.getName());
    }
}
