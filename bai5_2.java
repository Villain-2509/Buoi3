package Buoi3;

import java.util.Scanner;

class ChuyenXe {
    protected String maSoChuyen;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double doanhThu;

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public void hienThiThongTin() {
        System.out.println("Ma so chuyen: " + maSoChuyen);
        System.out.println("Ho ten tai xe: " + hoTenTaiXe);
        System.out.println("So xe: " + soXe);
        System.out.println("Doanh thu: " + doanhThu);
    }

    public double getDoanhThu() {
        return doanhThu;
    }
}

class ChuyenXeNoiThanh extends ChuyenXe {
    private String soTuyen;
    private double soKmDiDuoc;

    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen, double soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So tuyen: " + soTuyen);
        System.out.println("So km di duoc: " + soKmDiDuoc);
    }
}

class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Noi den: " + noiDen);
        System.out.println("So ngay di duoc: " + soNgayDiDuoc);
    }
}

public class bai5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong chuyen xe noi thanh: ");
        int nNoiThanh = sc.nextInt();
        ChuyenXeNoiThanh[] chuyenXeNoiThanh = new ChuyenXeNoiThanh[nNoiThanh];

        for (int i = 0; i < nNoiThanh; i++) {
            System.out.println("Nhap thong tin chuyen xe noi thanh thu " + (i + 1) + ":");
            sc.nextLine(); // Đọc bỏ dòng trống
            System.out.print("Ma so chuyen: ");
            String maSoChuyen = sc.nextLine();
            System.out.print("Ho ten tai xe: ");
            String hoTenTaiXe = sc.nextLine();
            System.out.print("So xe: ");
            String soXe = sc.nextLine();
            System.out.print("So tuyen: ");
            String soTuyen = sc.nextLine();
            System.out.print("So km di duoc: ");
            double soKmDiDuoc = sc.nextDouble();
            System.out.print("Doanh thu: ");
            double doanhThu = sc.nextDouble();

            chuyenXeNoiThanh[i] = new ChuyenXeNoiThanh(maSoChuyen, hoTenTaiXe, soXe, doanhThu, soTuyen, soKmDiDuoc);
        }

        System.out.print("Nhap so luong chuyen xe ngoai thanh: ");
        int nNgoaiThanh = sc.nextInt();
        ChuyenXeNgoaiThanh[] chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh[nNgoaiThanh];

        for (int i = 0; i < nNgoaiThanh; i++) {
            System.out.println("Nhap thong tin chuyen xe ngoai thanh thu " + (i + 1) + ":");
            sc.nextLine(); // Đọc bỏ dòng trống
            System.out.print("Ma so chuyen: ");
            String maSoChuyen = sc.nextLine();
            System.out.print("Ho ten tai xe: ");
            String hoTenTaiXe = sc.nextLine();
            System.out.print("So xe: ");
            String soXe = sc.nextLine();
            System.out.print("Noi den: ");
            String noiDen = sc.nextLine();
            System.out.print("So ngay di duoc: ");
            int soNgayDiDuoc = sc.nextInt();
            System.out.print("Doanh thu: ");
            double doanhThu = sc.nextDouble();

            chuyenXeNgoaiThanh[i] = new ChuyenXeNgoaiThanh(maSoChuyen, hoTenTaiXe, soXe, doanhThu, noiDen, soNgayDiDuoc);
        }

        System.out.println("\n\nDanh sach chuyen xe noi thanh:");
        for (ChuyenXeNoiThanh cx : chuyenXeNoiThanh) {
            cx.hienThiThongTin();
            System.out.println("---------------------");
        }

        System.out.println("Danh sach chuyen xe ngoai thanh:");
        for (ChuyenXeNgoaiThanh cx : chuyenXeNgoaiThanh) {
            cx.hienThiThongTin();
            System.out.println("---------------------");
        }

        double tongDoanhThuNoiThanh = 0;
        for (ChuyenXeNoiThanh cx : chuyenXeNoiThanh) {
            tongDoanhThuNoiThanh += cx.getDoanhThu();
        }
        System.out.println("\n\nTong doanh thu chuyen xe noi thanh: " + tongDoanhThuNoiThanh);

        double tongDoanhThuNgoaiThanh = 0;
        for (ChuyenXeNgoaiThanh cx : chuyenXeNgoaiThanh) {
            tongDoanhThuNgoaiThanh += cx.getDoanhThu();
        }
        System.out.println("Tong doanh thu chuyen xe ngoai thanh: " + tongDoanhThuNgoaiThanh);

        System.out.println("\n=========Villain=========\n");
    }
}
