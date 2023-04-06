package TH0;

import java.util.*;

public class GioHang {
	private ArrayList<SanPham> ds = null;

	public GioHang() {
		this.ds = new ArrayList<SanPham>();
	}

	public void mua(SanPham s, int soLuongMua) {
		// TODO Auto-generated method stub
		var kq = this.tim(s.getMa());
		if (kq == null) {
			s.setSoLuongMua(soLuongMua);
			this.ds.add(s);
		} else {
			kq.setSoLuongMua(kq.getSoLuongMua() + soLuongMua);
		}
	}

	private SanPham tim(int ma) {
		// TODO Auto-generated method stub
		for (var s : this.ds)
			if (ma == s.getMa())
				return s;
		return null;
	}

	public void hienThi() {
		// TODO Auto-generated method stub
		for( var s : this.ds)
			System.out.println(s.toString());
	}

	public double tien() {
		// TODO Auto-generated method stub
		var t = 0.0;
		for (var s: this.ds)
			t += s.getSoLuongMua() * s.getGia(); 
		return t;
	}

	public void xoa() {
		// TODO Auto-generated method stub
		this.ds.clear();
	}
}

