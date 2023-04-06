package exam.cau1;

public class Clien {
	public static void main(String[] args) {
		CongTy ct = new CongTy();
		CuaHang ch1 = new CuaHang(01, "Big C - Thu Duc");
		CuaHang ch2 = new CuaHang(02, "Big C - Binh Thanh");
		SanPham sp1 = new SanPham(01, "LapTop", 400);
		SanPham sp2 = new SanPham(02, "Ti Vi", 200);
		SanPham sp3 = new SanPham(03, "Tu Lanh", 100);
		SanPham sp4 = new SanPham(04, "Dien Thoai", 300);
		ch1.them(sp1);
		ch1.them(sp2);
		ch1.them(sp3);
		ch1.them(sp4);
		ch2.them(sp1);
		ch2.them(sp2);
		ch2.them(sp3);
		ch2.them(sp4);
		ct.them(ch1);
		ct.them(ch2);
		if (ct.tim(01) == -1)
			System.out.println("Khong tim thay cua hang trong cong ty ");
		else
			System.out.println("Thong tin cua cua hang can tim la ");
		ct.danhSach.get(ct.tim(01)).hienThi();
		System.out.println("Danh sach cac cua hang cua cong ty");
		ct.xuatDanhSach();
		System.out.println("Danh Sach cac san pham cua cac cua hang");
		for (var i : ct.danhSach)
			i.xuatDanhSach();
		for (var i : ct.danhSach) {
			if (i.tim(01) == -1)
				System.out.println("Khong tim thay san pham trong cua hang ");
			else
				System.out.println("Thong tin cua cua san pham tim la ");
			i.danhSach.get(ct.tim(01)).hienThi();
			break;

		}
		KhachHang k1 = new KhachHang(0, "Khach Hang 1", 300);
		KhachHang k2 = new KhachHang(1, "Khach Hang 2", 200);
		KhachHang k3 = new KhachHang(2, "Khach Hang 3", 400);
		ct.themKhachHang(k1);
		ct.themKhachHang(k2);
		ct.themKhachHang(k3);
		KhuyenMai km = new KhuyenMai(250);
		ct.thongBao(km);
		new Thread() {
			public void run() {
				try {
					ch1.themHang();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					ch1.banHang();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}

}
