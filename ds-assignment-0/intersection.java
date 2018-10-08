import java.util.Scanner;
class intersection{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		int arr[]=new int[a];
		int b=s.nextInt();
		int arr1[]=new int[b];
		int arr2[]=new int[a];
		int max=0;
		for(int i=0;i<a;i++){
			arr[i]=s.nextInt();
			if(arr[i]>max)
				max=arr[i];
		}
		for(int j=0;j<b;j++){
			arr1[j]=s.nextInt();
			if(arr1[j]>max)
				max=arr1[j];
		}
		int farr[]=new int[max+1];
		
	for(int i=0;i<a;i++){
		farr[arr[i]]+=1;
	}
	int k=0;
	for(int i=0;i<b;i++){
		if(farr[arr1[i]]>0){
			farr[arr1[i]]-=1;
			arr2[k]=arr1[i];
			k++;
		}
	}
		
for(int i=0;i<k;i++){
		System.out.println(arr2[i]);
		}
	}
}