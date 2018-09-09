import java.util.Scanner;
class count{
	
	public static void main(String args[])
	{ 
		String s;
		int count = 1;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		for (int i = 0; i < s.length() - 1; i++)
		{
	    if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}}
