package Inventory.Weapon;

public class Staff extends Weapon{
    public Staff(int streght, int cost, int weight, int attack, int speedAttack) {
        super(streght, cost, weight, attack, speedAttack);
    }
    public void attack() {
        System.out.println(" Колдует посохом");

    }
}
