package mx.unam.fciencias.myp.models.weapons;

import org.jetbrains.annotations.NotNull;

/**
 * An axe swooshes.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public class Axe implements Weapon {
    @NotNull
    @Override
    public String attack() {
        return "*swung their axe* SWOOSH!";
    }
}