class Supera
{
   int num = 100;
}
class Suba extends Supera
{
   int num = 110;
   void printNumber(){
	System.out.println(super.num);
   }}
   class main1{
   public static void main(String args[]){
	Suba obj= new Suba();
	obj.printNumber();	
   }
}