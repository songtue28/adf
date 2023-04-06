package bh7;

public class Client {
	public static void main(String[] args) {
		IGioHang  g = new GioHang();
		g.mua(new SanPham( 1, "TiVi", 100), 10);
		g.mua(new SanPham(2,"tulanh",90), 90);
		g.hienthi();
		System.out.println("tong tien la "+g.TongTien());
		g.xoa(1);
		g.xoa();
	}
}
