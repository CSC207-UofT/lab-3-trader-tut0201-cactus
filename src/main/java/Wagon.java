public class Wagon implements Tradable, Drivable {

    private int speed;
    private int maxSpeed;
    private int price;

    /**
     * Constructor for the Wagon class
     *
     * @param price     the price of this wagon
     * @param maxSpeed  the maximum speed of this wagon
     */
    public Wagon(int price, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.speed = 0;
    }

    /**
     * Getter for this wagon's speed
     *
     * @return current speed of the wagon
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Upgrades the maximum speed of this wagon. Implemented from
     * Drivable interface.
     */
    @Override
    public void upgradeSpeed() {
        maxSpeed += 1;
    }

    /**
     * Downgrades the maximum speed of this wagon only if the maximum
     * speed is greater than 1. If it is not, nothing is done.
     * Implemented from Drivable interface.
     */
    @Override
    public void downgradeSpeed() {
        if (maxSpeed > 1) {
            maxSpeed -= 1;
        }
    }

    /**
     * Getter for this wagon's maximum speed. Implmented from Drivable
     * interface.
     *
     * @return the maximum speed of this wagon
     */
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Getter for this wagon's price. Implemented from Tradable
     * interface.
     *
     * @return this price of this wagon
     */
    @Override
    public int getPrice() {
        return price;
    }
}
