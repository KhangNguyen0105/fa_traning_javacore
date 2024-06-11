public class PS {
    protected int tu;
    protected int mau;

    public PS() {

    }

    public PS(int n) {
        tu = n;
        mau = 1;
    }

    public PS(int t, int m) {
        tu = t;
        mau = m;
    }

    public PS(PS p) {
        tu = p.tu;
        mau = p.mau;
    }

    public void ganTu(int t) {
        tu = t;
    }

    public int layTu() {
        return tu;
    }

    public void ganMau(int m) {
        if (m != 0)
            mau = m;
        else
            System.out.println("Loi");
    }

    public int layMau() {
        return mau;
    }

    public void hienThi() {
        System.out.println(tu + "/" + mau);
    }

    public int GCD(int a, int b) {
        if (b == 0)
            return a;
        else return GCD(b, a % b);
    }

    private void rutGon() {
        int temp = GCD(tu, mau);
        tu /= temp;
        mau /= temp;
    }

    public void tang(int n) {
        tu += n;
    }

    public void gap(int n) {
        tu *= n;
    }

    public PS cong(int n) {
        PS temp = new PS(n, 1);
        PS res = new PS(tu, mau);
        res.tu = res.tu * temp.mau + temp.tu * res.mau;
        res.mau = res.mau * temp.mau;

        res.rutGon();
        return res;
    }

    public PS cong(PS p) {
        PS res = new PS(tu, mau);
        res.tu = res.tu * p.mau + p.tu * res.mau;
        res.mau = res.mau * p.mau;

        res.rutGon();
        return res;
    }

    public PS tru(int n) {
        PS temp = new PS(n, 1);
        PS res = new PS(this.tu, this.mau);
        res.tu = res.tu * temp.mau - temp.tu * res.mau;
        res.mau = res.mau * temp.mau;

        res.rutGon();
        return res;
    }

    public PS tru(PS p) {
        PS res = new PS(tu, mau);
        res.tu = res.tu * p.mau - p.tu * res.mau;
        res.mau = res.mau * p.mau;

        res.rutGon();
        return res;
    }

    public PS nhan(int n) {
        PS res = new PS(tu, mau);
        res.tu *= n;

        res.rutGon();
        return res;
    }

    public PS nhan(PS p) {
        PS res = new PS(tu, mau);
        res.tu *= p.tu;
        res.mau *= p.mau;

        res.rutGon();
        return res;
    }

    public PS chia(int n) {
        PS res = new PS(tu, mau);
        res.mau *= n;

        res.rutGon();
        return res;
    }

    public PS chia(PS p) {
        PS res = new PS(tu, mau);
        res.tu *= p.mau;
        res.mau *= p.tu;

        res.rutGon();
        return res;
    }

    public String toString() {
        return tu + "/" + mau;
    }

    public int soSanh(PS p) {
        double PSNay = (double)tu / mau;
        double PSKia = (double)p.tu / p.mau;

        if (PSNay < PSKia) return -1;
        else if (PSNay > PSKia) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        PS p = new PS(1, 2);
        PS q = new PS(5, 7);
        
        p.tru(1);
        p.hienThi();
    }
}
