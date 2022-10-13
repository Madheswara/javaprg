package Test;

public class bSection extends Split{

	public void carrerinfo(int rollno) {
		System.out.println("bsection "+ rollno);
	}
	
	public static void main(String [] args) {
	bSection b = new bSection();
	b.carrerinfo(121);
	}
}
