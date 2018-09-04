abstract class animals{
	String name;
	String breed;
	String color;
	abstract void eat();
	void speak(){
		System.out.println("it is not an abstract method");
	}
}
class derived extends animals{
	void eat(){
	System.out.println("it is an abstract method");
	}
	
	}

class main{
	public static void main(String[] args){
	animals a=new derived();
	a.eat();
	a.speak();
	}
}