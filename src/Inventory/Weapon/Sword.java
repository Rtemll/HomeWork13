package Inventory.Weapon;

public class Sword extends Weapon{
    public Sword(int streght, int cost, int weight,int attack,int speedAttack) {
        super(streght, cost, weight, attack, speedAttack);
    }
    public void attack() {
        System.out.println("Атака мечом");

    }
    public void equip() {

    }
}
