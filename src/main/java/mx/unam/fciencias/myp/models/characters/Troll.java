package mx.unam.fciencias.myp.models.characters;

import mx.unam.fciencias.myp.models.weapons.Weapon;
import org.jetbrains.annotations.NotNull;

/**
 * Troll character.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public class Troll extends GameCharacter {
    /**
     * All troll characters should have a name and be equipped with a weapon at all times.
     *
     * @param weapon the Troll character's initial weapon.
     * @param name   the Troll character's name.
     */
    public Troll(@NotNull Weapon weapon, @NotNull String name) {
        super(weapon, name, "Troll");
    }
}
