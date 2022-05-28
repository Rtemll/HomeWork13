package Units;

import Inventory.Armor.Armor;
import Inventory.Weapon.Weapon;

public class Unit {
    public String name;
    public int hp;
    public int attack;
    public int protection;
    public int money;
    public Weapon weapon;
    public Armor armor;

    public interface drop {
    }

    public Unit(String name, int hp,int attack, int protection, int money,Weapon weapon, Armor armor) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.protection = protection;
        this.money = money;
        this.weapon = weapon;
        this.armor = armor;
    }

    public void attack() {

        armor.equip();
        weapon.equip();
//        armor.equip();
    }

}
