package mx.unam.fciencias.myp;

import mx.unam.fciencias.myp.models.characters.*;
import mx.unam.fciencias.myp.models.weapons.Axe;
import mx.unam.fciencias.myp.models.weapons.Hammer;
import mx.unam.fciencias.myp.models.weapons.Knife;
import mx.unam.fciencias.myp.models.weapons.Sword;
import mx.unam.fciencias.myp.utils.Direction;

/**
 * Game demo.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public class Demo {
    /*   SOME CONSTANTS   */
    private static final Sword SWORD = new Sword();
    private static final Knife KNIFE = new Knife();
    private static final Hammer HAMMER = new Hammer();
    private static final Axe AXE = new Axe();

    /**
     * Main demo
     *
     * @param args CL arguments.
     */
    public static void main(String[] args) {
        GameCharacter[] everyone = new GameCharacter[]{
                new King(SWORD, "Arthur"),
                new Queen(KNIFE, "Guinevere"),
                new Troll(HAMMER, "Catrina"),
                new Knight(AXE, "Lancelot")
        };
        System.out.println("Narrator: Everyone attacked the intruder!");
        for (GameCharacter character : everyone)
            character.attack();
        System.out.println("Narrator: Everyone moved forward to pick their price after defeating the intruder.");
        for (GameCharacter character : everyone) {
            character.move(Direction.NORTH);
            character.swapWeapon(SWORD);
        }
        System.out.println("Narrator: They all got a new sword!");
        for (GameCharacter character : everyone)
            character.attack();
    }
}
