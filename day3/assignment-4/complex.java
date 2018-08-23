class complex {

    int real;
    int imag;

     void display(int real, int imag) {
        this.real = real;
        this.imag = imag;
         System.out.println(real +"+"+ imag +"i");
    }

    public static void main(String[] args) {
        complex c=new complex() ;
       c.display(2,5);
    }
}