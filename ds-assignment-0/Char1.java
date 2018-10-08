import java.util.Scanner;
import java.util.*;
import java.io.*;
class Char1{
	public static void main(String[] args)throws IOException{
		Scanner s=new Scanner(System.in);
String b=s.nextLine();

int a=b.length();
char arr[]=new char[a];
char arr1[]=new char[a];
for(int i=0;i<a;i++){
		arr[i]=b.charAt(i);

	}
	for(int j=0;j<a;j++){
		Character c=b.charAt(j);
	//	if(c!=' '){
		 if (Character.isLowerCase(c)) {
			arr1[j]=Character.toUpperCase(c);
			//System.out.print(arr1[j]);
		}
		else{
			arr1[j]=Character.toLowerCase(c);
			//System.out.print(arr1[j]);
		}


	//}
//else{
//	arr1[j]=c;
//}
}
for(int i=0;i<a;i++){
		System.out.print(arr1[i]);
}
}}