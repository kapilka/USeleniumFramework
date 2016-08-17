package ArrayDemo;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A - container which stores multiple value of same data type
		
		int a[]= new int[5];  // declare and array  and allocate space for value
		
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=9;  // initialize value into array
		
		int b[]={1,2,5,4,8};
		
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]); // retrive  value present in array 
		}
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]); // retrive  value present in array 
		}
	}

}
