package Project2;

public class Q4 {

	
	public void factorial(int num) {
		
		
		long factorial = 1;
		
		for (int i =1; i<=num; i++) {
			factorial *= i;
		}
		
		System.out.println("The factorial of " + num + " is " + factorial);
	}
}
