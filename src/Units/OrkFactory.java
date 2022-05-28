package Units;

import Inventory.Armor.Armor;
import Inventory.Armor.Shield;
import Inventory.Weapon.Axe;
import Inventory.Weapon.Weapon;

public class OrkFactory {
    private static Weapon Axe;
    private static Armor Shield;



    public static Unit create() {
        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"
        int random_attack = a + (int) (Math.random() * b);
        int random_protection = a + (int) (Math.random() * b);
        int random_money = a + (int) (Math.random() * b);
        Unit ork = new Unit("Ubiyca", 1000, random_attack, random_protection, random_money, Axe, Shield);// как-то реализовать рандом..... типо хп от 100 до 150, и тд

        return ork;
    }
}