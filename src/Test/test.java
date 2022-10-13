package Test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
	String s1 = "Madhes great learner";
	Scanner sc = new Scanner(s1);
	String next = sc.next();
	System.out.println(next);//one method
	String s2 = s1.substring(0, 6);//another method
	System.out.println(s2);
	
	int length = s2.length();
	for (int i = 0; i < s2.length(); i++) {
		char charAt = s2.charAt(length-i-1);
		System.out.print(charAt);
			
		}
	}
	
	}
