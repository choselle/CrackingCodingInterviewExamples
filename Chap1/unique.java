//Implement an algorithm to determine if a string has all unique characters.

import java.util.Scanner;

public class unique {
	public static boolean checkForUnique(String str) {
		if (str.length() > 128) return false;

		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);

		System.out.print("Enter a string> ");
		String str = keyb.next();

		if (checkForUnique(str)) 
			System.out.println("Unique Characters Found");
		else 
			System.out.println("Unique Characters Not Found");
	}
}