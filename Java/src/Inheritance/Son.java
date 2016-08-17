package Inheritance;

public class Son extends GrandFather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son s = new Son();
		s.Country();
		s.city();
		s.activities();
		System.out.println(s.i);
		
			
	}

	public void activities()
	{
		System.out.println("Activities...");
	}
}
