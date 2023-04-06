package TP1;

public class Client {
	DanhSachTP  ds = new DanhSachTP();
	ThanhPho tp = new ThanhPho("QuangNgai",76,10000);
	ds.them(tp);
	ds.hienthi();
}
