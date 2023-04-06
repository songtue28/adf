package tp;

public class ThanhPho {

	private int ma;
	private String ten;
	private int danSo;

	public ThanhPho(int ma, String ten, int danSo) {
		// TODO Auto-generated constructor stub
		this.ma=ma;
		this.ten = ten;
		this.danSo=danSo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ten+","+danSo+","+ma;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public int getDanSo() {
		return danSo;
	}

	public void setDanSo(int danSo) {
		this.danSo = danSo;
	}

}
