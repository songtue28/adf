package bh10;

public class SVThread extends Thread {
	private static Laptop lt = null;
	static {
		lt = new Laptop("dell", false);
	}

	private String hoTen;

	public SVThread(String hoTen) {
		// TODO Auto-generated constructor stub
		this.hoTen = hoTen;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			suDungLaptop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.run();// bo dc
	}

	private void suDungLaptop() throws InterruptedException {
		// TODO Auto-generated method stub
//		while (true) 
		{
			synchronized (lt) {
				while (lt.getSD()) {
					lt.wait();
				}

				System.out.println("SV " + this.hoTen + " dang su dung laptop");
				lt.setdangSD(true);
				Thread.sleep(10000);
				lt.setdangSD(false);
				lt.notify();// xem co ai dang doi k bai cho bieet da dung xogn /co che wait-notify
			}
		}
	}
}
