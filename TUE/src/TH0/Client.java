package TH0;

public class Client {
public static void main(String[] args) {
	System.out.println("hi");
	GioHang gh = new GioHang();
	SanPham s = new SanPham(1, "tivi", 100);
	gh.mua(s,10);
	gh.hienThi();
	//gh.xoa(s1,getMa());
	//gh.xoa();
	System.out.println(gh.tien());
}
}
