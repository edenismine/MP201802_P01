package mx.unam.fciencias.myp.models.characters;

import mx.unam.fciencias.myp.models.weapons.Weapon;
import org.jetbrains.annotations.NotNull;

/**
 * Queen character.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public class Queen extends GameCharacter {
    /**
     * All queen characters should have a name and be equipped with a weapon at all times.
     *
     * @param weapon the Queen character's initial weapon.
     * @param name   the Queen character's name.
     */
    public Queen(@NotNull Weapon weapon, @NotNull String name) {
        super(weapon, name, "Queen");
    }
}
