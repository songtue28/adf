package b1;

import java.util.ArrayList;

public class ToChuc extends ArrayList<NhanSu> {

	public void them(NhanSu ns) {
		NhanSu ns1 = tim(ns.getMa());
		if (ns1 == null)
			this.add(ns);
		else
			System.out.println("da ton tai");
	}

	private NhanSu tim(int ma) {
		// TODO Auto-generated method stub
		for (var s : this)
			if (ma == s.getMa())
				return s;
		return null;

	}

	public void hienthi() {
		// TODO Auto-generated method stub
		for (var s : this)
			System.out.println(s.toString() + "_____");
	}
//

	public void xoa(NhanSu ns) {
		// TODO Auto-generated method stub
		this.remove(ns);

	}

//	public ToChuc() {
//		// TODO Auto-generated constructor stub
//		this.ma = ma;
//		this.ten = ten;
//		this.dsToChuc = new ArrayList<NhanSu>();
//		this.vitri = vitri;
//	}
//
//	public int getMa() {
//		return ma;
//	}
//
//	public void them(NhanSu ns1) {
//		// TODO Auto-generated method stub
//		var kq = this.tim(ns1.getMa());
//		if (kq == null)
//			this.dsToChuc.add(ns1);
//		else {
//			System.out.println("da ton tai");
//		}
//
//	}
//
//	private NhanSu tim(int ma) {
//		// TODO Auto-generated method stub
//		for (var s : this.dsToChuc)
//			if (ma == s.getMa())
//				return s;
//		return null;
//	}
//
//	public void xoa(NhanSu ns) {
//		// TODO Auto-generated method stub
//		int ma = 0;
//		this.dsToChuc.remove(this.tim(ma));
//
//	}
//
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return this.ma +"  "+this.ten +" "+ this.vitri;
//	}
//

}
