import java.util.Scanner;
class user_input
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        int s1 = in.nextInt();
        System.out.print("Input name: ");

        int s2 = in.nextInt();
        System.out.print("Input second name: ");

        System.out.println(s1*s2);


    }
}