package test;

public class LargestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int x=19,y=69,z=45;
		int largest = ((x > y && x > z)? x: (y > z)?y:z);
		System.out.println( largest);
		
		largest = ((x < y && x < z)? x: (y < z)?y:z);
		System.out.println(largest);
		
		largest=((x>y && x>z)?x:(y>z)?y:z);
		System.out.println(largest);
		
		//((x>y && x>z)?x:(Y>z)?y:z)
	}
	

}
