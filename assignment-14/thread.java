class odd implements Runnable{
static boolean flag=true;
public void run(){
	for(int i=1;i<=999;){
if(flag){
	System.out.println(i);
i=i+2;
	flag=false;
	}
}
}
}
class even implements Runnable{
public void run(){
	for(int i=2;i<=1000;){
		if(!odd.flag){
			System.out.println(i);
			
			odd.flag=true;
			i=i+2;
		}
	}
}
}
class thread{
	public static void main(String[] args) {
		new Thread(new odd()).start();
		new Thread(new even()).start();
	}
}