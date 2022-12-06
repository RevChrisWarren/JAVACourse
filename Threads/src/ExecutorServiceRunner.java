import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	public void run() {
		System.out.println("\n Task " + number + " Started");
		for (int i = number * 100; i < number * 100 + 99; i++)
			System.out.print(i + " ");

		System.out.println("\nTask " + number + " Done");
	}
}

public class ExecutorServiceRunner {
	public static void main(String[] args) {
		// ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(4);
		executor.execute(new Task(1));
		executor.execute(new Task(2));
		executor.execute(new Task(3));
		executor.execute(new Task(4));
		executor.execute(new Task(5));
		executor.execute(new Task(6));
		executor.execute(new Task(7));
		executor.execute(new Task(8));

		executor.shutdown();
	}
}
