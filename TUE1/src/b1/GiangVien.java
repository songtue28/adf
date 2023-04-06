package b1;

public class GiangVien extends NhanSu {

	private String hocVi;

	public GiangVien(int ma, String ten, String hocVi) {
		// TODO Auto-generated constructor stub
		this.hocVi = hocVi;
		setMa(ma);
		setTen(ten);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "," + this.hocVi;
	}
}
