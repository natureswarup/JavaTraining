package Project2;

public class Q3 {

	
	public void reverseString() {
		
		String s = "Hello";
		
		String newString = "";
		
		for (int i = s.length()-1; i>=0; i--) {
			newString += s.charAt(i);
		}
		
		System.out.println(newString);
		
		
		
	}
}
