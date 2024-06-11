import java.util.ArrayList;
import java.util.List;

public class SinhVien {
    private String hoTen;
    private List<Diem> danhSachDiem;

    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
        this.danhSachDiem = new ArrayList<>();
    }

    public void themDiem(Diem diem) {
        danhSachDiem.add(diem);
    }

    public double tinhDTB() {
        if (danhSachDiem.isEmpty())
            return 0.0;

        double tongDiem = 0;
        int tongTinChi = 0;
        for (Diem d : danhSachDiem) {
            tongDiem += d.tinhDiem();
            tongTinChi += d.laySoTinChi();
        }

        return tongDiem / tongTinChi;
    }
    
    public void hienThi() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("DTB: " + tinhDTB());
    }

}
