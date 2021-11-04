package Project2;

public class Q5 {
	
	public void subString(String str, int idx) {
		
		String newString = "";
		
		for (int i=0; i<idx; i++) {
			newString += str.charAt(i);
		}
		
		System.out.println(newString);
		
	}

}
