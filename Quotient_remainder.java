import java.util.Scanner;
class Quotient_remainder{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b =sc.nextInt();
        int quotient = a/b;
        int remainder = a-(quotient*b);
        System.out.println("Quotient is: "+quotient);
        System.out.println("Remainder is: "+remainder);

    }
}