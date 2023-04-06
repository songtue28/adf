package exam.cau1;

public class KhachHang extends Thread{
	private int ma;
	private String ten;
	private double soTien;
	KhachHang(int ma, String ten, double soTien) {
		this.ma = ma;
		this.ten = ten;
		this.soTien = soTien;
	}
	public void phanHoiSuKien(CongTy congTy, KhuyenMai km) {
		if (this.soTien >= km.giaKhuyenMai)
			System.out.println(this.ten + " den cua hang mua hang");
		else
			System.out.println(this.ten + " khong du tien de den mua hang ");
		
	}

}
