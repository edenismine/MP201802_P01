package mx.unam.fciencias.myp.models.weapons;

import org.jetbrains.annotations.NotNull;

/**
 * A weapon with custom behaviour when used to attack.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public interface Weapon {
    @NotNull
    String attack();
}

