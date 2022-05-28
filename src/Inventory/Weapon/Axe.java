package Inventory.Weapon;

public class Axe extends Weapon{
    public Axe(int streght, int cost, int weight,int attack,int speedAttack) {
        super(streght, cost, weight, attack, speedAttack);
    }

    public void equip() {

}
    public void attack() {
        System.out.println("Атака топором");
    }
}
