package Project2;

import Package2.*;

public class Q11 {

	Numbers test = new Numbers();
	float otherPackNum1 =  test.num1;
	float otherPackNum2 = test.num2;
	
	public void printNums() {
		System.out.println(otherPackNum1 + " " + otherPackNum2);
	}
}
