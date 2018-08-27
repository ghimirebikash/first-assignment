class animal{
	char breas;
	char colour;
	void speak()
	{ System.out.println("speak animal"); 
}
}
class dog extends animal{
	void speak(){
		System.out.println("speak dog");
	}
}
class cat extends animal{
	void speak(){
		System.out.println("speak cat");
	}
}
class main1{
	public static void main(String[] args){
		animal a=new animal();
		a.speak();
		animal b=new dog();
		b.speak();
		animal c=new cat();
		c.speak();
	}
}