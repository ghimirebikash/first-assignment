import java.util.Scanner;
class reverse{
public static void main(String[] args){
	int j=0;
	Scanner s=new Scanner(System.in);

	System.out.println("ente the size of an array");
	int a=s.nextInt();
	int arr[]=new int[a];
	System.out.println("enter the element of an array");
	for(int i=0;i<a;i++){
	arr[i]=s.nextInt();

	}
	reverse1(arr,j,a-1);
    print(arr,a);
	}
static void reverse1(int arr[],int start,int end){
	if(start>end){
		return;
	}
	else{
		int t=arr[start];
		arr[start]=arr[end];
		arr[end]=t;
		reverse1(arr,start+1,end-1);
	}
	
}
public static void print(int arr[],int size){
		for(int k=0;k<size;k++){
System.out.print(arr[k]);
		}

	}

}