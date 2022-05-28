package Units;

import Inventory.Armor.Armor;
import Inventory.Weapon.Weapon;

public class Witch extends Unit{

    public Witch(String name, int hp, int attack, int protection, int money, Weapon weapon, Armor armor) {
        super(name, hp, attack, protection, money, weapon, armor);
    }
    public void witchCraft(){
        System.out.println(name + "колдует!");
    }

}

