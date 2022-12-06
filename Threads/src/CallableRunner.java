import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	public String call() throws Exception {
		Thread.sleep(3000);
		return "Hello " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(1);

		// Future is promise
		Future<String> welcomeFuture = executor.submit(new CallableTask("in 28 minutes"));
		System.out.print("\nFuture completed");

		String welcomeMessage = welcomeFuture.get();
		System,out.println()
		System.out.print("\nMain Completed");
		executor.shutdown();

	}

}
