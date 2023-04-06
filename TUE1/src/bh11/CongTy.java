package bh11;

import java.util.ArrayList;
import java.util.List;

//import bh09.IListener;

public class CongTy   {
	
	private List<CuaHang> dsCuaHang;
	private List<SanPham> dsSanPham;
	static private List<KhachHang> dsKhachHang;  
	
	public CongTy() {
		// TODO Auto-generated constructor stub
		this.dsCuaHang = new ArrayList<CuaHang>();
		this.dsSanPham = new ArrayList<SanPham>();
		CongTy.dsKhachHang = new ArrayList<KhachHang>();
	}

	public SanPham timSanPham(int ma) {	
		// TODO Auto-generated method stub	
		for(var i:dsSanPham) {
			if(i.getMa() == ma) {
				return i;
			}		
		}
		return null;
		
	}

	public void themSanPham(SanPham sp1, int soLuongSanPham) {
		// TODO Auto-generated method stub
		SanPham sp = timSanPham(sp1.getMa());
		if(sp == null) {
			sp1.setSoLuongSanPham(sp1.getSoLuongSanPham() + soLuongSanPham);
			dsSanPham.add(sp1);
		}
		else {
			System.out.println("San Pham da co trong danh sach");
		}
		
	}

	public void xuatDsSanPham() {
		// TODO Auto-generated method stub
		for (var sp: dsSanPham) {
			System.out.println(sp.toString());
		}
		
	}

	public CuaHang timCuaHang(String maCuaHang) {
		// TODO Auto-generated method stub
		for(var ch:dsCuaHang) {
			if(ch.getMa().equals(maCuaHang)) {
				return ch;
			}		
		}
		return null;
		
		
	}

	public void themCuaHang(CuaHang ch1) {
		// TODO Auto-generated method stub
		CuaHang ch = timCuaHang(ch1.getMa());
		if(ch == null) {
			dsCuaHang.add(ch1);
		}
		else {
			System.out.println("Cua hang da co trong danh sach");
		}
	}

	public void xuatDsCuaHang() {
		// TODO Auto-generated method stub
		for (var ch: dsCuaHang) {
			System.out.println(ch.toString());
		}
		
	}

	public void tbGiamGiaSanPham(SanPham sp) {
		// TODO Auto-generated method stub
		for(var kh: dsKhachHang) {
			kh.nhanThongBao(this,sp);
		}
		
	}

	public KhachHang timKhachHang(String ma) {
		// TODO Auto-generated method stub
		
		for(var kh: dsKhachHang) {
			if (ma.equals(kh.getMa())) {
				return kh;
			}
		}
		return null;
	}

	public void themKhachHang(KhachHang khachHang) {
		// TODO Auto-generated method stub
		CongTy.dsKhachHang.add(khachHang);
		
	}
	
	
	

}
