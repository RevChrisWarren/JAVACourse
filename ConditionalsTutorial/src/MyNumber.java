
public class MyNumber {

	private int num;

	public MyNumber(int num) {
		this.num = num;
	}
		public boolean isPrime(){
			if (num < 2) {
				return false;
			}
			for (int i =2; i <= num-1; i++) {
			if (num % i ==0) {
				return false;
			}
			} return true;
		
}
		public int sumUpToN() {
			int res = 0;
			for (int i = 1; i <= num; i++) {
				res = res + i;
			}
			return res;
		}
		
		public int sumOfDivisors() {
			int res = 0;
			for (int i = 2; i< num; i++) {
				if(num % i== 0) {
					res = res+i;
				}	
			}
			return res;
			
	
}

			public void printNumberTriangle() {
				for (int i = 1; i <= num; i++) {
					for(int j = 1; j<=i; j++) {
						System.out.print(j+ " ");
					}
					System.out.println();
						
	}
				
}
		
}

