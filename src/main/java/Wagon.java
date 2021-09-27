public class Wagon implements Tradable, Drivable {

    private int speed;
    private int maxSpeed;
    private int price;

    public Wagon(int price, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void upgradeSpeed() {
        maxSpeed += 1;
    }

    @Override
    public void downgradeSpeed() {
        if (maxSpeed > 1) {
            maxSpeed -= 1;
        }
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
