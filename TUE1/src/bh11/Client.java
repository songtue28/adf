package bh11;

public class Client {
	public static void main(String[] args) {
		CongTy ct = new CongTy();
		SanPham sp1 = new SanPham(1,"ao",30000);
		CuaHang ch1 = new CuaHang("ch1","Hoc Mon");
		CuaHang ch3 = new CuaHang("ch2","Hoc Mon");
		KhachHang kh1 = new KhachHang("kh1","Anh");
		
		SanPham sp2 = ct.timSanPham(1);
		ct.themSanPham(sp1,30);
		ct.xuatDsSanPham();
		
		
		ct.themCuaHang(ch1);
		ct.themCuaHang(ch3);
		
		ct.xuatDsCuaHang();
		kh1.dangKhiThanhVien(ct);
		ct.tbGiamGiaSanPham(sp1);
		
		ch3.banHang(kh1,sp1,10);
		
	}
}
