package hu.evosoft.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

		Runnable task = new Runnable() {

			public void run() {
				System.out.println("Hello world!");
			}
		};

		service.scheduleWithFixedDelay(task, 2000, 3000, TimeUnit.MILLISECONDS);

	}
}
