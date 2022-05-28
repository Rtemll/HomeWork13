package Inventory;

public abstract class Item {
    public String name;
    public int streght;
    public int cost;
    public int weight;

    public Item(int streght, int cost, int weight) {
        this.streght = streght;
        this.cost = cost;
        this.weight = weight;
    }

    public Item(int armor) {
    }

    public abstract void equip();

    }

