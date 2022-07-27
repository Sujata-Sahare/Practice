package test;

public class RevStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String revstr="blye sky";
       System.out.println("The original string is: " + revstr); 
       StringBuilder sb=new StringBuilder(revstr);
       System.out.println("The reverse of the given string is: " + sb.reverse()); 
	}

}
