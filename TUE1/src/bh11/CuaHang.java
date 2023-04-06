package bh11;

public class CuaHang {

	private String ma;

	private String DiaChi;

	public CuaHang(String ma, String DiaChi) {
		// TODO Auto-generated constructor stub
		this.ma = ma;
		this.DiaChi = DiaChi;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma + "," + this.DiaChi;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void banHang(KhachHang kh, SanPham sp, int soLuongmua) {
		// TODO Auto-generated method stub
		if (sp.getSoLuongSanPham() < soLuongmua) {
			System.out.println("Khong du so luong mua");
		}
		else {
			System.out.println(kh.getTen() + "da mua " + soLuongmua + " " + sp.getTen());
			sp.setSoLuongSanPham(sp.getSoLuongSanPham() - soLuongmua);
		}
		
	}

}
