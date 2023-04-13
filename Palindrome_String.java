package Github_Projects;

import java.util.Scanner;

public class Palindrome_String {

	public Palindrome_String() {
		
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
System.out.println("Enter your String to check out if it's palindrome:");
	String s=scan.nextLine();
	s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	   String reversedString = new StringBuilder(s).reverse().toString();
	   String reversedString1 = new StringBuilder(s).reverse().toString();
       if (s.equals(reversedString1)) {
           System.out.println("The input string is a palindrome.");
       } else {
           System.out.println("The input string is not a palindrome.");
       }
	}

}
