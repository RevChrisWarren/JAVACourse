
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(1);

		List<CallableTask> list = List.of(new CallableTask("in 28 minutes"), new CallableTask("Joe"),
				new CallableTask("Chris"), new CallableTask("Pickles"));

		// Future is promise
		String result = executor.invokeAny(list);

		System.out.println(result);

		executor.shutdown();

	}

}
