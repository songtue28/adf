package exam.cau1;

public class SanPham {

	private int ma;
	private String ten;
	private float gia;

	public SanPham(int ma, String ten, float gia) {
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;

	}

	public int getMa() {
		return this.ma;
	}
	public void hienThi() {
		System.out.println(this.ma + "-" + this.ten + "-" + this.gia);
	}
}
