//TWO WAYS TO CREATE THREADS

//extends Thread
//implements Runnable

class Task1 extends Thread {
	public void run() {
		System.out.println("\n Task 1 Started");
		for (int i = 101; i < 199; i++)
			System.out.print(i + " ");

		System.out.println("\nTask 1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\n Task 2 Started");
		for (int i = 201; i < 299; i++)
			System.out.print(i + " ");

		System.out.println("\nTask 2 Done");

	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		// Task1
		System.out.println("\nTask 1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(10);
		task1.start(); // task1.run() runs same as before(not as a thread)

		// Task2
		System.out.println("\nTask 2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.start();

		// In order for Task 3 to wait for task 1 to complete:
		task1.join();

		// Task3
		System.out.println("\nTask 3 Kicked Off");
		for (int i = 301; i < 399; i++)
			System.out.print(i + " ");

		System.out.println("\nTask 3 Done");

		System.out.println("\nMain Method Done");
	}

}
