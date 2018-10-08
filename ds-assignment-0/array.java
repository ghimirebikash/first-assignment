import java.util.Scanner;
import java.util.Arrays;
class array{
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<a;i++){
		arr[i]=s.nextInt();
	}
	Arrays.sort(arr);
	System.out.println("maximum value in the array is " +arr[a-1]);

	}
}