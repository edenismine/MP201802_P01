package mx.unam.fciencias.myp.models.characters;

import mx.unam.fciencias.myp.models.weapons.Weapon;
import org.jetbrains.annotations.NotNull;

/**
 * Knight character.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public class Knight extends GameCharacter {
    /**
     * All knight characters should have a name and be equipped with a weapon at all times.
     *
     * @param weapon the Knight character's initial weapon.
     * @param name   the Knight character's name.
     */
    public Knight(@NotNull Weapon weapon, @NotNull String name) {
        super(weapon, name, "Knight");
    }
}
