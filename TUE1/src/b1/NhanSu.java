package b1;

public class NhanSu {

	private int ma;
	private String ten;

	public void NhanSu(int ma, String ten) {
		this.ma = ma;
		this.ten = ten;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma + "," + this.ten;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void hienThi() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

	public void lamViec() {
		// TODO Auto-generated method stub
		System.out.println(",");
	}

	public int getMa() {
		// TODO Auto-generated method stub
		return ma ;
	}



}
