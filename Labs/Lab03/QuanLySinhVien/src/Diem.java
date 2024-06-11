public class Diem {
    private String tenHocPhan;
    private int soTinChi;
    private double chuyenCan;
    private double giuaKy;
    private double cuoiKy;

    public Diem(String tenHocPhan, int soTinChi, double chuyenCan, double giuaKy, double cuoiKy) {
        if (soTinChi < 1 || soTinChi > 4 ) {
            System.out.println("So tin chi hong hop le");
            return;
        }
        if (chuyenCan < 0 || chuyenCan > 10) {
            System.out.println("Diem chuyen can khong hop le");
            return;
        }
        if (giuaKy < 0 || giuaKy > 10) {
            System.out.println("Diem giua ky khong hop le");
            return;
        }
        if (cuoiKy < 0 || cuoiKy > 10) {
            System.out.println("Diem cuoi ky khong hop le");
            return;
        }
        
        this.tenHocPhan = tenHocPhan;
        this.soTinChi = soTinChi;
        this.chuyenCan = chuyenCan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }

    public String layTenHocPhan() {
        return tenHocPhan;
    }

    public int laySoTinChi() {
        return soTinChi;
    }

    public void ganChuyenCan(int chuyenCan) {
        if (chuyenCan < 0 || chuyenCan > 10) {
            System.out.println("Diem chuyen can khong hop le");
            return;
        }
        this.chuyenCan = chuyenCan;
    }

    public double layChuyenCan() {
        return chuyenCan;
    }

    public void ganGiuaKy(int giuaKy) {
        if (giuaKy < 0 || giuaKy > 10) {
            System.out.println("Diem giua ky khong hop le");
            return;
        }
        this.giuaKy = giuaKy;
    }

    public double layGiuaKy() {
        return giuaKy;
    }

    public void ganCuoiKy(int cuoiKy) {
        if (cuoiKy < 0 || cuoiKy > 10) {
            System.out.println("Diem cuoi ky khong hop le");
            return;
        }
        this.cuoiKy = cuoiKy;
    }

    public double layCuoiKy() {
        return cuoiKy;
    }

    public void capNhatDiem(double chuyenCan, double giuaKy, double cuoiKy) {
        this.chuyenCan = chuyenCan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;   
    }

    public double tinhDiem() {
        return 0.1*chuyenCan + 0.2*giuaKy + 0.7*cuoiKy;
    }
}
