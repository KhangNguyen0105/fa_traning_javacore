package fa.training.entities;

public interface Shape {
    public abstract int calculatePerimeter();
    public abstract int calculateArea();
    public abstract int getLength();
    public abstract int getWidth();
    abstract void setLengthWidth(int len, int width);
}
