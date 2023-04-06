package bh11;

public class KhachHang {

	private String ma;
	private String ten;

	public KhachHang(String ma, String ten) {
		// TODO Auto-generated constructor stub
		this.setMa(ma);
		this.setTen(ten);
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void nhanThongBao(CongTy congTy, SanPham sp) {
		// TODO Auto-generated method stub
		System.out.println("Da nhan thong tin giam gia cua " + sp.getTen());
	}

	public void dangKhiThanhVien(CongTy ct) {
		// TODO Auto-generated method stub
		KhachHang kh = ct.timKhachHang(this.ma);
		if (kh == null) {
			ct.themKhachHang(this);
		}
		else {
			System.out.println("Khach Hang da co trong danh sach");
		}
	
		
	}

}
