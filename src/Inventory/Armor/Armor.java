package Inventory.Armor;

import Inventory.Item;

public abstract class Armor {
    public String name;
    public int streght;
    public int cost;
    public int weight;
    public int armor;

    public Armor(int streght, int cost, int weight, int armor) {
        this.streght = streght;
        this.cost = cost;
        this.weight = weight;
        this.armor = armor;
    }
    public void equip() {
        System.out.println("Предмет экипирован");

    }

    public void changeStrenght() {
        streght += 1;
    }
}
