class check{
    public static void printa(float i){
        System.out.println("obj called "+i);
    }

    public static void printa(Integer i){
        System.out.println("Int called "+i);
    }
     public static void main (String[] args) {
       check c = new check();
       c.printa(null);

    }
}

