package oop.project;

/**
 * A general class representing a force field.
 * Force can depend on position, rotation, velocity, mass and time.
 */
public interface IForceField {
    /**
     * Returns force generated by this force field for given properties.
     *
     * @param position Given position of the object to apply the force to
     * @param rotation Direction the object is pointing in
     * @param velocity Velocity of the object to apply force to
     * @param mass     mass of the object
     * @param time     the current time
     * @return Generated force vector
     */
    Vector getForce(Vector position, Vector rotation, Vector velocity, double mass, double time);
}