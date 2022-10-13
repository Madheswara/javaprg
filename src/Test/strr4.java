package Test;

public class strr4 {
		public static void main(String args[]){  
		String s1="java string split method";  
		String[] words=s1.split("\s" );//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  
		
		String[] split = s1.split(" ",2);
		for (String string : split) {
			System.out.println(string);
		}
		
		String s2 = "hello world how are you";
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i)==' ') {
				System.out.println();
				continue;
			}
		
		System.out.print(s2.charAt(i));
		}
		String[] split2 = s2.split(" ", 3);
		System.out.println();
		for (String string : split2) {
			System.out.println(string);
		}
		}
}
