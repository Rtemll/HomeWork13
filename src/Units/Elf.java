package Units;

import Inventory.Armor.Armor;
import Inventory.Weapon.Weapon;

public class Elf extends Unit{
    public Elf(String name, int hp, int attack, int protection, int money, Weapon weapon, Armor armor) {
        super(name, hp, attack, protection, money, weapon, armor);
    }
    public void attack(Unit target) {
        int i = 1;
        int y = 1;
        int damage = (attack + weapon.attack) - (target.protection+ target.armor.armor);
        if (damage > 0) {
            target.hp -= damage;
            System.out.println(name + " наносит " + damage + " урона ");
            System.out.println("Здоровье " + target.name + " : " + target.hp);

        } else
            System.out.println("Броня не пробита!");
        if (target.hp < 0) {
            System.out.println("(Противник пал смертью храбрых)");
        }
    }
}
