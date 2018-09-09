import java.util.Scanner;
class vowel{
	
	public static void main(String args[])
	{ 
		int flag;
		String s;
		char str[]=new char[100];
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enterthe string");
		s=sc.nextLine();
		String a="aeiouAEIOU";
		
		//String str[z];
		for (int i = 0; i < s.length(); i++)
		{flag=0;
			for(int j=0;j<a.length();j++){
	    if ((s.charAt(i) ==a.charAt(j)))
			{
				
			flag=1;	
 
			}
			

			}
			if(flag==0){
			str[k]=s.charAt(i);
			k++;
			}
			
		}
		System.out.print(str);
		
		}}

 		
