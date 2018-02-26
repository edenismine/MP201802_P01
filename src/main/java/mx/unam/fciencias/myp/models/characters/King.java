package mx.unam.fciencias.myp.models.characters;

import mx.unam.fciencias.myp.models.weapons.Weapon;
import org.jetbrains.annotations.NotNull;

/**
 * King character.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public class King extends GameCharacter {
    /**
     * All king characters should have a name and be equipped with a weapon at all times.
     *
     * @param weapon the king character's initial weapon.
     * @param name   the king character's name.
     */
    public King(@NotNull Weapon weapon, @NotNull String name) {
        super(weapon, name, "King");
    }
}
