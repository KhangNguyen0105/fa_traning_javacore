public class HCN {
    private Diem diem1;;
    private Diem diem2;

    public HCN() {

    }

    public HCN(Diem diem1, Diem diem2) {
        this.diem1 = diem1;
        this.diem2 = diem2;
    }
    

    public void ganDiem1(Diem diem1) {
        this.diem1 = diem1;
    }

    public Diem layDiem1() {
        return diem1;
    }

    public void ganDiem2(Diem diem2) {
        this.diem2 = diem2;
    }

    public Diem layDiem2() {
        return diem2;
    }

    public double chieuRong() {
        return diem1.khoangCach(diem1.layX(), diem2.layY());
    }

    public double chieuDai() {
        return diem2.khoangCach(diem1.layX(), diem2.layY());
    }

    public double chuVi() {
        return 2 * (this.chieuDai() + this.chieuRong());
    }

    public double dienTich() {
        return this.chieuDai() * this.chieuRong();
    }

    public String toString() {
        return "[(" + this.diem1.layX() + ", " + this.diem1.layY() + "), (" 
        + this.diem2.layX() + ", " + this.diem2.layY() + ")]";
    }

    public void hienThi() {
        System.out.println(this.toString());
        System.out.println("Chu vi: " + this.chuVi());
        System.out.println("Dien tich: " + this.dienTich());
    }
}
