package b1;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
//		List<ToChuc> dsNhanSu = new ArrayList<ToChuc>();
		ToChuc tc = new ToChuc();
		NhanSu ns0 = new GiangVien(11, "Nguyen Van A","tsi");
		NhanSu ns = new GiangVien(1, "NguyenVanA", "TienSi");
		NhanSu ns1 = new ChuyenVien(2, "NguyenVanB", "GiamDoc");
//		System.out.println(ns.toString()  );
//		System.out.println(ns1.toString());
//		ns.hienThi();
//		ns1.hienThi();
//		ns.lamViec();
		
		tc.them(ns1);
		tc.them(ns);
		tc.them(ns);
		tc.them(ns0);
		tc.hienthi();
		
	}
}
