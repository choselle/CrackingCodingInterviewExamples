import java.util.Scanner;

public class permutation {

	public static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	public static boolean permutation(String num1, String num2) {
		if (num1.length() != num2.length()) return false;

		else return sort(num1).equals(sort(num2));
	}

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		System.out.print("Enter two strings> ");
		String s1 = keyb.next(); String s2 = keyb.next();

		if (permutation(s1, s2)) System.out.println(s1 + " is a permuation of " + s2);
		else System.out.println(s1 + " is not a permuation of " + s2);
	}

}