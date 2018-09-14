import java.util.Scanner;
class pallindrome{
	public static void main(String[] args)throws Exception{
		String str;
		String str1="";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the String to check");
		str=s.nextLine();
		int a=str.length();
		for(int i=a-1;i>=0;i--){
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
		 if(str.equalsIgnoreCase(str1)){
			System.out.println("TRUE");

		}
		else{
			System.out.println("FALSE");
		}

	}
}
