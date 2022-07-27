package test;

public class SkipChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="cat";
		int count=0;
		StringBuilder sb=new StringBuilder(str);
		for(int i=0;i<sb.length();i++)
		{
	        char ch=sb.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
			{
				count=count+1;
				
			}
			if(count==1)
			{
				StringBuilder br=sb.deleteCharAt(i);
		
				System.out.print(sb);
			}
		}
	}

}
