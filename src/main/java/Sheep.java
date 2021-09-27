/**
 * Sheep
 */
public class Sheep implements Tradable, Domesticatable{

    private int age;

    public Sheep() {
        this.age = 1;
    }

    /**
     * Override Domesticatable interface to return sheep sound.
     * @return Return the "Bah" sound
     */
    @Override
    public String sound() {
        return "Bah!";
    }

    /**
     * Override Tradable interface to get price of sheep.
     * @return Return the price of the sheep, which corresponds to their age
     */
    @Override
    public int getPrice() {
        return (10 - this.age) * 2;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Age: " + this.age +")";
    }
}
