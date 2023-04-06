package exam.cau1;

import java.util.ArrayList;

public class CongTy {
	ArrayList<CuaHang> danhSach;
	ArrayList<KhachHang> ds;

	CongTy() {
		this.danhSach = new ArrayList<CuaHang>();
		this.ds= new ArrayList<KhachHang>();
	}

	public void them(CuaHang ch) {
		int viTri = this.tim(ch.getMa());
		if (viTri == -1) {
			this.danhSach.add(ch);
		} else
			System.out.println("Cua Hang da ton tai !");

	}

	public int tim(int ma) {
		for (int i = 0; i < this.danhSach.size(); i++) {
			if (this.danhSach.get(i).getMa() == ma)
				return i;
		}
		return -1;
	}


	public void xuatDanhSach() {
		for (var i : this.danhSach)
			i.hienThi();
		
	}

	public void themKhachHang(KhachHang k) {
		this.ds.add(k);
	}

	public void thongBao(KhuyenMai km) {
		for(var i:this.ds)
			i.phanHoiSuKien(this,km);
		
	}

	
}
