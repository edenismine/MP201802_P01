package mx.unam.fciencias.myp.models.weapons;

import org.jetbrains.annotations.NotNull;

/**
 * A hammer clangs.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public class Hammer implements Weapon {
    @NotNull
    @Override
    public String attack() {
        return "*swung their hammer* CLAAANG!";
    }
}
