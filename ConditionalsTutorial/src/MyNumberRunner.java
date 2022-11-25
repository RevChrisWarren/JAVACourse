
public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(15);
boolean isPrime = number.isPrime();
System.out.println("isPrime " + isPrime);
int sum = number.sumUpToN();
System.out.println("sum up to n " + sum);

int sumofd = number.sumOfDivisors();
System.out.println("Sum of Divisors = " +sumofd);

number.printNumberTriangle();
		
	}

}
