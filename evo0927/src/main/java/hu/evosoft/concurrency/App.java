package hu.evosoft.concurrency;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Runnable r = new Runnable() {

			public void run() {

				while (!Thread.currentThread().isInterrupted()) {
					try {
						System.out.println("Thread name: " + Thread.currentThread().getName());
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						System.out.println("Error while sleeping: " + e.getMessage());
						Thread.currentThread().interrupt();
					}
				}

			}
		};

		Thread t1 = new Thread(r);
		t1.setName("t1");

		Thread t2 = new Thread(r);
		t2.setName("t2");

		t1.start();
		t2.start();
		
		System.out.println("Message from main method....");
		
		Thread.sleep(1000);
		
		t1.interrupt();

	}

}
