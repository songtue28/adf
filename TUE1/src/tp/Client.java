package tp;

public class Client {
	public static void main(String[] args) {
		DanhSachTP ds = new DanhSachTP();
		ThanhPho tp = new ThanhPho(76,"QuangNgai", 10000);
		ThanhPho tp1 = new ThanhPho(77, "BinhDinh", 1110);
		ds.them(tp);
		ds.them(tp1);
		ds.hienthi();
		
	}
}
