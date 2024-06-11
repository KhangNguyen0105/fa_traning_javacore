public class ATM {
    private String soTK;
    private double soDu;

    public ATM(String stk, double soDu) {
        this.soTK = stk;
        this.soDu = soDu;
    }

    public String laySTK() {
        return soTK;
    }

    public double laySoDU() {
        return soDu;
    }

    public String toString() {
        return "So tai khoan: " + soTK + "\nSo du: " + soDu;
    }

    public void napTien(double st) {
        soDu += st;
    }

    public boolean rutTien(double st) {
        if (soDu < st) return false;
        soDu -= st;
        return true;
    }

    public boolean chuyenTien(ATM tk, double st) {
        if (soDu < st) return false;
        tk.soDu += st;
        soDu -= st;
        return true;
    }

    public static void main(String[] args) {
        ATM [] a = new ATM[5];
        a[0] = new ATM("TK001", 100);
        a[1] = new ATM("TK002", 100);
        a[2] = new ATM("TK003", 100);
        a[3] = new ATM("TK004", 100);
        a[4] = new ATM("TK005", 100);

        a[0].napTien(1000);
        a[0].chuyenTien(a[1], 500);
        a[1].rutTien(200);

        double sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i].toString());
            sum += a[i].soDu;
        }

        System.out.println("Tong so du cac tai khoan: " + sum);
    }
}
