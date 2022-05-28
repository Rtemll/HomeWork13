package Inventory.Armor;

public class Shield extends Armor{
    public Shield(int strenght, int cost, int weight, int armor) {
        super(strenght, cost, weight, armor);
    }
    public void equip() {
        System.out.println("Предмет экипирован");

    }

    public void changeStrenght() {
        streght += 1;
    }
}
