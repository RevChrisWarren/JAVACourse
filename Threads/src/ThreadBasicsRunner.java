//TWO WAYS TO CREATE THREADS

//extends Thread
//implements Runnable

class Task1 extends Thread {
	public void run() {
		System.out.println("\n Task 1 Started");
		for (int i = 101; i < 199; i++)
			System.out.print(i + " ");

		System.out.println("\n Task 1 Done");
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) {
		// Task1
		Task1 task1 = new Task1();
		task1.start(); // task1.run() runs same as before(not as a thread)

		// Task2
		for (int i = 201; i < 299; i++)
			System.out.print(i + " ");

		System.out.println("\n Task 2 Done");

		// Task3
		for (int i = 301; i < 399; i++)
			System.out.print(i + " ");

		System.out.println("\n Task 3 Done");

		System.out.println("\n Main Method Done");
	}

}
