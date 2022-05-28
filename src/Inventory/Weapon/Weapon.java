package Inventory.Weapon;

import Inventory.Item;

public abstract class Weapon {
    public String name;
    public int streght;
    public int cost;
    public int weight;
    public int attack;
    public int speedAttack;

    public Weapon(int streght, int cost, int weight, int attack, int speedAttack) {
        this.streght = streght;
        this.cost = cost;
        this.weight = weight;
        this.attack = attack;
        this.speedAttack = speedAttack;
    }

        public void equip() {
            }

    public void attack() {


    }

}
