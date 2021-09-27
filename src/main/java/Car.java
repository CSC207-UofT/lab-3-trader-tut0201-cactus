public class Car implements  Tradable, Drivable, Domesticatable{
    private int maxSpeed;
    private int price;
    public Car(int maxSpeed, int price){ this.maxSpeed = maxSpeed; this.price = price; }
    @Override
    public String sound() { return "Vrooom!"; }
    @Override
    public void upgradeSpeed() { this.maxSpeed += 10; }
    @Override
    public void downgradeSpeed() { this.maxSpeed -= 10; }
    @Override
    public int getMaxSpeed() { return this.maxSpeed; }
    @Override
    public int getPrice() { return this.price; }
    @Override
    public String toString(){ String id = super.toString(); return id + " (Max speed: " + this.maxSpeed +")"; }
}
