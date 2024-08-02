package dev.bego;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private String name;
    private StoreOwner owner;
    private String nif;

    private List<Computer> computers;

    public Store(String name, StoreOwner owner, String nif) {
        this.name = name;
        this.owner = owner;
        this.nif = nif;
        this.computers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StoreOwner getOwner() {
        return owner;
    }

    public void setOwner(StoreOwner owner) {
        this.owner = owner;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void deleteComputerByBrand(String brand) {
        // for (int i = computers.size() - 1; i >= 0; i--) { // en orden inverso deja de
        // haber problema eliminando indices
        // if (computers.get(i).getBrand().equalsIgnoreCase(brand)) {
        // computers.remove(i);
        // }
        // }
        computers.removeIf(computer -> computer.getBrand().equalsIgnoreCase(brand)); // Una alternativa con un metodo mas moderno waaaw
                                                                                     

    }

    public List<Computer> searchComputerByBrand(String brand) {
        List<Computer> computersByBrand = new ArrayList<>();

        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                computersByBrand.add(computer);
            }
        }
        return computersByBrand;
    }

    public void displayAllComputers() {
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }

}
