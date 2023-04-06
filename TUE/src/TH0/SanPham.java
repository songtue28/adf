package TH0;

public class SanPham {

	private int ma;
	private String ten;
	private int gia;
	private int soLuongMua;

	public SanPham(int ma, String ten, int gia) {
		// TODO Auto-generated constructor stub
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
		this.soLuongMua = 0;
	}
	public String toString() {
		return this.ma + "," + this.ten + "," +this.gia + "," + this.soLuongMua;
	}

	public int getMa() {
		// TODO Auto-generated method stub
		return this.ma;
	}

	public void setSoLuongMua(int soLuongMua) {
		// TODO Auto-generated method stub
		this.soLuongMua = soLuongMua;
	}

	public int getSoLuongMua() {
		// TODO Auto-generated method stub
		return this.soLuongMua;
	}

	public double getGia() {
		// TODO Auto-generated method stub
		return this.gia;
	}

}
