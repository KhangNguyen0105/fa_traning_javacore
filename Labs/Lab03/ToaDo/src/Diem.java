import java.lang.Math;

public class Diem {
    private int x;
    private int y;

    public Diem() {

    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Diem(Diem p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void ganX(int x) {
        this.x = x;
    }

    public int layX() {
        return x;
    }

    public void ganY(int y) {
        this.y = y;
    }

    public int layY() {
        return y;
    }

    public double khoangCach(Diem p) {
        double khoangCach = 0;
        khoangCach = Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
        return khoangCach;
    }

    public double khoangCach(int x, int y) {
        double khoangCach = 0;
        khoangCach = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return khoangCach;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
