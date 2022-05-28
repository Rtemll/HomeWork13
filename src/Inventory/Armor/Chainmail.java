package Inventory.Armor;

public class Chainmail extends Armor{
    public Chainmail(int streght, int cost, int weight, int armor) {
        super(streght, cost, weight, armor);
    }
    public void equip() {
        System.out.println("Предмет экипирован");

    }

    public void changeStrenght() {
        streght += 1;
    }
}
