package fa.training.entities;
public class Sedan extends Car {
    private int length;

    public Sedan() {

    }

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) return regularPrice * 0.95;
        return regularPrice * 0.9;
    }
}
