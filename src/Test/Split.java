package Test;


import java.util.*;

public class Split {
	
		public void Studentinfo(int rollno) {
			System.out.println("Student information "+rollno);
		}
		public void Studentinfo(String name) {
			System.out.println("Student information "+name);
		}public void Studentinfo(int rollno,String name) {
			System.out.println("Student information "+rollno);
			System.out.println("Student information "+name);
		}
	
		public static void main(String [] args) {
			Split ac = new Split();
			ac.Studentinfo(100);
			ac.Studentinfo("mano");
			ac.Studentinfo(100,"mano");
			
		}
		
		
	}
