package dev.bego;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StoreOwnerTest {
    @Test
    public void testGettersAndSetters() {
        StoreOwner owner = new StoreOwner("Miku", 2007, "12345");

        assertEquals("Miku", owner.getName());
        assertEquals(2007, owner.getBirthYear());
        assertEquals("12345", owner.getId());

        owner.setName("Bego");
        owner.setBirthYear(1997);
        owner.setId("67890");

        assertEquals("Bego", owner.getName());
        assertEquals(1997, owner.getBirthYear());
        assertEquals("67890", owner.getId());
    }

    @Test
    public void testConstructor() {
        StoreOwner owner = new StoreOwner("Mizifu", 2020, "54321");

        assertEquals("Mizifu", owner.getName());
        assertEquals(2020, owner.getBirthYear());
        assertEquals("54321", owner.getId());
    }
}
