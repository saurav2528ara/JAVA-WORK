import java.util.Scanner;
class calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = in.nextInt();
        System.out.print("Enter first number: ");
        int second = in.nextInt();

        int sum = first+second;
        int sub = first-second;
        int multi = first*second;
        int divi = first/second;
        int mod = first%second;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(divi);
        System.out.println(mod);

    }
}