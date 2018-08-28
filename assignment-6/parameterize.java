class parameterize
{
    parameterize()
    {
        this(5);
        System.out.println("The Default constructor");
    }
 
     parameterize(int x)
    {
       this(5, 15);
        System.out.println(x);
    }
 parameterize(int x, int y)
    {
        System.out.println(x * y);
    }
 
    public static void main(String args[])
    {
        new parameterize();
    }
}