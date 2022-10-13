package Test;

public class strr2 {
	
	public static void main(String[] args) {
		String s1 = "javapoint";
		String s2 = "my name is khan";
		int length2 = s2.length();
		System.out.println(length2);
		String substring = s1.substring(4, 6);
		System.out.println(substring);
		String substring2 = s1.substring(2);
		System.out.println(substring2);
		int length = substring2.length();
		
		for (int i = 0; i < substring2.length(); i++) {
			char charAt = substring2.charAt(length-i-1);
			System.out.print(charAt);
		}
		for (int i =14 ; i >=0; i--) {
			char charAt = s2.charAt(i);
			System.out.print(charAt);
		}
	}
	
	
}
