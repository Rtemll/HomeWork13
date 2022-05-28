package Inventory.Weapon;

public class Hammer extends Weapon{

    public Hammer(int streght, int cost, int weight, int attack,int speedAttack) {
        super(streght, cost, weight,attack,speedAttack);
    }

    public void attack() {
        System.out.println("Атака молотом");

    }

    public void equip() {

    }
}
