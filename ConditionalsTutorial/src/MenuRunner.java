import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Number 1: ");
	int number1 = scanner.nextInt();
	System.out.println("The first number you entered is - " + number1);
	Scanner scanner2 = new Scanner(System.in);
	System.out.println("Enter Number 2: ");
	int number2 = scanner2.nextInt();
	System.out.println("The second number you entered is - " + number2);
	Scanner scanner3 = new Scanner(System.in);
	System.out.println("Choose an operation:");
	System.out.println("Enter 1 for addition");
	System.out.println("Enter 2 for subtraction");
	System.out.println("Enter 3 for division");
	System.out.println("Enter 4 for  multiplication");
	int number3 = scanner3.nextInt();
	
	if(number3 == 1) {
		System.out.println(number1 + number2);
	} else if(number3 == 2) {
		System.out.println(number1 - number2);
	} else if(number3 == 3) {
		System.out.println(number1 / number2);
	} else if(number3 == 1) {
		System.out.println(number1 + number2);
	} else if(number3 == 4) {
		System.out.println(number1 * number2);
	} else System.out.println("Operation not understood");
}
}
