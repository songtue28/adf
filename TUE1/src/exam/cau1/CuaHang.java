package exam.cau1;

import java.util.ArrayList;

public class CuaHang {
	private static final SanPham SanPham = null;
	final int MAX = 10;
	ArrayList<SanPham> danhSach;
	private int ma;
	private String ten;

	CuaHang(int ma, String ten) {
		this.danhSach = new ArrayList<SanPham>();
		this.ma = ma;
		this.ten = ten;
	}

	public int getMa() {
		return this.ma;
	}

	public void hienThi() {
		System.out.println(this.ma + "-" + this.ten);

	}

	public void them(SanPham sp) {
		int viTri = this.tim(sp.getMa());
		if (viTri == -1) {
			this.danhSach.add(sp);
		} else
			System.out.println("San pham da ton tai !");
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

	public synchronized void themHang() throws InterruptedException {
		while (true) {
			if (this.danhSach.size() >= MAX)
				wait();
			this.danhSach.add(SanPham);
			System.out.println("Them hang thanh cong");
			notify();
			Thread.sleep(2000);
		}

	}

	public synchronized void banHang() throws InterruptedException {
		while (true) {
			if (this.danhSach.size() == 0)
				wait();
			this.danhSach.remove(SanPham);
			System.out.println("Ban hang thanh cong !");
			notify();
			Thread.sleep(2000);
		}
	}

}
