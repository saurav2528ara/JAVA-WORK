class trial
{
    public static void main(String[] args) {
        System.out.println("Start");

        int a = 5; int b=0; int c;
        try{
            c = a/b;
            System.out.println(c);
        }
       catch(Exception e)
       {
        System.out.println(e);
       }
       System.out.println("End");
    }
}