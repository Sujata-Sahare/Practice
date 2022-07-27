package test;
import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=sc.nextInt();
		int reverse=0,reminder;
		for(;num!=0;num=num/10)
		{
			reminder=num%10;
			reverse=reverse*10+reminder;
		}
		System.out.println("The reverse of the given number is: " + reverse); 
	}

}
