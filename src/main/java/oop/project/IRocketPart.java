package oop.project;

/**
 * A general interface representing a part of rocket.
 * Each part can have mass, can create thrust and attempt to change the direction of the rocket.
 */
public interface IRocketPart {
    /**
     * Calculates current mass of this part.
     *
     * @return mass of this part
     */
    double getMass();

    /**
     * Calculates thrust generated by this part. May change state of this or other parts (for example use fuel)
     *
     * @param direction The direction vector of the rocket
     * @param time      Current time
     * @param deltaTime Time delta from now, to the next.
     * @return Thrust force
     */
    default Vector createThrust(Vector direction, double time, double deltaTime) {
        return new Vector(0, 0);
    }

    /**
     * Calculates change in rocket rotation caused by this part.
     *
     * @param currentDirection current direction of the rocket (radians)
     * @param time             current time
     * @return change in rotation angle of the rocket (radians)
     */
    default double changeDirection(double currentDirection, double time) {
        return 0;
    }
}
