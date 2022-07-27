package test;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int i,num,num1=0,num2=1,n=5;
		System.out.print(num1+" "+num2+" ");
		for(i=1;i<=n;i++)
		{
			num=num1+num2;
			System.out.print(num+" ");
			num1=num2;
			num2=num;
		}
	}

}
