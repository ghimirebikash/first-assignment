interface animals{
	void speak(String a);
	void eat(String b);
}
class cat implements animals{
String x;
String y;
	public void speak(String a){
System.out.println("cat sounds "+ a);
	}
		public void eat(String b){
	System.out.println("cats eat"+ b);

	}
}
class dog implements animals{
	public void speak(String a){
System.out.println("dogs "+ a);
	}
	public void eat(String b){
	System.out.println("dogs eat "+ b);

	}
}
class main1{
	public static void main(String[] args){
cat c=new cat();
c.speak("meuu");
c.eat("mouse");
dog d=new dog();
d.eat("meat");
d.speak("bark");
	}
}