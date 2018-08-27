abstract class vehicle{
abstract void start();
abstract void stop()	;
}
class twowheeler extends vehicle{
void start()
{ System.out.println("start fun() called"); }

void stop()
{ System.out.println("stop fun() called"); }
}

class fourwheeler extends vehicle{
void start()
{
 System.out.println("start fun() called"); 
}

void stop()
{ 
System.out.println("stop fun() called"); 
}
}
class main {
    public static void main(String[] args) { 
       twowheeler t = new twowheeler();
       t.start();
       t.stop();
       fourwheeler f= new fourwheeler();
       f.start();
       f.stop();
    }
}