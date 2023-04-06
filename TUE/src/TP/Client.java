package TP;

public class Client {
	public static void main(String[] args) {
		DsThanhPho tp = new DsThanhPho();
		ThanhPho ttp = new ThanhPho("QuangNGai", 76 , 1000);
		tp.them(ttp);
		tp.hienthi();

		
	}
}
