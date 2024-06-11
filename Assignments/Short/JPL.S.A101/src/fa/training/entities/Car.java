package fa.training.entities;
public abstract class Car {
    protected int speed;
    protected double regularPrice;
    protected String color;

    public Car() {
        
    }

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public abstract double getSalePrice();
}
