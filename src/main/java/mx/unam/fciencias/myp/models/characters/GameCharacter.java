package mx.unam.fciencias.myp.models.characters;

import mx.unam.fciencias.myp.models.weapons.Weapon;
import mx.unam.fciencias.myp.utils.Direction;
import mx.unam.fciencias.myp.utils.GameVector;
import mx.unam.fciencias.myp.utils.Position;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An abstract game character.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public abstract class GameCharacter {
    private final String characterType;
    private Position position = new Position(0, 0);
    private Weapon weapon;
    private String name;

    /**
     * All characters should have a name and be equipped with a weapon at all times.
     *
     * @param weapon        the character's initial weapon.
     * @param name          the character's name.
     * @param characterType the character's character type. (reduces the need for using {@link java.lang.reflect})
     */
    GameCharacter(@NotNull Weapon weapon, @NotNull String name, @NotNull String characterType) {
        if (!name.isEmpty() && !characterType.isEmpty()) {
            this.weapon = weapon;
            this.name = name;
            this.characterType = characterType;
        } else {
            throw new IllegalArgumentException("@NotNull parameter is null or empty");
        }
    }

    /**
     * The character moves in the specified direction.
     *
     * @param vector The direction the character should move in, or the position itself.
     */
    public void move(GameVector vector) {
        if (vector != null) {
            if (vector instanceof Direction)
                position.setLocation(position.x + vector.x, position.y + vector.y);
            else if (vector instanceof Position)
                position.setLocation(vector);
        }
    }

    /**
     * The character attacks using their weapon.
     */
    public void attack() {
        System.out.println(this + weapon.attack());
    }

    /**
     * A character can pick up a new weapon by dropping their current one.
     *
     * @param other the weapon the character picked up.
     * @return the character's old weapon or null if the weapon that was passed was already equipped.
     */
    @Nullable
    public Weapon swapWeapon(Weapon other) {
        Weapon droppedWeapon;
        if (this.weapon.equals(other)) {
            droppedWeapon = null;
        } else {
            droppedWeapon = this.weapon;
            this.weapon = other;
        }
        return droppedWeapon;
    }

    @Override
    public String toString() {
        return String.format("%s %s (at %f, %f): ", characterType, name, position.x, position.y);
    }


}

