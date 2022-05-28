import Inventory.Armor.*;
import Inventory.Weapon.*;
import Units.*;

import java.io.*;

public class Run {


    public static void main(String[] args) throws IOException {
        File file = new File("./src/data.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));



        Axe axe = new Axe(15, 2500, 12,30,20);
        Hammer hammer = new Hammer(15, 3200, 15, 25,20);
        Sword sword = new Sword(15, 2100, 10, 20,23);
        Bow bow = new Bow(11,3000,12,30,7);
        Staff staff = new Staff(10,4000,20,40, 10);
        Helmet helmet = new Helmet(15, 2300, 7, 15);
        Chainmail chainmail = new Chainmail(20,3500, 20,55);
        Gloves gloves = new Gloves(13, 1400,2,12);
        Boots boots = new Boots(12,1350,5,14);
        Mantle mantle = new Mantle(14, 4300,7, 20);
        Shield shield = new Shield(20, 3000, 15,40);
        Unit orc = new Unit("Орче", 100, 25, 40, 100, axe, shield);
        Dragon deathWing = new Dragon("DeathWing", 200, 30, 50, 0, axe, boots);
        DarkElf nigga = new DarkElf("Nigga", 80,30,20, 1200, bow, chainmail);
        Dwarf gnom = new Dwarf("Gnom", 100,30,30,3000,hammer,shield);
        Elf elf = new Elf("Elf", 77, 20,22,2300,sword,shield);
        Human chelovek = new Human("Chelovek", 80, 30,30, 3000,sword,helmet);
        Witch helga = new Witch("Helga", 70, 30,40,2000,staff, mantle);


//        oos.writeObject(new Human("Chelovek", 80, 30,30, 3000,sword,helmet));
//        oos.close();

        deathWing.weapon = axe; //выдали оружие дракону
        deathWing.armor = boots; // выдали ботинки дракону
        orc.weapon = axe;// выдали орку топор
        orc.armor = shield; // выдали орку щит
        nigga.weapon = bow;
        nigga.armor = chainmail;
        gnom.weapon = hammer;
        gnom.armor = shield;
        elf.weapon = sword;
        elf.armor = shield;
        chelovek.weapon = sword;
        chelovek.armor = shield;
        helga.weapon = staff;
        helga.armor = mantle;

//        System.out.println(axe.streght);
//        System.out.println(orc.hp);
//        orc.attack();
        deathWing.attack(orc);
        orc.attack();
        OrkFactory.create();// создание орков
        System.out.println(OrkFactory.create());

    }
}
