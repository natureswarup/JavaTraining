package Project2;

public class Q2 {
	
	public void Fib(int n) {
		
		int fNum = 0;
		int sNum = 1;
		int count = 2;
		
		while (count <= n) {
			int newNum = fNum + sNum;
			System.out.println(newNum);
			count++;
			fNum = sNum;
			sNum = newNum;
		}
		
	}

}
