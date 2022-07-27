package test;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Smile";
		String reverse=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+ str.charAt(i);
		}
		System.out.println("Original string is : "+str);
		System.out.println("reversed string is : "+reverse);
	}

}
