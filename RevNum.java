package test;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1997,reminder,reverse=0;
		while(num>0)
		{
			reminder=num%10;
			reverse=reverse * 10 + reminder;
			num=num/10;
		}
		System.out.println("The reverse of the given number is: " + reverse); 
	}

}
