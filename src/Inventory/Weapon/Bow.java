package Inventory.Weapon;

public class Bow extends Weapon{
    public Bow(int streght, int cost, int weight, int attack,int speedAttack) {
        super(streght, cost, weight, attack, speedAttack);
    }
    public void attack() {
        System.out.println("Стреляет из лука");

    }
    public void equip() {

    }
}
