package Inventory.Armor;

public class Mantle extends Armor{
    public Mantle(int streght, int cost, int weight, int armor) {
        super(streght, cost, weight, armor);
    }
    public void equip() {
        System.out.println("Предмет экипирован");

    }

    public void changeStrenght() {
        streght += 1;
    }
}
