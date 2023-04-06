package TP;

public class ThanhPho {

	private String ten;
	private int ma;
	private int dan ;

	public ThanhPho(String ten, int ma, int dan) {
		// TODO Auto-generated constructor stub
		this.setTen(ten);
		this.ma = ma;
		this.setDan(dan);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ten+"," + ma +"," +dan;
	}
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.dan = ma;
	}
	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}


}
