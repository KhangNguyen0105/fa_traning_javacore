public class QuanLySinhVien {
    public static void main(String[] args) throws Exception {
        SinhVien SV1 = new SinhVien("Sinh vien 1");
        SV1.themDiem(new Diem("Hoc phan 1", 3, 10, 5, 7));
        SV1.themDiem(new Diem("Hoc phan 2", 2, 0, 10, 10));

        SinhVien SV2 = new SinhVien("Sinh vien 2");
        SV2.themDiem(new Diem("Hoc phan 1", 4, 8, 6, 7.5));
        SV2.themDiem(new Diem("Hoc phan 2", 3, 6.5, 7, 8.6));
        
        SinhVien SV3 = new SinhVien("Sinh vien 3");
        SV3.themDiem(new Diem("Hoc phan 1", 2, 10, 7.5, 5.1));
        SV3.themDiem(new Diem("Hoc phan 2", 1, 0, 0, 4.1));

        SinhVien[] a = {SV1, SV2, SV3};
        for (int i = 0; i < 3; i++) {
            System.out.println("Thong tin sinh vien " + (i + 1));
            a[i].hienThi();
            if (i < 2)
                System.out.println("---------------------------------");
        }
    }
}
