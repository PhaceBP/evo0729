package hu.evosoft.concurrency;

public class ConcurrentWriteDemo {

	private static int counter;

	private static synchronized int incrementAndGet() {
		return ++counter;
	}

	private static synchronized int getCounter() {
		return counter;
	}

	public static void main(String[] args) {

		
		Thread w1 = new Thread(()-> {while(true) {System.out.println("Counter incremented by"
				+Thread.currentThread().getName()+", current value is : "+incrementAndGet()); try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}});
		
		w1.setName("w1");
		
		Thread w2 = new Thread(()-> {while(true) {System.out.println("Counter incremented by"
				+Thread.currentThread().getName()+", current value is : "+incrementAndGet()); try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}});
		
		w2.setName("w2");
		
		Thread r1 =  new Thread(()-> {while(true) {System.out.println("Counter updated, read thread name is: "
				+Thread.currentThread().getName()+", current value is : "+getCounter()); try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}});
		
		r1.setName("r1");
		
		Thread r2 =  new Thread(()-> {while(true) {System.out.println("Counter updated, read thread name is: "
				+Thread.currentThread().getName()+", current value is : "+getCounter()); try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}});
		
		r2.setName("r2");

		w1.start();
		w2.start();
		r1.start();
		r2.start();

	}

}
