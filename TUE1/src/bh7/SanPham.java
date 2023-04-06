package bh7;

public class SanPham {

	private int ma;
	private String ten;
	private int soLuong;
	private double gia;

	public SanPham(int ma, String ten, int gia) {
		// TODO Auto-generated constructor stub
		this.ma = ma;
		this.ten = ten;
		this.setGia(gia);
		this.soLuong = 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "moi "+this.ten +" co gia "+this.gia +"ban se mua voi so luong "+ this.soLuong ;
	}

	public int getMa() {
		return ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

}
