import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        HCN[] a = new HCN[5];
        Random r = new Random(); // Tạo giá trị ngẫu nhiên
        a[0] = new HCN(new Diem(r.nextInt(11), r.nextInt(11)), new Diem(r.nextInt(11), r.nextInt(11)));
        a[1] = new HCN(new Diem(r.nextInt(11), r.nextInt(11)), new Diem(r.nextInt(11), r.nextInt(11)));
        a[2] = new HCN(new Diem(r.nextInt(11), r.nextInt(11)), new Diem(r.nextInt(11), r.nextInt(11)));
        a[3] = new HCN(new Diem(r.nextInt(11), r.nextInt(11)), new Diem(r.nextInt(11), r.nextInt(11)));
        a[4] = new HCN(new Diem(r.nextInt(11), r.nextInt(11)), new Diem(r.nextInt(11), r.nextInt(11)));

        for (int i = 0; i < 5; i++) {
            a[i].hienThi();
            if (i < 4)
                System.out.println("-------------------------------------------");
        }

        // Sắp xếp HCN theo diện tích
        Arrays.sort(a, Comparator.comparing(HCN::dienTich));

        System.out.println("Sau khi sap xep tang dan theo dien tich");
        for (int i = 0; i < 5; i++) {
            a[i].hienThi();
            if (i < 4)
                System.out.println("-------------------------------------------");
        }


    }
}
