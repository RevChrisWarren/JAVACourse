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
	
	performOperationUsingSwitch(number1, number2, number3);
}

	private static void performOperationUsingNestedIfElse(int number1, int number2, int number3) {
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
	private static void performOperationUsingSwitch(int number1, int number2, int number3) {
		switch (number3){
		case 1: 
			System.out.println(number1 + number2); break;
		case 2: 
			System.out.println(number1 - number2);break;
		case 3: 
			System.out.println(number1 / number2);break;
		case 4: 
			System.out.println(number1 * number2);break;
		default: System.out.println("Operation not understood");break;
	}
		}
}
