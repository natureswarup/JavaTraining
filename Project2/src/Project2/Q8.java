package Project2;

import java.util.ArrayList;
import java.util.Collections;

public class Q8 {

	
	public static void Palindromes() {
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> palNames = new ArrayList<>();
		
		Collections.addAll(names, "karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did");
		
		
		for (int i=0; i<names.size(); i++) {
			
			String temp = reverseString(names.get(i));
			String name = names.get(i);
			
			if (temp.equals(name)) {
				palNames.add(temp);
			}
			
//			System.out.println(names.get(i));
		}
		
		System.out.println(palNames);
		
	}
	
	public static String reverseString(String s) {
		
		
		String newString = "";
		
		for (int i = s.length()-1; i>=0; i--) {
			newString += s.charAt(i);
		}
		
		return newString;
		
		
		
	}
}
