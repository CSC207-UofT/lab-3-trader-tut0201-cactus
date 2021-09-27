public class Cow implements Domesticatable, Tradable {

    public Cow() {}

    @Override
    public String sound() {
        return "Moooo!";
    }


    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

