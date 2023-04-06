package bh11;

public class SanPham {

	private int ma;
	private String ten;
	private int gia;
	private int soLuongSanPham;

	public SanPham(int ma, String ten, int gia) {
		// TODO Auto-generated constructor stub
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
		this.soLuongSanPham = 0;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}
	
	public String getTen() {
		return ten;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma + "," + this.ten + ","+ this.gia + "," + this.soLuongSanPham ;
	}

	public int getSoLuongSanPham() {
		// TODO Auto-generated method stub
		return this.soLuongSanPham;
	}

	public void setSoLuongSanPham(int i) {
		// TODO Auto-generated method stub
		this.soLuongSanPham = i;
		
	}

}
