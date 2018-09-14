import java.util.Scanner;
class frequency1{
	public static void main(String[] args)throws Exception{
		String str;
		int max=0;
		
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		 int farr[]=new int[255];
		for(int i=0;i<str.length();i++)
{
	farr[str.charAt(i)]++;

}
	for(int i=0;i<str.length();i++)
{
	if(max<=(farr[str.charAt(i)])){
		max=i;
	}

}

System.out.println("the most frequent character is=" + str.charAt(max));
System.out.println("the character is repeated " + farr[str.charAt(max)] + " times");
	}
}