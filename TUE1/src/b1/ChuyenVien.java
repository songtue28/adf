package b1;

public class ChuyenVien extends NhanSu {

	private String viTri;

	public ChuyenVien(int ma, String ten, String viTri) {
		// TODO Auto-generated constructor stub
		this.viTri = viTri;
		setMa(ma);
		setTen(ten);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "," + this.viTri;
	}

}
