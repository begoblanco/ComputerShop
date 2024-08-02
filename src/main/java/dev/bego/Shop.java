package dev.bego;

public class Shop {
    
    private String name;
    private ShopOwner owner;
    private int nif;

    public Shop(String name, ShopOwner owner, int nif) {
        this.name = name;
        this.owner = owner;
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShopOwner getOwner() {
        return owner;
    }

    public void setOwner(ShopOwner owner) {
        this.owner = owner;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    
    
}
