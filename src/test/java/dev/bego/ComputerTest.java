package dev.bego;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComputerTest {
    @Test
    public void testGettersAndSetters() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 10", 999.99);

        assertEquals("Dell", computer.getBrand());
        assertEquals(16, computer.getMemory());
        assertEquals("Intel i7", computer.getProcessor());
        assertEquals("Windows 10", computer.getOs());
        assertEquals(999.99, computer.getPrice());

        computer.setBrand("HP");
        computer.setMemory(32);
        computer.setProcessor("AMD Ryzen 5");
        computer.setOs("Linux");
        computer.setPrice(1299.99);

        assertEquals("HP", computer.getBrand());
        assertEquals(32, computer.getMemory());
        assertEquals("AMD Ryzen 5", computer.getProcessor());
        assertEquals("Linux", computer.getOs());
        assertEquals(1299.99, computer.getPrice());
    }

    @Test
    public void testConstructor() {
        Computer computer = new Computer("Apple", 8, "M1", "macOS", 1999.99);

        assertEquals("Apple", computer.getBrand());
        assertEquals(8, computer.getMemory());
        assertEquals("M1", computer.getProcessor());
        assertEquals("macOS", computer.getOs());
        assertEquals(1999.99, computer.getPrice());
    }
}
