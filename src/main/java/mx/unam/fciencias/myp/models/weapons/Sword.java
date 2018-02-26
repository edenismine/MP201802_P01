package mx.unam.fciencias.myp.models.weapons;

import org.jetbrains.annotations.NotNull;

/**
 * A sword shings.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public class Sword implements Weapon {
    @NotNull
    @Override
    public String attack() {
        return "*swung their sword* SHIIING!";
    }
}
