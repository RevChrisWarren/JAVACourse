
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(1);

		List<CallableTask> list = List.of(new CallableTask("in 28 minutes"), new CallableTask("Joe"),
				new CallableTask("Chris"), new CallableTask("Pickles"));

		// Future is promise
		List<Future<String>> results = executor.invokeAll(list);

		for (Future<String> result : results) {
			System.out.println(result.get());
		}
		executor.shutdown();

	}

}
