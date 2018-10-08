import java.util.Scanner;
import java.util.Arrays;
class reverse{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=s.nextInt();

		}
		Print(arr,a-1);
		

	}
public static void Print(int arr[],int a){
	if(a<0){
			return;
		}
		else{
			System.out.println(arr[a]);
			Print(arr,--a);
		}
}
}