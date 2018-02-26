package mx.unam.fciencias.myp.models.weapons;

import org.jetbrains.annotations.NotNull;

/**
 * A knife swishes.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public class Knife implements Weapon {
    @NotNull
    @Override
    public String attack() {
        return "*swung their knife* SWIISH!";
    }
}
