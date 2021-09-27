/**
 * Cow
 */
public class Cow implements Tradable, Domesticatable{

    private int age;

    public Cow() {
        this.age = 1;
    }

    /**
     * Override Domesticatable interface to return cow sound.
     * @return Return the "Moo" sound
     */
    @Override
    public String sound() {
        return "Moo!";
    }

    /**
     * Override Tradable interface to get price of cow.
     * @return Return the price of the cow, which corresponds to their age
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
