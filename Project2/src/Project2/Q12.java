package Project2;

public class Q12 {

	public static void PrintEvenNum() {
		
		int[] arr = new int[100];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i : arr) {
			if (arr[i] % 2 == 0) {
				
				System.out.println(arr[i]);
			}
		}
	}
}
