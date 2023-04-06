package bh10;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		//cac thread chia se du lieu dung chung
		for (int i = 0; i < 11; i++) {
			Thread sv= new SVThread("SV"+i);
					sv.start();
		}
//		Thread sv1 = new SVThread("Tuan");
//		Thread sv2 = new SVThread("Binh");
//		sv1.start();
//		sv2.start();
	}

	private static void cach3() throws InterruptedException {
		System.out.println(Thread.currentThread().getName());

		Thread t= new Thread(new OtherThread());
		Thread.sleep(5000);
		t.start();
		t.join();
		cach2();
	}

	private static void cach2() {
		Thread t = new MyThread();
		t.start();
	}

	private static void extracted() {
		System.out.println(Thread.currentThread().getName());
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("tao thread theo cach 1");
				System.out.println(Thread.currentThread().getName());

			}
		});
		t.start();// d chay
	}
}
