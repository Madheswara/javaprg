package Test;

public class strr {

	public static void main(String[] args) {
		String s1 = "welcome to tamilnadu";
		int length = s1.length();
		char charAt = s1.charAt(2);
		int indexOf = s1.indexOf("c", 2);
		System.out.println(indexOf);
		
		System.out.println("Length:"+length);
		System.out.println(charAt);
		
		
		for (int i = 0; i < s1.length(); i++) {
			char charAt2 = s1.charAt(length-i-1);
			System.out.print(charAt2);
		}
			String replace = s1.replace(" ","");
			int length2 = replace.length();
			
			int withoutspace = length - length2;
			System.out.println("\n"+withoutspace);
		}
		
	}
	
