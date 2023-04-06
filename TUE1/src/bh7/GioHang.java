package bh7;

import java.util.ArrayList;
import java.util.Iterator;

public class GioHang extends ArrayList<SanPham> implements IGioHang {

	@Override
	public void mua(SanPham SanPham, int soLuong) {
		// TODO Auto-generated method stub
		SanPham sp = timSP(SanPham.getMa());
		if (sp == null) {
			SanPham.setSoLuong(soLuong);// soLuong = this.getSoLuong;
			this.add(SanPham);
		}
	}

	private SanPham timSP(int ma) {
		// TODO Auto-generated method stub
		for (var sp : this)
			if (sp.getMa() == ma) {
				System.out.println("da ton tai");
			}
		return null;
	}

	@Override
	public void hienthi() {
		// TODO Auto-generated method stub
		for (var sp : this) {
			System.out.println(sp.toString());
		}
	}

	@Override
	public double TongTien() {
		double tongTien = 0;
		// TODO Auto-generated method stub
		for(var s : this)
			tongTien = s.getSoLuong()*s.getGia()+ tongTien;
		return tongTien ;
	}

	@Override
	public void xoa(int ma) {
		// TODO Auto-generated method stub
		SanPham sp=timSP(ma);
		if(sp == null) {System.out.println("ma khong hop le");}
		else {
			remove(ma);
		}
	}

	@Override
	public void xoa() {
		// TODO Auto-generated method stub
		this.clear();
	}

}
