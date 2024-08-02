package dev.bego;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreTest {
    private Store store;
    private StoreOwner owner;
    private Computer comp1;
    private Computer comp2;
    private Computer comp3;

    @BeforeEach
    public void setUp() {
        owner = new StoreOwner("Bego", 1997, "666");

        store = new Store("Super Computing", owner, "123-123-123");

        comp1 = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.00);
        comp2 = new Computer("HP", 8, "AMD Ryzen 5", "Windows 10", 800.00);
        comp3 = new Computer("Dell", 32, "Intel i9", "Windows 10", 2200.00);

        store.addComputer(comp1);
        store.addComputer(comp2);
        store.addComputer(comp3);
    }

    @Test
    public void testAddComputer() {
        Computer comp4 = new Computer("Acer", 16, "Intel i5", "Windows 10", 1000.00);
        store.addComputer(comp4);
        List<Computer> computers = store.searchComputerByBrand("Acer");
        assertEquals(1, computers.size());
        assertEquals(comp4, computers.get(0));
    }

    @Test
    public void testDeleteComputerByBrand() {
        store.deleteComputerByBrand("HP");
        List<Computer> computers = store.searchComputerByBrand("HP");
        assertEquals(0, computers.size());
    }

    @Test
    public void testSearchComputerByBrand() {
        List<Computer> dellComputers = store.searchComputerByBrand("Dell");
        assertEquals(2, dellComputers.size());
        assertTrue(dellComputers.contains(comp1));
        assertTrue(dellComputers.contains(comp3));
    }

    @Test
    public void testListAllComputers() {
        List<Computer> computers = store.getComputers();
        assertEquals(3, computers.size());
        assertTrue(computers.contains(comp1));
        assertTrue(computers.contains(comp2));
        assertTrue(computers.contains(comp3));
    }

    @Test
    public void testGettersAndSetters() {

        assertEquals("Super Computing", store.getName());
        assertEquals(owner, store.getOwner());
        assertEquals("123-123-123", store.getNif());
        assertNotNull(store.getComputers());
        
        StoreOwner owner2 = new StoreOwner("Miku", 2007, "67890");

        store.setName("New Store");
        store.setOwner(owner2);
        store.setNif("654321");

        assertEquals("New Store", store.getName());
        assertEquals(owner2, store.getOwner());
        assertEquals("654321", store.getNif());
    }
}
