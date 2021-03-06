package Project2;

public class BubbleSort {

	
	public int[] returnArr() {
		int[] arr = {1,0,5,6,3,2,3,7,9,8,4};
		
		for (int i=arr.length-1; i>=0; i--) {
			for (int j=0; j<i; j++) {
				
				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
	// class example
	
	public static int[] altReturnArr() {
		int[] myarr = {1,0,5,6,3,2,3,7,9,8,4};
		
		boolean sorted = true;
		
		do {
			for (int i = 1; i < myarr.length-1; ++i) {
				if (!sorted(myarr[i], myarr[i-1], myarr[i+1])) {
					swap(myarr, i, i-1);
				}
			}
		} while (!sorted);
		
		return myarr;
	}
	
	static boolean sorted(int element, int leftNeighbor, int rightNeighbor) {
		return element >= leftNeighbor && element < rightNeighbor;
	}
	
	static void swap(int[] array, int element_a, int element_b) {
		int temp = array[element_a];
		array[element_a] = array[element_b];
		array[element_b] = temp;
	}
	
	static void printArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.println(array[i]);
		}
	}

}
